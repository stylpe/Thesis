/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getIri <em>Iri</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getPath <em>Path</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getOntologyDocument()
 * @model
 * @generated
 */
public interface OntologyDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri</em>' attribute.
	 * @see #setIri(String)
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getOntologyDocument_Iri()
	 * @model
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getOntologyDocument_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' container reference.
	 * @see #setOntology(PragmaticsOntology)
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getOntologyDocument_Ontology()
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getDocuments
	 * @model opposite="documents" transient="false"
	 * @generated
	 */
	PragmaticsOntology getOntology();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument#getOntology <em>Ontology</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology</em>' container reference.
	 * @see #getOntology()
	 * @generated
	 */
	void setOntology(PragmaticsOntology value);

} // OntologyDocument
