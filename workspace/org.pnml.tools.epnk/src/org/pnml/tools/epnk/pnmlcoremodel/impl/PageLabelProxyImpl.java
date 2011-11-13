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
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.pnml.tools.epnk.helpers.ReflectiveLabelHandler;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Label Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageLabelProxyImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.PageLabelProxyImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageLabelProxyImpl extends EObjectImpl implements PageLabelProxy {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageLabelProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.PAGE_LABEL_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author eki
	 */
	public String getText() {
		// The value of this feature is stored in the label
		Label label = getLabel();
		if (label != null) {
			return ReflectiveLabelHandler.getValueAsString(label);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.PAGE_LABEL_PROXY__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (Label)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PnmlcoremodelPackage.PAGE_LABEL_PROXY__LABEL, oldLabel, label));
			}
		}
		return label;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelGen(Label newLabel) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.PAGE_LABEL_PROXY__LABEL, oldLabel, label));
	}
	
	/**
	 * This class dispatches changes (SET) on the actual label as corresponding
	 * change of the  ProxyLabel, which is necessary for the GMF editor to update
	 * the labels properly.
	 * 
	 * @generated NOT
	 * @author eki
	 */
	private class NotificationDispatcher extends AdapterImpl {
		private PageLabelProxy proxy;
		
		NotificationDispatcher(PageLabelProxy proxy) {
			this.proxy = proxy;
		}

		@Override
		public void notifyChanged(Notification msg) {
			super.notifyChanged(msg);
			if (proxy != null && proxy instanceof InternalEObject) {
				if (!msg.isTouch()) {
					proxy.eNotify(new ENotificationImpl((InternalEObject) proxy, 
							msg.getEventType(), 
							Notification.NO_FEATURE_ID,
							msg.getOldValue(),
							msg.getNewValue()));
				}
			}
		}
	}

	/*
	 * This dispatcher is attached to to the label of this page proxy label. It will
	 * propagate relevant notifications from the label to the page proxy label.
	 *  
	 * @generated NOT
	 * @author eki
	 */
	private NotificationDispatcher labelListener;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author eki
	 */
	public void setLabel(Label newLabel) {
		// if there is a dispatcher attached, remove it.
		if (labelListener != null) {
			Notifier target  = labelListener.getTarget();
			if (target != null) {
				target.eAdapters().remove(labelListener);
			}
		}
		
		setLabelGen(newLabel);
		
		// if the new label is not null, attach a new dispatcher to it 
		if (label != null) {
			labelListener = new NotificationDispatcher(this); 
			label.eAdapters().add(labelListener);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__TEXT:
				return getText();
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
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
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__TEXT:
				setText((String)newValue);
				return;
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__LABEL:
				setLabel((Label)newValue);
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
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__LABEL:
				setLabel((Label)null);
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
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY__LABEL:
				return label != null;
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
		result.append(" (text: "); //$NON-NLS-1$
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //PageLabelProxyImpl
