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
package org.pnml.tools.epnk.pntypes.hlpng.pntd.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

/**
 * This is a constraint makes sure that in HLPNG of kind SN,
 * all the constraints on SN labels are met.
 *  
 * @author eki
 * @generated NOT
 */
public class IsSNLabel extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();


		PetriNetType type = NetFunctions.getPetriNetType(object);
		
		if (type == null || !(type instanceof HLPNG)) {
			return ctx.createSuccessStatus();
		}
		
		HLPNG hlpng = (HLPNG) type;
		if (hlpng.getKind().getValue() != HLPNGKind.SN_VALUE) {
			return ctx.createSuccessStatus();			
		}
		
		// Check this condition only, if this is a HLPNG of dot net kind
		
		EObject structure = null;
		if (object instanceof Type) {
			structure = ((Type) object).getStructure();
		} else if (object instanceof HLMarking) {
			structure = ((HLMarking) object).getStructure();
		} else if (object instanceof Condition) {
			structure = ((Condition) object).getStructure();
		} else if (object instanceof HLAnnotation) {
			structure = ((HLAnnotation) object).getStructure();			
		} else if (object instanceof Declaration) {
			structure = ((Declaration) object).getStructure();			
		} else {
			return ctx.createSuccessStatus();						
		}
		StructuredLabel label = (StructuredLabel) object;
			
		if (structure != null && !ValidationHelperMethods.isSNConstruct(structure)) {
			return ctx.createFailureStatus(new java.lang.Object[] {label.eContainer(), label, label.getText()});				
		}

		return ctx.createSuccessStatus();
	}

}
