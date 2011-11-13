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
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getColor <em>Color</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getImage <em>Image</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientColor <em>Gradient Color</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientrotation <em>Gradientrotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFill()
 * @model
 * @generated
 */
public interface Fill extends EObject {
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
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFill_Color()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.Color"
	 * @generated
	 */
	NotImplemented getColor();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFill_Image()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.URI"
	 * @generated
	 */
	NotImplemented getImage();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Gradient Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Color</em>' attribute.
	 * @see #setGradientColor(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFill_GradientColor()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.Color"
	 * @generated
	 */
	NotImplemented getGradientColor();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientColor <em>Gradient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Color</em>' attribute.
	 * @see #getGradientColor()
	 * @generated
	 */
	void setGradientColor(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Gradientrotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradientrotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradientrotation</em>' attribute.
	 * @see #setGradientrotation(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFill_Gradientrotation()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.GradientRotation"
	 * @generated
	 */
	NotImplemented getGradientrotation();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientrotation <em>Gradientrotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradientrotation</em>' attribute.
	 * @see #getGradientrotation()
	 * @generated
	 */
	void setGradientrotation(NotImplemented value);

} // Fill
