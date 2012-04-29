package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.actions;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaCPN;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class AddOntologyAction implements IObjectActionDelegate {

	private PragmaCPN typedef;

	@Override
	public void run(IAction action) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				shell, new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setTitle("Select an Ontology");
		dialog.setMessage("Select the Ontology document you want to include in the net:");
		
		dialog.setInput(getProject(typedef));
		dialog.open();

		if (dialog.getReturnCode() == Window.OK) {
			Object o = dialog.getFirstResult();
			if (o instanceof IFile) {
				IFile f = (IFile) o;
				typedef.includeOntologyFromFile(f);
			} else {
				IStatus status = new Status(IStatus.ERROR, "PragmaCPN", 0,
						"Invalid file", null);
				ErrorDialog.openError(shell, "Invalid file",
						"The selected file was not valid.", status);
			}
		}
	}
	
	private IProject getProject(EObject obj) {
		URI uri = obj.eResource().getURI();
		String fileString = uri.toPlatformString(true);
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(fileString)).getProject();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		typedef = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof PragmaCPN) {
				typedef = (PragmaCPN) structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(typedef != null);
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// Do nothing

	}

}
