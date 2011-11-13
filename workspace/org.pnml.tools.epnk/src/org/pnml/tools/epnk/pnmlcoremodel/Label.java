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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getToolspecific <em>Toolspecific</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel()
 * @model abstract="true"
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>Toolspecific</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolspecific</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolspecific</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel_Toolspecific()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToolInfo> getToolspecific();

	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(Graphics)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel_Graphics()
	 * @model containment="true"
	 * @generated
	 */
	Graphics getGraphics();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getGraphics <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics</em>' containment reference.
	 * @see #getGraphics()
	 * @generated
	 */
	void setGraphics(Graphics value);

	/**
	 * Returns the value of the '<em><b>Unknown</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.xml.type.AnyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getLabel_Unknown()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnyType> getUnknown();

} // Label
