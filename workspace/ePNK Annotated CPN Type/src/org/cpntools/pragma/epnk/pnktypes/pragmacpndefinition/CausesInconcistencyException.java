package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import java.util.Set;

import org.semanticweb.owlapi.model.OWLAxiom;

public class CausesInconcistencyException extends Exception {
	/**
	 * generated
	 */
	private static final long serialVersionUID = -1529002208238661871L;
	
	private Set<Set<OWLAxiom>> set;
	
	public CausesInconcistencyException(Set<Set<OWLAxiom>> set) {
		this.set = set;
	}
	
	public CausesInconcistencyException() {
		set = null;
	}

	public Set<Set<OWLAxiom>> getSet() {
		return set;
	}
}
