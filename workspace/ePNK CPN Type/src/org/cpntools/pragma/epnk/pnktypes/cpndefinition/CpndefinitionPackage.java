/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

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
 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface CpndefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cpndefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpndefinition/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cpndefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpndefinitionPackage eINSTANCE = org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNImpl <em>CPN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getCPN()
	 * @generated
	 */
	int CPN = 0;

	/**
	 * The number of structural features of the '<em>CPN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPN_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PlaceImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PnmlcoremodelPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PnmlcoremodelPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = PnmlcoremodelPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = PnmlcoremodelPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = PnmlcoremodelPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = PnmlcoremodelPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_MARKING = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__SORT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PnmlcoremodelPackage.ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PnmlcoremodelPackage.ARC__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = PnmlcoremodelPackage.ARC__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = PnmlcoremodelPackage.ARC__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = PnmlcoremodelPackage.ARC__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PnmlcoremodelPackage.ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PnmlcoremodelPackage.ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__EXPRESSION = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.TransitionImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = PnmlcoremodelPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PnmlcoremodelPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOOLSPECIFIC = PnmlcoremodelPackage.TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GRAPHICS = PnmlcoremodelPackage.TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNKNOWN = PnmlcoremodelPackage.TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = PnmlcoremodelPackage.TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = PnmlcoremodelPackage.TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Substitution Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IS_SUBSTITUTION_TRANSITION = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PageImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = PnmlcoremodelPackage.PAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = PnmlcoremodelPackage.PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOLSPECIFIC = PnmlcoremodelPackage.PAGE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GRAPHICS = PnmlcoremodelPackage.PAGE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNKNOWN = PnmlcoremodelPackage.PAGE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OUT = PnmlcoremodelPackage.PAGE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IN = PnmlcoremodelPackage.PAGE__IN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OBJECT = PnmlcoremodelPackage.PAGE__OBJECT;

	/**
	 * The feature id for the '<em><b>Page Label Proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_LABEL_PROXY = PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY;

	/**
	 * The feature id for the '<em><b>Labelproxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LABELPROXY = PnmlcoremodelPackage.PAGE__LABELPROXY;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNInscriptionImpl <em>CPN Inscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNInscriptionImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getCPNInscription()
	 * @generated
	 */
	int CPN_INSCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPN_INSCRIPTION__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPN_INSCRIPTION__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPN_INSCRIPTION__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPN_INSCRIPTION__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CPN Inscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPN_INSCRIPTION_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcExpressionImpl <em>Arc Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcExpressionImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getArcExpression()
	 * @generated
	 */
	int ARC_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_EXPRESSION__TOOLSPECIFIC = CPN_INSCRIPTION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_EXPRESSION__GRAPHICS = CPN_INSCRIPTION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_EXPRESSION__UNKNOWN = CPN_INSCRIPTION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_EXPRESSION__TEXT = CPN_INSCRIPTION__TEXT;

	/**
	 * The number of structural features of the '<em>Arc Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_EXPRESSION_FEATURE_COUNT = CPN_INSCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.GuardImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 7;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__TOOLSPECIFIC = CPN_INSCRIPTION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__GRAPHICS = CPN_INSCRIPTION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__UNKNOWN = CPN_INSCRIPTION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__TEXT = CPN_INSCRIPTION__TEXT;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = CPN_INSCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.InitialMarkingImpl <em>Initial Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.InitialMarkingImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getInitialMarking()
	 * @generated
	 */
	int INITIAL_MARKING = 8;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MARKING__TOOLSPECIFIC = CPN_INSCRIPTION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MARKING__GRAPHICS = CPN_INSCRIPTION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MARKING__UNKNOWN = CPN_INSCRIPTION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MARKING__TEXT = CPN_INSCRIPTION__TEXT;

	/**
	 * The number of structural features of the '<em>Initial Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MARKING_FEATURE_COUNT = CPN_INSCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.SortImpl
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 9;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__TOOLSPECIFIC = CPN_INSCRIPTION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__GRAPHICS = CPN_INSCRIPTION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__UNKNOWN = CPN_INSCRIPTION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__TEXT = CPN_INSCRIPTION__TEXT;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = CPN_INSCRIPTION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN <em>CPN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPN</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN
	 * @generated
	 */
	EClass getCPN();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getInitialMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_InitialMarking();

	/**
	 * Returns the meta object for the containment reference '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place#getSort()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Sort();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc#getExpression()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Expression();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the attribute '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#isIsSubstitutionTransition <em>Is Substitution Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Substitution Transition</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition#isIsSubstitutionTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_IsSubstitutionTransition();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.ArcExpression <em>Arc Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Expression</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.ArcExpression
	 * @generated
	 */
	EClass getArcExpression();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPNInscription <em>CPN Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPN Inscription</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPNInscription
	 * @generated
	 */
	EClass getCPNInscription();

	/**
	 * Returns the meta object for the attribute '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPNInscription#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPNInscription#getText()
	 * @see #getCPNInscription()
	 * @generated
	 */
	EAttribute getCPNInscription_Text();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.InitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Marking</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.InitialMarking
	 * @generated
	 */
	EClass getInitialMarking();

	/**
	 * Returns the meta object for class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpndefinitionFactory getCpndefinitionFactory();

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
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNImpl <em>CPN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getCPN()
		 * @generated
		 */
		EClass CPN = eINSTANCE.getCPN();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PlaceImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INITIAL_MARKING = eINSTANCE.getPlace_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__SORT = eINSTANCE.getPlace_Sort();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__EXPRESSION = eINSTANCE.getArc_Expression();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.TransitionImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Is Substitution Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__IS_SUBSTITUTION_TRANSITION = eINSTANCE.getTransition_IsSubstitutionTransition();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.PageImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcExpressionImpl <em>Arc Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.ArcExpressionImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getArcExpression()
		 * @generated
		 */
		EClass ARC_EXPRESSION = eINSTANCE.getArcExpression();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNInscriptionImpl <em>CPN Inscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNInscriptionImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getCPNInscription()
		 * @generated
		 */
		EClass CPN_INSCRIPTION = eINSTANCE.getCPNInscription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPN_INSCRIPTION__TEXT = eINSTANCE.getCPNInscription_Text();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.GuardImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.InitialMarkingImpl <em>Initial Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.InitialMarkingImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getInitialMarking()
		 * @generated
		 */
		EClass INITIAL_MARKING = eINSTANCE.getInitialMarking();

		/**
		 * The meta object literal for the '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.SortImpl
		 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CpndefinitionPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

	}

} //CpndefinitionPackage
