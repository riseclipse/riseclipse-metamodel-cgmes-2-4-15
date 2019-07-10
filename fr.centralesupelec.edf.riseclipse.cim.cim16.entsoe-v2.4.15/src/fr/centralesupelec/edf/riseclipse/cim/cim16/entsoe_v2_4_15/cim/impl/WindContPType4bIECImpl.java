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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4bIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont PType4b IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4bIECImpl#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4bIECImpl#getTpaero <em>Tpaero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4bIECImpl#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4bIECImpl#getTufilt <em>Tufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType4bIECImpl#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPType4bIECImpl extends IdentifiedObjectImpl implements WindContPType4bIEC {
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
     * The default value of the '{@link #getTpaero() <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpaero()
     * @generated
     * @ordered
     */
    protected static final Float TPAERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpaero() <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpaero()
     * @generated
     * @ordered
     */
    protected Float tpaero = TPAERO_EDEFAULT;

    /**
     * This is true if the Tpaero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpaeroESet;

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
     * The cached value of the '{@link #getWindTurbineType4bIEC() <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4bIEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4bIEC windTurbineType4bIEC;

    /**
     * This is true if the Wind Turbine Type4b IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4bIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContPType4bIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPType4bIEC();
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAX, oldDpmax,
                    dpmax, !oldDpmaxESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAX, oldDpmax,
                    DPMAX_EDEFAULT, oldDpmaxESet ) );
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
    public Float getTpaero() {
        return tpaero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpaero( Float newTpaero ) {
        Float oldTpaero = tpaero;
        tpaero = newTpaero;
        boolean oldTpaeroESet = tpaeroESet;
        tpaeroESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO, oldTpaero,
                    tpaero, !oldTpaeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpaero() {
        Float oldTpaero = tpaero;
        boolean oldTpaeroESet = tpaeroESet;
        tpaero = TPAERO_EDEFAULT;
        tpaeroESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO,
                    oldTpaero, TPAERO_EDEFAULT, oldTpaeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpaero() {
        return tpaeroESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE4B_IEC__TPORD, oldTpord,
                    tpord, !oldTpordESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE4B_IEC__TPORD, oldTpord,
                    TPORD_EDEFAULT, oldTpordESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILT, oldTufilt,
                    tufilt, !oldTufiltESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILT,
                    oldTufilt, TUFILT_EDEFAULT, oldTufiltESet ) );
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
    public WindTurbineType4bIEC getWindTurbineType4bIEC() {
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC,
            NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = newWindTurbineType4bIEC;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC,
                    newWindTurbineType4bIEC, !oldWindTurbineType4bIECESet );
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
    public void setWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC ) {
        if( newWindTurbineType4bIEC != windTurbineType4bIEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            if( newWindTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4bIEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicSetWindTurbineType4bIEC( newWindTurbineType4bIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, newWindTurbineType4bIEC,
                        newWindTurbineType4bIEC, !oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4bIEC( NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = null;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC, null,
                    oldWindTurbineType4bIECESet );
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
    public void unsetWindTurbineType4bIEC() {
        if( windTurbineType4bIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicUnsetWindTurbineType4bIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, null, null,
                        oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4bIEC() {
        return windTurbineType4bIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            if( windTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            return basicSetWindTurbineType4bIEC( ( WindTurbineType4bIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            return basicUnsetWindTurbineType4bIEC( msgs );
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAX:
            return getDpmax();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            return getTpaero();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORD:
            return getTpord();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILT:
            return getTufilt();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            return getWindTurbineType4bIEC();
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAX:
            setDpmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            setTpaero( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORD:
            setTpord( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILT:
            setTufilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            setWindTurbineType4bIEC( ( WindTurbineType4bIEC ) newValue );
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAX:
            unsetDpmax();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            unsetTpaero();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORD:
            unsetTpord();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILT:
            unsetTufilt();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            unsetWindTurbineType4bIEC();
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAX:
            return isSetDpmax();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            return isSetTpaero();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORD:
            return isSetTpord();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILT:
            return isSetTufilt();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            return isSetWindTurbineType4bIEC();
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
        result.append( " (dpmax: " );
        if( dpmaxESet )
            result.append( dpmax );
        else
            result.append( "<unset>" );
        result.append( ", tpaero: " );
        if( tpaeroESet )
            result.append( tpaero );
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

} //WindContPType4bIECImpl
