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
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getFamily <em>Family</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getStyle <em>Style</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getSize <em>Size</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getAlign <em>Align</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont()
 * @model
 * @generated
 */
public interface Font extends EObject {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont_Family()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.FontFamily"
	 * @generated
	 */
	NotImplemented getFamily();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(NotImplemented value);

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
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont_Style()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.FontStyle"
	 * @generated
	 */
	NotImplemented getStyle();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont_Weight()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.FontWeight"
	 * @generated
	 */
	NotImplemented getWeight();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont_Size()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.FontSize"
	 * @generated
	 */
	NotImplemented getSize();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration</em>' attribute.
	 * @see #setDecoration(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont_Decoration()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.FontDecoration"
	 * @generated
	 */
	NotImplemented getDecoration();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getDecoration <em>Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration</em>' attribute.
	 * @see #getDecoration()
	 * @generated
	 */
	void setDecoration(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(NotImplemented)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont_Align()
	 * @model dataType="org.pnml.tools.epnk.pnmlcoremodel.FontAlign"
	 * @generated
	 */
	NotImplemented getAlign();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(NotImplemented value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(float)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getFont_Rotation()
	 * @model
	 * @generated
	 */
	float getRotation();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(float value);

} // Font
