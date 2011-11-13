package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pntypes.extension.PetriNetTypeExtensions;
import org.pnml.tools.epnk.toolspecific.extension.PNMLGenericToolspecificExtensionsFactory;

//@generated NOT
public class PNMLResource extends XMLResourceImpl {

	private final PNMLMetaData metaData;
	private final ExtendedPNMLMetaData extendedPNMLMetaData;

	public PNMLResource(URI uri) {
		super(uri);
		setTrackingModification(true);
		
		metaData = new PNMLMetaData();
		extendedPNMLMetaData = new ExtendedPNMLMetaData();
		
		this.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				metaData);
		this.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				metaData);
		
		// make sure that all attributes are serialized (since PNML expects that)
		this.getDefaultSaveOptions().put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT,
				Boolean.TRUE);
		
		// TODO these core mappings could probably be done in the ExtendedPNMLMetaData
		//      themselves (but this would tightly attach the infrastructure to PNML)
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPage_Object(),
				null,
				PnmlcoremodelPackage.eINSTANCE.getPlace(),
				"place",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPage_Object(),
				null,
				PnmlcoremodelPackage.eINSTANCE.getTransition(),
				"transition",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPage_Object(),
				null,
				PnmlcoremodelPackage.eINSTANCE.getArc(),
				"arc",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPage_Object(),
				PnmlcoremodelPackage.eINSTANCE.getPage(),
				PnmlcoremodelPackage.eINSTANCE.getPage(),
				"page",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPetriNet_Page(),
				PnmlcoremodelPackage.eINSTANCE.getPetriNet(),
				PnmlcoremodelPackage.eINSTANCE.getPage(),
				"page",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPage_Object(),
				null,
				PnmlcoremodelPackage.eINSTANCE.getRefPlace(),
				"referencePlace",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPage_Object(),
				null,
				PnmlcoremodelPackage.eINSTANCE.getRefTransition(),
				"referenceTransition",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getObject_Graphics(),
				null,
				PnmlcoremodelPackage.eINSTANCE.getGraphics(),
				"graphics",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getLabel_Graphics(),
				null,
				PnmlcoremodelPackage.eINSTANCE.getGraphics(),
				"graphics",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPetriNet_Toolspecific(),
				null,
				null, 
				"toolspecific",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getObject_Toolspecific(),
				null,
				null,
				"toolspecific",
				null,
				PNMLFactory.getPNMLFactory());
		

		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getLabel_Toolspecific(),
				null,
				null, //PnmlcoremodelPackage.eINSTANCE.getToolInfoText(),
				"toolspecific",
				null,
				PNMLFactory.getPNMLFactory());
		
		// Add the plugged in toolspecific extensions:
		// actually, this could be done without the metadata feature; but it was
		// convenient to do that this way for now:
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPetriNet_Toolspecific(),
				null,
				null, 
				"toolspecific",
				"tool",
				PNMLGenericToolspecificExtensionsFactory.getInstance());

		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getObject_Toolspecific(),
				null,
				null,
				"toolspecific",
				"tool",
				PNMLGenericToolspecificExtensionsFactory.getInstance());


		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getLabel_Toolspecific(),
				null,
				null, //PnmlcoremodelPackage.eINSTANCE.getToolInfoText(),
				"toolspecific",
				"tool",
				PNMLGenericToolspecificExtensionsFactory.getInstance());

		// At last, toolspecific elements will be added as unknown features
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getPetriNet_Unknown(),
				null,
				null, 
				"toolspecific",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getObject_Unknown(),
				null,
				null,
				"toolspecific",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.add(
				PnmlcoremodelPackage.eINSTANCE.getLabel_Unknown(),
				null,
				null,
				"toolspecific",
				null,
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.addAttributeMapping(
				PnmlcoremodelPackage.eINSTANCE.getPetriNet_Type(),
				PnmlcoremodelPackage.eINSTANCE.getPetriNet(),
				"type",
				PNMLFactory.getPNMLFactory());
		
		extendedPNMLMetaData.addAttributeMapping(
				PnmlcoremodelPackage.eINSTANCE.getID_Id(),
				PnmlcoremodelPackage.eINSTANCE.getPetriNet(),
				"id",
				PNMLFactory.getPNMLFactory());
		
		/* This feature is not fully implemented yet (PNMLSave does not consider
		 * it yet). It should not be used for now -- or only with great care.
		extendedPNMLMetaData.addContentFeatureMapping(
				PnmlcoremodelPackage.eINSTANCE.getToolInfo(),
				PnmlcoremodelPackage.eINSTANCE.getToolInfo_Xml());
        */

		// Add the type specific PNMLMetaData and ExtendedPNMLMetaData from the
		// plugged in Petri Net Types (via interface ExtendedPNMLMetaDataProvider)
		PetriNetType[] pntypes = PetriNetTypeExtensions.getInstance().getPetriNetTypes();
		for (PetriNetType type: pntypes) {
			type.registerPNMLMetaData(metaData);
			// eki: this is now handled dynamically in the SAXPNMLHandler and PNMLSave
			// type.registerExtendedPNMLMetaData(extendedPNMLMetaData);
		}
	}
	
	@Override
	protected XMLLoad createXMLLoad() {
		return new PNMLLoad(createXMLHelper(), extendedPNMLMetaData);
	}

	@Override
	protected XMLSave createXMLSave() {
		return new PNMLSave(createXMLHelper(), extendedPNMLMetaData);
	}
	
}
