/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */

package org.pnml.tools.epnk.pnmlcoremodel.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * This is a simple implementation of an XMI Resource in order to switch
 * on the use of UUIDs so that copy and paste would work with GMF
 * editors (@see http://serdom.eu/ser/2007/03/05/how-to-enable-uuid-in-emf-generated-model-to-get-copypaste-working
 * for more information).
 * 
 * @author kindler
 * @generated NOT
 */
public class PNXResource extends XMIResourceImpl {

	public PNXResource() {
		super();
	}

	public PNXResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
	 */
	protected boolean useUUIDs() {
		return true;
	}
	
}
