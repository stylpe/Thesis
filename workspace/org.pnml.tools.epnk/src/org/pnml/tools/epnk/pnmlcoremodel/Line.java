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

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.helpers.NotImplemented;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getShape <em>Shape</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getColor <em>Color</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getWidth <em>Width</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLine_Shape()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.LineShape"
	 * @generated
	 */
	NotImplemented getShape();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLine_Color()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.Color"
	 * @generated
	 */
	NotImplemented getColor();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLine_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLine_Style()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.LineStyle"
	 * @generated
	 */
	NotImplemented getStyle();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(NotImplemented value);

} // Line
