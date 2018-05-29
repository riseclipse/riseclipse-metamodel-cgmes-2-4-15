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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Charge;
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
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Charge} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChargeItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChargeItemProvider( AdapterFactory adapterFactory ) {
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

            addKindPropertyDescriptor( object );
            addVariablePortionPropertyDescriptor( object );
            addFixedPortionPropertyDescriptor( object );
            addChildChargesPropertyDescriptor( object );
            addParentChargePropertyDescriptor( object );
            addTimeTariffIntervalsPropertyDescriptor( object );
            addConsumptionTariffIntervalsPropertyDescriptor( object );
            addAuxiliaryAccountsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Charge_kind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Charge_kind_feature", "_UI_Charge_type" ),
                        CimPackage.eINSTANCE.getCharge_Kind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Variable Portion feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVariablePortionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Charge_variablePortion_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Charge_variablePortion_feature",
                                "_UI_Charge_type" ),
                        CimPackage.eINSTANCE.getCharge_VariablePortion(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fixed Portion feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFixedPortionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Charge_fixedPortion_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Charge_fixedPortion_feature",
                                "_UI_Charge_type" ),
                        CimPackage.eINSTANCE.getCharge_FixedPortion(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Consumption Tariff Intervals feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumptionTariffIntervalsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_Charge_ConsumptionTariffIntervals_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_Charge_ConsumptionTariffIntervals_feature",
                        "_UI_Charge_type" ),
                CimPackage.eINSTANCE.getCharge_ConsumptionTariffIntervals(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Auxiliary Accounts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxiliaryAccountsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Charge_AuxiliaryAccounts_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Charge_AuxiliaryAccounts_feature",
                                "_UI_Charge_type" ),
                        CimPackage.eINSTANCE.getCharge_AuxiliaryAccounts(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Time Tariff Intervals feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeTariffIntervalsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Charge_TimeTariffIntervals_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Charge_TimeTariffIntervals_feature",
                                "_UI_Charge_type" ),
                        CimPackage.eINSTANCE.getCharge_TimeTariffIntervals(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Parent Charge feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParentChargePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Charge_ParentCharge_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Charge_ParentCharge_feature",
                                "_UI_Charge_type" ),
                        CimPackage.eINSTANCE.getCharge_ParentCharge(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Child Charges feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChildChargesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Charge_ChildCharges_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Charge_ChildCharges_feature",
                                "_UI_Charge_type" ),
                        CimPackage.eINSTANCE.getCharge_ChildCharges(), true, false, true, null, null, null ) );
    }

    /**
     * This returns Charge.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Charge" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Charge ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Charge_type" )
                : getString( "_UI_Charge_type" ) + " " + label;
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

        switch( notification.getFeatureID( Charge.class ) ) {
        case CimPackage.CHARGE__KIND:
        case CimPackage.CHARGE__VARIABLE_PORTION:
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
