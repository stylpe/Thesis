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
package org.pnml.tools.epnk.pntypes.ptnet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesPackage;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.ptnet.Arc;
import org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation;
import org.pnml.tools.epnk.pntypes.ptnet.PTMarking;
import org.pnml.tools.epnk.pntypes.ptnet.PTNet;
import org.pnml.tools.epnk.pntypes.ptnet.Place;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetFactory;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetPackageImpl extends EPackageImpl implements PtnetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptArcAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetPackageImpl() {
		super(eNS_URI, PtnetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PtnetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetPackage init() {
		if (isInited) return (PtnetPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetPackage.eNS_URI);

		// Obtain or create and register package
		PtnetPackageImpl thePtnetPackage = (PtnetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PtnetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PtnetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();
		PnmldatatypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePtnetPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetPackage.eNS_URI, thePtnetPackage);
		return thePtnetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_InitialMarking() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Inscription() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTMarking() {
		return ptMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTMarking_Text() {
		return (EAttribute)ptMarkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTArcAnnotation() {
		return ptArcAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTArcAnnotation_Text() {
		return (EAttribute)ptArcAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTNet() {
		return ptNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetFactory getPtnetFactory() {
		return (PtnetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__INITIAL_MARKING);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__INSCRIPTION);

		ptMarkingEClass = createEClass(PT_MARKING);
		createEAttribute(ptMarkingEClass, PT_MARKING__TEXT);

		ptArcAnnotationEClass = createEClass(PT_ARC_ANNOTATION);
		createEAttribute(ptArcAnnotationEClass, PT_ARC_ANNOTATION__TEXT);

		ptNetEClass = createEClass(PT_NET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);
		PnmldatatypesPackage thePnmldatatypesPackage = (PnmldatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(PnmldatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		ptMarkingEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		ptArcAnnotationEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		ptNetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlace_InitialMarking(), this.getPTMarking(), null, "initialMarking", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArc_Inscription(), this.getPTArcAnnotation(), null, "inscription", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ptMarkingEClass, PTMarking.class, "PTMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPTMarking_Text(), thePnmldatatypesPackage.getNonNegativeInteger(), "text", "0", 1, 1, PTMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(ptArcAnnotationEClass, PTArcAnnotation.class, "PTArcAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPTArcAnnotation_Text(), thePnmldatatypesPackage.getPositiveInteger(), "text", "1", 1, 1, PTArcAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(ptNetEClass, PTNet.class, "PTNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //PtnetPackageImpl
