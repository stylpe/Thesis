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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;

/**
 * This is a constraint saying that the source and the target of
 * an Arc must be on the same page.
 *  
 * @author kindler
 * @generated NOT
 */
public class ArcOnAPage extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();

		if (eObj instanceof Arc) {
			Arc arc = (Arc) eObj;
			Node source = arc.getSource();
			Node target = arc.getTarget();
			
			if (source != null && target != null && source.eContainer() != target.eContainer()) {
				return ctx.createFailureStatus(new Object[] {arc});
			} 
		} 

		return ctx.createSuccessStatus();
	}

}
