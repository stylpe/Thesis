/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pragma Source</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage#getPragmaSource()
 * @model
 * @generated
 */
public enum PragmaSource implements Enumerator {
	/**
	 * The '<em><b>EEnum Literal0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EENUM_LITERAL0_VALUE
	 * @generated
	 * @ordered
	 */
	EENUM_LITERAL0(0, "EEnumLiteral0", "EEnumLiteral0"),

	/**
	 * The '<em><b>EEnum Literal1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EENUM_LITERAL1_VALUE
	 * @generated
	 * @ordered
	 */
	EENUM_LITERAL1(1, "EEnumLiteral1", "EEnumLiteral1");

	/**
	 * The '<em><b>EEnum Literal0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EEnum Literal0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EENUM_LITERAL0
	 * @model name="EEnumLiteral0"
	 * @generated
	 * @ordered
	 */
	public static final int EENUM_LITERAL0_VALUE = 0;

	/**
	 * The '<em><b>EEnum Literal1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EEnum Literal1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EENUM_LITERAL1
	 * @model name="EEnumLiteral1"
	 * @generated
	 * @ordered
	 */
	public static final int EENUM_LITERAL1_VALUE = 1;

	/**
	 * An array of all the '<em><b>Pragma Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PragmaSource[] VALUES_ARRAY =
		new PragmaSource[] {
			EENUM_LITERAL0,
			EENUM_LITERAL1,
		};

	/**
	 * A public read-only list of all the '<em><b>Pragma Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PragmaSource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pragma Source</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PragmaSource get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PragmaSource result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pragma Source</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PragmaSource getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PragmaSource result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pragma Source</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PragmaSource get(int value) {
		switch (value) {
			case EENUM_LITERAL0_VALUE: return EENUM_LITERAL0;
			case EENUM_LITERAL1_VALUE: return EENUM_LITERAL1;
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
	private PragmaSource(int value, String name, String literal) {
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
	
} //PragmaSource
