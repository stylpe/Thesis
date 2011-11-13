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
package org.pnml.tools.epnk.serialisation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.serialisation.SerialisationFactory
 * @model kind="package"
 * @generated
 */
public interface SerialisationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "serialisation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/serialisation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "serialisation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SerialisationPackage eINSTANCE = org.pnml.tools.epnk.serialisation.impl.SerialisationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.serialisation.impl.AssocClassImpl <em>Assoc Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.serialisation.impl.AssocClassImpl
	 * @see org.pnml.tools.epnk.serialisation.impl.SerialisationPackageImpl#getAssocClass()
	 * @generated
	 */
	int ASSOC_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC_CLASS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC_CLASS__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC_CLASS__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Assoc Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOC_CLASS_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.serialisation.AssocClass <em>Assoc Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc Class</em>'.
	 * @see org.pnml.tools.epnk.serialisation.AssocClass
	 * @generated
	 */
	EClass getAssocClass();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.serialisation.AssocClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.pnml.tools.epnk.serialisation.AssocClass#getSource()
	 * @see #getAssocClass()
	 * @generated
	 */
	EReference getAssocClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.serialisation.AssocClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.pnml.tools.epnk.serialisation.AssocClass#getTarget()
	 * @see #getAssocClass()
	 * @generated
	 */
	EReference getAssocClass_Target();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.serialisation.AssocClass#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.pnml.tools.epnk.serialisation.AssocClass#getFeature()
	 * @see #getAssocClass()
	 * @generated
	 */
	EReference getAssocClass_Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SerialisationFactory getSerialisationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.serialisation.impl.AssocClassImpl <em>Assoc Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.serialisation.impl.AssocClassImpl
		 * @see org.pnml.tools.epnk.serialisation.impl.SerialisationPackageImpl#getAssocClass()
		 * @generated
		 */
		EClass ASSOC_CLASS = eINSTANCE.getAssocClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOC_CLASS__SOURCE = eINSTANCE.getAssocClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOC_CLASS__TARGET = eINSTANCE.getAssocClass_Target();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOC_CLASS__FEATURE = eINSTANCE.getAssocClass_Feature();

	}

} //SerialisationPackage
