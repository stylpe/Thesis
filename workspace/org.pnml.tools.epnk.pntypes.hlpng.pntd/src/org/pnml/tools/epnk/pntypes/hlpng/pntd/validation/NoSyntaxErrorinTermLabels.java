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
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * This is a constraint saying the marking of a place, the inscription of
 * an arc, or the condition of a transition  must be syntactically
 * correct. This is not the case, if the structure of the label is not set 
 * or if its getSort() is null.
 *  
 * @author eki
 * @generated NOT
 */
public class NoSyntaxErrorinTermLabels extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof Place) {
			Place place = (Place) object;
			HLMarking marking = place.getHlinitialMarking();
			if (marking != null) {
				Term term = marking.getStructure();
				if (term == null ||  term.getSort() == null) {
					return ctx.createFailureStatus(new Object[] {place, marking.getText()});
				}	
			}
		} else if (object instanceof Transition) {
			Transition transition = (Transition) object;
			Condition condition = transition.getCondition();
			if (condition != null) {
				Term term = condition.getStructure();
				if (term == null ||  term.getSort() == null) {
					return ctx.createFailureStatus(new Object[] {transition, condition.getText()});
				}	
			}
		} else if (object instanceof Arc) {
			Arc arc = (Arc) object;
			HLAnnotation annotation = arc.getHlinscription();
			if (annotation != null) {
				Term term = annotation.getStructure();
				if (term == null ||  term.getSort() == null) {
					return ctx.createFailureStatus(new Object[] {arc, annotation.getText()});
				}	
			}
		} 
		return ctx.createSuccessStatus();
	}

}
