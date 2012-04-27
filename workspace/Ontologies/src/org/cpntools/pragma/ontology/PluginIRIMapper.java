package org.cpntools.pragma.ontology;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyIRIMapper;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class PluginIRIMapper implements OWLOntologyIRIMapper {
	
	private static PluginIRIMapper INSTANCE = new PluginIRIMapper();
	private OWLOntologyManager manager;
	private OWLOntologyLoaderConfiguration config;
	private Map<IRI, IRI> iriMap;

	private PluginIRIMapper() {
		manager = OWLManager.createOWLOntologyManager();
		config = new OWLOntologyLoaderConfiguration();
		config.setSilentMissingImportsHandling(true);
		
		iriMap = new HashMap<IRI, IRI>();
		//File file = PluginOntologyEnumerator.getOntologyFile("cpn.fowl");
		try {
			Enumeration<URL> files = BundleOntologyEnumerator.getAvailableOntologies();
			while(files.hasMoreElements()){
				URL file = files.nextElement();
				OWLOntologyDocumentSource documentSource = new StreamDocumentSource(file.openStream());
				OWLOntology ontology = manager.loadOntologyFromOntologyDocument(documentSource , config);
				IRI iri = ontology.getOntologyID().getOntologyIRI();
				iriMap.put(iri, IRI.create(file));
			}
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static PluginIRIMapper getInstance() {

		return INSTANCE;
	}
	
	@Override
	public IRI getDocumentIRI(IRI ontologyIRI) {
		// TODO Auto-generated method stub
		return iriMap.get(ontologyIRI);
	}


}
