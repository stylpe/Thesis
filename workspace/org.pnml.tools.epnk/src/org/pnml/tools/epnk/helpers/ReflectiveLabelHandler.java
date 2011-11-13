package org.pnml.tools.epnk.helpers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pnml.tools.epnk.pnmlcoremodel.Label;

/** This class provided methods for accessing the information
 *  about non-structured Labels in a reflective way. To this
 *  end, the "text" feature of the Label must be an attribute
 *  with multiplicity <=1.
 *  
 * @author eki
 * @generated NOT
 */
public class ReflectiveLabelHandler {
	
	public static String getValueAsString(Label label) {
		EAttribute attribute = getTextAttribute(label);
		if (attribute != null) {
			EClassifier type = attribute.getEType();
			if (type != null && type instanceof EDataType) {
				EFactory factory = type.getEPackage().getEFactoryInstance();
				return factory.convertToString((EDataType) type, label.eGet(attribute));
			}
		}
		return null;	
	}
	
	public static EAttribute getTextAttribute(Label label) {
		EStructuralFeature feature = label.eClass().getEStructuralFeature("text");
		if (feature != null && !feature.isMany() && feature instanceof EAttribute) {
			EAttribute attribute = (EAttribute) feature;
			EClassifier type = attribute.getEType();
			if (type != null && type instanceof EDataType) {
			/* eki: it appears that the restriction to Ecore and PNML datatypes
			 *      is not necessary  
			        &&
					( type.getEPackage().g == EcorePackage.eINSTANCE ||
					  type.getEPackage() == PnmldatatypesPackage.eINSTANCE) ) */
				return attribute;
			}
		}
		return null;
	}
	
	public static Object getValueObject(Label label, String text) {
		EAttribute attribute = getTextAttribute(label);
		if (attribute != null) {
			EClassifier type = attribute.getEType();
			if (type != null && type instanceof EDataType) {
				EFactory factory = type.getEPackage().getEFactoryInstance();
				return factory.createFromString((EDataType) type, text);
			}
		}
		return null;
	}


}
