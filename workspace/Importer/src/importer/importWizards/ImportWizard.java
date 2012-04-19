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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.cpntools.accesscpn.model.Instance;
import org.cpntools.accesscpn.model.RefPlace;
import org.cpntools.accesscpn.model.graphics.NodeGraphics;
import org.cpntools.accesscpn.model.importer.DOMParser;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CPN;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionFactory;
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
import org.pnml.tools.epnk.graphics.datatypes.CSSColor;
import org.pnml.tools.epnk.graphics.datatypes.IllegalFormatException;
import org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.Graphics;
import org.pnml.tools.epnk.pnmlcoremodel.Line;
import org.pnml.tools.epnk.pnmlcoremodel.LineShape;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagraminfoFactory;

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
			realException.printStackTrace();
			MessageDialog.openError(getShell(), "Error", realException.toString());
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
	private CpndefinitionFactory cpnFac = CpndefinitionFactory.eINSTANCE;
	private CPN cpn;
	private Map<org.pnml.tools.epnk.pnmlcoremodel.RefPlace, String> refPlaces;
	private Map<String, org.pnml.tools.epnk.pnmlcoremodel.Node> idToNodeMap;
	private float minY;
	private float minX;
	
	/**
	 * Create the PNML document (contents).
	 * 
	 * @author Mikal
	 */
	public PetriNetDoc convertPetriNetDoc(org.cpntools.accesscpn.model.PetriNet cpnnet) {
		
		// Prepare document
		PetriNetDoc doc = core.createPetriNetDoc();
		PetriNet pnmlnet = core.createPetriNet();
		pnmlnet.setId(cpnnet.getId());
		doc.getNet().add(pnmlnet);
		
		cpn = cpnFac.createCPN();
		pnmlnet.setType(cpn);
		Name nameLabel = core.createName();
		nameLabel.setText(cpnnet.getName().asString());
		pnmlnet.setName(nameLabel);
		
		// Convert pages
		List<org.cpntools.accesscpn.model.Page> cpnPages = cpnnet.getPage();
		EList<org.pnml.tools.epnk.pnmlcoremodel.Page> pnmlPages = pnmlnet.getPage();
		
		refPlaces = new HashMap<org.pnml.tools.epnk.pnmlcoremodel.RefPlace, String>();
		idToNodeMap = new HashMap<String, org.pnml.tools.epnk.pnmlcoremodel.Node>();
		
		for(org.cpntools.accesscpn.model.Page cpnPage : cpnPages) {
			Page newPage = convertPage(cpnPage);
			pnmlPages.add(newPage);
			//newPage.getToolspecific().add(DiagraminfoFactory.eINSTANCE.createDiagramInfo());
		}
		
		for(Entry<org.pnml.tools.epnk.pnmlcoremodel.RefPlace, String> pair : refPlaces.entrySet()) {
			System.out.println("Connecting RefPlace");
			System.out.println(pair.getValue());
			pair.getKey().setRef((PlaceNode) idToNodeMap.get(pair.getValue()));
		}
		
		return doc;
	}

	/**
	 * Convert a page
	 * @param cpnPage
	 */
	private org.pnml.tools.epnk.pnmlcoremodel.Page convertPage(org.cpntools.accesscpn.model.Page cpnPage) {
		
		Page pnmlPage = cpn.createPage();
		convertObjectParams(cpnPage, pnmlPage);
		idToNodeMap.put(pnmlPage.getId(), pnmlPage);
		
		EList<org.pnml.tools.epnk.pnmlcoremodel.Object> pageList = pnmlPage.getObject();
		
		for(org.cpntools.accesscpn.model.Place cpnPlace : cpnPage.place()) {
			Place pnmlPlace = cpn.createPlace();
			copyNodeParams(cpnPlace, pnmlPlace);
			pageList.add(pnmlPlace);
			idToNodeMap.put(pnmlPlace.getId(), pnmlPlace);
		}
		for(RefPlace cpnPort : cpnPage.portPlace()) {
			org.pnml.tools.epnk.pnmlcoremodel.RefPlace pnmlPlace = cpn.createRefPlace();
			copyNodeParams(cpnPort, pnmlPlace);
			pageList.add(pnmlPlace);
			idToNodeMap.put(pnmlPlace.getId(), pnmlPlace);
			
			org.cpntools.accesscpn.model.Place ref = cpnPort.getRef();
			if(ref != null)	refPlaces.put(pnmlPlace, ref.getId());
			else ;
		}
		for(org.cpntools.accesscpn.model.Transition cpnTrans : cpnPage.transition()) {
			Transition pnmlTrans = cpn.createTransition();
			copyNodeParams(cpnTrans, pnmlTrans);
			pageList.add(pnmlTrans);
			idToNodeMap.put(pnmlTrans.getId(), pnmlTrans);
		}
		for(Instance cpnInst : cpnPage.instance()) {
			Transition pnmlTrans = cpn.createTransition();
			copyNodeParams(cpnInst, pnmlTrans);
			pageList.add(pnmlTrans);
			idToNodeMap.put(pnmlTrans.getId(), pnmlTrans);
		}
		
		
		for(org.cpntools.accesscpn.model.Arc cpnArc : cpnPage.getArc()) {
			org.pnml.tools.epnk.pnmlcoremodel.Arc pnmlArc = cpn.createArc();
			pnmlArc.setId(cpnArc.getId());
			String id = cpnArc.getSource().getId();
			pnmlArc.setSource(idToNodeMap.get(id));
			id = cpnArc.getTarget().getId();
			pnmlArc.setTarget(idToNodeMap.get(id));
			
			org.cpntools.accesscpn.model.graphics.ArcGraphics oldGfx = cpnArc.getArcGraphics();
			org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics gfx = core.createArcGraphics();
			//gfx.setLine();
			List<org.cpntools.accesscpn.model.graphics.Coordinate> oldPos = oldGfx.getPosition();
			EList<org.pnml.tools.epnk.pnmlcoremodel.Coordinate> pos = gfx.getPosition();
			for(org.cpntools.accesscpn.model.graphics.Coordinate oldC : oldPos) {
				float x = (float) oldC.getX();
				float y = (float) -oldC.getY(); // Flip Y-coord
				Coordinate c = core.createCoordinate();
				c.setX(x);
				c.setY(y);
				pos.add(c);
				// Save lowest pos coordinates 
				if(minX>x) minX=x;
				if(minY>y) minY=y;
			}
			pnmlArc.setGraphics(gfx);
			
			pageList.add(pnmlArc);
		}
		
		// Adjust min position to create a margin
		float margin = 50.0f;
		minX -= margin;
		minY -= margin;
		
		// Normalise to positive coordinates to ensure entire model is in view when first opened
		for(Object o : pageList) {
			Graphics g = o.getGraphics();
			if(g == null) continue;
			if(g instanceof org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics) {
				org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics ng = (org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics) g;
				Coordinate c = ng.getPosition();
				c.setX(c.getX()-minX);
				c.setY(c.getY()-minY);
			} else if(g instanceof org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics) {
				org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics ag = (ArcGraphics) g;
				for(Coordinate c : ag.getPosition()) {
					c.setX(c.getX()-minX);
					c.setY(c.getY()-minY);
				}
			}
		}
		
		return pnmlPage;
	}
	private void copyNodeParams(org.cpntools.accesscpn.model.Object cpnObject, org.pnml.tools.epnk.pnmlcoremodel.Object pnmlObject) {
		convertObjectParams(cpnObject, pnmlObject);
		if(cpnObject.getGraphics() == null) {
			System.out.println("Null graphics");
			return; // Access/CPN didn't use to read graphics info
		}
		if(!(cpnObject.getGraphics() instanceof org.cpntools.accesscpn.model.graphics.NodeGraphics)) 
			throw new ClassCastException("Not a Node.");
		org.cpntools.accesscpn.model.graphics.NodeGraphics cpnGraphics = (NodeGraphics) cpnObject.getGraphics();
		
		org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics pnmlGraphics = core.createNodeGraphics();
		
		org.cpntools.accesscpn.model.graphics.Coordinate oldPosition = cpnGraphics.getPosition();
		Coordinate position = core.createCoordinate();
		float x = (float) oldPosition.getX();
		float y = (float) -oldPosition.getY(); // Flip Y-coord
		position.setX(x);
		position.setY(y);
		pnmlGraphics.setPosition(position);
		// Save lowest pos coordinates 
		if(minX>x) minX=x;
		if(minY>y) minY=y;
		
		
		org.cpntools.accesscpn.model.graphics.Coordinate oldSize = cpnGraphics.getDimension();
		Coordinate dimension = core.createCoordinate();
		dimension.setX((float) oldSize.getX());
		dimension.setY((float) oldSize.getY());
		pnmlGraphics.setDimension(dimension);
/*
		org.cpntools.accesscpn.model.graphics.Fill oldFill = cpnGraphics.getFill();
		Fill fill  = core.createFill();
		try {
			fill.setColor(new CSSColor(oldFill.getColor()));
			pnmlGraphics.setFill(fill);
		} catch (IllegalFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		org.cpntools.accesscpn.model.graphics.Line oldLine = cpnGraphics.getLine();
		Line line = core.createLine();
		try {
			line.setColor(new CSSColor(oldLine.getColor()));
			line.setShape(LineShape.get(oldLine.getShape().getValue()));
			//line.setStyle(oldLine.getStyle());
			line.setWidth((float) oldLine.getWidth());
			pnmlGraphics.setLine(line);
		} catch (IllegalFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
		pnmlObject.setGraphics(pnmlGraphics);

		Name nameLabel = pnmlObject.getName();
		if(nameLabel != null) {
			AnnotationGraphics nameGfx = core.createAnnotationGraphics();
			float height = 9; //nameGfx.getFont().getSize().getSize(); <-- gives null
			float width = height * nameLabel.getText().length() * 0.5f;
			Coordinate nameGfxCoord = core.createCoordinate();
			// Center name label approx.
			nameGfxCoord.setX(-width*0.7f);
			nameGfxCoord.setY(-height*0.7f);
			nameGfx.setOffset(nameGfxCoord);
			nameLabel.setGraphics(nameGfx);
		}
		
	}
	
	// Copy ID and Name from cpn object to pnml object
	private <ObjectOrPage extends org.cpntools.accesscpn.model.HasId & org.cpntools.accesscpn.model.HasName> 
	void convertObjectParams(ObjectOrPage cpnObject, org.pnml.tools.epnk.pnmlcoremodel.Object pnmlObject) {
		pnmlObject.setId(cpnObject.getId());
		Name nameLabel = core.createName();
		nameLabel.setText(cpnObject.getName().asString());
		pnmlObject.setName(nameLabel);
	}
}
