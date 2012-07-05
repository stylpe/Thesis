/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Guard;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.TransitionImpl#isIsSubstitutionTransition <em>Is Substitution Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl implements Transition {
	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard guard;
	/**
	 * The default value of the '{@link #isIsSubstitutionTransition() <em>Is Substitution Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubstitutionTransition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBSTITUTION_TRANSITION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsSubstitutionTransition() <em>Is Substitution Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubstitutionTransition()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubstitutionTransition = IS_SUBSTITUTION_TRANSITION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpndefinitionPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Guard newGuard, NotificationChain msgs) {
		Guard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Guard newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubstitutionTransition() {
		return isSubstitutionTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstitutionTransition(boolean newIsSubstitutionTransition) {
		boolean oldIsSubstitutionTransition = isSubstitutionTransition;
		isSubstitutionTransition = newIsSubstitutionTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.TRANSITION__IS_SUBSTITUTION_TRANSITION, oldIsSubstitutionTransition, isSubstitutionTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpndefinitionPackage.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
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
			case CpndefinitionPackage.TRANSITION__GUARD:
				return getGuard();
			case CpndefinitionPackage.TRANSITION__IS_SUBSTITUTION_TRANSITION:
				return isIsSubstitutionTransition();
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
			case CpndefinitionPackage.TRANSITION__GUARD:
				setGuard((Guard)newValue);
				return;
			case CpndefinitionPackage.TRANSITION__IS_SUBSTITUTION_TRANSITION:
				setIsSubstitutionTransition((Boolean)newValue);
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
			case CpndefinitionPackage.TRANSITION__GUARD:
				setGuard((Guard)null);
				return;
			case CpndefinitionPackage.TRANSITION__IS_SUBSTITUTION_TRANSITION:
				setIsSubstitutionTransition(IS_SUBSTITUTION_TRANSITION_EDEFAULT);
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
			case CpndefinitionPackage.TRANSITION__GUARD:
				return guard != null;
			case CpndefinitionPackage.TRANSITION__IS_SUBSTITUTION_TRANSITION:
				return isSubstitutionTransition != IS_SUBSTITUTION_TRANSITION_EDEFAULT;
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
		result.append(" (isSubstitutionTransition: ");
		result.append(isSubstitutionTransition);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
