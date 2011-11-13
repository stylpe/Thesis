/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getStructuredLabel()
 * @model abstract="true"
 * @generated
 */
public interface StructuredLabel extends Label {
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
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getStructuredLabel_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EReference getStructuralFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject parse(String input);

} // StructuredLabel
