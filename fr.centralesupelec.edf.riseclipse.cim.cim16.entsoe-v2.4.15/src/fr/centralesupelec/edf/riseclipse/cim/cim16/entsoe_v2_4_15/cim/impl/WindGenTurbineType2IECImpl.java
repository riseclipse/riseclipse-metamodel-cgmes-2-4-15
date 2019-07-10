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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType2IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Turbine Type2 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType2IECImpl#getWindPitchContEmulIEC <em>Wind Pitch Cont Emul IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType2IECImpl#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenTurbineType2IECImpl extends WindTurbineType1or2IECImpl implements WindGenTurbineType2IEC {
    /**
     * The cached value of the '{@link #getWindPitchContEmulIEC() <em>Wind Pitch Cont Emul IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPitchContEmulIEC()
     * @generated
     * @ordered
     */
    protected WindPitchContEmulIEC windPitchContEmulIEC;

    /**
     * This is true if the Wind Pitch Cont Emul IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPitchContEmulIECESet;

    /**
     * The cached value of the '{@link #getWindContRotorRIEC() <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContRotorRIEC()
     * @generated
     * @ordered
     */
    protected WindContRotorRIEC windContRotorRIEC;

    /**
     * This is true if the Wind Cont Rotor RIEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContRotorRIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenTurbineType2IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenTurbineType2IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContRotorRIEC getWindContRotorRIEC() {
        if( windContRotorRIEC != null && windContRotorRIEC.eIsProxy() ) {
            InternalEObject oldWindContRotorRIEC = ( InternalEObject ) windContRotorRIEC;
            windContRotorRIEC = ( WindContRotorRIEC ) eResolveProxy( oldWindContRotorRIEC );
            if( windContRotorRIEC != oldWindContRotorRIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, oldWindContRotorRIEC,
                        windContRotorRIEC ) );
            }
        }
        return windContRotorRIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContRotorRIEC basicGetWindContRotorRIEC() {
        return windContRotorRIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContRotorRIEC( WindContRotorRIEC newWindContRotorRIEC,
            NotificationChain msgs ) {
        WindContRotorRIEC oldWindContRotorRIEC = windContRotorRIEC;
        windContRotorRIEC = newWindContRotorRIEC;
        boolean oldWindContRotorRIECESet = windContRotorRIECESet;
        windContRotorRIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, oldWindContRotorRIEC,
                    newWindContRotorRIEC, !oldWindContRotorRIECESet );
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
    public void setWindContRotorRIEC( WindContRotorRIEC newWindContRotorRIEC ) {
        if( newWindContRotorRIEC != windContRotorRIEC ) {
            NotificationChain msgs = null;
            if( windContRotorRIEC != null ) msgs = ( ( InternalEObject ) windContRotorRIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, WindContRotorRIEC.class, msgs );
            if( newWindContRotorRIEC != null ) msgs = ( ( InternalEObject ) newWindContRotorRIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, WindContRotorRIEC.class, msgs );
            msgs = basicSetWindContRotorRIEC( newWindContRotorRIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContRotorRIECESet = windContRotorRIECESet;
            windContRotorRIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, newWindContRotorRIEC,
                    newWindContRotorRIEC, !oldWindContRotorRIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContRotorRIEC( NotificationChain msgs ) {
        WindContRotorRIEC oldWindContRotorRIEC = windContRotorRIEC;
        windContRotorRIEC = null;
        boolean oldWindContRotorRIECESet = windContRotorRIECESet;
        windContRotorRIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, oldWindContRotorRIEC, null,
                    oldWindContRotorRIECESet );
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
    public void unsetWindContRotorRIEC() {
        if( windContRotorRIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContRotorRIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, WindContRotorRIEC.class, msgs );
            msgs = basicUnsetWindContRotorRIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContRotorRIECESet = windContRotorRIECESet;
            windContRotorRIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, null, null,
                    oldWindContRotorRIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContRotorRIEC() {
        return windContRotorRIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPitchContEmulIEC getWindPitchContEmulIEC() {
        if( windPitchContEmulIEC != null && windPitchContEmulIEC.eIsProxy() ) {
            InternalEObject oldWindPitchContEmulIEC = ( InternalEObject ) windPitchContEmulIEC;
            windPitchContEmulIEC = ( WindPitchContEmulIEC ) eResolveProxy( oldWindPitchContEmulIEC );
            if( windPitchContEmulIEC != oldWindPitchContEmulIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, oldWindPitchContEmulIEC,
                        windPitchContEmulIEC ) );
            }
        }
        return windPitchContEmulIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPitchContEmulIEC basicGetWindPitchContEmulIEC() {
        return windPitchContEmulIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPitchContEmulIEC( WindPitchContEmulIEC newWindPitchContEmulIEC,
            NotificationChain msgs ) {
        WindPitchContEmulIEC oldWindPitchContEmulIEC = windPitchContEmulIEC;
        windPitchContEmulIEC = newWindPitchContEmulIEC;
        boolean oldWindPitchContEmulIECESet = windPitchContEmulIECESet;
        windPitchContEmulIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, oldWindPitchContEmulIEC,
                    newWindPitchContEmulIEC, !oldWindPitchContEmulIECESet );
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
    public void setWindPitchContEmulIEC( WindPitchContEmulIEC newWindPitchContEmulIEC ) {
        if( newWindPitchContEmulIEC != windPitchContEmulIEC ) {
            NotificationChain msgs = null;
            if( windPitchContEmulIEC != null ) msgs = ( ( InternalEObject ) windPitchContEmulIEC ).eInverseRemove( this,
                    CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, WindPitchContEmulIEC.class, msgs );
            if( newWindPitchContEmulIEC != null )
                msgs = ( ( InternalEObject ) newWindPitchContEmulIEC ).eInverseAdd( this,
                        CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, WindPitchContEmulIEC.class,
                        msgs );
            msgs = basicSetWindPitchContEmulIEC( newWindPitchContEmulIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPitchContEmulIECESet = windPitchContEmulIECESet;
            windPitchContEmulIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, newWindPitchContEmulIEC,
                    newWindPitchContEmulIEC, !oldWindPitchContEmulIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPitchContEmulIEC( NotificationChain msgs ) {
        WindPitchContEmulIEC oldWindPitchContEmulIEC = windPitchContEmulIEC;
        windPitchContEmulIEC = null;
        boolean oldWindPitchContEmulIECESet = windPitchContEmulIECESet;
        windPitchContEmulIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, oldWindPitchContEmulIEC, null,
                    oldWindPitchContEmulIECESet );
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
    public void unsetWindPitchContEmulIEC() {
        if( windPitchContEmulIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPitchContEmulIEC ).eInverseRemove( this,
                    CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, WindPitchContEmulIEC.class, msgs );
            msgs = basicUnsetWindPitchContEmulIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPitchContEmulIECESet = windPitchContEmulIECESet;
            windPitchContEmulIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, null, null,
                    oldWindPitchContEmulIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPitchContEmulIEC() {
        return windPitchContEmulIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC:
            if( windPitchContEmulIEC != null ) msgs = ( ( InternalEObject ) windPitchContEmulIEC ).eInverseRemove( this,
                    CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, WindPitchContEmulIEC.class, msgs );
            return basicSetWindPitchContEmulIEC( ( WindPitchContEmulIEC ) otherEnd, msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC:
            if( windContRotorRIEC != null ) msgs = ( ( InternalEObject ) windContRotorRIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, WindContRotorRIEC.class, msgs );
            return basicSetWindContRotorRIEC( ( WindContRotorRIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC:
            return basicUnsetWindPitchContEmulIEC( msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC:
            return basicUnsetWindContRotorRIEC( msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC:
            if( resolve ) return getWindPitchContEmulIEC();
            return basicGetWindPitchContEmulIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC:
            if( resolve ) return getWindContRotorRIEC();
            return basicGetWindContRotorRIEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC:
            setWindPitchContEmulIEC( ( WindPitchContEmulIEC ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC:
            setWindContRotorRIEC( ( WindContRotorRIEC ) newValue );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC:
            unsetWindPitchContEmulIEC();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC:
            unsetWindContRotorRIEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC:
            return isSetWindPitchContEmulIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC:
            return isSetWindContRotorRIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindGenTurbineType2IECImpl
