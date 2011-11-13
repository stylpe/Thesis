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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.Line;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Graphics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.NodeGraphicsImpl#getFill <em>Fill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeGraphicsImpl extends GraphicsImpl implements NodeGraphics {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Coordinate position;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Coordinate dimension;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Line line;

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Fill fill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeGraphicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.NODE_GRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Coordinate newPosition, NotificationChain msgs) {
		Coordinate oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Coordinate newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Coordinate newDimension, NotificationChain msgs) {
		Coordinate oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION, oldDimension, newDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Coordinate newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject)dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject)newDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION, newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(Line newLine, NotificationChain msgs) {
		Line oldLine = line;
		line = newLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__LINE, oldLine, newLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(Line newLine) {
		if (newLine != line) {
			NotificationChain msgs = null;
			if (line != null)
				msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__LINE, null, msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__LINE, null, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__LINE, newLine, newLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fill getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFill(Fill newFill, NotificationChain msgs) {
		Fill oldFill = fill;
		fill = newFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__FILL, oldFill, newFill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(Fill newFill) {
		if (newFill != fill) {
			NotificationChain msgs = null;
			if (fill != null)
				msgs = ((InternalEObject)fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__FILL, null, msgs);
			if (newFill != null)
				msgs = ((InternalEObject)newFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.NODE_GRAPHICS__FILL, null, msgs);
			msgs = basicSetFill(newFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.NODE_GRAPHICS__FILL, newFill, newFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
				return basicSetPosition(null, msgs);
			case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
				return basicSetDimension(null, msgs);
			case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
				return basicSetLine(null, msgs);
			case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
				return basicSetFill(null, msgs);
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
			case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
				return getPosition();
			case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
				return getDimension();
			case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
				return getLine();
			case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
				return getFill();
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
			case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
				setPosition((Coordinate)newValue);
				return;
			case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
				setDimension((Coordinate)newValue);
				return;
			case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
				setLine((Line)newValue);
				return;
			case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
				setFill((Fill)newValue);
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
			case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
				setPosition((Coordinate)null);
				return;
			case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
				setDimension((Coordinate)null);
				return;
			case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
				setLine((Line)null);
				return;
			case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
				setFill((Fill)null);
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
			case PnmlcoremodelPackage.NODE_GRAPHICS__POSITION:
				return position != null;
			case PnmlcoremodelPackage.NODE_GRAPHICS__DIMENSION:
				return dimension != null;
			case PnmlcoremodelPackage.NODE_GRAPHICS__LINE:
				return line != null;
			case PnmlcoremodelPackage.NODE_GRAPHICS__FILL:
				return fill != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeGraphicsImpl
