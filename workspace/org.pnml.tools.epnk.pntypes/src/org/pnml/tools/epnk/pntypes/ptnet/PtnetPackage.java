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
package org.pnml.tools.epnk.pntypes.ptnet;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetFactory
 * @model kind="package"
 * @generated
 */
public interface PtnetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ptnet"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/ptnet"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ptnet"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PtnetPackage eINSTANCE = org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PlaceImpl
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPlace()
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
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_MARKING = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.ArcImpl
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 1;

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
	 * The feature id for the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__INSCRIPTION = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PTMarkingImpl <em>PT Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PTMarkingImpl
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPTMarking()
	 * @generated
	 */
	int PT_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PT Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_MARKING_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PTArcAnnotationImpl <em>PT Arc Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PTArcAnnotationImpl
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPTArcAnnotation()
	 * @generated
	 */
	int PT_ARC_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PT Arc Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_ARC_ANNOTATION_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PTNetImpl <em>PT Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PTNetImpl
	 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPTNet()
	 * @generated
	 */
	int PT_NET = 4;

	/**
	 * The number of structural features of the '<em>PT Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_NET_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.ptnet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.ptnet.Place#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.Place#getInitialMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_InitialMarking();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.ptnet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.pntypes.ptnet.Arc#getInscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inscription</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.Arc#getInscription()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Inscription();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.ptnet.PTMarking <em>PT Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Marking</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PTMarking
	 * @generated
	 */
	EClass getPTMarking();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.ptnet.PTMarking#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PTMarking#getText()
	 * @see #getPTMarking()
	 * @generated
	 */
	EAttribute getPTMarking_Text();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation <em>PT Arc Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Arc Annotation</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation
	 * @generated
	 */
	EClass getPTArcAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation#getText()
	 * @see #getPTArcAnnotation()
	 * @generated
	 */
	EAttribute getPTArcAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.ptnet.PTNet <em>PT Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Net</em>'.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PTNet
	 * @generated
	 */
	EClass getPTNet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PtnetFactory getPtnetFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PlaceImpl
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INITIAL_MARKING = eINSTANCE.getPlace_InitialMarking();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.ArcImpl
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Inscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__INSCRIPTION = eINSTANCE.getArc_Inscription();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PTMarkingImpl <em>PT Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PTMarkingImpl
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPTMarking()
		 * @generated
		 */
		EClass PT_MARKING = eINSTANCE.getPTMarking();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_MARKING__TEXT = eINSTANCE.getPTMarking_Text();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PTArcAnnotationImpl <em>PT Arc Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PTArcAnnotationImpl
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPTArcAnnotation()
		 * @generated
		 */
		EClass PT_ARC_ANNOTATION = eINSTANCE.getPTArcAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_ARC_ANNOTATION__TEXT = eINSTANCE.getPTArcAnnotation_Text();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.ptnet.impl.PTNetImpl <em>PT Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PTNetImpl
		 * @see org.pnml.tools.epnk.pntypes.ptnet.impl.PtnetPackageImpl#getPTNet()
		 * @generated
		 */
		EClass PT_NET = eINSTANCE.getPTNet();

	}

} //PtnetPackage
