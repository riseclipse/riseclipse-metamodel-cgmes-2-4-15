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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkTaskItemProvider extends BaseWorkItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkTaskItemProvider( AdapterFactory adapterFactory ) {
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

            addCrewETAPropertyDescriptor( object );
            addInstructionPropertyDescriptor( object );
            addSchedOverridePropertyDescriptor( object );
            addTaskKindPropertyDescriptor( object );
            addCrewsPropertyDescriptor( object );
            addAssetsPropertyDescriptor( object );
            addSwitchingPlanPropertyDescriptor( object );
            addOldAssetPropertyDescriptor( object );
            addMaterialItemsPropertyDescriptor( object );
            addWorkPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Crew ETA feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCrewETAPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_crewETA_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_crewETA_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_CrewETA(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Instruction feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInstructionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_instruction_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_instruction_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_Instruction(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Sched Override feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSchedOverridePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_schedOverride_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_schedOverride_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_SchedOverride(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Task Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaskKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_taskKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_taskKind_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_TaskKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Assets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_Assets_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_Assets_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_Assets(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Crews feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCrewsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_Crews_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_Crews_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_Crews(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Old Asset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOldAssetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_OldAsset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_OldAsset_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_OldAsset(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Material Items feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaterialItemsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_MaterialItems_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_MaterialItems_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_MaterialItems(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switching Plan feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchingPlanPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_SwitchingPlan_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_SwitchingPlan_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_SwitchingPlan(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Work feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWorkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WorkTask_Work_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WorkTask_Work_feature",
                                "_UI_WorkTask_type" ),
                        CimPackage.eINSTANCE.getWorkTask_Work(), true, false, true, null, null, null ) );
    }

    /**
     * This returns WorkTask.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WorkTask" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WorkTask ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WorkTask_type" )
                : getString( "_UI_WorkTask_type" ) + " " + label;
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

        switch( notification.getFeatureID( WorkTask.class ) ) {
        case CimPackage.WORK_TASK__CREW_ETA:
        case CimPackage.WORK_TASK__INSTRUCTION:
        case CimPackage.WORK_TASK__SCHED_OVERRIDE:
        case CimPackage.WORK_TASK__TASK_KIND:
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
