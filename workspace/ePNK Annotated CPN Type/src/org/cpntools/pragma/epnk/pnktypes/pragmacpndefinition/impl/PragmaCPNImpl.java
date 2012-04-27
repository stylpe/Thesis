/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import java.util.Collection;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNImpl;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.ontology.OntologyLoader;
import org.cpntools.pragma.ontology.BundleOntologyEnumerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma CPN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaCPNImpl#getLoadedPragmaSets <em>Loaded Pragma Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PragmaCPNImpl extends CPNImpl implements PragmaCPN {
	/**
	 * The cached value of the '{@link #getLoadedPragmaSets() <em>Loaded Pragma Sets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedPragmaSets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> loadedPragmaSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PragmaCPNImpl() {
		super();
		try {
			OntologyLoader.load();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PragmacpndefinitionPackage.Literals.PRAGMA_CPN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLoadedPragmaSets() {
		if (loadedPragmaSets == null) {
			loadedPragmaSets = new EDataTypeUniqueEList<String>(String.class, this, PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_PRAGMA_SETS);
		}
		return loadedPragmaSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_PRAGMA_SETS:
				return getLoadedPragmaSets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_PRAGMA_SETS:
				getLoadedPragmaSets().clear();
				getLoadedPragmaSets().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_PRAGMA_SETS:
				getLoadedPragmaSets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_PRAGMA_SETS:
				return loadedPragmaSets != null && !loadedPragmaSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (LoadedPragmaSets: ");
		result.append(loadedPragmaSets);
		result.append(')');
		return result.toString();
	}

} //PragmaCPNImpl
