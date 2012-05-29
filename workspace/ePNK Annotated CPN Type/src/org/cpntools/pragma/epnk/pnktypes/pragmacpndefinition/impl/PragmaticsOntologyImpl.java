/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.ArcExpression;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.InitialMarking;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Arc;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.CausesInconcistencyException;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Transition;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl;
import org.semanticweb.owlapi.io.OWLFunctionalSyntaxOntologyFormat;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AddImport;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.model.RemoveAxiom;
import org.semanticweb.owlapi.reasoner.ConsoleProgressMonitor;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.OWLOntologyMerger;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;



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
				//System.out.println(ont);
				if(ont.getOntologyID().getOntologyIRI() == null){
					MessageDialog.openError(getShell(), "Load Error", 
							"The file does not seem to contain a valid ontology.");
					unloadOntology(ont);
					return;
				}
				OntologyDocument loadedDoc = PragmacpndefinitionFactory.eINSTANCE.createOntologyDocument();
				loadedDoc.setIri(ont.getOntologyID().getOntologyIRI().toString());
				loadedDoc.setPath(file.getFullPath().toPortableString());
				//System.out.println(getManager().getOntologies().size());
				domain.getCommandStack().execute(
					AddCommand.create( domain, this, 
						PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__DOCUMENTS, loadedDoc
				));
			}
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
			String s = "";
			String msg = e.getMessage();
			if(msg != null && msg.length()>0)
				s = "Reason: " + msg;
			MessageDialog.openError(getShell(), "Load Error", 
					"The file could not be loaded. "+s);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	

	private Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}


	public OWLOntology loadOntology(IFile file) throws OWLOntologyCreationException, CoreException {
		//System.out.println("LOADING " + file);
		return getManager().loadOntologyFromOntologyDocument(file.getContents());
	}
	private void unloadOntology(OWLOntology ont) {
		getManager().removeOntology(ont);
	}
	
	static final private String cpnurl = "http://hib.no/ontologypetrinets/cpn/";
	static final private String basicurl = "http://k1s.org/OntologyRestrictedNets/basic/";
	static final private String nppnurl = "http://org.k1s/orn/nppn/";
	static private String localurl = "http://local.model/";
	static private PrefixManager cpnPrefix = new DefaultPrefixManager(cpnurl);
	static private PrefixManager basicPrefix = new DefaultPrefixManager(basicurl);
	static private PrefixManager nppnPrefix = new DefaultPrefixManager(nppnurl);
	static private PrefixManager localPrefix = new DefaultPrefixManager(localurl);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @throws CausesInconcistencyException 
	 * @generated NOT
	 */
	public Set<OWLClass> getValidPragmatics(OntologyMember member) throws CausesInconcistencyException {
		// Create an empty ontology
		OWLOntology ontology;
		try {
			ontology = createModelOntology();
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
			return Collections.emptySet();
		}
		
		// Get factories
		OWLDataFactory dataFactory = getManager().getOWLDataFactory();
		PelletReasonerFactory reasonerFactory = PelletReasonerFactory.getInstance();
		boolean notDirect = false;
		
		// Create mock pragmatic and get target member
        OWLNamedIndividual pragmaInd = dataFactory.getOWLNamedIndividual(":_pragma",localPrefix);
        OWLNamedIndividual memberInd = dataFactory.getOWLNamedIndividual(":"+member.getId(), localPrefix);
        // Create axiom for "member hasPragmatic _pragma"
		OWLObjectProperty hasPragmatic = dataFactory.getOWLObjectProperty(":hasPragmatic", basicPrefix);
		OWLObjectPropertyAssertionAxiom hasPragmaticAxiom = 
				dataFactory.getOWLObjectPropertyAssertionAxiom(hasPragmatic, memberInd, pragmaInd);
		getManager().applyChange(new AddAxiom(ontology, hasPragmaticAxiom));
		
		// Axioms for closed world assumption: 
		//   Limiting individuals to those declared
		Set<OWLNamedIndividual> allInds = ontology.getIndividualsInSignature(); System.out.println(allInds.size());
		OWLObjectOneOf oneOfAllInds = dataFactory.getOWLObjectOneOf(allInds);
		OWLEquivalentClassesAxiom cwaAxiom = dataFactory.getOWLEquivalentClassesAxiom(dataFactory.getOWLThing(), oneOfAllInds);
		getManager().applyChange(new AddAxiom(ontology, cwaAxiom));
		//   Ensuring they are different individuals
		OWLDifferentIndividualsAxiom diffInds = dataFactory.getOWLDifferentIndividualsAxiom(allInds);
		getManager().applyChange(new AddAxiom(ontology, diffInds));
		//   Asserting object property cardinality, effectively
		//   limiting property values to those explicitly declared 
		Set<OWLClassAssertionAxiom> cardAxioms = new HashSet<OWLClassAssertionAxiom>();
		for(OWLNamedIndividual ind : allInds){
			Set<OWLIndividual> pragmas = ind.getObjectPropertyValues(hasPragmatic, ontology);
			OWLObjectExactCardinality cardExp = dataFactory.getOWLObjectExactCardinality(pragmas.size(), hasPragmatic);
			OWLClassAssertionAxiom cardAxiom = dataFactory.getOWLClassAssertionAxiom(cardExp, ind);
			cardAxioms.add(cardAxiom);
			getManager().applyChange(new AddAxiom(ontology, cardAxiom));
		}
		
		// Create a reasoner and an explainer
		OWLReasonerConfiguration config = new SimpleConfiguration(new ConsoleProgressMonitor());
		PelletReasoner reasoner = reasonerFactory.createNonBufferingReasoner(ontology, config);
//		PelletExplanation explanationGen = new PelletExplanation(reasoner);
		
			saveTempFile();
		// Check for inconsistency
		if(!reasoner.isConsistent()) {
			// Throw exception with explanation
//			Set<Set<OWLAxiom>> explanation = explanationGen.getInconsistencyExplanations();
			reasoner.dispose();
//			throw new CausesInconcistencyException(explanation);
			throw new CausesInconcistencyException();
		}
		
		// Get all Pragmatic subclasses
		Set<OWLClass> classes = new HashSet<OWLClass>();
        OWLClass pragmaClass = dataFactory.getOWLClass(":Pragmatic", basicPrefix);
		NodeSet<OWLClass> pragmaSubClasses = reasoner.getSubClasses(pragmaClass, notDirect);
		
		// Iterate the subclasses
		for(OWLClass pragmaclass : pragmaSubClasses.getFlattened()) {
			// Declare the mock pragma individual as subclass of current iteration item
			OWLClassAssertionAxiom newClass = dataFactory.getOWLClassAssertionAxiom(pragmaclass, pragmaInd);
			getManager().applyChange(new AddAxiom(ontology, newClass));
			// Check if ontology is still consistent, and include class if it is
			if(reasoner.isConsistent()) {
				classes.add(pragmaclass);
			}
			// Remove the subclass declaration axiom
			getManager().applyChange(new RemoveAxiom(ontology, newClass));
		}
		
		reasoner.dispose();
		return classes;
	}
	
	
//	private OWLAxiom closeConcept(OWLDataFactory factory, IRI iri) {
//		OWLAnnotationProperty property = factory.getOWLAnnotationProperty(IRI.create("http://TrOWL.eu/REL#NBox"));
//		OWLAnnotation annotation = factory.getOWLAnnotation(property, factory.getOWLLiteral("close", "en"));
//		return factory.getOWLAnnotationAssertionAxiom(iri, annotation);
//	}

	private void saveTempFile() {
		OWLOntologyMerger merger = new OWLOntologyMerger(manager);
		IRI mergedOntologyIRI = IRI.create("http://local.model/mergedont" + java.lang.System.currentTimeMillis());
		OWLOntology merged = null;
		try {
			merged = merger.createMergedOntology(manager, mergedOntologyIRI);
		} catch (OWLOntologyCreationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		OWLOntologyFormat format = manager.getOntologyFormat(merged);
		OWLFunctionalSyntaxOntologyFormat owlFuncFormat = new OWLFunctionalSyntaxOntologyFormat();
		if(format.isPrefixOWLOntologyFormat()) {
		    owlFuncFormat.copyPrefixesFrom(format.asPrefixOWLOntologyFormat());
		}
		File file = new File("d:/pellet/local.owl");
		try {
			manager.saveOntology(merged, owlFuncFormat, IRI.create(file.toURI()));
		} catch (OWLOntologyStorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


//	private void print(NodeSet<? extends Object> nodes) {
//		print(nodes.getFlattened());
//	}

//	private void print(Set<? extends Object> set) {
////		System.out.println("-|-");
////		for(Object o : set) {
////			System.out.println(o);
////		}
//	}
	
	private OWLOntology previousModelOntology = null;
	
	private OWLOntology createModelOntology() throws OWLOntologyCreationException {
		if(previousModelOntology != null) 
			unloadOntology(previousModelOntology);
		String newiri = localurl+java.lang.System.currentTimeMillis()+"/";
		IRI iri = IRI.create(newiri); 
		localPrefix = new DefaultPrefixManager(newiri);
		OWLOntology ontology = getManager().createOntology(iri);
		previousModelOntology = ontology;
		
		addDefaultOntologyImports(ontology);
		addExternalOntologyImports(ontology);
		
//		Set<OWLAxiom> axioms = new HashSet<OWLAxiom>();
		List<org.pnml.tools.epnk.pnmlcoremodel.Object> objects = 
				NetFunctions.getAllNetObjects(getNet());
		
		OWLDataFactory factory = getManager().getOWLDataFactory();
		for(org.pnml.tools.epnk.pnmlcoremodel.Object o : objects){
			OWLNamedIndividual individual = factory.getOWLNamedIndividual(":"+o.getId(), localPrefix);
			OWLClass theclass = factory.getOWLClass(":"+getElementOWLClassName(o), cpnPrefix);
			OWLClassAssertionAxiom classAssertion = factory.getOWLClassAssertionAxiom(theclass, individual);
			getManager().applyChange(new AddAxiom(ontology, classAssertion));
			
			Name name = o.getName();
			if(name!=null) {
				OWLDataProperty nameProperty = factory.getOWLDataProperty(":name", cpnPrefix);
//				getManager().applyChange(new AddAxiom(ontology,
//						factory.getOWLDataPropertyAssertionAxiom(nameProperty, individual, name.getText())
//						));
			}
			
			if(o instanceof Place){
				Place place = (Place) o;
				InitialMarking marking = place.getInitialMarking();
				if(marking != null) {
					OWLDataProperty markProp = factory.getOWLDataProperty(":initialMarking", cpnPrefix);
					getManager().applyChange(new AddAxiom(ontology, 
							factory.getOWLDataPropertyAssertionAxiom(markProp, individual, marking.getText())));
				}
			}
			
			if(o instanceof Arc){
				Arc arc = (Arc) o;
				OWLObjectProperty sourceProp = factory.getOWLObjectProperty(":source", cpnPrefix);
				OWLNamedIndividual source = 
						factory.getOWLNamedIndividual(":"+arc.getSource().getId(), localPrefix);
				getManager().applyChange(new AddAxiom(ontology, 
						factory.getOWLObjectPropertyAssertionAxiom(sourceProp, individual, source)));

				OWLObjectProperty destProp = factory.getOWLObjectProperty(":dest", cpnPrefix);
				OWLNamedIndividual dest = 
						factory.getOWLNamedIndividual(":"+arc.getTarget().getId(), localPrefix);
				getManager().applyChange(new AddAxiom(ontology, 
						factory.getOWLObjectPropertyAssertionAxiom(destProp, individual, dest)));
				
				ArcExpression exp = arc.getExpression();
				if(exp != null) {
					OWLDataProperty expProp = factory.getOWLDataProperty(":expression", cpnPrefix);
					getManager().applyChange(new AddAxiom(ontology, 
							factory.getOWLDataPropertyAssertionAxiom(expProp, individual, exp.getText())));
				}
			}
			
			if(o instanceof Transition) {
				Transition T = (Transition) o;
				// TODO
			}
			
			if(o instanceof OntologyMember) {
				OntologyMember member = (OntologyMember) o;
				for(Pragma pragma : member.getAnnotation()) {
					OWLClass pragmaClass = 
							factory.getOWLClass(IRI.create(pragma.getIri()));
					OWLNamedIndividual pragmaInd = 
							factory.getOWLNamedIndividual(":"+o.getId()+"_pragma"+pragma.hashCode(), localPrefix);
					classAssertion = factory.getOWLClassAssertionAxiom(pragmaClass, pragmaInd);
					getManager().applyChange(new AddAxiom(ontology, classAssertion));
					
					OWLObjectProperty hasPragmatic = factory.getOWLObjectProperty(":hasPragmatic", basicPrefix);
					getManager().applyChange(new AddAxiom(ontology, 
							factory.getOWLObjectPropertyAssertionAxiom(hasPragmatic, individual, pragmaInd)));
				}
				
			}
		}
		
		return ontology;
	}

	private void addDefaultOntologyImports(OWLOntology ont) {
		OWLDataFactory fac = getManager().getOWLDataFactory();
		
		OWLImportsDeclaration imp = 
				fac.getOWLImportsDeclaration(IRI.create(cpnurl));
		getManager().applyChange(new AddImport(ont, imp));

		imp = fac.getOWLImportsDeclaration(IRI.create(basicurl));
		getManager().applyChange(new AddImport(ont, imp));
		
		imp = fac.getOWLImportsDeclaration(IRI.create(nppnurl));
		getManager().applyChange(new AddImport(ont, imp));
	}

	private void addExternalOntologyImports(OWLOntology ont) {
		for(OntologyDocument doc : getDocuments()) {
			OWLOntology importOnt = getManager().getOntology(IRI.create(doc.getIri()));
			if(importOnt == null) {
				IResource member = ResourcesPlugin.getWorkspace().getRoot().findMember(doc.getPath());
				if(member.getType() == IResource.FILE) {
					try {
						loadOntology((IFile) member);
					} catch (OWLOntologyCreationException e) {
						// TODO Show error to user
						e.printStackTrace();
					} catch (CoreException e) {
						
						e.printStackTrace();
					}
				}
			}
			OWLImportsDeclaration imp = getManager().getOWLDataFactory()
					.getOWLImportsDeclaration(IRI.create(doc.getIri()));
			getManager().applyChange(new AddImport(ont, imp));
		}
	}
	
	private String getElementOWLClassName(org.pnml.tools.epnk.pnmlcoremodel.Object o){
		String name = o.eClass().getName();
		if(name.equals("RefPlace")) return "Port";
		
		return name;
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
