package org.cpntools.pragma.ontology;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

public class OntologyLoader {
	public static void load() {
		
            // Get hold of an ontology manager
            OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
            
            manager.addIRIMapper(PluginIRIMapper.getInstance());
            

			try {
				OWLOntology cpnOntology = manager.loadOntologyFromOntologyDocument(IRI.create(BundleOntologyEnumerator.getOntologyBasePath()+"generic/nppn.fowl"));
				
				System.out.println(cpnOntology);
				
	            // Remove the ontology so that we can load a local copy.
	            manager.removeOntology(cpnOntology);
			} catch (OWLOntologyCreationException e) {
				System.out.println("Could not load ontology: " + e.getMessage());
			}


	}
}
