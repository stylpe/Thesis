/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationPackage
 * @generated
 */
public interface HlpngserialisationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlpngserialisationFactory eINSTANCE = org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sort Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Assoc</em>'.
	 * @generated
	 */
	SortAssoc createSortAssoc();

	/**
	 * Returns a new object of class '<em>Decl Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decl Assoc</em>'.
	 * @generated
	 */
	DeclAssoc createDeclAssoc();

	/**
	 * Returns a new object of class '<em>Term Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Assoc</em>'.
	 * @generated
	 */
	TermAssoc createTermAssoc();

	/**
	 * Returns a new object of class '<em>Variable Decl Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Decl Assoc</em>'.
	 * @generated
	 */
	VariableDeclAssoc createVariableDeclAssoc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HlpngserialisationPackage getHlpngserialisationPackage();

} //HlpngserialisationFactory
