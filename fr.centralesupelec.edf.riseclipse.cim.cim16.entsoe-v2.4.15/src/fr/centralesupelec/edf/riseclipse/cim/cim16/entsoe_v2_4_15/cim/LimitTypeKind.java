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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Limit Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getLimitTypeKind()
 * @model extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1'"
 * @generated
 */
public enum LimitTypeKind implements Enumerator {
    /**
     * The '<em><b>Patl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATL_VALUE
     * @generated
     * @ordered
     */
    PATL( 0, "patl", "patl" ),

    /**
     * The '<em><b>Patlt</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATLT_VALUE
     * @generated
     * @ordered
     */
    PATLT( 1, "patlt", "patlt" ),

    /**
     * The '<em><b>Tatl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TATL_VALUE
     * @generated
     * @ordered
     */
    TATL( 2, "tatl", "tatl" ),

    /**
     * The '<em><b>Tc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TC_VALUE
     * @generated
     * @ordered
     */
    TC( 3, "tc", "tc" ),

    /**
     * The '<em><b>Tct</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TCT_VALUE
     * @generated
     * @ordered
     */
    TCT( 4, "tct", "tct" ),

    /**
     * The '<em><b>High Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    HIGH_VOLTAGE( 5, "highVoltage", "highVoltage" ),

    /**
     * The '<em><b>Low Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOW_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    LOW_VOLTAGE( 6, "lowVoltage", "lowVoltage" );

    /**
     * The '<em><b>Patl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Patl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PATL
     * @model name="patl"
     * @generated
     * @ordered
     */
    public static final int PATL_VALUE = 0;

    /**
     * The '<em><b>Patlt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Patlt</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PATLT
     * @model name="patlt"
     * @generated
     * @ordered
     */
    public static final int PATLT_VALUE = 1;

    /**
     * The '<em><b>Tatl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tatl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TATL
     * @model name="tatl"
     * @generated
     * @ordered
     */
    public static final int TATL_VALUE = 2;

    /**
     * The '<em><b>Tc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TC
     * @model name="tc"
     * @generated
     * @ordered
     */
    public static final int TC_VALUE = 3;

    /**
     * The '<em><b>Tct</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tct</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TCT
     * @model name="tct"
     * @generated
     * @ordered
     */
    public static final int TCT_VALUE = 4;

    /**
     * The '<em><b>High Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH_VOLTAGE
     * @model name="highVoltage"
     * @generated
     * @ordered
     */
    public static final int HIGH_VOLTAGE_VALUE = 5;

    /**
     * The '<em><b>Low Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Low Voltage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOW_VOLTAGE
     * @model name="lowVoltage"
     * @generated
     * @ordered
     */
    public static final int LOW_VOLTAGE_VALUE = 6;

    /**
     * An array of all the '<em><b>Limit Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final LimitTypeKind[] VALUES_ARRAY = new LimitTypeKind[] { PATL, PATLT, TATL, TC, TCT, HIGH_VOLTAGE,
            LOW_VOLTAGE, };

    /**
     * A public read-only list of all the '<em><b>Limit Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< LimitTypeKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Limit Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LimitTypeKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            LimitTypeKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Limit Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LimitTypeKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            LimitTypeKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Limit Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LimitTypeKind get( int value ) {
        switch( value ) {
        case PATL_VALUE:
            return PATL;
        case PATLT_VALUE:
            return PATLT;
        case TATL_VALUE:
            return TATL;
        case TC_VALUE:
            return TC;
        case TCT_VALUE:
            return TCT;
        case HIGH_VOLTAGE_VALUE:
            return HIGH_VOLTAGE;
        case LOW_VOLTAGE_VALUE:
            return LOW_VOLTAGE;
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
    private LimitTypeKind( int value, String name, String literal ) {
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

} //LimitTypeKind
