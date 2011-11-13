/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.HlpngserialisationPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngserialisation.TermAssoc;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

import org.pnml.tools.epnk.serialisation.impl.AssocClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TermAssocImpl extends AssocClassImpl implements TermAssoc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HlpngserialisationPackage.Literals.TERM_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getSort() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@Override
	public Sort getSort(Set<NamedOperator> used) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	
} //TermAssocImpl
