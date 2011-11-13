/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.pnml.tools.epnk.serialisation.SerialisationPackage;

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
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationFactory
 * @model kind="package"
 * @generated
 */
public interface HlpngserialisationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hlpngserialisation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/pntypes/hlpng/serialisation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hlpngserialisation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlpngserialisationPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.SortAssocImpl <em>Sort Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.SortAssocImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getSortAssoc()
	 * @generated
	 */
	int SORT_ASSOC = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ASSOC__SOURCE = SerialisationPackage.ASSOC_CLASS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ASSOC__TARGET = SerialisationPackage.ASSOC_CLASS__TARGET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ASSOC__FEATURE = SerialisationPackage.ASSOC_CLASS__FEATURE;

	/**
	 * The number of structural features of the '<em>Sort Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ASSOC_FEATURE_COUNT = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.DeclAssocImpl <em>Decl Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.DeclAssocImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getDeclAssoc()
	 * @generated
	 */
	int DECL_ASSOC = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_ASSOC__SOURCE = SerialisationPackage.ASSOC_CLASS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_ASSOC__TARGET = SerialisationPackage.ASSOC_CLASS__TARGET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_ASSOC__FEATURE = SerialisationPackage.ASSOC_CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_ASSOC__DECLARATION = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decl Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_ASSOC_FEATURE_COUNT = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.TermAssocImpl <em>Term Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.TermAssocImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getTermAssoc()
	 * @generated
	 */
	int TERM_ASSOC = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ASSOC__SOURCE = SerialisationPackage.ASSOC_CLASS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ASSOC__TARGET = SerialisationPackage.ASSOC_CLASS__TARGET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ASSOC__FEATURE = SerialisationPackage.ASSOC_CLASS__FEATURE;

	/**
	 * The number of structural features of the '<em>Term Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_ASSOC_FEATURE_COUNT = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.VariableDeclAssocImpl <em>Variable Decl Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.VariableDeclAssocImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getVariableDeclAssoc()
	 * @generated
	 */
	int VARIABLE_DECL_ASSOC = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_ASSOC__SOURCE = SerialisationPackage.ASSOC_CLASS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_ASSOC__TARGET = SerialisationPackage.ASSOC_CLASS__TARGET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_ASSOC__FEATURE = SerialisationPackage.ASSOC_CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_ASSOC__ID = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_ASSOC__NAME = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_ASSOC__SORT = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Decl Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_ASSOC_FEATURE_COUNT = SerialisationPackage.ASSOC_CLASS_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.SortAssoc <em>Sort Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Assoc</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.SortAssoc
	 * @generated
	 */
	EClass getSortAssoc();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.DeclAssoc <em>Decl Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decl Assoc</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.DeclAssoc
	 * @generated
	 */
	EClass getDeclAssoc();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.TermAssoc <em>Term Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Assoc</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.TermAssoc
	 * @generated
	 */
	EClass getTermAssoc();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.VariableDeclAssoc <em>Variable Decl Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Decl Assoc</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.VariableDeclAssoc
	 * @generated
	 */
	EClass getVariableDeclAssoc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HlpngserialisationFactory getHlpngserialisationFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.SortAssocImpl <em>Sort Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.SortAssocImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getSortAssoc()
		 * @generated
		 */
		EClass SORT_ASSOC = eINSTANCE.getSortAssoc();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.DeclAssocImpl <em>Decl Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.DeclAssocImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getDeclAssoc()
		 * @generated
		 */
		EClass DECL_ASSOC = eINSTANCE.getDeclAssoc();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.TermAssocImpl <em>Term Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.TermAssocImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getTermAssoc()
		 * @generated
		 */
		EClass TERM_ASSOC = eINSTANCE.getTermAssoc();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.VariableDeclAssocImpl <em>Variable Decl Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.VariableDeclAssocImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl#getVariableDeclAssoc()
		 * @generated
		 */
		EClass VARIABLE_DECL_ASSOC = eINSTANCE.getVariableDeclAssoc();

	}

} //HlpngserialisationPackage
