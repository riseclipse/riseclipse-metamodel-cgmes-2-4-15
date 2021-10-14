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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerAgreementItemProvider extends AgreementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomerAgreementItemProvider( AdapterFactory adapterFactory ) {
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

            addLoadMgmtPropertyDescriptor( object );
            addServiceLocationsPropertyDescriptor( object );
            addPricingStructuresPropertyDescriptor( object );
            addAuxiliaryAgreementsPropertyDescriptor( object );
            addServiceSupplierPropertyDescriptor( object );
            addCustomerPropertyDescriptor( object );
            addMeterReadingsPropertyDescriptor( object );
            addServiceCategoryPropertyDescriptor( object );
            addUsagePointsPropertyDescriptor( object );
            addCustomerAccountPropertyDescriptor( object );
            addDemandResponseProgramsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Load Mgmt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoadMgmtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_loadMgmt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CustomerAgreement_loadMgmt_feature",
                                "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_LoadMgmt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Supplier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceSupplierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_ServiceSupplier_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CustomerAgreement_ServiceSupplier_feature", "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_ServiceSupplier(),
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
                        getString( "_UI_CustomerAgreement_UsagePoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CustomerAgreement_UsagePoints_feature",
                                "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_UsagePoints(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Auxiliary Agreements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxiliaryAgreementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_AuxiliaryAgreements_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CustomerAgreement_AuxiliaryAgreements_feature", "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_AuxiliaryAgreements(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Demand Response Programs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDemandResponseProgramsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_DemandResponsePrograms_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CustomerAgreement_DemandResponsePrograms_feature", "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_DemandResponsePrograms(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Customer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_Customer_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CustomerAgreement_Customer_feature",
                                "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_Customer(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pricing Structures feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPricingStructuresPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_PricingStructures_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CustomerAgreement_PricingStructures_feature", "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_PricingStructures(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Meter Readings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeterReadingsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_MeterReadings_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CustomerAgreement_MeterReadings_feature",
                                "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_MeterReadings(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Customer Account feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAccountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_CustomerAccount_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CustomerAgreement_CustomerAccount_feature", "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_CustomerAccount(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Locations feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceLocationsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_ServiceLocations_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CustomerAgreement_ServiceLocations_feature", "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_ServiceLocations(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Service Category feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceCategoryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CustomerAgreement_ServiceCategory_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CustomerAgreement_ServiceCategory_feature", "_UI_CustomerAgreement_type" ),
                        CimPackage.eINSTANCE.getCustomerAgreement_ServiceCategory(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns CustomerAgreement.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/CustomerAgreement" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( CustomerAgreement ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_CustomerAgreement_type" )
                : getString( "_UI_CustomerAgreement_type" ) + " " + label;
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

        switch( notification.getFeatureID( CustomerAgreement.class ) ) {
        case CimPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
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
