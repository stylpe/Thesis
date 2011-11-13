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
package org.pnml.tools.epnk.pntypes.ptnet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.ptnet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetFactoryImpl extends EFactoryImpl implements PtnetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetFactory init() {
		try {
			PtnetFactory thePtnetFactory = (PtnetFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/ptnet"); //$NON-NLS-1$ 
			if (thePtnetFactory != null) {
				return thePtnetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetFactoryImpl() {
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
			case PtnetPackage.PLACE: return createPlace();
			case PtnetPackage.ARC: return createArc();
			case PtnetPackage.PT_MARKING: return createPTMarking();
			case PtnetPackage.PT_ARC_ANNOTATION: return createPTArcAnnotation();
			case PtnetPackage.PT_NET: return createPTNet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
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
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTMarking createPTMarking() {
		PTMarkingImpl ptMarking = new PTMarkingImpl();
		return ptMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTArcAnnotation createPTArcAnnotation() {
		PTArcAnnotationImpl ptArcAnnotation = new PTArcAnnotationImpl();
		return ptArcAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTNet createPTNet() {
		PTNetImpl ptNet = new PTNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetPackage getPtnetPackage() {
		return (PtnetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetPackage getPackage() {
		return PtnetPackage.eINSTANCE;
	}

} //PtnetFactoryImpl
