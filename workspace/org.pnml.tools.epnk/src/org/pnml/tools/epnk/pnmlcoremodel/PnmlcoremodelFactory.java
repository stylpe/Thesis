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
package org.pnml.tools.epnk.pnmlcoremodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage
 * @generated
 */
public interface PnmlcoremodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PnmlcoremodelFactory eINSTANCE = org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petri Net Doc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Net Doc</em>'.
	 * @generated
	 */
	PetriNetDoc createPetriNetDoc();

	/**
	 * Returns a new object of class '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Net</em>'.
	 * @generated
	 */
	PetriNet createPetriNet();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Label Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Proxy</em>'.
	 * @generated
	 */
	LabelProxy createLabelProxy();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Ref Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Place</em>'.
	 * @generated
	 */
	RefPlace createRefPlace();

	/**
	 * Returns a new object of class '<em>Ref Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Transition</em>'.
	 * @generated
	 */
	RefTransition createRefTransition();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name</em>'.
	 * @generated
	 */
	Name createName();

	/**
	 * Returns a new object of class '<em>Arc Graphics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc Graphics</em>'.
	 * @generated
	 */
	ArcGraphics createArcGraphics();

	/**
	 * Returns a new object of class '<em>Node Graphics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Graphics</em>'.
	 * @generated
	 */
	NodeGraphics createNodeGraphics();

	/**
	 * Returns a new object of class '<em>Annotation Graphics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Graphics</em>'.
	 * @generated
	 */
	AnnotationGraphics createAnnotationGraphics();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate</em>'.
	 * @generated
	 */
	Coordinate createCoordinate();

	/**
	 * Returns a new object of class '<em>Fill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fill</em>'.
	 * @generated
	 */
	Fill createFill();

	/**
	 * Returns a new object of class '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font</em>'.
	 * @generated
	 */
	Font createFont();

	/**
	 * Returns a new object of class '<em>Empty Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Type</em>'.
	 * @generated
	 */
	EmptyType createEmptyType();

	/**
	 * Returns a new object of class '<em>Tool Info Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Info Text</em>'.
	 * @generated
	 */
	ToolInfoText createToolInfoText();

	/**
	 * Returns a new object of class '<em>Page Label Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Label Proxy</em>'.
	 * @generated
	 */
	PageLabelProxy createPageLabelProxy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PnmlcoremodelPackage getPnmlcoremodelPackage();

} //PnmlcoremodelFactory
