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
 * A representation of the literals of the enumeration '<em><b>Cheque Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getChequeKind()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public enum ChequeKind implements Enumerator {
    /**
     * The '<em><b>Postal Order</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POSTAL_ORDER_VALUE
     * @generated
     * @ordered
     */
    POSTAL_ORDER( 0, "postalOrder", "postalOrder" ),

    /**
     * The '<em><b>Bank Order</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BANK_ORDER_VALUE
     * @generated
     * @ordered
     */
    BANK_ORDER( 1, "bankOrder", "bankOrder" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 2, "other", "other" );

    /**
     * The '<em><b>Postal Order</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Postal Order</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POSTAL_ORDER
     * @model name="postalOrder"
     * @generated
     * @ordered
     */
    public static final int POSTAL_ORDER_VALUE = 0;

    /**
     * The '<em><b>Bank Order</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bank Order</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BANK_ORDER
     * @model name="bankOrder"
     * @generated
     * @ordered
     */
    public static final int BANK_ORDER_VALUE = 1;

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
    public static final int OTHER_VALUE = 2;

    /**
     * An array of all the '<em><b>Cheque Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ChequeKind[] VALUES_ARRAY = new ChequeKind[] {
            POSTAL_ORDER,
            BANK_ORDER,
            OTHER,
    };

    /**
     * A public read-only list of all the '<em><b>Cheque Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ChequeKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Cheque Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ChequeKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ChequeKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cheque Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ChequeKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ChequeKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cheque Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ChequeKind get( int value ) {
        switch( value ) {
        case POSTAL_ORDER_VALUE:
            return POSTAL_ORDER;
        case BANK_ORDER_VALUE:
            return BANK_ORDER;
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
    private ChequeKind( int value, String name, String literal ) {
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

} //ChequeKind
