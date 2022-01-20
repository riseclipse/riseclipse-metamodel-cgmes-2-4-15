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
 * A representation of the model object '<em><b>Procedure Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProcedureDataSet()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface ProcedureDataSet extends Document {
    /**
     * Returns the value of the '<em><b>Completed Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Completed Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Completed Date Time</em>' attribute.
     * @see #isSetCompletedDateTime()
     * @see #unsetCompletedDateTime()
     * @see #setCompletedDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProcedureDataSet_CompletedDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProcedureDataSet.completedDateTime' kind='element'"
     * @generated
     */
    Date getCompletedDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completed Date Time</em>' attribute.
     * @see #isSetCompletedDateTime()
     * @see #unsetCompletedDateTime()
     * @see #getCompletedDateTime()
     * @generated
     */
    void setCompletedDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCompletedDateTime()
     * @see #getCompletedDateTime()
     * @see #setCompletedDateTime(Date)
     * @generated
     */
    void unsetCompletedDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Completed Date Time</em>' attribute is set.
     * @see #unsetCompletedDateTime()
     * @see #getCompletedDateTime()
     * @see #setCompletedDateTime(Date)
     * @generated
     */
    boolean isSetCompletedDateTime();

    /**
     * Returns the value of the '<em><b>Properties</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UserAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' reference list.
     * @see #isSetProperties()
     * @see #unsetProperties()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProcedureDataSet_Properties()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UserAttribute#getProcedureDataSets
     * @model opposite="ProcedureDataSets" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProcedureDataSet.Properties' kind='element'"
     * @generated
     */
    EList< UserAttribute > getProperties();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getProperties <em>Properties</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProperties()
     * @see #getProperties()
     * @generated
     */
    void unsetProperties();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getProperties <em>Properties</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Properties</em>' reference list is set.
     * @see #unsetProperties()
     * @see #getProperties()
     * @generated
     */
    boolean isSetProperties();

    /**
     * Returns the value of the '<em><b>Procedure</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Procedure#getProcedureDataSets <em>Procedure Data Sets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedure</em>' reference.
     * @see #isSetProcedure()
     * @see #unsetProcedure()
     * @see #setProcedure(Procedure)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProcedureDataSet_Procedure()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Procedure#getProcedureDataSets
     * @model opposite="ProcedureDataSets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProcedureDataSet.Procedure' kind='element'"
     * @generated
     */
    Procedure getProcedure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Procedure</em>' reference.
     * @see #isSetProcedure()
     * @see #unsetProcedure()
     * @see #getProcedure()
     * @generated
     */
    void setProcedure( Procedure value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcedure()
     * @see #getProcedure()
     * @see #setProcedure(Procedure)
     * @generated
     */
    void unsetProcedure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Procedure</em>' reference is set.
     * @see #unsetProcedure()
     * @see #getProcedure()
     * @see #setProcedure(Procedure)
     * @generated
     */
    boolean isSetProcedure();

    /**
     * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Values</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Values</em>' reference list.
     * @see #isSetMeasurementValues()
     * @see #unsetMeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProcedureDataSet_MeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue#getProcedureDataSets
     * @model opposite="ProcedureDataSets" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProcedureDataSet.MeasurementValues' kind='element'"
     * @generated
     */
    EList< MeasurementValue > getMeasurementValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValues()
     * @see #getMeasurementValues()
     * @generated
     */
    void unsetMeasurementValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Values</em>' reference list is set.
     * @see #unsetMeasurementValues()
     * @see #getMeasurementValues()
     * @generated
     */
    boolean isSetMeasurementValues();

} // ProcedureDataSet
