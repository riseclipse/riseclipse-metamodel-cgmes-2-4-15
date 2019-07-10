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
 * A representation of the model object '<em><b>Wind Turbine Type4a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindTurbineType4aIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindTurbineType4aIEC extends WindGenType4IEC {
    /**
     * Returns the value of the '<em><b>Wind Cont PType4a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont PType4a IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont PType4a IEC</em>' reference.
     * @see #isSetWindContPType4aIEC()
     * @see #unsetWindContPType4aIEC()
     * @see #setWindContPType4aIEC(WindContPType4aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindTurbineType4aIEC_WindContPType4aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getWindTurbineType4aIEC
     * @model opposite="WindTurbineType4aIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindTurbineType4aIEC.WindContPType4aIEC' kind='element'"
     * @generated
     */
    WindContPType4aIEC getWindContPType4aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont PType4a IEC</em>' reference.
     * @see #isSetWindContPType4aIEC()
     * @see #unsetWindContPType4aIEC()
     * @see #getWindContPType4aIEC()
     * @generated
     */
    void setWindContPType4aIEC( WindContPType4aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPType4aIEC()
     * @see #getWindContPType4aIEC()
     * @see #setWindContPType4aIEC(WindContPType4aIEC)
     * @generated
     */
    void unsetWindContPType4aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont PType4a IEC</em>' reference is set.
     * @see #unsetWindContPType4aIEC()
     * @see #getWindContPType4aIEC()
     * @see #setWindContPType4aIEC(WindContPType4aIEC)
     * @generated
     */
    boolean isSetWindContPType4aIEC();

} // WindTurbineType4aIEC
