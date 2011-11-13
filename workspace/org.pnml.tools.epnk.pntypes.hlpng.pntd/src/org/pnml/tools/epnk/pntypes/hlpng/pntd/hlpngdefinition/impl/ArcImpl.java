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

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.ArcImpl#getHlinscription <em>Hlinscription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl implements Arc {
	/**
	 * The cached value of the '{@link #getHlinscription() <em>Hlinscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHlinscription()
	 * @generated
	 * @ordered
	 */
	protected HLAnnotation hlinscription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpngdefinitionPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLAnnotation getHlinscription() {
		return hlinscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHlinscription(HLAnnotation newHlinscription, NotificationChain msgs) {
		HLAnnotation oldHlinscription = hlinscription;
		hlinscription = newHlinscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlpngdefinitionPackage.ARC__HLINSCRIPTION, oldHlinscription, newHlinscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHlinscription(HLAnnotation newHlinscription) {
		if (newHlinscription != hlinscription) {
			NotificationChain msgs = null;
			if (hlinscription != null)
				msgs = ((InternalEObject)hlinscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlpngdefinitionPackage.ARC__HLINSCRIPTION, null, msgs);
			if (newHlinscription != null)
				msgs = ((InternalEObject)newHlinscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlpngdefinitionPackage.ARC__HLINSCRIPTION, null, msgs);
			msgs = basicSetHlinscription(newHlinscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpngdefinitionPackage.ARC__HLINSCRIPTION, newHlinscription, newHlinscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HlpngdefinitionPackage.ARC__HLINSCRIPTION:
				return basicSetHlinscription(null, msgs);
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
			case HlpngdefinitionPackage.ARC__HLINSCRIPTION:
				return getHlinscription();
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
			case HlpngdefinitionPackage.ARC__HLINSCRIPTION:
				setHlinscription((HLAnnotation)newValue);
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
			case HlpngdefinitionPackage.ARC__HLINSCRIPTION:
				setHlinscription((HLAnnotation)null);
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
			case HlpngdefinitionPackage.ARC__HLINSCRIPTION:
				return hlinscription != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcImpl
