/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.impl.CPNImpl;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma CPN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PragmaCPNImpl extends CPNImpl implements PragmaCPN {
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PragmaCPNImpl() {
		super();
		
//		try {
//			manager = OntologyLoader.load();
//			System.out.println("Loaded");
//		} catch(Exception e) {
//			System.out.println(e);
//		}
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
	 * @generated NOT
	 */
	@Override
	public String toString() {
		
		return "Annotated Colored Petri Net";
	}
	
	
} //PragmaCPNImpl
