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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNode;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectivityNodeItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectivityNodeItemProvider( AdapterFactory adapterFactory ) {
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

            addTopologicalNodePropertyDescriptor( object );
            addTerminalsPropertyDescriptor( object );
            addConnectivityNodeContainerPropertyDescriptor( object );
            addBoundaryPointPropertyDescriptor( object );
            addFromEndIsoCodePropertyDescriptor( object );
            addFromEndNamePropertyDescriptor( object );
            addFromEndNameTsoPropertyDescriptor( object );
            addToEndIsoCodePropertyDescriptor( object );
            addToEndNamePropertyDescriptor( object );
            addToEndNameTsoPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Topological Node feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTopologicalNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_TopologicalNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_TopologicalNode_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_TopologicalNode(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Terminals feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTerminalsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_Terminals_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_Terminals_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_Terminals(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Connectivity Node Container feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectivityNodeContainerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_ConnectivityNodeContainer_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConnectivityNode_ConnectivityNodeContainer_feature", "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_ConnectivityNodeContainer(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Boundary Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBoundaryPointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_boundaryPoint_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_boundaryPoint_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_BoundaryPoint(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the From End Iso Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromEndIsoCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_fromEndIsoCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_fromEndIsoCode_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_FromEndIsoCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the From End Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromEndNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_fromEndName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_fromEndName_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_FromEndName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the From End Name Tso feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromEndNameTsoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_fromEndNameTso_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_fromEndNameTso_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_FromEndNameTso(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the To End Iso Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToEndIsoCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_toEndIsoCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_toEndIsoCode_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_ToEndIsoCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the To End Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToEndNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_toEndName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_toEndName_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_ToEndName(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the To End Name Tso feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToEndNameTsoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConnectivityNode_toEndNameTso_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConnectivityNode_toEndNameTso_feature",
                                "_UI_ConnectivityNode_type" ),
                        CimPackage.eINSTANCE.getConnectivityNode_ToEndNameTso(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns ConnectivityNode.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ConnectivityNode" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ConnectivityNode ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ConnectivityNode_type" )
                : getString( "_UI_ConnectivityNode_type" ) + " " + label;
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

        switch( notification.getFeatureID( ConnectivityNode.class ) ) {
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
        case CimPackage.CONNECTIVITY_NODE__FROM_END_ISO_CODE:
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME:
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME_TSO:
        case CimPackage.CONNECTIVITY_NODE__TO_END_ISO_CODE:
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME:
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME_TSO:
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
