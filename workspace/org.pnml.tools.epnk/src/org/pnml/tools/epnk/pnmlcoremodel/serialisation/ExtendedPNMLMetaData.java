package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;

// @generated NOT 
public class ExtendedPNMLMetaData {
	
	private HashMap<EStructuralFeature,List<PNMLFeatureElementMap>> feature2featureMapList;
	private HashMap<String,List<PNMLFeatureElementMap>> element2featureMapList;
	
	private HashMap<EStructuralFeature,List<PNMLFeatureAttributeMap>> feature2attributeList;
	private HashMap<String,List<PNMLFeatureAttributeMap>> attribute2featureList;
	private List<PNMLFeatureAttributeMap> attributes;
	
	private HashMap<EClass,EStructuralFeature> content2featureMap;
	
	// EK: New Map for mapping a objects type to an XML element;
	// Note that this still needs to be refined (right now, we
	// assume that the same XML element means the same in every
	// context (which is not realistic for different types and
	// for some types, it might even be unrealistic within the
	// same type.
	private HashMap<EClass,String> targetClass2element;
	private HashMap<String,IPNMLFactory> element2factory;
	
	// Standard features
	private HashMap<EStructuralFeature,EClass> standardFeature2class;
	private HashMap<EClass,EStructuralFeature> class2standardFeature;
	
	// Bundle feature mappings
	private HashMap<EStructuralFeature,String> bundleFeatures;
	
	private ExtendedPNMLMetaData delegatedExtendedPNMLMetaData;


	public ExtendedPNMLMetaData() {
		feature2featureMapList = new HashMap<EStructuralFeature,List<PNMLFeatureElementMap>>();
		element2featureMapList = new HashMap<String,List<PNMLFeatureElementMap>>();
		
		feature2attributeList = new HashMap<EStructuralFeature,List<PNMLFeatureAttributeMap>>();
		attribute2featureList = new HashMap<String,List<PNMLFeatureAttributeMap>>();
		attributes = new Vector<PNMLFeatureAttributeMap>();
		
		content2featureMap = new HashMap<EClass,EStructuralFeature>();
		
		targetClass2element = new HashMap<EClass,String>();
		element2factory = new HashMap<String,IPNMLFactory>();
		
		standardFeature2class =  new HashMap<EStructuralFeature,EClass>();
		class2standardFeature = new HashMap<EClass,EStructuralFeature>();
		
		bundleFeatures = new HashMap<EStructuralFeature,String>();
		
		delegatedExtendedPNMLMetaData = null;
	}

	public void add(EStructuralFeature feature, EClass container, EClass target, String element, String attribute, IPNMLFactory factory, boolean bundle) {
		if (bundle && feature != null && feature.getUpperBound() < 0 && element != null) {
			bundleFeatures.put(feature,element);
		}
		
		this.add(feature, container, target, element, attribute, factory);
		
	}
	
	public void add(EStructuralFeature feature, EClass container, EClass target, String element, String attribute, IPNMLFactory factory) {
		
		if (feature == null) {
			if (element != null && target != null) {
		     targetClass2element.put(target, element);
		     element2factory.put(element, factory);
		     // FIXME should be joint with the other case
		     List<PNMLFeatureElementMap> featureMapList = element2featureMapList.get(element);
		     if ( featureMapList == null) {
		    	 featureMapList = new Vector<PNMLFeatureElementMap>();
		    	 element2featureMapList.put(element, featureMapList);
		     }
		     featureMapList.add(new PNMLFeatureElementMap(feature,container,target,element,attribute,factory));
		     return;
		     // FIXME Note that in the case of an empty feature, we do not set the other
		     // mappings for now (as we are testing this). This can be improved by storing
		     // and checking for the right context.
			} else {
			   // this should not happen
			   Assert.isTrue(false);
			}
		}
		
		if (element != null || factory != null) {
			PNMLFeatureElementMap featureMap = new PNMLFeatureElementMap(feature,container,target,element,attribute,factory);

			List<PNMLFeatureElementMap> featureMapList =  feature2featureMapList.get(feature);
			if (featureMapList == null) {
				featureMapList = new Vector<PNMLFeatureElementMap>();
				feature2featureMapList.put(feature, featureMapList);
			}
			featureMapList.add(featureMap);

			featureMapList = element2featureMapList.get(element);
			if ( featureMapList == null) {
				featureMapList = new Vector<PNMLFeatureElementMap>();
				element2featureMapList.put(element, featureMapList);
			}
			featureMapList.add(new PNMLFeatureElementMap(feature,container,target,element,attribute,factory));
		} else {
			   standardFeature2class.put(feature, target);
			   class2standardFeature.put(container, feature);
	    }
		
	}
	
	public void addAttributeMapping(EStructuralFeature feature, EClass containerClass, String attributeName, IPNMLFactory factory) {
		PNMLFeatureAttributeMap feature2attributeMap = new PNMLFeatureAttributeMap(feature,containerClass,attributeName,factory);
		attributes.add(feature2attributeMap);
		
		List<PNMLFeatureAttributeMap> attributeList = feature2attributeList.get(feature);
		if (attributeList == null) {
			attributeList = new Vector<PNMLFeatureAttributeMap>();
			feature2attributeList.put(feature, attributeList);
		}
		attributeList.add(feature2attributeMap);	
		
		attributeList = attribute2featureList.get(attributeName);
		if (attributeList == null) {
			attributeList = new Vector<PNMLFeatureAttributeMap>();
			attribute2featureList.put(attributeName, attributeList);
		}
		attributeList.add(feature2attributeMap);	
		
	}
	
	public void addContentFeatureMapping(EClass clazz, EStructuralFeature feature) {
		// TODO this mapping is not yet considered, when saving the XML file;
		//      this feature should not yet be used.
		content2featureMap.put(clazz,feature);
	}

	
	public String getElement(EObject o, EStructuralFeature f) {
		String result = null;

		List<PNMLFeatureElementMap> featureMapList = feature2featureMapList.get(f);
		if (featureMapList != null) {
			for (PNMLFeatureElementMap featureMap : featureMapList) {
				EClass target = featureMap.getTarget();
				if (target == null || target.isInstance(o)) {
					result = featureMap.getElement();
					// FIXME up to now, we just take the last mapping. What we should use however,
					//       is the most specific one (and then, actually rather the first most
					//       specific one!
				}
			}
		}
		
		if (result == null && delegatedExtendedPNMLMetaData != null) {
			result = delegatedExtendedPNMLMetaData.getElement(o, f);
		}
		
		return result;
	}

    public PNMLFeatureElementMap getFeatureElementMap(EObject container, String name, boolean isElement, IAttributeProvider provider) {
    	PNMLFeatureElementMap result = null;

    	List<PNMLFeatureElementMap> featureMapList = element2featureMapList.get(name);
    	if (featureMapList != null) {

    		for (PNMLFeatureElementMap featureMap: featureMapList) {
    			if ((featureMap.getContainer() == null || featureMap.getContainer().isInstance(container)) &&
    					(featureMap.getFeature() == null || featureMap.getFeature().getContainerClass().isInstance(container)) ) {
    				String attribute = featureMap.getAttribute();
    				if (attribute == null || provider.getValue(attribute) != null) {
    					EStructuralFeature feature = featureMap.getFeature();
    					if (feature == null && container != null) {
    						feature = this.getStandardFeature(container.eClass());
    						EClass targetClass = featureMap.getTarget();
    						if (feature != null && (targetClass == null || targetClass.equals(feature.getEType()) || targetClass.getEAllSuperTypes().contains(feature.getEType()))) {
    							featureMap =
    								new PNMLFeatureElementMap(
    										feature,
    										featureMap.getContainer(),
    										featureMap.getTarget(),
    										featureMap.getElement(),
    										featureMap.getAttribute(),
    										featureMap.getFactory());

    							// FIXME maybe we should use the standard feature only, if there is no other
    							//       "more suitable feature".
    						}
    					}
    					IPNMLFactory factory = featureMap.getFactory();
    					if (factory != null ) {
    						if (factory.canCreateObject(featureMap.getFeature(), container, name, attribute, provider)) {
    							// FIXME up to now, we just take the last mapping. What we should use however,
    							//       is the most specific one (and then, actually rather the first most
    							//       specific one!
    							result = featureMap;
    							// FIXME (see above) Now, we take the first mapping! Actually we should take the
    							//       first most specific mapping (whatever that precisely is)
    							return result;
    						}
    					} else {
    						// This checks whether the target could be generated by the standard factory of the
    						// respective package and would be of the correct type.
    						EClass targetClass = featureMap.getTarget();
    						EClassifier featureType =  feature.getEType();
    						if (feature != null && targetClass != null && 
    								featureType instanceof EClass &&
    								((EClass) featureType).isSuperTypeOf(targetClass)) {
    							result = featureMap;
    							return result;
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	if (result == null && delegatedExtendedPNMLMetaData != null) {
    		result = delegatedExtendedPNMLMetaData.getFeatureElementMap(container, name, isElement, provider); 
    	}
    	return result;
    	
    }
    
    public PNMLFeatureAttributeMap getFeature2AttributeMap(EObject o) {
    	PNMLFeatureAttributeMap result = null;
    	
    	for (PNMLFeatureAttributeMap featureAttributeMap: attributes) {
    		if (featureAttributeMap.getContainer().isInstance(o)) {
    			result = featureAttributeMap;
    		}
    	}
    	
    	if (result == null && delegatedExtendedPNMLMetaData != null) {
    		result = delegatedExtendedPNMLMetaData.getFeature2AttributeMap(o);
    	}
    	return result;
    	
    }
    
    public List<EStructuralFeature> getAttributeFeatures(EObject o) {
    	// TODO this is done over and over again for the same classes
    	//      this should be stored in a HasMap
    	Vector<EStructuralFeature> result = new Vector<EStructuralFeature>();
    	
    	for (PNMLFeatureAttributeMap featureAttributeMap: attributes) {
    		if (featureAttributeMap.getContainer().isInstance(o)) {
    			// TODO if a feature is more specific than another one,
    			//      only the more specific should go to this list!
    			result.add(featureAttributeMap.getFeature());
    		}
    	}
    	
    	if (delegatedExtendedPNMLMetaData != null) {
    		result.addAll(delegatedExtendedPNMLMetaData.getAttributeFeatures(o));
    	}
    	return result;
    }
    
    public List<PNMLFeatureAttributeMap> getFeatureAttributeMapList(EObject o) {
    	// TODO this is done over and over again for the same classes
    	//      this should be stored in a HasMap
    	Vector<PNMLFeatureAttributeMap> result = new Vector<PNMLFeatureAttributeMap>();
    	
    	for (PNMLFeatureAttributeMap featureAttributeMap: attributes) {
    		if (featureAttributeMap.getContainer().isInstance(o)) {
    			// TODO if a feature is more specific than another one,
    			//      only the more specific should go to this list!
    			result.add(featureAttributeMap);
    		}
    	}
    	
    	if (delegatedExtendedPNMLMetaData != null) {
    		result.addAll(delegatedExtendedPNMLMetaData.getFeatureAttributeMapList(o));
    	}
    	return result;
    }
    
	public String getAttribute(EObject o, EStructuralFeature f) {
		String result = null;

		List<PNMLFeatureAttributeMap> attributeList = feature2attributeList.get(f);
		if (attributeList != null) {
			for (PNMLFeatureAttributeMap feature2attribute : attributeList) {
				EClass container = feature2attribute.getContainer();
				if (container == null || container.isInstance(o)) {
					result = feature2attribute.getAttributeName();
					// FIXME up to now, we just take the last mapping. What we should use however,
					//       is the most specific one (and then, actually rather the first most
					//       specific one!
				}
			}
		}

    	if (delegatedExtendedPNMLMetaData != null) {
    		String result2 = delegatedExtendedPNMLMetaData.getAttribute(o, f);
    		// also here make sure to take the last result
    		if (result2 != null) {
    			result = result2;
    		}
    	}
		return result;
	}
	
	
	public boolean setAttribute(EObject o, String name, IAttributeProvider provider) {
		List<PNMLFeatureAttributeMap> attributeList = attribute2featureList.get(name);
		// eki we start with the delegation, in order to get the last mapping first;
		if (delegatedExtendedPNMLMetaData != null) {
			if (delegatedExtendedPNMLMetaData.setAttribute(o, name, provider)) {
				return true;
			}
		}
		
		if (attributeList != null) {

			PNMLFeatureAttributeMap useMap = null;
			for (PNMLFeatureAttributeMap feature2attribute : attributeList) {
				EClass container = feature2attribute.getContainer();
				if (container == null || container.isInstance(o)) {
					useMap = feature2attribute;
					// FIXME up to now, we just take the last mapping. What we should use however,
					//       is the most specific one (and then, actually rather the first most
					//       specific one!
				}
			}

			o.eSet(useMap.getFeature(), useMap.getFactory().createAttributeObject(o, name, provider));

			return true;
		}
		
		return false;
		
	}
	
	public EStructuralFeature getContentFeature(EClass clazz) {
		EStructuralFeature result = null;
	    if (delegatedExtendedPNMLMetaData != null) {
	    	result = delegatedExtendedPNMLMetaData.getContentFeature(clazz);
	    }
	    if (result == null) {
	    	result = content2featureMap.get(clazz);
	    }
		return result;
	}

	
	public String getClassElement(EClass clazz) {
		String result = null;
	    if (delegatedExtendedPNMLMetaData != null) {
	    	result = delegatedExtendedPNMLMetaData.getClassElement(clazz);
	    }
	    if (result == null) {
	    	result = targetClass2element.get(clazz);
	    }
		return result;
	}
	
	public IPNMLFactory getElementFactory(String element) {
		IPNMLFactory result = null;
	    if (delegatedExtendedPNMLMetaData != null) {
	    	result = delegatedExtendedPNMLMetaData.getElementFactory(element);
	    }
	    if (result == null) {
	    	result = element2factory.get(element);
	    }
		return result;		
	}
	
	public boolean isStandardFeature(EStructuralFeature feature) {
		boolean result = false;
	    if (delegatedExtendedPNMLMetaData != null) {
	    	result = delegatedExtendedPNMLMetaData.isStandardFeature(feature);
	    }
	    if (!result) {
	    	result = standardFeature2class.containsKey(feature);
	    }
		return result;
	}
	
	
	/* TODO up to now this is not used at all.
	public EClass getStandardFeatureClass(EStructuralFeature feature) {
		return standardFeature2class.get(feature);
	}
	*/
	
	public EStructuralFeature getStandardFeature(EClass clazz) {
	    Vector<EClass> inspectClasses = new Vector<EClass>();
	    inspectClasses.add(clazz);
	    EStructuralFeature feature = null;
	    
	    while(feature == null && inspectClasses.size() > 0) {
	    	// FIXME this could be implemented a bit more efficiently
	    	//       and there might be problems in case of multiple
	    	//       inheritance.
	    	EClass c = inspectClasses.firstElement();
	    	inspectClasses.remove(c);
	    	feature = class2standardFeature.get(c);
	    	inspectClasses.addAll(c.getESuperTypes());
	    }
	    
	    if (feature == null && delegatedExtendedPNMLMetaData != null) {
	    	feature = delegatedExtendedPNMLMetaData.getStandardFeature(clazz);
	    }
	    
	    return feature;
	}
	
	public String getBundleFeatureElement(EStructuralFeature feature) {
		String result = null;
		if (delegatedExtendedPNMLMetaData != null) {
			result = delegatedExtendedPNMLMetaData.getBundleFeatureElement(feature);
		}
		
		if (result == null) {
			result = bundleFeatures.get(feature);
		}
		return result;
	}
	
	public void addPetriNetType(PetriNetType type) {
		if (delegatedExtendedPNMLMetaData != null) {
			delegatedExtendedPNMLMetaData.addPetriNetType(type);
		} else {
			delegatedExtendedPNMLMetaData = new ExtendedPNMLMetaData();
			type.registerExtendedPNMLMetaData(delegatedExtendedPNMLMetaData);
		}
	}
	
	public void removePetriNetType() {
		if (delegatedExtendedPNMLMetaData != null) {
			if (delegatedExtendedPNMLMetaData.delegatedExtendedPNMLMetaData == null) {
				delegatedExtendedPNMLMetaData = null;
			} else {
				delegatedExtendedPNMLMetaData.removePetriNetType();
			}
		}
	}
	
}
