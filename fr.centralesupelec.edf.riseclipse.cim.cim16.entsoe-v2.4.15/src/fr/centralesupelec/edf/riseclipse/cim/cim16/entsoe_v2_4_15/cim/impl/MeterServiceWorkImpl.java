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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Meter;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterServiceWork;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Service Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterServiceWorkImpl#getUsagePoint <em>Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterServiceWorkImpl#getOldMeter <em>Old Meter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.MeterServiceWorkImpl#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterServiceWorkImpl extends WorkImpl implements MeterServiceWork {
    /**
     * The cached value of the '{@link #getUsagePoint() <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoint()
     * @generated
     * @ordered
     */
    protected UsagePoint usagePoint;

    /**
     * This is true if the Usage Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usagePointESet;

    /**
     * The cached value of the '{@link #getOldMeter() <em>Old Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldMeter()
     * @generated
     * @ordered
     */
    protected Meter oldMeter;

    /**
     * This is true if the Old Meter reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oldMeterESet;

    /**
     * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeter()
     * @generated
     * @ordered
     */
    protected Meter meter;

    /**
     * This is true if the Meter reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean meterESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeterServiceWorkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeterServiceWork();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Meter getOldMeter() {
        return oldMeter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOldMeter( Meter newOldMeter, NotificationChain msgs ) {
        Meter oldOldMeter = oldMeter;
        oldMeter = newOldMeter;
        boolean oldOldMeterESet = oldMeterESet;
        oldMeterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_SERVICE_WORK__OLD_METER, oldOldMeter, newOldMeter, !oldOldMeterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOldMeter( Meter newOldMeter ) {
        if( newOldMeter != oldMeter ) {
            NotificationChain msgs = null;
            if( oldMeter != null )
                msgs = ( ( InternalEObject ) oldMeter ).eInverseRemove( this, CimPackage.METER__METER_REPLACEMENT_WORKS,
                        Meter.class, msgs );
            if( newOldMeter != null )
                msgs = ( ( InternalEObject ) newOldMeter ).eInverseAdd( this, CimPackage.METER__METER_REPLACEMENT_WORKS,
                        Meter.class, msgs );
            msgs = basicSetOldMeter( newOldMeter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOldMeterESet = oldMeterESet;
            oldMeterESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.METER_SERVICE_WORK__OLD_METER,
                        newOldMeter, newOldMeter, !oldOldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOldMeter( NotificationChain msgs ) {
        Meter oldOldMeter = oldMeter;
        oldMeter = null;
        boolean oldOldMeterESet = oldMeterESet;
        oldMeterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_SERVICE_WORK__OLD_METER, oldOldMeter, null, oldOldMeterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOldMeter() {
        if( oldMeter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) oldMeter ).eInverseRemove( this, CimPackage.METER__METER_REPLACEMENT_WORKS,
                    Meter.class, msgs );
            msgs = basicUnsetOldMeter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOldMeterESet = oldMeterESet;
            oldMeterESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.METER_SERVICE_WORK__OLD_METER,
                        null, null, oldOldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOldMeter() {
        return oldMeterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Meter getMeter() {
        return meter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeter( Meter newMeter, NotificationChain msgs ) {
        Meter oldMeter = meter;
        meter = newMeter;
        boolean oldMeterESet = meterESet;
        meterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_SERVICE_WORK__METER, oldMeter, newMeter, !oldMeterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeter( Meter newMeter ) {
        if( newMeter != meter ) {
            NotificationChain msgs = null;
            if( meter != null )
                msgs = ( ( InternalEObject ) meter ).eInverseRemove( this, CimPackage.METER__METER_SERVICE_WORKS,
                        Meter.class, msgs );
            if( newMeter != null )
                msgs = ( ( InternalEObject ) newMeter ).eInverseAdd( this, CimPackage.METER__METER_SERVICE_WORKS,
                        Meter.class, msgs );
            msgs = basicSetMeter( newMeter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterESet = meterESet;
            meterESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.METER_SERVICE_WORK__METER, newMeter,
                        newMeter, !oldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeter( NotificationChain msgs ) {
        Meter oldMeter = meter;
        meter = null;
        boolean oldMeterESet = meterESet;
        meterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_SERVICE_WORK__METER, oldMeter, null, oldMeterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeter() {
        if( meter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) meter ).eInverseRemove( this, CimPackage.METER__METER_SERVICE_WORKS,
                    Meter.class, msgs );
            msgs = basicUnsetMeter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterESet = meterESet;
            meterESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.METER_SERVICE_WORK__METER, null,
                        null, oldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeter() {
        return meterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePoint getUsagePoint() {
        return usagePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUsagePoint( UsagePoint newUsagePoint, NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = newUsagePoint;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_SERVICE_WORK__USAGE_POINT, oldUsagePoint, newUsagePoint, !oldUsagePointESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsagePoint( UsagePoint newUsagePoint ) {
        if( newUsagePoint != usagePoint ) {
            NotificationChain msgs = null;
            if( usagePoint != null )
                msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                        CimPackage.USAGE_POINT__METER_SERVICE_WORKS, UsagePoint.class, msgs );
            if( newUsagePoint != null )
                msgs = ( ( InternalEObject ) newUsagePoint ).eInverseAdd( this,
                        CimPackage.USAGE_POINT__METER_SERVICE_WORKS, UsagePoint.class, msgs );
            msgs = basicSetUsagePoint( newUsagePoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.METER_SERVICE_WORK__USAGE_POINT,
                        newUsagePoint, newUsagePoint, !oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetUsagePoint( NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = null;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_SERVICE_WORK__USAGE_POINT, oldUsagePoint, null, oldUsagePointESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoint() {
        if( usagePoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this, CimPackage.USAGE_POINT__METER_SERVICE_WORKS,
                    UsagePoint.class, msgs );
            msgs = basicUnsetUsagePoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.METER_SERVICE_WORK__USAGE_POINT,
                        null, null, oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoint() {
        return usagePointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.METER_SERVICE_WORK__USAGE_POINT:
            if( usagePoint != null )
                msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                        CimPackage.USAGE_POINT__METER_SERVICE_WORKS, UsagePoint.class, msgs );
            return basicSetUsagePoint( ( UsagePoint ) otherEnd, msgs );
        case CimPackage.METER_SERVICE_WORK__OLD_METER:
            if( oldMeter != null )
                msgs = ( ( InternalEObject ) oldMeter ).eInverseRemove( this, CimPackage.METER__METER_REPLACEMENT_WORKS,
                        Meter.class, msgs );
            return basicSetOldMeter( ( Meter ) otherEnd, msgs );
        case CimPackage.METER_SERVICE_WORK__METER:
            if( meter != null )
                msgs = ( ( InternalEObject ) meter ).eInverseRemove( this, CimPackage.METER__METER_SERVICE_WORKS,
                        Meter.class, msgs );
            return basicSetMeter( ( Meter ) otherEnd, msgs );
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
        case CimPackage.METER_SERVICE_WORK__USAGE_POINT:
            return basicUnsetUsagePoint( msgs );
        case CimPackage.METER_SERVICE_WORK__OLD_METER:
            return basicUnsetOldMeter( msgs );
        case CimPackage.METER_SERVICE_WORK__METER:
            return basicUnsetMeter( msgs );
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
        case CimPackage.METER_SERVICE_WORK__USAGE_POINT:
            return getUsagePoint();
        case CimPackage.METER_SERVICE_WORK__OLD_METER:
            return getOldMeter();
        case CimPackage.METER_SERVICE_WORK__METER:
            return getMeter();
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
        case CimPackage.METER_SERVICE_WORK__USAGE_POINT:
            setUsagePoint( ( UsagePoint ) newValue );
            return;
        case CimPackage.METER_SERVICE_WORK__OLD_METER:
            setOldMeter( ( Meter ) newValue );
            return;
        case CimPackage.METER_SERVICE_WORK__METER:
            setMeter( ( Meter ) newValue );
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
        case CimPackage.METER_SERVICE_WORK__USAGE_POINT:
            unsetUsagePoint();
            return;
        case CimPackage.METER_SERVICE_WORK__OLD_METER:
            unsetOldMeter();
            return;
        case CimPackage.METER_SERVICE_WORK__METER:
            unsetMeter();
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
        case CimPackage.METER_SERVICE_WORK__USAGE_POINT:
            return isSetUsagePoint();
        case CimPackage.METER_SERVICE_WORK__OLD_METER:
            return isSetOldMeter();
        case CimPackage.METER_SERVICE_WORK__METER:
            return isSetMeter();
        }
        return super.eIsSet( featureID );
    }

} //MeterServiceWorkImpl
