package org.pnml.tools.epnk.functions.tutorials.overviewview;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view that listens to the users selectsions.
 * If the selected resource is a ePNK document (either
 * PNX or PNML), the view will give an overview over this
 * file. Note that this is not too interesting functionality,
 * but gives a good idea on how to use some features 
 * of eclipse and the ePNK. In particular, it shows how
 * PNML files can be opened and read from a program.
 * 
 * @author eki@imm.dtu.dk
 */
public class PNMLFileOverviewView extends ViewPart implements ISelectionListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.pnml.tools.epnk.extensions.tutorials.pnmloverview";

	/**
	 * The viewer that shows the overview.
	 */
	private TableViewer viewer;
	
	/**
	 * This is a callback method that is used to create the viewer and 
	 * initialize it.
	 */
	public void createPartControl(Composite parent) {
        // a simple TableViewer with an even simple ContentProvider
		// and LabelProvider
        viewer = new TableViewer(parent);
        viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new LabelProvider());       

		// add this view to the workbench selection listener and
		// set the view to the initial selection
		getSite().getPage().addSelectionListener(this);
		selectionChanged(null, getSite().getPage().getSelection());
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	/**
	 * Removes this view as SelectionListener when the view is disposed.
	 */
    public void dispose() {
        super.dispose();
        getSite().getPage().removeSelectionListener(this);
    }
    
	/**
	 *  Method required by SelectionListener interface, which will
	 *  be called, when the selection is changed so that the view
	 *  is updated accordingly.
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// Get the extension 
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured = (IStructuredSelection) selection;

			// Right now, only the first element of the selection is taken
			// into account.
			Object first = structured.getFirstElement();
			if (first instanceof IFile) {
				viewer.setInput(getOverviewInfo((IFile) first));
			}
		}
	}
	
    /**
     * This checks whether the selected element is a ePNK resource (i.e. a
     * PNML or PNX file), if so, the file is read and some overview with
     * some information on the files content is produced in form
     * of a simple String array.  
     *  
     * @param selection
     * @return
     */
	public String[] getOverviewInfo(IFile file) {
		String[] result = {"No ePNK file selected"};

		String extension = file.getFileExtension();
		if (extension != null && 
				(extension.equals("pnml" ) || 
						extension.equals("pnx"))) {
			String path = file.getLocationURI().toString();

			// Actually, we "abuse" the selection mechanism to
			// to get an URI to a file (avoiding to use a
			// file dialog). Below, it is shown how you could
			// load programmatically any ePNK file for which you
			// have the URL
			URI uri = URI.createURI(path);
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = null;
			try {
				resource = resourceSet.getResource(uri, true);
			} catch (Exception e) {
				result[0] = "File could not be read.";
				return result;						
			}
			// Next, we look into the contents of the file
			// and give some overview.
			List<EObject> contents = resource.getContents();
			if (contents != null && contents.size() > 0) {
				EObject object = contents.get(0);
				if (object instanceof PetriNetDoc) {
					PetriNetDoc document = (PetriNetDoc) object;
					List<PetriNet> nets = document.getNet();
					int no = nets.size();							
					result = new String[no + 1];
					result[0] = "The Petri Net Document contains "
						+ no + (no == 1 ? " net" : " nets:");

					no = 1;
					for (PetriNet net : nets) {
						String name = net.getName() != null ? net.getName().getText() : "unknown";
						String type = net.getType() != null ? net.getType().toString() : "unknown";
						result[no++] = "  " + name + ": " + type;
					}
				} else {
					result[0] = "The file does not contain a Petri Net Document.";
				}	
			} else {
				result[0] = "The file does not contain any element.";
			}
		}

		return result;
	}

}