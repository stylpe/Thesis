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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.RefPlaceImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefPlaceImpl extends PlaceNodeImpl implements RefPlace {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected PlaceNode ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.REF_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceNode getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (PlaceNode)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PnmlcoremodelPackage.REF_PLACE__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceNode basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(PlaceNode newRef) {
		PlaceNode oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.REF_PLACE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PnmlcoremodelPackage.REF_PLACE__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case PnmlcoremodelPackage.REF_PLACE__REF:
				setRef((PlaceNode)newValue);
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
			case PnmlcoremodelPackage.REF_PLACE__REF:
				setRef((PlaceNode)null);
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
			case PnmlcoremodelPackage.REF_PLACE__REF:
				return ref != null;
		}
		return super.eIsSet(featureID);
	}

} //RefPlaceImpl
