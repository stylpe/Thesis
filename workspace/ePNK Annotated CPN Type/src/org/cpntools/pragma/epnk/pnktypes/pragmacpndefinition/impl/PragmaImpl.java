/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl;

import java.util.Collection;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.impl.PragmaImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PragmaImpl extends LabelImpl implements Pragma {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = "";
	/**
	 * The default value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected static final String IRI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected String iri = IRI_EDEFAULT;
	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PragmaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PragmacpndefinitionPackage.Literals.PRAGMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getText() {
		StringBuilder sb = new StringBuilder("<<");
		
		int cut = iri.lastIndexOf("/");
		if(cut > 0) sb.append(iri.substring(cut+1));
		else sb.append(iri);
		
		if(getArgs() != null && getArgs().size()>0) {
			sb.append("(");
			boolean first = true;
			for(String arg : getArgs()) {
				if(first) first = false;
				else sb.append(", ");
				sb.append(arg);
			}
			sb.append(")");
		}
		
		sb.append(">>");
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIri() {
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIri(String newIri) {
		String oldIri = iri;
		iri = newIri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PragmacpndefinitionPackage.PRAGMA__IRI, oldIri, iri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this, PragmacpndefinitionPackage.PRAGMA__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PragmacpndefinitionPackage.PRAGMA__TEXT:
				return getText();
			case PragmacpndefinitionPackage.PRAGMA__IRI:
				return getIri();
			case PragmacpndefinitionPackage.PRAGMA__ARGS:
				return getArgs();
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
			case PragmacpndefinitionPackage.PRAGMA__IRI:
				setIri((String)newValue);
				return;
			case PragmacpndefinitionPackage.PRAGMA__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends String>)newValue);
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
			case PragmacpndefinitionPackage.PRAGMA__IRI:
				setIri(IRI_EDEFAULT);
				return;
			case PragmacpndefinitionPackage.PRAGMA__ARGS:
				getArgs().clear();
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
			case PragmacpndefinitionPackage.PRAGMA__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case PragmacpndefinitionPackage.PRAGMA__IRI:
				return IRI_EDEFAULT == null ? iri != null : !IRI_EDEFAULT.equals(iri);
			case PragmacpndefinitionPackage.PRAGMA__ARGS:
				return args != null && !args.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iri: ");
		result.append(iri);
		result.append(", args: ");
		result.append(args);
		result.append(')');
		return result.toString();
	}

} //PragmaImpl
