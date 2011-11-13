package org.pnml.tools.epnk.pntypes.extension;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;

public class PetriNetTypeExtensions {

	private static PetriNetTypeExtensions instance;
	
	private String[] names;
	private PetriNetType[] types;	

	public static synchronized PetriNetTypeExtensions getInstance() {
		if (instance == null) {
			instance = new PetriNetTypeExtensions();

			IExtensionRegistry reg = Platform.getExtensionRegistry();
			IExtensionPoint extPoint = reg.
				getExtensionPoint("org.pnml.tools.epnk.pntd");

			IExtension[] extensions = extPoint.getExtensions();

			instance.names = new String[extensions.length+1];	
			instance.types = new PetriNetType[extensions.length+1];
			
			// the empty type is an implicit extension (it is a bit simpler
			// if all Petri net types are dealt with in this way.
			instance.names[0] = "org.pnml.tools.epnk.empty";
			instance.types[0] = PnmlcoremodelFactory.eINSTANCE.createEmptyType();

			for (int i = 0; i < extensions.length; i++) {
				IExtension extension = extensions[i];
				IConfigurationElement confs[] = extension.getConfigurationElements();
				IConfigurationElement elem = confs[0];
				try {
					instance.names[i+1] = (String) extension.getLabel();
					instance.types[i+1] = (PetriNetType) elem.createExecutableExtension("class");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return instance;
	}
	
	public PetriNetType[] getPetriNetTypes() {
		return types;
	}

}
