package org.cpntools.pragma.ontology;

import java.net.URL;
import java.util.Enumeration;

public class BundleOntologyEnumerator {

	private static String BASE_ONTOLOGY_PATH = "/ontologies/";
	
	public static URL getOntologyBasePath() {
		return Activator.getBundle().getEntry(BASE_ONTOLOGY_PATH);
	}

	public static Enumeration<URL> getAvailableOntologies() {
		return Activator.getBundle().findEntries(BASE_ONTOLOGY_PATH, "*.*", true);
	}
}
