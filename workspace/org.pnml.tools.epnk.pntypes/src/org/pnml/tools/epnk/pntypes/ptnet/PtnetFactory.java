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
package org.pnml.tools.epnk.pntypes.ptnet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage
 * @generated
 */
public interface PtnetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PtnetFactory eINSTANCE = org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>PT Marking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PT Marking</em>'.
	 * @generated
	 */
	PTMarking createPTMarking();

	/**
	 * Returns a new object of class '<em>PT Arc Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PT Arc Annotation</em>'.
	 * @generated
	 */
	PTArcAnnotation createPTArcAnnotation();

	/**
	 * Returns a new object of class '<em>PT Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PT Net</em>'.
	 * @generated
	 */
	PTNet createPTNet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PtnetPackage getPtnetPackage();

} //PtnetFactory
