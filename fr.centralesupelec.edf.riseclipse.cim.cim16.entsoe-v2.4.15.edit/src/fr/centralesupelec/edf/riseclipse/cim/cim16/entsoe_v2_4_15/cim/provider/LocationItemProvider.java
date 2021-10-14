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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Location;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Location} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationItemProvider( AdapterFactory adapterFactory ) {
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

            addDirectionPropertyDescriptor( object );
            addGeoInfoReferencePropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addElectronicAddressPropertyDescriptor( object );
            addMainAddressPropertyDescriptor( object );
            addPhone1PropertyDescriptor( object );
            addPhone2PropertyDescriptor( object );
            addSecondaryAddressPropertyDescriptor( object );
            addStatusPropertyDescriptor( object );
            addConfigurationEventsPropertyDescriptor( object );
            addHazardsPropertyDescriptor( object );
            addMeasurementsPropertyDescriptor( object );
            addPositionPointsPropertyDescriptor( object );
            addPowerSystemResourcesPropertyDescriptor( object );
            addAssetsPropertyDescriptor( object );
            addCoordinateSystemPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Direction feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_direction_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_direction_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Direction(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Geo Info Reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeoInfoReferencePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_geoInfoReference_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_geoInfoReference_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_GeoInfoReference(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_Location_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_type_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Type(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_Location_electronicAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_electronicAddress_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_ElectronicAddress(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Main Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMainAddressPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_mainAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_mainAddress_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_MainAddress(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phone1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhone1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_phone1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_phone1_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Phone1(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phone2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhone2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_phone2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_phone2_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Phone2(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Secondary Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecondaryAddressPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_secondaryAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_secondaryAddress_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_SecondaryAddress(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_Location_status_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_status_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Status(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_Location_ConfigurationEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_ConfigurationEvents_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_ConfigurationEvents(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Hazards feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHazardsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_Hazards_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_Hazards_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Hazards(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_Location_Measurements_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_Measurements_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Measurements(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Coordinate System feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoordinateSystemPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_CoordinateSystem_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_CoordinateSystem_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_CoordinateSystem(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Assets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_Assets_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_Assets_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Assets(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Position Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPositionPointsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Location_PositionPoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_PositionPoints_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_PositionPoints(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_Location_PowerSystemResources_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_PowerSystemResources_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_PowerSystemResources(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns Location.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Location" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Location ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Location_type" )
                : getString( "_UI_Location_type" ) + " " + label;
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

        switch( notification.getFeatureID( Location.class ) ) {
        case CimPackage.LOCATION__DIRECTION:
        case CimPackage.LOCATION__GEO_INFO_REFERENCE:
        case CimPackage.LOCATION__TYPE:
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
