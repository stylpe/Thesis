package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IAttributeProvider;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IPNMLFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Declaration;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLAnnotation;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLMarking;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Type;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.DeclAssoc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.SortAssoc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.TermAssoc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.VariableDeclAssoc;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

public class HLPNGFactory implements IPNMLFactory {

	private static HLPNGFactory instance;
	
	static public synchronized HLPNGFactory getHLPNGFactory() {
		if (instance == null) {
			instance = new HLPNGFactory();
		}
		return instance;
	}
		
	@Override
	public boolean canCreateObject(EStructuralFeature feature,
			Object container, String element, String attribute,
			IAttributeProvider provider) {
		if (feature != null &&
			feature.equals(HlpngdefinitionPackage.eINSTANCE.getDeclaration_Structure()) &&
			container instanceof Declaration &&
			element.equals("structure") ) {
			return true;
		}
		
		if (feature == null &&
		    container instanceof DeclAssoc &&
		    element.equals("declarations")) {
			return true;
		}

		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getType_Structure()) &&
				container instanceof Type &&
				element.equals("structure") ) {
			return true;
		}
		
		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getHLMarking_Structure()) &&
				container instanceof HLMarking &&
				element.equals("structure") ) {
			return true;
		}
		
		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getCondition_Structure()) &&
				container instanceof Condition &&
				element.equals("structure") ) {
			return true;
		}
		
		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getHLAnnotation_Structure()) &&
				container instanceof HLAnnotation &&
				element.equals("structure") ) {
			return true;
		}
		
		if (feature != null &&
				feature.equals(TermsPackage.eINSTANCE.getOperator_Subterm()) &&
				container instanceof Operator &&
				element.equals("subterm") ) {
				return true;
		}

		if (true /* feature == null (eki SN test) */) { 
			if ( element.equals("variable") ) {
				return true;
			}
			if ( element.equals("tuple") ) {
				return true;
			}
			if ( element.equals("useroperator") ) {
				return true;
			}
			if ( element.equals("dotconstant") ) {
				return true;
			}
			if ( element.equals("cardinality") ) {
				return true;
			}
			if ( element.equals("cardinalityof") ) {
				return true;
			}
			if ( element.equals("contains") ) {
				return true;
			}
			if ( element.equals("add") ) {
				return true;
			}
			if ( element.equals("all") ) {
				return true;
			}
			if ( element.equals("numberof") ) {
				return true;
			}
			if ( element.equals("subtract") ) {
				return true;
			}
			if ( element.equals("scalarproduct") ) {
				return true;
			}		    
			if ( element.equals("empty") ) {
				return true;
			}
			if ( element.equals("equality") ) {
				return true;
			}
			if ( element.equals("inequality") ) {
				return true;
			}		    
			if ( element.equals("or") ) {
				return true;
			}	
			if ( element.equals("and") ) {
				return true;
			}
			if ( element.equals("imply") ) {
				return true;
			}
			if ( element.equals("not") ) {
				return true;
			}		    
			if ( element.equals("booleanconstant") ) {
				return true;
			}
			if ( element.equals("addition") ) {
				return true;
			}
		    if ( element.equals("subtraction") ) {
		    	return true;
		    }
		    if ( element.equals("mult") ) {
		    	return true;
		    }
		    if ( element.equals("div") ) {
		    	return true;
		    }
		    if ( element.equals("mod") ) {
		    	return true;
		    }
		    if ( element.equals("gt") ) {
		    	return true;
		    }
		    if ( element.equals("geq") ) {
		    	return true;
		    }
		    if ( element.equals("lt") ) {
		    	return true;
		    }
		    if ( element.equals("leq") ) {
		    	return true;
		    }
		    if ( element.equals("numberconstant") ) {
		    	return true;
		    }
		}
		

		
		if (element.equals("multisetsort")) {
			return true;
		}
		
		if (element.equals("productsort")) {
			return true;
		}
		
		if (element.equals("usersort")) {
			return true;
		}
		
		if (element.equals("dot")) {
			return true;
		}
		
		if (element.equals("bool")) {
			return true;
		}

		if (element.equals("natural")) {
			return true;
	    }
		
		if (element.equals("positive")) {
			return true;
		}
		
		if (element.equals("integer")) {
			return true;
		}
		
		if (element.equals("namedsort") ) {
			return true;
		}
		
		if (element.equals("variabledecl") ) {
			return true;
		}
		
		if (element.equals("namedoperator") ) {
			return true;
		}
		
		if (feature != null &&
				feature.equals(TermsPackage.eINSTANCE.getNamedOperator_Def()) &&
				container instanceof NamedOperator &&
				element.equals("def") ) {
			return true;
		}
		
		if (feature != null &&
				feature.equals(TermsPackage.eINSTANCE.getNamedOperator_Parameters()) &&
				container instanceof NamedOperator &&
				element.equals("parameter") ) {
			return true;
		}
		
		
		return false;
	}

	@Override
	public Object createAttributeObject(Object object, String attribute,
			IAttributeProvider provider) {
		if (object instanceof BooleanConstant && attribute.equals("value")) {
			// TODO note that we do not check whether the value actually
			//      represents a boolean value; we return true, if the
			//      attribute converted to lowercase is "true" and
			//      false otherwise (so we are a bit more graceful than
			//      PNML. We might want to change this.
			return Boolean.valueOf(provider.getValue(attribute));
		}
		
		return null;
	}

	@Override
	public EObject createObject(EStructuralFeature feature, Object container,
			String element, String attribute, IAttributeProvider provider) {
		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getDeclaration_Structure())
				&& container instanceof Declaration
				&& element.equals("structure")) {
			Declaration declaration = (Declaration) container;
			DeclAssoc declAssoc = HlpngserialisationFactory.eINSTANCE.createDeclAssoc();
			declAssoc.setSource(declaration);
			declAssoc.setFeature(feature);
			return declAssoc;
		}
		
		if (feature == null &&
			container instanceof DeclAssoc &&
			element.equals("declarations")) {
			return TermsFactory.eINSTANCE.createDeclarations();
		}

		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getType_Structure()) &&
				container instanceof Type &&
				element.equals("structure") ) {
			Type type = (Type) container;
			SortAssoc sortAssoc = HlpngserialisationFactory.eINSTANCE.createSortAssoc();
			sortAssoc.setSource(type);
			sortAssoc.setFeature(feature);
			return sortAssoc;
		}
		
		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getHLMarking_Structure()) &&
				container instanceof HLMarking &&
				element.equals("structure") ) {
			HLMarking marking = (HLMarking) container;
			TermAssoc termAssoc = HlpngserialisationFactory.eINSTANCE.createTermAssoc();
			termAssoc.setSource(marking);
			termAssoc.setFeature(feature);
			return termAssoc;
		}
		
		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getCondition_Structure()) &&
				container instanceof Condition &&
				element.equals("structure") ) {
			Condition condition = (Condition) container;
			TermAssoc termAssoc = HlpngserialisationFactory.eINSTANCE.createTermAssoc();
			termAssoc.setSource(condition);
			termAssoc.setFeature(feature);
			return termAssoc;
		}
		
		if (feature != null &&
				feature.equals(HlpngdefinitionPackage.eINSTANCE.getHLAnnotation_Structure()) &&
				container instanceof HLAnnotation &&
				element.equals("structure") ) {
			HLAnnotation annotation = (HLAnnotation) container;
			TermAssoc termAssoc = HlpngserialisationFactory.eINSTANCE.createTermAssoc();
			termAssoc.setSource(annotation);
			termAssoc.setFeature(feature);
			return termAssoc;
		}

		if (feature != null &&
				feature.equals(TermsPackage.eINSTANCE.getOperator_Subterm()) &&
				container instanceof Operator &&
				element.equals("subterm") ) {
			Operator operator = (Operator) container;
			TermAssoc termAssoc = HlpngserialisationFactory.eINSTANCE.createTermAssoc();
			termAssoc.setSource(operator);
			termAssoc.setFeature(feature);
			return termAssoc;
		}
		

		if (true /* feature == null (eki SN test) */) { 
		    if ( element.equals("variable") ) {
		    	return TermsFactory.eINSTANCE.createVariable();
		    }
		    if ( element.equals("tuple") ) {
		    	return TermsFactory.eINSTANCE.createTuple();
		    }
		    if ( element.equals("useroperator") ) {
		    	return TermsFactory.eINSTANCE.createUserOperator();
		    }
		    if ( element.equals("dotconstant") ) {
		    	return DotsFactory.eINSTANCE.createDotConstant();
		    }
		    if ( element.equals("cardinality") ) {
		    	return MultisetsFactory.eINSTANCE.createCardinality();
		    }
		    if ( element.equals("cardinalityof") ) {
		    	return MultisetsFactory.eINSTANCE.createCardinalityOf();
		    }
		    if ( element.equals("contains") ) {
		    	return MultisetsFactory.eINSTANCE.createContains();
		    }
		    if ( element.equals("add") ) {
		    	return MultisetsFactory.eINSTANCE.createAdd();
		    }
		    if ( element.equals("all") ) {
		    	return MultisetsFactory.eINSTANCE.createAll();
		    }
		    if ( element.equals("numberof") ) {
		    	return MultisetsFactory.eINSTANCE.createNumberOf();
		    }
		    if ( element.equals("subtract") ) {
		    	return MultisetsFactory.eINSTANCE.createSubtract();
		    }
		    if ( element.equals("scalarproduct") ) {
		    	return MultisetsFactory.eINSTANCE.createScalarProduct();
		    }		    
		    if ( element.equals("empty") ) {
		    	return MultisetsFactory.eINSTANCE.createEmpty();
		    }
		    if ( element.equals("equality") ) {
		    	return BooleansFactory.eINSTANCE.createEquality();
		    }
		    if ( element.equals("inequality") ) {
		    	return BooleansFactory.eINSTANCE.createInequality();
		    }		    
		    if ( element.equals("or") ) {
		    	return BooleansFactory.eINSTANCE.createOr();
		    }	
		    if ( element.equals("and") ) {
		    	return BooleansFactory.eINSTANCE.createAnd();
		    }
		    if ( element.equals("imply") ) {
		    	return BooleansFactory.eINSTANCE.createImply();
		    }
		    if ( element.equals("not") ) {
		    	return BooleansFactory.eINSTANCE.createNot();
		    }		    
		    if ( element.equals("booleanconstant") ) {
		    	return BooleansFactory.eINSTANCE.createBooleanConstant();
		    }
		    if ( element.equals("addition") ) {
		    	return IntegersFactory.eINSTANCE.createAddition();
		    }
		    if ( element.equals("subtraction") ) {
		    	return IntegersFactory.eINSTANCE.createSubtraction();
		    }
		    if ( element.equals("mult") ) {
		    	return IntegersFactory.eINSTANCE.createMultiplication();
		    }
		    if ( element.equals("div") ) {
		    	return IntegersFactory.eINSTANCE.createDivision();
		    }
		    if ( element.equals("mod") ) {
		    	return IntegersFactory.eINSTANCE.createModulo();
		    }
		    if ( element.equals("gt") ) {
		    	return IntegersFactory.eINSTANCE.createGreaterThan();
		    }
		    if ( element.equals("geq") ) {
		    	return IntegersFactory.eINSTANCE.createGreaterThanOrEqual();
		    }
		    if ( element.equals("lt") ) {
		    	return IntegersFactory.eINSTANCE.createLessThan();
		    }
		    if ( element.equals("leq") ) {
		    	return IntegersFactory.eINSTANCE.createLessThanOrEqual();
		    }
		    if ( element.equals("numberconstant") ) {
		    	return IntegersFactory.eINSTANCE.createNumberConstant();
		    }
		}

		
		// TODO the following should be a bit more defensive
		//      (checking for the correct type of the target of
		//       the feature)
		if (element.equals("multisetsort")) {
			return TermsFactory.eINSTANCE.createMultiSetSort();
		}
		
		if (element.equals("productsort")) {
			return TermsFactory.eINSTANCE.createProductSort();
		}
		
		if (element.equals("usersort")) {
			return TermsFactory.eINSTANCE.createUserSort();
		}
		
		if (element.equals("dot")) {
			return DotsFactory.eINSTANCE.createDot();
		}
		
		if (element.equals("bool")) {
			return BooleansFactory.eINSTANCE.createBool();
		}

		if (element.equals("natural") ) {
			return IntegersFactory.eINSTANCE.createNatural();
		}
		if (element.equals("positive") ) {
			return IntegersFactory.eINSTANCE.createPositive();
		}			
		if (element.equals("integer") ) {
			return IntegersFactory.eINSTANCE.createInteger();
		}
		
		
		if (element.equals("namedsort") ) {
			return TermsFactory.eINSTANCE.createNamedSort();
		}
		
		if (element.equals("variabledecl") ) {
			return TermsFactory.eINSTANCE.createVariableDecl();
		}
		
		if (element.equals("namedoperator") ) {
			return TermsFactory.eINSTANCE.createNamedOperator();
		}
		
		if (feature != null &&
				feature.equals(TermsPackage.eINSTANCE.getNamedOperator_Def()) &&
				container instanceof NamedOperator &&
				element.equals("def") ) {
			NamedOperator operator = (NamedOperator) container;
			TermAssoc termAssoc = HlpngserialisationFactory.eINSTANCE.createTermAssoc();
			termAssoc.setSource(operator);
			termAssoc.setFeature(feature);
			return termAssoc;
		}
		
		if (feature != null &&
				feature.equals(TermsPackage.eINSTANCE.getNamedOperator_Parameters()) &&
				container instanceof NamedOperator &&
				element.equals("parameter") ) {
			NamedOperator operator = (NamedOperator) container;
			VariableDeclAssoc varAssoc = HlpngserialisationFactory.eINSTANCE.createVariableDeclAssoc();
			varAssoc.setSource(operator);
			varAssoc.setFeature(feature);
			return varAssoc;
		}
		
		return null;
	}

}
