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
 * A representation of the model object '<em><b>Wind Gen Turbine Type1 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType1IEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType1IEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindGenTurbineType1IEC extends WindTurbineType1or2IEC {
    /**
     * Returns the value of the '<em><b>Wind Aero Const IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroConstIEC#getWindGenTurbineType1IEC <em>Wind Gen Turbine Type1 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Aero Const IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Aero Const IEC</em>' reference.
     * @see #isSetWindAeroConstIEC()
     * @see #unsetWindAeroConstIEC()
     * @see #setWindAeroConstIEC(WindAeroConstIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType1IEC_WindAeroConstIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroConstIEC#getWindGenTurbineType1IEC
     * @model opposite="WindGenTurbineType1IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindGenTurbineType1IEC.WindAeroConstIEC' kind='element'"
     * @generated
     */
    WindAeroConstIEC getWindAeroConstIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType1IEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Aero Const IEC</em>' reference.
     * @see #isSetWindAeroConstIEC()
     * @see #unsetWindAeroConstIEC()
     * @see #getWindAeroConstIEC()
     * @generated
     */
    void setWindAeroConstIEC( WindAeroConstIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType1IEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindAeroConstIEC()
     * @see #getWindAeroConstIEC()
     * @see #setWindAeroConstIEC(WindAeroConstIEC)
     * @generated
     */
    void unsetWindAeroConstIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType1IEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Aero Const IEC</em>' reference is set.
     * @see #unsetWindAeroConstIEC()
     * @see #getWindAeroConstIEC()
     * @see #setWindAeroConstIEC(WindAeroConstIEC)
     * @generated
     */
    boolean isSetWindAeroConstIEC();

} // WindGenTurbineType1IEC
