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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindPlantReactiveControlIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPlantReactiveControlIECItemProvider( AdapterFactory adapterFactory ) {
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

            addKiwpxPropertyDescriptor( object );
            addKpwpxPropertyDescriptor( object );
            addKwpquPropertyDescriptor( object );
            addMwppfPropertyDescriptor( object );
            addMwpuPropertyDescriptor( object );
            addTwppfiltPropertyDescriptor( object );
            addTwpqfiltPropertyDescriptor( object );
            addTwpufiltPropertyDescriptor( object );
            addTxftPropertyDescriptor( object );
            addTxfvPropertyDescriptor( object );
            addUwpqdipPropertyDescriptor( object );
            addXrefmaxPropertyDescriptor( object );
            addXrefminPropertyDescriptor( object );
            addWindPlantIECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kiwpx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiwpxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kiwpx_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kiwpx_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kiwpx(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Kpwpx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpwpxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kpwpx_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kpwpx_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kpwpx(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Kwpqu feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKwpquPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kwpqu_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kwpqu_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kwpqu(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Mwppf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwppfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_mwppf_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_mwppf_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Mwppf(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Mwpu feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwpuPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantReactiveControlIEC_mwpu_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_mwpu_feature",
                                "_UI_WindPlantReactiveControlIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Mwpu(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Twppfilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwppfiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_twppfilt_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_twppfilt_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Twppfilt(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Twpqfilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwpqfiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_twpqfilt_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_twpqfilt_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Twpqfilt(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Twpufilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwpufiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_twpufilt_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_twpufilt_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Twpufilt(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Txft feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTxftPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantReactiveControlIEC_txft_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_txft_feature",
                                "_UI_WindPlantReactiveControlIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Txft(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Txfv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTxfvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantReactiveControlIEC_txfv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_txfv_feature",
                                "_UI_WindPlantReactiveControlIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Txfv(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Uwpqdip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUwpqdipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_uwpqdip_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_uwpqdip_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Uwpqdip(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Xrefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXrefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_xrefmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_xrefmax_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Xrefmax(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Xrefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXrefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_xrefmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_xrefmin_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Xrefmin(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_WindPlantIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_WindPlantIEC_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_WindPlantIEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This returns WindPlantReactiveControlIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindPlantReactiveControlIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindPlantReactiveControlIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindPlantReactiveControlIEC_type" )
                : getString( "_UI_WindPlantReactiveControlIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindPlantReactiveControlIEC.class ) ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPPF:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPU:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILT:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILT:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILT:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
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
