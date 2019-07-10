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
 * A representation of the model object '<em><b>Safety Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getSafetyDocument()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface SafetyDocument extends Document {
    /**
     * Returns the value of the '<em><b>Switching Plan</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan#getSafetyDocuments <em>Safety Documents</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Plan</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Plan</em>' reference.
     * @see #isSetSwitchingPlan()
     * @see #unsetSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getSafetyDocument_SwitchingPlan()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan#getSafetyDocuments
     * @model opposite="SafetyDocuments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='SafetyDocument.SwitchingPlan' kind='element'"
     * @generated
     */
    SwitchingPlan getSwitchingPlan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switching Plan</em>' reference.
     * @see #isSetSwitchingPlan()
     * @see #unsetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @generated
     */
    void setSwitchingPlan( SwitchingPlan value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    void unsetSwitchingPlan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SafetyDocument#getSwitchingPlan <em>Switching Plan</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Plan</em>' reference is set.
     * @see #unsetSwitchingPlan()
     * @see #getSwitchingPlan()
     * @see #setSwitchingPlan(SwitchingPlan)
     * @generated
     */
    boolean isSetSwitchingPlan();

} // SafetyDocument
