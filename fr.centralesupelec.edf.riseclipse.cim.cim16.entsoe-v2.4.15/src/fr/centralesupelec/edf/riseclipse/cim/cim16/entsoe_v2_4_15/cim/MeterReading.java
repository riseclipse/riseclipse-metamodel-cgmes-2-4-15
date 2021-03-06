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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getIsCoincidentTrigger <em>Is Coincident Trigger</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getValuesInterval <em>Values Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getMeter <em>Meter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getUsagePoint <em>Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getReadings <em>Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface MeterReading extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Is Coincident Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Coincident Trigger</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Coincident Trigger</em>' attribute.
     * @see #isSetIsCoincidentTrigger()
     * @see #unsetIsCoincidentTrigger()
     * @see #setIsCoincidentTrigger(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_IsCoincidentTrigger()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.isCoincidentTrigger' kind='element'"
     * @generated
     */
    Boolean getIsCoincidentTrigger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getIsCoincidentTrigger <em>Is Coincident Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Coincident Trigger</em>' attribute.
     * @see #isSetIsCoincidentTrigger()
     * @see #unsetIsCoincidentTrigger()
     * @see #getIsCoincidentTrigger()
     * @generated
     */
    void setIsCoincidentTrigger( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getIsCoincidentTrigger <em>Is Coincident Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsCoincidentTrigger()
     * @see #getIsCoincidentTrigger()
     * @see #setIsCoincidentTrigger(Boolean)
     * @generated
     */
    void unsetIsCoincidentTrigger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getIsCoincidentTrigger <em>Is Coincident Trigger</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Coincident Trigger</em>' attribute is set.
     * @see #unsetIsCoincidentTrigger()
     * @see #getIsCoincidentTrigger()
     * @see #setIsCoincidentTrigger(Boolean)
     * @generated
     */
    boolean isSetIsCoincidentTrigger();

    /**
     * Returns the value of the '<em><b>Values Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values Interval</em>' containment reference.
     * @see #isSetValuesInterval()
     * @see #unsetValuesInterval()
     * @see #setValuesInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_ValuesInterval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.valuesInterval' kind='element'"
     * @generated
     */
    DateTimeInterval getValuesInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getValuesInterval <em>Values Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Values Interval</em>' containment reference.
     * @see #isSetValuesInterval()
     * @see #unsetValuesInterval()
     * @see #getValuesInterval()
     * @generated
     */
    void setValuesInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getValuesInterval <em>Values Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValuesInterval()
     * @see #getValuesInterval()
     * @see #setValuesInterval(DateTimeInterval)
     * @generated
     */
    void unsetValuesInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getValuesInterval <em>Values Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Values Interval</em>' containment reference is set.
     * @see #unsetValuesInterval()
     * @see #getValuesInterval()
     * @see #setValuesInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetValuesInterval();

    /**
     * Returns the value of the '<em><b>Readings</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Reading}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Reading#getMeterReadings <em>Meter Readings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Readings</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Readings</em>' reference list.
     * @see #isSetReadings()
     * @see #unsetReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_Readings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Reading#getMeterReadings
     * @model opposite="MeterReadings" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.Readings' kind='element'"
     * @generated
     */
    EList< Reading > getReadings();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getReadings <em>Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadings()
     * @see #getReadings()
     * @generated
     */
    void unsetReadings();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getReadings <em>Readings</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Readings</em>' reference list is set.
     * @see #unsetReadings()
     * @see #getReadings()
     * @generated
     */
    boolean isSetReadings();

    /**
     * Returns the value of the '<em><b>End Device Events</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EndDeviceEvent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Events</em>' reference list.
     * @see #isSetEndDeviceEvents()
     * @see #unsetEndDeviceEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_EndDeviceEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EndDeviceEvent#getMeterReading
     * @model opposite="MeterReading" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.EndDeviceEvents' kind='element'"
     * @generated
     */
    EList< EndDeviceEvent > getEndDeviceEvents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getEndDeviceEvents <em>End Device Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceEvents()
     * @see #getEndDeviceEvents()
     * @generated
     */
    void unsetEndDeviceEvents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getEndDeviceEvents <em>End Device Events</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Events</em>' reference list is set.
     * @see #unsetEndDeviceEvents()
     * @see #getEndDeviceEvents()
     * @generated
     */
    boolean isSetEndDeviceEvents();

    /**
     * Returns the value of the '<em><b>Usage Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint#getMeterReadings <em>Meter Readings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_UsagePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint#getMeterReadings
     * @model opposite="MeterReadings" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.UsagePoint' kind='element'"
     * @generated
     */
    UsagePoint getUsagePoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @generated
     */
    void setUsagePoint( UsagePoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    void unsetUsagePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getUsagePoint <em>Usage Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Point</em>' reference is set.
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    boolean isSetUsagePoint();

    /**
     * Returns the value of the '<em><b>Meter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReadings <em>Meter Readings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #setMeter(Meter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_Meter()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReadings
     * @model opposite="MeterReadings" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.Meter' kind='element'"
     * @generated
     */
    Meter getMeter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #getMeter()
     * @generated
     */
    void setMeter( Meter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    void unsetMeter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getMeter <em>Meter</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter</em>' reference is set.
     * @see #unsetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    boolean isSetMeter();

    /**
     * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.IntervalBlock}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.IntervalBlock#getMeterReading <em>Meter Reading</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval Blocks</em>' reference list.
     * @see #isSetIntervalBlocks()
     * @see #unsetIntervalBlocks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_IntervalBlocks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.IntervalBlock#getMeterReading
     * @model opposite="MeterReading" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.IntervalBlocks' kind='element'"
     * @generated
     */
    EList< IntervalBlock > getIntervalBlocks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntervalBlocks()
     * @see #getIntervalBlocks()
     * @generated
     */
    void unsetIntervalBlocks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interval Blocks</em>' reference list is set.
     * @see #unsetIntervalBlocks()
     * @see #getIntervalBlocks()
     * @generated
     */
    boolean isSetIntervalBlocks();

    /**
     * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Agreement</em>' reference.
     * @see #isSetCustomerAgreement()
     * @see #unsetCustomerAgreement()
     * @see #setCustomerAgreement(CustomerAgreement)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeterReading_CustomerAgreement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getMeterReadings
     * @model opposite="MeterReadings" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeterReading.CustomerAgreement' kind='element'"
     * @generated
     */
    CustomerAgreement getCustomerAgreement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Agreement</em>' reference.
     * @see #isSetCustomerAgreement()
     * @see #unsetCustomerAgreement()
     * @see #getCustomerAgreement()
     * @generated
     */
    void setCustomerAgreement( CustomerAgreement value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAgreement()
     * @see #getCustomerAgreement()
     * @see #setCustomerAgreement(CustomerAgreement)
     * @generated
     */
    void unsetCustomerAgreement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Agreement</em>' reference is set.
     * @see #unsetCustomerAgreement()
     * @see #getCustomerAgreement()
     * @see #setCustomerAgreement(CustomerAgreement)
     * @generated
     */
    boolean isSetCustomerAgreement();

} // MeterReading
