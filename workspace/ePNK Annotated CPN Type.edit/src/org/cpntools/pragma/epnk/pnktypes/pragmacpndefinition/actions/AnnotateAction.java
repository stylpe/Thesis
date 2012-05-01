package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.actions;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Place;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class AnnotateAction implements IObjectActionDelegate {


	private Place place;
	private Shell shell;

	@Override
	public void run(IAction action) {
		PetriNet petriNet = getPetriNet(place);
		petriNet.getOntology().getValidPragmatics(place);
	}

	private PetriNet getPetriNet(Place place) {
		EObject ob = place;
		while((ob != null) && !(ob instanceof PetriNet)){
			ob = ob.eContainer();
		}
		return (PetriNet) ob;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		place = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof Place) {
				place = (Place) structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(place != null);
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getWorkbenchWindow().getShell();
	}

}
