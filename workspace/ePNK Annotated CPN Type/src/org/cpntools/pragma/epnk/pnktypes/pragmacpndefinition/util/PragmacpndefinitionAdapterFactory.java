/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.util;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.*;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pnmlcoremodel.ID;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage
 * @generated
 */
public class PragmacpndefinitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PragmacpndefinitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmacpndefinitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PragmacpndefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PragmacpndefinitionSwitch<Adapter> modelSwitch =
		new PragmacpndefinitionSwitch<Adapter>() {
			@Override
			public Adapter casePragmaCPN(PragmaCPN object) {
				return createPragmaCPNAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter casePragma(Pragma object) {
				return createPragmaAdapter();
			}
			@Override
			public Adapter caseOntologyDocument(OntologyDocument object) {
				return createOntologyDocumentAdapter();
			}
			@Override
			public Adapter casePragmaticsOntology(PragmaticsOntology object) {
				return createPragmaticsOntologyAdapter();
			}
			@Override
			public Adapter casePetriNet(PetriNet object) {
				return createPetriNetAdapter();
			}
			@Override
			public Adapter caseOntologyMember(OntologyMember object) {
				return createOntologyMemberAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter casePetriNetType(PetriNetType object) {
				return createPetriNetTypeAdapter();
			}
			@Override
			public Adapter caseCPN(CPN object) {
				return createCPNAdapter();
			}
			@Override
			public Adapter caseID(ID object) {
				return createIDAdapter();
			}
			@Override
			public Adapter caseObject(org.pnml.tools.epnk.pnmlcoremodel.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter casePlaceNode(PlaceNode object) {
				return createPlaceNodeAdapter();
			}
			@Override
			public Adapter casePnmlcoremodel_Place(org.pnml.tools.epnk.pnmlcoremodel.Place object) {
				return createPnmlcoremodel_PlaceAdapter();
			}
			@Override
			public Adapter caseCpndefinition_Place(org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place object) {
				return createCpndefinition_PlaceAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter casePnmlcoremodel_PetriNet(org.pnml.tools.epnk.pnmlcoremodel.PetriNet object) {
				return createPnmlcoremodel_PetriNetAdapter();
			}
			@Override
			public Adapter caseTransitionNode(TransitionNode object) {
				return createTransitionNodeAdapter();
			}
			@Override
			public Adapter casePnmlcoremodel_Transition(org.pnml.tools.epnk.pnmlcoremodel.Transition object) {
				return createPnmlcoremodel_TransitionAdapter();
			}
			@Override
			public Adapter caseCpndefinition_Transition(org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition object) {
				return createCpndefinition_TransitionAdapter();
			}
			@Override
			public Adapter casePnmlcoremodel_Arc(org.pnml.tools.epnk.pnmlcoremodel.Arc object) {
				return createPnmlcoremodel_ArcAdapter();
			}
			@Override
			public Adapter caseCpndefinition_Arc(org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc object) {
				return createCpndefinition_ArcAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN <em>Pragma CPN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN
	 * @generated
	 */
	public Adapter createPragmaCPNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma <em>Pragma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma
	 * @generated
	 */
	public Adapter createPragmaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument <em>Ontology Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument
	 * @generated
	 */
	public Adapter createOntologyDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology <em>Pragmatics Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology
	 * @generated
	 */
	public Adapter createPragmaticsOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet
	 * @generated
	 */
	public Adapter createPetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember <em>Ontology Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember
	 * @generated
	 */
	public Adapter createOntologyMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNetType <em>Petri Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNetType
	 * @generated
	 */
	public Adapter createPetriNetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN <em>CPN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN
	 * @generated
	 */
	public Adapter createCPNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.PlaceNode <em>Place Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PlaceNode
	 * @generated
	 */
	public Adapter createPlaceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Place
	 * @generated
	 */
	public Adapter createPnmlcoremodel_PlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place
	 * @generated
	 */
	public Adapter createCpndefinition_PlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNet
	 * @generated
	 */
	public Adapter createPnmlcoremodel_PetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.TransitionNode <em>Transition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.TransitionNode
	 * @generated
	 */
	public Adapter createTransitionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Transition
	 * @generated
	 */
	public Adapter createPnmlcoremodel_TransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Transition
	 * @generated
	 */
	public Adapter createCpndefinition_TransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Arc
	 * @generated
	 */
	public Adapter createPnmlcoremodel_ArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.Arc
	 * @generated
	 */
	public Adapter createCpndefinition_ArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PragmacpndefinitionAdapterFactory
