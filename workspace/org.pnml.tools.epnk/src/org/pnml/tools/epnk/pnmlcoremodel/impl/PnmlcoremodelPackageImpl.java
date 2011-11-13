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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.pnml.tools.epnk.helpers.NotImplemented;
import org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Attribute;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.EmptyType;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.Font;
import org.pnml.tools.epnk.pnmlcoremodel.Graphics;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Line;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfoText;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PnmlcoremodelPackageImpl extends EPackageImpl implements PnmlcoremodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetDocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcGraphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeGraphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationGraphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolInfoTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageLabelProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineShapeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineStyleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gradientRotationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontFamilyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontStyleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontWeightEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontDecorationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontSizeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontAlignEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PnmlcoremodelPackageImpl() {
		super(eNS_URI, PnmlcoremodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PnmlcoremodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PnmlcoremodelPackage init() {
		if (isInited) return (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Obtain or create and register package
		PnmlcoremodelPackageImpl thePnmlcoremodelPackage = (PnmlcoremodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PnmlcoremodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PnmlcoremodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePnmlcoremodelPackage.createPackageContents();

		// Initialize created meta-data
		thePnmlcoremodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePnmlcoremodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PnmlcoremodelPackage.eNS_URI, thePnmlcoremodelPackage);
		return thePnmlcoremodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNetDoc() {
		return petriNetDocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNetDoc_Net() {
		return (EReference)petriNetDocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNet() {
		return petriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Name() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Page() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Toolspecific() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Unknown() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Type() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Object() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PageLabelProxy() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Labelproxy() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Name() {
		return (EReference)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Toolspecific() {
		return (EReference)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Graphics() {
		return (EReference)objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Unknown() {
		return (EReference)objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelProxy() {
		return labelProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelProxy_Label() {
		return (EReference)labelProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelProxy_Text() {
		return (EAttribute)labelProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelProxy_Object() {
		return (EReference)labelProxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphics() {
		return graphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Out() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_In() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Source() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Target() {
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceNode() {
		return placeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionNode() {
		return transitionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefPlace() {
		return refPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefPlace_Ref() {
		return (EReference)refPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefTransition() {
		return refTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefTransition_Ref() {
		return (EReference)refTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Text() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Toolspecific() {
		return (EReference)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Graphics() {
		return (EReference)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Unknown() {
		return (EReference)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcGraphics() {
		return arcGraphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcGraphics_Line() {
		return (EReference)arcGraphicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcGraphics_Position() {
		return (EReference)arcGraphicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeGraphics() {
		return nodeGraphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Position() {
		return (EReference)nodeGraphicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Dimension() {
		return (EReference)nodeGraphicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Line() {
		return (EReference)nodeGraphicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphics_Fill() {
		return (EReference)nodeGraphicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationGraphics() {
		return annotationGraphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Fill() {
		return (EReference)annotationGraphicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Line() {
		return (EReference)annotationGraphicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Offset() {
		return (EReference)annotationGraphicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationGraphics_Font() {
		return (EReference)annotationGraphicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Shape() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Color() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Width() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Style() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinate() {
		return coordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_X() {
		return (EAttribute)coordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_Y() {
		return (EAttribute)coordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFill() {
		return fillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Color() {
		return (EAttribute)fillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Image() {
		return (EAttribute)fillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_GradientColor() {
		return (EAttribute)fillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Gradientrotation() {
		return (EAttribute)fillEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFont() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Family() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Style() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Weight() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Size() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Decoration() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Align() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Rotation() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNetType() {
		return petriNetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyType() {
		return emptyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolInfoText() {
		return toolInfoTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolInfoText_Info() {
		return (EAttribute)toolInfoTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolInfo() {
		return toolInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolInfo_Tool() {
		return (EAttribute)toolInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolInfo_Version() {
		return (EAttribute)toolInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getID() {
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getID_Id() {
		return (EAttribute)idEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageLabelProxy() {
		return pageLabelProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageLabelProxy_Text() {
		return (EAttribute)pageLabelProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLabelProxy_Label() {
		return (EReference)pageLabelProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineShape() {
		return lineShapeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineStyle() {
		return lineStyleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGradientRotation() {
		return gradientRotationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontFamily() {
		return fontFamilyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontStyle() {
		return fontStyleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontWeight() {
		return fontWeightEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontDecoration() {
		return fontDecorationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontSize() {
		return fontSizeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontAlign() {
		return fontAlignEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnmlcoremodelFactory getPnmlcoremodelFactory() {
		return (PnmlcoremodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		petriNetDocEClass = createEClass(PETRI_NET_DOC);
		createEReference(petriNetDocEClass, PETRI_NET_DOC__NET);

		petriNetEClass = createEClass(PETRI_NET);
		createEReference(petriNetEClass, PETRI_NET__TYPE);
		createEReference(petriNetEClass, PETRI_NET__NAME);
		createEReference(petriNetEClass, PETRI_NET__PAGE);
		createEReference(petriNetEClass, PETRI_NET__TOOLSPECIFIC);
		createEReference(petriNetEClass, PETRI_NET__UNKNOWN);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__OBJECT);
		createEReference(pageEClass, PAGE__PAGE_LABEL_PROXY);
		createEReference(pageEClass, PAGE__LABELPROXY);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__NAME);
		createEReference(objectEClass, OBJECT__TOOLSPECIFIC);
		createEReference(objectEClass, OBJECT__GRAPHICS);
		createEReference(objectEClass, OBJECT__UNKNOWN);

		labelProxyEClass = createEClass(LABEL_PROXY);
		createEReference(labelProxyEClass, LABEL_PROXY__LABEL);
		createEAttribute(labelProxyEClass, LABEL_PROXY__TEXT);
		createEReference(labelProxyEClass, LABEL_PROXY__OBJECT);

		graphicsEClass = createEClass(GRAPHICS);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUT);
		createEReference(nodeEClass, NODE__IN);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);

		placeNodeEClass = createEClass(PLACE_NODE);

		transitionNodeEClass = createEClass(TRANSITION_NODE);

		placeEClass = createEClass(PLACE);

		refPlaceEClass = createEClass(REF_PLACE);
		createEReference(refPlaceEClass, REF_PLACE__REF);

		refTransitionEClass = createEClass(REF_TRANSITION);
		createEReference(refTransitionEClass, REF_TRANSITION__REF);

		transitionEClass = createEClass(TRANSITION);

		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__TEXT);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__TOOLSPECIFIC);
		createEReference(labelEClass, LABEL__GRAPHICS);
		createEReference(labelEClass, LABEL__UNKNOWN);

		arcGraphicsEClass = createEClass(ARC_GRAPHICS);
		createEReference(arcGraphicsEClass, ARC_GRAPHICS__LINE);
		createEReference(arcGraphicsEClass, ARC_GRAPHICS__POSITION);

		nodeGraphicsEClass = createEClass(NODE_GRAPHICS);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__POSITION);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__DIMENSION);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__LINE);
		createEReference(nodeGraphicsEClass, NODE_GRAPHICS__FILL);

		annotationGraphicsEClass = createEClass(ANNOTATION_GRAPHICS);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__FILL);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__LINE);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__OFFSET);
		createEReference(annotationGraphicsEClass, ANNOTATION_GRAPHICS__FONT);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__SHAPE);
		createEAttribute(lineEClass, LINE__COLOR);
		createEAttribute(lineEClass, LINE__WIDTH);
		createEAttribute(lineEClass, LINE__STYLE);

		coordinateEClass = createEClass(COORDINATE);
		createEAttribute(coordinateEClass, COORDINATE__X);
		createEAttribute(coordinateEClass, COORDINATE__Y);

		fillEClass = createEClass(FILL);
		createEAttribute(fillEClass, FILL__COLOR);
		createEAttribute(fillEClass, FILL__IMAGE);
		createEAttribute(fillEClass, FILL__GRADIENT_COLOR);
		createEAttribute(fillEClass, FILL__GRADIENTROTATION);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__FAMILY);
		createEAttribute(fontEClass, FONT__STYLE);
		createEAttribute(fontEClass, FONT__WEIGHT);
		createEAttribute(fontEClass, FONT__SIZE);
		createEAttribute(fontEClass, FONT__DECORATION);
		createEAttribute(fontEClass, FONT__ALIGN);
		createEAttribute(fontEClass, FONT__ROTATION);

		petriNetTypeEClass = createEClass(PETRI_NET_TYPE);

		emptyTypeEClass = createEClass(EMPTY_TYPE);

		toolInfoTextEClass = createEClass(TOOL_INFO_TEXT);
		createEAttribute(toolInfoTextEClass, TOOL_INFO_TEXT__INFO);

		toolInfoEClass = createEClass(TOOL_INFO);
		createEAttribute(toolInfoEClass, TOOL_INFO__TOOL);
		createEAttribute(toolInfoEClass, TOOL_INFO__VERSION);

		idEClass = createEClass(ID);
		createEAttribute(idEClass, ID__ID);

		pageLabelProxyEClass = createEClass(PAGE_LABEL_PROXY);
		createEAttribute(pageLabelProxyEClass, PAGE_LABEL_PROXY__TEXT);
		createEReference(pageLabelProxyEClass, PAGE_LABEL_PROXY__LABEL);

		attributeEClass = createEClass(ATTRIBUTE);

		// Create data types
		lineShapeEDataType = createEDataType(LINE_SHAPE);
		colorEDataType = createEDataType(COLOR);
		lineStyleEDataType = createEDataType(LINE_STYLE);
		uriEDataType = createEDataType(URI);
		gradientRotationEDataType = createEDataType(GRADIENT_ROTATION);
		fontFamilyEDataType = createEDataType(FONT_FAMILY);
		fontStyleEDataType = createEDataType(FONT_STYLE);
		fontWeightEDataType = createEDataType(FONT_WEIGHT);
		fontDecorationEDataType = createEDataType(FONT_DECORATION);
		fontSizeEDataType = createEDataType(FONT_SIZE);
		fontAlignEDataType = createEDataType(FONT_ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		petriNetEClass.getESuperTypes().add(this.getID());
		pageEClass.getESuperTypes().add(this.getObject());
		objectEClass.getESuperTypes().add(this.getID());
		nodeEClass.getESuperTypes().add(this.getObject());
		arcEClass.getESuperTypes().add(this.getObject());
		placeNodeEClass.getESuperTypes().add(this.getNode());
		transitionNodeEClass.getESuperTypes().add(this.getNode());
		placeEClass.getESuperTypes().add(this.getPlaceNode());
		refPlaceEClass.getESuperTypes().add(this.getPlaceNode());
		refTransitionEClass.getESuperTypes().add(this.getTransitionNode());
		transitionEClass.getESuperTypes().add(this.getTransitionNode());
		nameEClass.getESuperTypes().add(this.getLabel());
		arcGraphicsEClass.getESuperTypes().add(this.getGraphics());
		nodeGraphicsEClass.getESuperTypes().add(this.getGraphics());
		annotationGraphicsEClass.getESuperTypes().add(this.getGraphics());
		emptyTypeEClass.getESuperTypes().add(this.getPetriNetType());
		toolInfoTextEClass.getESuperTypes().add(this.getToolInfo());
		attributeEClass.getESuperTypes().add(this.getLabel());

		// Initialize classes and features; add operations and parameters
		initEClass(petriNetDocEClass, PetriNetDoc.class, "PetriNetDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPetriNetDoc_Net(), this.getPetriNet(), null, "net", null, 1, -1, PetriNetDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(petriNetEClass, PetriNet.class, "PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPetriNet_Type(), this.getPetriNetType(), null, "type", null, 1, 1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPetriNet_Name(), this.getName_(), null, "name", null, 0, 1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPetriNet_Page(), this.getPage(), null, "page", null, 1, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPetriNet_Toolspecific(), this.getToolInfo(), null, "toolspecific", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPetriNet_Unknown(), theXMLTypePackage.getAnyType(), null, "unknown", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPage_Object(), this.getObject(), null, "object", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPage_PageLabelProxy(), this.getPageLabelProxy(), null, "pageLabelProxy", null, 0, -1, Page.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPage_Labelproxy(), this.getLabelProxy(), null, "labelproxy", null, 0, -1, Page.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(objectEClass, org.pnml.tools.epnk.pnmlcoremodel.Object.class, "Object", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getObject_Name(), this.getName_(), null, "name", null, 0, 1, org.pnml.tools.epnk.pnmlcoremodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getObject_Toolspecific(), this.getToolInfo(), null, "toolspecific", null, 0, -1, org.pnml.tools.epnk.pnmlcoremodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getObject_Graphics(), this.getGraphics(), null, "graphics", null, 0, 1, org.pnml.tools.epnk.pnmlcoremodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getObject_Unknown(), theXMLTypePackage.getAnyType(), null, "unknown", null, 0, -1, org.pnml.tools.epnk.pnmlcoremodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(labelProxyEClass, LabelProxy.class, "LabelProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLabelProxy_Label(), this.getLabel(), null, "label", null, 1, 1, LabelProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLabelProxy_Text(), ecorePackage.getEString(), "text", null, 1, 1, LabelProxy.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLabelProxy_Object(), this.getObject(), null, "object", null, 0, 1, LabelProxy.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(graphicsEClass, Graphics.class, "Graphics", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNode_Out(), this.getArc(), this.getArc_Source(), "out", null, 0, -1, Node.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNode_In(), this.getArc(), this.getArc_Target(), "in", null, 0, -1, Node.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArc_Source(), this.getNode(), this.getNode_Out(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArc_Target(), this.getNode(), this.getNode_In(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(placeNodeEClass, PlaceNode.class, "PlaceNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(transitionNodeEClass, TransitionNode.class, "TransitionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(refPlaceEClass, RefPlace.class, "RefPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRefPlace_Ref(), this.getPlaceNode(), null, "ref", null, 1, 1, RefPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(refTransitionEClass, RefTransition.class, "RefTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRefTransition_Ref(), this.getTransitionNode(), null, "ref", null, 1, 1, RefTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getName_Text(), ecorePackage.getEString(), "text", null, 1, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLabel_Toolspecific(), this.getToolInfo(), null, "toolspecific", null, 0, -1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLabel_Graphics(), this.getGraphics(), null, "graphics", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLabel_Unknown(), theXMLTypePackage.getAnyType(), null, "unknown", null, 0, -1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(arcGraphicsEClass, ArcGraphics.class, "ArcGraphics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArcGraphics_Line(), this.getLine(), null, "line", null, 0, 1, ArcGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArcGraphics_Position(), this.getCoordinate(), null, "position", null, 0, -1, ArcGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(nodeGraphicsEClass, NodeGraphics.class, "NodeGraphics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNodeGraphics_Position(), this.getCoordinate(), null, "position", null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNodeGraphics_Dimension(), this.getCoordinate(), null, "dimension", null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNodeGraphics_Line(), this.getLine(), null, "line", null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNodeGraphics_Fill(), this.getFill(), null, "fill", null, 0, 1, NodeGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(annotationGraphicsEClass, AnnotationGraphics.class, "AnnotationGraphics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAnnotationGraphics_Fill(), this.getFill(), null, "fill", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAnnotationGraphics_Line(), this.getLine(), null, "line", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAnnotationGraphics_Offset(), this.getCoordinate(), null, "offset", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAnnotationGraphics_Font(), this.getFont(), null, "font", null, 0, 1, AnnotationGraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLine_Shape(), this.getLineShape(), "shape", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLine_Color(), this.getColor(), "color", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLine_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLine_Style(), this.getLineStyle(), "style", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCoordinate_X(), ecorePackage.getEFloat(), "x", "0.0", 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCoordinate_Y(), ecorePackage.getEFloat(), "y", "0.0", 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(fillEClass, Fill.class, "Fill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFill_Color(), this.getColor(), "color", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFill_Image(), this.getURI(), "image", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFill_GradientColor(), this.getColor(), "gradientColor", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFill_Gradientrotation(), this.getGradientRotation(), "gradientrotation", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFont_Family(), this.getFontFamily(), "family", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFont_Style(), this.getFontStyle(), "style", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFont_Weight(), this.getFontWeight(), "weight", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFont_Size(), this.getFontSize(), "size", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFont_Decoration(), this.getFontDecoration(), "decoration", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFont_Align(), this.getFontAlign(), "align", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFont_Rotation(), ecorePackage.getEFloat(), "rotation", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(petriNetTypeEClass, PetriNetType.class, "PetriNetType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(emptyTypeEClass, EmptyType.class, "EmptyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(toolInfoTextEClass, ToolInfoText.class, "ToolInfoText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getToolInfoText_Info(), ecorePackage.getEString(), "info", null, 0, 1, ToolInfoText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(toolInfoEClass, ToolInfo.class, "ToolInfo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getToolInfo_Tool(), ecorePackage.getEString(), "tool", "", 1, 1, ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getToolInfo_Version(), ecorePackage.getEString(), "version", null, 0, 1, ToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(idEClass, org.pnml.tools.epnk.pnmlcoremodel.ID.class, "ID", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getID_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, org.pnml.tools.epnk.pnmlcoremodel.ID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(pageLabelProxyEClass, PageLabelProxy.class, "PageLabelProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPageLabelProxy_Text(), ecorePackage.getEString(), "text", null, 1, 1, PageLabelProxy.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPageLabelProxy_Label(), this.getLabel(), null, "label", null, 1, 1, PageLabelProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize data types
		initEDataType(lineShapeEDataType, NotImplemented.class, "LineShape", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(colorEDataType, NotImplemented.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(lineStyleEDataType, NotImplemented.class, "LineStyle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(uriEDataType, NotImplemented.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(gradientRotationEDataType, NotImplemented.class, "GradientRotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fontFamilyEDataType, NotImplemented.class, "FontFamily", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fontStyleEDataType, NotImplemented.class, "FontStyle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fontWeightEDataType, NotImplemented.class, "FontWeight", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fontDecorationEDataType, NotImplemented.class, "FontDecoration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fontSizeEDataType, NotImplemented.class, "FontSize", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fontAlignEDataType, NotImplemented.class, "FontAlign", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //PnmlcoremodelPackageImpl
