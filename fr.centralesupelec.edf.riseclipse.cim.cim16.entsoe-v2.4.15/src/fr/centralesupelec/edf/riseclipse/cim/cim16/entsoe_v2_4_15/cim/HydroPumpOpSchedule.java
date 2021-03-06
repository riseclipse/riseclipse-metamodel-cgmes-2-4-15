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
 * A representation of the model object '<em><b>Hydro Pump Op Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getHydroPumpOpSchedule()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface HydroPumpOpSchedule extends RegularIntervalSchedule {
    /**
     * Returns the value of the '<em><b>Hydro Pump</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Pump</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Pump</em>' reference.
     * @see #isSetHydroPump()
     * @see #unsetHydroPump()
     * @see #setHydroPump(HydroPump)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getHydroPumpOpSchedule_HydroPump()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroPump#getHydroPumpOpSchedule
     * @model opposite="HydroPumpOpSchedule" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='HydroPumpOpSchedule.HydroPump' kind='element'"
     * @generated
     */
    HydroPump getHydroPump();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Pump</em>' reference.
     * @see #isSetHydroPump()
     * @see #unsetHydroPump()
     * @see #getHydroPump()
     * @generated
     */
    void setHydroPump( HydroPump value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPump()
     * @see #getHydroPump()
     * @see #setHydroPump(HydroPump)
     * @generated
     */
    void unsetHydroPump();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Pump</em>' reference is set.
     * @see #unsetHydroPump()
     * @see #getHydroPump()
     * @see #setHydroPump(HydroPump)
     * @generated
     */
    boolean isSetHydroPump();

} // HydroPumpOpSchedule
