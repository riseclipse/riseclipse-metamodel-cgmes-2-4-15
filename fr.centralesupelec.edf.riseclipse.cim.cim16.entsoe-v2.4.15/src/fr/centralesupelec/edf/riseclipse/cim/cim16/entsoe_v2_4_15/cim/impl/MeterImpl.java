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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterMultiplier;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterImpl#getFormNumber <em>Form Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterImpl#getMeterMultipliers <em>Meter Multipliers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterImpl#getVendingTransactions <em>Vending Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterImpl#getMeterServiceWorks <em>Meter Service Works</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterImpl#getMeterReplacementWorks <em>Meter Replacement Works</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterImpl extends EndDeviceImpl implements Meter {
    /**
     * The default value of the '{@link #getFormNumber() <em>Form Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormNumber()
     * @generated
     * @ordered
     */
    protected static final String FORM_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFormNumber() <em>Form Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormNumber()
     * @generated
     * @ordered
     */
    protected String formNumber = FORM_NUMBER_EDEFAULT;

    /**
     * This is true if the Form Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean formNumberESet;

    /**
     * The cached value of the '{@link #getMeterMultipliers() <em>Meter Multipliers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterMultipliers()
     * @generated
     * @ordered
     */
    protected EList< MeterMultiplier > meterMultipliers;

    /**
     * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterReadings()
     * @generated
     * @ordered
     */
    protected EList< MeterReading > meterReadings;

    /**
     * The cached value of the '{@link #getVendingTransactions() <em>Vending Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendingTransactions()
     * @generated
     * @ordered
     */
    protected EList< Transaction > vendingTransactions;

    /**
     * The cached value of the '{@link #getMeterServiceWorks() <em>Meter Service Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterServiceWorks()
     * @generated
     * @ordered
     */
    protected EList< MeterServiceWork > meterServiceWorks;

    /**
     * The cached value of the '{@link #getMeterReplacementWorks() <em>Meter Replacement Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterReplacementWorks()
     * @generated
     * @ordered
     */
    protected EList< MeterServiceWork > meterReplacementWorks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFormNumber() {
        return formNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFormNumber( String newFormNumber ) {
        String oldFormNumber = formNumber;
        formNumber = newFormNumber;
        boolean oldFormNumberESet = formNumberESet;
        formNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.METER__FORM_NUMBER, oldFormNumber,
                    formNumber, !oldFormNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFormNumber() {
        String oldFormNumber = formNumber;
        boolean oldFormNumberESet = formNumberESet;
        formNumber = FORM_NUMBER_EDEFAULT;
        formNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.METER__FORM_NUMBER, oldFormNumber,
                    FORM_NUMBER_EDEFAULT, oldFormNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFormNumber() {
        return formNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeterReading > getMeterReadings() {
        if( meterReadings == null ) {
            meterReadings = new EObjectWithInverseResolvingEList.Unsettable< MeterReading >( MeterReading.class, this,
                    CimPackage.METER__METER_READINGS, CimPackage.METER_READING__METER );
        }
        return meterReadings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterReadings() {
        if( meterReadings != null ) ( ( InternalEList.Unsettable< ? > ) meterReadings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterReadings() {
        return meterReadings != null && ( ( InternalEList.Unsettable< ? > ) meterReadings ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeterServiceWork > getMeterServiceWorks() {
        if( meterServiceWorks == null ) {
            meterServiceWorks = new EObjectWithInverseResolvingEList.Unsettable< MeterServiceWork >(
                    MeterServiceWork.class, this, CimPackage.METER__METER_SERVICE_WORKS,
                    CimPackage.METER_SERVICE_WORK__METER );
        }
        return meterServiceWorks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterServiceWorks() {
        if( meterServiceWorks != null ) ( ( InternalEList.Unsettable< ? > ) meterServiceWorks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterServiceWorks() {
        return meterServiceWorks != null && ( ( InternalEList.Unsettable< ? > ) meterServiceWorks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Transaction > getVendingTransactions() {
        if( vendingTransactions == null ) {
            vendingTransactions = new EObjectWithInverseResolvingEList.Unsettable< Transaction >( Transaction.class,
                    this, CimPackage.METER__VENDING_TRANSACTIONS, CimPackage.TRANSACTION__METER );
        }
        return vendingTransactions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVendingTransactions() {
        if( vendingTransactions != null ) ( ( InternalEList.Unsettable< ? > ) vendingTransactions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVendingTransactions() {
        return vendingTransactions != null && ( ( InternalEList.Unsettable< ? > ) vendingTransactions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeterServiceWork > getMeterReplacementWorks() {
        if( meterReplacementWorks == null ) {
            meterReplacementWorks = new EObjectWithInverseResolvingEList.Unsettable< MeterServiceWork >(
                    MeterServiceWork.class, this, CimPackage.METER__METER_REPLACEMENT_WORKS,
                    CimPackage.METER_SERVICE_WORK__OLD_METER );
        }
        return meterReplacementWorks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterReplacementWorks() {
        if( meterReplacementWorks != null ) ( ( InternalEList.Unsettable< ? > ) meterReplacementWorks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterReplacementWorks() {
        return meterReplacementWorks != null && ( ( InternalEList.Unsettable< ? > ) meterReplacementWorks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeterMultiplier > getMeterMultipliers() {
        if( meterMultipliers == null ) {
            meterMultipliers = new EObjectWithInverseResolvingEList.Unsettable< MeterMultiplier >(
                    MeterMultiplier.class, this, CimPackage.METER__METER_MULTIPLIERS,
                    CimPackage.METER_MULTIPLIER__METER );
        }
        return meterMultipliers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterMultipliers() {
        if( meterMultipliers != null ) ( ( InternalEList.Unsettable< ? > ) meterMultipliers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterMultipliers() {
        return meterMultipliers != null && ( ( InternalEList.Unsettable< ? > ) meterMultipliers ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.METER__METER_MULTIPLIERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterMultipliers() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.METER__METER_READINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterReadings() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.METER__VENDING_TRANSACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVendingTransactions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.METER__METER_SERVICE_WORKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterServiceWorks() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.METER__METER_REPLACEMENT_WORKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterReplacementWorks() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.METER__METER_MULTIPLIERS:
            return ( ( InternalEList< ? > ) getMeterMultipliers() ).basicRemove( otherEnd, msgs );
        case CimPackage.METER__METER_READINGS:
            return ( ( InternalEList< ? > ) getMeterReadings() ).basicRemove( otherEnd, msgs );
        case CimPackage.METER__VENDING_TRANSACTIONS:
            return ( ( InternalEList< ? > ) getVendingTransactions() ).basicRemove( otherEnd, msgs );
        case CimPackage.METER__METER_SERVICE_WORKS:
            return ( ( InternalEList< ? > ) getMeterServiceWorks() ).basicRemove( otherEnd, msgs );
        case CimPackage.METER__METER_REPLACEMENT_WORKS:
            return ( ( InternalEList< ? > ) getMeterReplacementWorks() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.METER__FORM_NUMBER:
            return getFormNumber();
        case CimPackage.METER__METER_MULTIPLIERS:
            return getMeterMultipliers();
        case CimPackage.METER__METER_READINGS:
            return getMeterReadings();
        case CimPackage.METER__VENDING_TRANSACTIONS:
            return getVendingTransactions();
        case CimPackage.METER__METER_SERVICE_WORKS:
            return getMeterServiceWorks();
        case CimPackage.METER__METER_REPLACEMENT_WORKS:
            return getMeterReplacementWorks();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.METER__FORM_NUMBER:
            setFormNumber( ( String ) newValue );
            return;
        case CimPackage.METER__METER_MULTIPLIERS:
            getMeterMultipliers().clear();
            getMeterMultipliers().addAll( ( Collection< ? extends MeterMultiplier > ) newValue );
            return;
        case CimPackage.METER__METER_READINGS:
            getMeterReadings().clear();
            getMeterReadings().addAll( ( Collection< ? extends MeterReading > ) newValue );
            return;
        case CimPackage.METER__VENDING_TRANSACTIONS:
            getVendingTransactions().clear();
            getVendingTransactions().addAll( ( Collection< ? extends Transaction > ) newValue );
            return;
        case CimPackage.METER__METER_SERVICE_WORKS:
            getMeterServiceWorks().clear();
            getMeterServiceWorks().addAll( ( Collection< ? extends MeterServiceWork > ) newValue );
            return;
        case CimPackage.METER__METER_REPLACEMENT_WORKS:
            getMeterReplacementWorks().clear();
            getMeterReplacementWorks().addAll( ( Collection< ? extends MeterServiceWork > ) newValue );
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
        case CimPackage.METER__FORM_NUMBER:
            unsetFormNumber();
            return;
        case CimPackage.METER__METER_MULTIPLIERS:
            unsetMeterMultipliers();
            return;
        case CimPackage.METER__METER_READINGS:
            unsetMeterReadings();
            return;
        case CimPackage.METER__VENDING_TRANSACTIONS:
            unsetVendingTransactions();
            return;
        case CimPackage.METER__METER_SERVICE_WORKS:
            unsetMeterServiceWorks();
            return;
        case CimPackage.METER__METER_REPLACEMENT_WORKS:
            unsetMeterReplacementWorks();
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
        case CimPackage.METER__FORM_NUMBER:
            return isSetFormNumber();
        case CimPackage.METER__METER_MULTIPLIERS:
            return isSetMeterMultipliers();
        case CimPackage.METER__METER_READINGS:
            return isSetMeterReadings();
        case CimPackage.METER__VENDING_TRANSACTIONS:
            return isSetVendingTransactions();
        case CimPackage.METER__METER_SERVICE_WORKS:
            return isSetMeterServiceWorks();
        case CimPackage.METER__METER_REPLACEMENT_WORKS:
            return isSetMeterReplacementWorks();
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
        result.append( " (formNumber: " );
        if( formNumberESet )
            result.append( formNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MeterImpl
