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
 * A representation of the model object '<em><b>Wind Aero Const IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroConstIEC#getWindGenTurbineType1IEC <em>Wind Gen Turbine Type1 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroConstIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindAeroConstIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type1 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType1IEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Turbine Type1 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type1 IEC</em>' reference.
     * @see #isSetWindGenTurbineType1IEC()
     * @see #unsetWindGenTurbineType1IEC()
     * @see #setWindGenTurbineType1IEC(WindGenTurbineType1IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroConstIEC_WindGenTurbineType1IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType1IEC#getWindAeroConstIEC
     * @model opposite="WindAeroConstIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindAeroConstIEC.WindGenTurbineType1IEC' kind='element'"
     * @generated
     */
    WindGenTurbineType1IEC getWindGenTurbineType1IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroConstIEC#getWindGenTurbineType1IEC <em>Wind Gen Turbine Type1 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type1 IEC</em>' reference.
     * @see #isSetWindGenTurbineType1IEC()
     * @see #unsetWindGenTurbineType1IEC()
     * @see #getWindGenTurbineType1IEC()
     * @generated
     */
    void setWindGenTurbineType1IEC( WindGenTurbineType1IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroConstIEC#getWindGenTurbineType1IEC <em>Wind Gen Turbine Type1 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType1IEC()
     * @see #getWindGenTurbineType1IEC()
     * @see #setWindGenTurbineType1IEC(WindGenTurbineType1IEC)
     * @generated
     */
    void unsetWindGenTurbineType1IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroConstIEC#getWindGenTurbineType1IEC <em>Wind Gen Turbine Type1 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type1 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType1IEC()
     * @see #getWindGenTurbineType1IEC()
     * @see #setWindGenTurbineType1IEC(WindGenTurbineType1IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType1IEC();

} // WindAeroConstIEC
