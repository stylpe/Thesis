/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma CPN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN#getLoadedPragmaSets <em>Loaded Pragma Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaCPN()
 * @model
 * @generated
 */
public interface PragmaCPN extends CPN {
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
	 * @see org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage#getPragmaCPN_LoadedPragmaSets()
	 * @model
	 * @generated
	 */
	EList<String> getLoadedPragmaSets();

} // PragmaCPN
