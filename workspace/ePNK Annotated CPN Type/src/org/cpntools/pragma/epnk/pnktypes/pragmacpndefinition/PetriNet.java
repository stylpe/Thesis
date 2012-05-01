/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends org.pnml.tools.epnk.pnmlcoremodel.PetriNet {
	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' containment reference.
	 * @see #setOntology(PragmaticsOntology)
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPetriNet_Ontology()
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	PragmaticsOntology getOntology();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet#getOntology <em>Ontology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology</em>' containment reference.
	 * @see #getOntology()
	 * @generated
	 */
	void setOntology(PragmaticsOntology value);

} // PetriNet
