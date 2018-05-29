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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Organisation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Organisation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganisationItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrganisationItemProvider( AdapterFactory adapterFactory ) {
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

            addElectronicAddressPropertyDescriptor( object );
            addPhone1PropertyDescriptor( object );
            addPhone2PropertyDescriptor( object );
            addPostalAddressPropertyDescriptor( object );
            addStreetAddressPropertyDescriptor( object );
            addActivityRecordsPropertyDescriptor( object );
            addRolesPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Electronic Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addElectronicAddressPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Organisation_electronicAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Organisation_electronicAddress_feature",
                                "_UI_Organisation_type" ),
                        CimPackage.eINSTANCE.getOrganisation_ElectronicAddress(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phone1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhone1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Organisation_phone1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Organisation_phone1_feature",
                                "_UI_Organisation_type" ),
                        CimPackage.eINSTANCE.getOrganisation_Phone1(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Phone2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhone2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Organisation_phone2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Organisation_phone2_feature",
                                "_UI_Organisation_type" ),
                        CimPackage.eINSTANCE.getOrganisation_Phone2(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Postal Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPostalAddressPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Organisation_postalAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Organisation_postalAddress_feature",
                                "_UI_Organisation_type" ),
                        CimPackage.eINSTANCE.getOrganisation_PostalAddress(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Street Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStreetAddressPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Organisation_streetAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Organisation_streetAddress_feature",
                                "_UI_Organisation_type" ),
                        CimPackage.eINSTANCE.getOrganisation_StreetAddress(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Activity Records feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActivityRecordsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Organisation_ActivityRecords_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Organisation_ActivityRecords_feature",
                                "_UI_Organisation_type" ),
                        CimPackage.eINSTANCE.getOrganisation_ActivityRecords(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Roles feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRolesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Organisation_Roles_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Organisation_Roles_feature",
                                "_UI_Organisation_type" ),
                        CimPackage.eINSTANCE.getOrganisation_Roles(), true, false, true, null, null, null ) );
    }

    /**
     * This returns Organisation.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Organisation" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Organisation ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Organisation_type" )
                : getString( "_UI_Organisation_type" ) + " " + label;
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
