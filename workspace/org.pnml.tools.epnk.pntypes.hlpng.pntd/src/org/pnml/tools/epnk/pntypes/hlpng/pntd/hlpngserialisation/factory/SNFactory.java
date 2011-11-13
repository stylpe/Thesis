package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IAttributeProvider;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IPNMLFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;

public class SNFactory implements IPNMLFactory {

	private static SNFactory instance;
	
	static public synchronized SNFactory getSNFactory() {
		if (instance == null) {
			instance = new SNFactory();
		}
		return instance;
	}
		
	@Override
	public boolean canCreateObject(EStructuralFeature feature,
			Object container, String element, String attribute,
			IAttributeProvider provider) {
		if (feature != null) {
			if (element.equals("finiteenumeration")) {
				return true;
			}
			
			if (feature.equals(
					FiniteenumerationsPackage.eINSTANCE.getFiniteEnumeration_Elements()) &&
					container instanceof FiniteEnumeration &&
					element.equals("feconstant")) {
				return true;
			}
			
			if (element.equals("cyclicenumeration")) {
				return true;
			}
			
			if (element.equals("finiteintrange")) {
				return true;
			}
			
			if (element.equals("partition")) {
				return true;
			}
			
			if (feature.equals(
					PartitionsPackage.eINSTANCE.getPartition_PartitionElements()) &&
					container instanceof Partition &&
					element.equals("partitionelement")) {
				return true;
			}
		}
		if (true) { 
			if ( element.equals("predecessor") ) {
				return true;
			}
			if ( element.equals("successor") ) {
				return true;
			}
			if ( element.equals("finiteintrangeconstant") ) {
				return true;
			}
			if ( element.equals("lessthan") ) {
				return true;
			}
			if ( element.equals("lessthanorequal") ) {
				return true;
			}
			if ( element.equals("greaterthan") ) {
				return true;
			}
			if ( element.equals("greaterthanorequal") ) {
				return true;
			}	
			if (element.equals("partitionelementof") ) {
				return true;
			}
			if (element.equals("ltp") ) {
				return true;
			}
			if (element.equals("gtp") ) {
				return true;
			}
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
		if (feature != null) {
			if (element.equals("finiteenumeration")) {
				return  FiniteenumerationsFactory.eINSTANCE.createFiniteEnumeration();
			}
			
			if (feature.equals(
					FiniteenumerationsPackage.eINSTANCE.getFiniteEnumeration_Elements()) &&
					container instanceof FiniteEnumeration &&
					element.equals("feconstant")) {
				return FiniteenumerationsFactory.eINSTANCE.createFEConstant();
			}
			
			if (element.equals("cyclicenumeration")) {
				return CyclicenumerationsFactory.eINSTANCE.createCyclicEnumeration();
			}
			
			if (element.equals("finiteintrange")) {
				return FiniteintrangesFactory.eINSTANCE.createFiniteIntRange();
			}
			
			if (element.equals("partition")) {
				return PartitionsFactory.eINSTANCE.createPartition();
			}
			
			if (feature.equals(
					PartitionsPackage.eINSTANCE.getPartition_PartitionElements()) &&
					container instanceof Partition &&
					element.equals("partitionelement")) {
				return PartitionsFactory.eINSTANCE.createPartitionElement();
			}
		}

		if (true) { 
			if ( element.equals("predecessor") ) {
				return CyclicenumerationsFactory.eINSTANCE.createPredecessor();
			}
			if ( element.equals("successor") ) {
				return CyclicenumerationsFactory.eINSTANCE.createSuccessor();
			}
			if ( element.equals("finiteintrangeconstant") ) {
				return FiniteintrangesFactory.eINSTANCE.createFiniteIntConstant();
			}
			if ( element.equals("lessthan") ) {
				return FiniteintrangesFactory.eINSTANCE.createLessThan();
			}
			if ( element.equals("lessthanorequal") ) {
				return FiniteintrangesFactory.eINSTANCE.createLessThanOrEqual();
			}
			if ( element.equals("greaterthan") ) {
				return FiniteintrangesFactory.eINSTANCE.createGreaterThan();
			}
			if ( element.equals("greaterthanorequal") ) {
				return FiniteintrangesFactory.eINSTANCE.createGreaterThanOrEqual();
			}	
			if (element.equals("partitionelementof") ) {
				return PartitionsFactory.eINSTANCE.createPartitionElementOf();
			}
			if (element.equals("ltp") ) {
				return PartitionsFactory.eINSTANCE.createLessThan();
			}
			if (element.equals("gtp") ) {
				return PartitionsFactory.eINSTANCE.createGreaterThan();
			}
		}
		


		return null;
	}

}
