package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;

//@generated NOT
public class PNMLSave extends XMLSaveImpl {

	private ExtendedPNMLMetaData extendedPNMLMetaData;
	
	public PNMLSave(XMLHelper helper, ExtendedPNMLMetaData extendedPNMLMetaData) {
		super(helper);
		this.extendedPNMLMetaData = extendedPNMLMetaData; 
	}
	
	@Override
	protected void saveElement(EObject o, EStructuralFeature f) {		
		String element = extendedPNMLMetaData.getElement(o, f);
		boolean bundle =  extendedPNMLMetaData.getBundleFeatureElement(f) != null;
		if (element != null && !bundle) {
			doc.startElement(element);
			// EK: Added code to save class type as an XML element
			EClass clazz = o.eClass();
			String element2 = extendedPNMLMetaData.getClassElement(clazz);
			if (element2 != null) {
				doc.startElement(element2);
			}
			saveFeatures(o);
			if (element2 != null) {
				doc.endElement();
			}
			
			return;
		} else if (extendedPNMLMetaData.isStandardFeature(f) || bundle) {
			EClass clazz = o.eClass();
			element = extendedPNMLMetaData.getClassElement(clazz);
			if (element != null) {
				doc.startElement(element);
				saveFeatures(o);
				return;
			} 
			
		}
		
		super.saveElement(o, f);	
	}


	@Override
	protected void writeTopAttributes(EObject top) {
        // FIXME added the required PNML namespace attribute: do this properly
		if (top instanceof PetriNetDoc) {
			doc.addAttribute("xmlns", "http://www.pnml.org/version-2009/grammar/pnml");
		}
		super.writeTopAttributes(top);
	}

	@Override
	protected boolean saveFeatures(EObject o) {
		boolean addedPNtype = false;
		if (o instanceof PetriNet) {
			PetriNetType type = ((PetriNet) o).getType();
			if (type != null) {
				this.extendedPNMLMetaData.addPetriNetType(type);
				addedPNtype = true;
			}
		}
		List<EStructuralFeature> featureList = this.extendedPNMLMetaData.getAttributeFeatures(o);
		if (featureList != null) {
			for (EStructuralFeature feature: featureList) {
				// TODO this needs to be more defensive and general
				//      here we circumvent the double saving of features that are id's, but we
				//      do this by name ("id") only (the name of the feature); this could be probably
				//      be done a bit better using the XMLHelpers; but in any case
				//      the  ExtendedPNML mappings (ExtendedPNMLMetaData) and the XML mappings
				//      (PNMLMetaData) must play together -- map the Feature to the same attribute name); 
				if (!feature.getName().equals("id")) {
					Object value = o.eGet(feature);
					if (value != null) {
						doc.addAttribute(extendedPNMLMetaData.getAttribute(o, feature), o.eGet(feature).toString());	
					}
				}
			}
		}
		
		boolean result = super.saveFeatures(o);
		
		if (addedPNtype) {
			this.extendedPNMLMetaData.removePetriNetType();
		}
		
		return result;
	}

	@Override
	protected boolean shouldSaveFeature(EObject o, EStructuralFeature f) {
		// Don't save the name attribute of a SymbolUse, if it refers to a SymbolDef.
		// If the name of the SymbolUse is null, do not save the name attribute either either.
		if (o instanceof SymbolUse && f == StructuredpntypemodelPackage.eINSTANCE.getSymbolUse_Name()) {
			SymbolUse symbol = (SymbolUse) o;
			if (symbol.getName() == null) {
				return false;
			}
			Object object = symbol.eGet(symbol.getRefFeature());
			if (object != null && object instanceof SymbolDef) {
				return false;
			}	
		}
		return super.shouldSaveFeature(o, f);
	}

	@Override
	protected void saveContainedSingle(EObject o, EStructuralFeature f) {
		// FIXME make this cleaner: make sure that features that are saved by the
		// own Attributefeatures mapping are not saved here again. And this should also be
		// done if the feature is an attribute, etc (right now it is only
		// implemented for containment features with cardinality 0..1, which
		// works fine for the type feature of the net, for which this mechanism
		// was introduced.
		List<EStructuralFeature> featureList = this.extendedPNMLMetaData.getAttributeFeatures(o);
		if (featureList != null && featureList.contains(f)) {			
			return;
		}
		super.saveContainedSingle(o, f);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void saveContainedMany(EObject o, EStructuralFeature f) {

		// EK could be more defensive
		String name = this.extendedPNMLMetaData.getBundleFeatureElement(f);

		if (name != null) {
			Object fo = o.eGet(f);
			// EK note that we save the bundle feature element only,
			//    if there are objects contained. Empty lists would
			//    result in the AssocClass artifacts would not be
			//    properly removed when loading theses features.
			if (fo != null && fo instanceof EList && ((EList) fo).size() > 0) {
			    doc.startElement(name);
			} else {
				name = null;
			}
		}
		
		super.saveContainedMany(o, f);
		
		if (name != null) {
			doc.endElement();
		}
	}
	
}
