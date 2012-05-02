/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.pragmacpndefinition.provider;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.provider.CPNDefinitionEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.AbstractContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.services.IServiceLocator;
import org.pnml.tools.epnk.pnmlcoremodel.provider.PNMLCoreModelEditPlugin;

/**
 * This is the central singleton for the PragmaCPNDefinition edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PragmaCPNDefinitionEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PragmaCPNDefinitionEditPlugin INSTANCE = new PragmaCPNDefinitionEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmaCPNDefinitionEditPlugin() {
		super
		  (new ResourceLocator [] {
		     CPNDefinitionEditPlugin.INSTANCE,
		     PNMLCoreModelEditPlugin.INSTANCE,
		   });
//
//		IMenuService menuService = (IMenuService) PlatformUI.getWorkbench()
//	            .getService(IMenuService.class);
//		AbstractContributionFactory viewMenuAddition = new AbstractContributionFactory(
//	            "menu:org.eclipse.ui.views.ProblemView?after=additions", null) {
//
//					@Override
//					public void createContributionItems(
//							IServiceLocator serviceLocator,
//							IContributionRoot additions) {
//						// TODO Auto-generated method stub
//						
//					}
//			
//		}
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
