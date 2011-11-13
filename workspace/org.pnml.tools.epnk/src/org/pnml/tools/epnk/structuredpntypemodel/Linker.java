/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage#getLinker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Linker extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SymbolUseMapping getglobalLinks(PetriNet petrinet);

} // Linker
