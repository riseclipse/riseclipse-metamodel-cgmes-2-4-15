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
 * A representation of the model object '<em><b>Start Main Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getStartMainFuelCurve()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface StartMainFuelCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Main Fuel Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.FuelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Main Fuel Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Main Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.FuelType
     * @see #isSetMainFuelType()
     * @see #unsetMainFuelType()
     * @see #setMainFuelType(FuelType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getStartMainFuelCurve_MainFuelType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='StartMainFuelCurve.mainFuelType' kind='element'"
     * @generated
     */
    FuelType getMainFuelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Main Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.FuelType
     * @see #isSetMainFuelType()
     * @see #unsetMainFuelType()
     * @see #getMainFuelType()
     * @generated
     */
    void setMainFuelType( FuelType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMainFuelType()
     * @see #getMainFuelType()
     * @see #setMainFuelType(FuelType)
     * @generated
     */
    void unsetMainFuelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Main Fuel Type</em>' attribute is set.
     * @see #unsetMainFuelType()
     * @see #getMainFuelType()
     * @see #setMainFuelType(FuelType)
     * @generated
     */
    boolean isSetMainFuelType();

    /**
     * Returns the value of the '<em><b>Startup Model</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getStartMainFuelCurve_StartupModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartupModel#getStartMainFuelCurve
     * @model opposite="StartMainFuelCurve" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='StartMainFuelCurve.StartupModel' kind='element'"
     * @generated
     */
    StartupModel getStartupModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    void unsetStartupModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Model</em>' reference is set.
     * @see #unsetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    boolean isSetStartupModel();

} // StartMainFuelCurve
