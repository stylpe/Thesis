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
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * This is a says that a term meets the restrictions of dot nets.
 *  
 * @author eki
 * @generated NOT
 */
public class IsDotNetTerm extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();


		PetriNetType type = NetFunctions.getPetriNetType(object);
		
		if (type == null || !(type instanceof HLPNG)) {
			return ctx.createSuccessStatus();
		}
		
		HLPNG hlpng = (HLPNG) type;
		if (hlpng.getKind().getValue() != HLPNGKind.PTN_VALUE) {
			return ctx.createSuccessStatus();			
		}
		
		// Check this condition only, if this is a HLPNG of dot net kind
		
		if (object instanceof Place) {
			Place place = (Place) object;
			HLMarking marking = place.getHlinitialMarking();
			if (marking!= null) {
				// eki: type being not null is subject of another constraint
				Term term = marking.getStructure();
				if (term != null && ! ValidationHelperMethods.isDotNetLabel(term)) {
					return ctx.createFailureStatus(new java.lang.Object[] {place, marking.getText()});
				}
			}	
		}
		
		if (object instanceof Arc) {
			Arc arc = (Arc) object;
			HLAnnotation annotation = arc.getHlinscription();
			if (annotation!= null) {
				// eki: type being not null is subject of another constraint
				Term term = annotation.getStructure();
				if (term != null && ! ValidationHelperMethods.isDotNetLabel(term)) {
					return ctx.createFailureStatus(new java.lang.Object[] {arc, annotation.getText()});
				}
			}	
		}
		
		return ctx.createSuccessStatus();
	}

}
