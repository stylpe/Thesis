/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.cpntools.pragma.epnk.pnktypes.cpndefinition.provider;


import java.util.Collection;
import java.util.List;

import org.cpntools.pragma.epnk.pnktypes.cpndefinition.CpndefinitionPackage;
import org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * This is the item provider adapter for a {@link org.cpntools.pragma.epnk.pnktypes.cpndefinition.Place} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaceItemProvider
	extends org.pnml.tools.epnk.pnmlcoremodel.provider.PlaceItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInitialMarkingPropertyDescriptor(object);
			addColorsetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial Marking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialMarkingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Place_InitialMarking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Place_InitialMarking_feature", "_UI_Place_type"),
				 CpndefinitionPackage.Literals.PLACE__INITIAL_MARKING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Colorset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Place_Colorset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Place_Colorset_feature", "_UI_Place_type"),
				 CpndefinitionPackage.Literals.PLACE__COLORSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Place.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Place"));
	}

	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Place p = (Place) object;
		Name name = p.getName();
		if (name != null) {
			String text = name.getText();
			if (text != null && text.length() > 0) {
				return getString("_UI_Place_type") + " " + name.getText();
			}
		}
		String label = p.getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Place_type") :
			getString("_UI_Place_type") + " id: " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		
		if(notification.getFeatureID(Name.class) == PnmlcoremodelPackage.NAME__TEXT) { // Name text has changed
			fireNotifyChanged(new ViewerNotification(notification, ((Name)notification.getNotifier()).eContainer(), false, true));
			return;
		} else {
			switch (notification.getFeatureID(Place.class)) {
				case CpndefinitionPackage.PLACE__INITIAL_MARKING:
				case CpndefinitionPackage.PLACE__COLORSET:
					fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
					return;
				case CpndefinitionPackage.PLACE__NAME: // Name added or removed
					fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
					Name oldName = (Name) notification.getOldValue();
					Name newName = (Name) notification.getNewValue();
					if(oldName != null) oldName.eAdapters().remove(this); // Unregister
					if(newName != null) newName.eAdapters().add(this); // Register for change notifications
			}
		}
		super.notifyChanged(notification);
	}
	
	
	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CPNDefinitionEditPlugin.INSTANCE;
	}

}
