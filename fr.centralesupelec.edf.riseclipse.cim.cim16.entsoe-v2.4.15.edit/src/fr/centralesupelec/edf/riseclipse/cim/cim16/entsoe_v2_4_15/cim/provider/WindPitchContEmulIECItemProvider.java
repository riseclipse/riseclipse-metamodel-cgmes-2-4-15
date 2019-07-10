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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindPitchContEmulIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPitchContEmulIECItemProvider( AdapterFactory adapterFactory ) {
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

            addKdroopPropertyDescriptor( object );
            addKipcePropertyDescriptor( object );
            addKomegaaeroPropertyDescriptor( object );
            addKppcePropertyDescriptor( object );
            addOmegarefPropertyDescriptor( object );
            addPimaxPropertyDescriptor( object );
            addPiminPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addTpePropertyDescriptor( object );
            addWindGenTurbineType2IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kdroop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdroopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContEmulIEC_kdroop_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_kdroop_feature",
                        "_UI_WindPitchContEmulIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContEmulIEC_Kdroop(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kipce feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKipcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContEmulIEC_kipce_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_kipce_feature",
                                "_UI_WindPitchContEmulIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContEmulIEC_Kipce(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Komegaaero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKomegaaeroPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContEmulIEC_komegaaero_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_komegaaero_feature",
                        "_UI_WindPitchContEmulIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContEmulIEC_Komegaaero(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kppce feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKppcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContEmulIEC_kppce_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_kppce_feature",
                                "_UI_WindPitchContEmulIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContEmulIEC_Kppce(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Omegaref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmegarefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContEmulIEC_omegaref_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_omegaref_feature",
                        "_UI_WindPitchContEmulIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContEmulIEC_Omegaref(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContEmulIEC_pimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_pimax_feature",
                                "_UI_WindPitchContEmulIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContEmulIEC_Pimax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pimin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPiminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContEmulIEC_pimin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_pimin_feature",
                                "_UI_WindPitchContEmulIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContEmulIEC_Pimin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContEmulIEC_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_t1_feature",
                                "_UI_WindPitchContEmulIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContEmulIEC_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContEmulIEC_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_t2_feature",
                                "_UI_WindPitchContEmulIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContEmulIEC_T2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpe feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContEmulIEC_tpe_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContEmulIEC_tpe_feature",
                                "_UI_WindPitchContEmulIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContEmulIEC_Tpe(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Gen Turbine Type2 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindGenTurbineType2IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContEmulIEC_WindGenTurbineType2IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindPitchContEmulIEC_WindGenTurbineType2IEC_feature", "_UI_WindPitchContEmulIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContEmulIEC_WindGenTurbineType2IEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns WindPitchContEmulIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindPitchContEmulIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindPitchContEmulIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindPitchContEmulIEC_type" )
                : getString( "_UI_WindPitchContEmulIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindPitchContEmulIEC.class ) ) {
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KDROOP:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KIPCE:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KOMEGAAERO:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KPPCE:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__OMEGAREF:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMAX:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMIN:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T1:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T2:
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__TPE:
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
