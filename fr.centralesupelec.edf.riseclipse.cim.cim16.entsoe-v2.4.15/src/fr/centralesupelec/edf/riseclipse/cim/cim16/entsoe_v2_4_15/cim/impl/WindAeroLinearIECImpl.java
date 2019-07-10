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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Aero Linear IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindAeroLinearIECImpl#getDpomega <em>Dpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindAeroLinearIECImpl#getDptheta <em>Dptheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindAeroLinearIECImpl#getOmegazero <em>Omegazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindAeroLinearIECImpl#getPavail <em>Pavail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindAeroLinearIECImpl#getThetazero <em>Thetazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindAeroLinearIECImpl#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindAeroLinearIECImpl extends IdentifiedObjectImpl implements WindAeroLinearIEC {
    /**
     * The default value of the '{@link #getDpomega() <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpomega()
     * @generated
     * @ordered
     */
    protected static final Float DPOMEGA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpomega() <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpomega()
     * @generated
     * @ordered
     */
    protected Float dpomega = DPOMEGA_EDEFAULT;

    /**
     * This is true if the Dpomega attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpomegaESet;

    /**
     * The default value of the '{@link #getDptheta() <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDptheta()
     * @generated
     * @ordered
     */
    protected static final Float DPTHETA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDptheta() <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDptheta()
     * @generated
     * @ordered
     */
    protected Float dptheta = DPTHETA_EDEFAULT;

    /**
     * This is true if the Dptheta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpthetaESet;

    /**
     * The default value of the '{@link #getOmegazero() <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegazero()
     * @generated
     * @ordered
     */
    protected static final Float OMEGAZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmegazero() <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegazero()
     * @generated
     * @ordered
     */
    protected Float omegazero = OMEGAZERO_EDEFAULT;

    /**
     * This is true if the Omegazero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omegazeroESet;

    /**
     * The default value of the '{@link #getPavail() <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPavail()
     * @generated
     * @ordered
     */
    protected static final Float PAVAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPavail() <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPavail()
     * @generated
     * @ordered
     */
    protected Float pavail = PAVAIL_EDEFAULT;

    /**
     * This is true if the Pavail attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pavailESet;

    /**
     * The default value of the '{@link #getThetazero() <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetazero()
     * @generated
     * @ordered
     */
    protected static final Float THETAZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetazero() <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetazero()
     * @generated
     * @ordered
     */
    protected Float thetazero = THETAZERO_EDEFAULT;

    /**
     * This is true if the Thetazero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetazeroESet;

    /**
     * The cached value of the '{@link #getWindGenTurbineType3IEC() <em>Wind Gen Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenTurbineType3IEC()
     * @generated
     * @ordered
     */
    protected WindGenTurbineType3IEC windGenTurbineType3IEC;

    /**
     * This is true if the Wind Gen Turbine Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenTurbineType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindAeroLinearIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindAeroLinearIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpomega() {
        return dpomega;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpomega( Float newDpomega ) {
        Float oldDpomega = dpomega;
        dpomega = newDpomega;
        boolean oldDpomegaESet = dpomegaESet;
        dpomegaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_AERO_LINEAR_IEC__DPOMEGA,
                    oldDpomega, dpomega, !oldDpomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpomega() {
        Float oldDpomega = dpomega;
        boolean oldDpomegaESet = dpomegaESet;
        dpomega = DPOMEGA_EDEFAULT;
        dpomegaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_AERO_LINEAR_IEC__DPOMEGA,
                    oldDpomega, DPOMEGA_EDEFAULT, oldDpomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpomega() {
        return dpomegaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDptheta() {
        return dptheta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDptheta( Float newDptheta ) {
        Float oldDptheta = dptheta;
        dptheta = newDptheta;
        boolean oldDpthetaESet = dpthetaESet;
        dpthetaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_AERO_LINEAR_IEC__DPTHETA,
                    oldDptheta, dptheta, !oldDpthetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDptheta() {
        Float oldDptheta = dptheta;
        boolean oldDpthetaESet = dpthetaESet;
        dptheta = DPTHETA_EDEFAULT;
        dpthetaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_AERO_LINEAR_IEC__DPTHETA,
                    oldDptheta, DPTHETA_EDEFAULT, oldDpthetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDptheta() {
        return dpthetaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmegazero() {
        return omegazero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmegazero( Float newOmegazero ) {
        Float oldOmegazero = omegazero;
        omegazero = newOmegazero;
        boolean oldOmegazeroESet = omegazeroESet;
        omegazeroESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_AERO_LINEAR_IEC__OMEGAZERO,
                    oldOmegazero, omegazero, !oldOmegazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmegazero() {
        Float oldOmegazero = omegazero;
        boolean oldOmegazeroESet = omegazeroESet;
        omegazero = OMEGAZERO_EDEFAULT;
        omegazeroESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_AERO_LINEAR_IEC__OMEGAZERO,
                    oldOmegazero, OMEGAZERO_EDEFAULT, oldOmegazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmegazero() {
        return omegazeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPavail() {
        return pavail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPavail( Float newPavail ) {
        Float oldPavail = pavail;
        pavail = newPavail;
        boolean oldPavailESet = pavailESet;
        pavailESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_AERO_LINEAR_IEC__PAVAIL, oldPavail,
                    pavail, !oldPavailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPavail() {
        Float oldPavail = pavail;
        boolean oldPavailESet = pavailESet;
        pavail = PAVAIL_EDEFAULT;
        pavailESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_AERO_LINEAR_IEC__PAVAIL,
                    oldPavail, PAVAIL_EDEFAULT, oldPavailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPavail() {
        return pavailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetazero() {
        return thetazero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetazero( Float newThetazero ) {
        Float oldThetazero = thetazero;
        thetazero = newThetazero;
        boolean oldThetazeroESet = thetazeroESet;
        thetazeroESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_AERO_LINEAR_IEC__THETAZERO,
                    oldThetazero, thetazero, !oldThetazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetazero() {
        Float oldThetazero = thetazero;
        boolean oldThetazeroESet = thetazeroESet;
        thetazero = THETAZERO_EDEFAULT;
        thetazeroESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_AERO_LINEAR_IEC__THETAZERO,
                    oldThetazero, THETAZERO_EDEFAULT, oldThetazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetazero() {
        return thetazeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType3IEC getWindGenTurbineType3IEC() {
        if( windGenTurbineType3IEC != null && windGenTurbineType3IEC.eIsProxy() ) {
            InternalEObject oldWindGenTurbineType3IEC = ( InternalEObject ) windGenTurbineType3IEC;
            windGenTurbineType3IEC = ( WindGenTurbineType3IEC ) eResolveProxy( oldWindGenTurbineType3IEC );
            if( windGenTurbineType3IEC != oldWindGenTurbineType3IEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, oldWindGenTurbineType3IEC,
                            windGenTurbineType3IEC ) );
            }
        }
        return windGenTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenTurbineType3IEC basicGetWindGenTurbineType3IEC() {
        return windGenTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenTurbineType3IEC( WindGenTurbineType3IEC newWindGenTurbineType3IEC,
            NotificationChain msgs ) {
        WindGenTurbineType3IEC oldWindGenTurbineType3IEC = windGenTurbineType3IEC;
        windGenTurbineType3IEC = newWindGenTurbineType3IEC;
        boolean oldWindGenTurbineType3IECESet = windGenTurbineType3IECESet;
        windGenTurbineType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, oldWindGenTurbineType3IEC,
                    newWindGenTurbineType3IEC, !oldWindGenTurbineType3IECESet );
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
    public void setWindGenTurbineType3IEC( WindGenTurbineType3IEC newWindGenTurbineType3IEC ) {
        if( newWindGenTurbineType3IEC != windGenTurbineType3IEC ) {
            NotificationChain msgs = null;
            if( windGenTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType3IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, WindGenTurbineType3IEC.class,
                        msgs );
            if( newWindGenTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, WindGenTurbineType3IEC.class,
                        msgs );
            msgs = basicSetWindGenTurbineType3IEC( newWindGenTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType3IECESet = windGenTurbineType3IECESet;
            windGenTurbineType3IECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, newWindGenTurbineType3IEC,
                        newWindGenTurbineType3IEC, !oldWindGenTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenTurbineType3IEC( NotificationChain msgs ) {
        WindGenTurbineType3IEC oldWindGenTurbineType3IEC = windGenTurbineType3IEC;
        windGenTurbineType3IEC = null;
        boolean oldWindGenTurbineType3IECESet = windGenTurbineType3IECESet;
        windGenTurbineType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, oldWindGenTurbineType3IEC, null,
                    oldWindGenTurbineType3IECESet );
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
    public void unsetWindGenTurbineType3IEC() {
        if( windGenTurbineType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, WindGenTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindGenTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType3IECESet = windGenTurbineType3IECESet;
            windGenTurbineType3IECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, null, null,
                        oldWindGenTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenTurbineType3IEC() {
        return windGenTurbineType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            if( windGenTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType3IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, WindGenTurbineType3IEC.class,
                        msgs );
            return basicSetWindGenTurbineType3IEC( ( WindGenTurbineType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            return basicUnsetWindGenTurbineType3IEC( msgs );
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
        case CimPackage.WIND_AERO_LINEAR_IEC__DPOMEGA:
            return getDpomega();
        case CimPackage.WIND_AERO_LINEAR_IEC__DPTHETA:
            return getDptheta();
        case CimPackage.WIND_AERO_LINEAR_IEC__OMEGAZERO:
            return getOmegazero();
        case CimPackage.WIND_AERO_LINEAR_IEC__PAVAIL:
            return getPavail();
        case CimPackage.WIND_AERO_LINEAR_IEC__THETAZERO:
            return getThetazero();
        case CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            if( resolve ) return getWindGenTurbineType3IEC();
            return basicGetWindGenTurbineType3IEC();
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
        case CimPackage.WIND_AERO_LINEAR_IEC__DPOMEGA:
            setDpomega( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__DPTHETA:
            setDptheta( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__OMEGAZERO:
            setOmegazero( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__PAVAIL:
            setPavail( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__THETAZERO:
            setThetazero( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            setWindGenTurbineType3IEC( ( WindGenTurbineType3IEC ) newValue );
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
        case CimPackage.WIND_AERO_LINEAR_IEC__DPOMEGA:
            unsetDpomega();
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__DPTHETA:
            unsetDptheta();
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__OMEGAZERO:
            unsetOmegazero();
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__PAVAIL:
            unsetPavail();
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__THETAZERO:
            unsetThetazero();
            return;
        case CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            unsetWindGenTurbineType3IEC();
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
        case CimPackage.WIND_AERO_LINEAR_IEC__DPOMEGA:
            return isSetDpomega();
        case CimPackage.WIND_AERO_LINEAR_IEC__DPTHETA:
            return isSetDptheta();
        case CimPackage.WIND_AERO_LINEAR_IEC__OMEGAZERO:
            return isSetOmegazero();
        case CimPackage.WIND_AERO_LINEAR_IEC__PAVAIL:
            return isSetPavail();
        case CimPackage.WIND_AERO_LINEAR_IEC__THETAZERO:
            return isSetThetazero();
        case CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            return isSetWindGenTurbineType3IEC();
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
        result.append( " (dpomega: " );
        if( dpomegaESet )
            result.append( dpomega );
        else
            result.append( "<unset>" );
        result.append( ", dptheta: " );
        if( dpthetaESet )
            result.append( dptheta );
        else
            result.append( "<unset>" );
        result.append( ", omegazero: " );
        if( omegazeroESet )
            result.append( omegazero );
        else
            result.append( "<unset>" );
        result.append( ", pavail: " );
        if( pavailESet )
            result.append( pavail );
        else
            result.append( "<unset>" );
        result.append( ", thetazero: " );
        if( thetazeroESet )
            result.append( thetazero );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindAeroLinearIECImpl
