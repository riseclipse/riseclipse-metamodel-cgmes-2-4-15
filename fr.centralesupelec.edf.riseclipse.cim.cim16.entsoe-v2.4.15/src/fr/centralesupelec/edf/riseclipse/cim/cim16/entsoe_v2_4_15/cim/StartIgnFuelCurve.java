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
 * A representation of the model object '<em><b>Start Ign Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getStartIgnFuelCurve()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface StartIgnFuelCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Ignition Fuel Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.FuelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ignition Fuel Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ignition Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.FuelType
     * @see #isSetIgnitionFuelType()
     * @see #unsetIgnitionFuelType()
     * @see #setIgnitionFuelType(FuelType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getStartIgnFuelCurve_IgnitionFuelType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='StartIgnFuelCurve.ignitionFuelType' kind='element'"
     * @generated
     */
    FuelType getIgnitionFuelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ignition Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.FuelType
     * @see #isSetIgnitionFuelType()
     * @see #unsetIgnitionFuelType()
     * @see #getIgnitionFuelType()
     * @generated
     */
    void setIgnitionFuelType( FuelType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIgnitionFuelType()
     * @see #getIgnitionFuelType()
     * @see #setIgnitionFuelType(FuelType)
     * @generated
     */
    void unsetIgnitionFuelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ignition Fuel Type</em>' attribute is set.
     * @see #unsetIgnitionFuelType()
     * @see #getIgnitionFuelType()
     * @see #setIgnitionFuelType(FuelType)
     * @generated
     */
    boolean isSetIgnitionFuelType();

    /**
     * Returns the value of the '<em><b>Startup Model</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Model</em>' reference.
     * @see #isSetStartupModel()
     * @see #unsetStartupModel()
     * @see #setStartupModel(StartupModel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getStartIgnFuelCurve_StartupModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartupModel#getStartIgnFuelCurve
     * @model opposite="StartIgnFuelCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='StartIgnFuelCurve.StartupModel' kind='element'"
     * @generated
     */
    StartupModel getStartupModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Model</em>' reference.
     * @see #isSetStartupModel()
     * @see #unsetStartupModel()
     * @see #getStartupModel()
     * @generated
     */
    void setStartupModel( StartupModel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    void unsetStartupModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Model</em>' reference is set.
     * @see #unsetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    boolean isSetStartupModel();

} // StartIgnFuelCurve
