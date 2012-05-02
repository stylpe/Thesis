/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.semanticweb.owlapi.model.OWLOntologyManager;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pragmaticsOntologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ontologyFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ontologyManagerEDataType = null;

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
	public EClass getPlace() {
		return placeEClass;
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
	public EClass getOntologyDocument() {
		return ontologyDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntologyDocument_Iri() {
		return (EAttribute)ontologyDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntologyDocument_Path() {
		return (EAttribute)ontologyDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntologyDocument_Ontology() {
		return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPragmaticsOntology() {
		return pragmaticsOntologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPragmaticsOntology_Documents() {
		return (EReference)pragmaticsOntologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPragmaticsOntology_Net() {
		return (EReference)pragmaticsOntologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPragmaticsOntology_Manager() {
		return (EAttribute)pragmaticsOntologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNet() {
		return petriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Ontology() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntologyMember() {
		return ontologyMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntologyMember_Annotation() {
		return (EReference)ontologyMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOntologyFile() {
		return ontologyFileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOntologyManager() {
		return ontologyManagerEDataType;
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

		placeEClass = createEClass(PLACE);

		pragmaEClass = createEClass(PRAGMA);
		createEAttribute(pragmaEClass, PRAGMA__TEXT);

		ontologyDocumentEClass = createEClass(ONTOLOGY_DOCUMENT);
		createEAttribute(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__IRI);
		createEAttribute(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__PATH);
		createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__ONTOLOGY);

		pragmaticsOntologyEClass = createEClass(PRAGMATICS_ONTOLOGY);
		createEReference(pragmaticsOntologyEClass, PRAGMATICS_ONTOLOGY__DOCUMENTS);
		createEReference(pragmaticsOntologyEClass, PRAGMATICS_ONTOLOGY__NET);
		createEAttribute(pragmaticsOntologyEClass, PRAGMATICS_ONTOLOGY__MANAGER);

		petriNetEClass = createEClass(PETRI_NET);
		createEReference(petriNetEClass, PETRI_NET__ONTOLOGY);

		ontologyMemberEClass = createEClass(ONTOLOGY_MEMBER);
		createEReference(ontologyMemberEClass, ONTOLOGY_MEMBER__ANNOTATION);

		// Create data types
		ontologyFileEDataType = createEDataType(ONTOLOGY_FILE);
		ontologyManagerEDataType = createEDataType(ONTOLOGY_MANAGER);
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
		placeEClass.getESuperTypes().add(this.getOntologyMember());
		pragmaEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		pragmaticsOntologyEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		petriNetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNet());

		// Initialize classes and features; add operations and parameters
		initEClass(pragmaCPNEClass, PragmaCPN.class, "PragmaCPN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pragmaEClass, Pragma.class, "Pragma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPragma_Text(), ecorePackage.getEString(), "text", null, 0, 1, Pragma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologyDocumentEClass, OntologyDocument.class, "OntologyDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologyDocument_Iri(), ecorePackage.getEString(), "iri", null, 0, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologyDocument_Path(), ecorePackage.getEString(), "path", null, 0, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntologyDocument_Ontology(), this.getPragmaticsOntology(), this.getPragmaticsOntology_Documents(), "ontology", null, 0, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pragmaticsOntologyEClass, PragmaticsOntology.class, "PragmaticsOntology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPragmaticsOntology_Documents(), this.getOntologyDocument(), this.getOntologyDocument_Ontology(), "documents", null, 0, -1, PragmaticsOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPragmaticsOntology_Net(), this.getPetriNet(), this.getPetriNet_Ontology(), "net", null, 0, 1, PragmaticsOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPragmaticsOntology_Manager(), this.getOntologyManager(), "manager", "", 0, 1, PragmaticsOntology.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(pragmaticsOntologyEClass, null, "addOntologyFromFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOntologyFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pragmaticsOntologyEClass, null, "getValidPragmatics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOntologyMember(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petriNetEClass, PetriNet.class, "PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNet_Ontology(), this.getPragmaticsOntology(), this.getPragmaticsOntology_Net(), "ontology", null, 0, 1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologyMemberEClass, OntologyMember.class, "OntologyMember", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologyMember_Annotation(), this.getPragma(), null, "Annotation", null, 0, -1, OntologyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ontologyMemberEClass, null, "getOWLClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(ontologyFileEDataType, IFile.class, "OntologyFile", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ontologyManagerEDataType, OWLOntologyManager.class, "OntologyManager", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// EAnnotation0
		createEAnnotation0Annotations();
	}

	/**
	 * Initializes the annotations for <b>EAnnotation0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEAnnotation0Annotations() {
		String source = "EAnnotation0";		
		addAnnotation
		  (pragmaCPNEClass, 
		   source, 
		   new String[] {
		   });
	}

} //PragmacpndefinitionPackageImpl
