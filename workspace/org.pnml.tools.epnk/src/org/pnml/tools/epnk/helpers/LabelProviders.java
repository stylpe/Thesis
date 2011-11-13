package org.pnml.tools.epnk.helpers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * This class contains static methods for creating possible new Labels,
 * for a Petri net object. This is done reflectively. Right now, this
 * will be used (manual changes) by the creation commands in the GMF
 * generated editor.
 * 
 * @author eki
 * @generated NOT
 */
public class LabelProviders {

	public static Map<Label,EReference> createInstancesForLabelProxy(Object object) {
		
		Map<Label,EReference> result = new HashMap<Label,EReference>();
		EClass eClass = object.eClass();
		EList<EReference> features = eClass.getEAllContainments();
		
		if (!(object instanceof Page)) {
			for (EReference reference: features) {
				if (PnmlcoremodelPackage.eINSTANCE.getLabel().isSuperTypeOf(reference.getEReferenceType()) &&
				    !PnmlcoremodelPackage.eINSTANCE.getAttribute().isSuperTypeOf(reference.getEReferenceType())) {
					// the current reference is one referring to a Label and not an Attribute
					EClass labelClass = reference.getEReferenceType();

					if (reference.isMany() || object.eGet(reference) == null ) {
						// if multiple instances of this feature are allowed or no label
						// of that kind exists yet
						try {
							// create an instance of this label
							Label label = (Label) labelClass.getEPackage().getEFactoryInstance().create(labelClass);
							result.put(label, reference);
						} catch (Exception e) {
							// ignore if the label cannot be instantiated
						} 
					} 
				}
			}
		} else {
			// for pages, only the name is a LabelProxy; the other will be shown inside the page as PageLabelProxies
			if (object.getName() == null) {
				result.put(PnmlcoremodelFactory.eINSTANCE.createName(), PnmlcoremodelPackage.eINSTANCE.getObject_Name());
			}
		}
		return result;	
	}
	
	public static Map<Label,EReference> createInstancesForPageLabelProxy(Page page) {
		
		Map<Label,EReference> result = new HashMap<Label,EReference>();
		EClass eClass = page.eClass();
		EList<EReference> features = eClass.getEAllContainments();

		for (EReference reference: features) {
			if (reference != PnmlcoremodelPackage.eINSTANCE.getObject_Name()) {
				// Only consider the feature as a PageLabelProxy if it is not the Name feature.
				if (PnmlcoremodelPackage.eINSTANCE.getLabel().isSuperTypeOf(reference.getEReferenceType()) &&
					!PnmlcoremodelPackage.eINSTANCE.getAttribute().isSuperTypeOf(reference.getEReferenceType())) {
					// the current reference is one referring to a Label and not to an Attribute
					EClass labelClass = reference.getEReferenceType();

					if (reference.isMany() || page.eGet(reference) == null ) {
						// if multiple instances of this feature are allowed or no label
						// of that kind exists yet
						try {
							// create an instance of this label
							Label label = (Label) labelClass.getEPackage().getEFactoryInstance().create(labelClass);
							result.put(label, reference);
						} catch (Exception e) {
							// ignore if the label cannot be instantiated
						} 
					} 
				}
			}
		}
	
		return result;	
	}
}
