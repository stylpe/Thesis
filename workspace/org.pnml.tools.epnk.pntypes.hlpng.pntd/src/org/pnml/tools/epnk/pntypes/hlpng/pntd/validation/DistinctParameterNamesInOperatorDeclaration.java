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
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;

/**
 * This is a constraint saying that, in the definition of a named operator,
 * all parameters have different names. Note that this is not a requirement
 * of ISO/IEC 15909-2 since this is about concrete syntax. But, we issue
 * a warning anyway.
 *
 * @author eki
 * @generated NOT
 */
public class DistinctParameterNamesInOperatorDeclaration extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof NamedOperator) {
			NamedOperator namedOperator = (NamedOperator) object;

			Set<String> vars = new HashSet<String>();
			Set<String> duplicates = new HashSet<String>();;

			EList<VariableDecl> parameters = namedOperator.getParameters();
			for (VariableDecl varDecl: parameters) {
				String name = varDecl.getName();
				if (name != null && vars.contains(name)) {
					duplicates.add(name);
				}	
				vars.add(name);
			}

			if (duplicates.size() > 0) {
				return ctx.createFailureStatus(new Object[] {namedOperator, duplicates});
			}
		} 
		return ctx.createSuccessStatus();
	}

}
