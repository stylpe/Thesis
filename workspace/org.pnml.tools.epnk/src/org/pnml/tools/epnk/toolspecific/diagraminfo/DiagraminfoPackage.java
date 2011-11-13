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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoFactory
 * @model kind="package"
 * @generated
 */
public interface DiagraminfoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagraminfo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/toolspecifc/diagraminfo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagraminfo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagraminfoPackage eINSTANCE = org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagraminfoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl <em>Diagram Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagraminfoPackageImpl#getDiagramInfo()
	 * @generated
	 */
	int DIAGRAM_INFO = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INFO__TOOL = PnmlcoremodelPackage.TOOL_INFO__TOOL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INFO__VERSION = PnmlcoremodelPackage.TOOL_INFO__VERSION;

	/**
	 * The feature id for the '<em><b>Page Label Proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INFO__PAGE_LABEL_PROXY = PnmlcoremodelPackage.TOOL_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INFO__DIAGRAM = PnmlcoremodelPackage.TOOL_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INFO__LABEL_PROXY = PnmlcoremodelPackage.TOOL_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INFO_FEATURE_COUNT = PnmlcoremodelPackage.TOOL_INFO_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo <em>Diagram Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Info</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo
	 * @generated
	 */
	EClass getDiagramInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getPageLabelProxy <em>Page Label Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Label Proxy</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getPageLabelProxy()
	 * @see #getDiagramInfo()
	 * @generated
	 */
	EReference getDiagramInfo_PageLabelProxy();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getDiagram()
	 * @see #getDiagramInfo()
	 * @generated
	 */
	EReference getDiagramInfo_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getLabelProxy <em>Label Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Proxy</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo#getLabelProxy()
	 * @see #getDiagramInfo()
	 * @generated
	 */
	EReference getDiagramInfo_LabelProxy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagraminfoFactory getDiagraminfoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl <em>Diagram Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl
		 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagraminfoPackageImpl#getDiagramInfo()
		 * @generated
		 */
		EClass DIAGRAM_INFO = eINSTANCE.getDiagramInfo();

		/**
		 * The meta object literal for the '<em><b>Page Label Proxy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_INFO__PAGE_LABEL_PROXY = eINSTANCE.getDiagramInfo_PageLabelProxy();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_INFO__DIAGRAM = eINSTANCE.getDiagramInfo_Diagram();

		/**
		 * The meta object literal for the '<em><b>Label Proxy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_INFO__LABEL_PROXY = eINSTANCE.getDiagramInfo_LabelProxy();

	}

} //DiagraminfoPackage
