/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import java.util.Collection;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPNType;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPN Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNTypeImpl#getLoadedPragmaSets <em>Loaded Pragma Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CPNTypeImpl extends PetriNetTypeImpl implements CPNType {
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
	public CPNTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpndefinitionPackage.Literals.CPN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLoadedPragmaSets() {
		if (loadedPragmaSets == null) {
			loadedPragmaSets = new EDataTypeUniqueEList<String>(String.class, this, CpndefinitionPackage.CPN_TYPE__LOADED_PRAGMA_SETS);
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
			case CpndefinitionPackage.CPN_TYPE__LOADED_PRAGMA_SETS:
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
			case CpndefinitionPackage.CPN_TYPE__LOADED_PRAGMA_SETS:
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
			case CpndefinitionPackage.CPN_TYPE__LOADED_PRAGMA_SETS:
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
			case CpndefinitionPackage.CPN_TYPE__LOADED_PRAGMA_SETS:
				return loadedPragmaSets != null && !loadedPragmaSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	// @generated NOT
	public String toString() {
		// TODO Auto-generated method stub
		return "WAT";
	}

} //CPNTypeImpl
