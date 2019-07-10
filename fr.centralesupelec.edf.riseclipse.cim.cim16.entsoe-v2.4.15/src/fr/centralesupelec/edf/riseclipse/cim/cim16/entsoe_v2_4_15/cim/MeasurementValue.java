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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getRemoteSource <em>Remote Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeasurementValue()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface MeasurementValue extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Sensor Accuracy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensor Accuracy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sensor Accuracy</em>' attribute.
     * @see #isSetSensorAccuracy()
     * @see #unsetSensorAccuracy()
     * @see #setSensorAccuracy(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeasurementValue_SensorAccuracy()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeasurementValue.sensorAccuracy' kind='element'"
     * @generated
     */
    Float getSensorAccuracy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sensor Accuracy</em>' attribute.
     * @see #isSetSensorAccuracy()
     * @see #unsetSensorAccuracy()
     * @see #getSensorAccuracy()
     * @generated
     */
    void setSensorAccuracy( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSensorAccuracy()
     * @see #getSensorAccuracy()
     * @see #setSensorAccuracy(Float)
     * @generated
     */
    void unsetSensorAccuracy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sensor Accuracy</em>' attribute is set.
     * @see #unsetSensorAccuracy()
     * @see #getSensorAccuracy()
     * @see #setSensorAccuracy(Float)
     * @generated
     */
    boolean isSetSensorAccuracy();

    /**
     * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #setTimeStamp(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeasurementValue_TimeStamp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeasurementValue.timeStamp' kind='element'"
     * @generated
     */
    Date getTimeStamp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @generated
     */
    void setTimeStamp( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(Date)
     * @generated
     */
    void unsetTimeStamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(Date)
     * @generated
     */
    boolean isSetTimeStamp();

    /**
     * Returns the value of the '<em><b>Measurement Value Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Value Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Value Source</em>' reference.
     * @see #isSetMeasurementValueSource()
     * @see #unsetMeasurementValueSource()
     * @see #setMeasurementValueSource(MeasurementValueSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeasurementValue_MeasurementValueSource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValueSource#getMeasurementValues
     * @model opposite="MeasurementValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeasurementValue.MeasurementValueSource' kind='element'"
     * @generated
     */
    MeasurementValueSource getMeasurementValueSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Value Source</em>' reference.
     * @see #isSetMeasurementValueSource()
     * @see #unsetMeasurementValueSource()
     * @see #getMeasurementValueSource()
     * @generated
     */
    void setMeasurementValueSource( MeasurementValueSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValueSource()
     * @see #getMeasurementValueSource()
     * @see #setMeasurementValueSource(MeasurementValueSource)
     * @generated
     */
    void unsetMeasurementValueSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value Source</em>' reference is set.
     * @see #unsetMeasurementValueSource()
     * @see #getMeasurementValueSource()
     * @see #setMeasurementValueSource(MeasurementValueSource)
     * @generated
     */
    boolean isSetMeasurementValueSource();

    /**
     * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedure Data Sets</em>' reference list.
     * @see #isSetProcedureDataSets()
     * @see #unsetProcedureDataSets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeasurementValue_ProcedureDataSets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getMeasurementValues
     * @model opposite="MeasurementValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeasurementValue.ProcedureDataSets' kind='element'"
     * @generated
     */
    EList< ProcedureDataSet > getProcedureDataSets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcedureDataSets()
     * @see #getProcedureDataSets()
     * @generated
     */
    void unsetProcedureDataSets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Procedure Data Sets</em>' reference list is set.
     * @see #unsetProcedureDataSets()
     * @see #getProcedureDataSets()
     * @generated
     */
    boolean isSetProcedureDataSets();

    /**
     * Returns the value of the '<em><b>Measurement Value Quality</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Value Quality</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Value Quality</em>' reference.
     * @see #isSetMeasurementValueQuality()
     * @see #unsetMeasurementValueQuality()
     * @see #setMeasurementValueQuality(MeasurementValueQuality)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeasurementValue_MeasurementValueQuality()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValueQuality#getMeasurementValue
     * @model opposite="MeasurementValue" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeasurementValue.MeasurementValueQuality' kind='element'"
     * @generated
     */
    MeasurementValueQuality getMeasurementValueQuality();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Value Quality</em>' reference.
     * @see #isSetMeasurementValueQuality()
     * @see #unsetMeasurementValueQuality()
     * @see #getMeasurementValueQuality()
     * @generated
     */
    void setMeasurementValueQuality( MeasurementValueQuality value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValueQuality()
     * @see #getMeasurementValueQuality()
     * @see #setMeasurementValueQuality(MeasurementValueQuality)
     * @generated
     */
    void unsetMeasurementValueQuality();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value Quality</em>' reference is set.
     * @see #unsetMeasurementValueQuality()
     * @see #getMeasurementValueQuality()
     * @see #setMeasurementValueQuality(MeasurementValueQuality)
     * @generated
     */
    boolean isSetMeasurementValueQuality();

    /**
     * Returns the value of the '<em><b>Remote Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.RemoteSource#getMeasurementValue <em>Measurement Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Source</em>' reference.
     * @see #isSetRemoteSource()
     * @see #unsetRemoteSource()
     * @see #setRemoteSource(RemoteSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeasurementValue_RemoteSource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.RemoteSource#getMeasurementValue
     * @model opposite="MeasurementValue" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='MeasurementValue.RemoteSource' kind='element'"
     * @generated
     */
    RemoteSource getRemoteSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getRemoteSource <em>Remote Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Source</em>' reference.
     * @see #isSetRemoteSource()
     * @see #unsetRemoteSource()
     * @see #getRemoteSource()
     * @generated
     */
    void setRemoteSource( RemoteSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getRemoteSource <em>Remote Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteSource()
     * @see #getRemoteSource()
     * @see #setRemoteSource(RemoteSource)
     * @generated
     */
    void unsetRemoteSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getRemoteSource <em>Remote Source</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Source</em>' reference is set.
     * @see #unsetRemoteSource()
     * @see #getRemoteSource()
     * @see #setRemoteSource(RemoteSource)
     * @generated
     */
    boolean isSetRemoteSource();

} // MeasurementValue
