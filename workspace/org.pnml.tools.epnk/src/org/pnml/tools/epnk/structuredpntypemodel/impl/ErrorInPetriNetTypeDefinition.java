package org.pnml.tools.epnk.structuredpntypemodel.impl;

/**
 * This exception indicates that there is something wrong with a
 * plugged in Petri net type. Most likely, there are structured
 * labels without a structure feature that is an EReference and
 * and has multiplicity of at most 1.
 * 
 * @generated NOT
 * @author eki
 * 
 */
public class ErrorInPetriNetTypeDefinition extends RuntimeException {


	private static final long serialVersionUID = 4860006286404259965L;


	public ErrorInPetriNetTypeDefinition(String arg0) {
		super(arg0);
	}
	

}
