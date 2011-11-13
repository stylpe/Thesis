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
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage
 * @generated
 */
public interface HlpngdefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlpngdefinitionFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>HL Marking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HL Marking</em>'.
	 * @generated
	 */
	HLMarking createHLMarking();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>HL Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HL Annotation</em>'.
	 * @generated
	 */
	HLAnnotation createHLAnnotation();

	/**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
	Declaration createDeclaration();

	/**
	 * Returns a new object of class '<em>HLPNG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLPNG</em>'.
	 * @generated
	 */
	HLPNG createHLPNG();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HlpngdefinitionPackage getHlpngdefinitionPackage();

} //HlpngdefinitionFactory
