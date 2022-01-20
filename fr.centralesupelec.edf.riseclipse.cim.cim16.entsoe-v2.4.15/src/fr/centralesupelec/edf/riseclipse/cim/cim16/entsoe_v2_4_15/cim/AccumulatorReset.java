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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accumulator Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAccumulatorReset()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface AccumulatorReset extends Control {
    /**
     * Returns the value of the '<em><b>Accumulator Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accumulator Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accumulator Value</em>' reference.
     * @see #isSetAccumulatorValue()
     * @see #unsetAccumulatorValue()
     * @see #setAccumulatorValue(AccumulatorValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAccumulatorReset_AccumulatorValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccumulatorValue#getAccumulatorReset
     * @model opposite="AccumulatorReset" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AccumulatorReset.AccumulatorValue' kind='element'"
     * @generated
     */
    AccumulatorValue getAccumulatorValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulator Value</em>' reference.
     * @see #isSetAccumulatorValue()
     * @see #unsetAccumulatorValue()
     * @see #getAccumulatorValue()
     * @generated
     */
    void setAccumulatorValue( AccumulatorValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulatorValue()
     * @see #getAccumulatorValue()
     * @see #setAccumulatorValue(AccumulatorValue)
     * @generated
     */
    void unsetAccumulatorValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulator Value</em>' reference is set.
     * @see #unsetAccumulatorValue()
     * @see #getAccumulatorValue()
     * @see #setAccumulatorValue(AccumulatorValue)
     * @generated
     */
    boolean isSetAccumulatorValue();

} // AccumulatorReset
