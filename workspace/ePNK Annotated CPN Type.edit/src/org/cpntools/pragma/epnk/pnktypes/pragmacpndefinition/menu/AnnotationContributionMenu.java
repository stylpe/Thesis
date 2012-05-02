package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.OntologyMember;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PetriNet;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.Pragma;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionFactory;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmacpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.PragmaticsOntology;
import org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.util.PragmacpndefinitionTools;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.SubMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.internal.actions.CommandAction;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.services.IServiceLocator;
import org.semanticweb.owlapi.model.OWLClass;


	
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
		Set<OWLClass> pragmas = ontology.getValidPragmatics(member);
		return createMenuItems(pragmas, getSelection());
	}

	private IContributionItem[] createMenuItems(Set<OWLClass> pragmas, IStructuredSelection selection) {
		List<IContributionItem> items = new ArrayList<IContributionItem>();
		CommandContributionItemParameter param = new CommandContributionItemParameter(getServiceLocator(), null, 
				"ePNK Annotated CPN Type.edit.command1", CommandContributionItem.STYLE_PUSH);
		for(OWLClass pragma : pragmas) {
			Pragma p = PragmacpndefinitionFactory.eINSTANCE.createPragma();
			p.setText(pragma.toString());
			
			Command com = AddCommand.create(domain, selection.getFirstElement(), 
					PragmacpndefinitionPackage.ONTOLOGY_MEMBER__ANNOTATION, p);
			param.label = "<<"+pragma.toString()+">>";
			CommandContributionItem item = new CommandContributionItem(param);
			items.add(item);
		}
		return items.toArray(new IContributionItem[items.size()]);
	}

	private static String getCurrentEditorID() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorSite().getId();
	}

	private static IServiceLocator getServiceLocator() {
		return getWorkbench();
	}

	private static IWorkbenchWindow getWorkbench() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	}
	   
	private static IHandlerService getHandlerService() {
		return (IHandlerService) getServiceLocator().getService(IHandlerService.class);
	}
	
	private static ICommandService getCommandService() {
		return (ICommandService)getServiceLocator().getService(ICommandService.class);
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
	
}
