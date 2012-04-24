/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc#getInscription <em>Inscription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inscription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscription</em>' containment reference.
	 * @see #setInscription(ArcInscription)
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getArc_Inscription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArcInscription getInscription();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc#getInscription <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inscription</em>' containment reference.
	 * @see #getInscription()
	 * @generated
	 */
	void setInscription(ArcInscription value);

} // Arc
