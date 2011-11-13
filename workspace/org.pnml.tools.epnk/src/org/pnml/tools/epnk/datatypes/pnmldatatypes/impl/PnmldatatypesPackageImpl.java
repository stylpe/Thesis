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
package org.pnml.tools.epnk.datatypes.pnmldatatypes.impl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesFactory;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesPackage;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PnmldatatypesPackageImpl extends EPackageImpl implements PnmldatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeIntegerEDataType = null;

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
	 * @see org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PnmldatatypesPackageImpl() {
		super(eNS_URI, PnmldatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PnmldatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PnmldatatypesPackage init() {
		if (isInited) return (PnmldatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(PnmldatatypesPackage.eNS_URI);

		// Obtain or create and register package
		PnmldatatypesPackageImpl thePnmldatatypesPackage = (PnmldatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PnmldatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PnmldatatypesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePnmldatatypesPackage.createPackageContents();

		// Initialize created meta-data
		thePnmldatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePnmldatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PnmldatatypesPackage.eNS_URI, thePnmldatatypesPackage);
		return thePnmldatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveInteger() {
		return positiveIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeInteger() {
		return nonNegativeIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnmldatatypesFactory getPnmldatatypesFactory() {
		return (PnmldatatypesFactory)getEFactoryInstance();
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

		// Create data types
		positiveIntegerEDataType = createEDataType(POSITIVE_INTEGER);
		nonNegativeIntegerEDataType = createEDataType(NON_NEGATIVE_INTEGER);
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

		// Initialize data types
		initEDataType(positiveIntegerEDataType, PositiveInteger.class, "PositiveInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonNegativeIntegerEDataType, NonNegativeInteger.class, "NonNegativeInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PnmldatatypesPackageImpl
