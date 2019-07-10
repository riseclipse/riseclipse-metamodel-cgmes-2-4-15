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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4aIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont PType4a IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4aIECImpl#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4aIECImpl#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4aIECImpl#getTufilt <em>Tufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4aIECImpl#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPType4aIECImpl extends IdentifiedObjectImpl implements WindContPType4aIEC {
    /**
     * The default value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected static final Float DPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected Float dpmax = DPMAX_EDEFAULT;

    /**
     * This is true if the Dpmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpmaxESet;

    /**
     * The default value of the '{@link #getTpord() <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpord()
     * @generated
     * @ordered
     */
    protected static final Float TPORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpord() <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpord()
     * @generated
     * @ordered
     */
    protected Float tpord = TPORD_EDEFAULT;

    /**
     * This is true if the Tpord attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpordESet;

    /**
     * The default value of the '{@link #getTufilt() <em>Tufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufilt()
     * @generated
     * @ordered
     */
    protected static final Float TUFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTufilt() <em>Tufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufilt()
     * @generated
     * @ordered
     */
    protected Float tufilt = TUFILT_EDEFAULT;

    /**
     * This is true if the Tufilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tufiltESet;

    /**
     * The cached value of the '{@link #getWindTurbineType4aIEC() <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4aIEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4aIEC windTurbineType4aIEC;

    /**
     * This is true if the Wind Turbine Type4a IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4aIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContPType4aIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPType4aIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpmax() {
        return dpmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpmax( Float newDpmax ) {
        Float oldDpmax = dpmax;
        dpmax = newDpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAX, oldDpmax, dpmax, !oldDpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpmax() {
        Float oldDpmax = dpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmax = DPMAX_EDEFAULT;
        dpmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAX, oldDpmax, DPMAX_EDEFAULT, oldDpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpmax() {
        return dpmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpord() {
        return tpord;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpord( Float newTpord ) {
        Float oldTpord = tpord;
        tpord = newTpord;
        boolean oldTpordESet = tpordESet;
        tpordESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TPORD, oldTpord, tpord, !oldTpordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpord() {
        Float oldTpord = tpord;
        boolean oldTpordESet = tpordESet;
        tpord = TPORD_EDEFAULT;
        tpordESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TPORD, oldTpord, TPORD_EDEFAULT, oldTpordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpord() {
        return tpordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTufilt() {
        return tufilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTufilt( Float newTufilt ) {
        Float oldTufilt = tufilt;
        tufilt = newTufilt;
        boolean oldTufiltESet = tufiltESet;
        tufiltESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILT, oldTufilt, tufilt, !oldTufiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTufilt() {
        Float oldTufilt = tufilt;
        boolean oldTufiltESet = tufiltESet;
        tufilt = TUFILT_EDEFAULT;
        tufiltESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILT, oldTufilt, TUFILT_EDEFAULT, oldTufiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTufilt() {
        return tufiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4aIEC getWindTurbineType4aIEC() {
        if( windTurbineType4aIEC != null && windTurbineType4aIEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType4aIEC = ( InternalEObject ) windTurbineType4aIEC;
            windTurbineType4aIEC = ( WindTurbineType4aIEC ) eResolveProxy( oldWindTurbineType4aIEC );
            if( windTurbineType4aIEC != oldWindTurbineType4aIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, oldWindTurbineType4aIEC,
                        windTurbineType4aIEC ) );
            }
        }
        return windTurbineType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType4aIEC basicGetWindTurbineType4aIEC() {
        return windTurbineType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4aIEC( WindTurbineType4aIEC newWindTurbineType4aIEC,
            NotificationChain msgs ) {
        WindTurbineType4aIEC oldWindTurbineType4aIEC = windTurbineType4aIEC;
        windTurbineType4aIEC = newWindTurbineType4aIEC;
        boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
        windTurbineType4aIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, oldWindTurbineType4aIEC,
                    newWindTurbineType4aIEC, !oldWindTurbineType4aIECESet );
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
    public void setWindTurbineType4aIEC( WindTurbineType4aIEC newWindTurbineType4aIEC ) {
        if( newWindTurbineType4aIEC != windTurbineType4aIEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4aIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            if( newWindTurbineType4aIEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4aIEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            msgs = basicSetWindTurbineType4aIEC( newWindTurbineType4aIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
            windTurbineType4aIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, newWindTurbineType4aIEC,
                    newWindTurbineType4aIEC, !oldWindTurbineType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4aIEC( NotificationChain msgs ) {
        WindTurbineType4aIEC oldWindTurbineType4aIEC = windTurbineType4aIEC;
        windTurbineType4aIEC = null;
        boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
        windTurbineType4aIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, oldWindTurbineType4aIEC, null,
                    oldWindTurbineType4aIECESet );
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
    public void unsetWindTurbineType4aIEC() {
        if( windTurbineType4aIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            msgs = basicUnsetWindTurbineType4aIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
            windTurbineType4aIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, null, null,
                    oldWindTurbineType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4aIEC() {
        return windTurbineType4aIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            if( windTurbineType4aIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            return basicSetWindTurbineType4aIEC( ( WindTurbineType4aIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            return basicUnsetWindTurbineType4aIEC( msgs );
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAX:
            return getDpmax();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORD:
            return getTpord();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILT:
            return getTufilt();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            if( resolve ) return getWindTurbineType4aIEC();
            return basicGetWindTurbineType4aIEC();
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAX:
            setDpmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORD:
            setTpord( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILT:
            setTufilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            setWindTurbineType4aIEC( ( WindTurbineType4aIEC ) newValue );
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAX:
            unsetDpmax();
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORD:
            unsetTpord();
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILT:
            unsetTufilt();
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            unsetWindTurbineType4aIEC();
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAX:
            return isSetDpmax();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORD:
            return isSetTpord();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILT:
            return isSetTufilt();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            return isSetWindTurbineType4aIEC();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (dpmax: " );
        if( dpmaxESet )
            result.append( dpmax );
        else
            result.append( "<unset>" );
        result.append( ", tpord: " );
        if( tpordESet )
            result.append( tpord );
        else
            result.append( "<unset>" );
        result.append( ", tufilt: " );
        if( tufiltESet )
            result.append( tufilt );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContPType4aIECImpl
