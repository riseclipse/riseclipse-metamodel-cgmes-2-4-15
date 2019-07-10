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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologicalNodeItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopologicalNodeItemProvider( AdapterFactory adapterFactory ) {
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

            addPInjectionPropertyDescriptor( object );
            addQInjectionPropertyDescriptor( object );
            addConnectivityNodeContainerPropertyDescriptor( object );
            addTopologicalIslandPropertyDescriptor( object );
            addBaseVoltagePropertyDescriptor( object );
            addSvInjectionPropertyDescriptor( object );
            addSvVoltagePropertyDescriptor( object );
            addTerminalPropertyDescriptor( object );
            addAngleRefTopologicalIslandPropertyDescriptor( object );
            addConnectivityNodesPropertyDescriptor( object );
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
     * This adds a property descriptor for the PInjection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPInjectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TopologicalNode_pInjection_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_pInjection_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_PInjection(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the QInjection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQInjectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TopologicalNode_qInjection_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_qInjection_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_QInjection(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TopologicalNode_Terminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_Terminal_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_Terminal(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Sv Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TopologicalNode_SvVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_SvVoltage_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_SvVoltage(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Base Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaseVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TopologicalNode_BaseVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_BaseVoltage_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_BaseVoltage(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Connectivity Nodes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectivityNodesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TopologicalNode_ConnectivityNodes_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_ConnectivityNodes_feature",
                        "_UI_TopologicalNode_type" ),
                CimPackage.eINSTANCE.getTopologicalNode_ConnectivityNodes(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Angle Ref Topological Island feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAngleRefTopologicalIslandPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TopologicalNode_AngleRefTopologicalIsland_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TopologicalNode_AngleRefTopologicalIsland_feature", "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_AngleRefTopologicalIsland(), true, false, true, null,
                        null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_ConnectivityNodeContainer_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TopologicalNode_ConnectivityNodeContainer_feature", "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_ConnectivityNodeContainer(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Sv Injection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvInjectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TopologicalNode_SvInjection_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_SvInjection_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_SvInjection(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Topological Island feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTopologicalIslandPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TopologicalNode_TopologicalIsland_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_TopologicalIsland_feature",
                        "_UI_TopologicalNode_type" ),
                CimPackage.eINSTANCE.getTopologicalNode_TopologicalIsland(), true, false, true, null, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_boundaryPoint_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_boundaryPoint_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_BoundaryPoint(), true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_fromEndIsoCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_fromEndIsoCode_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_FromEndIsoCode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_fromEndName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_fromEndName_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_FromEndName(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_fromEndNameTso_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_fromEndNameTso_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_FromEndNameTso(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_toEndIsoCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_toEndIsoCode_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_ToEndIsoCode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_toEndName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_toEndName_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_ToEndName(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TopologicalNode_toEndNameTso_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TopologicalNode_toEndNameTso_feature",
                                "_UI_TopologicalNode_type" ),
                        CimPackage.eINSTANCE.getTopologicalNode_ToEndNameTso(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns TopologicalNode.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TopologicalNode" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TopologicalNode ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TopologicalNode_type" )
                : getString( "_UI_TopologicalNode_type" ) + " " + label;
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

        switch( notification.getFeatureID( TopologicalNode.class ) ) {
        case CimPackage.TOPOLOGICAL_NODE__PINJECTION:
        case CimPackage.TOPOLOGICAL_NODE__QINJECTION:
        case CimPackage.TOPOLOGICAL_NODE__BOUNDARY_POINT:
        case CimPackage.TOPOLOGICAL_NODE__FROM_END_ISO_CODE:
        case CimPackage.TOPOLOGICAL_NODE__FROM_END_NAME:
        case CimPackage.TOPOLOGICAL_NODE__FROM_END_NAME_TSO:
        case CimPackage.TOPOLOGICAL_NODE__TO_END_ISO_CODE:
        case CimPackage.TOPOLOGICAL_NODE__TO_END_NAME:
        case CimPackage.TOPOLOGICAL_NODE__TO_END_NAME_TSO:
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
