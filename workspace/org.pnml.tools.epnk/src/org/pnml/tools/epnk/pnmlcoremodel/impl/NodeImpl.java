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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeImpl#getOut <em>Out</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeImpl#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends ObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> out;
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> in;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getOut() {
		if (out == null) {
			out = new EObjectWithInverseEList<Arc>(Arc.class, this, PnmlcoremodelPackage.NODE__OUT, PnmlcoremodelPackage.ARC__SOURCE);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getIn() {
		if (in == null) {
			in = new EObjectWithInverseEList<Arc>(Arc.class, this, PnmlcoremodelPackage.NODE__IN, PnmlcoremodelPackage.ARC__TARGET);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnmlcoremodelPackage.NODE__OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
			case PnmlcoremodelPackage.NODE__IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnmlcoremodelPackage.NODE__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
			case PnmlcoremodelPackage.NODE__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
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
			case PnmlcoremodelPackage.NODE__OUT:
				return getOut();
			case PnmlcoremodelPackage.NODE__IN:
				return getIn();
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
			case PnmlcoremodelPackage.NODE__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Arc>)newValue);
				return;
			case PnmlcoremodelPackage.NODE__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Arc>)newValue);
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
			case PnmlcoremodelPackage.NODE__OUT:
				getOut().clear();
				return;
			case PnmlcoremodelPackage.NODE__IN:
				getIn().clear();
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
			case PnmlcoremodelPackage.NODE__OUT:
				return out != null && !out.isEmpty();
			case PnmlcoremodelPackage.NODE__IN:
				return in != null && !in.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
