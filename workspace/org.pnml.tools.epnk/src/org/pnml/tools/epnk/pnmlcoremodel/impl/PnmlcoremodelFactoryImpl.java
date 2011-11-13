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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pnml.tools.epnk.helpers.NotImplemented;
import org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.EmptyType;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.Font;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Line;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PnmlcoremodelFactoryImpl extends EFactoryImpl implements PnmlcoremodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PnmlcoremodelFactory init() {
		try {
			PnmlcoremodelFactory thePnmlcoremodelFactory = (PnmlcoremodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/pnmlcoremodel"); //$NON-NLS-1$ 
			if (thePnmlcoremodelFactory != null) {
				return thePnmlcoremodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PnmlcoremodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnmlcoremodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PnmlcoremodelPackage.PETRI_NET_DOC: return createPetriNetDoc();
			case PnmlcoremodelPackage.PETRI_NET: return createPetriNet();
			case PnmlcoremodelPackage.PAGE: return createPage();
			case PnmlcoremodelPackage.LABEL_PROXY: return createLabelProxy();
			case PnmlcoremodelPackage.ARC: return createArc();
			case PnmlcoremodelPackage.PLACE: return createPlace();
			case PnmlcoremodelPackage.REF_PLACE: return createRefPlace();
			case PnmlcoremodelPackage.REF_TRANSITION: return createRefTransition();
			case PnmlcoremodelPackage.TRANSITION: return createTransition();
			case PnmlcoremodelPackage.NAME: return createName();
			case PnmlcoremodelPackage.ARC_GRAPHICS: return createArcGraphics();
			case PnmlcoremodelPackage.NODE_GRAPHICS: return createNodeGraphics();
			case PnmlcoremodelPackage.ANNOTATION_GRAPHICS: return createAnnotationGraphics();
			case PnmlcoremodelPackage.LINE: return createLine();
			case PnmlcoremodelPackage.COORDINATE: return createCoordinate();
			case PnmlcoremodelPackage.FILL: return createFill();
			case PnmlcoremodelPackage.FONT: return createFont();
			case PnmlcoremodelPackage.EMPTY_TYPE: return createEmptyType();
			case PnmlcoremodelPackage.TOOL_INFO_TEXT: return createToolInfoText();
			case PnmlcoremodelPackage.PAGE_LABEL_PROXY: return createPageLabelProxy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PnmlcoremodelPackage.LINE_SHAPE:
				return createLineShapeFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.LINE_STYLE:
				return createLineStyleFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.GRADIENT_ROTATION:
				return createGradientRotationFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.FONT_FAMILY:
				return createFontFamilyFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.FONT_WEIGHT:
				return createFontWeightFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.FONT_DECORATION:
				return createFontDecorationFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.FONT_SIZE:
				return createFontSizeFromString(eDataType, initialValue);
			case PnmlcoremodelPackage.FONT_ALIGN:
				return createFontAlignFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PnmlcoremodelPackage.LINE_SHAPE:
				return convertLineShapeToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.LINE_STYLE:
				return convertLineStyleToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.GRADIENT_ROTATION:
				return convertGradientRotationToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.FONT_FAMILY:
				return convertFontFamilyToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.FONT_WEIGHT:
				return convertFontWeightToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.FONT_DECORATION:
				return convertFontDecorationToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.FONT_SIZE:
				return convertFontSizeToString(eDataType, instanceValue);
			case PnmlcoremodelPackage.FONT_ALIGN:
				return convertFontAlignToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetDoc createPetriNetDoc() {
		PetriNetDocImpl petriNetDoc = new PetriNetDocImpl();
		return petriNetDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelProxy createLabelProxy() {
		LabelProxyImpl labelProxy = new LabelProxyImpl();
		return labelProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefPlace createRefPlace() {
		RefPlaceImpl refPlace = new RefPlaceImpl();
		return refPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTransition createRefTransition() {
		RefTransitionImpl refTransition = new RefTransitionImpl();
		return refTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcGraphics createArcGraphics() {
		ArcGraphicsImpl arcGraphics = new ArcGraphicsImpl();
		return arcGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeGraphics createNodeGraphics() {
		NodeGraphicsImpl nodeGraphics = new NodeGraphicsImpl();
		return nodeGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationGraphics createAnnotationGraphics() {
		AnnotationGraphicsImpl annotationGraphics = new AnnotationGraphicsImpl();
		return annotationGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate createCoordinate() {
		CoordinateImpl coordinate = new CoordinateImpl();
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fill createFill() {
		FillImpl fill = new FillImpl();
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyType createEmptyType() {
		EmptyTypeImpl emptyType = new EmptyTypeImpl();
		return emptyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolInfoText createToolInfoText() {
		ToolInfoTextImpl toolInfoText = new ToolInfoTextImpl();
		return toolInfoText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageLabelProxy createPageLabelProxy() {
		PageLabelProxyImpl pageLabelProxy = new PageLabelProxyImpl();
		return pageLabelProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createLineShapeFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineShapeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createColorFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createLineStyleFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineStyleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createURIFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createGradientRotationFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradientRotationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createFontFamilyFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFamilyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createFontStyleFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createFontWeightFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontWeightToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createFontDecorationFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontDecorationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createFontSizeFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontSizeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplemented createFontAlignFromString(EDataType eDataType, String initialValue) {
		return (NotImplemented)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontAlignToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnmlcoremodelPackage getPnmlcoremodelPackage() {
		return (PnmlcoremodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PnmlcoremodelPackage getPackage() {
		return PnmlcoremodelPackage.eINSTANCE;
	}

} //PnmlcoremodelFactoryImpl
