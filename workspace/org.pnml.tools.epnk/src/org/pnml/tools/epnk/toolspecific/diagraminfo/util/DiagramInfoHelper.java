package org.pnml.tools.epnk.toolspecific.diagraminfo.util;

import org.eclipse.emf.common.util.EList;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo;

/**
 * This class implements some helper functions for the tool specific
 * extension with the GMF graphical information.
 * 
 * @generated NOT (new class, written completely manually)
 * @author eki
 *
 */
public class DiagramInfoHelper {
	
	/*
	 * Returns the GMF Diagram Information (tool specific extension)
	 * of a page, if it exists. It returns null, if this information
	 * does not exists.
	 * 
	 * @param page
	 * @
	 */
	
	/**
	 * Returns the GMF Diagram Information (tool specific extension)
	 * of a page, if it exists. It returns null, if this information
	 * does not exists.
	 * 
	 * @param page The page for which the diagram information should be returned
	 * @return the diagram information, if it exists
	 */
	static public DiagramInfo getDiagramInfo(Page page) {
		if (page != null) {
			EList<ToolInfo> toolspecific = page.getToolspecific();
			for (ToolInfo info: toolspecific) {
				if (info instanceof DiagramInfo) {
					return (DiagramInfo) info;
				}
			}
		}
		return null;
	}

}
