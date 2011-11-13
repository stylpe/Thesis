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
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.ExtendedPNMLMetaData;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.PNMLMetaData;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNGKind;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.factory.FullHLPNGFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.factory.HLPNGFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.factory.SNFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl.HlpngserialisationPackageImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.linking.HLPNGLinker;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.serialisation.SerialisationPackage;
import org.pnml.tools.epnk.structuredpntypemodel.Linker;
import org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredPetriNetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLPNG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.impl.HLPNGImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLPNGImpl extends StructuredPetriNetTypeImpl implements HLPNG {

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final HLPNGKind KIND_EDEFAULT = HLPNGKind.FULL;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected HLPNGKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (made constructor public)
	 */
	public HLPNGImpl() {
		super();
	}

	
	private Linker linker;

	@Override
	// @generated NOT
	public Linker getLinker() {
		if (linker == null) {
			linker = new HLPNGLinker();
		}
		
		return linker;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpngdefinitionPackage.Literals.HLPNG;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLPNGKind getKind() {
		return kind;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(HLPNGKind newKind) {
		HLPNGKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HlpngdefinitionPackage.HLPNG__KIND, oldKind, kind));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HlpngdefinitionPackage.HLPNG__KIND:
				return getKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HlpngdefinitionPackage.HLPNG__KIND:
				setKind((HLPNGKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HlpngdefinitionPackage.HLPNG__KIND:
				setKind(KIND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HlpngdefinitionPackage.HLPNG__KIND:
				return kind != KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	// @generated NOT
	// @author eki
	@Override
	public String toString() {
		return kind.getLiteral();
	}

	@Override
	// @generated NOT
	// @author eki
	public HLPNG createPetriNetType() {
		return HlpngdefinitionFactory.eINSTANCE.createHLPNG();
	}

	@Override
	// @generated NOT
	// @author eki
	public PetriNetType createPetriNetType(String type) {
		for (HLPNGKind kind : HLPNGKind.VALUES) {
			if (type.equals(kind.getLiteral())) {
				HLPNG petriNetType = createPetriNetType();
				petriNetType.setKind(kind);
				return petriNetType;
			}
		}
		return null;
	}


	@Override
	public void registerPNMLMetaData(PNMLMetaData metadata) {
		super.registerPNMLMetaData(metadata);
		metadata.setFeatureKind(ArbitrarydeclarationsPackage.eINSTANCE.getUnparsed_Contents(), ExtendedMetaData.SIMPLE_FEATURE);
		metadata.setContentKind(ArbitrarydeclarationsPackage.eINSTANCE.getUnparsed(), ExtendedMetaData.SIMPLE_CONTENT);
	}

	@Override
	public void registerExtendedPNMLMetaData(ExtendedPNMLMetaData metadata) {
		metadata.add(HlpngdefinitionPackage.eINSTANCE.getDeclaration_Structure(), 
				HlpngdefinitionPackage.eINSTANCE.getDeclaration(),
				TermsPackage.eINSTANCE.getDeclarations(), 
				"structure",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				HlpngserialisationPackage.eINSTANCE.getDeclAssoc(),
				TermsPackage.eINSTANCE.getDeclarations(), 
				"declarations",
				null,
				HLPNGFactory.getHLPNGFactory());

		metadata.add(HlpngdefinitionPackage.eINSTANCE.getType_Structure(), 
				HlpngdefinitionPackage.eINSTANCE.getType(),
				TermsPackage.eINSTANCE.getSort(), 
				"structure",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(HlpngdefinitionPackage.eINSTANCE.getHLMarking_Structure(), 
				HlpngdefinitionPackage.eINSTANCE.getHLMarking(),
				TermsPackage.eINSTANCE.getTerm(), 
				"structure",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(HlpngdefinitionPackage.eINSTANCE.getCondition_Structure(), 
				HlpngdefinitionPackage.eINSTANCE.getCondition(),
				TermsPackage.eINSTANCE.getTerm(), 
				"structure",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(HlpngdefinitionPackage.eINSTANCE.getHLAnnotation_Structure(), 
				HlpngdefinitionPackage.eINSTANCE.getHLAnnotation(),
				TermsPackage.eINSTANCE.getTerm(), 
				"structure",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		
		// TODO all these mappings for terms should be changed to  element
		//      mappings together with a standard feature for Term_Assoc
		//      (but this needs to be carefully tested).
		metadata.add(TermsPackage.eINSTANCE.getOperator_Subterm(), 
				TermsPackage.eINSTANCE.getOperator(),
				TermsPackage.eINSTANCE.getTerm(), 
				"subterm",
				null,
				HLPNGFactory.getHLPNGFactory());

		metadata.add(null,
				null,
				TermsPackage.eINSTANCE.getVariable(), 
				"variable",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				TermsPackage.eINSTANCE.getTuple(), 
				"tuple",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				TermsPackage.eINSTANCE.getUserOperator(), 
				"useroperator",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				DotsPackage.eINSTANCE.getDotConstant(), 
				"dotconstant",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				HlpngserialisationPackageImpl.eINSTANCE.getTermAssoc(),
				MultisetsPackage.eINSTANCE.getCardinality(), 
				"cardinality",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getCardinalityOf(), 
				"cardinalityof",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getContains(), 
				"contains",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getAdd(), 
				"add",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getAll(), 
				"all",
				null,
				HLPNGFactory.getHLPNGFactory());

		metadata.add(MultisetsPackage.eINSTANCE.getAll_Refsort(),
				MultisetsPackage.eINSTANCE.getAll(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getNumberOf(), 
				"numberof",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getSubtract(), 
				"subtract",
				null,
				HLPNGFactory.getHLPNGFactory());

		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getScalarProduct(), 
				"scalarproduct",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				MultisetsPackage.eINSTANCE.getEmpty(), 
				"empty",
				null,
				HLPNGFactory.getHLPNGFactory());

		metadata.add(MultisetsPackage.eINSTANCE.getEmpty_Refsort(),
				MultisetsPackage.eINSTANCE.getEmpty(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getEquality(), 
				"equality",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getInequality(), 
				"inequality",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getOr(), 
				"or",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getAnd(), 
				"and",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getImply(), 
				"imply",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getNot(), 
				"not",
				null,
				HLPNGFactory.getHLPNGFactory());

		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getBooleanConstant(), 
				"booleanconstant",
				null,
				HLPNGFactory.getHLPNGFactory());
	    
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getAddition(), 
				"addition",
				null,
				HLPNGFactory.getHLPNGFactory());	
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getSubtraction(), 
				"subtraction",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getMultiplication(), 
				"mult",
				null,
				HLPNGFactory.getHLPNGFactory());	
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getDivision(), 
				"div",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getModulo(), 
				"mod",
				null,
				HLPNGFactory.getHLPNGFactory());	

		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getGreaterThan(), 
				"gt",
				null,
				HLPNGFactory.getHLPNGFactory());	

		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getGreaterThanOrEqual(), 
				"geq",
				null,
				HLPNGFactory.getHLPNGFactory());

		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getLessThan(), 
				"lt",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getLessThanOrEqual(), 
				"leq",
				null,
				HLPNGFactory.getHLPNGFactory());	
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getNumberConstant(), 
				"numberconstant",
				null,
				HLPNGFactory.getHLPNGFactory());	
		
		/*
		metadata.add(IntegersPackage.eINSTANCE.getNumberConstant_Type(), 
				IntegersPackage.eINSTANCE.getNumberConstant(),
				IntegersPackage.eINSTANCE.getNatural(), 
				"natural",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(IntegersPackage.eINSTANCE.getNumberConstant_Type(), 
				IntegersPackage.eINSTANCE.getNumberConstant(),
				IntegersPackage.eINSTANCE.getPositive(), 
				"positive",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(IntegersPackage.eINSTANCE.getNumberConstant_Type(), 
				IntegersPackage.eINSTANCE.getNumberConstant(),
				IntegersPackage.eINSTANCE.getInteger(), 
				"integer",
				null,
				HLPNGFactory.getHLPNGFactory());
		*/
		
		metadata.add(IntegersPackage.eINSTANCE.getNumberConstant_Type(), 
				IntegersPackage.eINSTANCE.getNumberConstant(),
				IntegersPackage.eINSTANCE.getNumber(), 
				null,
				null,
				null);
		
		
		// TODO we still need to include the mappings for Sorts here
		
		metadata.add(SerialisationPackage.eINSTANCE.getAssocClass_Target(),
				HlpngserialisationPackage.eINSTANCE.getSortAssoc(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
				
		metadata.add(null,
				null,
				TermsPackage.eINSTANCE.getMultiSetSort(), 
				"multisetsort",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(TermsPackage.eINSTANCE.getMultiSetSort_Basis(),
				TermsPackage.eINSTANCE.getMultiSetSort(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null,
				null,
				TermsPackage.eINSTANCE.getProductSort(), 
				"productsort",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(TermsPackage.eINSTANCE.getProductSort_ElementSort(),
				TermsPackage.eINSTANCE.getProductSort(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null,
				null,
				TermsPackage.eINSTANCE.getUserSort(), 
				"usersort",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				DotsPackage.eINSTANCE.getDot(), 
				"dot",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				BooleansPackage.eINSTANCE.getBool(), 
				"bool",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getNatural(), 
				"natural",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getPositive(), 
				"positive",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(null,
				null,
				IntegersPackage.eINSTANCE.getInteger(), 
				"integer",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		// TODO we still need to include the mappings for Declarations here
		
		// Standard feature for declarations
		metadata.add(TermsPackage.eINSTANCE.getDeclarations_Declaration(), 
				TermsPackage.eINSTANCE.getDeclarations(),
				TermsPackage.eINSTANCE.getDeclaration(), 
				null,
				null,
				null);
		
		metadata.add(null, 
				null,
				TermsPackage.eINSTANCE.getNamedSort(), 
				"namedsort",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		// Standard feature for NamedSort
		metadata.add(TermsPackage.eINSTANCE.getNamedSort_Def(), 
				TermsPackage.eINSTANCE.getNamedSort(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null, 
				null,
				TermsPackage.eINSTANCE.getVariableDecl(), 
				"variabledecl",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		// Standard feature for VariableDecl
		metadata.add(TermsPackage.eINSTANCE.getVariableDecl_Sort(), 
				TermsPackage.eINSTANCE.getVariableDecl(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null, 
				null,
				TermsPackage.eINSTANCE.getNamedOperator(), 
				"namedoperator",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(TermsPackage.eINSTANCE.getNamedOperator_Def(), 
				TermsPackage.eINSTANCE.getNamedOperator(),
				TermsPackage.eINSTANCE.getTerm(), 
				"def",
				null,
				HLPNGFactory.getHLPNGFactory());
		
		metadata.add(TermsPackage.eINSTANCE.getNamedOperator_Parameters(), 
				TermsPackage.eINSTANCE.getNamedOperator(),
				TermsPackage.eINSTANCE.getVariableDecl(), 
				"parameter",
				null,
				HLPNGFactory.getHLPNGFactory(),
				true);
		
		// From here: Constructs for Symmetric Nets
		
		metadata.add(null,
				null,
				FiniteenumerationsPackage.eINSTANCE.getFiniteEnumeration(), 
				"finiteenumeration",
				null,
				SNFactory.getSNFactory());
		
		metadata.add(FiniteenumerationsPackage.eINSTANCE.getFiniteEnumeration_Elements(), 
				FiniteenumerationsPackage.eINSTANCE.getFiniteEnumeration(),
				FiniteenumerationsPackage.eINSTANCE.getFEConstant(), 
				"feconstant",
				null,
				SNFactory.getSNFactory());
		
		metadata.add(null,
				null,
				CyclicenumerationsPackage.eINSTANCE.getCyclicEnumeration(), 
				"cyclicenumeration",
				null,
				SNFactory.getSNFactory());
				
		metadata.add(null,
				null,
				CyclicenumerationsPackage.eINSTANCE.getPredecessor(), 
				"predecessor",
				null,
				SNFactory.getSNFactory());		

		metadata.add(null,
				null,
				CyclicenumerationsPackage.eINSTANCE.getSuccessor(), 
				"successor",
				null,
				SNFactory.getSNFactory());	

		metadata.add(null,
				null,
				FiniteintrangesPackage.eINSTANCE.getFiniteIntRange(), 
				"finiteintrange",
				null,
				SNFactory.getSNFactory());
		
		metadata.add(null,
				null,
				FiniteintrangesPackage.eINSTANCE.getFiniteIntConstant(), 
				"finiteintrangeconstant",
				null,
				SNFactory.getSNFactory());
		
		metadata.add(null,
				null,
				FiniteintrangesPackage.eINSTANCE.getLessThan(), 
				"lessthan",
				null,
				SNFactory.getSNFactory());
		
		metadata.add(null,
				null,
				FiniteintrangesPackage.eINSTANCE.getLessThanOrEqual(), 
				"lessthanorequal",
				null,
				SNFactory.getSNFactory());		
		
		metadata.add(null,
				null,
				FiniteintrangesPackage.eINSTANCE.getGreaterThan(), 
				"greaterthan",
				null,
				SNFactory.getSNFactory());
		
		metadata.add(null,
				null,
				FiniteintrangesPackage.eINSTANCE.getGreaterThanOrEqual(), 
				"greaterthanorequal",
				null,
				SNFactory.getSNFactory());

		// Standard feature for the range (so that any sort can be used for the
		// range of a FiniteIntRangeConstant
		metadata.add(FiniteintrangesPackage.eINSTANCE.getFiniteIntConstant_Range(), 
				FiniteintrangesPackage.eINSTANCE.getFiniteIntConstant(),
				FiniteintrangesPackage.eINSTANCE.getFiniteIntRange(), 
				null,
				null,
				null);
		
		metadata.add(null, 
				null,
				PartitionsPackage.eINSTANCE.getPartition(), 
				"partition",
				null,
				SNFactory.getSNFactory());
		
		// Standard feature for Partitions (its sort)
		metadata.add(PartitionsPackage.eINSTANCE.getPartition_Def(), 
				PartitionsPackage.eINSTANCE.getPartition(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(PartitionsPackage.eINSTANCE.getPartition_PartitionElements(), 
				PartitionsPackage.eINSTANCE.getPartition(),
				PartitionsPackage.eINSTANCE.getPartitionElement(), 
				"partitionelement",
				null,
				SNFactory.getSNFactory());
		
		// Standard feature for PartitionElement: terms characterizing the elements
		metadata.add(PartitionsPackage.eINSTANCE.getPartitionElement_Partitionelementconstant(), 
				PartitionsPackage.eINSTANCE.getPartitionElement(),
				TermsPackage.eINSTANCE.getTerm(), 
				null,
				null,
				null);
		
		metadata.add(null,
				null,
				PartitionsPackage.eINSTANCE.getPartitionElementOf(), 
				"partitionelementof",
				null,
				SNFactory.getSNFactory());
		
		metadata.add(null,
				null,
				PartitionsPackage.eINSTANCE.getLessThan(), 
				"ltp",
				null,
				SNFactory.getSNFactory());		
		
		metadata.add(null,
				null,
				PartitionsPackage.eINSTANCE.getGreaterThan(), 
				"gtp",
				null,
				SNFactory.getSNFactory());
		
		// From here: Constructs for Full HLPNG (Strings, Lists, ArbitraryDeclarations)

		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getString(), 
				"string",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());

		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getConcatenation(), 
				"stringconcatenation",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getAppend(), 
				"stringappend",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getLength(), 
				"stringlength",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getLessThanOrEqual(), 
				"leqs",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getLessThan(), 
				"lts",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());

		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getGreaterThanOrEqual(), 
				"geqs",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getGreaterThan(), 
				"gts",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());

		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getSubstring(), 
				"substring",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				StringsPackage.eINSTANCE.getStringConstant(), 
				"stringconstant",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getList(), 
				"list",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(ListsPackage.eINSTANCE.getList_Basis(),
				ListsPackage.eINSTANCE.getList(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getConcatenation(), 
				"listconcatenation",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getAppend(), 
				"listappend",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getLength(), 
				"listlength",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getMakeList(), 
				"makelist",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(ListsPackage.eINSTANCE.getMakeList_Refsort(),
				ListsPackage.eINSTANCE.getMakeList(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getMemberAtIndex(), 
				"memberatindex",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getSublist(), 
				"sublist",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(null,
				null,
				ListsPackage.eINSTANCE.getEmptyList(), 
				"emptylist",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(ListsPackage.eINSTANCE.getEmptyList_Refsort(),
				ListsPackage.eINSTANCE.getEmptyList(),
				TermsPackage.eINSTANCE.getSort(), 
				null,
				null,
				null);
		
		metadata.add(null, 
				null,
				ArbitrarydeclarationsPackage.eINSTANCE.getArbitrarySort(), 
				"arbitrarysort",
				null,
				// FIXME eki: experiment with standard factory (could probably be used for
				// most mappings and would simplify most mappings)
				// FullHLPNGFactory.getFullHLPNGFactory());
				null);

		
		metadata.add(null, 
				null,
				ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator(), 
				"arbitraryoperator",
				null,
				// FIXME eki: experiment with standard factory (could probably be used for
				// most mappings and would simplify most mappings)
				// FullHLPNGFactory.getFullHLPNGFactory());
				null);
		
		metadata.add(null, 
				null,
				ArbitrarydeclarationsPackage.eINSTANCE.getUnparsed(), 
				"unparsed",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator_Input(), 
				ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator(),
				TermsPackage.eINSTANCE.getSort(), 
				"input",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());
		
		metadata.add(ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator_Output(), 
				ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator(),
				TermsPackage.eINSTANCE.getSort(), 
				"output",
				null,
				FullHLPNGFactory.getFullHLPNGFactory());

	}
	
} //HLPNGImpl
