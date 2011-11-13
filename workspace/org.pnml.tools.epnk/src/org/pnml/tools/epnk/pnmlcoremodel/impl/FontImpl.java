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

import org.pnml.tools.epnk.pnmlcoremodel.Font;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FontImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontImpl extends EObjectImpl implements Font {
	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented family = FAMILY_EDEFAULT;

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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecoration() <em>Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented DECORATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecoration() <em>Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoration()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented decoration = DECORATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final float ROTATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected float rotation = ROTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.FONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(NotImplemented newFamily) {
		NotImplemented oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FONT__FAMILY, oldFamily, family));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FONT__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(NotImplemented newWeight) {
		NotImplemented oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FONT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(NotImplemented newSize) {
		NotImplemented oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FONT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getDecoration() {
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoration(NotImplemented newDecoration) {
		NotImplemented oldDecoration = decoration;
		decoration = newDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FONT__DECORATION, oldDecoration, decoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(NotImplemented newAlign) {
		NotImplemented oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FONT__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(float newRotation) {
		float oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FONT__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PnmlcoremodelPackage.FONT__FAMILY:
				return getFamily();
			case PnmlcoremodelPackage.FONT__STYLE:
				return getStyle();
			case PnmlcoremodelPackage.FONT__WEIGHT:
				return getWeight();
			case PnmlcoremodelPackage.FONT__SIZE:
				return getSize();
			case PnmlcoremodelPackage.FONT__DECORATION:
				return getDecoration();
			case PnmlcoremodelPackage.FONT__ALIGN:
				return getAlign();
			case PnmlcoremodelPackage.FONT__ROTATION:
				return getRotation();
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
			case PnmlcoremodelPackage.FONT__FAMILY:
				setFamily((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FONT__STYLE:
				setStyle((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FONT__WEIGHT:
				setWeight((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FONT__SIZE:
				setSize((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FONT__DECORATION:
				setDecoration((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FONT__ALIGN:
				setAlign((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FONT__ROTATION:
				setRotation((Float)newValue);
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
			case PnmlcoremodelPackage.FONT__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FONT__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FONT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FONT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FONT__DECORATION:
				setDecoration(DECORATION_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FONT__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FONT__ROTATION:
				setRotation(ROTATION_EDEFAULT);
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
			case PnmlcoremodelPackage.FONT__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case PnmlcoremodelPackage.FONT__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case PnmlcoremodelPackage.FONT__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case PnmlcoremodelPackage.FONT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case PnmlcoremodelPackage.FONT__DECORATION:
				return DECORATION_EDEFAULT == null ? decoration != null : !DECORATION_EDEFAULT.equals(decoration);
			case PnmlcoremodelPackage.FONT__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case PnmlcoremodelPackage.FONT__ROTATION:
				return rotation != ROTATION_EDEFAULT;
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
		result.append(" (family: "); //$NON-NLS-1$
		result.append(family);
		result.append(", style: "); //$NON-NLS-1$
		result.append(style);
		result.append(", weight: "); //$NON-NLS-1$
		result.append(weight);
		result.append(", size: "); //$NON-NLS-1$
		result.append(size);
		result.append(", decoration: "); //$NON-NLS-1$
		result.append(decoration);
		result.append(", align: "); //$NON-NLS-1$
		result.append(align);
		result.append(", rotation: "); //$NON-NLS-1$
		result.append(rotation);
		result.append(')');
		return result.toString();
	}

} //FontImpl
