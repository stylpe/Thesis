/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Use Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getSymbolUseMapping()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SymbolUseMapping extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SymbolUse> getSymbolUses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SymbolDef getSymbolDef(SymbolUse symbolUse);

} // SymbolUseMapping
