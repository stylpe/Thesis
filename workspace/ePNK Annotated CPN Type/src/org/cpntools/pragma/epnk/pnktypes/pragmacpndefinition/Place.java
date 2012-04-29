/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place {

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPlace_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pragma> getAnnotation();
} // Place
