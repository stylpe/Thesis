package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class PNMLFeatureAttributeMap {
	private EStructuralFeature feature;
	private EClass containerClass;
	private String attributeName;
	private IPNMLFactory factory;
	
	public PNMLFeatureAttributeMap(EStructuralFeature feature, EClass containerClass,
			String attributeName, IPNMLFactory factory) {
		super();
		this.feature = feature;
		this.containerClass = containerClass;
		this.attributeName = attributeName;
		this.factory = factory;
	}


	public EStructuralFeature getFeature() {
		return feature;
	}
	
	public EClass getContainer() {
		return containerClass;
	}	

	public String getAttributeName() {
		return attributeName;
	}

	public IPNMLFactory getFactory() {
		return factory;
	}

}
