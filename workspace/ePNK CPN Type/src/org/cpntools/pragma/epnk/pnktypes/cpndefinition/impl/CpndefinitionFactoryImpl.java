/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.*;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.ArcInscription;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Page;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition;
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
public class CpndefinitionFactoryImpl extends EFactoryImpl implements CpndefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CpndefinitionFactory init() {
		try {
			CpndefinitionFactory theCpndefinitionFactory = (CpndefinitionFactory)EPackage.Registry.INSTANCE.getEFactory("http://cpndefinition/1.0"); 
			if (theCpndefinitionFactory != null) {
				return theCpndefinitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CpndefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpndefinitionFactoryImpl() {
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
			case CpndefinitionPackage.CPN: return createCPN();
			case CpndefinitionPackage.PLACE: return createPlace();
			case CpndefinitionPackage.ARC: return createArc();
			case CpndefinitionPackage.TRANSITION: return createTransition();
			case CpndefinitionPackage.PAGE: return createPage();
			case CpndefinitionPackage.ARC_EXPRESSION: return createArcExpression();
			case CpndefinitionPackage.CPN_INSCRIPTION: return createCPNInscription();
			case CpndefinitionPackage.GUARD: return createGuard();
			case CpndefinitionPackage.INITIAL_MARKING: return createInitialMarking();
			case CpndefinitionPackage.SORT: return createSort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPN createCPN() {
		CPNImpl cpn = new CPNImpl();
		return cpn;
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
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
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
	public ArcExpression createArcExpression() {
		ArcExpressionImpl arcExpression = new ArcExpressionImpl();
		return arcExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPNInscription createCPNInscription() {
		CPNInscriptionImpl cpnInscription = new CPNInscriptionImpl();
		return cpnInscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialMarking createInitialMarking() {
		InitialMarkingImpl initialMarking = new InitialMarkingImpl();
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort createSort() {
		SortImpl sort = new SortImpl();
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpndefinitionPackage getCpndefinitionPackage() {
		return (CpndefinitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CpndefinitionPackage getPackage() {
		return CpndefinitionPackage.eINSTANCE;
	}

} //CpndefinitionFactoryImpl
