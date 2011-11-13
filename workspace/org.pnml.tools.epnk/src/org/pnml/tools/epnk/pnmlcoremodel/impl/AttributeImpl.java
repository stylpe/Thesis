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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.pnmlcoremodel.Attribute;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AttributeImpl extends LabelImpl implements Attribute {
	
	
	// @generated not
	private Adapter adapter;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AttributeImpl() {
		super();
		
		// eki: add an adapter (observer) to the attribute itself, which propagates all
		//      attribute changes to the object it is attached to. This is needed to update 
		//      the graphical appearance of the respective object when a graphical editor
		//      is attached -- in case the appearance should depend on the attribute.
		adapter = new Adapter() {
			
			Notifier notifier;
			
			public Notifier getTarget() {
				return notifier;
			}
			
			public void setTarget(Notifier notifier) {
				this.notifier = notifier;
			}

			public boolean isAdapterForType(Object arg0) {
				return false;
			}

			public void notifyChanged(Notification notification) {
				EObject container = AttributeImpl.this.eContainer();
				if (container != null && container instanceof org.pnml.tools.epnk.pnmlcoremodel.Object &&
						container instanceof InternalEObject) {
					InternalEObject internal = (InternalEObject) container;
					if (notification.getNotifier() == AttributeImpl.this &&
							notification.getEventType() == Notification.SET) {
						container.eNotify(
								new ENotificationImpl(
										internal, 
										Notification.SET,
										Notification.NO_FEATURE_ID,
										notification.getOldValue(),
										notification.getNewValue()));
					}
				}
			}
		};
		this.eAdapters().add(adapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.ATTRIBUTE;
	}

} //AttributeImpl
