package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IAttributeProvider;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IPNMLFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationFactory;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.SortAssoc;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsFactory;

public class FullHLPNGFactory implements IPNMLFactory {

	private static FullHLPNGFactory instance;
	
	static public synchronized FullHLPNGFactory getFullHLPNGFactory() {
		if (instance == null) {
			instance = new FullHLPNGFactory();
		}
		return instance;
	}
		
	@Override
	public boolean canCreateObject(EStructuralFeature feature,
			Object container, String element, String attribute,
			IAttributeProvider provider) {
		
		if (element.equals("string")) {
			return  true;
		}
		if (element.equals("list")) {
			return  true;
		}
		
		if (feature != null &&
				feature.equals(ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator_Input()) &&
				container instanceof ArbitraryOperator &&
				element.equals("input") ) {
				return true;
		}
		
		if (feature != null &&
				feature.equals(ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator_Output()) &&
				container instanceof ArbitraryOperator &&
				element.equals("output") ) {
				return true;
		}

		if ( element.equals("stringconcatenation") ) {
			return true;
		}
		if ( element.equals("stringappend") ) {
			return true;
		}		
		if ( element.equals("stringlength") ) {
			return true;
		}
		if ( element.equals("leqs") ) {
			return true;
		}
		if ( element.equals("lts") ) {
			return true;
		}	
		if ( element.equals("geqs") ) {
			return true;
		}
		if ( element.equals("gts") ) {
			return true;
		}
		if ( element.equals("substring") ) {
			return true;
		}
		if ( element.equals("stringconstant") ) {
			return true;
		}
		if ( element.equals("listconcatenation") ) {
			return true;
		}	
		if ( element.equals("listappend") ) {
			return true;
		}
		if ( element.equals("listlength") ) {
			return true;
		}
		if ( element.equals("makelist") ) {
			return true;
		}
		if ( element.equals("memberatindex") ) {
			return true;
		}		
		if ( element.equals("sublist") ) {
			return true;
		}
		if ( element.equals("emptylist") ) {
			return true;
		}	
		// FIXME eki: experiment with standard factory (could probably be used for
		// most mappings and would simplify most mappings):
		/*
		if ( element.equals("arbitrarysort") ) {
			return true;
		}
		if ( element.equals("arbitraryoperator") ) {
			return true;
		}
		*/
		if ( element.equals("unparsed") ) {
			return true;
		}

		return false;
	}

	@Override
	public Object createAttributeObject(Object object, String attribute,
			IAttributeProvider provider) {		
		return null;
	}

	@Override
	public EObject createObject(EStructuralFeature feature, Object container,
			String element, String attribute, IAttributeProvider provider) {

		if (element.equals("string")) {
			return  StringsFactory.eINSTANCE.createString();
		}
		if (element.equals("list")) {
			return  ListsFactory.eINSTANCE.createList();
		}

		if ( element.equals("stringconcatenation") ) {
			return StringsFactory.eINSTANCE.createConcatenation();
		}
		if ( element.equals("stringappend") ) {
			return StringsFactory.eINSTANCE.createAppend();
		}
		if ( element.equals("stringlength") ) {
			return StringsFactory.eINSTANCE.createLength();
		}
		if ( element.equals("leqs") ) {
			return StringsFactory.eINSTANCE.createLessThanOrEqual();
		}	
		if ( element.equals("lts") ) {
			return StringsFactory.eINSTANCE.createLessThan();
		}
		if ( element.equals("geqs") ) {
			return StringsFactory.eINSTANCE.createGreaterThanOrEqual();
		}	
		if ( element.equals("gts") ) {
			return StringsFactory.eINSTANCE.createGreaterThan();
		}	
		if ( element.equals("substring") ) {
			return StringsFactory.eINSTANCE.createSubstring();
		}
		if ( element.equals("stringconstant") ) {
			return StringsFactory.eINSTANCE.createStringConstant();
		}	
		if ( element.equals("listconcatenation") ) {
			return ListsFactory.eINSTANCE.createConcatenation();
		}
		if ( element.equals("listappend") ) {
			return ListsFactory.eINSTANCE.createAppend();
		}
		if ( element.equals("listlength") ) {
			return ListsFactory.eINSTANCE.createLength();
		}
		if ( element.equals("makelist") ) {
			return ListsFactory.eINSTANCE.createMakeList();
		}
		if ( element.equals("memberatindex") ) {
			return ListsFactory.eINSTANCE.createMemberAtIndex();
		}
		if ( element.equals("sublist") ) {
			return ListsFactory.eINSTANCE.createSublist();
		}
		if ( element.equals("emptylist") ) {
			return ListsFactory.eINSTANCE.createEmptyList();
		}	
		// FIXME eki: experiment with standard factory (could probably be used for
		// most mappings and would simplify most mappings):
		/*
		if ( element.equals("arbitrarysort") ) {
			return ArbitrarydeclarationsFactory.eINSTANCE.createArbitrarySort();
		}
		if ( element.equals("arbitraryoperator") ) {
			return ArbitrarydeclarationsFactory.eINSTANCE.createArbitraryOperator();
		}
		*/
		if ( element.equals("unparsed") ) {
			return ArbitrarydeclarationsFactory.eINSTANCE.createUnparsed();
		}
		
		if (feature != null &&
				feature.equals(ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator_Input()) &&
				container instanceof ArbitraryOperator &&
				element.equals("input") ) {
			ArbitraryOperator operator = (ArbitraryOperator) container;
			SortAssoc sortAssoc = HlpngserialisationFactory.eINSTANCE.createSortAssoc();
			sortAssoc.setSource(operator);
			sortAssoc.setFeature(feature);
			return sortAssoc;
		}
		
		if (feature != null &&
				feature.equals(ArbitrarydeclarationsPackage.eINSTANCE.getArbitraryOperator_Output()) &&
				container instanceof ArbitraryOperator &&
				element.equals("output") ) {
			ArbitraryOperator operator = (ArbitraryOperator) container;
			SortAssoc sortAssoc = HlpngserialisationFactory.eINSTANCE.createSortAssoc();
			sortAssoc.setSource(operator);
			sortAssoc.setFeature(feature);
			return sortAssoc;
		}
		
		return null;
	}

}
