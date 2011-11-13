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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getText <em>Text</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabelProxy()
 * @model
 * @generated
 */
public interface LabelProxy extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(Label)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabelProxy_Label()
	 * @model required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabelProxy_Text()
	 * @model required="true" transient="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(org.pnml.tools.epnk.pnmlcoremodel.Object)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabelProxy_Object()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	org.pnml.tools.epnk.pnmlcoremodel.Object getObject();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(org.pnml.tools.epnk.pnmlcoremodel.Object value);

} // LabelProxy
