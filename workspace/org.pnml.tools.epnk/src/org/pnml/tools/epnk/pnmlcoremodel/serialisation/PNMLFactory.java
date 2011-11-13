package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pntypes.extension.PetriNetTypeExtensions;

// TODO this factory should probably split up into different factories for 
// separate features (to avoid long sequences of alternatives and to improve
// conceptual clarity.

// @generated NOT
public class PNMLFactory implements IPNMLFactory {
	
	private static PNMLFactory instance;
	
	static public synchronized PNMLFactory getPNMLFactory() {
		if (instance == null) {
			instance = new PNMLFactory();
		}
		return instance;
	}

	@Override
	public boolean canCreateObject(EStructuralFeature feature, Object container, String element,
			String attribute, IAttributeProvider provider) {
		if (container instanceof Page && element.equals("place")) {
			return true;
		}
		if (container instanceof Page && element.equals("transition")) {
			return true;
		}
		if (container instanceof Page && element.equals("arc")) {
			return true;
		}
		if (container instanceof Page && element.equals("page")) {
			return true;
		}
		if (container instanceof PetriNet && element.equals("page")) {
			return true;
		}
		if (container instanceof Page && element.equals("referencePlace")) {
			return true;
		}
		if (container instanceof Page && element.equals("referenceTransition")) {
			return true;
		}
		if (container instanceof org.pnml.tools.epnk.pnmlcoremodel.Object && element.equals("graphics")) {
			return true;
		}
		if (container instanceof Label && element.equals("graphics")) {
			return true;
		}
		if (element.equals("toolspecific")) {
			if (feature.equals(PnmlcoremodelPackage.eINSTANCE.getPetriNet_Toolspecific()) && "org.pnml.tool.text".equals(provider.getValue("tool"))) {
				return true;
			}
			if (feature.equals(PnmlcoremodelPackage.eINSTANCE.getPetriNet_Unknown()) && !"org.pnml.tool.text".equals(provider.getValue("tool"))) {
				return true;
			}
			if (feature.equals(PnmlcoremodelPackage.eINSTANCE.getObject_Toolspecific()) && "org.pnml.tool.text".equals(provider.getValue("tool"))) {
				return true;
			}
			if (feature.equals(PnmlcoremodelPackage.eINSTANCE.getObject_Unknown()) && !"org.pnml.tool.text".equals(provider.getValue("tool"))) {
				return true;
			}
			if (feature.equals(PnmlcoremodelPackage.eINSTANCE.getLabel_Toolspecific()) && "org.pnml.tool.text".equals(provider.getValue("tool"))) {
				return true;
			}
			if (feature.equals(PnmlcoremodelPackage.eINSTANCE.getLabel_Unknown()) && !"org.pnml.tool.text".equals(provider.getValue("tool"))) {
				return true;
			}	
		}
		return false;
	}

	@Override
	public EObject createObject(EStructuralFeature feature, Object container, String element,
			String attribute, IAttributeProvider provider) {
		if (container instanceof Page && element.equals("place")) {
			Page page = (Page) container;
			PetriNetType type = NetFunctions.getPetriNetType(page);
			if (type != null) {
				return type.createPlace();
			} else {
				return PnmlcoremodelFactory.eINSTANCE.createPlace();
			}
		}
		if (container instanceof Page && element.equals("transition")) {
			Page page = (Page) container;
			PetriNetType type = NetFunctions.getPetriNetType(page);
			if (type != null) {
				return type.createTransition();
			} else {
				return PnmlcoremodelFactory.eINSTANCE.createTransition();
			}
		}
		if (container instanceof Page && element.equals("arc")) {
			Page page = (Page) container;
			PetriNetType type = NetFunctions.getPetriNetType(page);
			if (type != null) {
				return type.createArc();
			} else {
				return PnmlcoremodelFactory.eINSTANCE.createArc();
			}
		}
		if (container instanceof Page && element.equals("page")) {
			Page page = (Page) container;
			PetriNetType type = NetFunctions.getPetriNetType(page);
			if (type != null) {
				return type.createPage();
			} else {
				return PnmlcoremodelFactory.eINSTANCE.createPage();
			}
		}
		if (container instanceof PetriNet && element.equals("page")) {
			PetriNet net = (PetriNet) container;
			PetriNetType type = net.getType();
			if (type != null) {
				return type.createPage();
			} else {
				return PnmlcoremodelFactory.eINSTANCE.createPage();
			}
		}
		if (container instanceof Page && element.equals("referencePlace")) {
            // TODO RefPlaces could also be made type dependent
			return PnmlcoremodelFactory.eINSTANCE.createRefPlace();
		}
		if (container instanceof Page && element.equals("referenceTransition")) {
            // TODO RefTransitions could also be made type dependent
			return PnmlcoremodelFactory.eINSTANCE.createRefTransition();
		}
		if (element.equals("graphics")) {
			if (container instanceof Arc) {
				return PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
			}
			if (container instanceof Node || container instanceof Page) {
				return PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
			}
			if (container instanceof Label) {
				return PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
			}
		}
		if (element.equals("toolspecific")) {
			/*
			String tool = provider.getValue("tool");
			if ("org.pnml.org.text".equals(tool)) {
				return PnmlcoremodelFactory.eINSTANCE.createToolInfoText();
			} else {
				// return PnmlcoremodelFactory.eINSTANCE.createToolInfoAny();
				return XMLTypeFactory.eINSTANCE.createAnyType();
			}
			*/
			if (feature.equals(PnmlcoremodelPackage.eINSTANCE.getPetriNet_Toolspecific())   ||
					feature.equals(PnmlcoremodelPackage.eINSTANCE.getObject_Toolspecific()) ||
					feature.equals(PnmlcoremodelPackage.eINSTANCE.getLabel_Toolspecific())    ) {
				return PnmlcoremodelFactory.eINSTANCE.createToolInfoText();
			} else {
				return XMLTypeFactory.eINSTANCE.createAnyType();
			}

		}
		
		return null;
	}
	
	@Override
	public Object createAttributeObject(Object object, String attribute,
			IAttributeProvider provider) {
		
		if (object instanceof PetriNet && attribute.equals("type")) {
			String type = provider.getValue(attribute);
			if (type != null) {
				PetriNetType[] pnTypes = PetriNetTypeExtensions.getInstance().getPetriNetTypes();

				for (PetriNetType pnType : pnTypes) {
					PetriNetType newType = pnType.createPetriNetType(type);
					if (newType != null) {
						return newType;
					}
				}
				return null;
			} else {
				return PnmlcoremodelFactory.eINSTANCE.createEmptyType();
			}
		}
		
		if (object instanceof PetriNet && attribute.equals("id")) {
			return provider.getValue(attribute);
		}
		return null;
	}
	
	/* FIXME As it is right now, the id cannot be set with the current infrastructure since
	 *       the set value is supposed to be an EObject, which is not true for strings.
	 *       This needs to be fixed in the architecture. Fx. with a method in the factory
	 *       as shown below. Probably it is enough to make the return type of the above
	 *       method an Object (this would however still not work for basic datatypes like
	 *       int or bool.
	   
	public void setAttribute(Object object, String attribute, IAttributeProvider provider) {
		if (object instanceof PetriNet && attribute.equals("id")) {
			PetriNet net = (PetriNet) object;
			String id = provider.getValue(attribute);
			if (id != null) {
				net.setId(id);
			}
	    }
	}
	*/

}
