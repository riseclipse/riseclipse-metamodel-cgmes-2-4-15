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
 * A representation of the literals of the enumeration '<em><b>Wind Lookup Table Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindLookupTableFunctionKind()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public enum WindLookupTableFunctionKind implements Enumerator {
    /**
     * The '<em><b>Fpslip</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FPSLIP_VALUE
     * @generated
     * @ordered
     */
    FPSLIP( 0, "fpslip", "fpslip" ),

    /**
     * The '<em><b>Fpomega</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FPOMEGA_VALUE
     * @generated
     * @ordered
     */
    FPOMEGA( 1, "fpomega", "fpomega" ),

    /**
     * The '<em><b>Ipvdl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IPVDL_VALUE
     * @generated
     * @ordered
     */
    IPVDL( 2, "ipvdl", "ipvdl" ),

    /**
     * The '<em><b>Iqvdl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IQVDL_VALUE
     * @generated
     * @ordered
     */
    IQVDL( 3, "iqvdl", "iqvdl" ),

    /**
     * The '<em><b>Fdpf</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FDPF_VALUE
     * @generated
     * @ordered
     */
    FDPF( 4, "fdpf", "fdpf" );

    /**
     * The '<em><b>Fpslip</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fpslip</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FPSLIP
     * @model name="fpslip"
     * @generated
     * @ordered
     */
    public static final int FPSLIP_VALUE = 0;

    /**
     * The '<em><b>Fpomega</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fpomega</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FPOMEGA
     * @model name="fpomega"
     * @generated
     * @ordered
     */
    public static final int FPOMEGA_VALUE = 1;

    /**
     * The '<em><b>Ipvdl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ipvdl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IPVDL
     * @model name="ipvdl"
     * @generated
     * @ordered
     */
    public static final int IPVDL_VALUE = 2;

    /**
     * The '<em><b>Iqvdl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Iqvdl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IQVDL
     * @model name="iqvdl"
     * @generated
     * @ordered
     */
    public static final int IQVDL_VALUE = 3;

    /**
     * The '<em><b>Fdpf</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fdpf</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FDPF
     * @model name="fdpf"
     * @generated
     * @ordered
     */
    public static final int FDPF_VALUE = 4;

    /**
     * An array of all the '<em><b>Wind Lookup Table Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WindLookupTableFunctionKind[] VALUES_ARRAY = new WindLookupTableFunctionKind[] {
            FPSLIP,
            FPOMEGA,
            IPVDL,
            IQVDL,
            FDPF,
    };

    /**
     * A public read-only list of all the '<em><b>Wind Lookup Table Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WindLookupTableFunctionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WindLookupTableFunctionKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WindLookupTableFunctionKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind get( int value ) {
        switch( value ) {
        case FPSLIP_VALUE:
            return FPSLIP;
        case FPOMEGA_VALUE:
            return FPOMEGA;
        case IPVDL_VALUE:
            return IPVDL;
        case IQVDL_VALUE:
            return IQVDL;
        case FDPF_VALUE:
            return FDPF;
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
    private WindLookupTableFunctionKind( int value, String name, String literal ) {
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

} //WindLookupTableFunctionKind
