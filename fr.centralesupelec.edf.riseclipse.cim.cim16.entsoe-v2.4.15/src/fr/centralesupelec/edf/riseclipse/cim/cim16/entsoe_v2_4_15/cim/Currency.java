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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Currency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCurrency()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public enum Currency implements Enumerator {
    /**
     * The '<em><b>USD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USD_VALUE
     * @generated
     * @ordered
     */
    USD( 0, "USD", "USD" ),

    /**
     * The '<em><b>EUR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EUR_VALUE
     * @generated
     * @ordered
     */
    EUR( 1, "EUR", "EUR" ),

    /**
     * The '<em><b>AUD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AUD_VALUE
     * @generated
     * @ordered
     */
    AUD( 2, "AUD", "AUD" ),

    /**
     * The '<em><b>CAD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CAD_VALUE
     * @generated
     * @ordered
     */
    CAD( 3, "CAD", "CAD" ),

    /**
     * The '<em><b>CHF</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHF_VALUE
     * @generated
     * @ordered
     */
    CHF( 4, "CHF", "CHF" ),

    /**
     * The '<em><b>CNY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CNY_VALUE
     * @generated
     * @ordered
     */
    CNY( 5, "CNY", "CNY" ),

    /**
     * The '<em><b>DKK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DKK_VALUE
     * @generated
     * @ordered
     */
    DKK( 6, "DKK", "DKK" ),

    /**
     * The '<em><b>GBP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GBP_VALUE
     * @generated
     * @ordered
     */
    GBP( 7, "GBP", "GBP" ),

    /**
     * The '<em><b>JPY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPY_VALUE
     * @generated
     * @ordered
     */
    JPY( 8, "JPY", "JPY" ),

    /**
     * The '<em><b>NOK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOK_VALUE
     * @generated
     * @ordered
     */
    NOK( 9, "NOK", "NOK" ),

    /**
     * The '<em><b>RUR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RUR_VALUE
     * @generated
     * @ordered
     */
    RUR( 10, "RUR", "RUR" ),

    /**
     * The '<em><b>SEK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEK_VALUE
     * @generated
     * @ordered
     */
    SEK( 11, "SEK", "SEK" ),

    /**
     * The '<em><b>INR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INR_VALUE
     * @generated
     * @ordered
     */
    INR( 12, "INR", "INR" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 13, "other", "other" );

    /**
     * The '<em><b>USD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>USD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #USD
     * @model
     * @generated
     * @ordered
     */
    public static final int USD_VALUE = 0;

    /**
     * The '<em><b>EUR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EUR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EUR
     * @model
     * @generated
     * @ordered
     */
    public static final int EUR_VALUE = 1;

    /**
     * The '<em><b>AUD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>AUD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AUD
     * @model
     * @generated
     * @ordered
     */
    public static final int AUD_VALUE = 2;

    /**
     * The '<em><b>CAD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CAD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CAD
     * @model
     * @generated
     * @ordered
     */
    public static final int CAD_VALUE = 3;

    /**
     * The '<em><b>CHF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CHF</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHF
     * @model
     * @generated
     * @ordered
     */
    public static final int CHF_VALUE = 4;

    /**
     * The '<em><b>CNY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CNY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CNY
     * @model
     * @generated
     * @ordered
     */
    public static final int CNY_VALUE = 5;

    /**
     * The '<em><b>DKK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DKK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DKK
     * @model
     * @generated
     * @ordered
     */
    public static final int DKK_VALUE = 6;

    /**
     * The '<em><b>GBP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GBP</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GBP
     * @model
     * @generated
     * @ordered
     */
    public static final int GBP_VALUE = 7;

    /**
     * The '<em><b>JPY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPY
     * @model
     * @generated
     * @ordered
     */
    public static final int JPY_VALUE = 8;

    /**
     * The '<em><b>NOK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOK
     * @model
     * @generated
     * @ordered
     */
    public static final int NOK_VALUE = 9;

    /**
     * The '<em><b>RUR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RUR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RUR
     * @model
     * @generated
     * @ordered
     */
    public static final int RUR_VALUE = 10;

    /**
     * The '<em><b>SEK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SEK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEK
     * @model
     * @generated
     * @ordered
     */
    public static final int SEK_VALUE = 11;

    /**
     * The '<em><b>INR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>INR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INR
     * @model
     * @generated
     * @ordered
     */
    public static final int INR_VALUE = 12;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 13;

    /**
     * An array of all the '<em><b>Currency</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Currency[] VALUES_ARRAY = new Currency[] {
            USD,
            EUR,
            AUD,
            CAD,
            CHF,
            CNY,
            DKK,
            GBP,
            JPY,
            NOK,
            RUR,
            SEK,
            INR,
            OTHER,
    };

    /**
     * A public read-only list of all the '<em><b>Currency</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< Currency > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Currency</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Currency get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            Currency result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Currency</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Currency getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            Currency result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Currency</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Currency get( int value ) {
        switch( value ) {
        case USD_VALUE:
            return USD;
        case EUR_VALUE:
            return EUR;
        case AUD_VALUE:
            return AUD;
        case CAD_VALUE:
            return CAD;
        case CHF_VALUE:
            return CHF;
        case CNY_VALUE:
            return CNY;
        case DKK_VALUE:
            return DKK;
        case GBP_VALUE:
            return GBP;
        case JPY_VALUE:
            return JPY;
        case NOK_VALUE:
            return NOK;
        case RUR_VALUE:
            return RUR;
        case SEK_VALUE:
            return SEK;
        case INR_VALUE:
            return INR;
        case OTHER_VALUE:
            return OTHER;
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
    private Currency( int value, String name, String literal ) {
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

} //Currency
