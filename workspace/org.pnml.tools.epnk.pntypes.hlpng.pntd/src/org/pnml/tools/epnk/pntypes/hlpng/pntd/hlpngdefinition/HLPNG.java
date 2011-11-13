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

import org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLPNG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getHLPNG()
 * @model
 * @generated
 */
public interface HLPNG extends StructuredPetriNetType {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind
	 * @see #setKind(HLPNGKind)
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getHLPNG_Kind()
	 * @model required="true"
	 * @generated
	 */
	HLPNGKind getKind();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(HLPNGKind value);
} // HLPNG
