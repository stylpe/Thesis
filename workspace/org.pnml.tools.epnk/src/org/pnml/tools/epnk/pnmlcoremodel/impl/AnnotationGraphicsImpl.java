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

import org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.Font;
import org.pnml.tools.epnk.pnmlcoremodel.Line;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Graphics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.impl.AnnotationGraphicsImpl#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationGraphicsImpl extends GraphicsImpl implements AnnotationGraphics {
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
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Line line;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Coordinate offset;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationGraphicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.ANNOTATION_GRAPHICS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL, oldFill, newFill);
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
				msgs = ((InternalEObject)fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL, null, msgs);
			if (newFill != null)
				msgs = ((InternalEObject)newFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL, null, msgs);
			msgs = basicSetFill(newFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL, newFill, newFill));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE, oldLine, newLine);
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
				msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE, null, msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE, null, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE, newLine, newLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(Coordinate newOffset, NotificationChain msgs) {
		Coordinate oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Coordinate newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL:
				return basicSetFill(null, msgs);
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE:
				return basicSetLine(null, msgs);
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET:
				return basicSetOffset(null, msgs);
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT:
				return basicSetFont(null, msgs);
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
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL:
				return getFill();
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE:
				return getLine();
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET:
				return getOffset();
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT:
				return getFont();
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
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL:
				setFill((Fill)newValue);
				return;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE:
				setLine((Line)newValue);
				return;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET:
				setOffset((Coordinate)newValue);
				return;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT:
				setFont((Font)newValue);
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
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL:
				setFill((Fill)null);
				return;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE:
				setLine((Line)null);
				return;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET:
				setOffset((Coordinate)null);
				return;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT:
				setFont((Font)null);
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
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FILL:
				return fill != null;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__LINE:
				return line != null;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__OFFSET:
				return offset != null;
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS__FONT:
				return font != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationGraphicsImpl
