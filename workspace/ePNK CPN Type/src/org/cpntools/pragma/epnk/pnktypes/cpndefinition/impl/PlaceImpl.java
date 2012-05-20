/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Colourset;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.InitialMarking;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Sort;
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
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PlaceImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected InitialMarking initialMarking;
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
	public InitialMarking getInitialMarking() {
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(InitialMarking newInitialMarking, NotificationChain msgs) {
		InitialMarking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.PLACE__INITIAL_MARKING, oldInitialMarking, newInitialMarking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialMarking(InitialMarking newInitialMarking) {
		if (newInitialMarking != initialMarking) {
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = ((InternalEObject)initialMarking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.PLACE__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = ((InternalEObject)newInitialMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.PLACE__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.PLACE__INITIAL_MARKING, newInitialMarking, newInitialMarking));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.PLACE__SORT, oldSort, newSort);
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
				msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.PLACE__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpndefinitionPackage.PLACE__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpndefinitionPackage.PLACE__SORT, newSort, newSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case CpndefinitionPackage.PLACE__SORT:
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
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				return getInitialMarking();
			case CpndefinitionPackage.PLACE__SORT:
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
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				setInitialMarking((InitialMarking)newValue);
				return;
			case CpndefinitionPackage.PLACE__SORT:
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
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				setInitialMarking((InitialMarking)null);
				return;
			case CpndefinitionPackage.PLACE__SORT:
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
			case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				return initialMarking != null;
			case CpndefinitionPackage.PLACE__SORT:
				return sort != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
