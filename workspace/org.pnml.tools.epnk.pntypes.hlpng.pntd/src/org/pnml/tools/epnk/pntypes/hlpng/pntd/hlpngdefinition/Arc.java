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
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc#getHlinscription <em>Hlinscription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Hlinscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hlinscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hlinscription</em>' containment reference.
	 * @see #setHlinscription(HLAnnotation)
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getArc_Hlinscription()
	 * @model containment="true"
	 * @generated
	 */
	HLAnnotation getHlinscription();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc#getHlinscription <em>Hlinscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hlinscription</em>' containment reference.
	 * @see #getHlinscription()
	 * @generated
	 */
	void setHlinscription(HLAnnotation value);

} // Arc
