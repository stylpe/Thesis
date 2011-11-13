package org.pnml.tools.epnk.toolspecific.extension;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IAttributeProvider;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.IPNMLFactory;

public class PNMLGenericToolspecificExtensionsFactory implements IPNMLFactory {
	
	private static PNMLGenericToolspecificExtensionsFactory instance;

	private ToolspecificExtensions extension;
	
	public PNMLGenericToolspecificExtensionsFactory() {
		extension = ToolspecificExtensions.getInstance();
	}
	
	public static synchronized PNMLGenericToolspecificExtensionsFactory getInstance() {
		if (instance == null) {
			instance = new PNMLGenericToolspecificExtensionsFactory();
		} 
	    return instance;
	}

	@Override
	public boolean canCreateObject(EStructuralFeature feature,
			Object container, String element, String attribute,
			IAttributeProvider provider) {
		if ((container instanceof PetriNet || container instanceof Object) &&
				attribute != null) {
			for (ToolspecificExtensionFactory factory: extension.getToolspecificExtensionFactories()) {
				String tool = provider.getValue("tool");
				if (tool != null && tool.equals(factory.getToolName())) {
					return true;
				}
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
		if ((container instanceof PetriNet || container instanceof Object) &&
				attribute != null) {
			for (ToolspecificExtensionFactory factory: extension.getToolspecificExtensionFactories()) {
				String tool = provider.getValue("tool");
				if (tool != null && tool.equals(factory.getToolName())) {
					return factory.createToolInfo(tool, provider.getValue("version"));
				}
			}
		}
		return null;
	}

}
