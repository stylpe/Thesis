package org.pnml.tools.epnk.toolspecific.extension;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class ToolspecificExtensions {

	private static ToolspecificExtensions instance;
	
	private String[] names;
	private ToolspecificExtensionFactory[] extensionfactory;	

	public static synchronized ToolspecificExtensions getInstance() {
		if (instance == null) {
			instance = new ToolspecificExtensions();

			IExtensionRegistry reg = Platform.getExtensionRegistry();
			IExtensionPoint extPoint = reg.
				getExtensionPoint("org.pnml.tools.epnk.toolspecific");

			IExtension[] extensions = extPoint.getExtensions();

			instance.names = new String[extensions.length];	
			instance.extensionfactory = new ToolspecificExtensionFactory[extensions.length];
			
			for (int i = 0; i < extensions.length; i++) {
				IExtension extension = extensions[i];
				IConfigurationElement confs[] = extension.getConfigurationElements();
				IConfigurationElement elem = confs[0];
				try {
					instance.names[i] = (String) extension.getLabel();
					instance.extensionfactory[i] = (ToolspecificExtensionFactory) elem.createExecutableExtension("class");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return instance;
	}
	
	public ToolspecificExtensionFactory[] getToolspecificExtensionFactories() {
		return extensionfactory;
	}

}
