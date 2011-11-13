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
 * Copyright (C) 2011 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.toolspecific.diagraminfo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getPageLabelProxy <em>Page Label Proxy</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getLabelProxy <em>Label Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoPackage#getDiagramInfo()
 * @model
 * @generated
 */
public interface DiagramInfo extends ToolInfo {
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
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoPackage#getDiagramInfo_PageLabelProxy()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageLabelProxy> getPageLabelProxy();

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference.
	 * @see #setDiagram(Diagram)
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoPackage#getDiagramInfo_Diagram()
	 * @model containment="true"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getDiagram <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' containment reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Label Proxy</b></em>' containment reference list.
	 * The list contents are of type {@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Proxy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Proxy</em>' containment reference list.
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoPackage#getDiagramInfo_LabelProxy()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabelProxy> getLabelProxy();

} // DiagramInfo
