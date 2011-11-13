package org.pnml.tools.epnk;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EValidator;
import org.osgi.framework.BundleContext;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.validation.EValidatorAdapter;

/**
 * This is the activator class for the ePNK plugin. This is needed
 * to register the validation adapter upon startup of the plugin,
 * so that the constraints registered with EMF Validation are 
 * also checked when the user selects validate.
 * 
 * @generated NOT
 */
public class Activator extends Plugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		EValidator.Registry.INSTANCE.put(
				PnmlcoremodelPackage.eINSTANCE,
				new EValidatorAdapter());
	}
	

}
