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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAnalogControl()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface AnalogControl extends Control {
    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #setMaxValue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAnalogControl_MaxValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AnalogControl.maxValue' kind='element'"
     * @generated
     */
    Float getMaxValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(Float)
     * @generated
     */
    void unsetMaxValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMaxValue <em>Max Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Value</em>' attribute is set.
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(Float)
     * @generated
     */
    boolean isSetMaxValue();

    /**
     * Returns the value of the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #setMinValue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAnalogControl_MinValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AnalogControl.minValue' kind='element'"
     * @generated
     */
    Float getMinValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @generated
     */
    void setMinValue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(Float)
     * @generated
     */
    void unsetMinValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getMinValue <em>Min Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Value</em>' attribute is set.
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(Float)
     * @generated
     */
    boolean isSetMinValue();

    /**
     * Returns the value of the '<em><b>Analog Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analog Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analog Value</em>' reference.
     * @see #isSetAnalogValue()
     * @see #unsetAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAnalogControl_AnalogValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogValue#getAnalogControl
     * @model opposite="AnalogControl" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AnalogControl.AnalogValue' kind='element'"
     * @generated
     */
    AnalogValue getAnalogValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analog Value</em>' reference.
     * @see #isSetAnalogValue()
     * @see #unsetAnalogValue()
     * @see #getAnalogValue()
     * @generated
     */
    void setAnalogValue( AnalogValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogValue()
     * @see #getAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @generated
     */
    void unsetAnalogValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog Value</em>' reference is set.
     * @see #unsetAnalogValue()
     * @see #getAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @generated
     */
    boolean isSetAnalogValue();

} // AnalogControl
