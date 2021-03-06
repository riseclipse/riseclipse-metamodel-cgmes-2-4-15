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
 * A representation of the model object '<em><b>Phase Tap Changer Asymmetrical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPhaseTapChangerAsymmetrical()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface PhaseTapChangerAsymmetrical extends PhaseTapChangerNonLinear {
    /**
     * Returns the value of the '<em><b>Winding Connection Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Winding Connection Angle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Winding Connection Angle</em>' attribute.
     * @see #isSetWindingConnectionAngle()
     * @see #unsetWindingConnectionAngle()
     * @see #setWindingConnectionAngle(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPhaseTapChangerAsymmetrical_WindingConnectionAngle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PhaseTapChangerAsymmetrical.windingConnectionAngle' kind='element'"
     * @generated
     */
    Float getWindingConnectionAngle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Winding Connection Angle</em>' attribute.
     * @see #isSetWindingConnectionAngle()
     * @see #unsetWindingConnectionAngle()
     * @see #getWindingConnectionAngle()
     * @generated
     */
    void setWindingConnectionAngle( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindingConnectionAngle()
     * @see #getWindingConnectionAngle()
     * @see #setWindingConnectionAngle(Float)
     * @generated
     */
    void unsetWindingConnectionAngle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Winding Connection Angle</em>' attribute is set.
     * @see #unsetWindingConnectionAngle()
     * @see #getWindingConnectionAngle()
     * @see #setWindingConnectionAngle(Float)
     * @generated
     */
    boolean isSetWindingConnectionAngle();

} // PhaseTapChangerAsymmetrical
