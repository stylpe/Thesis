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
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getType <em>Type</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getHlinitialMarking <em>Hlinitial Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getPlace_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Hlinitial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hlinitial Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hlinitial Marking</em>' containment reference.
	 * @see #setHlinitialMarking(HLMarking)
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getPlace_HlinitialMarking()
	 * @model containment="true"
	 * @generated
	 */
	HLMarking getHlinitialMarking();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getHlinitialMarking <em>Hlinitial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hlinitial Marking</em>' containment reference.
	 * @see #getHlinitialMarking()
	 * @generated
	 */
	void setHlinitialMarking(HLMarking value);

} // Place
