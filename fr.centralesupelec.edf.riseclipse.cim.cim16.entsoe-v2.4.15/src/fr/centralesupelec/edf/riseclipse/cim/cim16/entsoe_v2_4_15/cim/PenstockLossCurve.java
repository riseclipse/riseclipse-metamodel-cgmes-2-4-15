/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Penstock Loss Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPenstockLossCurve()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface PenstockLossCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Hydro Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Generating Unit</em>' reference.
     * @see #isSetHydroGeneratingUnit()
     * @see #unsetHydroGeneratingUnit()
     * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPenstockLossCurve_HydroGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.HydroGeneratingUnit#getPenstockLossCurve
     * @model opposite="PenstockLossCurve" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PenstockLossCurve.HydroGeneratingUnit' kind='element'"
     * @generated
     */
    HydroGeneratingUnit getHydroGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Generating Unit</em>' reference.
     * @see #isSetHydroGeneratingUnit()
     * @see #unsetHydroGeneratingUnit()
     * @see #getHydroGeneratingUnit()
     * @generated
     */
    void setHydroGeneratingUnit( HydroGeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroGeneratingUnit()
     * @see #getHydroGeneratingUnit()
     * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
     * @generated
     */
    void unsetHydroGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Generating Unit</em>' reference is set.
     * @see #unsetHydroGeneratingUnit()
     * @see #getHydroGeneratingUnit()
     * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
     * @generated
     */
    boolean isSetHydroGeneratingUnit();

} // PenstockLossCurve
