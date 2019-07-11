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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContCurrLimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindProtectionIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type3or4 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType3or4IECImpl#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType3or4IECImpl#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType3or4IECImpl#getWIndContQIEC <em>WInd Cont QIEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType3or4IECImpl extends WindTurbineType3or4DynamicsImpl implements WindTurbineType3or4IEC {
    /**
     * The cached value of the '{@link #getWindProtectionIEC() <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindProtectionIEC()
     * @generated
     * @ordered
     */
    protected WindProtectionIEC windProtectionIEC;

    /**
     * This is true if the Wind Protection IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windProtectionIECESet;

    /**
     * The cached value of the '{@link #getWindContCurrLimIEC() <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContCurrLimIEC()
     * @generated
     * @ordered
     */
    protected WindContCurrLimIEC windContCurrLimIEC;

    /**
     * This is true if the Wind Cont Curr Lim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContCurrLimIECESet;

    /**
     * The cached value of the '{@link #getWIndContQIEC() <em>WInd Cont QIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWIndContQIEC()
     * @generated
     * @ordered
     */
    protected WindContQIEC wIndContQIEC;

    /**
     * This is true if the WInd Cont QIEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wIndContQIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType3or4IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType3or4IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindProtectionIEC getWindProtectionIEC() {
        if( windProtectionIEC != null && windProtectionIEC.eIsProxy() ) {
            InternalEObject oldWindProtectionIEC = ( InternalEObject ) windProtectionIEC;
            windProtectionIEC = ( WindProtectionIEC ) eResolveProxy( oldWindProtectionIEC );
            if( windProtectionIEC != oldWindProtectionIEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, oldWindProtectionIEC,
                            windProtectionIEC ) );
            }
        }
        return windProtectionIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindProtectionIEC basicGetWindProtectionIEC() {
        return windProtectionIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindProtectionIEC( WindProtectionIEC newWindProtectionIEC,
            NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = newWindProtectionIEC;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, oldWindProtectionIEC,
                    newWindProtectionIEC, !oldWindProtectionIECESet );
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
    public void setWindProtectionIEC( WindProtectionIEC newWindProtectionIEC ) {
        if( newWindProtectionIEC != windProtectionIEC ) {
            NotificationChain msgs = null;
            if( windProtectionIEC != null )
                msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                        CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            if( newWindProtectionIEC != null )
                msgs = ( ( InternalEObject ) newWindProtectionIEC ).eInverseAdd( this,
                        CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            msgs = basicSetWindProtectionIEC( newWindProtectionIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, newWindProtectionIEC,
                        newWindProtectionIEC, !oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindProtectionIEC( NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = null;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, oldWindProtectionIEC, null,
                    oldWindProtectionIECESet );
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
    public void unsetWindProtectionIEC() {
        if( windProtectionIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            msgs = basicUnsetWindProtectionIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, null, null,
                        oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindProtectionIEC() {
        return windProtectionIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContCurrLimIEC getWindContCurrLimIEC() {
        if( windContCurrLimIEC != null && windContCurrLimIEC.eIsProxy() ) {
            InternalEObject oldWindContCurrLimIEC = ( InternalEObject ) windContCurrLimIEC;
            windContCurrLimIEC = ( WindContCurrLimIEC ) eResolveProxy( oldWindContCurrLimIEC );
            if( windContCurrLimIEC != oldWindContCurrLimIEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, oldWindContCurrLimIEC,
                            windContCurrLimIEC ) );
            }
        }
        return windContCurrLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContCurrLimIEC basicGetWindContCurrLimIEC() {
        return windContCurrLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContCurrLimIEC( WindContCurrLimIEC newWindContCurrLimIEC,
            NotificationChain msgs ) {
        WindContCurrLimIEC oldWindContCurrLimIEC = windContCurrLimIEC;
        windContCurrLimIEC = newWindContCurrLimIEC;
        boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
        windContCurrLimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, oldWindContCurrLimIEC,
                    newWindContCurrLimIEC, !oldWindContCurrLimIECESet );
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
    public void setWindContCurrLimIEC( WindContCurrLimIEC newWindContCurrLimIEC ) {
        if( newWindContCurrLimIEC != windContCurrLimIEC ) {
            NotificationChain msgs = null;
            if( windContCurrLimIEC != null )
                msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            if( newWindContCurrLimIEC != null )
                msgs = ( ( InternalEObject ) newWindContCurrLimIEC ).eInverseAdd( this,
                        CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            msgs = basicSetWindContCurrLimIEC( newWindContCurrLimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
            windContCurrLimIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, newWindContCurrLimIEC,
                        newWindContCurrLimIEC, !oldWindContCurrLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContCurrLimIEC( NotificationChain msgs ) {
        WindContCurrLimIEC oldWindContCurrLimIEC = windContCurrLimIEC;
        windContCurrLimIEC = null;
        boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
        windContCurrLimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, oldWindContCurrLimIEC, null,
                    oldWindContCurrLimIECESet );
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
    public void unsetWindContCurrLimIEC() {
        if( windContCurrLimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            msgs = basicUnsetWindContCurrLimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
            windContCurrLimIECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, null, null,
                        oldWindContCurrLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContCurrLimIEC() {
        return windContCurrLimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQIEC getWIndContQIEC() {
        if( wIndContQIEC != null && wIndContQIEC.eIsProxy() ) {
            InternalEObject oldWIndContQIEC = ( InternalEObject ) wIndContQIEC;
            wIndContQIEC = ( WindContQIEC ) eResolveProxy( oldWIndContQIEC );
            if( wIndContQIEC != oldWIndContQIEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, oldWIndContQIEC, wIndContQIEC ) );
            }
        }
        return wIndContQIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContQIEC basicGetWIndContQIEC() {
        return wIndContQIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWIndContQIEC( WindContQIEC newWIndContQIEC, NotificationChain msgs ) {
        WindContQIEC oldWIndContQIEC = wIndContQIEC;
        wIndContQIEC = newWIndContQIEC;
        boolean oldWIndContQIECESet = wIndContQIECESet;
        wIndContQIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, oldWIndContQIEC, newWIndContQIEC,
                    !oldWIndContQIECESet );
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
    public void setWIndContQIEC( WindContQIEC newWIndContQIEC ) {
        if( newWIndContQIEC != wIndContQIEC ) {
            NotificationChain msgs = null;
            if( wIndContQIEC != null )
                msgs = ( ( InternalEObject ) wIndContQIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            if( newWIndContQIEC != null )
                msgs = ( ( InternalEObject ) newWIndContQIEC ).eInverseAdd( this,
                        CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            msgs = basicSetWIndContQIEC( newWIndContQIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWIndContQIECESet = wIndContQIECESet;
            wIndContQIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, newWIndContQIEC, newWIndContQIEC,
                        !oldWIndContQIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWIndContQIEC( NotificationChain msgs ) {
        WindContQIEC oldWIndContQIEC = wIndContQIEC;
        wIndContQIEC = null;
        boolean oldWIndContQIECESet = wIndContQIECESet;
        wIndContQIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, oldWIndContQIEC, null, oldWIndContQIECESet );
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
    public void unsetWIndContQIEC() {
        if( wIndContQIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) wIndContQIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            msgs = basicUnsetWIndContQIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWIndContQIECESet = wIndContQIECESet;
            wIndContQIECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, null, null, oldWIndContQIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWIndContQIEC() {
        return wIndContQIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            if( windProtectionIEC != null )
                msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                        CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            return basicSetWindProtectionIEC( ( WindProtectionIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            if( windContCurrLimIEC != null )
                msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            return basicSetWindContCurrLimIEC( ( WindContCurrLimIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            if( wIndContQIEC != null )
                msgs = ( ( InternalEObject ) wIndContQIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            return basicSetWIndContQIEC( ( WindContQIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            return basicUnsetWindProtectionIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            return basicUnsetWindContCurrLimIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            return basicUnsetWIndContQIEC( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            if( resolve ) return getWindProtectionIEC();
            return basicGetWindProtectionIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            if( resolve ) return getWindContCurrLimIEC();
            return basicGetWindContCurrLimIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            if( resolve ) return getWIndContQIEC();
            return basicGetWIndContQIEC();
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            setWindProtectionIEC( ( WindProtectionIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            setWindContCurrLimIEC( ( WindContCurrLimIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            setWIndContQIEC( ( WindContQIEC ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            unsetWindProtectionIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            unsetWindContCurrLimIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            unsetWIndContQIEC();
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            return isSetWindProtectionIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            return isSetWindContCurrLimIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            return isSetWIndContQIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType3or4IECImpl
