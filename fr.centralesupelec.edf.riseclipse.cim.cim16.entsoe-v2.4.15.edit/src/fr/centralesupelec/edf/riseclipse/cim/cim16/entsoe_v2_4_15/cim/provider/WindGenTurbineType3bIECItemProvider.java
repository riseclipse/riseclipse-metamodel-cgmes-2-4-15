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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3bIEC;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3bIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindGenTurbineType3bIECItemProvider extends WindGenTurbineType3IECItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenTurbineType3bIECItemProvider( AdapterFactory adapterFactory ) {
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

            addFducwPropertyDescriptor( object );
            addMwtcwpPropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addTwoPropertyDescriptor( object );
            addXsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fducw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFducwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindGenTurbineType3bIEC_fducw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3bIEC_fducw_feature",
                                "_UI_WindGenTurbineType3bIEC_type" ),
                        CimPackage.eINSTANCE.getWindGenTurbineType3bIEC_Fducw(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mwtcwp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwtcwpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindGenTurbineType3bIEC_mwtcwp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3bIEC_mwtcwp_feature",
                                "_UI_WindGenTurbineType3bIEC_type" ),
                        CimPackage.eINSTANCE.getWindGenTurbineType3bIEC_Mwtcwp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindGenTurbineType3bIEC_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3bIEC_tg_feature",
                                "_UI_WindGenTurbineType3bIEC_type" ),
                        CimPackage.eINSTANCE.getWindGenTurbineType3bIEC_Tg(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Two feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindGenTurbineType3bIEC_two_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3bIEC_two_feature",
                                "_UI_WindGenTurbineType3bIEC_type" ),
                        CimPackage.eINSTANCE.getWindGenTurbineType3bIEC_Two(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Xs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindGenTurbineType3bIEC_xs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3bIEC_xs_feature",
                                "_UI_WindGenTurbineType3bIEC_type" ),
                        CimPackage.eINSTANCE.getWindGenTurbineType3bIEC_Xs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns WindGenTurbineType3bIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindGenTurbineType3bIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindGenTurbineType3bIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindGenTurbineType3bIEC_type" )
                : getString( "_UI_WindGenTurbineType3bIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindGenTurbineType3bIEC.class ) ) {
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__FDUCW:
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__MWTCWP:
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TG:
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TWO:
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__XS:
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
