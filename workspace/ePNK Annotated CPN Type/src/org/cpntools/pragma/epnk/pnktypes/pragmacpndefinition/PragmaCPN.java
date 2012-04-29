/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma CPN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN#getLoadedOntologies <em>Loaded Ontologies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaCPN()
 * @model
 * @generated
 */
public interface PragmaCPN extends CPN {
	/**
	 * Returns the value of the '<em><b>Loaded Ontologies</b></em>' containment reference list.
	 * The list contents are of type {@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded Ontologies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded Ontologies</em>' containment reference list.
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaCPN_LoadedOntologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologyDocument> getLoadedOntologies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fileDataType="org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyFile"
	 * @generated
	 */
	void includeOntologyFromFile(IFile file);

} // PragmaCPN
