/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUse#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getSymbolUse()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SymbolUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getSymbolUse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUse#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EReference getRefFeature();

} // SymbolUse
