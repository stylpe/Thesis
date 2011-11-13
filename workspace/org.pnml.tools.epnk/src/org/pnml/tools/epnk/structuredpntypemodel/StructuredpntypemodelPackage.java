/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.structuredpntypemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelFactory
 * @model kind="package"
 * @generated
 */
public interface StructuredpntypemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structuredpntypemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/structuedpntypesmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structuredpntypemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredpntypemodelPackage eINSTANCE = org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredPetriNetTypeImpl <em>Structured Petri Net Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredPetriNetTypeImpl
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getStructuredPetriNetType()
	 * @generated
	 */
	int STRUCTURED_PETRI_NET_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Structured Petri Net Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_PETRI_NET_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl <em>Structured Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getStructuredLabel()
	 * @generated
	 */
	int STRUCTURED_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LABEL__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LABEL__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LABEL__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LABEL__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LABEL_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.structuredpntypemodel.Linker <em>Linker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.structuredpntypemodel.Linker
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getLinker()
	 * @generated
	 */
	int LINKER = 2;

	/**
	 * The number of structural features of the '<em>Linker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping <em>Symbol Use Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getSymbolUseMapping()
	 * @generated
	 */
	int SYMBOL_USE_MAPPING = 3;

	/**
	 * The number of structural features of the '<em>Symbol Use Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_USE_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolDef <em>Symbol Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolDef
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getSymbolDef()
	 * @generated
	 */
	int SYMBOL_DEF = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_DEF__ID = PnmlcoremodelPackage.ID__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_DEF__NAME = PnmlcoremodelPackage.ID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_DEF_FEATURE_COUNT = PnmlcoremodelPackage.ID_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUse <em>Symbol Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUse
	 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getSymbolUse()
	 * @generated
	 */
	int SYMBOL_USE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_USE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Symbol Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_USE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType <em>Structured Petri Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Petri Net Type</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType
	 * @generated
	 */
	EClass getStructuredPetriNetType();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel <em>Structured Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Label</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel
	 * @generated
	 */
	EClass getStructuredLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel#getText()
	 * @see #getStructuredLabel()
	 * @generated
	 */
	EAttribute getStructuredLabel_Text();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.structuredpntypemodel.Linker <em>Linker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linker</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.Linker
	 * @generated
	 */
	EClass getLinker();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping <em>Symbol Use Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Use Mapping</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping
	 * @generated
	 */
	EClass getSymbolUseMapping();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolDef <em>Symbol Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Def</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolDef
	 * @generated
	 */
	EClass getSymbolDef();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolDef#getName()
	 * @see #getSymbolDef()
	 * @generated
	 */
	EAttribute getSymbolDef_Name();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUse <em>Symbol Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Use</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUse
	 * @generated
	 */
	EClass getSymbolUse();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUse#getName()
	 * @see #getSymbolUse()
	 * @generated
	 */
	EAttribute getSymbolUse_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuredpntypemodelFactory getStructuredpntypemodelFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredPetriNetTypeImpl <em>Structured Petri Net Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredPetriNetTypeImpl
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getStructuredPetriNetType()
		 * @generated
		 */
		EClass STRUCTURED_PETRI_NET_TYPE = eINSTANCE.getStructuredPetriNetType();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl <em>Structured Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getStructuredLabel()
		 * @generated
		 */
		EClass STRUCTURED_LABEL = eINSTANCE.getStructuredLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_LABEL__TEXT = eINSTANCE.getStructuredLabel_Text();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.structuredpntypemodel.Linker <em>Linker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.structuredpntypemodel.Linker
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getLinker()
		 * @generated
		 */
		EClass LINKER = eINSTANCE.getLinker();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping <em>Symbol Use Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getSymbolUseMapping()
		 * @generated
		 */
		EClass SYMBOL_USE_MAPPING = eINSTANCE.getSymbolUseMapping();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolDef <em>Symbol Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolDef
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getSymbolDef()
		 * @generated
		 */
		EClass SYMBOL_DEF = eINSTANCE.getSymbolDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_DEF__NAME = eINSTANCE.getSymbolDef_Name();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUse <em>Symbol Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUse
		 * @see org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredpntypemodelPackageImpl#getSymbolUse()
		 * @generated
		 */
		EClass SYMBOL_USE = eINSTANCE.getSymbolUse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_USE__NAME = eINSTANCE.getSymbolUse_Name();

	}

} //StructuredpntypemodelPackage
