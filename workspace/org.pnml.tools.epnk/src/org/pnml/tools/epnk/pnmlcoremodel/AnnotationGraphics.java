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
package org.pnml.tools.epnk.pnmlcoremodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Graphics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFill <em>Fill</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getLine <em>Line</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getAnnotationGraphics()
 * @model
 * @generated
 */
public interface AnnotationGraphics extends Graphics {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Fill)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getAnnotationGraphics_Fill()
	 * @model containment="true"
	 * @generated
	 */
	Fill getFill();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFill <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Fill value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getAnnotationGraphics_Line()
	 * @model containment="true"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Coordinate)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getAnnotationGraphics_Offset()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getOffset();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getAnnotationGraphics_Font()
	 * @model containment="true"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

} // AnnotationGraphics
