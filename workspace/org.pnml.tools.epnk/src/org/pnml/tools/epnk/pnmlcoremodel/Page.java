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
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Page#getObject <em>Object</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Page#getPageLabelProxy <em>Page Label Proxy</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Page#getLabelproxy <em>Labelproxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends org.pnml.tools.epnk.pnmlcoremodel.Object {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPage_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.pnml.tools.epnk.pnmlcoremodel.Object> getObject();

	/**
	 * Returns the value of the '<em><b>Page Label Proxy</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Label Proxy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Label Proxy</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPage_PageLabelProxy()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<PageLabelProxy> getPageLabelProxy();

	/**
	 * Returns the value of the '<em><b>Labelproxy</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labelproxy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelproxy</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPage_Labelproxy()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<LabelProxy> getLabelproxy();

} // Page
