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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeterReadingItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeterReadingItemProvider( AdapterFactory adapterFactory ) {
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

            addIsCoincidentTriggerPropertyDescriptor( object );
            addValuesIntervalPropertyDescriptor( object );
            addMeterPropertyDescriptor( object );
            addUsagePointPropertyDescriptor( object );
            addIntervalBlocksPropertyDescriptor( object );
            addReadingsPropertyDescriptor( object );
            addEndDeviceEventsPropertyDescriptor( object );
            addCustomerAgreementPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Coincident Trigger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsCoincidentTriggerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_isCoincidentTrigger_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_isCoincidentTrigger_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_IsCoincidentTrigger(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Values Interval feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuesIntervalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_valuesInterval_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_valuesInterval_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_ValuesInterval(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Readings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadingsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_Readings_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_Readings_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_Readings(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_EndDeviceEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_EndDeviceEvents_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_EndDeviceEvents(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Usage Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_UsagePoint_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_UsagePoint_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_UsagePoint(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Meter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeterPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_Meter_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_Meter_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_Meter(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Interval Blocks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntervalBlocksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_IntervalBlocks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_IntervalBlocks_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_IntervalBlocks(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer Agreement feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAgreementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_CustomerAgreement_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_CustomerAgreement_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_CustomerAgreement(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns MeterReading.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/MeterReading" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( MeterReading ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_MeterReading_type" )
                : getString( "_UI_MeterReading_type" ) + " " + label;
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

        switch( notification.getFeatureID( MeterReading.class ) ) {
        case CimPackage.METER_READING__IS_COINCIDENT_TRIGGER:
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
