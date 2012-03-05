/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition;

import org.pnml.tools.epnk.pnmlcoremodel.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Pragma#getText <em>Text</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Pragma#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getPragma()
 * @model
 * @generated
 */
public interface Pragma extends Label {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getPragma_Text()
	 * @model derived="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Pragma#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.PragmaSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.PragmaSource
	 * @see #setSource(PragmaSource)
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getPragma_Source()
	 * @model
	 * @generated
	 */
	PragmaSource getSource();

	/**
	 * Sets the value of the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Pragma#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.PragmaSource
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PragmaSource value);

} // Pragma
