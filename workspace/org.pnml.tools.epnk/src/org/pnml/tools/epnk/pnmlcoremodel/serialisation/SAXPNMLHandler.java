package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.serialisation.AssocClass;
import org.pnml.tools.epnk.serialisation.SerialisationPackage;

//@generated NOT
public class SAXPNMLHandler extends SAXXMLHandler implements IAttributeProvider {
	
	/* FIXME delete remainders of first experiments with places
	private enum ObjectType  { place, transition };
	*/
	
	private ExtendedPNMLMetaData extendedPNMLMetaData;
	
	/* FIXME delete remainders of original experiments with places
	private ObjectType last = null;	
	private Place place = null;
	*/
	
	private PNMLFeatureElementMap currentFeatureElementMap = null;
	// FIXME would be nicer, if we would not need this (could be done with including
	//       the name of the element in the class PNMLFeatureElementMap.
	private String currentElement = null;
	private EObject currentObject = null;
	
	// EK: test
	private AssocClass currentAssocObject = null;
	private EObject currentContainerObject = null;
	// EK end

	public SAXPNMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options, ExtendedPNMLMetaData extendedPNMLMetaData) {
		super(xmiResource, helper, options);
		this.extendedPNMLMetaData = extendedPNMLMetaData;
	}

	@Override
	protected EPackage getPackageForURI(String uriString) {
		// FIXME
		if (uriString == null || uriString.equals("")) {
			return PnmlcoremodelPackage.eINSTANCE;
		}
		
		return super.getPackageForURI(uriString);
	}

	@Override
	protected EStructuralFeature getFeature(EObject object, String prefix,
			String name, boolean isElement) {
		
		/* FIXME delete remainders of original experiments with places
		// FIXME quick and dirty hack to read place features	
		if (object instanceof Page && "".equals(prefix) && "place".equals(name)) {
			last = ObjectType.place;
			return PnmlcoremodelPackage.eINSTANCE.getPage_Object();
			
		}
		*/

		// EK: test assoc / type
		if (object instanceof AssocClass && isElement) {
			this.currentAssocObject = (AssocClass) object;
			this.currentElement = name;
			EStructuralFeature feature = SerialisationPackage.eINSTANCE.getAssocClass_Target();
			return feature;
			
		}
		// EK: end
		
		PNMLFeatureElementMap featureElementMap = extendedPNMLMetaData.getFeatureElementMap(object, name, isElement, this);
		if (featureElementMap != null) {

			/* This is now done in the the get FeatureElementMap method
			EStructuralFeature feature = featureElementMap.getFeature();
			
			if (feature == null) {
				// FIXME this needs to be done a bit more defensively (and could
				//       probably moved to the getFeatureElementMap method of extendedMetaData!
				feature = extendedPNMLMetaData.getStandardFeature(object.eClass());
				featureElementMap = new PNMLFeatureElementMap(
						feature,
						object.eClass(),
						extendedPNMLMetaData.getStandardFeatureClass(feature),
						name,
						featureElementMap.getAttribute(),
						featureElementMap.getFactory());
				
			}
			*/
			this.currentFeatureElementMap = featureElementMap;
			this.currentElement = name;
			// EK: test
			this.currentContainerObject = object;
			// EK end
			return featureElementMap.getFeature();
		} 
		
		
		// FIXME experiment for setting attributes (in this case the type attribute of nets
		if (!isElement) {
			List<PNMLFeatureAttributeMap> featureMapList = extendedPNMLMetaData.getFeatureAttributeMapList(object);
			if (featureMapList != null && featureMapList.size() > 0) {
				for (PNMLFeatureAttributeMap featureMap: featureMapList) {
					if (featureMap.getAttributeName().equals(name)) {
						return featureMap.getFeature();
					}
				}
			}
		}
			
		return super.getFeature(object, prefix, name, isElement);
	}

	@Override
	protected void createObject(EObject peekObject, EStructuralFeature feature) {
	
		/* FIXME delete remainders of original experiments with places
	    // FIXME should be programmed more defensively
		if (peekObject instanceof Page && PnmlcoremodelPackage.eINSTANCE.getPage_Object().equals(feature)
				&& ObjectType.place.equals(last) && place == null) {
			// It is possible to access some attributes of the XML element via:
			// String test = attribs.getValue("name");
			place = PnmlcoremodelFactory.eINSTANCE.createPlace();
			
			this.handleObjectAttribs(place);
			// Page page = (Page) peekObject;
			// page.getObject().add(place);
			last = null;
			// place = null;
			// return;
		}
		*/
		
		// EK: add test for assoc & type map
		if (this.currentAssocObject != null) {
			currentObject = extendedPNMLMetaData.getElementFactory(this.currentElement).
			  createObject(null, this.currentAssocObject, this.currentElement, null, null);
			currentElement = null;
			this.currentAssocObject = null;
			if (currentObject instanceof AssocClass) {
				AssocClass assoc = (AssocClass) currentObject;
				assoc.setFeature(feature);
				assoc.setSource(currentContainerObject);
			}
			this.currentContainerObject = null;
			this.handleObjectAttribs(currentObject);
		} else
		// EK end
		
		// TODO this needs to be carefully checked.
		if (currentFeatureElementMap != null &&
				feature.equals(currentFeatureElementMap.getFeature()) &&
				(currentFeatureElementMap.getContainer() == null || currentFeatureElementMap.getContainer().isInstance(peekObject))) {
			IPNMLFactory factory = currentFeatureElementMap.getFactory();
			if (factory != null) {
				currentObject =  factory.createObject(feature, peekObject, currentElement, currentFeatureElementMap.getAttribute(), this);
			} else {
				// If there is no factory, use the standard way of EMF to create an object of the target class.
				EClass eClass = currentFeatureElementMap.getTarget();
				if (eClass != null) {
					currentObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
				}
			}
			currentFeatureElementMap = null;
			currentElement = null;
			
			// EK: addition to deal with feature and class mappings:
			if (currentObject instanceof AssocClass) {
				AssocClass assoc = (AssocClass) currentObject;
				assoc.setFeature(feature);
				assoc.setSource(currentContainerObject);
			}
			this.currentContainerObject = null;
			// EK: end
			
			this.handleObjectAttribs(currentObject);
		}
		
		/*
		PNMLFeatureAttributeMap feature2AttributeMap = extendedPNMLMetaData.getFeature2AttributeMap(peekObject);
		
		if (feature2AttributeMap != null && feature2AttributeMap.equals(feature) ) {
			currentAttribute = feature2AttributeMap.getFactory().createAttributeObject(peekObject,
					feature2AttributeMap.getAttributeName(), this);
		}
		*/
		
		super.createObject(peekObject, feature);
	}

	@Override
	protected EObject validateCreateObjectFromFactory(EFactory factory,
			String typeName, EObject newObject, EStructuralFeature feature) {
		
		/* FIXME delete remainders of original experiments with places
		// FIXME this needs to be much more defensive and also validated
		//       in the end.
		if (newObject == null && place != null) {
			EObject object = place;
			place = null;
			return object;
			// super.validateCreateObjectFromFactory(factory, "Place", object,
			//		feature);
		}
		*/
		
		// FIXME right now, we jump over the built- validation! But we eventually
		//       need to implement our own one (otherwise the complete serialisation
		//       could easily be compromised by bad ExtendedPNMLMetaData!
		if (/*newObject == null && */ currentObject != null) {
			EObject object = currentObject;
			currentObject = null;
			return object;
		}
		
		/*
		// FIXME ditto
		if (currentAttribute != null) {
			EObject object = currentAttribute;
			currentAttribute = null;
			return object;
		}
		*/
		
		return super.validateCreateObjectFromFactory(factory, typeName, newObject,
				feature);
	}

	@Override
	protected void handleXMLNSAttribute(String attrib, String value) {
		// FIXME for now the xmlns attribute of the PNML element is ignored
		if ("xmlns".equals(attrib) && elements.size() == 1) {
			Object o = elements.get(0);
			if ("pnml".equals(o)) {
			    if (!"http://www.pnml.org/version-2009/grammar/pnml".equals(value)) {
					this.reportUnknownFeature("", attrib, false, null, value);
			    }	
				return;
			}
		}
		super.handleXMLNSAttribute(attrib, value);
	}
	
	@Override
	protected void handleObjectAttribs(EObject obj) {
		// FIXME right now the id of a net is ignored! This
		//       needs to be fixed (maybe by introducing an explicit mapping).
		List<EStructuralFeature> featureList = extendedPNMLMetaData.getAttributeFeatures(obj);
		if (featureList != null && featureList.size() > 0) {
			for (EStructuralFeature feature: featureList) {
			extendedPNMLMetaData.setAttribute(
					obj, 
					extendedPNMLMetaData.getAttribute(obj, feature),
					this);
			}
			return;
		}
		
		// FIXME this is a hack. For some reason, the SAX parser tries to
		//       create another object for an already created object again;
		//       since it does not know its type, it will be an EObjectImpl;
		//       the attributes for this object can of course not be set.
		//       Therefore, we skip this in case the object is of type
		//       EObjectImpl.  But, this is a hack. The better solution would
		//       better to avoid another creation of this object. I still need
		//       to find out how this could be done.
		if (obj==null ||  obj.eClass().equals(EcorePackage.eINSTANCE.getEObject())) {
			return;
		}
		super.handleObjectAttribs(obj);
	}
		
	@Override
	protected EStructuralFeature getContentFeature(EObject object) {
		// TODO This feature is not yet implemented in the PNMLSave; therefore,
		//      it is of limited use and must be used with great care. But, it
		//      might be useful in some cases; so I did not deactivate it yet.
		EStructuralFeature feature = extendedPNMLMetaData.getContentFeature(object.eClass());
		if (feature != null) {
			return feature;
		}
		return super.getContentFeature(object);
	}

	
	@Override
	public String getValue(String attribute) {
		return attribs.getValue(attribute);
	}

	
	
	@Override
	protected void processObject(EObject object) {
		if (object instanceof PetriNet) {
			PetriNetType type = ((PetriNet) object).getType();
			if (type != null) {
				this.extendedPNMLMetaData.addPetriNetType(type);
			}
		}
		super.processObject(object);
	}

	@Override
	public void endElement(String uri, String localName, String name) {
		int size = this.objects.size();
		if (size > 0) {
			EObject object = this.objects.get(size-1);
			if (object instanceof PetriNet) {
				PetriNetType type = ((PetriNet) object).getType();
				if (type != null) {
					this.extendedPNMLMetaData.removePetriNetType();
				}
			}
		}
		super.endElement(uri, localName, name);
	}
	
}
