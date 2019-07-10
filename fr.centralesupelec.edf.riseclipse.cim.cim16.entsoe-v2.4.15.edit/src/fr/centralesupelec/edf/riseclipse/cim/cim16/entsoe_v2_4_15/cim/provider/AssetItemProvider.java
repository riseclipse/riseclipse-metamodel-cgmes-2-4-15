/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssetItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addCriticalPropertyDescriptor( object );
            addInitialConditionPropertyDescriptor( object );
            addInitialLossOfLifePropertyDescriptor( object );
            addLotNumberPropertyDescriptor( object );
            addPurchasePricePropertyDescriptor( object );
            addSerialNumberPropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addUtcNumberPropertyDescriptor( object );
            addAcceptanceTestPropertyDescriptor( object );
            addElectronicAddressPropertyDescriptor( object );
            addLifecyclePropertyDescriptor( object );
            addStatusPropertyDescriptor( object );
            addProceduresPropertyDescriptor( object );
            addWorkTasksPropertyDescriptor( object );
            addPowerSystemResourcesPropertyDescriptor( object );
            addActivityRecordsPropertyDescriptor( object );
            addConfigurationEventsPropertyDescriptor( object );
            addOperationTagsPropertyDescriptor( object );
            addAssetContainerPropertyDescriptor( object );
            addMeasurementsPropertyDescriptor( object );
            addScheduledEventsPropertyDescriptor( object );
            addOrganisationRolesPropertyDescriptor( object );
            addLocationPropertyDescriptor( object );
            addOwnershipsPropertyDescriptor( object );
            addReplacementWorkTasksPropertyDescriptor( object );
            addAssetInfoPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Critical feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCriticalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_critical_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_critical_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Critical(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Initial Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialConditionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_initialCondition_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_initialCondition_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_InitialCondition(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Initial Loss Of Life feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialLossOfLifePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_initialLossOfLife_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_initialLossOfLife_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_InitialLossOfLife(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lot Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLotNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_lotNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_lotNumber_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_LotNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Purchase Price feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPurchasePricePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_purchasePrice_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_purchasePrice_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_PurchasePrice(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Serial Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSerialNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_serialNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_serialNumber_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_SerialNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_type_feature", "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Type(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Utc Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUtcNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_utcNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_utcNumber_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_UtcNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Acceptance Test feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAcceptanceTestPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_acceptanceTest_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_acceptanceTest_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AcceptanceTest(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Electronic Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addElectronicAddressPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_electronicAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_electronicAddress_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ElectronicAddress(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lifecycle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLifecyclePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_lifecycle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_lifecycle_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Lifecycle(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatusPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_status_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_status_feature", "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Status(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Measurements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_Measurements_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Measurements_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Measurements(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Organisation Roles feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOrganisationRolesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_OrganisationRoles_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_OrganisationRoles_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_OrganisationRoles(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Configuration Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigurationEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_ConfigurationEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ConfigurationEvents_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ConfigurationEvents(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset Container feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetContainerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_AssetContainer_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_AssetContainer_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AssetContainer(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Scheduled Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScheduledEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_ScheduledEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ScheduledEvents_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ScheduledEvents(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operation Tags feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationTagsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_OperationTags_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_OperationTags_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_OperationTags(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Work Tasks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWorkTasksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_WorkTasks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_WorkTasks_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_WorkTasks(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetInfoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_AssetInfo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_AssetInfo_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AssetInfo(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Procedures feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProceduresPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_Procedures_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Procedures_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Procedures(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_Location_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Location_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Location(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power System Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerSystemResourcesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_PowerSystemResources_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_PowerSystemResources_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_PowerSystemResources(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Activity Records feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActivityRecordsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_ActivityRecords_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ActivityRecords_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ActivityRecords(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ownerships feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOwnershipsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_Ownerships_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Ownerships_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Ownerships(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Replacement Work Tasks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReplacementWorkTasksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Asset_ReplacementWorkTasks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ReplacementWorkTasks_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ReplacementWorkTasks(), true, false, true, null, null, null ) );
    }

    /**
     * This returns Asset.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Asset" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Asset ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Asset_type" )
                : getString( "_UI_Asset_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( Asset.class ) ) {
        case CimPackage.ASSET__CRITICAL:
        case CimPackage.ASSET__INITIAL_CONDITION:
        case CimPackage.ASSET__INITIAL_LOSS_OF_LIFE:
        case CimPackage.ASSET__LOT_NUMBER:
        case CimPackage.ASSET__PURCHASE_PRICE:
        case CimPackage.ASSET__SERIAL_NUMBER:
        case CimPackage.ASSET__TYPE:
        case CimPackage.ASSET__UTC_NUMBER:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
