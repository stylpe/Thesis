/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Pragma;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PlaceImpl#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PlaceImpl#getColorset <em>Colorset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The default value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_MARKING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected String initialMarking = INITIAL_MARKING_EDEFAULT;
	/**
	 * The default value of the '{@link #getColorset() <em>Colorset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorset()
	 * @generated
	 * @ordered
	 */
	protected static final String COLORSET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getColorset() <em>Colorset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorset()
	 * @generated
	 * @ordered
	 */
	protected String colorset = COLORSET_EDEFAULT;
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
		return CpndefinitionPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialMarking() {
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialMarking(String newInitialMarking) {
		String oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.PLACE__INITIAL_MARKING, oldInitialMarking, initialMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorset() {
		return colorset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorset(String newColorset) {
		String oldColorset = colorset;
		colorset = newColorset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.PLACE__COLORSET, oldColorset, colorset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				return getInitialMarking();
			case CpndefinitionPackage.PLACE__COLORSET:
				return getColorset();
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
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				setInitialMarking((String)newValue);
				return;
			case CpndefinitionPackage.PLACE__COLORSET:
				setColorset((String)newValue);
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
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				setInitialMarking(INITIAL_MARKING_EDEFAULT);
				return;
			case CpndefinitionPackage.PLACE__COLORSET:
				setColorset(COLORSET_EDEFAULT);
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
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				return INITIAL_MARKING_EDEFAULT == null ? initialMarking != null : !INITIAL_MARKING_EDEFAULT.equals(initialMarking);
			case CpndefinitionPackage.PLACE__COLORSET:
				return COLORSET_EDEFAULT == null ? colorset != null : !COLORSET_EDEFAULT.equals(colorset);
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
		result.append(" (InitialMarking: ");
		result.append(initialMarking);
		result.append(", Colorset: ");
		result.append(colorset);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
