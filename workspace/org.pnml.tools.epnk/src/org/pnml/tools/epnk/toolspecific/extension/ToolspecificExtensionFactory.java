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

package org.pnml.tools.epnk.toolspecific.extension;

// @generated NOT
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;

// FIXME I fogot to start the name of this interface with
//       an I; this should be refactored (which probably wont
//       be possible fully automatically (it is refered to
//       in the XSD for the schema defining the extension 
//       point.
public interface ToolspecificExtensionFactory {

	// TODO as defined now, the extension could be added to any
	// Object or the PetriNet. Maybe, this could be refined so
	// that the extension can define for which kind of elements
	// it is applicable.
	
	public ToolInfo createToolInfo(String tool, String version);
	
	public ToolInfo createToolInfo();
	
	public String getToolName(); 
	
	public String getToolVersion(); 

}
