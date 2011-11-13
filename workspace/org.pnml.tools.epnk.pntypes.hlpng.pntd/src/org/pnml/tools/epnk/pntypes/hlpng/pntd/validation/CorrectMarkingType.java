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
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * This is a constraint saying the marking of a place must have the
 * type that is a multiset over the sort of the place.
 *  
 * @author eki
 * @generated NOT
 */
public class CorrectMarkingType extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof Place) {
			Place place = (Place) object;
			HLMarking marking = place.getHlinitialMarking();
			Type type = place.getType();
			if (marking != null && type != null) {
				// eki: type being not null is subject of another constraint
				Term term = marking.getStructure();
				Sort sort = type.getStructure();
				if (sort != null) {
					sort = sort.resolve(null);
				}
				if (term != null &&  sort != null) {
					// eki: term and sort being not null is subject of another constraint
					Sort termSort = term.getSort();
					if (termSort != null) {
						// eki: the termSort being not null (correctly typed) is subject
						//      of another constraint
						if (! (termSort instanceof MultiSetSort) ) {
							return ctx.createFailureStatus(new Object[] {place, type.getText(), marking.getText()});		
						} else {
							Sort basisSort = ((MultiSetSort) termSort).getBasis();
							if (!sort.isSuperSortOf(basisSort)) {
								return ctx.createFailureStatus(new Object[] {place, type.getText(), marking.getText()});		
							}
						}
					}	
				}	
			}
		}
		return ctx.createSuccessStatus();
	}

}
