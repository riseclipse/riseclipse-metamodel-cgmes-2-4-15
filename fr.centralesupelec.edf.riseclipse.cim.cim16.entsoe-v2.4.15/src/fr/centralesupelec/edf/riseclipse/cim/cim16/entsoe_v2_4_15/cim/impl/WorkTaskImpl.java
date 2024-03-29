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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Crew;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MaterialItem;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Work;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTaskKind;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getCrewETA <em>Crew ETA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getSchedOverride <em>Sched Override</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getTaskKind <em>Task Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getSwitchingPlan <em>Switching Plan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getOldAsset <em>Old Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WorkTaskImpl#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkTaskImpl extends BaseWorkImpl implements WorkTask {
    /**
     * The default value of the '{@link #getCrewETA() <em>Crew ETA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrewETA()
     * @generated
     * @ordered
     */
    protected static final Date CREW_ETA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCrewETA() <em>Crew ETA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrewETA()
     * @generated
     * @ordered
     */
    protected Date crewETA = CREW_ETA_EDEFAULT;

    /**
     * This is true if the Crew ETA attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crewETAESet;

    /**
     * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstruction()
     * @generated
     * @ordered
     */
    protected static final String INSTRUCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstruction()
     * @generated
     * @ordered
     */
    protected String instruction = INSTRUCTION_EDEFAULT;

    /**
     * This is true if the Instruction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instructionESet;

    /**
     * The default value of the '{@link #getSchedOverride() <em>Sched Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedOverride()
     * @generated
     * @ordered
     */
    protected static final String SCHED_OVERRIDE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSchedOverride() <em>Sched Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedOverride()
     * @generated
     * @ordered
     */
    protected String schedOverride = SCHED_OVERRIDE_EDEFAULT;

    /**
     * This is true if the Sched Override attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean schedOverrideESet;

    /**
     * The default value of the '{@link #getTaskKind() <em>Task Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskKind()
     * @generated
     * @ordered
     */
    protected static final WorkTaskKind TASK_KIND_EDEFAULT = WorkTaskKind.INSTALL;

    /**
     * The cached value of the '{@link #getTaskKind() <em>Task Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskKind()
     * @generated
     * @ordered
     */
    protected WorkTaskKind taskKind = TASK_KIND_EDEFAULT;

    /**
     * This is true if the Task Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taskKindESet;

    /**
     * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrews()
     * @generated
     * @ordered
     */
    protected EList< Crew > crews;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList< Asset > assets;

    /**
     * The cached value of the '{@link #getSwitchingPlan() <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingPlan()
     * @generated
     * @ordered
     */
    protected SwitchingPlan switchingPlan;

    /**
     * This is true if the Switching Plan reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingPlanESet;

    /**
     * The cached value of the '{@link #getOldAsset() <em>Old Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldAsset()
     * @generated
     * @ordered
     */
    protected Asset oldAsset;

    /**
     * This is true if the Old Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oldAssetESet;

    /**
     * The cached value of the '{@link #getMaterialItems() <em>Material Items</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaterialItems()
     * @generated
     * @ordered
     */
    protected EList< MaterialItem > materialItems;

    /**
     * The cached value of the '{@link #getWork() <em>Work</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWork()
     * @generated
     * @ordered
     */
    protected Work work;

    /**
     * This is true if the Work reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean workESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWorkTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCrewETA() {
        return crewETA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCrewETA( Date newCrewETA ) {
        Date oldCrewETA = crewETA;
        crewETA = newCrewETA;
        boolean oldCrewETAESet = crewETAESet;
        crewETAESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__CREW_ETA, oldCrewETA, crewETA,
                    !oldCrewETAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCrewETA() {
        Date oldCrewETA = crewETA;
        boolean oldCrewETAESet = crewETAESet;
        crewETA = CREW_ETA_EDEFAULT;
        crewETAESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_TASK__CREW_ETA, oldCrewETA,
                    CREW_ETA_EDEFAULT, oldCrewETAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrewETA() {
        return crewETAESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInstruction() {
        return instruction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstruction( String newInstruction ) {
        String oldInstruction = instruction;
        instruction = newInstruction;
        boolean oldInstructionESet = instructionESet;
        instructionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__INSTRUCTION, oldInstruction,
                    instruction, !oldInstructionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInstruction() {
        String oldInstruction = instruction;
        boolean oldInstructionESet = instructionESet;
        instruction = INSTRUCTION_EDEFAULT;
        instructionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_TASK__INSTRUCTION, oldInstruction,
                    INSTRUCTION_EDEFAULT, oldInstructionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstruction() {
        return instructionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSchedOverride() {
        return schedOverride;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSchedOverride( String newSchedOverride ) {
        String oldSchedOverride = schedOverride;
        schedOverride = newSchedOverride;
        boolean oldSchedOverrideESet = schedOverrideESet;
        schedOverrideESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__SCHED_OVERRIDE,
                    oldSchedOverride, schedOverride, !oldSchedOverrideESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSchedOverride() {
        String oldSchedOverride = schedOverride;
        boolean oldSchedOverrideESet = schedOverrideESet;
        schedOverride = SCHED_OVERRIDE_EDEFAULT;
        schedOverrideESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_TASK__SCHED_OVERRIDE,
                    oldSchedOverride, SCHED_OVERRIDE_EDEFAULT, oldSchedOverrideESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSchedOverride() {
        return schedOverrideESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkTaskKind getTaskKind() {
        return taskKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTaskKind( WorkTaskKind newTaskKind ) {
        WorkTaskKind oldTaskKind = taskKind;
        taskKind = newTaskKind == null ? TASK_KIND_EDEFAULT : newTaskKind;
        boolean oldTaskKindESet = taskKindESet;
        taskKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__TASK_KIND, oldTaskKind,
                    taskKind, !oldTaskKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTaskKind() {
        WorkTaskKind oldTaskKind = taskKind;
        boolean oldTaskKindESet = taskKindESet;
        taskKind = TASK_KIND_EDEFAULT;
        taskKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_TASK__TASK_KIND, oldTaskKind,
                    TASK_KIND_EDEFAULT, oldTaskKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTaskKind() {
        return taskKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Asset >( Asset.class, this,
                    CimPackage.WORK_TASK__ASSETS, CimPackage.ASSET__WORK_TASKS );
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssets() {
        if( assets != null ) ( ( InternalEList.Unsettable< ? > ) assets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssets() {
        return assets != null && ( ( InternalEList.Unsettable< ? > ) assets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Crew > getCrews() {
        if( crews == null ) {
            crews = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Crew >( Crew.class, this,
                    CimPackage.WORK_TASK__CREWS, CimPackage.CREW__WORK_TASKS );
        }
        return crews;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCrews() {
        if( crews != null ) ( ( InternalEList.Unsettable< ? > ) crews ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrews() {
        return crews != null && ( ( InternalEList.Unsettable< ? > ) crews ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getOldAsset() {
        return oldAsset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOldAsset( Asset newOldAsset, NotificationChain msgs ) {
        Asset oldOldAsset = oldAsset;
        oldAsset = newOldAsset;
        boolean oldOldAssetESet = oldAssetESet;
        oldAssetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WORK_TASK__OLD_ASSET, oldOldAsset, newOldAsset, !oldOldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOldAsset( Asset newOldAsset ) {
        if( newOldAsset != oldAsset ) {
            NotificationChain msgs = null;
            if( oldAsset != null )
                msgs = ( ( InternalEObject ) oldAsset ).eInverseRemove( this, CimPackage.ASSET__REPLACEMENT_WORK_TASKS,
                        Asset.class, msgs );
            if( newOldAsset != null )
                msgs = ( ( InternalEObject ) newOldAsset ).eInverseAdd( this, CimPackage.ASSET__REPLACEMENT_WORK_TASKS,
                        Asset.class, msgs );
            msgs = basicSetOldAsset( newOldAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOldAssetESet = oldAssetESet;
            oldAssetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__OLD_ASSET, newOldAsset,
                        newOldAsset, !oldOldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOldAsset( NotificationChain msgs ) {
        Asset oldOldAsset = oldAsset;
        oldAsset = null;
        boolean oldOldAssetESet = oldAssetESet;
        oldAssetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WORK_TASK__OLD_ASSET, oldOldAsset, null, oldOldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOldAsset() {
        if( oldAsset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) oldAsset ).eInverseRemove( this, CimPackage.ASSET__REPLACEMENT_WORK_TASKS,
                    Asset.class, msgs );
            msgs = basicUnsetOldAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOldAssetESet = oldAssetESet;
            oldAssetESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_TASK__OLD_ASSET, null, null,
                        oldOldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOldAsset() {
        return oldAssetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MaterialItem > getMaterialItems() {
        if( materialItems == null ) {
            materialItems = new EObjectWithInverseResolvingEList.Unsettable< MaterialItem >( MaterialItem.class, this,
                    CimPackage.WORK_TASK__MATERIAL_ITEMS, CimPackage.MATERIAL_ITEM__WORK_TASK );
        }
        return materialItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaterialItems() {
        if( materialItems != null ) ( ( InternalEList.Unsettable< ? > ) materialItems ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaterialItems() {
        return materialItems != null && ( ( InternalEList.Unsettable< ? > ) materialItems ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingPlan getSwitchingPlan() {
        return switchingPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchingPlan( SwitchingPlan newSwitchingPlan, NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = newSwitchingPlan;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WORK_TASK__SWITCHING_PLAN, oldSwitchingPlan, newSwitchingPlan, !oldSwitchingPlanESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSwitchingPlan( SwitchingPlan newSwitchingPlan ) {
        if( newSwitchingPlan != switchingPlan ) {
            NotificationChain msgs = null;
            if( switchingPlan != null )
                msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                        CimPackage.SWITCHING_PLAN__WORK_TASKS, SwitchingPlan.class, msgs );
            if( newSwitchingPlan != null )
                msgs = ( ( InternalEObject ) newSwitchingPlan ).eInverseAdd( this,
                        CimPackage.SWITCHING_PLAN__WORK_TASKS, SwitchingPlan.class, msgs );
            msgs = basicSetSwitchingPlan( newSwitchingPlan, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__SWITCHING_PLAN,
                        newSwitchingPlan, newSwitchingPlan, !oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchingPlan( NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = null;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WORK_TASK__SWITCHING_PLAN, oldSwitchingPlan, null, oldSwitchingPlanESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchingPlan() {
        if( switchingPlan != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this, CimPackage.SWITCHING_PLAN__WORK_TASKS,
                    SwitchingPlan.class, msgs );
            msgs = basicUnsetSwitchingPlan( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_TASK__SWITCHING_PLAN, null,
                        null, oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingPlan() {
        return switchingPlanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Work getWork() {
        return work;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWork( Work newWork, NotificationChain msgs ) {
        Work oldWork = work;
        work = newWork;
        boolean oldWorkESet = workESet;
        workESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__WORK,
                    oldWork, newWork, !oldWorkESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWork( Work newWork ) {
        if( newWork != work ) {
            NotificationChain msgs = null;
            if( work != null )
                msgs = ( ( InternalEObject ) work ).eInverseRemove( this, CimPackage.WORK__WORK_TASKS, Work.class,
                        msgs );
            if( newWork != null )
                msgs = ( ( InternalEObject ) newWork ).eInverseAdd( this, CimPackage.WORK__WORK_TASKS, Work.class,
                        msgs );
            msgs = basicSetWork( newWork, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkESet = workESet;
            workESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_TASK__WORK, newWork, newWork,
                        !oldWorkESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWork( NotificationChain msgs ) {
        Work oldWork = work;
        work = null;
        boolean oldWorkESet = workESet;
        workESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WORK_TASK__WORK, oldWork, null, oldWorkESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWork() {
        if( work != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) work ).eInverseRemove( this, CimPackage.WORK__WORK_TASKS, Work.class, msgs );
            msgs = basicUnsetWork( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkESet = workESet;
            workESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_TASK__WORK, null, null,
                        oldWorkESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWork() {
        return workESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WORK_TASK__CREWS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCrews() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.WORK_TASK__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.WORK_TASK__SWITCHING_PLAN:
            if( switchingPlan != null )
                msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                        CimPackage.SWITCHING_PLAN__WORK_TASKS, SwitchingPlan.class, msgs );
            return basicSetSwitchingPlan( ( SwitchingPlan ) otherEnd, msgs );
        case CimPackage.WORK_TASK__OLD_ASSET:
            if( oldAsset != null )
                msgs = ( ( InternalEObject ) oldAsset ).eInverseRemove( this, CimPackage.ASSET__REPLACEMENT_WORK_TASKS,
                        Asset.class, msgs );
            return basicSetOldAsset( ( Asset ) otherEnd, msgs );
        case CimPackage.WORK_TASK__MATERIAL_ITEMS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMaterialItems() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.WORK_TASK__WORK:
            if( work != null )
                msgs = ( ( InternalEObject ) work ).eInverseRemove( this, CimPackage.WORK__WORK_TASKS, Work.class,
                        msgs );
            return basicSetWork( ( Work ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WORK_TASK__CREWS:
            return ( ( InternalEList< ? > ) getCrews() ).basicRemove( otherEnd, msgs );
        case CimPackage.WORK_TASK__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
        case CimPackage.WORK_TASK__SWITCHING_PLAN:
            return basicUnsetSwitchingPlan( msgs );
        case CimPackage.WORK_TASK__OLD_ASSET:
            return basicUnsetOldAsset( msgs );
        case CimPackage.WORK_TASK__MATERIAL_ITEMS:
            return ( ( InternalEList< ? > ) getMaterialItems() ).basicRemove( otherEnd, msgs );
        case CimPackage.WORK_TASK__WORK:
            return basicUnsetWork( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.WORK_TASK__CREW_ETA:
            return getCrewETA();
        case CimPackage.WORK_TASK__INSTRUCTION:
            return getInstruction();
        case CimPackage.WORK_TASK__SCHED_OVERRIDE:
            return getSchedOverride();
        case CimPackage.WORK_TASK__TASK_KIND:
            return getTaskKind();
        case CimPackage.WORK_TASK__CREWS:
            return getCrews();
        case CimPackage.WORK_TASK__ASSETS:
            return getAssets();
        case CimPackage.WORK_TASK__SWITCHING_PLAN:
            return getSwitchingPlan();
        case CimPackage.WORK_TASK__OLD_ASSET:
            return getOldAsset();
        case CimPackage.WORK_TASK__MATERIAL_ITEMS:
            return getMaterialItems();
        case CimPackage.WORK_TASK__WORK:
            return getWork();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.WORK_TASK__CREW_ETA:
            setCrewETA( ( Date ) newValue );
            return;
        case CimPackage.WORK_TASK__INSTRUCTION:
            setInstruction( ( String ) newValue );
            return;
        case CimPackage.WORK_TASK__SCHED_OVERRIDE:
            setSchedOverride( ( String ) newValue );
            return;
        case CimPackage.WORK_TASK__TASK_KIND:
            setTaskKind( ( WorkTaskKind ) newValue );
            return;
        case CimPackage.WORK_TASK__CREWS:
            getCrews().clear();
            getCrews().addAll( ( Collection< ? extends Crew > ) newValue );
            return;
        case CimPackage.WORK_TASK__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
            return;
        case CimPackage.WORK_TASK__SWITCHING_PLAN:
            setSwitchingPlan( ( SwitchingPlan ) newValue );
            return;
        case CimPackage.WORK_TASK__OLD_ASSET:
            setOldAsset( ( Asset ) newValue );
            return;
        case CimPackage.WORK_TASK__MATERIAL_ITEMS:
            getMaterialItems().clear();
            getMaterialItems().addAll( ( Collection< ? extends MaterialItem > ) newValue );
            return;
        case CimPackage.WORK_TASK__WORK:
            setWork( ( Work ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.WORK_TASK__CREW_ETA:
            unsetCrewETA();
            return;
        case CimPackage.WORK_TASK__INSTRUCTION:
            unsetInstruction();
            return;
        case CimPackage.WORK_TASK__SCHED_OVERRIDE:
            unsetSchedOverride();
            return;
        case CimPackage.WORK_TASK__TASK_KIND:
            unsetTaskKind();
            return;
        case CimPackage.WORK_TASK__CREWS:
            unsetCrews();
            return;
        case CimPackage.WORK_TASK__ASSETS:
            unsetAssets();
            return;
        case CimPackage.WORK_TASK__SWITCHING_PLAN:
            unsetSwitchingPlan();
            return;
        case CimPackage.WORK_TASK__OLD_ASSET:
            unsetOldAsset();
            return;
        case CimPackage.WORK_TASK__MATERIAL_ITEMS:
            unsetMaterialItems();
            return;
        case CimPackage.WORK_TASK__WORK:
            unsetWork();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.WORK_TASK__CREW_ETA:
            return isSetCrewETA();
        case CimPackage.WORK_TASK__INSTRUCTION:
            return isSetInstruction();
        case CimPackage.WORK_TASK__SCHED_OVERRIDE:
            return isSetSchedOverride();
        case CimPackage.WORK_TASK__TASK_KIND:
            return isSetTaskKind();
        case CimPackage.WORK_TASK__CREWS:
            return isSetCrews();
        case CimPackage.WORK_TASK__ASSETS:
            return isSetAssets();
        case CimPackage.WORK_TASK__SWITCHING_PLAN:
            return isSetSwitchingPlan();
        case CimPackage.WORK_TASK__OLD_ASSET:
            return isSetOldAsset();
        case CimPackage.WORK_TASK__MATERIAL_ITEMS:
            return isSetMaterialItems();
        case CimPackage.WORK_TASK__WORK:
            return isSetWork();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (crewETA: " );
        if( crewETAESet )
            result.append( crewETA );
        else
            result.append( "<unset>" );
        result.append( ", instruction: " );
        if( instructionESet )
            result.append( instruction );
        else
            result.append( "<unset>" );
        result.append( ", schedOverride: " );
        if( schedOverrideESet )
            result.append( schedOverride );
        else
            result.append( "<unset>" );
        result.append( ", taskKind: " );
        if( taskKindESet )
            result.append( taskKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WorkTaskImpl
