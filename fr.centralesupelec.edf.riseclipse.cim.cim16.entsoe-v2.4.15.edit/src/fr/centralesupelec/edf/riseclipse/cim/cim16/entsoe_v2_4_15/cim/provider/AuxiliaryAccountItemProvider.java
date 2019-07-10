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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AuxiliaryAccount;
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
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AuxiliaryAccount} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AuxiliaryAccountItemProvider extends DocumentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuxiliaryAccountItemProvider( AdapterFactory adapterFactory ) {
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

            addBalancePropertyDescriptor( object );
            addPrincipleAmountPropertyDescriptor( object );
            addDuePropertyDescriptor( object );
            addLastCreditPropertyDescriptor( object );
            addLastDebitPropertyDescriptor( object );
            addChargesPropertyDescriptor( object );
            addAuxiliaryAgreementPropertyDescriptor( object );
            addPaymentTransactionsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Balance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBalancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAccount_balance_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_balance_feature",
                                "_UI_AuxiliaryAccount_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAccount_Balance(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Principle Amount feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrincipleAmountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAccount_principleAmount_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_principleAmount_feature",
                        "_UI_AuxiliaryAccount_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAccount_PrincipleAmount(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Due feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAccount_due_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_due_feature",
                                "_UI_AuxiliaryAccount_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAccount_Due(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Last Credit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastCreditPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAccount_lastCredit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_lastCredit_feature",
                                "_UI_AuxiliaryAccount_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAccount_LastCredit(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Last Debit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastDebitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAccount_lastDebit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_lastDebit_feature",
                                "_UI_AuxiliaryAccount_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAccount_LastDebit(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Auxiliary Agreement feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxiliaryAgreementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAccount_AuxiliaryAgreement_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_AuxiliaryAgreement_feature",
                        "_UI_AuxiliaryAccount_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAccount_AuxiliaryAgreement(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Charges feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChargesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAccount_Charges_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_Charges_feature",
                                "_UI_AuxiliaryAccount_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAccount_Charges(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Payment Transactions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPaymentTransactionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAccount_PaymentTransactions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAccount_PaymentTransactions_feature",
                        "_UI_AuxiliaryAccount_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAccount_PaymentTransactions(), true, false, true, null, null, null ) );
    }

    /**
     * This returns AuxiliaryAccount.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AuxiliaryAccount" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AuxiliaryAccount ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AuxiliaryAccount_type" )
                : getString( "_UI_AuxiliaryAccount_type" ) + " " + label;
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

        switch( notification.getFeatureID( AuxiliaryAccount.class ) ) {
        case CimPackage.AUXILIARY_ACCOUNT__BALANCE:
        case CimPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
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
