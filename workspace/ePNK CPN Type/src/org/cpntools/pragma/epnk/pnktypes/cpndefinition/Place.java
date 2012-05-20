/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Marking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(InitialMarking)
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getPlace_InitialMarking()
	 * @model containment="true"
	 * @generated
	 */
	InitialMarking getInitialMarking();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(InitialMarking value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference.
	 * @see #setSort(Sort)
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getPlace_Sort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getSort();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(Sort value);

} // Place
