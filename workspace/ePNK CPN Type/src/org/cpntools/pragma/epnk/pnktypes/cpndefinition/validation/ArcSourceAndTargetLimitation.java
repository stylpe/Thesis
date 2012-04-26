
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;

/**
 * This is a constraint saying that the source and the target of
 * an Arc must be compatible, i.e. between a Place and 
 * either a Transition or a Page.
 *  
 * @author mhh
 * @generated NOT
 */
public class ArcSourceAndTargetLimitation extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		if (eObj instanceof Arc) {
			Arc arc = (Arc) eObj;
			Node source = arc.getSource();
			Node target = arc.getTarget();
			
			if (source != null && target != null) {
				PlaceNode pn = null;
				Node other = null;
				if(source instanceof PlaceNode) {
					pn = (PlaceNode) source;
					other = target;
				} else if (target instanceof PlaceNode) {
					pn = (PlaceNode) target;
					other = source;
				}
				if(	pn == null || // there was no Place
					other instanceof PlaceNode) // both are Places
					return ctx.createFailureStatus(new Object[] {arc});
			} 
		} 

		return ctx.createSuccessStatus();
	}

}
