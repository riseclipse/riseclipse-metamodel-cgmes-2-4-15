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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutageItemProvider extends DocumentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutageItemProvider( AdapterFactory adapterFactory ) {
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

            addCancelledDateTimePropertyDescriptor( object );
            addCausePropertyDescriptor( object );
            addIsPlannedPropertyDescriptor( object );
            addActualPeriodPropertyDescriptor( object );
            addEstimatedPeriodPropertyDescriptor( object );
            addSummaryPropertyDescriptor( object );
            addIncidentPropertyDescriptor( object );
            addSwitchingPlansPropertyDescriptor( object );
            addEquipmentsPropertyDescriptor( object );
            addUpdatedRatingsPropertyDescriptor( object );
            addOpenedSwitchesPropertyDescriptor( object );
            addFaultsPropertyDescriptor( object );
            addUsagePointsPropertyDescriptor( object );
            addOutageSchedulePropertyDescriptor( object );
            addPlannedSwitchActionsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Cancelled Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCancelledDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_cancelledDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_cancelledDateTime_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_CancelledDateTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cause feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCausePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_cause_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_cause_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Cause(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Planned feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsPlannedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_isPlanned_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_isPlanned_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_IsPlanned(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Actual Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActualPeriodPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_actualPeriod_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_actualPeriod_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_ActualPeriod(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Estimated Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEstimatedPeriodPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_estimatedPeriod_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_estimatedPeriod_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_EstimatedPeriod(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Summary feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSummaryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_summary_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_summary_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Summary(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Switching Plans feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchingPlansPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_SwitchingPlans_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_SwitchingPlans_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_SwitchingPlans(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Updated Ratings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpdatedRatingsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_UpdatedRatings_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_UpdatedRatings_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_UpdatedRatings(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Planned Switch Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlannedSwitchActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_PlannedSwitchActions_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_PlannedSwitchActions_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_PlannedSwitchActions(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Usage Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_UsagePoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_UsagePoints_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_UsagePoints(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Equipments feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEquipmentsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_Equipments_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_Equipments_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Equipments(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Incident feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncidentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_Incident_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_Incident_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Incident(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Faults feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFaultsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_Faults_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_Faults_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Faults(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Outage Schedule feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutageSchedulePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_OutageSchedule_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_OutageSchedule_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OutageSchedule(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Opened Switches feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOpenedSwitchesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Outage_OpenedSwitches_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_OpenedSwitches_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OpenedSwitches(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns Outage.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Outage" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Outage ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Outage_type" )
                : getString( "_UI_Outage_type" ) + " " + label;
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

        switch( notification.getFeatureID( Outage.class ) ) {
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
        case CimPackage.OUTAGE__CAUSE:
        case CimPackage.OUTAGE__IS_PLANNED:
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
