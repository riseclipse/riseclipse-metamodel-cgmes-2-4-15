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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenType4IEC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Type4 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenType4IECImpl#getDipmax <em>Dipmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenType4IECImpl#getDiqmax <em>Diqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenType4IECImpl#getDiqmin <em>Diqmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenType4IECImpl#getTg <em>Tg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenType4IECImpl extends WindTurbineType3or4IECImpl implements WindGenType4IEC {
    /**
     * The default value of the '{@link #getDipmax() <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDipmax()
     * @generated
     * @ordered
     */
    protected static final Float DIPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDipmax() <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDipmax()
     * @generated
     * @ordered
     */
    protected Float dipmax = DIPMAX_EDEFAULT;

    /**
     * This is true if the Dipmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dipmaxESet;

    /**
     * The default value of the '{@link #getDiqmax() <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmax()
     * @generated
     * @ordered
     */
    protected static final Float DIQMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiqmax() <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmax()
     * @generated
     * @ordered
     */
    protected Float diqmax = DIQMAX_EDEFAULT;

    /**
     * This is true if the Diqmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diqmaxESet;

    /**
     * The default value of the '{@link #getDiqmin() <em>Diqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmin()
     * @generated
     * @ordered
     */
    protected static final Float DIQMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiqmin() <em>Diqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmin()
     * @generated
     * @ordered
     */
    protected Float diqmin = DIQMIN_EDEFAULT;

    /**
     * This is true if the Diqmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diqminESet;

    /**
     * The default value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected static final Float TG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected Float tg = TG_EDEFAULT;

    /**
     * This is true if the Tg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tgESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenType4IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenType4IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDipmax() {
        return dipmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDipmax( Float newDipmax ) {
        Float oldDipmax = dipmax;
        dipmax = newDipmax;
        boolean oldDipmaxESet = dipmaxESet;
        dipmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX, oldDipmax, dipmax, !oldDipmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDipmax() {
        Float oldDipmax = dipmax;
        boolean oldDipmaxESet = dipmaxESet;
        dipmax = DIPMAX_EDEFAULT;
        dipmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX, oldDipmax, DIPMAX_EDEFAULT, oldDipmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDipmax() {
        return dipmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiqmax() {
        return diqmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiqmax( Float newDiqmax ) {
        Float oldDiqmax = diqmax;
        diqmax = newDiqmax;
        boolean oldDiqmaxESet = diqmaxESet;
        diqmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX, oldDiqmax, diqmax, !oldDiqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiqmax() {
        Float oldDiqmax = diqmax;
        boolean oldDiqmaxESet = diqmaxESet;
        diqmax = DIQMAX_EDEFAULT;
        diqmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX, oldDiqmax, DIQMAX_EDEFAULT, oldDiqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiqmax() {
        return diqmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiqmin() {
        return diqmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiqmin( Float newDiqmin ) {
        Float oldDiqmin = diqmin;
        diqmin = newDiqmin;
        boolean oldDiqminESet = diqminESet;
        diqminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN, oldDiqmin, diqmin, !oldDiqminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiqmin() {
        Float oldDiqmin = diqmin;
        boolean oldDiqminESet = diqminESet;
        diqmin = DIQMIN_EDEFAULT;
        diqminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN, oldDiqmin, DIQMIN_EDEFAULT, oldDiqminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiqmin() {
        return diqminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTg() {
        return tg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTg( Float newTg ) {
        Float oldTg = tg;
        tg = newTg;
        boolean oldTgESet = tgESet;
        tgESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__TG, oldTg, tg, !oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTg() {
        Float oldTg = tg;
        boolean oldTgESet = tgESet;
        tg = TG_EDEFAULT;
        tgESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__TG, oldTg, TG_EDEFAULT, oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTg() {
        return tgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            return getDipmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            return getDiqmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            return getDiqmin();
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            return getTg();
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
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            setDipmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            setDiqmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            setDiqmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            setTg( ( Float ) newValue );
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
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            unsetDipmax();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            unsetDiqmax();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            unsetDiqmin();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            unsetTg();
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
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            return isSetDipmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            return isSetDiqmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            return isSetDiqmin();
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            return isSetTg();
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
        result.append( " (dipmax: " );
        if( dipmaxESet )
            result.append( dipmax );
        else
            result.append( "<unset>" );
        result.append( ", diqmax: " );
        if( diqmaxESet )
            result.append( diqmax );
        else
            result.append( "<unset>" );
        result.append( ", diqmin: " );
        if( diqminESet )
            result.append( diqmin );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindGenType4IECImpl
