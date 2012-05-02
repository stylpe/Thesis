/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import java.util.Collection;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.cpntools.pragma.ontology.OntologyLoader;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.OWLOntologyMerger;
import org.semanticweb.HermiT.Reasoner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragmatics Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaticsOntologyImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaticsOntologyImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaticsOntologyImpl#getManager <em>Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PragmaticsOntologyImpl extends LabelImpl implements PragmaticsOntology {
	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyDocument> documents;

	/**
	 * The default value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated NOT
	 * @ordered
	 */
	protected static final OWLOntologyManager MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected OWLOntologyManager manager = MANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PragmaticsOntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PragmacpndefinitionPackage.Literals.PRAGMATICS_ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologyDocument> getDocuments() {
		if (documents == null) {
			documents = new EObjectContainmentWithInverseEList<OntologyDocument>(OntologyDocument.class, this, PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS, PragmacpndefinitionPackage.ONTOLOGY_DOCUMENT__ONTOLOGY);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getNet() {
		if (eContainerFeatureID() != PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET) return null;
		return (PetriNet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(PetriNet newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNet, PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(PetriNet newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET && newNet != null)) {
			if (EcoreUtil.isAncestor(this, newNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY, PetriNet.class, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OWLOntologyManager getManager() {
		if(manager == null) manager = OntologyLoader.loadDefault();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addOntologyFromFile(IFile file) {
		try {
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);

			if (domain != null) {
				OWLOntology ont = loadOntology(file);
				System.out.println(ont);
				OntologyDocument loadedDoc = PragmacpndefinitionFactory.eINSTANCE.createOntologyDocument();
				loadedDoc.setIri(ont.getOntologyID().getOntologyIRI().toString());
				loadedDoc.setPath(file.getFullPath().toPortableString());
				System.out.println(getManager().getOntologies().size());
				domain.getCommandStack().execute(
					AddCommand.create( domain, this, 
						PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS, loadedDoc
				));
			}
		} catch (OWLOntologyCreationException e) {
			// TODO Show error to user
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}


	public OWLOntology loadOntology(IFile file) throws OWLOntologyCreationException, CoreException {
		System.out.println("LOADING " + file);
		return getManager().loadOntologyFromOntologyDocument(file.getContents());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void getValidPragmatics(OntologyMember member) {
		OWLOntology ontology = getMergedOntology();
		if(ontology == null) return;
		OWLDataFactory dataFactory = getManager().getOWLDataFactory();
		
		OWLReasonerFactory reasonerFactory = new Reasoner.ReasonerFactory();
		OWLReasoner reasoner = reasonerFactory.createReasoner(ontology);
		
        // Ask the reasoner to do all the necessary work now
        reasoner.precomputeInferences();
        // We can determine if the ontology is actually consistent (in this case, it should be).
        boolean consistent = reasoner.isConsistent();
        System.out.println("Consistent: " + consistent);
        
        OWLClass pragma = dataFactory.getOWLClass(IRI.create("http://k1s.org/OntologyReastrictedNets/basic/Pragmatic"));
        //pragma = reasoner.getTopClassNode().getRepresentativeElement();
        //System.out.println(pragma);
		NodeSet<OWLClass> subClasses = reasoner.getSubClasses(pragma, false);
		for(OWLClass cl : subClasses.getFlattened()) {
			System.out.println(cl);
		}
		
	}
	
	private OWLOntology getMergedOntology() {
		ensureAllOntologiesLoaded();
		OWLOntology ontology = null;
		OWLOntologyMerger merger = new OWLOntologyMerger(getManager());
		try {
			ontology = merger.createMergedOntology(getManager(),IRI.generateDocumentIRI());
		} catch (OWLOntologyCreationException e) {
			// TODO Inform user
			e.printStackTrace();
		}
		return ontology;
	}

	private void ensureAllOntologiesLoaded() {
		for(OntologyDocument doc :getDocuments()) {
			OWLOntology ont = getManager().getOntology(IRI.create(doc.getIri()));
			if(ont == null) {
				IResource member = ResourcesPlugin.getWorkspace().getRoot().findMember(doc.getPath());
				if(member.getType() == IResource.FILE) {
					IFile file = (IFile) member;
					try {
						loadOntology(file);
					} catch (OWLOntologyCreationException e) {
						// TODO Show error to user
						e.printStackTrace();
					} catch (CoreException e) {
						
						e.printStackTrace();
					}
				}
			}
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNet((PetriNet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET:
				return basicSetNet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET:
				return eInternalContainer().eInverseRemove(this, PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY, PetriNet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS:
				return getDocuments();
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET:
				return getNet();
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__MANAGER:
				return getManager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends OntologyDocument>)newValue);
				return;
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET:
				setNet((PetriNet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS:
				getDocuments().clear();
				return;
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET:
				setNet((PetriNet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET:
				return getNet() != null;
			case PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__MANAGER:
				return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (manager: ");
		result.append(manager);
		result.append(')');
		return result.toString();
	}

} //PragmaticsOntologyImpl
