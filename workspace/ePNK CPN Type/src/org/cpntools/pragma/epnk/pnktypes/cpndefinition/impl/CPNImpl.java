/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CPNImpl extends PetriNetTypeImpl implements CPN {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CPNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpndefinitionPackage.Literals.CPN;
	}

	@Override
	// @generated NOT
	public String toString() {
		return "Colored Petri Net";
	}
} //CPNImpl
