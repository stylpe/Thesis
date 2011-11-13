/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Petri Net Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getStructuredPetriNetType()
 * @model abstract="true"
 * @generated
 */
public interface StructuredPetriNetType extends PetriNetType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Linker getLinker();

} // StructuredPetriNetType
