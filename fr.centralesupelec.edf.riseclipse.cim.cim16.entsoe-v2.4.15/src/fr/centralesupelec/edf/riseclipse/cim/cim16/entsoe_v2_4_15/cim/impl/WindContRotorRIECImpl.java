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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType2IEC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont Rotor RIEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getKirr <em>Kirr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getKomegafilt <em>Komegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getKpfilt <em>Kpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getKprr <em>Kprr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getRmax <em>Rmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getRmin <em>Rmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getTomegafilt <em>Tomegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getTpfilt <em>Tpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContRotorRIECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContRotorRIECImpl extends IdentifiedObjectImpl implements WindContRotorRIEC {
    /**
     * The default value of the '{@link #getKirr() <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKirr()
     * @generated
     * @ordered
     */
    protected static final Float KIRR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKirr() <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKirr()
     * @generated
     * @ordered
     */
    protected Float kirr = KIRR_EDEFAULT;

    /**
     * This is true if the Kirr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kirrESet;

    /**
     * The default value of the '{@link #getKomegafilt() <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegafilt()
     * @generated
     * @ordered
     */
    protected static final Float KOMEGAFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKomegafilt() <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegafilt()
     * @generated
     * @ordered
     */
    protected Float komegafilt = KOMEGAFILT_EDEFAULT;

    /**
     * This is true if the Komegafilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean komegafiltESet;

    /**
     * The default value of the '{@link #getKpfilt() <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpfilt()
     * @generated
     * @ordered
     */
    protected static final Float KPFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpfilt() <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpfilt()
     * @generated
     * @ordered
     */
    protected Float kpfilt = KPFILT_EDEFAULT;

    /**
     * This is true if the Kpfilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpfiltESet;

    /**
     * The default value of the '{@link #getKprr() <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKprr()
     * @generated
     * @ordered
     */
    protected static final Float KPRR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKprr() <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKprr()
     * @generated
     * @ordered
     */
    protected Float kprr = KPRR_EDEFAULT;

    /**
     * This is true if the Kprr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kprrESet;

    /**
     * The default value of the '{@link #getRmax() <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmax()
     * @generated
     * @ordered
     */
    protected static final Float RMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRmax() <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmax()
     * @generated
     * @ordered
     */
    protected Float rmax = RMAX_EDEFAULT;

    /**
     * This is true if the Rmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rmaxESet;

    /**
     * The default value of the '{@link #getRmin() <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmin()
     * @generated
     * @ordered
     */
    protected static final Float RMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRmin() <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmin()
     * @generated
     * @ordered
     */
    protected Float rmin = RMIN_EDEFAULT;

    /**
     * This is true if the Rmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rminESet;

    /**
     * The default value of the '{@link #getTomegafilt() <em>Tomegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafilt()
     * @generated
     * @ordered
     */
    protected static final Float TOMEGAFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTomegafilt() <em>Tomegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafilt()
     * @generated
     * @ordered
     */
    protected Float tomegafilt = TOMEGAFILT_EDEFAULT;

    /**
     * This is true if the Tomegafilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tomegafiltESet;

    /**
     * The default value of the '{@link #getTpfilt() <em>Tpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfilt()
     * @generated
     * @ordered
     */
    protected static final Float TPFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfilt() <em>Tpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfilt()
     * @generated
     * @ordered
     */
    protected Float tpfilt = TPFILT_EDEFAULT;

    /**
     * This is true if the Tpfilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfiltESet;

    /**
     * The cached value of the '{@link #getWindGenTurbineType2IEC() <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenTurbineType2IEC()
     * @generated
     * @ordered
     */
    protected WindGenTurbineType2IEC windGenTurbineType2IEC;

    /**
     * This is true if the Wind Gen Turbine Type2 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenTurbineType2IECESet;

    /**
     * The cached value of the '{@link #getWindDynamicsLookupTable() <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindDynamicsLookupTable()
     * @generated
     * @ordered
     */
    protected EList< WindDynamicsLookupTable > windDynamicsLookupTable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContRotorRIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContRotorRIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKirr() {
        return kirr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKirr( Float newKirr ) {
        Float oldKirr = kirr;
        kirr = newKirr;
        boolean oldKirrESet = kirrESet;
        kirrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KIRR, oldKirr, kirr, !oldKirrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKirr() {
        Float oldKirr = kirr;
        boolean oldKirrESet = kirrESet;
        kirr = KIRR_EDEFAULT;
        kirrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KIRR, oldKirr, KIRR_EDEFAULT, oldKirrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKirr() {
        return kirrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKomegafilt() {
        return komegafilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKomegafilt( Float newKomegafilt ) {
        Float oldKomegafilt = komegafilt;
        komegafilt = newKomegafilt;
        boolean oldKomegafiltESet = komegafiltESet;
        komegafiltESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT, oldKomegafilt, komegafilt, !oldKomegafiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKomegafilt() {
        Float oldKomegafilt = komegafilt;
        boolean oldKomegafiltESet = komegafiltESet;
        komegafilt = KOMEGAFILT_EDEFAULT;
        komegafiltESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT, oldKomegafilt, KOMEGAFILT_EDEFAULT, oldKomegafiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKomegafilt() {
        return komegafiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpfilt() {
        return kpfilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpfilt( Float newKpfilt ) {
        Float oldKpfilt = kpfilt;
        kpfilt = newKpfilt;
        boolean oldKpfiltESet = kpfiltESet;
        kpfiltESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT, oldKpfilt, kpfilt, !oldKpfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpfilt() {
        Float oldKpfilt = kpfilt;
        boolean oldKpfiltESet = kpfiltESet;
        kpfilt = KPFILT_EDEFAULT;
        kpfiltESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT, oldKpfilt, KPFILT_EDEFAULT, oldKpfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpfilt() {
        return kpfiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKprr() {
        return kprr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKprr( Float newKprr ) {
        Float oldKprr = kprr;
        kprr = newKprr;
        boolean oldKprrESet = kprrESet;
        kprrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KPRR, oldKprr, kprr, !oldKprrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKprr() {
        Float oldKprr = kprr;
        boolean oldKprrESet = kprrESet;
        kprr = KPRR_EDEFAULT;
        kprrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__KPRR, oldKprr, KPRR_EDEFAULT, oldKprrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKprr() {
        return kprrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRmax() {
        return rmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRmax( Float newRmax ) {
        Float oldRmax = rmax;
        rmax = newRmax;
        boolean oldRmaxESet = rmaxESet;
        rmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__RMAX, oldRmax, rmax, !oldRmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRmax() {
        Float oldRmax = rmax;
        boolean oldRmaxESet = rmaxESet;
        rmax = RMAX_EDEFAULT;
        rmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__RMAX, oldRmax, RMAX_EDEFAULT, oldRmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRmax() {
        return rmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRmin() {
        return rmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRmin( Float newRmin ) {
        Float oldRmin = rmin;
        rmin = newRmin;
        boolean oldRminESet = rminESet;
        rminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__RMIN, oldRmin, rmin, !oldRminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRmin() {
        Float oldRmin = rmin;
        boolean oldRminESet = rminESet;
        rmin = RMIN_EDEFAULT;
        rminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__RMIN, oldRmin, RMIN_EDEFAULT, oldRminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRmin() {
        return rminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTomegafilt() {
        return tomegafilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTomegafilt( Float newTomegafilt ) {
        Float oldTomegafilt = tomegafilt;
        tomegafilt = newTomegafilt;
        boolean oldTomegafiltESet = tomegafiltESet;
        tomegafiltESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILT, oldTomegafilt, tomegafilt, !oldTomegafiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTomegafilt() {
        Float oldTomegafilt = tomegafilt;
        boolean oldTomegafiltESet = tomegafiltESet;
        tomegafilt = TOMEGAFILT_EDEFAULT;
        tomegafiltESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILT, oldTomegafilt, TOMEGAFILT_EDEFAULT, oldTomegafiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTomegafilt() {
        return tomegafiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpfilt() {
        return tpfilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfilt( Float newTpfilt ) {
        Float oldTpfilt = tpfilt;
        tpfilt = newTpfilt;
        boolean oldTpfiltESet = tpfiltESet;
        tpfiltESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_ROTOR_RIEC__TPFILT, oldTpfilt, tpfilt, !oldTpfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfilt() {
        Float oldTpfilt = tpfilt;
        boolean oldTpfiltESet = tpfiltESet;
        tpfilt = TPFILT_EDEFAULT;
        tpfiltESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_ROTOR_RIEC__TPFILT, oldTpfilt, TPFILT_EDEFAULT, oldTpfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfilt() {
        return tpfiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        return windGenTurbineType2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenTurbineType2IEC( WindGenTurbineType2IEC newWindGenTurbineType2IEC,
            NotificationChain msgs ) {
        WindGenTurbineType2IEC oldWindGenTurbineType2IEC = windGenTurbineType2IEC;
        windGenTurbineType2IEC = newWindGenTurbineType2IEC;
        boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
        windGenTurbineType2IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC,
                    newWindGenTurbineType2IEC, !oldWindGenTurbineType2IECESet );
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
    public void setWindGenTurbineType2IEC( WindGenTurbineType2IEC newWindGenTurbineType2IEC ) {
        if( newWindGenTurbineType2IEC != windGenTurbineType2IEC ) {
            NotificationChain msgs = null;
            if( windGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class,
                        msgs );
            if( newWindGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType2IEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class,
                        msgs );
            msgs = basicSetWindGenTurbineType2IEC( newWindGenTurbineType2IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, newWindGenTurbineType2IEC,
                    newWindGenTurbineType2IEC, !oldWindGenTurbineType2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenTurbineType2IEC( NotificationChain msgs ) {
        WindGenTurbineType2IEC oldWindGenTurbineType2IEC = windGenTurbineType2IEC;
        windGenTurbineType2IEC = null;
        boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
        windGenTurbineType2IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC, null,
                    oldWindGenTurbineType2IECESet );
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
    public void unsetWindGenTurbineType2IEC() {
        if( windGenTurbineType2IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class, msgs );
            msgs = basicUnsetWindGenTurbineType2IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, null, null,
                    oldWindGenTurbineType2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenTurbineType2IEC() {
        return windGenTurbineType2IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WindDynamicsLookupTable > getWindDynamicsLookupTable() {
        if( windDynamicsLookupTable == null ) {
            windDynamicsLookupTable = new EObjectWithInverseResolvingEList.Unsettable< WindDynamicsLookupTable >(
                    WindDynamicsLookupTable.class, this, CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC );
        }
        return windDynamicsLookupTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindDynamicsLookupTable() {
        if( windDynamicsLookupTable != null ) ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindDynamicsLookupTable() {
        return windDynamicsLookupTable != null && ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            if( windGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class,
                        msgs );
            return basicSetWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) otherEnd, msgs );
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return basicUnsetWindGenTurbineType2IEC( msgs );
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            return getKirr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            return getKomegafilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            return getKpfilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            return getKprr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            return getRmax();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            return getRmin();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILT:
            return getTomegafilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILT:
            return getTpfilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return getWindGenTurbineType2IEC();
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            setKirr( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            setKomegafilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            setKpfilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            setKprr( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            setRmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            setRmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILT:
            setTomegafilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILT:
            setTpfilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            setWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            unsetKirr();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            unsetKomegafilt();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            unsetKpfilt();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            unsetKprr();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            unsetRmax();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            unsetRmin();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILT:
            unsetTomegafilt();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILT:
            unsetTpfilt();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            unsetWindGenTurbineType2IEC();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            return isSetKirr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            return isSetKomegafilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            return isSetKpfilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            return isSetKprr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            return isSetRmax();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            return isSetRmin();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILT:
            return isSetTomegafilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILT:
            return isSetTpfilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return isSetWindGenTurbineType2IEC();
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
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
        result.append( " (kirr: " );
        if( kirrESet )
            result.append( kirr );
        else
            result.append( "<unset>" );
        result.append( ", komegafilt: " );
        if( komegafiltESet )
            result.append( komegafilt );
        else
            result.append( "<unset>" );
        result.append( ", kpfilt: " );
        if( kpfiltESet )
            result.append( kpfilt );
        else
            result.append( "<unset>" );
        result.append( ", kprr: " );
        if( kprrESet )
            result.append( kprr );
        else
            result.append( "<unset>" );
        result.append( ", rmax: " );
        if( rmaxESet )
            result.append( rmax );
        else
            result.append( "<unset>" );
        result.append( ", rmin: " );
        if( rminESet )
            result.append( rmin );
        else
            result.append( "<unset>" );
        result.append( ", tomegafilt: " );
        if( tomegafiltESet )
            result.append( tomegafilt );
        else
            result.append( "<unset>" );
        result.append( ", tpfilt: " );
        if( tpfiltESet )
            result.append( tpfilt );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContRotorRIECImpl
