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
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * This is a constraint saying that the arc annotation has
 * the a type that is a multiset over the sort of the 
 * associated place.
 *  
 * @author eki
 * @generated NOT
 */
public class CorrectArcAnnotationType extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof Arc) {
			Arc arc = (Arc) object;
			HLAnnotation annotation = arc.getHlinscription();
			
			// eki: existence of exactly one source or target place is subject of another
			//      constraint
			Place place = null;
			Node node = arc.getSource();
			if (node instanceof Place) {
				place = (Place) node;
			} 
		    node = arc.getTarget();
			if (node instanceof Place) {
				place = (Place) node;
			} 

			
			if (place != null) {
				Type type = place.getType();
				if (annotation != null && type != null) {
					// eki: type being is subject of another constraint
					Term term = annotation.getStructure();
					Sort sort = type.getStructure();
					if (sort != null) {
						sort = sort.resolve(null);
					}
					if (term != null &&  sort != null) {
						// eki: term and sort being not null is subject of another constraint
						Sort termSort = term.getSort();
						if (termSort != null) {
							// eki: the termSort being not null is subject of another constraint
							if (! (termSort instanceof MultiSetSort) ) {
								return ctx.createFailureStatus(new Object[] {arc, type.getText(), annotation.getText()});		
							} else {
								Sort basisSort = ((MultiSetSort) termSort).getBasis();
								if (!sort.isSuperSortOf(basisSort)) {
									return ctx.createFailureStatus(new Object[] {arc, type.getText(), annotation.getText()});		
								}
							}
						}	
					}	
				}
			}
		}
		return ctx.createSuccessStatus();
	}

}
