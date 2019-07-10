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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4bIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4bIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type4b IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType4bIECImpl#getWindContPType4bIEC <em>Wind Cont PType4b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindTurbineType4bIECImpl#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType4bIECImpl extends WindGenType4IECImpl implements WindTurbineType4bIEC {
    /**
     * The cached value of the '{@link #getWindContPType4bIEC() <em>Wind Cont PType4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContPType4bIEC()
     * @generated
     * @ordered
     */
    protected WindContPType4bIEC windContPType4bIEC;

    /**
     * This is true if the Wind Cont PType4b IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContPType4bIECESet;

    /**
     * The cached value of the '{@link #getWindMechIEC() <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindMechIEC()
     * @generated
     * @ordered
     */
    protected WindMechIEC windMechIEC;

    /**
     * This is true if the Wind Mech IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windMechIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType4bIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType4bIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindMechIEC getWindMechIEC() {
        if( windMechIEC != null && windMechIEC.eIsProxy() ) {
            InternalEObject oldWindMechIEC = ( InternalEObject ) windMechIEC;
            windMechIEC = ( WindMechIEC ) eResolveProxy( oldWindMechIEC );
            if( windMechIEC != oldWindMechIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, oldWindMechIEC, windMechIEC ) );
            }
        }
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindMechIEC basicGetWindMechIEC() {
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindMechIEC( WindMechIEC newWindMechIEC, NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = newWindMechIEC;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, oldWindMechIEC, newWindMechIEC,
                    !oldWindMechIECESet );
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
    public void setWindMechIEC( WindMechIEC newWindMechIEC ) {
        if( newWindMechIEC != windMechIEC ) {
            NotificationChain msgs = null;
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, WindMechIEC.class, msgs );
            if( newWindMechIEC != null ) msgs = ( ( InternalEObject ) newWindMechIEC ).eInverseAdd( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, WindMechIEC.class, msgs );
            msgs = basicSetWindMechIEC( newWindMechIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC,
                            newWindMechIEC, newWindMechIEC, !oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindMechIEC( NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = null;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, oldWindMechIEC, null, oldWindMechIECESet );
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
    public void unsetWindMechIEC() {
        if( windMechIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, WindMechIEC.class, msgs );
            msgs = basicUnsetWindMechIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, null, null, oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindMechIEC() {
        return windMechIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType4bIEC getWindContPType4bIEC() {
        if( windContPType4bIEC != null && windContPType4bIEC.eIsProxy() ) {
            InternalEObject oldWindContPType4bIEC = ( InternalEObject ) windContPType4bIEC;
            windContPType4bIEC = ( WindContPType4bIEC ) eResolveProxy( oldWindContPType4bIEC );
            if( windContPType4bIEC != oldWindContPType4bIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, oldWindContPType4bIEC,
                        windContPType4bIEC ) );
            }
        }
        return windContPType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContPType4bIEC basicGetWindContPType4bIEC() {
        return windContPType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContPType4bIEC( WindContPType4bIEC newWindContPType4bIEC,
            NotificationChain msgs ) {
        WindContPType4bIEC oldWindContPType4bIEC = windContPType4bIEC;
        windContPType4bIEC = newWindContPType4bIEC;
        boolean oldWindContPType4bIECESet = windContPType4bIECESet;
        windContPType4bIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, oldWindContPType4bIEC,
                    newWindContPType4bIEC, !oldWindContPType4bIECESet );
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
    public void setWindContPType4bIEC( WindContPType4bIEC newWindContPType4bIEC ) {
        if( newWindContPType4bIEC != windContPType4bIEC ) {
            NotificationChain msgs = null;
            if( windContPType4bIEC != null ) msgs = ( ( InternalEObject ) windContPType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, WindContPType4bIEC.class, msgs );
            if( newWindContPType4bIEC != null ) msgs = ( ( InternalEObject ) newWindContPType4bIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, WindContPType4bIEC.class, msgs );
            msgs = basicSetWindContPType4bIEC( newWindContPType4bIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType4bIECESet = windContPType4bIECESet;
            windContPType4bIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, newWindContPType4bIEC,
                    newWindContPType4bIEC, !oldWindContPType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContPType4bIEC( NotificationChain msgs ) {
        WindContPType4bIEC oldWindContPType4bIEC = windContPType4bIEC;
        windContPType4bIEC = null;
        boolean oldWindContPType4bIECESet = windContPType4bIECESet;
        windContPType4bIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, oldWindContPType4bIEC, null,
                    oldWindContPType4bIECESet );
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
    public void unsetWindContPType4bIEC() {
        if( windContPType4bIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContPType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, WindContPType4bIEC.class, msgs );
            msgs = basicUnsetWindContPType4bIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType4bIECESet = windContPType4bIECESet;
            windContPType4bIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, null, null,
                    oldWindContPType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContPType4bIEC() {
        return windContPType4bIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC:
            if( windContPType4bIEC != null ) msgs = ( ( InternalEObject ) windContPType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, WindContPType4bIEC.class, msgs );
            return basicSetWindContPType4bIEC( ( WindContPType4bIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC:
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, WindMechIEC.class, msgs );
            return basicSetWindMechIEC( ( WindMechIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC:
            return basicUnsetWindContPType4bIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC:
            return basicUnsetWindMechIEC( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC:
            if( resolve ) return getWindContPType4bIEC();
            return basicGetWindContPType4bIEC();
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC:
            if( resolve ) return getWindMechIEC();
            return basicGetWindMechIEC();
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
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC:
            setWindContPType4bIEC( ( WindContPType4bIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC:
            setWindMechIEC( ( WindMechIEC ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC:
            unsetWindContPType4bIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC:
            unsetWindMechIEC();
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
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC:
            return isSetWindContPType4bIEC();
        case CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC:
            return isSetWindMechIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType4bIECImpl
