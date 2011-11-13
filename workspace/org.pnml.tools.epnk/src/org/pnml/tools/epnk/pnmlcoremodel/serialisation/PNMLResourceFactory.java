package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

//@generated NOT
public class PNMLResourceFactory extends ResourceFactoryImpl {

	public PNMLResourceFactory() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		return new PNMLResource(uri);
	}
}
