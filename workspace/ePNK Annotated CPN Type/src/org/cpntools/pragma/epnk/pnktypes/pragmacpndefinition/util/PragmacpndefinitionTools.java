package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.util;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.eclipse.emf.ecore.EObject;
import org.semanticweb.owlapi.model.OWLClass;

public class PragmacpndefinitionTools {
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T getAncestorOfType(EObject source, Class<T> klass) {
		while((source != null) && !(source.getClass() == klass))
			source = source.eContainer();
		return (T) source;
	}
	
	public static PetriNet getPetriNetAncestor(EObject source) {
		return getAncestorOfType(source, PetriNet.class);
	}
	
//	static OWLClass getOWLClass(OntologyMember member, String classname){
//		
//	}
}
