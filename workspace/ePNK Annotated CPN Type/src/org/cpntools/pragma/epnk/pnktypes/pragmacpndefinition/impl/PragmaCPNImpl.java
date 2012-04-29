/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import java.util.Collection;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNImpl;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.ontology.OntologyLoader;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.ExtendedPNMLMetaData;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma CPN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaCPNImpl#getLoadedOntologies <em>Loaded Ontologies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PragmaCPNImpl extends CPNImpl implements PragmaCPN {
	
	/**
	 * The cached value of the '{@link #getLoadedOntologies() <em>Loaded Ontologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedOntologies()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyDocument> loadedOntologies;

	private OWLOntologyManager manager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PragmaCPNImpl() {
		super();
		
		try {
			manager = OntologyLoader.load();
			System.out.println("Loaded");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PragmacpndefinitionPackage.Literals.PRAGMA_CPN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologyDocument> getLoadedOntologies() {
		if (loadedOntologies == null) {
			loadedOntologies = new EObjectContainmentEList<OntologyDocument>(OntologyDocument.class, this, PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_ONTOLOGIES);
		}
		return loadedOntologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void includeOntologyFromFile(IFile file) {
		try {
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);

			if (domain != null) {
				OWLOntology ont = manager.loadOntologyFromOntologyDocument(file.getContents());
				
				OntologyDocument loadedDoc = PragmacpndefinitionFactory.eINSTANCE.createOntologyDocument();
				loadedDoc.setIri(ont.getOntologyID().getOntologyIRI().toString());
				loadedDoc.setPath(file.getFullPath().toPortableString());
				System.out.println(loadedDoc);
				
				domain.getCommandStack().execute(
					AddCommand.create( domain, this, 
						PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_ONTOLOGIES, loadedDoc
				));
			}
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_ONTOLOGIES:
				return ((InternalEList<?>)getLoadedOntologies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_ONTOLOGIES:
				return getLoadedOntologies();
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
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_ONTOLOGIES:
				getLoadedOntologies().clear();
				getLoadedOntologies().addAll((Collection<? extends OntologyDocument>)newValue);
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
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_ONTOLOGIES:
				getLoadedOntologies().clear();
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
			case PragmacpndefinitionPackage.PRAGMA_CPN__LOADED_ONTOLOGIES:
				return loadedOntologies != null && !loadedOntologies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		
		return "Annotated Colored Petri Net";
	}
	
	@Override
	public void registerExtendedPNMLMetaData(ExtendedPNMLMetaData metadata) {
		super.registerExtendedPNMLMetaData(metadata);

		metadata.add(
				PragmacpndefinitionPackage.eINSTANCE.getPragmaCPN_LoadedOntologies(),
				PragmacpndefinitionPackage.eINSTANCE.getPragmaCPN(),
				PragmacpndefinitionPackage.eINSTANCE.getOntologyDocument(), 
				"ontologyDocument",
				null,
				null);
		
	}
	
} //PragmaCPNImpl
