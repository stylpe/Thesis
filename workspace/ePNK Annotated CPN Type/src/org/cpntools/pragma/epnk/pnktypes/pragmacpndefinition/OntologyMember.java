/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.pnmlcoremodel.ID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getOntologyMember()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OntologyMember extends ID {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getOntologyMember_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pragma> getAnnotation();

} // OntologyMember
