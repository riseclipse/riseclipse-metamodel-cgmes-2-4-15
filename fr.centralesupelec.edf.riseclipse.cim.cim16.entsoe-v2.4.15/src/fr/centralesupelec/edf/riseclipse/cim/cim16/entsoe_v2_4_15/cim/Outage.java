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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCancelledDateTime <em>Cancelled Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCause <em>Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getActualPeriod <em>Actual Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getEstimatedPeriod <em>Estimated Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getSummary <em>Summary</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getSwitchingPlans <em>Switching Plans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getUpdatedRatings <em>Updated Ratings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getOpenedSwitches <em>Opened Switches</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getFaults <em>Faults</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getOutageSchedule <em>Outage Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getPlannedSwitchActions <em>Planned Switch Actions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface Outage extends Document {
    /**
     * Returns the value of the '<em><b>Cancelled Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancelled Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancelled Date Time</em>' attribute.
     * @see #isSetCancelledDateTime()
     * @see #unsetCancelledDateTime()
     * @see #setCancelledDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_CancelledDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.cancelledDateTime' kind='element'"
     * @generated
     */
    Date getCancelledDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCancelledDateTime <em>Cancelled Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancelled Date Time</em>' attribute.
     * @see #isSetCancelledDateTime()
     * @see #unsetCancelledDateTime()
     * @see #getCancelledDateTime()
     * @generated
     */
    void setCancelledDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCancelledDateTime <em>Cancelled Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCancelledDateTime()
     * @see #getCancelledDateTime()
     * @see #setCancelledDateTime(Date)
     * @generated
     */
    void unsetCancelledDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCancelledDateTime <em>Cancelled Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cancelled Date Time</em>' attribute is set.
     * @see #unsetCancelledDateTime()
     * @see #getCancelledDateTime()
     * @see #setCancelledDateTime(Date)
     * @generated
     */
    boolean isSetCancelledDateTime();

    /**
     * Returns the value of the '<em><b>Cause</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cause</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cause</em>' attribute.
     * @see #isSetCause()
     * @see #unsetCause()
     * @see #setCause(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_Cause()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.cause' kind='element'"
     * @generated
     */
    String getCause();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCause <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cause</em>' attribute.
     * @see #isSetCause()
     * @see #unsetCause()
     * @see #getCause()
     * @generated
     */
    void setCause( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCause <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCause()
     * @see #getCause()
     * @see #setCause(String)
     * @generated
     */
    void unsetCause();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getCause <em>Cause</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cause</em>' attribute is set.
     * @see #unsetCause()
     * @see #getCause()
     * @see #setCause(String)
     * @generated
     */
    boolean isSetCause();

    /**
     * Returns the value of the '<em><b>Is Planned</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Planned</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Planned</em>' attribute.
     * @see #isSetIsPlanned()
     * @see #unsetIsPlanned()
     * @see #setIsPlanned(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_IsPlanned()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.isPlanned' kind='element'"
     * @generated
     */
    Boolean getIsPlanned();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIsPlanned <em>Is Planned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Planned</em>' attribute.
     * @see #isSetIsPlanned()
     * @see #unsetIsPlanned()
     * @see #getIsPlanned()
     * @generated
     */
    void setIsPlanned( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIsPlanned <em>Is Planned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPlanned()
     * @see #getIsPlanned()
     * @see #setIsPlanned(Boolean)
     * @generated
     */
    void unsetIsPlanned();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIsPlanned <em>Is Planned</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Planned</em>' attribute is set.
     * @see #unsetIsPlanned()
     * @see #getIsPlanned()
     * @see #setIsPlanned(Boolean)
     * @generated
     */
    boolean isSetIsPlanned();

    /**
     * Returns the value of the '<em><b>Actual Period</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual Period</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actual Period</em>' containment reference.
     * @see #isSetActualPeriod()
     * @see #unsetActualPeriod()
     * @see #setActualPeriod(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_ActualPeriod()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.actualPeriod' kind='element'"
     * @generated
     */
    DateTimeInterval getActualPeriod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getActualPeriod <em>Actual Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actual Period</em>' containment reference.
     * @see #isSetActualPeriod()
     * @see #unsetActualPeriod()
     * @see #getActualPeriod()
     * @generated
     */
    void setActualPeriod( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getActualPeriod <em>Actual Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActualPeriod()
     * @see #getActualPeriod()
     * @see #setActualPeriod(DateTimeInterval)
     * @generated
     */
    void unsetActualPeriod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getActualPeriod <em>Actual Period</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Actual Period</em>' containment reference is set.
     * @see #unsetActualPeriod()
     * @see #getActualPeriod()
     * @see #setActualPeriod(DateTimeInterval)
     * @generated
     */
    boolean isSetActualPeriod();

    /**
     * Returns the value of the '<em><b>Estimated Period</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Estimated Period</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Estimated Period</em>' containment reference.
     * @see #isSetEstimatedPeriod()
     * @see #unsetEstimatedPeriod()
     * @see #setEstimatedPeriod(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_EstimatedPeriod()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.estimatedPeriod' kind='element'"
     * @generated
     */
    DateTimeInterval getEstimatedPeriod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getEstimatedPeriod <em>Estimated Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Estimated Period</em>' containment reference.
     * @see #isSetEstimatedPeriod()
     * @see #unsetEstimatedPeriod()
     * @see #getEstimatedPeriod()
     * @generated
     */
    void setEstimatedPeriod( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getEstimatedPeriod <em>Estimated Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEstimatedPeriod()
     * @see #getEstimatedPeriod()
     * @see #setEstimatedPeriod(DateTimeInterval)
     * @generated
     */
    void unsetEstimatedPeriod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getEstimatedPeriod <em>Estimated Period</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Estimated Period</em>' containment reference is set.
     * @see #unsetEstimatedPeriod()
     * @see #getEstimatedPeriod()
     * @see #setEstimatedPeriod(DateTimeInterval)
     * @generated
     */
    boolean isSetEstimatedPeriod();

    /**
     * Returns the value of the '<em><b>Summary</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Summary</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Summary</em>' containment reference.
     * @see #isSetSummary()
     * @see #unsetSummary()
     * @see #setSummary(ServicePointOutageSummary)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_Summary()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.summary' kind='element'"
     * @generated
     */
    ServicePointOutageSummary getSummary();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getSummary <em>Summary</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Summary</em>' containment reference.
     * @see #isSetSummary()
     * @see #unsetSummary()
     * @see #getSummary()
     * @generated
     */
    void setSummary( ServicePointOutageSummary value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getSummary <em>Summary</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSummary()
     * @see #getSummary()
     * @see #setSummary(ServicePointOutageSummary)
     * @generated
     */
    void unsetSummary();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getSummary <em>Summary</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Summary</em>' containment reference is set.
     * @see #unsetSummary()
     * @see #getSummary()
     * @see #setSummary(ServicePointOutageSummary)
     * @generated
     */
    boolean isSetSummary();

    /**
     * Returns the value of the '<em><b>Switching Plans</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan#getOutage <em>Outage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Plans</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Plans</em>' reference list.
     * @see #isSetSwitchingPlans()
     * @see #unsetSwitchingPlans()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_SwitchingPlans()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan#getOutage
     * @model opposite="Outage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.SwitchingPlans' kind='element'"
     * @generated
     */
    EList< SwitchingPlan > getSwitchingPlans();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getSwitchingPlans <em>Switching Plans</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingPlans()
     * @see #getSwitchingPlans()
     * @generated
     */
    void unsetSwitchingPlans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getSwitchingPlans <em>Switching Plans</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Plans</em>' reference list is set.
     * @see #unsetSwitchingPlans()
     * @see #getSwitchingPlans()
     * @generated
     */
    boolean isSetSwitchingPlans();

    /**
     * Returns the value of the '<em><b>Updated Ratings</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalUpdatedRating}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalUpdatedRating#getPlannedOutage <em>Planned Outage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Updated Ratings</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Updated Ratings</em>' reference list.
     * @see #isSetUpdatedRatings()
     * @see #unsetUpdatedRatings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_UpdatedRatings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalUpdatedRating#getPlannedOutage
     * @model opposite="PlannedOutage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.UpdatedRatings' kind='element'"
     * @generated
     */
    EList< OperationalUpdatedRating > getUpdatedRatings();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getUpdatedRatings <em>Updated Ratings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpdatedRatings()
     * @see #getUpdatedRatings()
     * @generated
     */
    void unsetUpdatedRatings();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getUpdatedRatings <em>Updated Ratings</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Updated Ratings</em>' reference list is set.
     * @see #unsetUpdatedRatings()
     * @see #getUpdatedRatings()
     * @generated
     */
    boolean isSetUpdatedRatings();

    /**
     * Returns the value of the '<em><b>Planned Switch Actions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchAction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchAction#getPlannedOutage <em>Planned Outage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Planned Switch Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Planned Switch Actions</em>' reference list.
     * @see #isSetPlannedSwitchActions()
     * @see #unsetPlannedSwitchActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_PlannedSwitchActions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchAction#getPlannedOutage
     * @model opposite="PlannedOutage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.PlannedSwitchActions' kind='element'"
     * @generated
     */
    EList< SwitchAction > getPlannedSwitchActions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getPlannedSwitchActions <em>Planned Switch Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlannedSwitchActions()
     * @see #getPlannedSwitchActions()
     * @generated
     */
    void unsetPlannedSwitchActions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getPlannedSwitchActions <em>Planned Switch Actions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Planned Switch Actions</em>' reference list is set.
     * @see #unsetPlannedSwitchActions()
     * @see #getPlannedSwitchActions()
     * @generated
     */
    boolean isSetPlannedSwitchActions();

    /**
     * Returns the value of the '<em><b>Usage Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint#getOutages <em>Outages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Points</em>' reference list.
     * @see #isSetUsagePoints()
     * @see #unsetUsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_UsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint#getOutages
     * @model opposite="Outages" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.UsagePoints' kind='element'"
     * @generated
     */
    EList< UsagePoint > getUsagePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getUsagePoints <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    void unsetUsagePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getUsagePoints <em>Usage Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Points</em>' reference list is set.
     * @see #unsetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    boolean isSetUsagePoints();

    /**
     * Returns the value of the '<em><b>Equipments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Equipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Equipment#getOutages <em>Outages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equipments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equipments</em>' reference list.
     * @see #isSetEquipments()
     * @see #unsetEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_Equipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Equipment#getOutages
     * @model opposite="Outages" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.Equipments' kind='element'"
     * @generated
     */
    EList< Equipment > getEquipments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getEquipments <em>Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipments()
     * @see #getEquipments()
     * @generated
     */
    void unsetEquipments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getEquipments <em>Equipments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipments</em>' reference list is set.
     * @see #unsetEquipments()
     * @see #getEquipments()
     * @generated
     */
    boolean isSetEquipments();

    /**
     * Returns the value of the '<em><b>Incident</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Incident#getOutage <em>Outage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incident</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incident</em>' reference.
     * @see #isSetIncident()
     * @see #unsetIncident()
     * @see #setIncident(Incident)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_Incident()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Incident#getOutage
     * @model opposite="Outage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.Incident' kind='element'"
     * @generated
     */
    Incident getIncident();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIncident <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incident</em>' reference.
     * @see #isSetIncident()
     * @see #unsetIncident()
     * @see #getIncident()
     * @generated
     */
    void setIncident( Incident value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIncident <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    void unsetIncident();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getIncident <em>Incident</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incident</em>' reference is set.
     * @see #unsetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    boolean isSetIncident();

    /**
     * Returns the value of the '<em><b>Faults</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Fault}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Fault#getOutage <em>Outage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faults</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faults</em>' reference list.
     * @see #isSetFaults()
     * @see #unsetFaults()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_Faults()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Fault#getOutage
     * @model opposite="Outage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.Faults' kind='element'"
     * @generated
     */
    EList< Fault > getFaults();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getFaults <em>Faults</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFaults()
     * @see #getFaults()
     * @generated
     */
    void unsetFaults();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getFaults <em>Faults</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Faults</em>' reference list is set.
     * @see #unsetFaults()
     * @see #getFaults()
     * @generated
     */
    boolean isSetFaults();

    /**
     * Returns the value of the '<em><b>Outage Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OutageSchedule#getPlannedOutages <em>Planned Outages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage Schedule</em>' reference.
     * @see #isSetOutageSchedule()
     * @see #unsetOutageSchedule()
     * @see #setOutageSchedule(OutageSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_OutageSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OutageSchedule#getPlannedOutages
     * @model opposite="PlannedOutages" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.OutageSchedule' kind='element'"
     * @generated
     */
    OutageSchedule getOutageSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getOutageSchedule <em>Outage Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outage Schedule</em>' reference.
     * @see #isSetOutageSchedule()
     * @see #unsetOutageSchedule()
     * @see #getOutageSchedule()
     * @generated
     */
    void setOutageSchedule( OutageSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getOutageSchedule <em>Outage Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutageSchedule()
     * @see #getOutageSchedule()
     * @see #setOutageSchedule(OutageSchedule)
     * @generated
     */
    void unsetOutageSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getOutageSchedule <em>Outage Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage Schedule</em>' reference is set.
     * @see #unsetOutageSchedule()
     * @see #getOutageSchedule()
     * @see #setOutageSchedule(OutageSchedule)
     * @generated
     */
    boolean isSetOutageSchedule();

    /**
     * Returns the value of the '<em><b>Opened Switches</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Switch}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Switch#getOutage <em>Outage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Opened Switches</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Opened Switches</em>' reference list.
     * @see #isSetOpenedSwitches()
     * @see #unsetOpenedSwitches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOutage_OpenedSwitches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Switch#getOutage
     * @model opposite="Outage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Outage.OpenedSwitches' kind='element'"
     * @generated
     */
    EList< Switch > getOpenedSwitches();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getOpenedSwitches <em>Opened Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpenedSwitches()
     * @see #getOpenedSwitches()
     * @generated
     */
    void unsetOpenedSwitches();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage#getOpenedSwitches <em>Opened Switches</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Opened Switches</em>' reference list is set.
     * @see #unsetOpenedSwitches()
     * @see #getOpenedSwitches()
     * @generated
     */
    boolean isSetOpenedSwitches();

} // Outage
