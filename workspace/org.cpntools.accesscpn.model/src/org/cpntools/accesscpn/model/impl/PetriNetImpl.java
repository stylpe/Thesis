/************************************************************************/
/* Access/CPN                                                           */
/* Copyright 2010-2011 AIS Group, Eindhoven University of Technology    */
/*                                                                      */
/* This library is free software; you can redistribute it and/or        */
/* modify it under the terms of the GNU Lesser General Public           */
/* License as published by the Free Software Foundation; either         */
/* version 2.1 of the License, or (at your option) any later version.   */
/*                                                                      */
/* This library is distributed in the hope that it will be useful,      */
/* but WITHOUT ANY WARRANTY; without even the implied warranty of       */
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU    */
/* Lesser General Public License for more details.                      */
/*                                                                      */
/* You should have received a copy of the GNU Lesser General Public     */
/* License along with this library; if not, write to the Free Software  */
/* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,           */
/* MA  02110-1301  USA                                                  */
/************************************************************************/
/**
 * <copyright> </copyright> $Id$
 */
package org.cpntools.accesscpn.model.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.cpntools.accesscpn.model.FusionGroup;
import org.cpntools.accesscpn.model.HLDeclaration;
import org.cpntools.accesscpn.model.HasLabel;
import org.cpntools.accesscpn.model.HasName;
import org.cpntools.accesscpn.model.HasToolInfo;
import org.cpntools.accesscpn.model.Label;
import org.cpntools.accesscpn.model.Name;
import org.cpntools.accesscpn.model.Page;
import org.cpntools.accesscpn.model.PetriNet;
import org.cpntools.accesscpn.model.ToolInfo;
import org.cpntools.accesscpn.model.declaration.TypeDeclaration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Petri Net</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.accesscpn.model.impl.PetriNetImpl#getToolinfo <em>Toolinfo</em>}</li>
 *   <li>{@link org.cpntools.accesscpn.model.impl.PetriNetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.cpntools.accesscpn.model.impl.PetriNetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cpntools.accesscpn.model.impl.PetriNetImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.cpntools.accesscpn.model.impl.PetriNetImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.cpntools.accesscpn.model.impl.PetriNetImpl#getFusionGroups <em>Fusion Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends HasIdImpl implements PetriNet {
	/**
	 * The cached value of the '{@link #getToolinfo() <em>Toolinfo</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getToolinfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolInfo> toolinfo;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> label;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> page;

	/**
	 * The cached value of the '{@link #getFusionGroups() <em>Fusion Groups</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFusionGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<FusionGroup> fusionGroups;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackageImpl.Literals.PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<ToolInfo> getToolinfo() {
		if (toolinfo == null) {
			toolinfo = new EObjectContainmentWithInverseEList<ToolInfo>(ToolInfo.class, this, ModelPackageImpl.PETRI_NET__TOOLINFO, ModelPackageImpl.TOOL_INFO__PARENT);
		}
		return toolinfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<Label> getLabel() {
		if (label == null) {
			label = new EObjectContainmentWithInverseEList<Label>(Label.class, this, ModelPackageImpl.PETRI_NET__LABEL, ModelPackageImpl.LABEL__PARENT);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		if (name != null && ((EObject)name).eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Name)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackageImpl.PETRI_NET__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Name basicGetName() {
		return name;
	}

	/**
	 * @see org.cpntools.accesscpn.model.HasName#setName(org.cpntools.accesscpn.model.Name)
	 */
	public void setName(final Name newName) {
		if (name != null) {
			name.setParent(null);
		}
		setNameGen(newName);
		if (newName != null) {
			newName.setParent(this);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameGen(Name newName) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackageImpl.PETRI_NET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentWithInverseEList<Page>(Page.class, this, ModelPackageImpl.PETRI_NET__PAGE, ModelPackageImpl.PAGE__PETRI_NET);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<FusionGroup> getFusionGroups() {
		if (fusionGroups == null) {
			fusionGroups = new EObjectWithInverseResolvingEList<FusionGroup>(FusionGroup.class, this, ModelPackageImpl.PETRI_NET__FUSION_GROUPS, ModelPackageImpl.FUSION_GROUP__PETRI_NET);
		}
		return fusionGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackageImpl.PETRI_NET__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackageImpl.PETRI_NET__TOOLINFO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToolinfo()).basicAdd(otherEnd, msgs);
			case ModelPackageImpl.PETRI_NET__LABEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabel()).basicAdd(otherEnd, msgs);
			case ModelPackageImpl.PETRI_NET__PAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPage()).basicAdd(otherEnd, msgs);
			case ModelPackageImpl.PETRI_NET__FUSION_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFusionGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> Whenever the model is regenerated, this will yield an error because of the @override
	 * annotation. Just remove the annotation. <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackageImpl.PETRI_NET__TOOLINFO:
				return ((InternalEList<?>)getToolinfo()).basicRemove(otherEnd, msgs);
			case ModelPackageImpl.PETRI_NET__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ModelPackageImpl.PETRI_NET__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case ModelPackageImpl.PETRI_NET__FUSION_GROUPS:
				return ((InternalEList<?>)getFusionGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackageImpl.PETRI_NET__TOOLINFO:
				return getToolinfo();
			case ModelPackageImpl.PETRI_NET__LABEL:
				return getLabel();
			case ModelPackageImpl.PETRI_NET__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ModelPackageImpl.PETRI_NET__KIND:
				return getKind();
			case ModelPackageImpl.PETRI_NET__PAGE:
				return getPage();
			case ModelPackageImpl.PETRI_NET__FUSION_GROUPS:
				return getFusionGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackageImpl.PETRI_NET__TOOLINFO:
				getToolinfo().clear();
				getToolinfo().addAll((Collection<? extends ToolInfo>)newValue);
				return;
			case ModelPackageImpl.PETRI_NET__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends Label>)newValue);
				return;
			case ModelPackageImpl.PETRI_NET__NAME:
				setName((Name)newValue);
				return;
			case ModelPackageImpl.PETRI_NET__KIND:
				setKind((String)newValue);
				return;
			case ModelPackageImpl.PETRI_NET__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends Page>)newValue);
				return;
			case ModelPackageImpl.PETRI_NET__FUSION_GROUPS:
				getFusionGroups().clear();
				getFusionGroups().addAll((Collection<? extends FusionGroup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackageImpl.PETRI_NET__TOOLINFO:
				getToolinfo().clear();
				return;
			case ModelPackageImpl.PETRI_NET__LABEL:
				getLabel().clear();
				return;
			case ModelPackageImpl.PETRI_NET__NAME:
				setName((Name)null);
				return;
			case ModelPackageImpl.PETRI_NET__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ModelPackageImpl.PETRI_NET__PAGE:
				getPage().clear();
				return;
			case ModelPackageImpl.PETRI_NET__FUSION_GROUPS:
				getFusionGroups().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackageImpl.PETRI_NET__TOOLINFO:
				return toolinfo != null && !toolinfo.isEmpty();
			case ModelPackageImpl.PETRI_NET__LABEL:
				return label != null && !label.isEmpty();
			case ModelPackageImpl.PETRI_NET__NAME:
				return name != null;
			case ModelPackageImpl.PETRI_NET__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case ModelPackageImpl.PETRI_NET__PAGE:
				return page != null && !page.isEmpty();
			case ModelPackageImpl.PETRI_NET__FUSION_GROUPS:
				return fusionGroups != null && !fusionGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasToolInfo.class) {
			switch (derivedFeatureID) {
				case ModelPackageImpl.PETRI_NET__TOOLINFO: return ModelPackageImpl.HAS_TOOL_INFO__TOOLINFO;
				default: return -1;
			}
		}
		if (baseClass == HasLabel.class) {
			switch (derivedFeatureID) {
				case ModelPackageImpl.PETRI_NET__LABEL: return ModelPackageImpl.HAS_LABEL__LABEL;
				default: return -1;
			}
		}
		if (baseClass == HasName.class) {
			switch (derivedFeatureID) {
				case ModelPackageImpl.PETRI_NET__NAME: return ModelPackageImpl.HAS_NAME__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasToolInfo.class) {
			switch (baseFeatureID) {
				case ModelPackageImpl.HAS_TOOL_INFO__TOOLINFO: return ModelPackageImpl.PETRI_NET__TOOLINFO;
				default: return -1;
			}
		}
		if (baseClass == HasLabel.class) {
			switch (baseFeatureID) {
				case ModelPackageImpl.HAS_LABEL__LABEL: return ModelPackageImpl.PETRI_NET__LABEL;
				default: return -1;
			}
		}
		if (baseClass == HasName.class) {
			switch (baseFeatureID) {
				case ModelPackageImpl.HAS_NAME__NAME: return ModelPackageImpl.PETRI_NET__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) { return super.toString(); }

		final StringBuffer result = new StringBuffer(getClass().getSimpleName().replaceFirst("Impl$", ""));
		result.append(" (");
		result.append(getName());
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.cpntools.accesscpn.model.PetriNet#declaration()
	 */
	@SuppressWarnings("unchecked")
	public Iterable<HLDeclaration> declaration() {
		return new Iterable<HLDeclaration>() {
			public Iterator<HLDeclaration> iterator() {
				return (FilterIterator<HLDeclaration>) (FilterIterator<?>) new FilterIterator<Label>(getLabel()
				        .iterator()) {
					@Override
					public boolean accept(final Label label) {
						return label instanceof HLDeclaration;
					}
				};
			}
		};
	}

	/**
	 * @see org.cpntools.accesscpn.model.PetriNet#isTimed()
	 */
	public boolean isTimed(){
	for (HLDeclaration decl : declaration()) {
		if ((decl.getStructure() != null) && (decl.getStructure() instanceof TypeDeclaration)) {
			TypeDeclaration structure = (TypeDeclaration) decl.getStructure();
			if (structure.getSort().getTimed()) {
				return true;
			}
		}
	}
	return false;
	}

} // PetriNetImpl
