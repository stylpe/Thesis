/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel;

import org.pnml.tools.epnk.pnmlcoremodel.ID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolDef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getSymbolDef()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SymbolDef extends ID {
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
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getSymbolDef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SymbolDef
