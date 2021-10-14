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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Document;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Document} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentItemProvider( AdapterFactory adapterFactory ) {
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

            addAuthorNamePropertyDescriptor( object );
            addCommentPropertyDescriptor( object );
            addCreatedDateTimePropertyDescriptor( object );
            addLastModifiedDateTimePropertyDescriptor( object );
            addRevisionNumberPropertyDescriptor( object );
            addSubjectPropertyDescriptor( object );
            addTitlePropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addDocStatusPropertyDescriptor( object );
            addElectronicAddressPropertyDescriptor( object );
            addStatusPropertyDescriptor( object );
            addConfigurationEventsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Author Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthorNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_authorName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_authorName_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_AuthorName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Comment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_comment_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_comment_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_Comment(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Created Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreatedDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_createdDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_createdDateTime_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_CreatedDateTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Last Modified Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastModifiedDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_lastModifiedDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_lastModifiedDateTime_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_LastModifiedDateTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Revision Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRevisionNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_revisionNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_revisionNumber_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_RevisionNumber(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Subject feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSubjectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_subject_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_subject_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_Subject(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Title feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTitlePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_title_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_title_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_Title(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_type_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_Type(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Doc Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDocStatusPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_docStatus_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_docStatus_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_DocStatus(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_Document_electronicAddress_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_electronicAddress_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_ElectronicAddress(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatusPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_status_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_status_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_Status(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Configuration Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigurationEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Document_ConfigurationEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Document_ConfigurationEvents_feature",
                                "_UI_Document_type" ),
                        CimPackage.eINSTANCE.getDocument_ConfigurationEvents(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns Document.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Document" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Document ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Document_type" )
                : getString( "_UI_Document_type" ) + " " + label;
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

        switch( notification.getFeatureID( Document.class ) ) {
        case CimPackage.DOCUMENT__AUTHOR_NAME:
        case CimPackage.DOCUMENT__COMMENT:
        case CimPackage.DOCUMENT__CREATED_DATE_TIME:
        case CimPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
        case CimPackage.DOCUMENT__REVISION_NUMBER:
        case CimPackage.DOCUMENT__SUBJECT:
        case CimPackage.DOCUMENT__TITLE:
        case CimPackage.DOCUMENT__TYPE:
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
