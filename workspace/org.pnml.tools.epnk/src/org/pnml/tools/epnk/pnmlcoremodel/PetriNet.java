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
import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getType <em>Type</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getPage <em>Page</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getToolspecific <em>Toolspecific</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends ID {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNet_Name()
	 * @model containment="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNet_Page()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPage();

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
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNet_Toolspecific()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToolInfo> getToolspecific();

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
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNet_Unknown()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnyType> getUnknown();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(PetriNetType)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNet_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PetriNetType getType();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PetriNetType value);

} // PetriNet
