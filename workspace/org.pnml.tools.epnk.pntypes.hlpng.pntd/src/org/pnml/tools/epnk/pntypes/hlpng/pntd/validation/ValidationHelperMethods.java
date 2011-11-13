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

import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Add;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.NumberOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;

public class ValidationHelperMethods {

	static boolean isGround(Term term) {
		if (term != null) {
			Iterator<EObject> iterator = term.eAllContents();

			EObject current = term;
			while (current != null) {
				if (current instanceof Variable) {
					return false;
				}

				if (iterator.hasNext()) {
					current = iterator.next();
				} else {
					current = null;
				}
			}
			return true;
		}	
		return false;
	}
	
	static boolean isSNConstruct(EObject object) {
		if (object != null) {
			TreeIterator<EObject> iterator = object.eAllContents();

			EObject current = object;
			while (current != null) {
				if (TermsPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
					if (current instanceof MultiSetSort) {
						return false;
					}
				} else if (DotsPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
                    // nothing specific here
				} else if (MultisetsPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
					// TODO eki: check with the SN experts, whether this is the
					//           right set of multiset operators
					if ( !(current instanceof Add ||
							current instanceof All ||
							current instanceof Empty ||
							current instanceof NumberOf ) ) {
						return false;
					}
				} else if (BooleansPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
                    // nothing specific here					
				} else if (FiniteenumerationsPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
                    // nothing specific here					
				} else if (CyclicenumerationsPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
                    // nothing specific here					
				} else if (FiniteintrangesPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
                    // nothing specific here					
				} else if (PartitionsPackage.eINSTANCE.equals(current.eClass().getEPackage())) {
                    // nothing specific here					
				} else if (current instanceof NumberConstant) {
					iterator.prune();		
				} else {
					return false;
				}
				
				if (iterator.hasNext()) {
					current = iterator.next();
				} else {
					current = null;
				}
			}
			return true;
		}	
		return false;
	}
	
	static boolean isDotNetLabel(Term term) {
		if (term != null) {
			Iterator<EObject> iterator = term.eAllContents();

			EObject current = term;
			while (current != null) {
				if (!(  current instanceof NumberOf ||
						current instanceof DotConstant ||
						current instanceof NumberConstant ||
						current instanceof Number
						)) {
					return false;
				}

				if (iterator.hasNext()) {
					current = iterator.next();
				} else {
					current = null;
				}
			}
			return true;
		}	
		return false;
	}
}
