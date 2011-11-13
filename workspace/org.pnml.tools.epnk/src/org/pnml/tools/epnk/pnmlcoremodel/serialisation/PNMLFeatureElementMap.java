package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

//@generated NOT
public class PNMLFeatureElementMap {
	private EStructuralFeature feature;
	private EClass container;
	private EClass target;
	private String element;
	private String attribute;
	private IPNMLFactory factory;
	
	// FIXME maybe, it would be a good idea to include also the name of the XML element here
	//       (would save some extra work in the SAXPNML Handler). The class could also get
	//       a better name: PNML2XMLMap
	
	public PNMLFeatureElementMap(EStructuralFeature feature,
			EClass container,
			EClass target,
			String element,
			String attribute,
			IPNMLFactory factory) {
		this.feature = feature;
		this.container = container;
		this.target = target;
		this.element = element;
		this.attribute = attribute;
		this.factory = factory;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}
	
	/*
	void setFeature(EStructuralFeature feature) {
		this.feature = feature;
	}
	*/

	public EClass getContainer() {
		return container;
	}

	public EClass getTarget() {
		return target;
	}

	public String getElement() {
		return element;
	}
	
	public String getAttribute() {
		return attribute;
	}

	public IPNMLFactory getFactory() {
		return factory;
	}	
	
}