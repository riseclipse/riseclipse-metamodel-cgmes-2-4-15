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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Register;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Register} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegisterItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegisterItemProvider( AdapterFactory adapterFactory ) {
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

            addIsVirtualPropertyDescriptor( object );
            addLeftDigitCountPropertyDescriptor( object );
            addRightDigitCountPropertyDescriptor( object );
            addTouTierNamePropertyDescriptor( object );
            addTouTierPropertyDescriptor( object );
            addChannelsPropertyDescriptor( object );
            addEndDeviceFunctionPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Virtual feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsVirtualPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Register_isVirtual_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Register_isVirtual_feature",
                                "_UI_Register_type" ),
                        CimPackage.eINSTANCE.getRegister_IsVirtual(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Left Digit Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLeftDigitCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Register_leftDigitCount_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Register_leftDigitCount_feature",
                                "_UI_Register_type" ),
                        CimPackage.eINSTANCE.getRegister_LeftDigitCount(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Right Digit Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRightDigitCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Register_rightDigitCount_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Register_rightDigitCount_feature",
                                "_UI_Register_type" ),
                        CimPackage.eINSTANCE.getRegister_RightDigitCount(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tou Tier Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTouTierNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Register_touTierName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Register_touTierName_feature",
                                "_UI_Register_type" ),
                        CimPackage.eINSTANCE.getRegister_TouTierName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tou Tier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTouTierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Register_touTier_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Register_touTier_feature",
                                "_UI_Register_type" ),
                        CimPackage.eINSTANCE.getRegister_TouTier(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the End Device Function feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceFunctionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Register_EndDeviceFunction_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Register_EndDeviceFunction_feature",
                                "_UI_Register_type" ),
                        CimPackage.eINSTANCE.getRegister_EndDeviceFunction(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Channels feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChannelsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Register_Channels_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Register_Channels_feature",
                                "_UI_Register_type" ),
                        CimPackage.eINSTANCE.getRegister_Channels(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns Register.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Register" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Register ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Register_type" )
                : getString( "_UI_Register_type" ) + " " + label;
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

        switch( notification.getFeatureID( Register.class ) ) {
        case CimPackage.REGISTER__IS_VIRTUAL:
        case CimPackage.REGISTER__LEFT_DIGIT_COUNT:
        case CimPackage.REGISTER__RIGHT_DIGIT_COUNT:
        case CimPackage.REGISTER__TOU_TIER_NAME:
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
