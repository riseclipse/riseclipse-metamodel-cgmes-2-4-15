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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Regulating Control Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getRegulatingControlModeKind()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public enum RegulatingControlModeKind implements Enumerator {
    /**
     * The '<em><b>Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE( 0, "voltage", "voltage" ),

    /**
     * The '<em><b>Active Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    ACTIVE_POWER( 1, "activePower", "activePower" ),

    /**
     * The '<em><b>Reactive Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    REACTIVE_POWER( 2, "reactivePower", "reactivePower" ),

    /**
     * The '<em><b>Current Flow</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENT_FLOW_VALUE
     * @generated
     * @ordered
     */
    CURRENT_FLOW( 3, "currentFlow", "currentFlow" ),

    /**
     * The '<em><b>Admittance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ADMITTANCE_VALUE
     * @generated
     * @ordered
     */
    ADMITTANCE( 4, "admittance", "admittance" ),

    /**
     * The '<em><b>Time Scheduled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_SCHEDULED_VALUE
     * @generated
     * @ordered
     */
    TIME_SCHEDULED( 5, "timeScheduled", "timeScheduled" ),

    /**
     * The '<em><b>Temperature</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TEMPERATURE_VALUE
     * @generated
     * @ordered
     */
    TEMPERATURE( 6, "temperature", "temperature" ),

    /**
     * The '<em><b>Power Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    POWER_FACTOR( 7, "powerFactor", "powerFactor" );

    /**
     * The '<em><b>Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLTAGE
     * @model name="voltage"
     * @generated
     * @ordered
     */
    public static final int VOLTAGE_VALUE = 0;

    /**
     * The '<em><b>Active Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Active Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ACTIVE_POWER
     * @model name="activePower"
     * @generated
     * @ordered
     */
    public static final int ACTIVE_POWER_VALUE = 1;

    /**
     * The '<em><b>Reactive Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reactive Power</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REACTIVE_POWER
     * @model name="reactivePower"
     * @generated
     * @ordered
     */
    public static final int REACTIVE_POWER_VALUE = 2;

    /**
     * The '<em><b>Current Flow</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Current Flow</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENT_FLOW
     * @model name="currentFlow"
     * @generated
     * @ordered
     */
    public static final int CURRENT_FLOW_VALUE = 3;

    /**
     * The '<em><b>Admittance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Admittance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ADMITTANCE
     * @model name="admittance"
     * @generated
     * @ordered
     */
    public static final int ADMITTANCE_VALUE = 4;

    /**
     * The '<em><b>Time Scheduled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Time Scheduled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TIME_SCHEDULED
     * @model name="timeScheduled"
     * @generated
     * @ordered
     */
    public static final int TIME_SCHEDULED_VALUE = 5;

    /**
     * The '<em><b>Temperature</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TEMPERATURE
     * @model name="temperature"
     * @generated
     * @ordered
     */
    public static final int TEMPERATURE_VALUE = 6;

    /**
     * The '<em><b>Power Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Factor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR
     * @model name="powerFactor"
     * @generated
     * @ordered
     */
    public static final int POWER_FACTOR_VALUE = 7;

    /**
     * An array of all the '<em><b>Regulating Control Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final RegulatingControlModeKind[] VALUES_ARRAY = new RegulatingControlModeKind[] {
            VOLTAGE,
            ACTIVE_POWER,
            REACTIVE_POWER,
            CURRENT_FLOW,
            ADMITTANCE,
            TIME_SCHEDULED,
            TEMPERATURE,
            POWER_FACTOR,
    };

    /**
     * A public read-only list of all the '<em><b>Regulating Control Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< RegulatingControlModeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RegulatingControlModeKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RegulatingControlModeKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RegulatingControlModeKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RegulatingControlModeKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RegulatingControlModeKind get( int value ) {
        switch( value ) {
        case VOLTAGE_VALUE:
            return VOLTAGE;
        case ACTIVE_POWER_VALUE:
            return ACTIVE_POWER;
        case REACTIVE_POWER_VALUE:
            return REACTIVE_POWER;
        case CURRENT_FLOW_VALUE:
            return CURRENT_FLOW;
        case ADMITTANCE_VALUE:
            return ADMITTANCE;
        case TIME_SCHEDULED_VALUE:
            return TIME_SCHEDULED;
        case TEMPERATURE_VALUE:
            return TEMPERATURE;
        case POWER_FACTOR_VALUE:
            return POWER_FACTOR;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private RegulatingControlModeKind( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //RegulatingControlModeKind
