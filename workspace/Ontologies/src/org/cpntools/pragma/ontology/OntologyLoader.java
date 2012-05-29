package org.cpntools.pragma.ontology;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

import com.clarkparsia.owlapi.explanation.PelletExplanation;

public class OntologyLoader {
	
	// Creates an Ontology Manager loaded with default generic pragmatics
	public static OWLOntologyManager loadDefault() {

		// Get hold of an ontology manager
		OWLOntologyManager manager = prepManager();

		try {
			OWLOntology cpnOntology = manager
					.loadOntologyFromOntologyDocument(IRI
							.create(BundleOntologyEnumerator
									.getOntologyBasePath()
									+ "generic/nppn.fowl"));
			//System.out.println(cpnOntology);
		} catch (OWLOntologyCreationException e) {
			System.out.println("Could not load ontology: " + e.getMessage());
		}
		
		return manager;
	}
	
	static private boolean explanationLoaded = false;
	private static OWLOntologyManager prepManager() {
		if(!explanationLoaded) {
			PelletExplanation.setup();
			explanationLoaded = true;
		}
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		manager.addIRIMapper(PluginIRIMapper.getInstance());
		return manager;
	}
}
