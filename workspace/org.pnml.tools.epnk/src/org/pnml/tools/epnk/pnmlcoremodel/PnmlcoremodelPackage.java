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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory
 * @model kind="package"
 * @generated
 */
public interface PnmlcoremodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pnmlcoremodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/pnmlcoremodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pnmlcoremodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PnmlcoremodelPackage eINSTANCE = org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetDocImpl <em>Petri Net Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetDocImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPetriNetDoc()
	 * @generated
	 */
	int PETRI_NET_DOC = 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_DOC__NET = 0;

	/**
	 * The number of structural features of the '<em>Petri Net Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_DOC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.ID <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ID
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getID()
	 * @generated
	 */
	int ID = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ID = 0;

	/**
	 * The number of structural features of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ID = ID__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TYPE = ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PAGE = ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TOOLSPECIFIC = ID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__UNKNOWN = ID_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = ID_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ObjectImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = ID__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TOOLSPECIFIC = ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__GRAPHICS = ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__UNKNOWN = ID_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = ID_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOLSPECIFIC = OBJECT__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GRAPHICS = OBJECT__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNKNOWN = OBJECT__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OBJECT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Label Proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_LABEL_PROXY = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labelproxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LABELPROXY = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LabelProxyImpl <em>Label Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.LabelProxyImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLabelProxy()
	 * @generated
	 */
	int LABEL_PROXY = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PROXY__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PROXY__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PROXY__OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Label Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PROXY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.GraphicsImpl <em>Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.GraphicsImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getGraphics()
	 * @generated
	 */
	int GRAPHICS = 5;

	/**
	 * The number of structural features of the '<em>Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.NodeImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TOOLSPECIFIC = OBJECT__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPHICS = OBJECT__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UNKNOWN = OBJECT__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IN = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = OBJECT__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = OBJECT__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = OBJECT__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceNodeImpl <em>Place Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceNodeImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPlaceNode()
	 * @generated
	 */
	int PLACE_NODE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__TOOLSPECIFIC = NODE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__GRAPHICS = NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__UNKNOWN = NODE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__OUT = NODE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE__IN = NODE__IN;

	/**
	 * The number of structural features of the '<em>Place Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionNodeImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getTransitionNode()
	 * @generated
	 */
	int TRANSITION_NODE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__TOOLSPECIFIC = NODE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__GRAPHICS = NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__UNKNOWN = NODE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__OUT = NODE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__IN = NODE__IN;

	/**
	 * The number of structural features of the '<em>Transition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PLACE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PLACE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = PLACE_NODE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = PLACE_NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = PLACE_NODE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = PLACE_NODE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = PLACE_NODE__IN;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PLACE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.RefPlaceImpl <em>Ref Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.RefPlaceImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getRefPlace()
	 * @generated
	 */
	int REF_PLACE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__ID = PLACE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__NAME = PLACE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__TOOLSPECIFIC = PLACE_NODE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__GRAPHICS = PLACE_NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__UNKNOWN = PLACE_NODE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__OUT = PLACE_NODE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__IN = PLACE_NODE__IN;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__REF = PLACE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE_FEATURE_COUNT = PLACE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.RefTransitionImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getRefTransition()
	 * @generated
	 */
	int REF_TRANSITION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__ID = TRANSITION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__NAME = TRANSITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__TOOLSPECIFIC = TRANSITION_NODE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__GRAPHICS = TRANSITION_NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__UNKNOWN = TRANSITION_NODE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__OUT = TRANSITION_NODE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__IN = TRANSITION_NODE__IN;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__REF = TRANSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION_FEATURE_COUNT = TRANSITION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = TRANSITION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = TRANSITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOOLSPECIFIC = TRANSITION_NODE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GRAPHICS = TRANSITION_NODE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNKNOWN = TRANSITION_NODE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = TRANSITION_NODE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = TRANSITION_NODE__IN;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = TRANSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 15;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TOOLSPECIFIC = 0;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__GRAPHICS = 1;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__UNKNOWN = 2;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.NameImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 14;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__TOOLSPECIFIC = LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__GRAPHICS = LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__UNKNOWN = LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__TEXT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ArcGraphicsImpl <em>Arc Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ArcGraphicsImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getArcGraphics()
	 * @generated
	 */
	int ARC_GRAPHICS = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_GRAPHICS__LINE = GRAPHICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_GRAPHICS__POSITION = GRAPHICS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_GRAPHICS_FEATURE_COUNT = GRAPHICS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl <em>Node Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getNodeGraphics()
	 * @generated
	 */
	int NODE_GRAPHICS = 17;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__POSITION = GRAPHICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__DIMENSION = GRAPHICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__LINE = GRAPHICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS__FILL = GRAPHICS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GRAPHICS_FEATURE_COUNT = GRAPHICS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl <em>Annotation Graphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getAnnotationGraphics()
	 * @generated
	 */
	int ANNOTATION_GRAPHICS = 18;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__FILL = GRAPHICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__LINE = GRAPHICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__OFFSET = GRAPHICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS__FONT = GRAPHICS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Annotation Graphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_GRAPHICS_FEATURE_COUNT = GRAPHICS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 19;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SHAPE = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STYLE = 3;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.CoordinateImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 20;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__Y = 1;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl <em>Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFill()
	 * @generated
	 */
	int FILL = 21;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Gradient Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__GRADIENT_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Gradientrotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__GRADIENTROTATION = 3;

	/**
	 * The number of structural features of the '<em>Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 22;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__STYLE = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__DECORATION = 4;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ALIGN = 5;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ROTATION = 6;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl <em>Petri Net Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPetriNetType()
	 * @generated
	 */
	int PETRI_NET_TYPE = 23;

	/**
	 * The number of structural features of the '<em>Petri Net Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.EmptyTypeImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 24;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfo <em>Tool Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ToolInfo
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getToolInfo()
	 * @generated
	 */
	int TOOL_INFO = 26;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Tool Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ToolInfoTextImpl <em>Tool Info Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ToolInfoTextImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getToolInfoText()
	 * @generated
	 */
	int TOOL_INFO_TEXT = 25;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_TEXT__TOOL = TOOL_INFO__TOOL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_TEXT__VERSION = TOOL_INFO__VERSION;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_TEXT__INFO = TOOL_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tool Info Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_TEXT_FEATURE_COUNT = TOOL_INFO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageLabelProxyImpl <em>Page Label Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PageLabelProxyImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPageLabelProxy()
	 * @generated
	 */
	int PAGE_LABEL_PROXY = 28;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LABEL_PROXY__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LABEL_PROXY__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Page Label Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LABEL_PROXY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.AttributeImpl
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 29;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TOOLSPECIFIC = LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__GRAPHICS = LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNKNOWN = LABEL__UNKNOWN;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Line Shape</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLineShape()
	 * @generated
	 */
	int LINE_SHAPE = 30;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 31;

	/**
	 * The meta object id for the '<em>Line Style</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 32;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getURI()
	 * @generated
	 */
	int URI = 33;

	/**
	 * The meta object id for the '<em>Gradient Rotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getGradientRotation()
	 * @generated
	 */
	int GRADIENT_ROTATION = 34;

	/**
	 * The meta object id for the '<em>Font Family</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontFamily()
	 * @generated
	 */
	int FONT_FAMILY = 35;

	/**
	 * The meta object id for the '<em>Font Style</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 36;

	/**
	 * The meta object id for the '<em>Font Weight</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontWeight()
	 * @generated
	 */
	int FONT_WEIGHT = 37;

	/**
	 * The meta object id for the '<em>Font Decoration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontDecoration()
	 * @generated
	 */
	int FONT_DECORATION = 38;

	/**
	 * The meta object id for the '<em>Font Size</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontSize()
	 * @generated
	 */
	int FONT_SIZE = 39;

	/**
	 * The meta object id for the '<em>Font Align</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontAlign()
	 * @generated
	 */
	int FONT_ALIGN = 40;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc <em>Petri Net Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net Doc</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc
	 * @generated
	 */
	EClass getPetriNetDoc();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc#getNet()
	 * @see #getPetriNetDoc()
	 * @generated
	 */
	EReference getPetriNetDoc_Net();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getName()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getPage()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Page();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getToolspecific <em>Toolspecific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecific</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getToolspecific()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Toolspecific();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getUnknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unknown</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getUnknown()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Unknown();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNet#getType()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Type();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Page#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Page#getObject()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Page#getPageLabelProxy <em>Page Label Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Label Proxy</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Page#getPageLabelProxy()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PageLabelProxy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Page#getLabelproxy <em>Labelproxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labelproxy</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Page#getLabelproxy()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Labelproxy();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Object#getToolspecific <em>Toolspecific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecific</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Object#getToolspecific()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Toolspecific();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.Object#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Object#getGraphics()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Graphics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Object#getUnknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unknown</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Object#getUnknown()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Unknown();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy <em>Label Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Proxy</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.LabelProxy
	 * @generated
	 */
	EClass getLabelProxy();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getLabel()
	 * @see #getLabelProxy()
	 * @generated
	 */
	EReference getLabelProxy_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getText()
	 * @see #getLabelProxy()
	 * @generated
	 */
	EAttribute getLabelProxy_Text();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.LabelProxy#getObject()
	 * @see #getLabelProxy()
	 * @generated
	 */
	EReference getLabelProxy_Object();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Graphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Graphics
	 * @generated
	 */
	EClass getGraphics();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Node#getOut()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Out();

	/**
	 * Returns the meta object for the reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Node#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Node#getIn()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_In();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.PlaceNode <em>Place Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Node</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PlaceNode
	 * @generated
	 */
	EClass getPlaceNode();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.TransitionNode <em>Transition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Node</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.TransitionNode
	 * @generated
	 */
	EClass getTransitionNode();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.RefPlace <em>Ref Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Place</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.RefPlace
	 * @generated
	 */
	EClass getRefPlace();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pnmlcoremodel.RefPlace#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.RefPlace#getRef()
	 * @see #getRefPlace()
	 * @generated
	 */
	EReference getRefPlace_Ref();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.RefTransition <em>Ref Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Transition</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.RefTransition
	 * @generated
	 */
	EClass getRefTransition();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pnmlcoremodel.RefTransition#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.RefTransition#getRef()
	 * @see #getRefTransition()
	 * @generated
	 */
	EReference getRefTransition_Ref();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Name#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Name#getText()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Text();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getToolspecific <em>Toolspecific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolspecific</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Label#getToolspecific()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Toolspecific();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Label#getGraphics()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Graphics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.Label#getUnknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unknown</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Label#getUnknown()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Unknown();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics <em>Arc Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Graphics</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics
	 * @generated
	 */
	EClass getArcGraphics();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics#getLine()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics#getPosition()
	 * @see #getArcGraphics()
	 * @generated
	 */
	EReference getArcGraphics_Position();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics <em>Node Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Graphics</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics
	 * @generated
	 */
	EClass getNodeGraphics();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getPosition()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getDimension()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getLine()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Line();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics#getFill()
	 * @see #getNodeGraphics()
	 * @generated
	 */
	EReference getNodeGraphics_Fill();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics <em>Annotation Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Graphics</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics
	 * @generated
	 */
	EClass getAnnotationGraphics();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFill()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getLine()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Line();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getOffset()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFont()
	 * @see #getAnnotationGraphics()
	 * @generated
	 */
	EReference getAnnotationGraphics_Font();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Line#getShape()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Shape();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Line#getColor()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Line#getWidth()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Line#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Line#getStyle()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Style();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Coordinate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Coordinate#getX()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_X();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Coordinate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Coordinate#getY()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Y();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Fill
	 * @generated
	 */
	EClass getFill();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Fill#getColor()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Fill#getImage()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientColor <em>Gradient Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Color</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientColor()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_GradientColor();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientrotation <em>Gradientrotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradientrotation</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Fill#getGradientrotation()
	 * @see #getFill()
	 * @generated
	 */
	EAttribute getFill_Gradientrotation();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font#getFamily()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font#getStyle()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font#getWeight()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font#getSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font#getDecoration()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Decoration();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font#getAlign()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.Font#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Font#getRotation()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Rotation();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNetType <em>Petri Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net Type</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNetType
	 * @generated
	 */
	EClass getPetriNetType();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText <em>Tool Info Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Info Text</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText
	 * @generated
	 */
	EClass getToolInfoText();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText#getInfo()
	 * @see #getToolInfoText()
	 * @generated
	 */
	EAttribute getToolInfoText_Info();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Info</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ToolInfo
	 * @generated
	 */
	EClass getToolInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfo#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ToolInfo#getTool()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_Tool();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ToolInfo#getVersion()
	 * @see #getToolInfo()
	 * @generated
	 */
	EAttribute getToolInfo_Version();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.ID#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ID#getId()
	 * @see #getID()
	 * @generated
	 */
	EAttribute getID_Id();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy <em>Page Label Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Label Proxy</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy
	 * @generated
	 */
	EClass getPageLabelProxy();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy#getText()
	 * @see #getPageLabelProxy()
	 * @generated
	 */
	EAttribute getPageLabelProxy_Text();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy#getLabel()
	 * @see #getPageLabelProxy()
	 * @generated
	 */
	EReference getPageLabelProxy_Label();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pnmlcoremodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Line Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Shape</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getLineShape();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Style</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getLineStyle();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Gradient Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gradient Rotation</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getGradientRotation();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Family</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getFontFamily();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Style</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getFontStyle();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Weight</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getFontWeight();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Font Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Decoration</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getFontDecoration();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Size</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getFontSize();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.helpers.NotImplemented <em>Font Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Align</em>'.
	 * @see org.pnml.tools.epnk.helpers.NotImplemented
	 * @model instanceClass="org.pnml.tools.epnk.helpers.NotImplemented"
	 * @generated
	 */
	EDataType getFontAlign();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PnmlcoremodelFactory getPnmlcoremodelFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetDocImpl <em>Petri Net Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetDocImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPetriNetDoc()
		 * @generated
		 */
		EClass PETRI_NET_DOC = eINSTANCE.getPetriNetDoc();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET_DOC__NET = eINSTANCE.getPetriNetDoc_Net();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__NAME = eINSTANCE.getPetriNet_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PAGE = eINSTANCE.getPetriNet_Page();

		/**
		 * The meta object literal for the '<em><b>Toolspecific</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TOOLSPECIFIC = eINSTANCE.getPetriNet_Toolspecific();

		/**
		 * The meta object literal for the '<em><b>Unknown</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__UNKNOWN = eINSTANCE.getPetriNet_Unknown();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TYPE = eINSTANCE.getPetriNet_Type();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__OBJECT = eINSTANCE.getPage_Object();

		/**
		 * The meta object literal for the '<em><b>Page Label Proxy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_LABEL_PROXY = eINSTANCE.getPage_PageLabelProxy();

		/**
		 * The meta object literal for the '<em><b>Labelproxy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LABELPROXY = eINSTANCE.getPage_Labelproxy();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ObjectImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Toolspecific</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TOOLSPECIFIC = eINSTANCE.getObject_Toolspecific();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__GRAPHICS = eINSTANCE.getObject_Graphics();

		/**
		 * The meta object literal for the '<em><b>Unknown</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__UNKNOWN = eINSTANCE.getObject_Unknown();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LabelProxyImpl <em>Label Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.LabelProxyImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLabelProxy()
		 * @generated
		 */
		EClass LABEL_PROXY = eINSTANCE.getLabelProxy();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_PROXY__LABEL = eINSTANCE.getLabelProxy_Label();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_PROXY__TEXT = eINSTANCE.getLabelProxy_Text();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_PROXY__OBJECT = eINSTANCE.getLabelProxy_Object();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.GraphicsImpl <em>Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.GraphicsImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getGraphics()
		 * @generated
		 */
		EClass GRAPHICS = eINSTANCE.getGraphics();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.NodeImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUT = eINSTANCE.getNode_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IN = eINSTANCE.getNode_In();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceNodeImpl <em>Place Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceNodeImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPlaceNode()
		 * @generated
		 */
		EClass PLACE_NODE = eINSTANCE.getPlaceNode();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionNodeImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getTransitionNode()
		 * @generated
		 */
		EClass TRANSITION_NODE = eINSTANCE.getTransitionNode();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.RefPlaceImpl <em>Ref Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.RefPlaceImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getRefPlace()
		 * @generated
		 */
		EClass REF_PLACE = eINSTANCE.getRefPlace();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_PLACE__REF = eINSTANCE.getRefPlace_Ref();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.RefTransitionImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getRefTransition()
		 * @generated
		 */
		EClass REF_TRANSITION = eINSTANCE.getRefTransition();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_TRANSITION__REF = eINSTANCE.getRefTransition_Ref();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.NameImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__TEXT = eINSTANCE.getName_Text();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Toolspecific</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__TOOLSPECIFIC = eINSTANCE.getLabel_Toolspecific();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__GRAPHICS = eINSTANCE.getLabel_Graphics();

		/**
		 * The meta object literal for the '<em><b>Unknown</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__UNKNOWN = eINSTANCE.getLabel_Unknown();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ArcGraphicsImpl <em>Arc Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ArcGraphicsImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getArcGraphics()
		 * @generated
		 */
		EClass ARC_GRAPHICS = eINSTANCE.getArcGraphics();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_GRAPHICS__LINE = eINSTANCE.getArcGraphics_Line();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_GRAPHICS__POSITION = eINSTANCE.getArcGraphics_Position();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl <em>Node Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getNodeGraphics()
		 * @generated
		 */
		EClass NODE_GRAPHICS = eINSTANCE.getNodeGraphics();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__POSITION = eINSTANCE.getNodeGraphics_Position();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__DIMENSION = eINSTANCE.getNodeGraphics_Dimension();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__LINE = eINSTANCE.getNodeGraphics_Line();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GRAPHICS__FILL = eINSTANCE.getNodeGraphics_Fill();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl <em>Annotation Graphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getAnnotationGraphics()
		 * @generated
		 */
		EClass ANNOTATION_GRAPHICS = eINSTANCE.getAnnotationGraphics();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__FILL = eINSTANCE.getAnnotationGraphics_Fill();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__LINE = eINSTANCE.getAnnotationGraphics_Line();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__OFFSET = eINSTANCE.getAnnotationGraphics_Offset();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_GRAPHICS__FONT = eINSTANCE.getAnnotationGraphics_Font();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SHAPE = eINSTANCE.getLine_Shape();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__COLOR = eINSTANCE.getLine_Color();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__WIDTH = eINSTANCE.getLine_Width();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__STYLE = eINSTANCE.getLine_Style();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.CoordinateImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__X = eINSTANCE.getCoordinate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__Y = eINSTANCE.getCoordinate_Y();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl <em>Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFill()
		 * @generated
		 */
		EClass FILL = eINSTANCE.getFill();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__COLOR = eINSTANCE.getFill_Color();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__IMAGE = eINSTANCE.getFill_Image();

		/**
		 * The meta object literal for the '<em><b>Gradient Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__GRADIENT_COLOR = eINSTANCE.getFill_GradientColor();

		/**
		 * The meta object literal for the '<em><b>Gradientrotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL__GRADIENTROTATION = eINSTANCE.getFill_Gradientrotation();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FAMILY = eINSTANCE.getFont_Family();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__STYLE = eINSTANCE.getFont_Style();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__WEIGHT = eINSTANCE.getFont_Weight();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

		/**
		 * The meta object literal for the '<em><b>Decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__DECORATION = eINSTANCE.getFont_Decoration();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__ALIGN = eINSTANCE.getFont_Align();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__ROTATION = eINSTANCE.getFont_Rotation();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl <em>Petri Net Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPetriNetType()
		 * @generated
		 */
		EClass PETRI_NET_TYPE = eINSTANCE.getPetriNetType();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.EmptyTypeImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getEmptyType()
		 * @generated
		 */
		EClass EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.ToolInfoTextImpl <em>Tool Info Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.ToolInfoTextImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getToolInfoText()
		 * @generated
		 */
		EClass TOOL_INFO_TEXT = eINSTANCE.getToolInfoText();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_INFO_TEXT__INFO = eINSTANCE.getToolInfoText_Info();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.ToolInfo <em>Tool Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.ToolInfo
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getToolInfo()
		 * @generated
		 */
		EClass TOOL_INFO = eINSTANCE.getToolInfo();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_INFO__TOOL = eINSTANCE.getToolInfo_Tool();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_INFO__VERSION = eINSTANCE.getToolInfo_Version();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.ID <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.ID
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID__ID = eINSTANCE.getID_Id();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageLabelProxyImpl <em>Page Label Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PageLabelProxyImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getPageLabelProxy()
		 * @generated
		 */
		EClass PAGE_LABEL_PROXY = eINSTANCE.getPageLabelProxy();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_LABEL_PROXY__TEXT = eINSTANCE.getPageLabelProxy_Text();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_LABEL_PROXY__LABEL = eINSTANCE.getPageLabelProxy_Label();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.AttributeImpl
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em>Line Shape</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLineShape()
		 * @generated
		 */
		EDataType LINE_SHAPE = eINSTANCE.getLineShape();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Line Style</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getLineStyle()
		 * @generated
		 */
		EDataType LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Gradient Rotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getGradientRotation()
		 * @generated
		 */
		EDataType GRADIENT_ROTATION = eINSTANCE.getGradientRotation();

		/**
		 * The meta object literal for the '<em>Font Family</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontFamily()
		 * @generated
		 */
		EDataType FONT_FAMILY = eINSTANCE.getFontFamily();

		/**
		 * The meta object literal for the '<em>Font Style</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontStyle()
		 * @generated
		 */
		EDataType FONT_STYLE = eINSTANCE.getFontStyle();

		/**
		 * The meta object literal for the '<em>Font Weight</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontWeight()
		 * @generated
		 */
		EDataType FONT_WEIGHT = eINSTANCE.getFontWeight();

		/**
		 * The meta object literal for the '<em>Font Decoration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontDecoration()
		 * @generated
		 */
		EDataType FONT_DECORATION = eINSTANCE.getFontDecoration();

		/**
		 * The meta object literal for the '<em>Font Size</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontSize()
		 * @generated
		 */
		EDataType FONT_SIZE = eINSTANCE.getFontSize();

		/**
		 * The meta object literal for the '<em>Font Align</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.helpers.NotImplemented
		 * @see org.pnml.tools.epnk.pnmlcoremodel.impl.PnmlcoremodelPackageImpl#getFontAlign()
		 * @generated
		 */
		EDataType FONT_ALIGN = eINSTANCE.getFontAlign();

	}

} //PnmlcoremodelPackage
