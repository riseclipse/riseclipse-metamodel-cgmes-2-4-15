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
 * A representation of the literals of the enumeration '<em><b>Vs Qpcc Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getVsQpccControlKind()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public enum VsQpccControlKind implements Enumerator {
    /**
     * The '<em><b>Reactive Pcc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REACTIVE_PCC_VALUE
     * @generated
     * @ordered
     */
    REACTIVE_PCC( 0, "reactivePcc", "reactivePcc" ),

    /**
     * The '<em><b>Voltage Pcc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLTAGE_PCC_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE_PCC( 1, "voltagePcc", "voltagePcc" ),

    /**
     * The '<em><b>Power Factor Pcc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR_PCC_VALUE
     * @generated
     * @ordered
     */
    POWER_FACTOR_PCC( 2, "powerFactorPcc", "powerFactorPcc" );

    /**
     * The '<em><b>Reactive Pcc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reactive Pcc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REACTIVE_PCC
     * @model name="reactivePcc"
     * @generated
     * @ordered
     */
    public static final int REACTIVE_PCC_VALUE = 0;

    /**
     * The '<em><b>Voltage Pcc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Voltage Pcc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLTAGE_PCC
     * @model name="voltagePcc"
     * @generated
     * @ordered
     */
    public static final int VOLTAGE_PCC_VALUE = 1;

    /**
     * The '<em><b>Power Factor Pcc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Factor Pcc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR_PCC
     * @model name="powerFactorPcc"
     * @generated
     * @ordered
     */
    public static final int POWER_FACTOR_PCC_VALUE = 2;

    /**
     * An array of all the '<em><b>Vs Qpcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final VsQpccControlKind[] VALUES_ARRAY = new VsQpccControlKind[] {
            REACTIVE_PCC,
            VOLTAGE_PCC,
            POWER_FACTOR_PCC,
    };

    /**
     * A public read-only list of all the '<em><b>Vs Qpcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< VsQpccControlKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Vs Qpcc Control Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsQpccControlKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            VsQpccControlKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Vs Qpcc Control Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsQpccControlKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            VsQpccControlKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Vs Qpcc Control Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsQpccControlKind get( int value ) {
        switch( value ) {
        case REACTIVE_PCC_VALUE:
            return REACTIVE_PCC;
        case VOLTAGE_PCC_VALUE:
            return VOLTAGE_PCC;
        case POWER_FACTOR_PCC_VALUE:
            return POWER_FACTOR_PCC;
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
    private VsQpccControlKind( int value, String name, String literal ) {
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

} //VsQpccControlKind
