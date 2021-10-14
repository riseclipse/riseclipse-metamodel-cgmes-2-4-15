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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindAeroLinearIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindAeroLinearIECItemProvider( AdapterFactory adapterFactory ) {
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

            addDpomegaPropertyDescriptor( object );
            addDpthetaPropertyDescriptor( object );
            addOmegazeroPropertyDescriptor( object );
            addPavailPropertyDescriptor( object );
            addThetazeroPropertyDescriptor( object );
            addWindGenTurbineType3IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dpomega feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpomegaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroLinearIEC_dpomega_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroLinearIEC_dpomega_feature",
                                "_UI_WindAeroLinearIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroLinearIEC_Dpomega(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dptheta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpthetaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroLinearIEC_dptheta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroLinearIEC_dptheta_feature",
                                "_UI_WindAeroLinearIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroLinearIEC_Dptheta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Omegazero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmegazeroPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroLinearIEC_omegazero_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroLinearIEC_omegazero_feature",
                                "_UI_WindAeroLinearIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroLinearIEC_Omegazero(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pavail feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPavailPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroLinearIEC_pavail_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroLinearIEC_pavail_feature",
                                "_UI_WindAeroLinearIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroLinearIEC_Pavail(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Thetazero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetazeroPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroLinearIEC_thetazero_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroLinearIEC_thetazero_feature",
                                "_UI_WindAeroLinearIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroLinearIEC_Thetazero(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Gen Turbine Type3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindGenTurbineType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroLinearIEC_WindGenTurbineType3IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindAeroLinearIEC_WindGenTurbineType3IEC_feature", "_UI_WindAeroLinearIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroLinearIEC_WindGenTurbineType3IEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns WindAeroLinearIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindAeroLinearIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindAeroLinearIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindAeroLinearIEC_type" )
                : getString( "_UI_WindAeroLinearIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindAeroLinearIEC.class ) ) {
        case CimPackage.WIND_AERO_LINEAR_IEC__DPOMEGA:
        case CimPackage.WIND_AERO_LINEAR_IEC__DPTHETA:
        case CimPackage.WIND_AERO_LINEAR_IEC__OMEGAZERO:
        case CimPackage.WIND_AERO_LINEAR_IEC__PAVAIL:
        case CimPackage.WIND_AERO_LINEAR_IEC__THETAZERO:
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
