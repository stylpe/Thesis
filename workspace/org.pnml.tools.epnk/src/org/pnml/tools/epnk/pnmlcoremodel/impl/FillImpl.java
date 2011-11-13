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

import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl#getGradientColor <em>Gradient Color</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.FillImpl#getGradientrotation <em>Gradientrotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FillImpl extends EObjectImpl implements Fill {
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
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientColor() <em>Gradient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientColor()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented GRADIENT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradientColor() <em>Gradient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientColor()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented gradientColor = GRADIENT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientrotation() <em>Gradientrotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientrotation()
	 * @generated
	 * @ordered
	 */
	protected static final NotImplemented GRADIENTROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradientrotation() <em>Gradientrotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientrotation()
	 * @generated
	 * @ordered
	 */
	protected NotImplemented gradientrotation = GRADIENTROTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.FILL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FILL__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(NotImplemented newImage) {
		NotImplemented oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FILL__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getGradientColor() {
		return gradientColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientColor(NotImplemented newGradientColor) {
		NotImplemented oldGradientColor = gradientColor;
		gradientColor = newGradientColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FILL__GRADIENT_COLOR, oldGradientColor, gradientColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented getGradientrotation() {
		return gradientrotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientrotation(NotImplemented newGradientrotation) {
		NotImplemented oldGradientrotation = gradientrotation;
		gradientrotation = newGradientrotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.FILL__GRADIENTROTATION, oldGradientrotation, gradientrotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PnmlcoremodelPackage.FILL__COLOR:
				return getColor();
			case PnmlcoremodelPackage.FILL__IMAGE:
				return getImage();
			case PnmlcoremodelPackage.FILL__GRADIENT_COLOR:
				return getGradientColor();
			case PnmlcoremodelPackage.FILL__GRADIENTROTATION:
				return getGradientrotation();
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
			case PnmlcoremodelPackage.FILL__COLOR:
				setColor((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FILL__IMAGE:
				setImage((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FILL__GRADIENT_COLOR:
				setGradientColor((NotImplemented)newValue);
				return;
			case PnmlcoremodelPackage.FILL__GRADIENTROTATION:
				setGradientrotation((NotImplemented)newValue);
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
			case PnmlcoremodelPackage.FILL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FILL__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FILL__GRADIENT_COLOR:
				setGradientColor(GRADIENT_COLOR_EDEFAULT);
				return;
			case PnmlcoremodelPackage.FILL__GRADIENTROTATION:
				setGradientrotation(GRADIENTROTATION_EDEFAULT);
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
			case PnmlcoremodelPackage.FILL__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case PnmlcoremodelPackage.FILL__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case PnmlcoremodelPackage.FILL__GRADIENT_COLOR:
				return GRADIENT_COLOR_EDEFAULT == null ? gradientColor != null : !GRADIENT_COLOR_EDEFAULT.equals(gradientColor);
			case PnmlcoremodelPackage.FILL__GRADIENTROTATION:
				return GRADIENTROTATION_EDEFAULT == null ? gradientrotation != null : !GRADIENTROTATION_EDEFAULT.equals(gradientrotation);
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
		result.append(" (color: "); //$NON-NLS-1$
		result.append(color);
		result.append(", image: "); //$NON-NLS-1$
		result.append(image);
		result.append(", gradientColor: "); //$NON-NLS-1$
		result.append(gradientColor);
		result.append(", gradientrotation: "); //$NON-NLS-1$
		result.append(gradientrotation);
		result.append(')');
		return result.toString();
	}

} //FillImpl
