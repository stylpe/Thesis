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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Graphics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getPosition <em>Position</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getLine <em>Line</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getFill <em>Fill</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNodeGraphics()
 * @model
 * @generated
 */
public interface NodeGraphics extends Graphics {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Coordinate)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNodeGraphics_Position()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getPosition();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Coordinate)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNodeGraphics_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getDimension();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Coordinate value);

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
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNodeGraphics_Line()
	 * @model containment="true"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Fill)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNodeGraphics_Fill()
	 * @model containment="true"
	 * @generated
	 */
	Fill getFill();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getFill <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Fill value);

} // NodeGraphics
