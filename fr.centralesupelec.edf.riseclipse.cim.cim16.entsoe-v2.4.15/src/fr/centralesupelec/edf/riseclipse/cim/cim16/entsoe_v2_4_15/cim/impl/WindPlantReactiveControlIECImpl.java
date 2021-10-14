/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Plant Reactive Control IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getKiwpx <em>Kiwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getKpwpx <em>Kpwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getKwpqu <em>Kwpqu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getMwppf <em>Mwppf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getMwpu <em>Mwpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getTwppfilt <em>Twppfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getTwpqfilt <em>Twpqfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getTwpufilt <em>Twpufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getTxft <em>Txft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getTxfv <em>Txfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getUwpqdip <em>Uwpqdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getXrefmax <em>Xrefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getXrefmin <em>Xrefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPlantReactiveControlIECImpl#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPlantReactiveControlIECImpl extends IdentifiedObjectImpl implements WindPlantReactiveControlIEC {
    /**
     * The default value of the '{@link #getKiwpx() <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpx()
     * @generated
     * @ordered
     */
    protected static final Float KIWPX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiwpx() <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpx()
     * @generated
     * @ordered
     */
    protected Float kiwpx = KIWPX_EDEFAULT;

    /**
     * This is true if the Kiwpx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiwpxESet;

    /**
     * The default value of the '{@link #getKpwpx() <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpwpx()
     * @generated
     * @ordered
     */
    protected static final Float KPWPX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpwpx() <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpwpx()
     * @generated
     * @ordered
     */
    protected Float kpwpx = KPWPX_EDEFAULT;

    /**
     * This is true if the Kpwpx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpwpxESet;

    /**
     * The default value of the '{@link #getKwpqu() <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwpqu()
     * @generated
     * @ordered
     */
    protected static final Float KWPQU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKwpqu() <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwpqu()
     * @generated
     * @ordered
     */
    protected Float kwpqu = KWPQU_EDEFAULT;

    /**
     * This is true if the Kwpqu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kwpquESet;

    /**
     * The default value of the '{@link #getMwppf() <em>Mwppf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwppf()
     * @generated
     * @ordered
     */
    protected static final Boolean MWPPF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwppf() <em>Mwppf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwppf()
     * @generated
     * @ordered
     */
    protected Boolean mwppf = MWPPF_EDEFAULT;

    /**
     * This is true if the Mwppf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwppfESet;

    /**
     * The default value of the '{@link #getMwpu() <em>Mwpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwpu()
     * @generated
     * @ordered
     */
    protected static final Boolean MWPU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwpu() <em>Mwpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwpu()
     * @generated
     * @ordered
     */
    protected Boolean mwpu = MWPU_EDEFAULT;

    /**
     * This is true if the Mwpu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwpuESet;

    /**
     * The default value of the '{@link #getTwppfilt() <em>Twppfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwppfilt()
     * @generated
     * @ordered
     */
    protected static final Float TWPPFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwppfilt() <em>Twppfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwppfilt()
     * @generated
     * @ordered
     */
    protected Float twppfilt = TWPPFILT_EDEFAULT;

    /**
     * This is true if the Twppfilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twppfiltESet;

    /**
     * The default value of the '{@link #getTwpqfilt() <em>Twpqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpqfilt()
     * @generated
     * @ordered
     */
    protected static final Float TWPQFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwpqfilt() <em>Twpqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpqfilt()
     * @generated
     * @ordered
     */
    protected Float twpqfilt = TWPQFILT_EDEFAULT;

    /**
     * This is true if the Twpqfilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twpqfiltESet;

    /**
     * The default value of the '{@link #getTwpufilt() <em>Twpufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpufilt()
     * @generated
     * @ordered
     */
    protected static final Float TWPUFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwpufilt() <em>Twpufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpufilt()
     * @generated
     * @ordered
     */
    protected Float twpufilt = TWPUFILT_EDEFAULT;

    /**
     * This is true if the Twpufilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twpufiltESet;

    /**
     * The default value of the '{@link #getTxft() <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxft()
     * @generated
     * @ordered
     */
    protected static final Float TXFT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTxft() <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxft()
     * @generated
     * @ordered
     */
    protected Float txft = TXFT_EDEFAULT;

    /**
     * This is true if the Txft attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean txftESet;

    /**
     * The default value of the '{@link #getTxfv() <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxfv()
     * @generated
     * @ordered
     */
    protected static final Float TXFV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTxfv() <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxfv()
     * @generated
     * @ordered
     */
    protected Float txfv = TXFV_EDEFAULT;

    /**
     * This is true if the Txfv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean txfvESet;

    /**
     * The default value of the '{@link #getUwpqdip() <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUwpqdip()
     * @generated
     * @ordered
     */
    protected static final Float UWPQDIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUwpqdip() <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUwpqdip()
     * @generated
     * @ordered
     */
    protected Float uwpqdip = UWPQDIP_EDEFAULT;

    /**
     * This is true if the Uwpqdip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uwpqdipESet;

    /**
     * The default value of the '{@link #getXrefmax() <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmax()
     * @generated
     * @ordered
     */
    protected static final Float XREFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXrefmax() <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmax()
     * @generated
     * @ordered
     */
    protected Float xrefmax = XREFMAX_EDEFAULT;

    /**
     * This is true if the Xrefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xrefmaxESet;

    /**
     * The default value of the '{@link #getXrefmin() <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmin()
     * @generated
     * @ordered
     */
    protected static final Float XREFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXrefmin() <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmin()
     * @generated
     * @ordered
     */
    protected Float xrefmin = XREFMIN_EDEFAULT;

    /**
     * This is true if the Xrefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xrefminESet;

    /**
     * The cached value of the '{@link #getWindPlantIEC() <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantIEC()
     * @generated
     * @ordered
     */
    protected WindPlantIEC windPlantIEC;

    /**
     * This is true if the Wind Plant IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPlantReactiveControlIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindPlantReactiveControlIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKiwpx() {
        return kiwpx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiwpx( Float newKiwpx ) {
        Float oldKiwpx = kiwpx;
        kiwpx = newKiwpx;
        boolean oldKiwpxESet = kiwpxESet;
        kiwpxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX,
                    oldKiwpx, kiwpx, !oldKiwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiwpx() {
        Float oldKiwpx = kiwpx;
        boolean oldKiwpxESet = kiwpxESet;
        kiwpx = KIWPX_EDEFAULT;
        kiwpxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX,
                    oldKiwpx, KIWPX_EDEFAULT, oldKiwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiwpx() {
        return kiwpxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpwpx() {
        return kpwpx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpwpx( Float newKpwpx ) {
        Float oldKpwpx = kpwpx;
        kpwpx = newKpwpx;
        boolean oldKpwpxESet = kpwpxESet;
        kpwpxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX,
                    oldKpwpx, kpwpx, !oldKpwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpwpx() {
        Float oldKpwpx = kpwpx;
        boolean oldKpwpxESet = kpwpxESet;
        kpwpx = KPWPX_EDEFAULT;
        kpwpxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX,
                    oldKpwpx, KPWPX_EDEFAULT, oldKpwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpwpx() {
        return kpwpxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKwpqu() {
        return kwpqu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKwpqu( Float newKwpqu ) {
        Float oldKwpqu = kwpqu;
        kwpqu = newKwpqu;
        boolean oldKwpquESet = kwpquESet;
        kwpquESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU,
                    oldKwpqu, kwpqu, !oldKwpquESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKwpqu() {
        Float oldKwpqu = kwpqu;
        boolean oldKwpquESet = kwpquESet;
        kwpqu = KWPQU_EDEFAULT;
        kwpquESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU,
                    oldKwpqu, KWPQU_EDEFAULT, oldKwpquESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKwpqu() {
        return kwpquESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMwppf() {
        return mwppf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwppf( Boolean newMwppf ) {
        Boolean oldMwppf = mwppf;
        mwppf = newMwppf;
        boolean oldMwppfESet = mwppfESet;
        mwppfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPPF,
                    oldMwppf, mwppf, !oldMwppfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwppf() {
        Boolean oldMwppf = mwppf;
        boolean oldMwppfESet = mwppfESet;
        mwppf = MWPPF_EDEFAULT;
        mwppfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPPF,
                    oldMwppf, MWPPF_EDEFAULT, oldMwppfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwppf() {
        return mwppfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMwpu() {
        return mwpu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwpu( Boolean newMwpu ) {
        Boolean oldMwpu = mwpu;
        mwpu = newMwpu;
        boolean oldMwpuESet = mwpuESet;
        mwpuESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPU,
                    oldMwpu, mwpu, !oldMwpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwpu() {
        Boolean oldMwpu = mwpu;
        boolean oldMwpuESet = mwpuESet;
        mwpu = MWPU_EDEFAULT;
        mwpuESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPU,
                    oldMwpu, MWPU_EDEFAULT, oldMwpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwpu() {
        return mwpuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTwppfilt() {
        return twppfilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwppfilt( Float newTwppfilt ) {
        Float oldTwppfilt = twppfilt;
        twppfilt = newTwppfilt;
        boolean oldTwppfiltESet = twppfiltESet;
        twppfiltESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILT, oldTwppfilt, twppfilt, !oldTwppfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwppfilt() {
        Float oldTwppfilt = twppfilt;
        boolean oldTwppfiltESet = twppfiltESet;
        twppfilt = TWPPFILT_EDEFAULT;
        twppfiltESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILT, oldTwppfilt, TWPPFILT_EDEFAULT,
                    oldTwppfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwppfilt() {
        return twppfiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTwpqfilt() {
        return twpqfilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwpqfilt( Float newTwpqfilt ) {
        Float oldTwpqfilt = twpqfilt;
        twpqfilt = newTwpqfilt;
        boolean oldTwpqfiltESet = twpqfiltESet;
        twpqfiltESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILT, oldTwpqfilt, twpqfilt, !oldTwpqfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwpqfilt() {
        Float oldTwpqfilt = twpqfilt;
        boolean oldTwpqfiltESet = twpqfiltESet;
        twpqfilt = TWPQFILT_EDEFAULT;
        twpqfiltESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILT, oldTwpqfilt, TWPQFILT_EDEFAULT,
                    oldTwpqfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwpqfilt() {
        return twpqfiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTwpufilt() {
        return twpufilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwpufilt( Float newTwpufilt ) {
        Float oldTwpufilt = twpufilt;
        twpufilt = newTwpufilt;
        boolean oldTwpufiltESet = twpufiltESet;
        twpufiltESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILT, oldTwpufilt, twpufilt, !oldTwpufiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwpufilt() {
        Float oldTwpufilt = twpufilt;
        boolean oldTwpufiltESet = twpufiltESet;
        twpufilt = TWPUFILT_EDEFAULT;
        twpufiltESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILT, oldTwpufilt, TWPUFILT_EDEFAULT,
                    oldTwpufiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwpufilt() {
        return twpufiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTxft() {
        return txft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTxft( Float newTxft ) {
        Float oldTxft = txft;
        txft = newTxft;
        boolean oldTxftESet = txftESet;
        txftESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT,
                    oldTxft, txft, !oldTxftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTxft() {
        Float oldTxft = txft;
        boolean oldTxftESet = txftESet;
        txft = TXFT_EDEFAULT;
        txftESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT,
                    oldTxft, TXFT_EDEFAULT, oldTxftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTxft() {
        return txftESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTxfv() {
        return txfv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTxfv( Float newTxfv ) {
        Float oldTxfv = txfv;
        txfv = newTxfv;
        boolean oldTxfvESet = txfvESet;
        txfvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV,
                    oldTxfv, txfv, !oldTxfvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTxfv() {
        Float oldTxfv = txfv;
        boolean oldTxfvESet = txfvESet;
        txfv = TXFV_EDEFAULT;
        txfvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV,
                    oldTxfv, TXFV_EDEFAULT, oldTxfvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTxfv() {
        return txfvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUwpqdip() {
        return uwpqdip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUwpqdip( Float newUwpqdip ) {
        Float oldUwpqdip = uwpqdip;
        uwpqdip = newUwpqdip;
        boolean oldUwpqdipESet = uwpqdipESet;
        uwpqdipESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP,
                    oldUwpqdip, uwpqdip, !oldUwpqdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUwpqdip() {
        Float oldUwpqdip = uwpqdip;
        boolean oldUwpqdipESet = uwpqdipESet;
        uwpqdip = UWPQDIP_EDEFAULT;
        uwpqdipESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP, oldUwpqdip, UWPQDIP_EDEFAULT,
                    oldUwpqdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUwpqdip() {
        return uwpqdipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXrefmax() {
        return xrefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXrefmax( Float newXrefmax ) {
        Float oldXrefmax = xrefmax;
        xrefmax = newXrefmax;
        boolean oldXrefmaxESet = xrefmaxESet;
        xrefmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX,
                    oldXrefmax, xrefmax, !oldXrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXrefmax() {
        Float oldXrefmax = xrefmax;
        boolean oldXrefmaxESet = xrefmaxESet;
        xrefmax = XREFMAX_EDEFAULT;
        xrefmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX, oldXrefmax, XREFMAX_EDEFAULT,
                    oldXrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXrefmax() {
        return xrefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXrefmin() {
        return xrefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXrefmin( Float newXrefmin ) {
        Float oldXrefmin = xrefmin;
        xrefmin = newXrefmin;
        boolean oldXrefminESet = xrefminESet;
        xrefminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN,
                    oldXrefmin, xrefmin, !oldXrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXrefmin() {
        Float oldXrefmin = xrefmin;
        boolean oldXrefminESet = xrefminESet;
        xrefmin = XREFMIN_EDEFAULT;
        xrefminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN, oldXrefmin, XREFMIN_EDEFAULT,
                    oldXrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXrefmin() {
        return xrefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantIEC getWindPlantIEC() {
        if( windPlantIEC != null && windPlantIEC.eIsProxy() ) {
            InternalEObject oldWindPlantIEC = ( InternalEObject ) windPlantIEC;
            windPlantIEC = ( WindPlantIEC ) eResolveProxy( oldWindPlantIEC );
            if( windPlantIEC != oldWindPlantIEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC,
                            windPlantIEC ) );
            }
        }
        return windPlantIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPlantIEC basicGetWindPlantIEC() {
        return windPlantIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantIEC( WindPlantIEC newWindPlantIEC, NotificationChain msgs ) {
        WindPlantIEC oldWindPlantIEC = windPlantIEC;
        windPlantIEC = newWindPlantIEC;
        boolean oldWindPlantIECESet = windPlantIECESet;
        windPlantIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC, newWindPlantIEC,
                    !oldWindPlantIECESet );
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
    public void setWindPlantIEC( WindPlantIEC newWindPlantIEC ) {
        if( newWindPlantIEC != windPlantIEC ) {
            NotificationChain msgs = null;
            if( windPlantIEC != null )
                msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            if( newWindPlantIEC != null )
                msgs = ( ( InternalEObject ) newWindPlantIEC ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            msgs = basicSetWindPlantIEC( newWindPlantIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantIECESet = windPlantIECESet;
            windPlantIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, newWindPlantIEC, newWindPlantIEC,
                        !oldWindPlantIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantIEC( NotificationChain msgs ) {
        WindPlantIEC oldWindPlantIEC = windPlantIEC;
        windPlantIEC = null;
        boolean oldWindPlantIECESet = windPlantIECESet;
        windPlantIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC, null,
                    oldWindPlantIECESet );
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
    public void unsetWindPlantIEC() {
        if( windPlantIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            msgs = basicUnsetWindPlantIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantIECESet = windPlantIECESet;
            windPlantIECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, null, null, oldWindPlantIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantIEC() {
        return windPlantIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            if( windPlantIEC != null )
                msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            return basicSetWindPlantIEC( ( WindPlantIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            return basicUnsetWindPlantIEC( msgs );
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
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            return getKiwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            return getKpwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            return getKwpqu();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPPF:
            return getMwppf();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPU:
            return getMwpu();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILT:
            return getTwppfilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILT:
            return getTwpqfilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILT:
            return getTwpufilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            return getTxft();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            return getTxfv();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            return getUwpqdip();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            return getXrefmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            return getXrefmin();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            if( resolve ) return getWindPlantIEC();
            return basicGetWindPlantIEC();
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
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            setKiwpx( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            setKpwpx( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            setKwpqu( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPPF:
            setMwppf( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPU:
            setMwpu( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILT:
            setTwppfilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILT:
            setTwpqfilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILT:
            setTwpufilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            setTxft( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            setTxfv( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            setUwpqdip( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            setXrefmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            setXrefmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            setWindPlantIEC( ( WindPlantIEC ) newValue );
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
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            unsetKiwpx();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            unsetKpwpx();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            unsetKwpqu();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPPF:
            unsetMwppf();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPU:
            unsetMwpu();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILT:
            unsetTwppfilt();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILT:
            unsetTwpqfilt();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILT:
            unsetTwpufilt();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            unsetTxft();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            unsetTxfv();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            unsetUwpqdip();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            unsetXrefmax();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            unsetXrefmin();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            unsetWindPlantIEC();
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
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            return isSetKiwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            return isSetKpwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            return isSetKwpqu();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPPF:
            return isSetMwppf();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__MWPU:
            return isSetMwpu();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILT:
            return isSetTwppfilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILT:
            return isSetTwpqfilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILT:
            return isSetTwpufilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            return isSetTxft();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            return isSetTxfv();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            return isSetUwpqdip();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            return isSetXrefmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            return isSetXrefmin();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            return isSetWindPlantIEC();
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
        result.append( " (kiwpx: " );
        if( kiwpxESet )
            result.append( kiwpx );
        else
            result.append( "<unset>" );
        result.append( ", kpwpx: " );
        if( kpwpxESet )
            result.append( kpwpx );
        else
            result.append( "<unset>" );
        result.append( ", kwpqu: " );
        if( kwpquESet )
            result.append( kwpqu );
        else
            result.append( "<unset>" );
        result.append( ", mwppf: " );
        if( mwppfESet )
            result.append( mwppf );
        else
            result.append( "<unset>" );
        result.append( ", mwpu: " );
        if( mwpuESet )
            result.append( mwpu );
        else
            result.append( "<unset>" );
        result.append( ", twppfilt: " );
        if( twppfiltESet )
            result.append( twppfilt );
        else
            result.append( "<unset>" );
        result.append( ", twpqfilt: " );
        if( twpqfiltESet )
            result.append( twpqfilt );
        else
            result.append( "<unset>" );
        result.append( ", twpufilt: " );
        if( twpufiltESet )
            result.append( twpufilt );
        else
            result.append( "<unset>" );
        result.append( ", txft: " );
        if( txftESet )
            result.append( txft );
        else
            result.append( "<unset>" );
        result.append( ", txfv: " );
        if( txfvESet )
            result.append( txfv );
        else
            result.append( "<unset>" );
        result.append( ", uwpqdip: " );
        if( uwpqdipESet )
            result.append( uwpqdip );
        else
            result.append( "<unset>" );
        result.append( ", xrefmax: " );
        if( xrefmaxESet )
            result.append( xrefmax );
        else
            result.append( "<unset>" );
        result.append( ", xrefmin: " );
        if( xrefminESet )
            result.append( xrefmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindPlantReactiveControlIECImpl
