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
 */
package org.pnml.tools.epnk.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

public class FlatAccess {
		
	private List<Place> places;
	private List<Transition> transitions;
	
	private Map<RefPlace,Place> ref2place;
	private Map<RefTransition,Transition> ref2transition;
	
	private Map<Place,List<RefPlace>> place2ref;
	private Map<Transition,List<RefTransition>> transition2ref;
	
	public FlatAccess(PetriNet net) {
		super();
		
		places = new ArrayList<Place>();
		transitions = new ArrayList<Transition>();
		ref2place = new HashMap<RefPlace,Place>();
		ref2transition = new HashMap<RefTransition,Transition>();
		place2ref = new HashMap<Place,List<RefPlace>>();
		transition2ref = new HashMap<Transition,List<RefTransition>>();
		
		List<Object> objects = NetFunctions.getAllNetObjects(net);
		for (Object object: objects) {
			if (object instanceof Place) {
				places.add((Place) object); 
			} else if (object instanceof Transition) {
				transitions.add((Transition) object); 
			} else if (object instanceof RefPlace) {
				RefPlace refPlace = (RefPlace) object;
				if (!ref2place.containsKey(refPlace)) {
					resolveRefPlace((RefPlace) object);
				};
			} else if (object instanceof RefTransition) {
				RefTransition refTransition = (RefTransition) object;
				if (!ref2transition.containsKey(refTransition)) {
					resolveRefTransition((RefTransition) object);
				};				
			}
		}
	}
	
	public List<Place> getPlaces() {
		return places;
	}
	
	public List<Transition> getTransitions() {
		return transitions;
	}
	
	public Place resolve(PlaceNode node) {
		if (node instanceof Place) {
			return (Place) node;
		}
		return ref2place.get(node);
	}
	
	public Transition resolve(TransitionNode node) {
		if (node instanceof Transition) {
			return (Transition) node;
		}
		return ref2transition.get(node);
	}
	
	public List<Arc> getOut(Node node) {
		ArrayList<Arc> result = new ArrayList<Arc>();
		
		if (node instanceof PlaceNode) {
			PlaceNode placeNode = (PlaceNode) node;
			Place place = resolve(placeNode);
			if (place != null ) {
				result.addAll(place.getOut());
				List<RefPlace> list = place2ref.get(place);
				if (list != null) {
					for (RefPlace rp: list) {
						result.addAll(rp.getOut());
					}
				}
			}
		}
		
		if (node instanceof TransitionNode) {
			TransitionNode transitionNode = (TransitionNode) node;
			Transition transition = resolve(transitionNode);
			if (transition != null ) {
				result.addAll(transition.getOut());
				List<RefTransition> list = transition2ref.get(transition);
				if (list != null) {
					for (RefTransition rt: list) {
						result.addAll(rt.getOut());
					}
				}
			}
		}
		
		return result;
	}
	
	public List<Arc> getIn(Node node) {
		ArrayList<Arc> result = new ArrayList<Arc>();
		
		if (node instanceof PlaceNode) {
			PlaceNode placeNode = (PlaceNode) node;
			Place place = resolve(placeNode);
			if (place != null ) {
				result.addAll(place.getIn());
				List<RefPlace> list = place2ref.get(place);
				if (list != null) {
					for (RefPlace rp: list) {
						result.addAll(rp.getIn());
					}
				}
			}
		}
		
		if (node instanceof TransitionNode) {
			TransitionNode transitionNode = (TransitionNode) node;
			Transition transition = resolve(transitionNode);
			if (transition != null ) {
				result.addAll(transition.getIn());
				List<RefTransition> list = transition2ref.get(transition);
				if (list != null) {
					for (RefTransition rt: list) {
						result.addAll(rt.getIn());
					}
				}
			}
		}
		
		return result;
	}
	
	private void resolveRefPlace(RefPlace refPlace) {
		HashSet<RefPlace> met = new HashSet<RefPlace>();
		Place place = null;
		
		while (refPlace != null && 
				!met.contains(refPlace) &&
				!ref2place.containsKey(refPlace)) {
			met.add(refPlace);
			PlaceNode placeNode = refPlace.getRef();
			if (placeNode instanceof Place) {
				place = (Place) placeNode;
				refPlace = null;
			} else {
				refPlace = (RefPlace) placeNode;
			}
		}
		
		if (ref2place.containsKey(refPlace)) {
			place = ref2place.get(refPlace);
		}
		if (place != null) {
			for (RefPlace ref: met) {
				ref2place.put(ref, place);
				List<RefPlace> list = place2ref.get(place);
				if (list == null) {
					list = new ArrayList<RefPlace>();
					place2ref.put(place, list);
				}
				list.add(ref);
			}
		}
	}
	
	private void resolveRefTransition(RefTransition refTransition) {
		HashSet<RefTransition> met = new HashSet<RefTransition>();
		Transition transition = null;
		
		while (refTransition != null && 
				!met.contains(refTransition) &&
				!ref2transition.containsKey(refTransition)) {
			met.add(refTransition);
			TransitionNode transitionNode = refTransition.getRef();
			if (transitionNode instanceof Transition) {
				transition = (Transition) transitionNode;
				refTransition = null;
			} else {
				refTransition = (RefTransition) transitionNode;
			}
		}
		
		if (ref2transition.containsKey(refTransition)) {
			transition = ref2transition.get(refTransition);
		}
		if (transition != null) {
			for (RefTransition ref: met) {
				ref2transition.put(ref, transition);
				List<RefTransition> list = transition2ref.get(transition);
				if (list == null) {
					list = new ArrayList<RefTransition>();
					transition2ref.put(transition, list);
				}
				list.add(ref);
			}
		}
	}	
	
	

}
