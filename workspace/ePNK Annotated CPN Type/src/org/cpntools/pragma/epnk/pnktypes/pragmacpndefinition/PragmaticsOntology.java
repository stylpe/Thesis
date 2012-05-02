/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.semanticweb.owlapi.model.OWLOntologyManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragmatics Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getDocuments <em>Documents</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getNet <em>Net</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getManager <em>Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaticsOntology()
 * @model
 * @generated
 */
public interface PragmaticsOntology extends Label {
	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument}.
	 * It is bidirectional and its opposite is '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaticsOntology_Documents()
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getOntology
	 * @model opposite="ontology" containment="true"
	 * @generated
	 */
	EList<OntologyDocument> getDocuments();

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(PetriNet)
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaticsOntology_Net()
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet#getOntology
	 * @model opposite="ontology" transient="false"
	 * @generated
	 */
	PetriNet getNet();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaticsOntology_Manager()
	 * @model default="" dataType="org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyManager" transient="true" changeable="false"
	 * @generated
	 */
	OWLOntologyManager getManager();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileDataType="org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyFile"
	 * @generated
	 */
	void addOntologyFromFile(IFile file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getValidPragmatics(OntologyMember object);

} // PragmaticsOntology
