package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.menu;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.CausesInconcistencyException;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.internal.menus.DynamicMenuContributionItem;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLException;

import com.clarkparsia.owlapi.explanation.io.manchester.ManchesterSyntaxExplanationRenderer;


	
public class AnnotationContributionMenu extends CompoundContributionItem {
//	 
//	public AnnotationContributionMenu() {
//	}
// 
//	public AnnotationContributionMenu(String id) {
//		super(id);
//	}
// 
//	@Override
//	public void fill(Menu menu, int index) {
//		//Here you could get selection and decide what to do
//		//You can also simply return if you do not want to show a menu
//		
//		//create the menu item
//		MenuItem menuItem = new MenuItem(menu, SWT.CHECK, index);
//		menuItem.setText("My menu item (" + new Date() + ")");
//		menuItem.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {
//				//what to do when menu is subsequently selected.
//				System.err.println("Dynamic menu selected");
//			}
//		});
//	}
	
	private TransactionalEditingDomain domain;
	
	protected IContributionItem[] getContributionItems() {
		OntologyMember member = getSelectedItem();
		domain = TransactionUtil.getEditingDomain(member);
		PragmaticsOntology ontology = resolveOntology(member);
		if(ontology == null) 
			return createDisabledMenu("Missing PragmaticsOntology");
		
		Set<OWLClass> pragmas;
		try {
			pragmas = ontology.getValidPragmatics(member);
		} catch (CausesInconcistencyException e) {
			IContributionItem[] item = {new ActionContributionItem(
					new ShowInconsistencyErrorAction(e.getSet(), getWorkbench().getShell())
					)};
			return item;
		}
		if(!pragmas.isEmpty()) {
			List<IContributionItem> items = new ArrayList<IContributionItem>();
			for(OWLClass pragma : pragmas) {
				items.add(new ActionContributionItem(AddPragmaAction.create(domain, getSelection(), 
						pragma.getIRI().toString())));
			}
			return items.toArray(new IContributionItem[items.size()]);
		}
		return createDisabledMenu("No applicable pragmatics");
	}
	
	IContributionItem[] createDisabledMenu(String text) {
		return new IContributionItem[]{ new ActionContributionItem(
			new Action(text) {
				@Override
				public boolean isEnabled() {
					return false;
				}
			})
		};
	}

	private static IWorkbenchWindow getWorkbench() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	}
	  
	private PragmaticsOntology resolveOntology(EObject ob) {
		while((ob != null) && !(ob instanceof PetriNet)) {
			ob = ob.eContainer();
		}
		PragmaticsOntology po = null;
		if(ob != null) po = ((PetriNet)ob).getOntology();
		return po;
	}
	private IStructuredSelection getSelection() {
		return (IStructuredSelection) getWorkbench().getSelectionService().getSelection();
	}
	private OntologyMember getSelectedItem() {
		return (OntologyMember) getSelection().getFirstElement();
	}
	
	private static class AddPragmaAction extends CreateChildAction {
		private AddPragmaAction(EditingDomain editingDomain,
				ISelection selection, Object descriptor) {
			super(editingDomain, selection, descriptor);
		}

		public static AddPragmaAction create(EditingDomain editingDomain,
				IStructuredSelection selection, String pragmaIRI) {
			Pragma p = PragmacpndefinitionFactory.eINSTANCE.createPragma();
			p.setIri(pragmaIRI);
			CommandParameter desc = new CommandParameter(selection.getFirstElement(), PragmacpndefinitionPackage.Literals.ONTOLOGY_MEMBER__ANNOTATION, p);
			AddPragmaAction action = new AddPragmaAction(editingDomain, selection, desc);
			action.setText(pragmaIRI);
			return action;
		}
	}
	
	private static class ShowInconsistencyErrorAction extends Action {

		private Set<Set<OWLAxiom>> set;
		private Shell shell;

		public ShowInconsistencyErrorAction(Set<Set<OWLAxiom>> set, Shell shell) {
			this.set = set;
			this.shell = shell;
			setText("Inconsistency (click for explanation)");
		}
		
		@Override
		public void run() {
			StringBuilder msgBuilder = new StringBuilder();
			msgBuilder.append("Adding a pragmatic here would cause the ontology to become inconsistent.\n");
			if(set == null) {
				msgBuilder.append("Explanation unavailable.");
			} else {
				msgBuilder.append("Explanation(s):\n\n");
				
				ManchesterSyntaxExplanationRenderer renderer = new
						ManchesterSyntaxExplanationRenderer();
				StringWriter explanation = new StringWriter();
				renderer.startRendering(explanation);
				try {
					renderer.render(set);
					renderer.endRendering();
					msgBuilder.append(explanation.getBuffer());
				} catch (Exception e) {
					msgBuilder.append("Problem generating explanation: \n");
					msgBuilder.append(e);
				} 
			}
			
			MessageDialog.openError(shell, "Inconsistent Ontology Detected", msgBuilder.toString());
		}
	}
	
}
