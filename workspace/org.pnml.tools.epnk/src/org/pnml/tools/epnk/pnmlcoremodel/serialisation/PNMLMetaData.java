package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

//@generated NOT
public class PNMLMetaData extends BasicExtendedMetaData {
	
	public PNMLMetaData() {
		super();
		
		setQualified(PnmlcoremodelPackage.eINSTANCE, false);
		setName(PnmlcoremodelPackage.eINSTANCE.getPetriNetDoc(), "pnml");
		
		// Makes the text feature of the name label an XML element.
		// Note that this also needs to be done manually for every Petri net type for now via
		// implementing the ExtendedMetaDataProvider interface (see PTNet example)
		// eki: this is done reflectively now (set when registering the Empty type)
		// setFeatureKind(PnmlcoremodelPackage.eINSTANCE.getName_Text(), ExtendedMetaData.ELEMENT_FEATURE );
		
		// Makes the info attribute of the ToolInfoText class an XML element (in order to fully
		// comply with the ISO/IEC 15909-2
		setFeatureKind(PnmlcoremodelPackage.eINSTANCE.getToolInfoText_Info(), ExtendedMetaData.ELEMENT_FEATURE );
		
		// Makes the text feature of a StructuredLabel an XML element.
		setFeatureKind(StructuredpntypemodelPackage.eINSTANCE.getStructuredLabel_Text(), ExtendedMetaData.ELEMENT_FEATURE );		

		
	    // From here only some experiments:
		// setProcessingKind(PnmlcoremodelPackage.eINSTANCE.getToolInfo_Xml(), ExtendedMetaData.SKIP_PROCESSING );
		
		// setProcessingKind(PnmlcoremodelPackage.eINSTANCE.getToolInfo_Info(), ExtendedMetaData.LAX_PROCESSING);
		// setContentKind(PnmlcoremodelPackage.eINSTANCE.getToolInfo(), ExtendedMetaData.UNSPECIFIED_CONTENT);
		
		// setDocumentRoot(PnmlcoremodelPackage.eINSTANCE.getPetriNetDoc());
		
		// The following did not work: had to do some hacking to get rid of this element in the PNMLSave method:
		// setProcessingKind(PnmlcoremodelPackage.eINSTANCE.getPetriNet_Type(), ExtendedMetaData.SKIP_PROCESSING);
		
		// setGroup(PnmlcoremodelPackage.eINSTANCE.getPage_Object(), getObjectsGroup());
		// getAffiliation(PnmlcoremodelPackage.eINSTANCE.getPlace(),
		//		PnmlcoremodelPackage.eINSTANCE.getPage_Object());
		
		// setFeatureKind(PnmlcoremodelPackage.eINSTANCE.getPage_Object(),ExtendedMetaData.ELEMENT_WILDCARD_FEATURE);

		// setProcessingKind(PnmlcoremodelPackage.eINSTANCE.getPage_Object(), ExtendedMetaData.SKIP_PROCESSING);
		// setFeatureKind(PnmlcoremodelPackage.eINSTANCE.getPage_Object(), ExtendedMetaData.);
		// setGroup(getPlaceFeature(),PnmlcoremodelPackage.eINSTANCE.getPage_Object());
		
		// setName(PnmlcoremodelPackage.eINSTANCE.getPlace(), "place");
		// setName(PnmlcoremodelPackage.eINSTANCE.getTransition(), "transition");
		
	}
	
	
	
}
