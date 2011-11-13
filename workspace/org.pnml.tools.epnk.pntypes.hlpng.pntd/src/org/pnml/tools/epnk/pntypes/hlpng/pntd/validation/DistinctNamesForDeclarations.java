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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;

/**
 * This is a constraint saying that there are no duplicate names
 * in declared variables, sorts and operations. Note that this is not a requirement
 * of ISO/IEC 15909-2 since this is about concrete syntax. But, we issue
 * a warning anyway.
 *
 * @author eki
 * @generated NOT
 */
public class DistinctNamesForDeclarations extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

        if (object instanceof PetriNet) {
        	PetriNet net = (PetriNet) object;
        	PetriNetType type = net.getType();
        	if (type != null && type instanceof HLPNG) {
        		Set<String> operators = new HashSet<String>();
        		Set<String> sorts = new HashSet<String>();
        		Set<String> vars = new HashSet<String>();

        		Set<String> dupOperators = new HashSet<String>();
        		Set<String> dupSorts = new HashSet<String>();
        		Set<String> dupVars = new HashSet<String>();
 
        		Iterator<EObject> iterator = net.eAllContents();
        		EObject current = net;
        		while (current != null) {
        			if (current instanceof NamedOperator) {
        				String name = ((NamedOperator) current).getName();
        				if (name != null && operators.contains(name)) {
        					dupOperators.add(name);
        				} else if (name != null ) {
        					operators.add(name);
        				}
        			} else if (current instanceof NamedSort) {
        				String name = ((NamedSort) current).getName();
        				if (name != null && sorts.contains(name)) {
        					dupSorts.add(name);
        				} else if (name != null ) {
        					sorts.add(name);
        				}
        			} else if (current instanceof VariableDecl) {
        				VariableDecl varDecl = (VariableDecl) current;
        				EObject container = varDecl.eContainer();
        				if (container instanceof Declarations) {
        					// do this only if this is variable declaration within
        					// a explicit declaration (not a parameter of an operator decl).
        					String name = varDecl.getName();
        					if (name != null && vars.contains(name)) {
        						dupVars.add(name);
        					} else if (name != null ) {
        						vars.add(name);
        					}
        				}
        			}
        			
        			if (iterator.hasNext()) {
        				current = iterator.next();
        			} else {
        				current = null;
        			}
        		}		
        		
        		if (dupOperators.size() > 0 || dupSorts.size()> 0 || dupVars.size() > 0 ) {
        			return ctx.createFailureStatus(new Object[] {dupSorts, dupOperators, dupVars});
        			
        		}
        	}
        }
    	
		return ctx.createSuccessStatus();
	}

}
