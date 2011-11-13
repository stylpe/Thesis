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
 * A representation of the model object '<em><b>Tool Info Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getToolInfoText()
 * @model
 * @generated
 */
public interface ToolInfoText extends ToolInfo {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see #setInfo(String)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getToolInfoText_Info()
	 * @model
	 * @generated
	 */
	String getInfo();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(String value);

} // ToolInfoText
