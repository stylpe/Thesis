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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.ExtendedPNMLMetaData;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.PNMLMetaData;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PetriNetTypeImpl extends EObjectImpl implements PetriNetType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.PETRI_NET_TYPE;
	}

	// @generated NOT
	// @author eki
	public PetriNetType createPetriNetType() {
		EClass eClass = this.eClass();
		EPackage ePackage = eClass.getEPackage();
		EObject object = ePackage.getEFactoryInstance().create(eClass);
		if (object != null && object instanceof PetriNetType) {
			return (PetriNetType) object;
		}
		return PnmlcoremodelFactory.eINSTANCE.createEmptyType();
	}
	 
	// @generated NOT
	// @author eki
	public PetriNetType createPetriNetType(String type) {
		if (type.equals(this.toString())) {
			return createPetriNetType();
		}
		return null;
	}

	// @generated NOT
	// @author eki
	public Place createPlace() {
		EClass typeClass = this.eClass();
		EPackage ePackage = typeClass.getEPackage();
		EClassifier objectClass = ePackage.getEClassifier("Place");
		if (objectClass != null && objectClass instanceof EClass) {
			EObject object = ePackage.getEFactoryInstance().create((EClass) objectClass);
			if (object != null && object instanceof Place) {
		    	return (Place) object;
			}
		}
	    
		return PnmlcoremodelFactory.eINSTANCE.createPlace();
	}
	
	// @generated NOT
	// @author eki
	public Transition createTransition() {
		EClass typeClass = this.eClass();
		EPackage ePackage = typeClass.getEPackage();
		EClassifier objectClass = ePackage.getEClassifier("Transition");
		if (objectClass != null && objectClass instanceof EClass) {
			EObject object = ePackage.getEFactoryInstance().create((EClass) objectClass);
			if (object != null && object instanceof Transition) {
		    	return (Transition) object;
			}
		}
		
		return PnmlcoremodelFactory.eINSTANCE.createTransition();
	}
	
	// @generated NOT
	// @author eki
	public Arc createArc() {
		EClass typeClass = this.eClass();
		EPackage ePackage = typeClass.getEPackage();
		EClassifier objectClass = ePackage.getEClassifier("Arc");
		if (objectClass != null && objectClass instanceof EClass) {
			EObject object = ePackage.getEFactoryInstance().create((EClass) objectClass);
			if (object != null && object instanceof Arc) {
		    	return (Arc) object;
			}
		}
		
		return PnmlcoremodelFactory.eINSTANCE.createArc();
	}
	
	// @generated NOT
	// @author eki
	public Page createPage() {
		EClass typeClass = this.eClass();
		EPackage ePackage = typeClass.getEPackage();
		EClassifier objectClass = ePackage.getEClassifier("Page");
		if (objectClass != null && objectClass instanceof EClass) {
			EObject object = ePackage.getEFactoryInstance().create((EClass) objectClass);
			if (object != null && object instanceof Page) {
		    	return (Page) object;
			}
		}
		
		return PnmlcoremodelFactory.eINSTANCE.createPage();
	}
	
	@Override
	public void registerExtendedPNMLMetaData(ExtendedPNMLMetaData metadata) {
		// nothing
		
	}

	@Override
	public void registerPNMLMetaData(PNMLMetaData metadata) {
		EClass typeClass = this.eClass();
		EPackage ePackage =typeClass.getEPackage();
		for (EClassifier classifier: ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				EClass eClass = (EClass) classifier;
				if (PnmlcoremodelPackage.eINSTANCE.getLabel().isSuperTypeOf(eClass) && 
						!(StructuredpntypemodelPackage.eINSTANCE.getStructuredLabel()) .isSuperTypeOf(eClass) ) {
					// if there is a class that inherits from label, but is not a structural label
					EStructuralFeature feature = eClass.getEStructuralFeature("text");
					if (feature != null) {
						// and there is a text feature, then make this feature an XML Element feature
						metadata.setFeatureKind(feature, ExtendedMetaData.ELEMENT_FEATURE );
					}	
				}
			}
		}
	}

	// Makes sure that concrete classes implement the toString method again! 
	// @generated NOT
	@Override
	abstract public String toString();

} //PetriNetTypeImpl
