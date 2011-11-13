/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.DeclAssoc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.SortAssoc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.TermAssoc;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.VariableDeclAssoc;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.serialisation.SerialisationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlpngserialisationPackageImpl extends EPackageImpl implements HlpngserialisationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclAssocEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HlpngserialisationPackageImpl() {
		super(eNS_URI, HlpngserialisationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HlpngserialisationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HlpngserialisationPackage init() {
		if (isInited) return (HlpngserialisationPackage)EPackage.Registry.INSTANCE.getEPackage(HlpngserialisationPackage.eNS_URI);

		// Obtain or create and register package
		HlpngserialisationPackageImpl theHlpngserialisationPackage = (HlpngserialisationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HlpngserialisationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HlpngserialisationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TermsPackage.eINSTANCE.eClass();
		DotsPackage.eINSTANCE.eClass();
		MultisetsPackage.eINSTANCE.eClass();
		BooleansPackage.eINSTANCE.eClass();
		IntegersPackage.eINSTANCE.eClass();
		SerialisationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHlpngserialisationPackage.createPackageContents();

		// Initialize created meta-data
		theHlpngserialisationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHlpngserialisationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HlpngserialisationPackage.eNS_URI, theHlpngserialisationPackage);
		return theHlpngserialisationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortAssoc() {
		return sortAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclAssoc() {
		return declAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermAssoc() {
		return termAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclAssoc() {
		return variableDeclAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlpngserialisationFactory getHlpngserialisationFactory() {
		return (HlpngserialisationFactory)getEFactoryInstance();
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
		sortAssocEClass = createEClass(SORT_ASSOC);

		declAssocEClass = createEClass(DECL_ASSOC);

		termAssocEClass = createEClass(TERM_ASSOC);

		variableDeclAssocEClass = createEClass(VARIABLE_DECL_ASSOC);
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
		SerialisationPackage theSerialisationPackage = (SerialisationPackage)EPackage.Registry.INSTANCE.getEPackage(SerialisationPackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sortAssocEClass.getESuperTypes().add(theSerialisationPackage.getAssocClass());
		sortAssocEClass.getESuperTypes().add(theTermsPackage.getSort());
		declAssocEClass.getESuperTypes().add(theSerialisationPackage.getAssocClass());
		declAssocEClass.getESuperTypes().add(theTermsPackage.getDeclarations());
		termAssocEClass.getESuperTypes().add(theSerialisationPackage.getAssocClass());
		termAssocEClass.getESuperTypes().add(theTermsPackage.getTerm());
		variableDeclAssocEClass.getESuperTypes().add(theSerialisationPackage.getAssocClass());
		variableDeclAssocEClass.getESuperTypes().add(theTermsPackage.getVariableDecl());

		// Initialize classes and features; add operations and parameters
		initEClass(sortAssocEClass, SortAssoc.class, "SortAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declAssocEClass, DeclAssoc.class, "DeclAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termAssocEClass, TermAssoc.class, "TermAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclAssocEClass, VariableDeclAssoc.class, "VariableDeclAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HlpngserialisationPackageImpl
