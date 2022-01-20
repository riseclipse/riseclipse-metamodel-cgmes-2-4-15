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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getCrewETA <em>Crew ETA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSchedOverride <em>Sched Override</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getTaskKind <em>Task Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getCrews <em>Crews</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getOldAsset <em>Old Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WorkTask extends BaseWork {
    /**
     * Returns the value of the '<em><b>Crew ETA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crew ETA</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crew ETA</em>' attribute.
     * @see #isSetCrewETA()
     * @see #unsetCrewETA()
     * @see #setCrewETA(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_CrewETA()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.crewETA' kind='element'"
     * @generated
     */
    Date getCrewETA();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getCrewETA <em>Crew ETA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crew ETA</em>' attribute.
     * @see #isSetCrewETA()
     * @see #unsetCrewETA()
     * @see #getCrewETA()
     * @generated
     */
    void setCrewETA( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getCrewETA <em>Crew ETA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrewETA()
     * @see #getCrewETA()
     * @see #setCrewETA(Date)
     * @generated
     */
    void unsetCrewETA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getCrewETA <em>Crew ETA</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crew ETA</em>' attribute is set.
     * @see #unsetCrewETA()
     * @see #getCrewETA()
     * @see #setCrewETA(Date)
     * @generated
     */
    boolean isSetCrewETA();

    /**
     * Returns the value of the '<em><b>Instruction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instruction</em>' attribute.
     * @see #isSetInstruction()
     * @see #unsetInstruction()
     * @see #setInstruction(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_Instruction()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.instruction' kind='element'"
     * @generated
     */
    String getInstruction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getInstruction <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instruction</em>' attribute.
     * @see #isSetInstruction()
     * @see #unsetInstruction()
     * @see #getInstruction()
     * @generated
     */
    void setInstruction( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getInstruction <em>Instruction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstruction()
     * @see #getInstruction()
     * @see #setInstruction(String)
     * @generated
     */
    void unsetInstruction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getInstruction <em>Instruction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Instruction</em>' attribute is set.
     * @see #unsetInstruction()
     * @see #getInstruction()
     * @see #setInstruction(String)
     * @generated
     */
    boolean isSetInstruction();

    /**
     * Returns the value of the '<em><b>Sched Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sched Override</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sched Override</em>' attribute.
     * @see #isSetSchedOverride()
     * @see #unsetSchedOverride()
     * @see #setSchedOverride(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_SchedOverride()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.schedOverride' kind='element'"
     * @generated
     */
    String getSchedOverride();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sched Override</em>' attribute.
     * @see #isSetSchedOverride()
     * @see #unsetSchedOverride()
     * @see #getSchedOverride()
     * @generated
     */
    void setSchedOverride( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSchedOverride()
     * @see #getSchedOverride()
     * @see #setSchedOverride(String)
     * @generated
     */
    void unsetSchedOverride();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sched Override</em>' attribute is set.
     * @see #unsetSchedOverride()
     * @see #getSchedOverride()
     * @see #setSchedOverride(String)
     * @generated
     */
    boolean isSetSchedOverride();

    /**
     * Returns the value of the '<em><b>Task Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTaskKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTaskKind
     * @see #isSetTaskKind()
     * @see #unsetTaskKind()
     * @see #setTaskKind(WorkTaskKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_TaskKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.taskKind' kind='element'"
     * @generated
     */
    WorkTaskKind getTaskKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getTaskKind <em>Task Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTaskKind
     * @see #isSetTaskKind()
     * @see #unsetTaskKind()
     * @see #getTaskKind()
     * @generated
     */
    void setTaskKind( WorkTaskKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getTaskKind <em>Task Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaskKind()
     * @see #getTaskKind()
     * @see #setTaskKind(WorkTaskKind)
     * @generated
     */
    void unsetTaskKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getTaskKind <em>Task Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Task Kind</em>' attribute is set.
     * @see #unsetTaskKind()
     * @see #getTaskKind()
     * @see #setTaskKind(WorkTaskKind)
     * @generated
     */
    boolean isSetTaskKind();

    /**
     * Returns the value of the '<em><b>Assets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset#getWorkTasks <em>Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assets</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assets</em>' reference list.
     * @see #isSetAssets()
     * @see #unsetAssets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_Assets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset#getWorkTasks
     * @model opposite="WorkTasks" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.Assets' kind='element'"
     * @generated
     */
    EList< Asset > getAssets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getAssets <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssets()
     * @see #getAssets()
     * @generated
     */
    void unsetAssets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getAssets <em>Assets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Assets</em>' reference list is set.
     * @see #unsetAssets()
     * @see #getAssets()
     * @generated
     */
    boolean isSetAssets();

    /**
     * Returns the value of the '<em><b>Crews</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Crew}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Crew#getWorkTasks <em>Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crews</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crews</em>' reference list.
     * @see #isSetCrews()
     * @see #unsetCrews()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_Crews()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Crew#getWorkTasks
     * @model opposite="WorkTasks" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.Crews' kind='element'"
     * @generated
     */
    EList< Crew > getCrews();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getCrews <em>Crews</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrews()
     * @see #getCrews()
     * @generated
     */
    void unsetCrews();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getCrews <em>Crews</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crews</em>' reference list is set.
     * @see #unsetCrews()
     * @see #getCrews()
     * @generated
     */
    boolean isSetCrews();

    /**
     * Returns the value of the '<em><b>Old Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset#getReplacementWorkTasks <em>Replacement Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Asset</em>' reference.
     * @see #isSetOldAsset()
     * @see #unsetOldAsset()
     * @see #setOldAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_OldAsset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset#getReplacementWorkTasks
     * @model opposite="ReplacementWorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.OldAsset' kind='element'"
     * @generated
     */
    Asset getOldAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getOldAsset <em>Old Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Asset</em>' reference.
     * @see #isSetOldAsset()
     * @see #unsetOldAsset()
     * @see #getOldAsset()
     * @generated
     */
    void setOldAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getOldAsset <em>Old Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOldAsset()
     * @see #getOldAsset()
     * @see #setOldAsset(Asset)
     * @generated
     */
    void unsetOldAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getOldAsset <em>Old Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Old Asset</em>' reference is set.
     * @see #unsetOldAsset()
     * @see #getOldAsset()
     * @see #setOldAsset(Asset)
     * @generated
     */
    boolean isSetOldAsset();

    /**
     * Returns the value of the '<em><b>Material Items</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MaterialItem}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MaterialItem#getWorkTask <em>Work Task</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Material Items</em>' reference list.
     * @see #isSetMaterialItems()
     * @see #unsetMaterialItems()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_MaterialItems()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MaterialItem#getWorkTask
     * @model opposite="WorkTask" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.MaterialItems' kind='element'"
     * @generated
     */
    EList< MaterialItem > getMaterialItems();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getMaterialItems <em>Material Items</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaterialItems()
     * @see #getMaterialItems()
     * @generated
     */
    void unsetMaterialItems();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getMaterialItems <em>Material Items</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Material Items</em>' reference list is set.
     * @see #unsetMaterialItems()
     * @see #getMaterialItems()
     * @generated
     */
    boolean isSetMaterialItems();

    /**
     * Returns the value of the '<em><b>Switching Plan</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan#getWorkTasks <em>Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Plan</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Plan</em>' reference.
     * @see #isSetSwitchingPlan()
     * @see #unsetSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_SwitchingPlan()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan#getWorkTasks
     * @model opposite="WorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.SwitchingPlan' kind='element'"
     * @generated
     */
    SwitchingPlan getSwitchingPlan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switching Plan</em>' reference.
     * @see #isSetSwitchingPlan()
     * @see #unsetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @generated
     */
    void setSwitchingPlan( SwitchingPlan value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    void unsetSwitchingPlan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getSwitchingPlan <em>Switching Plan</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Plan</em>' reference is set.
     * @see #unsetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    boolean isSetSwitchingPlan();

    /**
     * Returns the value of the '<em><b>Work</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Work#getWorkTasks <em>Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work</em>' reference.
     * @see #isSetWork()
     * @see #unsetWork()
     * @see #setWork(Work)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWorkTask_Work()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Work#getWorkTasks
     * @model opposite="WorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WorkTask.Work' kind='element'"
     * @generated
     */
    Work getWork();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getWork <em>Work</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work</em>' reference.
     * @see #isSetWork()
     * @see #unsetWork()
     * @see #getWork()
     * @generated
     */
    void setWork( Work value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getWork <em>Work</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWork()
     * @see #getWork()
     * @see #setWork(Work)
     * @generated
     */
    void unsetWork();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask#getWork <em>Work</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work</em>' reference is set.
     * @see #unsetWork()
     * @see #getWork()
     * @see #setWork(Work)
     * @generated
     */
    boolean isSetWork();

} // WorkTask
