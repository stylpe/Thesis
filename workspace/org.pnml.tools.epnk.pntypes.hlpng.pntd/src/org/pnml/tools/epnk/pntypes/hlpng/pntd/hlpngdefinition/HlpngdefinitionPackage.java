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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

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
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface HlpngdefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hlpngdefinition"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/pntypes/hlpng/pntd/hlpng"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hlpngdefinition"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlpngdefinitionPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PlaceImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PnmlcoremodelPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PnmlcoremodelPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = PnmlcoremodelPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = PnmlcoremodelPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = PnmlcoremodelPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = PnmlcoremodelPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hlinitial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__HLINITIAL_MARKING = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TransitionImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = PnmlcoremodelPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PnmlcoremodelPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOOLSPECIFIC = PnmlcoremodelPackage.TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GRAPHICS = PnmlcoremodelPackage.TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNKNOWN = PnmlcoremodelPackage.TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = PnmlcoremodelPackage.TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = PnmlcoremodelPackage.TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ArcImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PnmlcoremodelPackage.ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PnmlcoremodelPackage.ARC__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = PnmlcoremodelPackage.ARC__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = PnmlcoremodelPackage.ARC__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = PnmlcoremodelPackage.ARC__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PnmlcoremodelPackage.ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PnmlcoremodelPackage.ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Hlinscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__HLINSCRIPTION = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PageImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = PnmlcoremodelPackage.PAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = PnmlcoremodelPackage.PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOLSPECIFIC = PnmlcoremodelPackage.PAGE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GRAPHICS = PnmlcoremodelPackage.PAGE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNKNOWN = PnmlcoremodelPackage.PAGE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OBJECT = PnmlcoremodelPackage.PAGE__OBJECT;

	/**
	 * The feature id for the '<em><b>Page Label Proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_LABEL_PROXY = PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY;

	/**
	 * The feature id for the '<em><b>Labelproxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LABELPROXY = PnmlcoremodelPackage.PAGE__LABELPROXY;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DECLARATION = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TypeImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLMarkingImpl <em>HL Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLMarkingImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLMarking()
	 * @generated
	 */
	int HL_MARKING = 5;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HL Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_MARKING_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ConditionImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLAnnotationImpl <em>HL Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLAnnotationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLAnnotation()
	 * @generated
	 */
	int HL_ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HL Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HL_ANNOTATION_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.DeclarationImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLPNGImpl <em>HLPNG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLPNGImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLPNG()
	 * @generated
	 */
	int HLPNG = 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPNG__KIND = StructuredpntypemodelPackage.STRUCTURED_PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HLPNG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPNG_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_PETRI_NET_TYPE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind <em>HLPNG Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLPNGKind()
	 * @generated
	 */
	int HLPNG_KIND = 10;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getHlinitialMarking <em>Hlinitial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hlinitial Marking</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place#getHlinitialMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_HlinitialMarking();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc#getHlinscription <em>Hlinscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hlinscription</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc#getHlinscription()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Hlinscription();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Page#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Page#getDeclaration()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Declaration();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type#getStructure()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Structure();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking <em>HL Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HL Marking</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking
	 * @generated
	 */
	EClass getHLMarking();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking#getStructure()
	 * @see #getHLMarking()
	 * @generated
	 */
	EReference getHLMarking_Structure();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition#getStructure()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Structure();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation <em>HL Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HL Annotation</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation
	 * @generated
	 */
	EClass getHLAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation#getStructure()
	 * @see #getHLAnnotation()
	 * @generated
	 */
	EReference getHLAnnotation_Structure();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration#getStructure()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Structure();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG <em>HLPNG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLPNG</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG
	 * @generated
	 */
	EClass getHLPNG();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG#getKind()
	 * @see #getHLPNG()
	 * @generated
	 */
	EAttribute getHLPNG_Kind();

	/**
	 * Returns the meta object for enum '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind <em>HLPNG Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HLPNG Kind</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind
	 * @generated
	 */
	EEnum getHLPNGKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HlpngdefinitionFactory getHlpngdefinitionFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PlaceImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '<em><b>Hlinitial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__HLINITIAL_MARKING = eINSTANCE.getPlace_HlinitialMarking();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TransitionImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ArcImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Hlinscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__HLINSCRIPTION = eINSTANCE.getArc_Hlinscription();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PageImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__DECLARATION = eINSTANCE.getPage_Declaration();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.TypeImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__STRUCTURE = eINSTANCE.getType_Structure();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLMarkingImpl <em>HL Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLMarkingImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLMarking()
		 * @generated
		 */
		EClass HL_MARKING = eINSTANCE.getHLMarking();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HL_MARKING__STRUCTURE = eINSTANCE.getHLMarking_Structure();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ConditionImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__STRUCTURE = eINSTANCE.getCondition_Structure();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLAnnotationImpl <em>HL Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLAnnotationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLAnnotation()
		 * @generated
		 */
		EClass HL_ANNOTATION = eINSTANCE.getHLAnnotation();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HL_ANNOTATION__STRUCTURE = eINSTANCE.getHLAnnotation_Structure();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.DeclarationImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__STRUCTURE = eINSTANCE.getDeclaration_Structure();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLPNGImpl <em>HLPNG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLPNGImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLPNG()
		 * @generated
		 */
		EClass HLPNG = eINSTANCE.getHLPNG();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HLPNG__KIND = eINSTANCE.getHLPNG_Kind();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind <em>HLPNG Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HlpngdefinitionPackageImpl#getHLPNGKind()
		 * @generated
		 */
		EEnum HLPNG_KIND = eINSTANCE.getHLPNGKind();

	}

} //HlpngdefinitionPackage
