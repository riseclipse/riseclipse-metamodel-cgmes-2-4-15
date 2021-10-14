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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReactiveCapabilityCurve;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReactiveCapabilityCurve} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactiveCapabilityCurveItemProvider extends CurveItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReactiveCapabilityCurveItemProvider( AdapterFactory adapterFactory ) {
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

            addCoolantTemperaturePropertyDescriptor( object );
            addHydrogenPressurePropertyDescriptor( object );
            addSynchronousMachinesPropertyDescriptor( object );
            addEquivalentInjectionPropertyDescriptor( object );
            addInitiallyUsedBySynchronousMachinesPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Coolant Temperature feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoolantTemperaturePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ReactiveCapabilityCurve_coolantTemperature_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ReactiveCapabilityCurve_coolantTemperature_feature", "_UI_ReactiveCapabilityCurve_type" ),
                CimPackage.eINSTANCE.getReactiveCapabilityCurve_CoolantTemperature(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Hydrogen Pressure feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydrogenPressurePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ReactiveCapabilityCurve_hydrogenPressure_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ReactiveCapabilityCurve_hydrogenPressure_feature",
                        "_UI_ReactiveCapabilityCurve_type" ),
                CimPackage.eINSTANCE.getReactiveCapabilityCurve_HydrogenPressure(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Initially Used By Synchronous Machines feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitiallyUsedBySynchronousMachinesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines_feature",
                                "_UI_ReactiveCapabilityCurve_type" ),
                        CimPackage.eINSTANCE.getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Equivalent Injection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEquivalentInjectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ReactiveCapabilityCurve_EquivalentInjection_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ReactiveCapabilityCurve_EquivalentInjection_feature", "_UI_ReactiveCapabilityCurve_type" ),
                CimPackage.eINSTANCE.getReactiveCapabilityCurve_EquivalentInjection(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Synchronous Machines feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchronousMachinesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ReactiveCapabilityCurve_SynchronousMachines_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ReactiveCapabilityCurve_SynchronousMachines_feature", "_UI_ReactiveCapabilityCurve_type" ),
                CimPackage.eINSTANCE.getReactiveCapabilityCurve_SynchronousMachines(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This returns ReactiveCapabilityCurve.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ReactiveCapabilityCurve" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ReactiveCapabilityCurve ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ReactiveCapabilityCurve_type" )
                : getString( "_UI_ReactiveCapabilityCurve_type" ) + " " + label;
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

        switch( notification.getFeatureID( ReactiveCapabilityCurve.class ) ) {
        case CimPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
        case CimPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
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
