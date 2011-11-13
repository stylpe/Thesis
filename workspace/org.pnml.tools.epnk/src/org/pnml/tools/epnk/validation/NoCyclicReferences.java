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

import java.util.HashSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * This is a constraint saying that there must be no cycles in the
 * reference nodes of a net. Note that this is a constraint on the
 * net rather than on individual reference nodes for efficiency
 * reasons.
 *  
 * @author kindler
 * @generated NOT
 */
public class NoCyclicReferences extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();

		if (eObj instanceof PetriNet) {
			PetriNet net = (PetriNet) eObj;
			
			HashSet<Node> checked = new HashSet<Node>();
			HashSet<Node> cycleRepr = new HashSet<Node>();
			
			for (Page p: net.getPage()) {
				checkPage(p,checked,cycleRepr);
			}
			
			if (!cycleRepr.isEmpty()) {
				return ctx.createFailureStatus(cycleRepr);
			}
			
		} 

		return ctx.createSuccessStatus();
	}
	
	public static Node resolveStep(Node node) {

		if (node instanceof RefPlace) {
			return ((RefPlace) node).getRef(); 
		}
		
		if (node instanceof RefTransition) {
			return ((RefTransition) node).getRef(); 
		}
		
		return null;
		
	}
	
	public static void checkPage(Page page, HashSet<Node> checked, HashSet<Node> cycleRepr) {
		for (Object o : page.getObject()) {
			if (o instanceof Page) {
				checkPage((Page) o, checked, cycleRepr);
			} else if (o instanceof Node) {
				checkNode((Node) o, checked, cycleRepr);
			}
		}
	}
	
	public static void checkNode(Node node, HashSet<Node> checked, HashSet<Node> cycleRepr) {
		
		HashSet<Node> visited = new HashSet<Node>();
		
		Node n =  node;
		
		while (n != null && !(node instanceof Place) && !(node instanceof Transition)) {

			if (visited.contains(n)) {
				cycleRepr.add(n);
				checked.add(n);
				return;
			}
			
			if (checked.contains(n)) {
				return;
			}
			
			checked.add(n);
			

			
			visited.add(n);			
			n = resolveStep(n);
			
		}
		
	}

}
