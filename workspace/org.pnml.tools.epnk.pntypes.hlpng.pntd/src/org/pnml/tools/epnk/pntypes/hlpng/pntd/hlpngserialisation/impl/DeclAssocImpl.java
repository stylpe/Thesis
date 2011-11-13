/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.DeclAssoc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.serialisation.impl.AssocClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decl Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.DeclAssocImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclAssocImpl extends AssocClassImpl implements DeclAssoc {
	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpngserialisationPackage.Literals.DECL_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this, HlpngserialisationPackage.DECL_ASSOC__DECLARATION);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HlpngserialisationPackage.DECL_ASSOC__DECLARATION:
				return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HlpngserialisationPackage.DECL_ASSOC__DECLARATION:
				return getDeclaration();
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
			case HlpngserialisationPackage.DECL_ASSOC__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends Declaration>)newValue);
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
			case HlpngserialisationPackage.DECL_ASSOC__DECLARATION:
				getDeclaration().clear();
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
			case HlpngserialisationPackage.DECL_ASSOC__DECLARATION:
				return declaration != null && !declaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Declarations.class) {
			switch (derivedFeatureID) {
				case HlpngserialisationPackage.DECL_ASSOC__DECLARATION: return TermsPackage.DECLARATIONS__DECLARATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Declarations.class) {
			switch (baseFeatureID) {
				case TermsPackage.DECLARATIONS__DECLARATION: return HlpngserialisationPackage.DECL_ASSOC__DECLARATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DeclAssocImpl
