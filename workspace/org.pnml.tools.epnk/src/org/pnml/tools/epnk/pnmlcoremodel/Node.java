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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getOut <em>Out</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends org.pnml.tools.epnk.pnmlcoremodel.Object {

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Arc}.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNode_Out()
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource
	 * @model opposite="source" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<Arc> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.Arc}.
	 * It is bidirectional and its opposite is '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getNode_In()
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget
	 * @model opposite="target" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<Arc> getIn();

} // Node
