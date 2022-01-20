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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCityCode <em>City Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getExtension <em>Extension</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTelephoneNumber()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface TelephoneNumber extends EObject {
    /**
     * Returns the value of the '<em><b>Area Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Area Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Area Code</em>' attribute.
     * @see #isSetAreaCode()
     * @see #unsetAreaCode()
     * @see #setAreaCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTelephoneNumber_AreaCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TelephoneNumber.areaCode' kind='element'"
     * @generated
     */
    String getAreaCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Area Code</em>' attribute.
     * @see #isSetAreaCode()
     * @see #unsetAreaCode()
     * @see #getAreaCode()
     * @generated
     */
    void setAreaCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAreaCode()
     * @see #getAreaCode()
     * @see #setAreaCode(String)
     * @generated
     */
    void unsetAreaCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Area Code</em>' attribute is set.
     * @see #unsetAreaCode()
     * @see #getAreaCode()
     * @see #setAreaCode(String)
     * @generated
     */
    boolean isSetAreaCode();

    /**
     * Returns the value of the '<em><b>City Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>City Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>City Code</em>' attribute.
     * @see #isSetCityCode()
     * @see #unsetCityCode()
     * @see #setCityCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTelephoneNumber_CityCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TelephoneNumber.cityCode' kind='element'"
     * @generated
     */
    String getCityCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCityCode <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>City Code</em>' attribute.
     * @see #isSetCityCode()
     * @see #unsetCityCode()
     * @see #getCityCode()
     * @generated
     */
    void setCityCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCityCode <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCityCode()
     * @see #getCityCode()
     * @see #setCityCode(String)
     * @generated
     */
    void unsetCityCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCityCode <em>City Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>City Code</em>' attribute is set.
     * @see #unsetCityCode()
     * @see #getCityCode()
     * @see #setCityCode(String)
     * @generated
     */
    boolean isSetCityCode();

    /**
     * Returns the value of the '<em><b>Country Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Country Code</em>' attribute.
     * @see #isSetCountryCode()
     * @see #unsetCountryCode()
     * @see #setCountryCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTelephoneNumber_CountryCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TelephoneNumber.countryCode' kind='element'"
     * @generated
     */
    String getCountryCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Country Code</em>' attribute.
     * @see #isSetCountryCode()
     * @see #unsetCountryCode()
     * @see #getCountryCode()
     * @generated
     */
    void setCountryCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCountryCode()
     * @see #getCountryCode()
     * @see #setCountryCode(String)
     * @generated
     */
    void unsetCountryCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Country Code</em>' attribute is set.
     * @see #unsetCountryCode()
     * @see #getCountryCode()
     * @see #setCountryCode(String)
     * @generated
     */
    boolean isSetCountryCode();

    /**
     * Returns the value of the '<em><b>Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' attribute.
     * @see #isSetExtension()
     * @see #unsetExtension()
     * @see #setExtension(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTelephoneNumber_Extension()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TelephoneNumber.extension' kind='element'"
     * @generated
     */
    String getExtension();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getExtension <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension</em>' attribute.
     * @see #isSetExtension()
     * @see #unsetExtension()
     * @see #getExtension()
     * @generated
     */
    void setExtension( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getExtension <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtension()
     * @see #getExtension()
     * @see #setExtension(String)
     * @generated
     */
    void unsetExtension();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getExtension <em>Extension</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Extension</em>' attribute is set.
     * @see #unsetExtension()
     * @see #getExtension()
     * @see #setExtension(String)
     * @generated
     */
    boolean isSetExtension();

    /**
     * Returns the value of the '<em><b>Local Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Number</em>' attribute.
     * @see #isSetLocalNumber()
     * @see #unsetLocalNumber()
     * @see #setLocalNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTelephoneNumber_LocalNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TelephoneNumber.localNumber' kind='element'"
     * @generated
     */
    String getLocalNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Number</em>' attribute.
     * @see #isSetLocalNumber()
     * @see #unsetLocalNumber()
     * @see #getLocalNumber()
     * @generated
     */
    void setLocalNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocalNumber()
     * @see #getLocalNumber()
     * @see #setLocalNumber(String)
     * @generated
     */
    void unsetLocalNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Local Number</em>' attribute is set.
     * @see #unsetLocalNumber()
     * @see #getLocalNumber()
     * @see #setLocalNumber(String)
     * @generated
     */
    boolean isSetLocalNumber();

} // TelephoneNumber
