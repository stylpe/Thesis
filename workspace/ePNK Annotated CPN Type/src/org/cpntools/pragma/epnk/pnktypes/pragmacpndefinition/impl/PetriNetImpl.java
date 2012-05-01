/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PetriNetImpl#getOntology <em>Ontology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetImpl implements PetriNet {
	/**
	 * The cached value of the '{@link #getOntology() <em>Ontology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected PragmaticsOntology ontology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PragmacpndefinitionPackage.Literals.PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmaticsOntology getOntology() {
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntology(PragmaticsOntology newOntology, NotificationChain msgs) {
		PragmaticsOntology oldOntology = ontology;
		ontology = newOntology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY, oldOntology, newOntology);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntology(PragmaticsOntology newOntology) {
		if (newOntology != ontology) {
			NotificationChain msgs = null;
			if (ontology != null)
				msgs = ((InternalEObject)ontology).eInverseRemove(this, PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET, PragmaticsOntology.class, msgs);
			if (newOntology != null)
				msgs = ((InternalEObject)newOntology).eInverseAdd(this, PragmacpndefinitionPackage.PRAGMATICS_ONTOLOGY__NET, PragmaticsOntology.class, msgs);
			msgs = basicSetOntology(newOntology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY, newOntology, newOntology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY:
				if (ontology != null)
					msgs = ((InternalEObject)ontology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY, null, msgs);
				return basicSetOntology((PragmaticsOntology)otherEnd, msgs);
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
			case PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY:
				return basicSetOntology(null, msgs);
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
			case PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY:
				return getOntology();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY:
				setOntology((PragmaticsOntology)newValue);
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
			case PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY:
				setOntology((PragmaticsOntology)null);
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
			case PragmacpndefinitionPackage.PETRI_NET__ONTOLOGY:
				return ontology != null;
		}
		return super.eIsSet(featureID);
	}

} //PetriNetImpl
