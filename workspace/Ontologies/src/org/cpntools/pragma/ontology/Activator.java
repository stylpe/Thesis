package org.cpntools.pragma.ontology;

import java.io.InputStream;
import java.net.URL;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	private static Activator instance;
	private Bundle bundle;

	@Override
	public void start(BundleContext context) throws Exception {
		instance = this;
	    bundle = context.getBundle();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		
	}
	
	public static Activator getInstance() {
		return instance;
	}
	
	public static Bundle getBundle() {
		return instance.bundle;
	}
	public static InputStream loadFile(String name) {
		return instance.getClass().getResourceAsStream("/ontologies/"+name);
	}
	
	public static URL getFileIRI(String name) {
		return instance.getClass().getResource(name);
	}

}
