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
 * A representation of the model object '<em><b>Line Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getLengthFromTerminal1 <em>Length From Terminal1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getACLineSegment <em>AC Line Segment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getLineFault()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface LineFault extends Fault {
    /**
     * Returns the value of the '<em><b>Length From Terminal1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length From Terminal1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length From Terminal1</em>' attribute.
     * @see #isSetLengthFromTerminal1()
     * @see #unsetLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getLineFault_LengthFromTerminal1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='LineFault.lengthFromTerminal1' kind='element'"
     * @generated
     */
    Float getLengthFromTerminal1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length From Terminal1</em>' attribute.
     * @see #isSetLengthFromTerminal1()
     * @see #unsetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @generated
     */
    void setLengthFromTerminal1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Float)
     * @generated
     */
    void unsetLengthFromTerminal1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Length From Terminal1</em>' attribute is set.
     * @see #unsetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Float)
     * @generated
     */
    boolean isSetLengthFromTerminal1();

    /**
     * Returns the value of the '<em><b>AC Line Segment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ACLineSegment#getLineFaults <em>Line Faults</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AC Line Segment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>AC Line Segment</em>' reference.
     * @see #isSetACLineSegment()
     * @see #unsetACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getLineFault_ACLineSegment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ACLineSegment#getLineFaults
     * @model opposite="LineFaults" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='LineFault.ACLineSegment' kind='element'"
     * @generated
     */
    ACLineSegment getACLineSegment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getACLineSegment <em>AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AC Line Segment</em>' reference.
     * @see #isSetACLineSegment()
     * @see #unsetACLineSegment()
     * @see #getACLineSegment()
     * @generated
     */
    void setACLineSegment( ACLineSegment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getACLineSegment <em>AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetACLineSegment()
     * @see #getACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @generated
     */
    void unsetACLineSegment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LineFault#getACLineSegment <em>AC Line Segment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AC Line Segment</em>' reference is set.
     * @see #unsetACLineSegment()
     * @see #getACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @generated
     */
    boolean isSetACLineSegment();

} // LineFault
