/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pnmlcoremodel.ID;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.VariableDeclAssoc;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;

import org.pnml.tools.epnk.serialisation.impl.AssocClassImpl;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Decl Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.VariableDeclAssocImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.VariableDeclAssocImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.VariableDeclAssocImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclAssocImpl extends AssocClassImpl implements VariableDeclAssoc {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected Sort sort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpngserialisationPackage.Literals.VARIABLE_DECL_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpngserialisationPackage.VARIABLE_DECL_ASSOC__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpngserialisationPackage.VARIABLE_DECL_ASSOC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(Sort newSort, NotificationChain msgs) {
		Sort oldSort = sort;
		sort = newSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT, oldSort, newSort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(Sort newSort) {
		if (newSort != sort) {
			NotificationChain msgs = null;
			if (sort != null)
				msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT, newSort, newSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT:
				return basicSetSort(null, msgs);
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
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__ID:
				return getId();
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__NAME:
				return getName();
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT:
				return getSort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__ID:
				setId((String)newValue);
				return;
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__NAME:
				setName((String)newValue);
				return;
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT:
				setSort((Sort)newValue);
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
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__ID:
				setId(ID_EDEFAULT);
				return;
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT:
				setSort((Sort)null);
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
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT:
				return sort != null;
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
		if (baseClass == ID.class) {
			switch (derivedFeatureID) {
				case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__ID: return PnmlcoremodelPackage.ID__ID;
				default: return -1;
			}
		}
		if (baseClass == SymbolDef.class) {
			switch (derivedFeatureID) {
				case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__NAME: return StructuredpntypemodelPackage.SYMBOL_DEF__NAME;
				default: return -1;
			}
		}
		if (baseClass == Declaration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == VariableDecl.class) {
			switch (derivedFeatureID) {
				case HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT: return TermsPackage.VARIABLE_DECL__SORT;
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
		if (baseClass == ID.class) {
			switch (baseFeatureID) {
				case PnmlcoremodelPackage.ID__ID: return HlpngserialisationPackage.VARIABLE_DECL_ASSOC__ID;
				default: return -1;
			}
		}
		if (baseClass == SymbolDef.class) {
			switch (baseFeatureID) {
				case StructuredpntypemodelPackage.SYMBOL_DEF__NAME: return HlpngserialisationPackage.VARIABLE_DECL_ASSOC__NAME;
				default: return -1;
			}
		}
		if (baseClass == Declaration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == VariableDecl.class) {
			switch (baseFeatureID) {
				case TermsPackage.VARIABLE_DECL__SORT: return HlpngserialisationPackage.VARIABLE_DECL_ASSOC__SORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VariableDeclAssocImpl
