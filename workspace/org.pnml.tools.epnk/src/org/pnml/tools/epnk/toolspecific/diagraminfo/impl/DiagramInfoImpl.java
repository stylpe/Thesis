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
 * Copyright (C) 2011 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.toolspecific.diagraminfo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl#getPageLabelProxy <em>Page Label Proxy</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.toolspecific.diagraminfo.impl.DiagramInfoImpl#getLabelProxy <em>Label Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramInfoImpl extends EObjectImpl implements DiagramInfo {
	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected String tool = TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPageLabelProxy() <em>Page Label Proxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLabelProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<PageLabelProxy> pageLabelProxy;

	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected Diagram diagram;

	/**
	 * The cached value of the '{@link #getLabelProxy() <em>Label Proxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelProxy> labelProxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagraminfoPackage.Literals.DIAGRAM_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagraminfoPackage.DIAGRAM_INFO__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagraminfoPackage.DIAGRAM_INFO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageLabelProxy> getPageLabelProxy() {
		if (pageLabelProxy == null) {
			pageLabelProxy = new EObjectContainmentEList<PageLabelProxy>(PageLabelProxy.class, this, DiagraminfoPackage.DIAGRAM_INFO__PAGE_LABEL_PROXY);
		}
		return pageLabelProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		Diagram oldDiagram = diagram;
		diagram = newDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM, oldDiagram, newDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		if (newDiagram != diagram) {
			NotificationChain msgs = null;
			if (diagram != null)
				msgs = ((InternalEObject)diagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM, null, msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM, null, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelProxy> getLabelProxy() {
		if (labelProxy == null) {
			labelProxy = new EObjectContainmentEList<LabelProxy>(LabelProxy.class, this, DiagraminfoPackage.DIAGRAM_INFO__LABEL_PROXY);
		}
		return labelProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagraminfoPackage.DIAGRAM_INFO__PAGE_LABEL_PROXY:
				return ((InternalEList<?>)getPageLabelProxy()).basicRemove(otherEnd, msgs);
			case DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case DiagraminfoPackage.DIAGRAM_INFO__LABEL_PROXY:
				return ((InternalEList<?>)getLabelProxy()).basicRemove(otherEnd, msgs);
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
			case DiagraminfoPackage.DIAGRAM_INFO__TOOL:
				return getTool();
			case DiagraminfoPackage.DIAGRAM_INFO__VERSION:
				return getVersion();
			case DiagraminfoPackage.DIAGRAM_INFO__PAGE_LABEL_PROXY:
				return getPageLabelProxy();
			case DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM:
				return getDiagram();
			case DiagraminfoPackage.DIAGRAM_INFO__LABEL_PROXY:
				return getLabelProxy();
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
			case DiagraminfoPackage.DIAGRAM_INFO__TOOL:
				setTool((String)newValue);
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__VERSION:
				setVersion((String)newValue);
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__PAGE_LABEL_PROXY:
				getPageLabelProxy().clear();
				getPageLabelProxy().addAll((Collection<? extends PageLabelProxy>)newValue);
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__LABEL_PROXY:
				getLabelProxy().clear();
				getLabelProxy().addAll((Collection<? extends LabelProxy>)newValue);
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
			case DiagraminfoPackage.DIAGRAM_INFO__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__PAGE_LABEL_PROXY:
				getPageLabelProxy().clear();
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case DiagraminfoPackage.DIAGRAM_INFO__LABEL_PROXY:
				getLabelProxy().clear();
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
			case DiagraminfoPackage.DIAGRAM_INFO__TOOL:
				return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
			case DiagraminfoPackage.DIAGRAM_INFO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DiagraminfoPackage.DIAGRAM_INFO__PAGE_LABEL_PROXY:
				return pageLabelProxy != null && !pageLabelProxy.isEmpty();
			case DiagraminfoPackage.DIAGRAM_INFO__DIAGRAM:
				return diagram != null;
			case DiagraminfoPackage.DIAGRAM_INFO__LABEL_PROXY:
				return labelProxy != null && !labelProxy.isEmpty();
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
		result.append(" (tool: ");
		result.append(tool);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}
	
	private Page page;

	/**
	 * This method guarantees that the LabelProxies and PageLabel Proxies
	 * of a page are properly initialized, when the DiagramInfo is added
	 * to another container.
	 * 
	 * @generated NOT
	 * @author eki
	 */
	@Override
	protected void eBasicSetContainer(InternalEObject newContainer,
			int newContainerFeatureID) {
		super.eBasicSetContainer(newContainer, newContainerFeatureID);
					
		pageLabelProxy = null;
		page = null;
		
		if (newContainer != null && newContainer instanceof Page) {
			page = (Page) newContainer;
			pageLabelProxy = page.getPageLabelProxy();
			labelProxy = page.getLabelproxy();
		}
	}

} //DiagramInfoImpl
