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
package org.pnml.tools.epnk.pntypes.ptnet.impl;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;
import org.pnml.tools.epnk.pntypes.ptnet.PTNet;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PTNetImpl extends PetriNetTypeImpl implements PTNet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author eki
	 */
	public PTNetImpl() {
		// eki: made the constructor public (so that it can be instantiated by the extension-point)
		// TODO maybe this could be done a bit more elegantly (so that one does not need to
		//      change this in the generated code.
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.PT_NET;
	}
	
	// TODO maybe the URI should not be hardcoded here!
	// @generated NOT
	// @author eki
	@Override
	public String toString() {
		return "http://www.pnml.org/version-2009/grammar/ptnet";
	}

} //PTNetImpl
