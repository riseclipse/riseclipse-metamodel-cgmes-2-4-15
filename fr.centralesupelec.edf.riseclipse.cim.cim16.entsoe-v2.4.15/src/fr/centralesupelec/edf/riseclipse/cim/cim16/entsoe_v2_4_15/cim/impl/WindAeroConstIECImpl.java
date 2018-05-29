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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroConstIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType1IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Aero Const IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindAeroConstIECImpl#getWindGenTurbineType1IEC <em>Wind Gen Turbine Type1 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindAeroConstIECImpl extends IdentifiedObjectImpl implements WindAeroConstIEC {
    /**
     * The cached value of the '{@link #getWindGenTurbineType1IEC() <em>Wind Gen Turbine Type1 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenTurbineType1IEC()
     * @generated
     * @ordered
     */
    protected WindGenTurbineType1IEC windGenTurbineType1IEC;

    /**
     * This is true if the Wind Gen Turbine Type1 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenTurbineType1IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindAeroConstIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindAeroConstIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType1IEC getWindGenTurbineType1IEC() {
        return windGenTurbineType1IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenTurbineType1IEC( WindGenTurbineType1IEC newWindGenTurbineType1IEC,
            NotificationChain msgs ) {
        WindGenTurbineType1IEC oldWindGenTurbineType1IEC = windGenTurbineType1IEC;
        windGenTurbineType1IEC = newWindGenTurbineType1IEC;
        boolean oldWindGenTurbineType1IECESet = windGenTurbineType1IECESet;
        windGenTurbineType1IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC, oldWindGenTurbineType1IEC,
                    newWindGenTurbineType1IEC, !oldWindGenTurbineType1IECESet );
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
    public void setWindGenTurbineType1IEC( WindGenTurbineType1IEC newWindGenTurbineType1IEC ) {
        if( newWindGenTurbineType1IEC != windGenTurbineType1IEC ) {
            NotificationChain msgs = null;
            if( windGenTurbineType1IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType1IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1IEC.class,
                        msgs );
            if( newWindGenTurbineType1IEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType1IEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1IEC.class,
                        msgs );
            msgs = basicSetWindGenTurbineType1IEC( newWindGenTurbineType1IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType1IECESet = windGenTurbineType1IECESet;
            windGenTurbineType1IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC, newWindGenTurbineType1IEC,
                    newWindGenTurbineType1IEC, !oldWindGenTurbineType1IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenTurbineType1IEC( NotificationChain msgs ) {
        WindGenTurbineType1IEC oldWindGenTurbineType1IEC = windGenTurbineType1IEC;
        windGenTurbineType1IEC = null;
        boolean oldWindGenTurbineType1IECESet = windGenTurbineType1IECESet;
        windGenTurbineType1IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC, oldWindGenTurbineType1IEC, null,
                    oldWindGenTurbineType1IECESet );
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
    public void unsetWindGenTurbineType1IEC() {
        if( windGenTurbineType1IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenTurbineType1IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TURBINE_TYPE1_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1IEC.class, msgs );
            msgs = basicUnsetWindGenTurbineType1IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType1IECESet = windGenTurbineType1IECESet;
            windGenTurbineType1IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC, null, null,
                    oldWindGenTurbineType1IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenTurbineType1IEC() {
        return windGenTurbineType1IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC:
            if( windGenTurbineType1IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType1IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1IEC.class,
                        msgs );
            return basicSetWindGenTurbineType1IEC( ( WindGenTurbineType1IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC:
            return basicUnsetWindGenTurbineType1IEC( msgs );
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC:
            return getWindGenTurbineType1IEC();
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC:
            setWindGenTurbineType1IEC( ( WindGenTurbineType1IEC ) newValue );
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC:
            unsetWindGenTurbineType1IEC();
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1_IEC:
            return isSetWindGenTurbineType1IEC();
        }
        return super.eIsSet( featureID );
    }

} //WindAeroConstIECImpl
