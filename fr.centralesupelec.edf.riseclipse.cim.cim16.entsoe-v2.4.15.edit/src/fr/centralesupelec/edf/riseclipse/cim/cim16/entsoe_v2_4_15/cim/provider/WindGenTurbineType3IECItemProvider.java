/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindGenTurbineType3IECItemProvider extends WindTurbineType3or4IECItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenTurbineType3IECItemProvider( AdapterFactory adapterFactory ) {
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

            addDipmaxPropertyDescriptor( object );
            addDiqmaxPropertyDescriptor( object );
            addWindContPitchAngleIECPropertyDescriptor( object );
            addWindAeroLinearIECPropertyDescriptor( object );
            addWindMechIECPropertyDescriptor( object );
            addWindContPType3IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dipmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDipmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindGenTurbineType3IEC_dipmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3IEC_dipmax_feature",
                        "_UI_WindGenTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindGenTurbineType3IEC_Dipmax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Diqmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiqmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindGenTurbineType3IEC_diqmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3IEC_diqmax_feature",
                        "_UI_WindGenTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindGenTurbineType3IEC_Diqmax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Aero Linear IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindAeroLinearIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindGenTurbineType3IEC_WindAeroLinearIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3IEC_WindAeroLinearIEC_feature",
                        "_UI_WindGenTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindGenTurbineType3IEC_WindAeroLinearIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Mech IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindMechIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindGenTurbineType3IEC_WindMechIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3IEC_WindMechIEC_feature",
                        "_UI_WindGenTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindGenTurbineType3IEC_WindMechIEC(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont PType3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContPType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindGenTurbineType3IEC_WindContPType3IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindGenTurbineType3IEC_WindContPType3IEC_feature",
                        "_UI_WindGenTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindGenTurbineType3IEC_WindContPType3IEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont Pitch Angle IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContPitchAngleIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindGenTurbineType3IEC_WindContPitchAngleIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindGenTurbineType3IEC_WindContPitchAngleIEC_feature", "_UI_WindGenTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindGenTurbineType3IEC_WindContPitchAngleIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns WindGenTurbineType3IEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindGenTurbineType3IEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindGenTurbineType3IEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindGenTurbineType3IEC_type" )
                : getString( "_UI_WindGenTurbineType3IEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindGenTurbineType3IEC.class ) ) {
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIPMAX:
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIQMAX:
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
