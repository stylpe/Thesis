/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.pnmlcoremodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl#getToolspecific <em>Toolspecific</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl#getUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends EObjectImpl implements PetriNet {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PetriNetType type;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

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
	 * The cached value of the '{@link #getToolspecific() <em>Toolspecific</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolspecific()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolInfo> toolspecific;

	/**
	 * The cached value of the '{@link #getUnknown() <em>Unknown</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyType> unknown;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.PETRI_NET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.PETRI_NET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.PETRI_NET__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.PETRI_NET__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.PETRI_NET__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.PETRI_NET__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, PnmlcoremodelPackage.PETRI_NET__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolInfo> getToolspecific() {
		if (toolspecific == null) {
			toolspecific = new EObjectContainmentEList<ToolInfo>(ToolInfo.class, this, PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC);
		}
		return toolspecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyType> getUnknown() {
		if (unknown == null) {
			unknown = new EObjectContainmentEList<AnyType>(AnyType.class, this, PnmlcoremodelPackage.PETRI_NET__UNKNOWN);
		}
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(PetriNetType newType, NotificationChain msgs) {
		PetriNetType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.PETRI_NET__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PetriNetType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.PETRI_NET__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.PETRI_NET__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.PETRI_NET__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnmlcoremodelPackage.PETRI_NET__TYPE:
				return basicSetType(null, msgs);
			case PnmlcoremodelPackage.PETRI_NET__NAME:
				return basicSetName(null, msgs);
			case PnmlcoremodelPackage.PETRI_NET__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC:
				return ((InternalEList<?>)getToolspecific()).basicRemove(otherEnd, msgs);
			case PnmlcoremodelPackage.PETRI_NET__UNKNOWN:
				return ((InternalEList<?>)getUnknown()).basicRemove(otherEnd, msgs);
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
			case PnmlcoremodelPackage.PETRI_NET__ID:
				return getId();
			case PnmlcoremodelPackage.PETRI_NET__TYPE:
				return getType();
			case PnmlcoremodelPackage.PETRI_NET__NAME:
				return getName();
			case PnmlcoremodelPackage.PETRI_NET__PAGE:
				return getPage();
			case PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC:
				return getToolspecific();
			case PnmlcoremodelPackage.PETRI_NET__UNKNOWN:
				return getUnknown();
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
			case PnmlcoremodelPackage.PETRI_NET__ID:
				setId((String)newValue);
				return;
			case PnmlcoremodelPackage.PETRI_NET__TYPE:
				setType((PetriNetType)newValue);
				return;
			case PnmlcoremodelPackage.PETRI_NET__NAME:
				setName((Name)newValue);
				return;
			case PnmlcoremodelPackage.PETRI_NET__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends Page>)newValue);
				return;
			case PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC:
				getToolspecific().clear();
				getToolspecific().addAll((Collection<? extends ToolInfo>)newValue);
				return;
			case PnmlcoremodelPackage.PETRI_NET__UNKNOWN:
				getUnknown().clear();
				getUnknown().addAll((Collection<? extends AnyType>)newValue);
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
			case PnmlcoremodelPackage.PETRI_NET__ID:
				setId(ID_EDEFAULT);
				return;
			case PnmlcoremodelPackage.PETRI_NET__TYPE:
				setType((PetriNetType)null);
				return;
			case PnmlcoremodelPackage.PETRI_NET__NAME:
				setName((Name)null);
				return;
			case PnmlcoremodelPackage.PETRI_NET__PAGE:
				getPage().clear();
				return;
			case PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC:
				getToolspecific().clear();
				return;
			case PnmlcoremodelPackage.PETRI_NET__UNKNOWN:
				getUnknown().clear();
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
			case PnmlcoremodelPackage.PETRI_NET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PnmlcoremodelPackage.PETRI_NET__TYPE:
				return type != null;
			case PnmlcoremodelPackage.PETRI_NET__NAME:
				return name != null;
			case PnmlcoremodelPackage.PETRI_NET__PAGE:
				return page != null && !page.isEmpty();
			case PnmlcoremodelPackage.PETRI_NET__TOOLSPECIFIC:
				return toolspecific != null && !toolspecific.isEmpty();
			case PnmlcoremodelPackage.PETRI_NET__UNKNOWN:
				return unknown != null && !unknown.isEmpty();
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PetriNetImpl
