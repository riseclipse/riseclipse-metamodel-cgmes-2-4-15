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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3bIEC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Turbine Type3b IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3bIECImpl#getFducw <em>Fducw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3bIECImpl#getMwtcwp <em>Mwtcwp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3bIECImpl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3bIECImpl#getTwo <em>Two</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3bIECImpl#getXs <em>Xs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenTurbineType3bIECImpl extends WindGenTurbineType3IECImpl implements WindGenTurbineType3bIEC {
    /**
     * The default value of the '{@link #getFducw() <em>Fducw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFducw()
     * @generated
     * @ordered
     */
    protected static final Float FDUCW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFducw() <em>Fducw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFducw()
     * @generated
     * @ordered
     */
    protected Float fducw = FDUCW_EDEFAULT;

    /**
     * This is true if the Fducw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fducwESet;

    /**
     * The default value of the '{@link #getMwtcwp() <em>Mwtcwp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwtcwp()
     * @generated
     * @ordered
     */
    protected static final Boolean MWTCWP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwtcwp() <em>Mwtcwp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwtcwp()
     * @generated
     * @ordered
     */
    protected Boolean mwtcwp = MWTCWP_EDEFAULT;

    /**
     * This is true if the Mwtcwp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwtcwpESet;

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
     * The default value of the '{@link #getTwo() <em>Two</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwo()
     * @generated
     * @ordered
     */
    protected static final Float TWO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwo() <em>Two</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwo()
     * @generated
     * @ordered
     */
    protected Float two = TWO_EDEFAULT;

    /**
     * This is true if the Two attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twoESet;

    /**
     * The default value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected static final Float XS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected Float xs = XS_EDEFAULT;

    /**
     * This is true if the Xs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenTurbineType3bIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenTurbineType3bIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFducw() {
        return fducw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFducw( Float newFducw ) {
        Float oldFducw = fducw;
        fducw = newFducw;
        boolean oldFducwESet = fducwESet;
        fducwESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__FDUCW,
                    oldFducw, fducw, !oldFducwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFducw() {
        Float oldFducw = fducw;
        boolean oldFducwESet = fducwESet;
        fducw = FDUCW_EDEFAULT;
        fducwESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__FDUCW,
                    oldFducw, FDUCW_EDEFAULT, oldFducwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFducw() {
        return fducwESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMwtcwp() {
        return mwtcwp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwtcwp( Boolean newMwtcwp ) {
        Boolean oldMwtcwp = mwtcwp;
        mwtcwp = newMwtcwp;
        boolean oldMwtcwpESet = mwtcwpESet;
        mwtcwpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__MWTCWP,
                    oldMwtcwp, mwtcwp, !oldMwtcwpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwtcwp() {
        Boolean oldMwtcwp = mwtcwp;
        boolean oldMwtcwpESet = mwtcwpESet;
        mwtcwp = MWTCWP_EDEFAULT;
        mwtcwpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__MWTCWP,
                    oldMwtcwp, MWTCWP_EDEFAULT, oldMwtcwpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwtcwp() {
        return mwtcwpESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TG, oldTg,
                    tg, !oldTgESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TG, oldTg,
                    TG_EDEFAULT, oldTgESet ) );
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
    public Float getTwo() {
        return two;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwo( Float newTwo ) {
        Float oldTwo = two;
        two = newTwo;
        boolean oldTwoESet = twoESet;
        twoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TWO, oldTwo,
                    two, !oldTwoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwo() {
        Float oldTwo = two;
        boolean oldTwoESet = twoESet;
        two = TWO_EDEFAULT;
        twoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TWO,
                    oldTwo, TWO_EDEFAULT, oldTwoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwo() {
        return twoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXs() {
        return xs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXs( Float newXs ) {
        Float oldXs = xs;
        xs = newXs;
        boolean oldXsESet = xsESet;
        xsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__XS, oldXs,
                    xs, !oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXs() {
        Float oldXs = xs;
        boolean oldXsESet = xsESet;
        xs = XS_EDEFAULT;
        xsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__XS, oldXs,
                    XS_EDEFAULT, oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXs() {
        return xsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__FDUCW:
            return getFducw();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__MWTCWP:
            return getMwtcwp();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TG:
            return getTg();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TWO:
            return getTwo();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__XS:
            return getXs();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__FDUCW:
            setFducw( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__MWTCWP:
            setMwtcwp( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TG:
            setTg( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TWO:
            setTwo( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__XS:
            setXs( ( Float ) newValue );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__FDUCW:
            unsetFducw();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__MWTCWP:
            unsetMwtcwp();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TG:
            unsetTg();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TWO:
            unsetTwo();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__XS:
            unsetXs();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__FDUCW:
            return isSetFducw();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__MWTCWP:
            return isSetMwtcwp();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TG:
            return isSetTg();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__TWO:
            return isSetTwo();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC__XS:
            return isSetXs();
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
        result.append( " (fducw: " );
        if( fducwESet )
            result.append( fducw );
        else
            result.append( "<unset>" );
        result.append( ", mwtcwp: " );
        if( mwtcwpESet )
            result.append( mwtcwp );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ", two: " );
        if( twoESet )
            result.append( two );
        else
            result.append( "<unset>" );
        result.append( ", xs: " );
        if( xsESet )
            result.append( xs );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindGenTurbineType3bIECImpl
