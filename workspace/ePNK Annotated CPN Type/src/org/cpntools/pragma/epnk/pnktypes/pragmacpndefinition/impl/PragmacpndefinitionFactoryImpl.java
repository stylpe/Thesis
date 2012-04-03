/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PragmacpndefinitionFactoryImpl extends EFactoryImpl implements PragmacpndefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PragmacpndefinitionFactory init() {
		try {
			PragmacpndefinitionFactory thePragmacpndefinitionFactory = (PragmacpndefinitionFactory)EPackage.Registry.INSTANCE.getEFactory("http://pragmacpndefinition/1.0"); 
			if (thePragmacpndefinitionFactory != null) {
				return thePragmacpndefinitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PragmacpndefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmacpndefinitionFactoryImpl() {
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
			case PragmacpndefinitionPackage.PRAGMA_CPN: return createPragmaCPN();
			case PragmacpndefinitionPackage.PLACE: return createPlace();
			case PragmacpndefinitionPackage.PRAGMA: return createPragma();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmaCPN createPragmaCPN() {
		PragmaCPNImpl pragmaCPN = new PragmaCPNImpl();
		return pragmaCPN;
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
	public Pragma createPragma() {
		PragmaImpl pragma = new PragmaImpl();
		return pragma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmacpndefinitionPackage getPragmacpndefinitionPackage() {
		return (PragmacpndefinitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PragmacpndefinitionPackage getPackage() {
		return PragmacpndefinitionPackage.eINSTANCE;
	}

} //PragmacpndefinitionFactoryImpl
