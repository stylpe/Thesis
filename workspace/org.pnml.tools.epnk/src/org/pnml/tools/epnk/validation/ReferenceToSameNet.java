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

import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

/**
 * This is a constraint saying that a reference node must refer to
 * a node of the same net.
 *  
 * @author kindler
 * @generated NOT
 */
public class ReferenceToSameNet extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();

		if (eObj instanceof RefPlace) {
			RefPlace rp = (RefPlace) eObj;
			PlaceNode pn = rp.getRef();
			
			if (pn != null && NetFunctions.getPetriNet(rp) != NetFunctions.getPetriNet(pn)) {
				return ctx.createFailureStatus(new Object[] {rp, pn});
			} 
		} else if (eObj instanceof RefTransition) {
			RefTransition rt = (RefTransition) eObj;
			TransitionNode tn = rt.getRef();
			
			if (tn != null && NetFunctions.getPetriNet(rt) != NetFunctions.getPetriNet(tn)) {
				return ctx.createFailureStatus(new Object[] {rt, tn});
			}
		}

		return ctx.createSuccessStatus();
	}

}
