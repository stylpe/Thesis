/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package importer.importWizards;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cpntools.accesscpn.model.Arc;
import org.cpntools.accesscpn.model.Instance;
import org.cpntools.accesscpn.model.RefPlace;
import org.cpntools.accesscpn.model.graphics.NodeGraphics;
import org.cpntools.accesscpn.model.importer.DOMParser;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionFactory;

public class ImportWizard extends Wizard implements IImportWizard {
	
	ImportWizardPage page;

	public ImportWizard() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("File Import Wizard"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		page = new ImportWizardPage("Import CPNTools File",selection); //NON-NLS-1
	}
	
	/* (non-Javadoc)
     * @see org.eclipse.jface.wizard.IWizard#addPages()
     */
    public void addPages() {
        super.addPages(); 
        addPage(page);        
    }

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		final IPath containerPath = page.getContainerFullPath();
		//IPath newFilePath = containerPath.append(page.getFileName());
		//final IFile newFileHandle = createFileHandle(newFilePath);

		final String inFileName = page.getInFileName();
		final String containerName = containerPath.toString();
		final String outFileName = page.getFileName();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					convert(inFileName, containerName, outFileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	protected void convert(String inFileName, String containerName,
			String outFileName, IProgressMonitor monitor) throws CoreException {
		
		// create a sample file
		monitor.beginTask("Creating " + outFileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(outFileName));

		String path = file.getFullPath().toString();
		if (file.exists()) {
			throwCoreException("File " + path + " exists!");
		    /*		
			if (!MessageDialog.openQuestion(page.getShell(),
					"Overwrite existing file?",
			"The selected file " + file + " exists! Do you really want to" +
			" overwrite it?")) {
				return;
			}
			*/
		}
		createPNMLFile(inFileName, path);
		// eki: insert end
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.pnml.tools.epnk.functions.tutorials", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * Create the PNML file.
	 * 
	 * @author eki
	 */
	public void createPNMLFile(String inFile, String path) {
		org.cpntools.accesscpn.model.PetriNet net = null;
		try {
			FileInputStream inFileIS = new FileInputStream(inFile);
			net = DOMParser.parse(inFileIS, "MyNet");
		} catch (Exception e) {
			MessageDialog.openError(getShell(), "Parse Error", e.getMessage());
			return;
		}
		// create the net
		PetriNetDoc doc = convertPetriNetDoc(net);
	
		// create the resource and add the net to it
		ResourceSet resourceSet = new ResourceSetImpl();
		final URI uri = URI.createURI(path);
		final Resource resource = resourceSet.createResource(uri);
		EList<EObject> contents = resource.getContents();
		contents.add(doc);
		try {
			resource.save(new HashMap<String,Object>());
		} catch (IOException e) {
			// Do nothing for now if file could not be saved.
		}
		
	}
	
	// private vars for convenience
	private PnmlcoremodelFactory core = PnmlcoremodelFactory.eINSTANCE;
	private HlpngdefinitionFactory hlpngFac = HlpngdefinitionFactory.eINSTANCE;
	private HLPNG hlpng;
	
	/**
	 * Create the PNML document (contents).
	 * 
	 * @author eki
	 */
	public PetriNetDoc convertPetriNetDoc(org.cpntools.accesscpn.model.PetriNet cpn) {
		
		// Prepare document
		PetriNetDoc doc = core.createPetriNetDoc();
		PetriNet pnml = core.createPetriNet();
		pnml.setId(cpn.getId());
		doc.getNet().add(pnml);
		
		hlpng = hlpngFac.createHLPNG();
		pnml.setType(hlpng);
		Name nameLabel = core.createName();
		nameLabel.setText(cpn.getName().asString());
		pnml.setName(nameLabel);
		
		// Convert pages
		List<org.cpntools.accesscpn.model.Page> cpnPages = cpn.getPage();
		EList<org.pnml.tools.epnk.pnmlcoremodel.Page> pnmlPages = pnml.getPage();
		
		for(org.cpntools.accesscpn.model.Page cpnPage : cpnPages) {
			Page newPage = convertPage(cpnPage);
			pnmlPages.add(newPage);
		}
		
		return doc;
	}

	/**
	 * Convert a page
	 * @param cpnPage
	 */
	private org.pnml.tools.epnk.pnmlcoremodel.Page convertPage(org.cpntools.accesscpn.model.Page cpnPage) {
		Page pnmlPage = hlpng.createPage();
		convertObjectParams(cpnPage, pnmlPage);
		
		EList<org.pnml.tools.epnk.pnmlcoremodel.Object> pageList = pnmlPage.getObject();
		//List<org.cpntools.accesscpn.model.Object> objects = cpnPage.getObject();
		Map<String, org.pnml.tools.epnk.pnmlcoremodel.Node> idToNodeMap 
			= new HashMap<String, org.pnml.tools.epnk.pnmlcoremodel.Node>();
		for(org.cpntools.accesscpn.model.Place cpnPlace : cpnPage.place()) {
			Place pnmlPlace = hlpng.createPlace();
			copyNodeParams(cpnPlace, pnmlPlace);
			pageList.add(pnmlPlace);
			idToNodeMap.put(pnmlPlace.getId(), pnmlPlace);
		}
		for(RefPlace cpnPort : cpnPage.portPlace()) {
			Place pnmlPlace = hlpng.createPlace();
			copyNodeParams(cpnPort, pnmlPlace);
			pageList.add(pnmlPlace);
			idToNodeMap.put(pnmlPlace.getId(), pnmlPlace);
		}
		for(org.cpntools.accesscpn.model.Transition cpnTrans : cpnPage.transition()) {
			Transition pnmlTrans = hlpng.createTransition();
			copyNodeParams(cpnTrans, pnmlTrans);
			pageList.add(pnmlTrans);
			idToNodeMap.put(pnmlTrans.getId(), pnmlTrans);
		}
		for(Instance cpnInst : cpnPage.instance()) {
			Transition pnmlTrans = hlpng.createTransition();
			copyNodeParams(cpnInst, pnmlTrans);
			pageList.add(pnmlTrans);
			idToNodeMap.put(pnmlTrans.getId(), pnmlTrans);
		}
		
		for(org.cpntools.accesscpn.model.Arc cpnArc : cpnPage.getArc()) {
			org.pnml.tools.epnk.pnmlcoremodel.Arc pnmlArc = hlpng.createArc();
			pnmlArc.setId(cpnArc.getId());
			String id = cpnArc.getSource().getId();
			pnmlArc.setSource(idToNodeMap.get(id));
			id = cpnArc.getTarget().getId();
			pnmlArc.setTarget(idToNodeMap.get(id));
			pageList.add(pnmlArc);
		}
		
		return pnmlPage;
	}
	private void copyNodeParams(org.cpntools.accesscpn.model.Object cpnObject, org.pnml.tools.epnk.pnmlcoremodel.Object pnmlObject) {
		convertObjectParams(cpnObject, pnmlObject);
		if(cpnObject.getGraphics() == null) return; // Turns out Access/CPN doesn't read graphics info
		if(!(cpnObject.getGraphics() instanceof org.cpntools.accesscpn.model.graphics.NodeGraphics)) 
			throw new ClassCastException("Not a Node.");
		org.cpntools.accesscpn.model.graphics.NodeGraphics cpnGraphics = (NodeGraphics) cpnObject.getGraphics();
		
		org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics pnmlGraphics = core.createNodeGraphics();
		
		org.cpntools.accesscpn.model.graphics.Coordinate oldPosition = cpnGraphics.getPosition();
		Coordinate position = core.createCoordinate();
		position.setX((float) oldPosition.getX());
		position.setY((float) oldPosition.getY());
		pnmlGraphics.setPosition(position);
		
		org.cpntools.accesscpn.model.graphics.Coordinate oldSize = cpnGraphics.getDimension();
		Coordinate size = core.createCoordinate();
		size.setX((float) oldSize.getX());
		size.setY((float) oldPosition.getY());
		pnmlGraphics.setDimension(size);
		
		pnmlObject.setGraphics(pnmlGraphics);
		
	}
	
	// Copy ID and Name from cpn object to pnml object
	private <ObjectOrPage extends org.cpntools.accesscpn.model.HasId & org.cpntools.accesscpn.model.HasName> 
	void convertObjectParams(ObjectOrPage cpnObject, org.pnml.tools.epnk.pnmlcoremodel.Object pnmlObject) {
		pnmlObject.setId(cpnObject.getId());
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(cpnObject.getName().asString());
		pnmlObject.setName(nameLabel);
	}
}