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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindContPType3IECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContPType3IECItemProvider( AdapterFactory adapterFactory ) {
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

            addDpmaxPropertyDescriptor( object );
            addDtrisemaxlvrtPropertyDescriptor( object );
            addKdtdPropertyDescriptor( object );
            addKipPropertyDescriptor( object );
            addKppPropertyDescriptor( object );
            addMplvrtPropertyDescriptor( object );
            addOmegaoffsetPropertyDescriptor( object );
            addPdtdmaxPropertyDescriptor( object );
            addRrampPropertyDescriptor( object );
            addTdvsPropertyDescriptor( object );
            addTeminPropertyDescriptor( object );
            addTomegafiltPropertyDescriptor( object );
            addTpfiltPropertyDescriptor( object );
            addTpordPropertyDescriptor( object );
            addTufiltPropertyDescriptor( object );
            addTuscalePropertyDescriptor( object );
            addTwrefPropertyDescriptor( object );
            addUdvsPropertyDescriptor( object );
            addUpdipPropertyDescriptor( object );
            addWdtdPropertyDescriptor( object );
            addZetaPropertyDescriptor( object );
            addWindGenTurbineType3IECPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dpmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_dpmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_dpmax_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Dpmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dtrisemaxlvrt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDtrisemaxlvrtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_dtrisemaxlvrt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_dtrisemaxlvrt_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Dtrisemaxlvrt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kdtd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdtdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_kdtd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_kdtd_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Kdtd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_kip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_kip_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Kip(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_kpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_kpp_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Kpp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mplvrt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMplvrtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_mplvrt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_mplvrt_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Mplvrt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Omegaoffset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmegaoffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_omegaoffset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_omegaoffset_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Omegaoffset(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pdtdmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPdtdmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_pdtdmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_pdtdmax_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Pdtdmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rramp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRrampPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_rramp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_rramp_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Rramp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tdvs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdvsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tdvs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tdvs_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tdvs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Temin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTeminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_temin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_temin_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Temin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tomegafilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTomegafiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tomegafilt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tomegafilt_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tomegafilt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpfilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpfiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tpfilt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tpfilt_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tpfilt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpord feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpordPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tpord_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tpord_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tpord(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tufilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTufiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tufilt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tufilt_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tufilt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tuscale feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuscalePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tuscale_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tuscale_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tuscale(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Twref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_twref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_twref_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Twref(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Udvs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUdvsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_udvs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_udvs_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Udvs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Updip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpdipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_updip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_updip_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Updip(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wdtd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWdtdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_wdtd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_wdtd_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Wdtd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Zeta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZetaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_zeta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_zeta_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Zeta(),
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
                        getString( "_UI_WindContPType3IEC_WindGenTurbineType3IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindContPType3IEC_WindGenTurbineType3IEC_feature", "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_WindGenTurbineType3IEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Dynamics Lookup Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindDynamicsLookupTablePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_WindDynamicsLookupTable_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindContPType3IEC_WindDynamicsLookupTable_feature", "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_WindDynamicsLookupTable(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns WindContPType3IEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindContPType3IEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindContPType3IEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindContPType3IEC_type" )
                : getString( "_UI_WindContPType3IEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindContPType3IEC.class ) ) {
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTRISEMAXLVRT:
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPLVRT:
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
        case CimPackage.WIND_CONT_PTYPE3_IEC__RRAMP:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TEMIN:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILT:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILT:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILT:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUSCALE:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
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
