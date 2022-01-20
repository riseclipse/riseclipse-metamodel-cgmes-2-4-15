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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getFormNumber <em>Form Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterMultipliers <em>Meter Multipliers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getVendingTransactions <em>Vending Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterServiceWorks <em>Meter Service Works</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReplacementWorks <em>Meter Replacement Works</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeter()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface Meter extends EndDevice {
    /**
     * Returns the value of the '<em><b>Form Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Form Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Form Number</em>' attribute.
     * @see #isSetFormNumber()
     * @see #unsetFormNumber()
     * @see #setFormNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeter_FormNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Meter.formNumber' kind='element'"
     * @generated
     */
    String getFormNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getFormNumber <em>Form Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Form Number</em>' attribute.
     * @see #isSetFormNumber()
     * @see #unsetFormNumber()
     * @see #getFormNumber()
     * @generated
     */
    void setFormNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getFormNumber <em>Form Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFormNumber()
     * @see #getFormNumber()
     * @see #setFormNumber(String)
     * @generated
     */
    void unsetFormNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getFormNumber <em>Form Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Form Number</em>' attribute is set.
     * @see #unsetFormNumber()
     * @see #getFormNumber()
     * @see #setFormNumber(String)
     * @generated
     */
    boolean isSetFormNumber();

    /**
     * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getMeter <em>Meter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter Readings</em>' reference list.
     * @see #isSetMeterReadings()
     * @see #unsetMeterReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeter_MeterReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getMeter
     * @model opposite="Meter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Meter.MeterReadings' kind='element'"
     * @generated
     */
    EList< MeterReading > getMeterReadings();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReadings <em>Meter Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeterReadings()
     * @see #getMeterReadings()
     * @generated
     */
    void unsetMeterReadings();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReadings <em>Meter Readings</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter Readings</em>' reference list is set.
     * @see #unsetMeterReadings()
     * @see #getMeterReadings()
     * @generated
     */
    boolean isSetMeterReadings();

    /**
     * Returns the value of the '<em><b>Meter Service Works</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork#getMeter <em>Meter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter Service Works</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter Service Works</em>' reference list.
     * @see #isSetMeterServiceWorks()
     * @see #unsetMeterServiceWorks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeter_MeterServiceWorks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork#getMeter
     * @model opposite="Meter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Meter.MeterServiceWorks' kind='element'"
     * @generated
     */
    EList< MeterServiceWork > getMeterServiceWorks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterServiceWorks <em>Meter Service Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeterServiceWorks()
     * @see #getMeterServiceWorks()
     * @generated
     */
    void unsetMeterServiceWorks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterServiceWorks <em>Meter Service Works</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter Service Works</em>' reference list is set.
     * @see #unsetMeterServiceWorks()
     * @see #getMeterServiceWorks()
     * @generated
     */
    boolean isSetMeterServiceWorks();

    /**
     * Returns the value of the '<em><b>Vending Transactions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Transaction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Transaction#getMeter <em>Meter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vending Transactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vending Transactions</em>' reference list.
     * @see #isSetVendingTransactions()
     * @see #unsetVendingTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeter_VendingTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Transaction#getMeter
     * @model opposite="Meter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Meter.VendingTransactions' kind='element'"
     * @generated
     */
    EList< Transaction > getVendingTransactions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getVendingTransactions <em>Vending Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVendingTransactions()
     * @see #getVendingTransactions()
     * @generated
     */
    void unsetVendingTransactions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getVendingTransactions <em>Vending Transactions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vending Transactions</em>' reference list is set.
     * @see #unsetVendingTransactions()
     * @see #getVendingTransactions()
     * @generated
     */
    boolean isSetVendingTransactions();

    /**
     * Returns the value of the '<em><b>Meter Replacement Works</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork#getOldMeter <em>Old Meter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter Replacement Works</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter Replacement Works</em>' reference list.
     * @see #isSetMeterReplacementWorks()
     * @see #unsetMeterReplacementWorks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeter_MeterReplacementWorks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork#getOldMeter
     * @model opposite="OldMeter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Meter.MeterReplacementWorks' kind='element'"
     * @generated
     */
    EList< MeterServiceWork > getMeterReplacementWorks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReplacementWorks <em>Meter Replacement Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeterReplacementWorks()
     * @see #getMeterReplacementWorks()
     * @generated
     */
    void unsetMeterReplacementWorks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterReplacementWorks <em>Meter Replacement Works</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter Replacement Works</em>' reference list is set.
     * @see #unsetMeterReplacementWorks()
     * @see #getMeterReplacementWorks()
     * @generated
     */
    boolean isSetMeterReplacementWorks();

    /**
     * Returns the value of the '<em><b>Meter Multipliers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterMultiplier}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterMultiplier#getMeter <em>Meter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter Multipliers</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter Multipliers</em>' reference list.
     * @see #isSetMeterMultipliers()
     * @see #unsetMeterMultipliers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getMeter_MeterMultipliers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterMultiplier#getMeter
     * @model opposite="Meter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Meter.MeterMultipliers' kind='element'"
     * @generated
     */
    EList< MeterMultiplier > getMeterMultipliers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterMultipliers <em>Meter Multipliers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeterMultipliers()
     * @see #getMeterMultipliers()
     * @generated
     */
    void unsetMeterMultipliers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter#getMeterMultipliers <em>Meter Multipliers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter Multipliers</em>' reference list is set.
     * @see #unsetMeterMultipliers()
     * @see #getMeterMultipliers()
     * @generated
     */
    boolean isSetMeterMultipliers();

} // Meter
