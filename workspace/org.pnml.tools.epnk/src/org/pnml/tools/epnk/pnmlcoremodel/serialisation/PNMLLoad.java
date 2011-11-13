package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.xml.sax.helpers.DefaultHandler;

// @generated NOT
public class PNMLLoad extends XMLLoadImpl{

	private ExtendedPNMLMetaData extendedPNMLMetaData;
	
	public PNMLLoad(XMLHelper helper, ExtendedPNMLMetaData extendedPNMLMetaData) {
		super(helper);
		this.extendedPNMLMetaData = extendedPNMLMetaData;
	}
	
	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new SAXPNMLHandler(resource, helper, options, extendedPNMLMetaData);
	}


}
