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
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PlaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.PlaceImpl#getHlinitialMarking <em>Hlinitial Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getHlinitialMarking() <em>Hlinitial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHlinitialMarking()
	 * @generated
	 * @ordered
	 */
	protected HLMarking hlinitialMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpngdefinitionPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlpngdefinitionPackage.PLACE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlpngdefinitionPackage.PLACE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlpngdefinitionPackage.PLACE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpngdefinitionPackage.PLACE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLMarking getHlinitialMarking() {
		return hlinitialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHlinitialMarking(HLMarking newHlinitialMarking, NotificationChain msgs) {
		HLMarking oldHlinitialMarking = hlinitialMarking;
		hlinitialMarking = newHlinitialMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING, oldHlinitialMarking, newHlinitialMarking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHlinitialMarking(HLMarking newHlinitialMarking) {
		if (newHlinitialMarking != hlinitialMarking) {
			NotificationChain msgs = null;
			if (hlinitialMarking != null)
				msgs = ((InternalEObject)hlinitialMarking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING, null, msgs);
			if (newHlinitialMarking != null)
				msgs = ((InternalEObject)newHlinitialMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING, null, msgs);
			msgs = basicSetHlinitialMarking(newHlinitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING, newHlinitialMarking, newHlinitialMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HlpngdefinitionPackage.PLACE__TYPE:
				return basicSetType(null, msgs);
			case HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING:
				return basicSetHlinitialMarking(null, msgs);
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
			case HlpngdefinitionPackage.PLACE__TYPE:
				return getType();
			case HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING:
				return getHlinitialMarking();
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
			case HlpngdefinitionPackage.PLACE__TYPE:
				setType((Type)newValue);
				return;
			case HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING:
				setHlinitialMarking((HLMarking)newValue);
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
			case HlpngdefinitionPackage.PLACE__TYPE:
				setType((Type)null);
				return;
			case HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING:
				setHlinitialMarking((HLMarking)null);
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
			case HlpngdefinitionPackage.PLACE__TYPE:
				return type != null;
			case HlpngdefinitionPackage.PLACE__HLINITIAL_MARKING:
				return hlinitialMarking != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
