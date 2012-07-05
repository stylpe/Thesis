/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.ArcExpression;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPNInscription;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Colourset;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.ArcInscription;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Guard;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.InitialMarking;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Page;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Sort;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition;
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
public class CpndefinitionPackageImpl extends EPackageImpl implements CpndefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpnEClass = null;

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
	private EClass transitionEClass = null;

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
	private EClass arcExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpnInscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

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
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CpndefinitionPackageImpl() {
		super(eNS_URI, CpndefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CpndefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CpndefinitionPackage init() {
		if (isInited) return (CpndefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(CpndefinitionPackage.eNS_URI);

		// Obtain or create and register package
		CpndefinitionPackageImpl theCpndefinitionPackage = (CpndefinitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CpndefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CpndefinitionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCpndefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theCpndefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCpndefinitionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CpndefinitionPackage.eNS_URI, theCpndefinitionPackage);
		return theCpndefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPN() {
		return cpnEClass;
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
	public EReference getPlace_Sort() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
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
	public EReference getArc_Expression() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
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
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_IsSubstitutionTransition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
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
	public EClass getArcExpression() {
		return arcExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPNInscription() {
		return cpnInscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPNInscription_Text() {
		return (EAttribute)cpnInscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialMarking() {
		return initialMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpndefinitionFactory getCpndefinitionFactory() {
		return (CpndefinitionFactory)getEFactoryInstance();
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
		cpnEClass = createEClass(CPN);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__INITIAL_MARKING);
		createEReference(placeEClass, PLACE__SORT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__EXPRESSION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEAttribute(transitionEClass, TRANSITION__IS_SUBSTITUTION_TRANSITION);

		pageEClass = createEClass(PAGE);

		arcExpressionEClass = createEClass(ARC_EXPRESSION);

		cpnInscriptionEClass = createEClass(CPN_INSCRIPTION);
		createEAttribute(cpnInscriptionEClass, CPN_INSCRIPTION__TEXT);

		guardEClass = createEClass(GUARD);

		initialMarkingEClass = createEClass(INITIAL_MARKING);

		sortEClass = createEClass(SORT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cpnEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		pageEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPage());
		arcExpressionEClass.getESuperTypes().add(this.getCPNInscription());
		cpnInscriptionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		guardEClass.getESuperTypes().add(this.getCPNInscription());
		initialMarkingEClass.getESuperTypes().add(this.getCPNInscription());
		sortEClass.getESuperTypes().add(this.getCPNInscription());

		// Initialize classes and features; add operations and parameters
		initEClass(cpnEClass, org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN.class, "CPN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_InitialMarking(), this.getInitialMarking(), null, "initialMarking", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Sort(), this.getSort(), null, "sort", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Expression(), this.getArcExpression(), null, "expression", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Guard(), this.getGuard(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_IsSubstitutionTransition(), ecorePackage.getEBoolean(), "isSubstitutionTransition", "false", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcExpressionEClass, ArcExpression.class, "ArcExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cpnInscriptionEClass, CPNInscription.class, "CPNInscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPNInscription_Text(), ecorePackage.getEString(), "text", null, 0, 1, CPNInscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialMarkingEClass, InitialMarking.class, "InitialMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortEClass, Sort.class, "Sort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CpndefinitionPackageImpl
