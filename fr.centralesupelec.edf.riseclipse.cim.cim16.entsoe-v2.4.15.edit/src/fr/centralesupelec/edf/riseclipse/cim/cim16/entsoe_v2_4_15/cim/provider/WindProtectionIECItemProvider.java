/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindProtectionIEC;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindProtectionIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindProtectionIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindProtectionIECItemProvider( AdapterFactory adapterFactory ) {
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

            addFoverPropertyDescriptor( object );
            addFunderPropertyDescriptor( object );
            addTfoverPropertyDescriptor( object );
            addTfunderPropertyDescriptor( object );
            addTuoverPropertyDescriptor( object );
            addTuunderPropertyDescriptor( object );
            addUoverPropertyDescriptor( object );
            addUunderPropertyDescriptor( object );
            addWindTurbineType1or2IECPropertyDescriptor( object );
            addWindTurbineType3or4IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fover feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFoverPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_fover_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_fover_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Fover(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Funder feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFunderPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_funder_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_funder_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Funder(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tfover feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfoverPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_tfover_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_tfover_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Tfover(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tfunder feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfunderPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_tfunder_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_tfunder_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Tfunder(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tuover feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuoverPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_tuover_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_tuover_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Tuover(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tuunder feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuunderPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_tuunder_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_tuunder_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Tuunder(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Uover feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUoverPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_uover_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_uover_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Uover(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Uunder feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUunderPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_uunder_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_uunder_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Uunder(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3or4 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3or4IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_WindTurbineType3or4IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindProtectionIEC_WindTurbineType3or4IEC_feature", "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_WindTurbineType3or4IEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type1or2 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType1or2IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindProtectionIEC_WindTurbineType1or2IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindProtectionIEC_WindTurbineType1or2IEC_feature", "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_WindTurbineType1or2IEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns WindProtectionIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindProtectionIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindProtectionIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindProtectionIEC_type" )
                : getString( "_UI_WindProtectionIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindProtectionIEC.class ) ) {
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
        case CimPackage.WIND_PROTECTION_IEC__TFOVER:
        case CimPackage.WIND_PROTECTION_IEC__TFUNDER:
        case CimPackage.WIND_PROTECTION_IEC__TUOVER:
        case CimPackage.WIND_PROTECTION_IEC__TUUNDER:
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
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
