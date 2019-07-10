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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TelephoneNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.TelephoneNumberImpl#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.TelephoneNumberImpl#getCityCode <em>City Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.TelephoneNumberImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.TelephoneNumberImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.TelephoneNumberImpl#getLocalNumber <em>Local Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelephoneNumberImpl extends MinimalEObjectImpl.Container implements TelephoneNumber {
    /**
     * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAreaCode()
     * @generated
     * @ordered
     */
    protected static final String AREA_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAreaCode()
     * @generated
     * @ordered
     */
    protected String areaCode = AREA_CODE_EDEFAULT;

    /**
     * This is true if the Area Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean areaCodeESet;

    /**
     * The default value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCityCode()
     * @generated
     * @ordered
     */
    protected static final String CITY_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCityCode()
     * @generated
     * @ordered
     */
    protected String cityCode = CITY_CODE_EDEFAULT;

    /**
     * This is true if the City Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cityCodeESet;

    /**
     * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountryCode()
     * @generated
     * @ordered
     */
    protected static final String COUNTRY_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountryCode()
     * @generated
     * @ordered
     */
    protected String countryCode = COUNTRY_CODE_EDEFAULT;

    /**
     * This is true if the Country Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean countryCodeESet;

    /**
     * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
    protected static final String EXTENSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
    protected String extension = EXTENSION_EDEFAULT;

    /**
     * This is true if the Extension attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extensionESet;

    /**
     * The default value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalNumber()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalNumber()
     * @generated
     * @ordered
     */
    protected String localNumber = LOCAL_NUMBER_EDEFAULT;

    /**
     * This is true if the Local Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean localNumberESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TelephoneNumberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTelephoneNumber();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAreaCode( String newAreaCode ) {
        String oldAreaCode = areaCode;
        areaCode = newAreaCode;
        boolean oldAreaCodeESet = areaCodeESet;
        areaCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TELEPHONE_NUMBER__AREA_CODE, oldAreaCode,
                    areaCode, !oldAreaCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAreaCode() {
        String oldAreaCode = areaCode;
        boolean oldAreaCodeESet = areaCodeESet;
        areaCode = AREA_CODE_EDEFAULT;
        areaCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__AREA_CODE,
                    oldAreaCode, AREA_CODE_EDEFAULT, oldAreaCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAreaCode() {
        return areaCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCityCode() {
        return cityCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCityCode( String newCityCode ) {
        String oldCityCode = cityCode;
        cityCode = newCityCode;
        boolean oldCityCodeESet = cityCodeESet;
        cityCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TELEPHONE_NUMBER__CITY_CODE, oldCityCode,
                    cityCode, !oldCityCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCityCode() {
        String oldCityCode = cityCode;
        boolean oldCityCodeESet = cityCodeESet;
        cityCode = CITY_CODE_EDEFAULT;
        cityCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__CITY_CODE,
                    oldCityCode, CITY_CODE_EDEFAULT, oldCityCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCityCode() {
        return cityCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCountryCode( String newCountryCode ) {
        String oldCountryCode = countryCode;
        countryCode = newCountryCode;
        boolean oldCountryCodeESet = countryCodeESet;
        countryCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE,
                    oldCountryCode, countryCode, !oldCountryCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCountryCode() {
        String oldCountryCode = countryCode;
        boolean oldCountryCodeESet = countryCodeESet;
        countryCode = COUNTRY_CODE_EDEFAULT;
        countryCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE,
                    oldCountryCode, COUNTRY_CODE_EDEFAULT, oldCountryCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCountryCode() {
        return countryCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtension() {
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtension( String newExtension ) {
        String oldExtension = extension;
        extension = newExtension;
        boolean oldExtensionESet = extensionESet;
        extensionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TELEPHONE_NUMBER__EXTENSION,
                    oldExtension, extension, !oldExtensionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExtension() {
        String oldExtension = extension;
        boolean oldExtensionESet = extensionESet;
        extension = EXTENSION_EDEFAULT;
        extensionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__EXTENSION,
                    oldExtension, EXTENSION_EDEFAULT, oldExtensionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtension() {
        return extensionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocalNumber() {
        return localNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocalNumber( String newLocalNumber ) {
        String oldLocalNumber = localNumber;
        localNumber = newLocalNumber;
        boolean oldLocalNumberESet = localNumberESet;
        localNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER,
                    oldLocalNumber, localNumber, !oldLocalNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocalNumber() {
        String oldLocalNumber = localNumber;
        boolean oldLocalNumberESet = localNumberESet;
        localNumber = LOCAL_NUMBER_EDEFAULT;
        localNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER,
                    oldLocalNumber, LOCAL_NUMBER_EDEFAULT, oldLocalNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocalNumber() {
        return localNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            return getAreaCode();
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            return getCityCode();
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            return getCountryCode();
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            return getExtension();
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            return getLocalNumber();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            setAreaCode( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            setCityCode( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            setCountryCode( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            setExtension( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            setLocalNumber( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            unsetAreaCode();
            return;
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            unsetCityCode();
            return;
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            unsetCountryCode();
            return;
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            unsetExtension();
            return;
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            unsetLocalNumber();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            return isSetAreaCode();
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            return isSetCityCode();
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            return isSetCountryCode();
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            return isSetExtension();
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            return isSetLocalNumber();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (areaCode: " );
        if( areaCodeESet )
            result.append( areaCode );
        else
            result.append( "<unset>" );
        result.append( ", cityCode: " );
        if( cityCodeESet )
            result.append( cityCode );
        else
            result.append( "<unset>" );
        result.append( ", countryCode: " );
        if( countryCodeESet )
            result.append( countryCode );
        else
            result.append( "<unset>" );
        result.append( ", extension: " );
        if( extensionESet )
            result.append( extension );
        else
            result.append( "<unset>" );
        result.append( ", localNumber: " );
        if( localNumberESet )
            result.append( localNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TelephoneNumberImpl
