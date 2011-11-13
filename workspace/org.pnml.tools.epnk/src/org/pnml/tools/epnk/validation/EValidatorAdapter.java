/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.validation;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

/**
 * Integrate EMF Validation into a Validator. See
 *   http://www.linuxtopia.org/online_books/eclipse_documentation/eclipse_emf_validation_framework_developer_guide/topic/org.eclipse.emf.validation.doc/tutorials/eclipse_emf_validation_framework_validationAdapterTutorial.html
 * for explanations.
 */
public class EValidatorAdapter
    extends EObjectValidator {

    private final IBatchValidator batchValidator;
    
    public EValidatorAdapter() {
        super();
        
        batchValidator =
            (IBatchValidator) ModelValidationService.getInstance().newValidator(
                EvaluationMode.BATCH);
        batchValidator.setIncludeLiveConstraints(true);
        batchValidator.setReportSuccesses(false);
    }

    @SuppressWarnings("unchecked")
	public boolean validate(EObject eObject, DiagnosticChain diagnostics,
            Map context) {
        return validate(eObject.eClass(), eObject, diagnostics, context);
    }

    @SuppressWarnings("unchecked")
	public boolean validate(EClass eClass, EObject eObject,
            DiagnosticChain diagnostics, Map context) {
        super.validate(eClass, eObject, diagnostics, context);
        
        IStatus status = Status.OK_STATUS;
        
        if (diagnostics != null) {
            if (!hasProcessed(eObject, context)) {
                status = batchValidator.validate(
                    eObject,
                    new NullProgressMonitor());
                
                processed(eObject, context, status);
                
                appendDiagnostics(status, diagnostics);
            }
        }
        
        return status.isOK();
    }

    @SuppressWarnings("unchecked")
	private void processed(EObject eObject, Map context, IStatus status) {
        if (context != null) {
            context.put(eObject, status);
        }
    }
    
    @SuppressWarnings("unchecked")
	private boolean hasProcessed(EObject eObject, Map context) {
        boolean result = false;
        
        if (context != null) {
            while (eObject != null) {
                if (context.containsKey(eObject)) {
                    result = true;
                    eObject = null;
                } else {
                    eObject = eObject.eContainer();
                }
            }
        }
        
        return result;
    }

    private void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
        if (status.isMultiStatus()) {
            IStatus[] children = status.getChildren();
            
            for (int i = 0; i < children.length; i++) {
                appendDiagnostics(children[i], diagnostics);
            }
        } else if (status instanceof IConstraintStatus) {
            diagnostics.add(new BasicDiagnostic(
                status.getSeverity(),
                status.getPlugin(),
                status.getCode(),
                status.getMessage(),
                ((IConstraintStatus) status).getResultLocus().toArray()));
        }
    }

}
