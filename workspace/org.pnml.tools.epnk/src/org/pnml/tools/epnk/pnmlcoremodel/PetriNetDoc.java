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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc#getNet <em>Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNetDoc()
 * @model
 * @generated
 */
public interface PetriNetDoc extends EObject {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNetDoc_Net()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PetriNet> getNet();

} // PetriNetDoc
