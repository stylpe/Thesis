package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * An interface for a factory that, while parsing an XML document, produces the right object based on
 * some context information.
 * 
 * @author kindler
 * @generator NOT
 */
public interface IPNMLFactory {

	
	/**
	 * Creates the EObject in the given context. If the factory cannot produce an object, null should be
	 * returned.
	 * 
	 * @param container the Object in which this element occurs; could be null
	 * @param element   the name of the XML element
	 * @param attribute a relevant attribute; could be null 
	 * @param provider  a attributeProvider that allows the method to access all attributes of the current
	 *                  element, could be null
	 * @return
	 */
	public EObject createObject(EStructuralFeature feature, Object container, String element, String attribute, IAttributeProvider provider);
	
	public boolean canCreateObject(EStructuralFeature feature, Object container, String element, String attribute, IAttributeProvider provider);
	
	public Object createAttributeObject(Object object, String attribute, IAttributeProvider provider);
	
}
