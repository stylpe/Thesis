/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PragmacpndefinitionPackageImpl extends EPackageImpl implements PragmacpndefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pragmaCPNEClass = null;

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
	private EClass pragmaEClass = null;

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
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PragmacpndefinitionPackageImpl() {
		super(eNS_URI, PragmacpndefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PragmacpndefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PragmacpndefinitionPackage init() {
		if (isInited) return (PragmacpndefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(PragmacpndefinitionPackage.eNS_URI);

		// Obtain or create and register package
		PragmacpndefinitionPackageImpl thePragmacpndefinitionPackage = (PragmacpndefinitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PragmacpndefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PragmacpndefinitionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CpndefinitionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePragmacpndefinitionPackage.createPackageContents();

		// Initialize created meta-data
		thePragmacpndefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePragmacpndefinitionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PragmacpndefinitionPackage.eNS_URI, thePragmacpndefinitionPackage);
		return thePragmacpndefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPragmaCPN() {
		return pragmaCPNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPragmaCPN_LoadedPragmaSets() {
		return (EAttribute)pragmaCPNEClass.getEStructuralFeatures().get(0);
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
	public EReference getPlace_Annotation() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPragma() {
		return pragmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPragma_Text() {
		return (EAttribute)pragmaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmacpndefinitionFactory getPragmacpndefinitionFactory() {
		return (PragmacpndefinitionFactory)getEFactoryInstance();
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
		pragmaCPNEClass = createEClass(PRAGMA_CPN);
		createEAttribute(pragmaCPNEClass, PRAGMA_CPN__LOADED_PRAGMA_SETS);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__ANNOTATION);

		pragmaEClass = createEClass(PRAGMA);
		createEAttribute(pragmaEClass, PRAGMA__TEXT);
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
		CpndefinitionPackage theCpndefinitionPackage = (CpndefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(CpndefinitionPackage.eNS_URI);
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pragmaCPNEClass.getESuperTypes().add(theCpndefinitionPackage.getCPN());
		placeEClass.getESuperTypes().add(theCpndefinitionPackage.getPlace());
		pragmaEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());

		// Initialize classes and features; add operations and parameters
		initEClass(pragmaCPNEClass, PragmaCPN.class, "PragmaCPN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPragmaCPN_LoadedPragmaSets(), ecorePackage.getEString(), "LoadedPragmaSets", null, 0, -1, PragmaCPN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Annotation(), this.getPragma(), null, "Annotation", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pragmaEClass, Pragma.class, "Pragma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPragma_Text(), ecorePackage.getEString(), "text", null, 0, 1, Pragma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PragmacpndefinitionPackageImpl
