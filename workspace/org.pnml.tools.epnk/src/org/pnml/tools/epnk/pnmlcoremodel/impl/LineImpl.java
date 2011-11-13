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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.pnml.tools.epnk.helpers.NotImplemented;

import org.pnml.tools.epnk.pnmlcoremodel.Line;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.LineImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends EObjectImpl implements Line {
	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented SHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented shape = SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented style = STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(NotImplemented newShape) {
		NotImplemented oldShape = shape;
		shape = newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.LINE__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(NotImplemented newColor) {
		NotImplemented oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.LINE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.LINE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(NotImplemented newStyle) {
		NotImplemented oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.LINE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PnmlcoremodelPackage.LINE__SHAPE:
				return getShape();
			case PnmlcoremodelPackage.LINE__COLOR:
				return getColor();
			case PnmlcoremodelPackage.LINE__WIDTH:
				return getWidth();
			case PnmlcoremodelPackage.LINE__STYLE:
				return getStyle();
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
			case PnmlcoremodelPackage.LINE__SHAPE:
				setShape((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.LINE__COLOR:
				setColor((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.LINE__WIDTH:
				setWidth((Float)newValue);
				return;
			case PnmlcoremodelPackage.LINE__STYLE:
				setStyle((NotImplemented)newValue);
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
			case PnmlcoremodelPackage.LINE__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case PnmlcoremodelPackage.LINE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case PnmlcoremodelPackage.LINE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PnmlcoremodelPackage.LINE__STYLE:
				setStyle(STYLE_EDEFAULT);
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
			case PnmlcoremodelPackage.LINE__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case PnmlcoremodelPackage.LINE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case PnmlcoremodelPackage.LINE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case PnmlcoremodelPackage.LINE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
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
		result.append(" (shape: "); //$NON-NLS-1$
		result.append(shape);
		result.append(", color: "); //$NON-NLS-1$
		result.append(color);
		result.append(", width: "); //$NON-NLS-1$
		result.append(width);
		result.append(", style: "); //$NON-NLS-1$
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //LineImpl
