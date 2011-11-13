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
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * This makes sure that the partition element constants have the correct type for
 * partition (the partitions base sort).
 *  
 * @author eki
 * @generated NOT
 */
public class PartitionElementConstantsCorrect extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();


		if (object != null && object instanceof Partition) {
			Partition partition = (Partition) object;
			Sort sort = partition.getDef().resolve(null);
			if (sort != null) {
				for (PartitionElement element : partition.getPartitionElements()) {
					for (Term term : element.getPartitionelementconstant()) {
						if (!sort.isSuperSortOf(term.getSort())) {
							return ctx.createFailureStatus(new java.lang.Object[] {partition});				
						}
					}
				}
			}
		}

		return ctx.createSuccessStatus();
	}

}
