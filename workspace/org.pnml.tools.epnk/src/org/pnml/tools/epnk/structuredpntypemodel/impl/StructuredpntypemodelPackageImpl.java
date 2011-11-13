/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.structuredpntypemodel.Linker;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelFactory;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredpntypemodelPackageImpl extends EPackageImpl implements StructuredpntypemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredPetriNetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolUseMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolUseEClass = null;

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
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuredpntypemodelPackageImpl() {
		super(eNS_URI, StructuredpntypemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructuredpntypemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuredpntypemodelPackage init() {
		if (isInited) return (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);

		// Obtain or create and register package
		StructuredpntypemodelPackageImpl theStructuredpntypemodelPackage = (StructuredpntypemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructuredpntypemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructuredpntypemodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStructuredpntypemodelPackage.createPackageContents();

		// Initialize created meta-data
		theStructuredpntypemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructuredpntypemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuredpntypemodelPackage.eNS_URI, theStructuredpntypemodelPackage);
		return theStructuredpntypemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredPetriNetType() {
		return structuredPetriNetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredLabel() {
		return structuredLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredLabel_Text() {
		return (EAttribute)structuredLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinker() {
		return linkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolUseMapping() {
		return symbolUseMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolDef() {
		return symbolDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolDef_Name() {
		return (EAttribute)symbolDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolUse() {
		return symbolUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolUse_Name() {
		return (EAttribute)symbolUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredpntypemodelFactory getStructuredpntypemodelFactory() {
		return (StructuredpntypemodelFactory)getEFactoryInstance();
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
		structuredPetriNetTypeEClass = createEClass(STRUCTURED_PETRI_NET_TYPE);

		structuredLabelEClass = createEClass(STRUCTURED_LABEL);
		createEAttribute(structuredLabelEClass, STRUCTURED_LABEL__TEXT);

		linkerEClass = createEClass(LINKER);

		symbolUseMappingEClass = createEClass(SYMBOL_USE_MAPPING);

		symbolDefEClass = createEClass(SYMBOL_DEF);
		createEAttribute(symbolDefEClass, SYMBOL_DEF__NAME);

		symbolUseEClass = createEClass(SYMBOL_USE);
		createEAttribute(symbolUseEClass, SYMBOL_USE__NAME);
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
		structuredPetriNetTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		structuredLabelEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		symbolDefEClass.getESuperTypes().add(thePnmlcoremodelPackage.getID());

		// Initialize classes and features; add operations and parameters
		initEClass(structuredPetriNetTypeEClass, StructuredPetriNetType.class, "StructuredPetriNetType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(structuredPetriNetTypeEClass, this.getLinker(), "getLinker", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(structuredLabelEClass, StructuredLabel.class, "StructuredLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, StructuredLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(structuredLabelEClass, ecorePackage.getEReference(), "getStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(structuredLabelEClass, ecorePackage.getEObject(), "parse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkerEClass, Linker.class, "Linker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(linkerEClass, this.getSymbolUseMapping(), "getglobalLinks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePnmlcoremodelPackage.getPetriNet(), "petrinet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(symbolUseMappingEClass, SymbolUseMapping.class, "SymbolUseMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(symbolUseMappingEClass, this.getSymbolUse(), "getSymbolUses", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(symbolUseMappingEClass, this.getSymbolDef(), "getSymbolDef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSymbolUse(), "symbolUse", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(symbolDefEClass, SymbolDef.class, "SymbolDef", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, SymbolDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolUseEClass, SymbolUse.class, "SymbolUse", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolUse_Name(), ecorePackage.getEString(), "name", null, 0, 1, SymbolUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(symbolUseEClass, ecorePackage.getEReference(), "getRefFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StructuredpntypemodelPackageImpl
