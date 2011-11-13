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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl#getPageLabelProxy <em>Page Label Proxy</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageImpl#getLabelproxy <em>Labelproxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends ObjectImpl implements Page {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<org.pnml.tools.epnk.pnmlcoremodel.Object> object;

	/**
	 * The cached value of the '{@link #getPageLabelProxy() <em>Page Label Proxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLabelProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<PageLabelProxy> pageLabelProxy;

	/**
	 * The cached value of the '{@link #getLabelproxy() <em>Labelproxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelproxy()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelProxy> labelproxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.pnml.tools.epnk.pnmlcoremodel.Object> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<org.pnml.tools.epnk.pnmlcoremodel.Object>(org.pnml.tools.epnk.pnmlcoremodel.Object.class, this, PnmlcoremodelPackage.PAGE__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageLabelProxy> getPageLabelProxy() {
		if (pageLabelProxy == null) {
			pageLabelProxy = new EObjectContainmentEList<PageLabelProxy>(PageLabelProxy.class, this, PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY);
		}
		return pageLabelProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelProxy> getLabelproxy() {
		if (labelproxy == null) {
			labelproxy = new EObjectContainmentEList<LabelProxy>(LabelProxy.class, this, PnmlcoremodelPackage.PAGE__LABELPROXY);
		}
		return labelproxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnmlcoremodelPackage.PAGE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY:
				return ((InternalEList<?>)getPageLabelProxy()).basicRemove(otherEnd, msgs);
			case PnmlcoremodelPackage.PAGE__LABELPROXY:
				return ((InternalEList<?>)getLabelproxy()).basicRemove(otherEnd, msgs);
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
			case PnmlcoremodelPackage.PAGE__OBJECT:
				return getObject();
			case PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY:
				return getPageLabelProxy();
			case PnmlcoremodelPackage.PAGE__LABELPROXY:
				return getLabelproxy();
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
			case PnmlcoremodelPackage.PAGE__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends org.pnml.tools.epnk.pnmlcoremodel.Object>)newValue);
				return;
			case PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY:
				getPageLabelProxy().clear();
				getPageLabelProxy().addAll((Collection<? extends PageLabelProxy>)newValue);
				return;
			case PnmlcoremodelPackage.PAGE__LABELPROXY:
				getLabelproxy().clear();
				getLabelproxy().addAll((Collection<? extends LabelProxy>)newValue);
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
			case PnmlcoremodelPackage.PAGE__OBJECT:
				getObject().clear();
				return;
			case PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY:
				getPageLabelProxy().clear();
				return;
			case PnmlcoremodelPackage.PAGE__LABELPROXY:
				getLabelproxy().clear();
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
			case PnmlcoremodelPackage.PAGE__OBJECT:
				return object != null && !object.isEmpty();
			case PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY:
				return pageLabelProxy != null && !pageLabelProxy.isEmpty();
			case PnmlcoremodelPackage.PAGE__LABELPROXY:
				return labelproxy != null && !labelproxy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
