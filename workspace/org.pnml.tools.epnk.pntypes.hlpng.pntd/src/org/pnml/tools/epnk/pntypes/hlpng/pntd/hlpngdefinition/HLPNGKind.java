/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HLPNG Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionPackage#getHLPNGKind()
 * @model
 * @generated
 */
public enum HLPNGKind implements Enumerator {
	/**
	 * The '<em><b>FULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_VALUE
	 * @generated
	 * @ordered
	 */
	FULL(0, "FULL", "http://www.pnml.org/version-2009/grammar/highlevelnet"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SN_VALUE
	 * @generated
	 * @ordered
	 */
	SN(1, "SN", "http://www.pnml.org/version-2009/grammar/symmetricnet"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PTN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTN_VALUE
	 * @generated
	 * @ordered
	 */
	PTN(2, "PTN", "http://www.pnml.org/version-2009/grammar/pt-hlpng"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL
	 * @model literal="http://www.pnml.org/version-2009/grammar/highlevelnet"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_VALUE = 0;

	/**
	 * The '<em><b>SN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SN
	 * @model literal="http://www.pnml.org/version-2009/grammar/symmetricnet"
	 * @generated
	 * @ordered
	 */
	public static final int SN_VALUE = 1;

	/**
	 * The '<em><b>PTN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTN
	 * @model literal="http://www.pnml.org/version-2009/grammar/pt-hlpng"
	 * @generated
	 * @ordered
	 */
	public static final int PTN_VALUE = 2;

	/**
	 * An array of all the '<em><b>HLPNG Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HLPNGKind[] VALUES_ARRAY =
		new HLPNGKind[] {
			FULL,
			SN,
			PTN,
		};

	/**
	 * A public read-only list of all the '<em><b>HLPNG Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HLPNGKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HLPNG Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HLPNGKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HLPNGKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HLPNG Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HLPNGKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HLPNGKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HLPNG Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HLPNGKind get(int value) {
		switch (value) {
			case FULL_VALUE: return FULL;
			case SN_VALUE: return SN;
			case PTN_VALUE: return PTN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HLPNGKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HLPNGKind
