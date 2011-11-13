package org.pnml.tools.epnk.helpers;

import java.util.List;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.structuredpntypemodel.Linker;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping;

/** 
 * This class implements some helper methods for calculating properties
 * on nets and its elements.
 * 
 * @author kindler
 * @generated NOT
 *
 */
public class NetFunctions {
	
	public static PetriNet getPetriNet(EObject object) {
		// TODO this should be done a bit more defensively (only for
		//      Petri net elements.
		EObject o = object;
		
		while (o != null && !(o instanceof PetriNet) && o.eContainer() !=  null) {
			o = o.eContainer();
		}
		
		if (o instanceof PetriNet) {
			return (PetriNet) o;
		} else {
			return null;
		}	
	}
	
	public static PetriNetType getPetriNetType(EObject object) {
		PetriNet pn = getPetriNet(object);
		
		if (pn != null) {
			return pn.getType();
		}
		
		return null;
	}
	
	public static List<Object> getAllNetObjects(PetriNet net) {
		List<Object> list = new Vector<Object>();
		
		for (Page p:net.getPage()) {
			list.add(p);
			list.addAll(getAllPageObjects(p));
		}
		return list;
	}
	
	public static List<Object> getAllPageObjects(Page page) {
		List<Object> list = new Vector<Object>();
		
		for (Object object:page.getObject()) {
			list.add(object);
			if (object instanceof Page) {
				Page p = (Page) object;
				list.addAll(getAllPageObjects(p));
			}
		}	
		return list;	
	}
	
	/**
	 * Returns all sub pages of this page (including the page itself).
	 * 
	 * @param net
	 * @return all sub pages
	 */
	public static List<Page> getAllSubPages(Page page) {
		List<Page> list = new Vector<Page>();
		list.add(page);
		
		for (Object object: page.getObject()) {
			if (object instanceof Page) {
				list.addAll(getAllSubPages((Page) object));
			}
		}
		return list;
	}
	
	public static void linkNetSymbols(PetriNet net) {
		if (net != null) {
			PetriNetType type = net.getType();
			if (type instanceof StructuredPetriNetType) {
				Linker linker = ((StructuredPetriNetType) type).getLinker();
				SymbolUseMapping mapping = linker.getglobalLinks(net);
				for (SymbolUse use: mapping.getSymbolUses()) {
					SymbolDef def = mapping.getSymbolDef(use);
					if (def == null && use.eGet(use.getRefFeature()) != null) {
						use.setName(use.getName());
					}
					use.eSet(use.getRefFeature(), mapping.getSymbolDef(use));
				}
			}
		}
	}
}
