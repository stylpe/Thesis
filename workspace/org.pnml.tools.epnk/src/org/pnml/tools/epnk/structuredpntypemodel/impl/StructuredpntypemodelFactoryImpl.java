/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.structuredpntypemodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredpntypemodelFactoryImpl extends EFactoryImpl implements StructuredpntypemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuredpntypemodelFactory init() {
		try {
			StructuredpntypemodelFactory theStructuredpntypemodelFactory = (StructuredpntypemodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/structuedpntypesmodel"); 
			if (theStructuredpntypemodelFactory != null) {
				return theStructuredpntypemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuredpntypemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredpntypemodelFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredpntypemodelPackage getStructuredpntypemodelPackage() {
		return (StructuredpntypemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuredpntypemodelPackage getPackage() {
		return StructuredpntypemodelPackage.eINSTANCE;
	}

} //StructuredpntypemodelFactoryImpl
