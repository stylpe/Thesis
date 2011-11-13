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

package org.pnml.tools.epnk.toolspecific.diagraminfo.factory;

import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoFactory;
import org.pnml.tools.epnk.toolspecific.extension.ToolspecificExtensionFactory;

// @generated NOT
// @author eki
public class DiagraminfoExtensionFactory implements ToolspecificExtensionFactory {
	
	private final static String toolname =     "org.pnml.tools.epnk.diagraminfo";
	private final static String toolversion =  "0.9.2";

	public ToolInfo createToolInfo(String tool, String version) {
		// ToolInfo object does not depend on these values:
		return createToolInfo();
	}
	
	public ToolInfo createToolInfo() {
		DiagramInfo diagraminfo = DiagraminfoFactory.eINSTANCE.createDiagramInfo();
		diagraminfo.setTool(toolname);
		diagraminfo.setVersion(toolversion);
		return diagraminfo;
	}
	
	public String getToolName() {
		return toolname;
	}
	
	public String getToolVersion() {
		return toolversion;
	}

}
