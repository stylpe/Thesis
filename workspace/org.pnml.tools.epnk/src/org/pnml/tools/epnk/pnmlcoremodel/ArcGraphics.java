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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Graphics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics#getLine <em>Line</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getArcGraphics()
 * @model
 * @generated
 */
public interface ArcGraphics extends Graphics {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getArcGraphics_Line()
	 * @model containment="true"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Coordinate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getArcGraphics_Position()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coordinate> getPosition();

} // ArcGraphics
