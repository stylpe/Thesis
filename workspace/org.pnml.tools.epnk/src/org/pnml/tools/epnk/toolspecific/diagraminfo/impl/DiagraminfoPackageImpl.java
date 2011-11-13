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
package org.pnml.tools.epnk.toolspecific.diagraminfo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmf.runtime.notation.NotationPackage;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoFactory;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagraminfoPackageImpl extends EPackageImpl implements DiagraminfoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramInfoEClass = null;

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
	 * @see org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagraminfoPackageImpl() {
		super(eNS_URI, DiagraminfoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DiagraminfoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagraminfoPackage init() {
		if (isInited) return (DiagraminfoPackage)EPackage.Registry.INSTANCE.getEPackage(DiagraminfoPackage.eNS_URI);

		// Obtain or create and register package
		DiagraminfoPackageImpl theDiagraminfoPackage = (DiagraminfoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiagraminfoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiagraminfoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NotationPackage.eINSTANCE.eClass();
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDiagraminfoPackage.createPackageContents();

		// Initialize created meta-data
		theDiagraminfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagraminfoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagraminfoPackage.eNS_URI, theDiagraminfoPackage);
		return theDiagraminfoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramInfo() {
		return diagramInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramInfo_PageLabelProxy() {
		return (EReference)diagramInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramInfo_Diagram() {
		return (EReference)diagramInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramInfo_LabelProxy() {
		return (EReference)diagramInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagraminfoFactory getDiagraminfoFactory() {
		return (DiagraminfoFactory)getEFactoryInstance();
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
		diagramInfoEClass = createEClass(DIAGRAM_INFO);
		createEReference(diagramInfoEClass, DIAGRAM_INFO__PAGE_LABEL_PROXY);
		createEReference(diagramInfoEClass, DIAGRAM_INFO__DIAGRAM);
		createEReference(diagramInfoEClass, DIAGRAM_INFO__LABEL_PROXY);
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
		NotationPackage theNotationPackage = (NotationPackage)EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramInfoEClass.getESuperTypes().add(thePnmlcoremodelPackage.getToolInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(diagramInfoEClass, DiagramInfo.class, "DiagramInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramInfo_PageLabelProxy(), thePnmlcoremodelPackage.getPageLabelProxy(), null, "pageLabelProxy", null, 0, -1, DiagramInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramInfo_Diagram(), theNotationPackage.getDiagram(), null, "diagram", null, 0, 1, DiagramInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramInfo_LabelProxy(), thePnmlcoremodelPackage.getLabelProxy(), null, "labelProxy", null, 0, -1, DiagramInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DiagraminfoPackageImpl
