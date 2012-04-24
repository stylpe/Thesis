/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.ArcInscription;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcImpl#getInscription <em>Inscription</em>}</li>
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
	protected ArcInscription inscription;
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
		return CpndefinitionPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcInscription getInscription() {
		return inscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInscription(ArcInscription newInscription, NotificationChain msgs) {
		ArcInscription oldInscription = inscription;
		inscription = newInscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.ARC__INSCRIPTION, oldInscription, newInscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInscription(ArcInscription newInscription) {
		if (newInscription != inscription) {
			NotificationChain msgs = null;
			if (inscription != null)
				msgs = ((InternalEObject)inscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.ARC__INSCRIPTION, null, msgs);
			if (newInscription != null)
				msgs = ((InternalEObject)newInscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.ARC__INSCRIPTION, null, msgs);
			msgs = basicSetInscription(newInscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.ARC__INSCRIPTION, newInscription, newInscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpndefinitionPackage.ARC__INSCRIPTION:
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
			case CpndefinitionPackage.ARC__INSCRIPTION:
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
			case CpndefinitionPackage.ARC__INSCRIPTION:
				setInscription((ArcInscription)newValue);
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
			case CpndefinitionPackage.ARC__INSCRIPTION:
				setInscription((ArcInscription)null);
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
			case CpndefinitionPackage.ARC__INSCRIPTION:
				return inscription != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcImpl
