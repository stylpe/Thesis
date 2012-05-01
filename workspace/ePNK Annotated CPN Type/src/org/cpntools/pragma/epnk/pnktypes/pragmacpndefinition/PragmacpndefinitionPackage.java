/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface PragmacpndefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pragmacpndefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pragmacpndefinition/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pragmacpndefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PragmacpndefinitionPackage eINSTANCE = org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaCPNImpl <em>Pragma CPN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaCPNImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPragmaCPN()
	 * @generated
	 */
	int PRAGMA_CPN = 0;

	/**
	 * The number of structural features of the '<em>Pragma CPN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_CPN_FEATURE_COUNT = CpndefinitionPackage.CPN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PlaceImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = CpndefinitionPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = CpndefinitionPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = CpndefinitionPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = CpndefinitionPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = CpndefinitionPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = CpndefinitionPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = CpndefinitionPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_MARKING = CpndefinitionPackage.PLACE__INITIAL_MARKING;

	/**
	 * The feature id for the '<em><b>Colorset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__COLORSET = CpndefinitionPackage.PLACE__COLORSET;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ANNOTATION = CpndefinitionPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = CpndefinitionPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaImpl <em>Pragma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPragma()
	 * @generated
	 */
	int PRAGMA = 2;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pragma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.OntologyDocumentImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getOntologyDocument()
	 * @generated
	 */
	int ONTOLOGY_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOCUMENT__IRI = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOCUMENT__PATH = 1;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOCUMENT__ONTOLOGY = 2;

	/**
	 * The number of structural features of the '<em>Ontology Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaticsOntologyImpl <em>Pragmatics Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaticsOntologyImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPragmaticsOntology()
	 * @generated
	 */
	int PRAGMATICS_ONTOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_ONTOLOGY__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_ONTOLOGY__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_ONTOLOGY__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_ONTOLOGY__DOCUMENTS = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_ONTOLOGY__NET = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_ONTOLOGY__MANAGER = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pragmatics Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_ONTOLOGY_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PetriNetImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ID = PnmlcoremodelPackage.PETRI_NET__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TYPE = PnmlcoremodelPackage.PETRI_NET__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = PnmlcoremodelPackage.PETRI_NET__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PAGE = PnmlcoremodelPackage.PETRI_NET__PAGE;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TOOLSPECIFIC = PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__UNKNOWN = PnmlcoremodelPackage.PETRI_NET__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ONTOLOGY = PnmlcoremodelPackage.PETRI_NET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Ontology File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getOntologyFile()
	 * @generated
	 */
	int ONTOLOGY_FILE = 6;


	/**
	 * The meta object id for the '<em>Ontology Manager</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.semanticweb.owlapi.model.OWLOntologyManager
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getOntologyManager()
	 * @generated
	 */
	int ONTOLOGY_MANAGER = 7;


	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN <em>Pragma CPN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragma CPN</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN
	 * @generated
	 */
	EClass getPragmaCPN();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place#getAnnotation()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Annotation();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma <em>Pragma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragma</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma
	 * @generated
	 */
	EClass getPragma();

	/**
	 * Returns the meta object for the attribute '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma#getText()
	 * @see #getPragma()
	 * @generated
	 */
	EAttribute getPragma_Text();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument <em>Ontology Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Document</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument
	 * @generated
	 */
	EClass getOntologyDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getIri()
	 * @see #getOntologyDocument()
	 * @generated
	 */
	EAttribute getOntologyDocument_Iri();

	/**
	 * Returns the meta object for the attribute '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getPath()
	 * @see #getOntologyDocument()
	 * @generated
	 */
	EAttribute getOntologyDocument_Path();

	/**
	 * Returns the meta object for the container reference '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ontology</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getOntology()
	 * @see #getOntologyDocument()
	 * @generated
	 */
	EReference getOntologyDocument_Ontology();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology <em>Pragmatics Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragmatics Ontology</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology
	 * @generated
	 */
	EClass getPragmaticsOntology();

	/**
	 * Returns the meta object for the containment reference list '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getDocuments()
	 * @see #getPragmaticsOntology()
	 * @generated
	 */
	EReference getPragmaticsOntology_Documents();

	/**
	 * Returns the meta object for the container reference '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Net</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getNet()
	 * @see #getPragmaticsOntology()
	 * @generated
	 */
	EReference getPragmaticsOntology_Net();

	/**
	 * Returns the meta object for the attribute '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getManager()
	 * @see #getPragmaticsOntology()
	 * @generated
	 */
	EAttribute getPragmaticsOntology_Manager();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ontology</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet#getOntology()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Ontology();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>Ontology File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ontology File</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile" serializeable="false"
	 * @generated
	 */
	EDataType getOntologyFile();

	/**
	 * Returns the meta object for data type '{@link org.semanticweb.owlapi.model.OWLOntologyManager <em>Ontology Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ontology Manager</em>'.
	 * @see org.semanticweb.owlapi.model.OWLOntologyManager
	 * @model instanceClass="org.semanticweb.owlapi.model.OWLOntologyManager" serializeable="false"
	 * @generated
	 */
	EDataType getOntologyManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PragmacpndefinitionFactory getPragmacpndefinitionFactory();

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
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaCPNImpl <em>Pragma CPN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaCPNImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPragmaCPN()
		 * @generated
		 */
		EClass PRAGMA_CPN = eINSTANCE.getPragmaCPN();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PlaceImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__ANNOTATION = eINSTANCE.getPlace_Annotation();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaImpl <em>Pragma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPragma()
		 * @generated
		 */
		EClass PRAGMA = eINSTANCE.getPragma();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRAGMA__TEXT = eINSTANCE.getPragma_Text();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.OntologyDocumentImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getOntologyDocument()
		 * @generated
		 */
		EClass ONTOLOGY_DOCUMENT = eINSTANCE.getOntologyDocument();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_DOCUMENT__IRI = eINSTANCE.getOntologyDocument_Iri();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_DOCUMENT__PATH = eINSTANCE.getOntologyDocument_Path();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY_DOCUMENT__ONTOLOGY = eINSTANCE.getOntologyDocument_Ontology();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaticsOntologyImpl <em>Pragmatics Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaticsOntologyImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPragmaticsOntology()
		 * @generated
		 */
		EClass PRAGMATICS_ONTOLOGY = eINSTANCE.getPragmaticsOntology();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRAGMATICS_ONTOLOGY__DOCUMENTS = eINSTANCE.getPragmaticsOntology_Documents();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRAGMATICS_ONTOLOGY__NET = eINSTANCE.getPragmaticsOntology_Net();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRAGMATICS_ONTOLOGY__MANAGER = eINSTANCE.getPragmaticsOntology_Manager();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PetriNetImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__ONTOLOGY = eINSTANCE.getPetriNet_Ontology();

		/**
		 * The meta object literal for the '<em>Ontology File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getOntologyFile()
		 * @generated
		 */
		EDataType ONTOLOGY_FILE = eINSTANCE.getOntologyFile();

		/**
		 * The meta object literal for the '<em>Ontology Manager</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.semanticweb.owlapi.model.OWLOntologyManager
		 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionPackageImpl#getOntologyManager()
		 * @generated
		 */
		EDataType ONTOLOGY_MANAGER = eINSTANCE.getOntologyManager();

	}

} //PragmacpndefinitionPackage
