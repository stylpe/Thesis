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
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Page;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlpngdefinitionPackageImpl extends EPackageImpl implements HlpngdefinitionPackage {
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
	private EClass transitionEClass = null;

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
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlpngEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hlpngKindEEnum = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HlpngdefinitionPackageImpl() {
		super(eNS_URI, HlpngdefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HlpngdefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HlpngdefinitionPackage init() {
		if (isInited) return (HlpngdefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(HlpngdefinitionPackage.eNS_URI);

		// Obtain or create and register package
		HlpngdefinitionPackageImpl theHlpngdefinitionPackage = (HlpngdefinitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HlpngdefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HlpngdefinitionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TermsPackage.eINSTANCE.eClass();
		DotsPackage.eINSTANCE.eClass();
		MultisetsPackage.eINSTANCE.eClass();
		BooleansPackage.eINSTANCE.eClass();
		IntegersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHlpngdefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theHlpngdefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHlpngdefinitionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HlpngdefinitionPackage.eNS_URI, theHlpngdefinitionPackage);
		return theHlpngdefinitionPackage;
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
	public EReference getPlace_Type() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_HlinitialMarking() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Condition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
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
	public EReference getArc_Hlinscription() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Declaration() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Structure() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLMarking() {
		return hlMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHLMarking_Structure() {
		return (EReference)hlMarkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Structure() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLAnnotation() {
		return hlAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHLAnnotation_Structure() {
		return (EReference)hlAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Structure() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLPNG() {
		return hlpngEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHLPNG_Kind() {
		return (EAttribute)hlpngEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHLPNGKind() {
		return hlpngKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlpngdefinitionFactory getHlpngdefinitionFactory() {
		return (HlpngdefinitionFactory)getEFactoryInstance();
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
		createEReference(placeEClass, PLACE__TYPE);
		createEReference(placeEClass, PLACE__HLINITIAL_MARKING);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__CONDITION);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__HLINSCRIPTION);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__DECLARATION);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__STRUCTURE);

		hlMarkingEClass = createEClass(HL_MARKING);
		createEReference(hlMarkingEClass, HL_MARKING__STRUCTURE);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__STRUCTURE);

		hlAnnotationEClass = createEClass(HL_ANNOTATION);
		createEReference(hlAnnotationEClass, HL_ANNOTATION__STRUCTURE);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__STRUCTURE);

		hlpngEClass = createEClass(HLPNG);
		createEAttribute(hlpngEClass, HLPNG__KIND);

		// Create enums
		hlpngKindEEnum = createEEnum(HLPNG_KIND);
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
		StructuredpntypemodelPackage theStructuredpntypemodelPackage = (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		pageEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPage());
		typeEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		hlMarkingEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		conditionEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		hlAnnotationEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		declarationEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		hlpngEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredPetriNetType());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlace_Type(), this.getType(), null, "type", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPlace_HlinitialMarking(), this.getHLMarking(), null, "hlinitialMarking", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTransition_Condition(), this.getCondition(), null, "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArc_Hlinscription(), this.getHLAnnotation(), null, "hlinscription", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPage_Declaration(), this.getDeclaration(), null, "declaration", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getType_Structure(), theTermsPackage.getSort(), null, "structure", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hlMarkingEClass, HLMarking.class, "HLMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHLMarking_Structure(), theTermsPackage.getTerm(), null, "structure", null, 0, 1, HLMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCondition_Structure(), theTermsPackage.getTerm(), null, "structure", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hlAnnotationEClass, HLAnnotation.class, "HLAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHLAnnotation_Structure(), theTermsPackage.getTerm(), null, "structure", null, 0, 1, HLAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDeclaration_Structure(), theTermsPackage.getDeclarations(), null, "structure", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hlpngEClass, org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG.class, "HLPNG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHLPNG_Kind(), this.getHLPNGKind(), "kind", null, 1, 1, org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(hlpngKindEEnum, HLPNGKind.class, "HLPNGKind"); //$NON-NLS-1$
		addEEnumLiteral(hlpngKindEEnum, HLPNGKind.FULL);
		addEEnumLiteral(hlpngKindEEnum, HLPNGKind.SN);
		addEEnumLiteral(hlpngKindEEnum, HLPNGKind.PTN);

		// Create resource
		createResource(eNS_URI);
	}

} //HlpngdefinitionPackageImpl
