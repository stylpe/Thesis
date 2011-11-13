/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlpngserialisationFactoryImpl extends EFactoryImpl implements HlpngserialisationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HlpngserialisationFactory init() {
		try {
			HlpngserialisationFactory theHlpngserialisationFactory = (HlpngserialisationFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/pntypes/hlpng/serialisation"); 
			if (theHlpngserialisationFactory != null) {
				return theHlpngserialisationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HlpngserialisationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlpngserialisationFactoryImpl() {
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
			case HlpngserialisationPackage.SORT_ASSOC: return createSortAssoc();
			case HlpngserialisationPackage.DECL_ASSOC: return createDeclAssoc();
			case HlpngserialisationPackage.TERM_ASSOC: return createTermAssoc();
			case HlpngserialisationPackage.VARIABLE_DECL_ASSOC: return createVariableDeclAssoc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortAssoc createSortAssoc() {
		SortAssocImpl sortAssoc = new SortAssocImpl();
		return sortAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclAssoc createDeclAssoc() {
		DeclAssocImpl declAssoc = new DeclAssocImpl();
		return declAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermAssoc createTermAssoc() {
		TermAssocImpl termAssoc = new TermAssocImpl();
		return termAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclAssoc createVariableDeclAssoc() {
		VariableDeclAssocImpl variableDeclAssoc = new VariableDeclAssocImpl();
		return variableDeclAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlpngserialisationPackage getHlpngserialisationPackage() {
		return (HlpngserialisationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HlpngserialisationPackage getPackage() {
		return HlpngserialisationPackage.eINSTANCE;
	}

} //HlpngserialisationFactoryImpl
