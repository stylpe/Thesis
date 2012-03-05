/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition;

import org.eclipse.emf.common.util.EList;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPN Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPNType#getLoadedPragmaSets <em>Loaded Pragma Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getCPNType()
 * @model
 * @generated
 */
public interface CPNType extends PetriNetType {

	/**
	 * Returns the value of the '<em><b>Loaded Pragma Sets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded Pragma Sets</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded Pragma Sets</em>' attribute list.
	 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getCPNType_LoadedPragmaSets()
	 * @model
	 * @generated
	 */
	EList<String> getLoadedPragmaSets();
} // CPNType
