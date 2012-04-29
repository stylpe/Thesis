/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage
 * @generated
 */
public interface PragmacpndefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PragmacpndefinitionFactory eINSTANCE = org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmacpndefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pragma CPN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pragma CPN</em>'.
	 * @generated
	 */
	PragmaCPN createPragmaCPN();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Pragma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pragma</em>'.
	 * @generated
	 */
	Pragma createPragma();

	/**
	 * Returns a new object of class '<em>Ontology Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology Document</em>'.
	 * @generated
	 */
	OntologyDocument createOntologyDocument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PragmacpndefinitionPackage getPragmacpndefinitionPackage();

} //PragmacpndefinitionFactory
