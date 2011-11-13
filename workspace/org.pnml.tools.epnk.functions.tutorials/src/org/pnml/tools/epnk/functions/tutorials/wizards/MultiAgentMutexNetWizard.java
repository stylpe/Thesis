package org.pnml.tools.epnk.functions.tutorials.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger;
import org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pntypes.ptnet.PTMarking;
import org.pnml.tools.epnk.pntypes.ptnet.Place;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetFactory;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "pnml". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class MultiAgentMutexNetWizard extends Wizard implements INewWizard {
	private MultiAgentMutexNetWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for MultiAgentMutexNetWizard.
	 */
	public MultiAgentMutexNetWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new MultiAgentMutexNetWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		final int number = page.getNumber();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, number, monitor);
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

	private void doFinish(
		String containerName,
		String fileName,
		int number,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		/* eki: original part replaced by EMF resource creation
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		*/
		// eki: inserted this code instead
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
		createPNMLFile(path, number);
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
	
	/*
	 * We will initialize file contents with a sample text.
	 *
	 * eki: this method is not used in our modification

	private InputStream openContentStream() {
		String contents =
			"This is the initial file contents for *.pnml file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}
	
	 */

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.pnml.tools.epnk.functions.tutorials", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	/**
	 * Create the PNML file.
	 * 
	 * @author eki
	 */
	public void createPNMLFile(String path, int number) {
		// create the net
		PetriNetDoc doc = createPetriNetDoc(number);
	
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
	
	/**
	 * Create the PNML document (contents).
	 * 
	 * @author eki
	 */
	public PetriNetDoc createPetriNetDoc(int number) {
		PetriNetDoc doc = PnmlcoremodelFactory.eINSTANCE.createPetriNetDoc();
		PetriNet net = PnmlcoremodelFactory.eINSTANCE.createPetriNet();
		net.setId("n1");
		doc.getNet().add(net);
		PetriNetType type = PtnetFactory.eINSTANCE.createPTNet();
		net.setType(type);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText("Mutual exclusion");
		net.setName(nameLabel);
		
		Page page = createPage(type,"pg0","semaphor page");
		EList<Page> pages = net.getPage();
		pages.add(page);
		
		Place semaphor = this.createPlace(type, "semaphor", "semaphor", 1, 380, 140);
		page.getObject().add(semaphor);
		
		for (int i=1; i<= number; i++) {
			page = createAgentPage(type, semaphor, i);
			pages.add(page);
		}
		
		return doc;
	}
	
	public Page createAgentPage(PetriNetType type, Place semaphor, int i) {
		Page page = createPage(type, "pg"+i, "agent"+i);
		
		Place idle = createPlace(type, "idle"+i, "idle"+i, 1, 100, 220);
		Place pending = createPlace(type, "pending"+i, "pending"+i, 0, 100, 60);
		Place critical = createPlace(type, "critical"+i, "critical"+i, 0, 300, 140);

		RefPlace semRef = createRefPlace("semaphor"+i, "semaphor", semaphor, 380, 140);
		
		Transition t1 = createTransition(type, "t1."+i, "t1."+i, 40, 140);
		Transition t2 = createTransition(type, "t2."+i, "t2."+i, 220, 60);
		Transition t3 = createTransition(type, "t3."+i, "t3."+i, 220, 220);
		
		Arc a1 = createArc(type, "a1."+i, idle, t1);
		Arc a2 = createArc(type, "a2."+i, t1, pending);
		Arc a3 = createArc(type, "a3."+i, pending, t2);
		Arc a4 = createArc(type, "a4."+i, t2, critical);
		Arc a5 = createArc(type, "a5."+i, critical, t3);
		Arc a6 = createArc(type, "a6."+i, t3, idle);
		
		Arc a7 = createArc(type, "a7."+i, semRef, t2);
		Coordinate coordinate = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		coordinate.setX(300);
		coordinate.setY(60);
		ArcGraphics arcGraphics = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
		arcGraphics.getPosition().add(coordinate);
		a7.setGraphics(arcGraphics);
		
		Arc a8 = createArc(type, "a8."+i, t3, semRef);
		coordinate = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		coordinate.setX(300);
		coordinate.setY(220);
		arcGraphics = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
		arcGraphics.getPosition().add(coordinate);
		a8.setGraphics(arcGraphics);
		
		EList<Object> contents = page.getObject();
		contents.add(idle);
		contents.add(pending);
		contents.add(critical);
		contents.add(semRef);
		contents.add(t1);
		contents.add(t2);
		contents.add(t3);
		contents.add(a1);
		contents.add(a2);
		contents.add(a3);
		contents.add(a4);
		contents.add(a5);
		contents.add(a6);
		contents.add(a7);
		contents.add(a8);

		return page;		
	}
	
	public Page createPage(PetriNetType type, String id, String name) {
		Page page = type.createPage();
		page.setId(id);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		page.setName(nameLabel);
		return page;
	}
	
	public Place createPlace(PetriNetType type, String id, String name, int marking, float x, float y) {
		Place place = (Place) type.createPlace();
		place.setId(id);
		NodeGraphics nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
		Coordinate position = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		position.setX(x);
		position.setY(y);
		nodeGraphics.setPosition(position);
		Coordinate size = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		size.setX(40);
		size.setY(40);
		nodeGraphics.setDimension(size);
		place.setGraphics(nodeGraphics);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		AnnotationGraphics labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
		Coordinate offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		offset.setX(0);
		offset.setY(30);
		labelPos.setOffset(offset);

		
		nameLabel.setGraphics(labelPos);
		place.setName(nameLabel);
		if (marking > 0) {
			PTMarking markingLabel = PtnetFactory.eINSTANCE.createPTMarking();
			NonNegativeInteger value = new NonNegativeInteger(""+marking);
			markingLabel.setText(value);
			labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
			offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
			offset.setX(0);
			offset.setY(-40);
			labelPos.setOffset(offset);
			markingLabel.setGraphics(labelPos);
			place.setInitialMarking(markingLabel);
		}
		return place;
	}
	
	public Transition createTransition(PetriNetType type, String id, String name, float x, float y) {
		Transition transition = type.createTransition();
		transition.setId(id);
		NodeGraphics nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
		Coordinate position = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		position.setX(x);
		position.setY(y);
		nodeGraphics.setPosition(position);
		Coordinate size = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		size.setX(40);
		size.setY(40);
		nodeGraphics.setDimension(size);
		transition.setGraphics(nodeGraphics);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		AnnotationGraphics labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
		Coordinate offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		offset.setX(0);
		offset.setY(30);
		labelPos.setOffset(offset);
		nameLabel.setGraphics(labelPos);
		transition.setName(nameLabel);
		return transition;
	}
	
	public RefPlace createRefPlace(String id, String name, PlaceNode place, float x, float y) {
		RefPlace refPlace = PnmlcoremodelFactory.eINSTANCE.createRefPlace();
		refPlace.setId(id);
		refPlace.setRef(place);
		NodeGraphics nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
		Coordinate position = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		position.setX(x);
		position.setY(y);
		nodeGraphics.setPosition(position);
		Coordinate size = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		size.setX(40);
		size.setY(40);
		nodeGraphics.setDimension(size);
		refPlace.setGraphics(nodeGraphics);
		Name nameLabel = PnmlcoremodelFactory.eINSTANCE.createName();
		nameLabel.setText(name);
		AnnotationGraphics labelPos = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
		Coordinate offset = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		offset.setX(0);
		offset.setY(30);
		labelPos.setOffset(offset);
		nameLabel.setGraphics(labelPos);
		refPlace.setName(nameLabel);
		return refPlace;
	}
	
	public Arc createArc(PetriNetType type, String id, Node source, Node target) {
		Arc arc = type.createArc();
		arc.setId(id);
		arc.setSource(source);
		arc.setTarget(target);
		return arc;	
	}
}