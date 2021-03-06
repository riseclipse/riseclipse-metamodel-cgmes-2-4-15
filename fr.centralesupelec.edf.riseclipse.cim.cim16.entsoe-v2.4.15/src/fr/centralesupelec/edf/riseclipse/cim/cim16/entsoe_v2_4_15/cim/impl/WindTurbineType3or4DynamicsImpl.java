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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySource;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.RemoteInputSignal;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4Dynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type3or4 Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType3or4DynamicsImpl#getEnergySource <em>Energy Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType3or4DynamicsImpl#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType3or4DynamicsImpl#getWindPlantDynamics <em>Wind Plant Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType3or4DynamicsImpl extends DynamicsFunctionBlockImpl implements WindTurbineType3or4Dynamics {
    /**
     * The cached value of the '{@link #getEnergySource() <em>Energy Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergySource()
     * @generated
     * @ordered
     */
    protected EnergySource energySource;

    /**
     * This is true if the Energy Source reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energySourceESet;

    /**
     * The cached value of the '{@link #getRemoteInputSignal() <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteInputSignal()
     * @generated
     * @ordered
     */
    protected RemoteInputSignal remoteInputSignal;

    /**
     * This is true if the Remote Input Signal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteInputSignalESet;

    /**
     * The cached value of the '{@link #getWindPlantDynamics() <em>Wind Plant Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantDynamics()
     * @generated
     * @ordered
     */
    protected WindPlantDynamics windPlantDynamics;

    /**
     * This is true if the Wind Plant Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType3or4DynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType3or4Dynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteInputSignal getRemoteInputSignal() {
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRemoteInputSignal( RemoteInputSignal newRemoteInputSignal,
            NotificationChain msgs ) {
        RemoteInputSignal oldRemoteInputSignal = remoteInputSignal;
        remoteInputSignal = newRemoteInputSignal;
        boolean oldRemoteInputSignalESet = remoteInputSignalESet;
        remoteInputSignalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL, oldRemoteInputSignal,
                    newRemoteInputSignal, !oldRemoteInputSignalESet );
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
    public void setRemoteInputSignal( RemoteInputSignal newRemoteInputSignal ) {
        if( newRemoteInputSignal != remoteInputSignal ) {
            NotificationChain msgs = null;
            if( remoteInputSignal != null )
                msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                        CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, RemoteInputSignal.class, msgs );
            if( newRemoteInputSignal != null )
                msgs = ( ( InternalEObject ) newRemoteInputSignal ).eInverseAdd( this,
                        CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, RemoteInputSignal.class, msgs );
            msgs = basicSetRemoteInputSignal( newRemoteInputSignal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteInputSignalESet = remoteInputSignalESet;
            remoteInputSignalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL, newRemoteInputSignal,
                        newRemoteInputSignal, !oldRemoteInputSignalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRemoteInputSignal( NotificationChain msgs ) {
        RemoteInputSignal oldRemoteInputSignal = remoteInputSignal;
        remoteInputSignal = null;
        boolean oldRemoteInputSignalESet = remoteInputSignalESet;
        remoteInputSignalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL, oldRemoteInputSignal, null,
                    oldRemoteInputSignalESet );
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
    public void unsetRemoteInputSignal() {
        if( remoteInputSignal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, RemoteInputSignal.class, msgs );
            msgs = basicUnsetRemoteInputSignal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteInputSignalESet = remoteInputSignalESet;
            remoteInputSignalESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL, null, null,
                        oldRemoteInputSignalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteInputSignal() {
        return remoteInputSignalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantDynamics getWindPlantDynamics() {
        return windPlantDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantDynamics( WindPlantDynamics newWindPlantDynamics,
            NotificationChain msgs ) {
        WindPlantDynamics oldWindPlantDynamics = windPlantDynamics;
        windPlantDynamics = newWindPlantDynamics;
        boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
        windPlantDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS, oldWindPlantDynamics,
                    newWindPlantDynamics, !oldWindPlantDynamicsESet );
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
    public void setWindPlantDynamics( WindPlantDynamics newWindPlantDynamics ) {
        if( newWindPlantDynamics != windPlantDynamics ) {
            NotificationChain msgs = null;
            if( windPlantDynamics != null )
                msgs = ( ( InternalEObject ) windPlantDynamics ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS, WindPlantDynamics.class, msgs );
            if( newWindPlantDynamics != null )
                msgs = ( ( InternalEObject ) newWindPlantDynamics ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS, WindPlantDynamics.class, msgs );
            msgs = basicSetWindPlantDynamics( newWindPlantDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
            windPlantDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS, newWindPlantDynamics,
                        newWindPlantDynamics, !oldWindPlantDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantDynamics( NotificationChain msgs ) {
        WindPlantDynamics oldWindPlantDynamics = windPlantDynamics;
        windPlantDynamics = null;
        boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
        windPlantDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS, oldWindPlantDynamics, null,
                    oldWindPlantDynamicsESet );
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
    public void unsetWindPlantDynamics() {
        if( windPlantDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantDynamics ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS, WindPlantDynamics.class, msgs );
            msgs = basicUnsetWindPlantDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantDynamicsESet = windPlantDynamicsESet;
            windPlantDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS, null, null,
                        oldWindPlantDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantDynamics() {
        return windPlantDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySource getEnergySource() {
        if( energySource != null && energySource.eIsProxy() ) {
            InternalEObject oldEnergySource = ( InternalEObject ) energySource;
            energySource = ( EnergySource ) eResolveProxy( oldEnergySource );
            if( energySource != oldEnergySource ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, oldEnergySource, energySource ) );
            }
        }
        return energySource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnergySource basicGetEnergySource() {
        return energySource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergySource( EnergySource newEnergySource, NotificationChain msgs ) {
        EnergySource oldEnergySource = energySource;
        energySource = newEnergySource;
        boolean oldEnergySourceESet = energySourceESet;
        energySourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, oldEnergySource, newEnergySource,
                    !oldEnergySourceESet );
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
    public void setEnergySource( EnergySource newEnergySource ) {
        if( newEnergySource != energySource ) {
            NotificationChain msgs = null;
            if( energySource != null )
                msgs = ( ( InternalEObject ) energySource ).eInverseRemove( this,
                        CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, EnergySource.class, msgs );
            if( newEnergySource != null )
                msgs = ( ( InternalEObject ) newEnergySource ).eInverseAdd( this,
                        CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, EnergySource.class, msgs );
            msgs = basicSetEnergySource( newEnergySource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySourceESet = energySourceESet;
            energySourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, newEnergySource, newEnergySource,
                        !oldEnergySourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergySource( NotificationChain msgs ) {
        EnergySource oldEnergySource = energySource;
        energySource = null;
        boolean oldEnergySourceESet = energySourceESet;
        energySourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, oldEnergySource, null,
                    oldEnergySourceESet );
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
    public void unsetEnergySource() {
        if( energySource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energySource ).eInverseRemove( this,
                    CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, EnergySource.class, msgs );
            msgs = basicUnsetEnergySource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySourceESet = energySourceESet;
            energySourceESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, null, null, oldEnergySourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergySource() {
        return energySourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE:
            if( energySource != null )
                msgs = ( ( InternalEObject ) energySource ).eInverseRemove( this,
                        CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, EnergySource.class, msgs );
            return basicSetEnergySource( ( EnergySource ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL:
            if( remoteInputSignal != null )
                msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                        CimPackage.REMOTE_INPUT_SIGNAL__WIND_TURBINE_TYPE3OR4_DYNAMICS, RemoteInputSignal.class, msgs );
            return basicSetRemoteInputSignal( ( RemoteInputSignal ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS:
            if( windPlantDynamics != null )
                msgs = ( ( InternalEObject ) windPlantDynamics ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS, WindPlantDynamics.class, msgs );
            return basicSetWindPlantDynamics( ( WindPlantDynamics ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE:
            return basicUnsetEnergySource( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return basicUnsetRemoteInputSignal( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS:
            return basicUnsetWindPlantDynamics( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE:
            if( resolve ) return getEnergySource();
            return basicGetEnergySource();
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return getRemoteInputSignal();
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS:
            return getWindPlantDynamics();
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE:
            setEnergySource( ( EnergySource ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL:
            setRemoteInputSignal( ( RemoteInputSignal ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS:
            setWindPlantDynamics( ( WindPlantDynamics ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE:
            unsetEnergySource();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL:
            unsetRemoteInputSignal();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS:
            unsetWindPlantDynamics();
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE:
            return isSetEnergySource();
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return isSetRemoteInputSignal();
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS:
            return isSetWindPlantDynamics();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType3or4DynamicsImpl
