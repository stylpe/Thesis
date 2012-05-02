package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.menu;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class AnnotateAction implements IObjectActionDelegate {


	private OntologyMember member;
	private Shell shell;

	@Override
	public void run(IAction action) {
		PetriNet petriNet = getPetriNet(member);
		petriNet.getOntology().getValidPragmatics(member);
	}

	private PetriNet getPetriNet(EObject ob) {
		while((ob != null) && !(ob instanceof PetriNet)){
			ob = ob.eContainer();
		}
		return (PetriNet) ob;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		member = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof OntologyMember) {
				member = (OntologyMember) structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(member != null);
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getWorkbenchWindow().getShell();
		//action.getMenuCreator().getMenu(targetPart.)
	}

}
