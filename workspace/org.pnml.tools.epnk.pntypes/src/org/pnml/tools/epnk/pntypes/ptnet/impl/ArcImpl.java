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
package org.pnml.tools.epnk.pntypes.ptnet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pntypes.ptnet.Arc;
import org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.ptnet.impl.ArcImpl#getInscription <em>Inscription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl implements Arc {
	/**
	 * The cached value of the '{@link #getInscription() <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscription()
	 * @generated
	 * @ordered
	 */
	protected PTArcAnnotation inscription;

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
		return PtnetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTArcAnnotation getInscription() {
		return inscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInscription(PTArcAnnotation newInscription, NotificationChain msgs) {
		PTArcAnnotation oldInscription = inscription;
		inscription = newInscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetPackage.ARC__INSCRIPTION, oldInscription, newInscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInscription(PTArcAnnotation newInscription) {
		if (newInscription != inscription) {
			NotificationChain msgs = null;
			if (inscription != null)
				msgs = ((InternalEObject)inscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetPackage.ARC__INSCRIPTION, null, msgs);
			if (newInscription != null)
				msgs = ((InternalEObject)newInscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetPackage.ARC__INSCRIPTION, null, msgs);
			msgs = basicSetInscription(newInscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.ARC__INSCRIPTION, newInscription, newInscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PtnetPackage.ARC__INSCRIPTION:
				return basicSetInscription(null, msgs);
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
			case PtnetPackage.ARC__INSCRIPTION:
				return getInscription();
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
			case PtnetPackage.ARC__INSCRIPTION:
				setInscription((PTArcAnnotation)newValue);
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
			case PtnetPackage.ARC__INSCRIPTION:
				setInscription((PTArcAnnotation)null);
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
			case PtnetPackage.ARC__INSCRIPTION:
				return inscription != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcImpl
