/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#isIsSubstitutionTransition <em>Is Substitution Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends org.pnml.tools.epnk.pnmlcoremodel.Transition {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Is Substitution Transition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Substitution Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Substitution Transition</em>' attribute.
	 * @see #setIsSubstitutionTransition(boolean)
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getTransition_IsSubstitutionTransition()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSubstitutionTransition();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#isIsSubstitutionTransition <em>Is Substitution Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Substitution Transition</em>' attribute.
	 * @see #isIsSubstitutionTransition()
	 * @generated
	 */
	void setIsSubstitutionTransition(boolean value);

} // Transition
