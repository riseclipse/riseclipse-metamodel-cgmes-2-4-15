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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType2IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Pitch Cont Emul IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getKdroop <em>Kdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getKipce <em>Kipce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getKomegaaero <em>Komegaaero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getKppce <em>Kppce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getOmegaref <em>Omegaref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getPimax <em>Pimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getPimin <em>Pimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getTpe <em>Tpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindPitchContEmulIECImpl#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPitchContEmulIECImpl extends IdentifiedObjectImpl implements WindPitchContEmulIEC {
    /**
     * The default value of the '{@link #getKdroop() <em>Kdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdroop()
     * @generated
     * @ordered
     */
    protected static final Float KDROOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdroop() <em>Kdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdroop()
     * @generated
     * @ordered
     */
    protected Float kdroop = KDROOP_EDEFAULT;

    /**
     * This is true if the Kdroop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdroopESet;

    /**
     * The default value of the '{@link #getKipce() <em>Kipce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKipce()
     * @generated
     * @ordered
     */
    protected static final Float KIPCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKipce() <em>Kipce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKipce()
     * @generated
     * @ordered
     */
    protected Float kipce = KIPCE_EDEFAULT;

    /**
     * This is true if the Kipce attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kipceESet;

    /**
     * The default value of the '{@link #getKomegaaero() <em>Komegaaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegaaero()
     * @generated
     * @ordered
     */
    protected static final Float KOMEGAAERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKomegaaero() <em>Komegaaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegaaero()
     * @generated
     * @ordered
     */
    protected Float komegaaero = KOMEGAAERO_EDEFAULT;

    /**
     * This is true if the Komegaaero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean komegaaeroESet;

    /**
     * The default value of the '{@link #getKppce() <em>Kppce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKppce()
     * @generated
     * @ordered
     */
    protected static final Float KPPCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKppce() <em>Kppce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKppce()
     * @generated
     * @ordered
     */
    protected Float kppce = KPPCE_EDEFAULT;

    /**
     * This is true if the Kppce attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kppceESet;

    /**
     * The default value of the '{@link #getOmegaref() <em>Omegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaref()
     * @generated
     * @ordered
     */
    protected static final Float OMEGAREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmegaref() <em>Omegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaref()
     * @generated
     * @ordered
     */
    protected Float omegaref = OMEGAREF_EDEFAULT;

    /**
     * This is true if the Omegaref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omegarefESet;

    /**
     * The default value of the '{@link #getPimax() <em>Pimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPimax()
     * @generated
     * @ordered
     */
    protected static final Float PIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPimax() <em>Pimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPimax()
     * @generated
     * @ordered
     */
    protected Float pimax = PIMAX_EDEFAULT;

    /**
     * This is true if the Pimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pimaxESet;

    /**
     * The default value of the '{@link #getPimin() <em>Pimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPimin()
     * @generated
     * @ordered
     */
    protected static final Float PIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPimin() <em>Pimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPimin()
     * @generated
     * @ordered
     */
    protected Float pimin = PIMIN_EDEFAULT;

    /**
     * This is true if the Pimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean piminESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Float T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Float t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

    /**
     * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected static final Float T2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected Float t2 = T2_EDEFAULT;

    /**
     * This is true if the T2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t2ESet;

    /**
     * The default value of the '{@link #getTpe() <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpe()
     * @generated
     * @ordered
     */
    protected static final Float TPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpe() <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpe()
     * @generated
     * @ordered
     */
    protected Float tpe = TPE_EDEFAULT;

    /**
     * This is true if the Tpe attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpeESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPitchContEmulIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindPitchContEmulIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKdroop() {
        return kdroop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdroop( Float newKdroop ) {
        Float oldKdroop = kdroop;
        kdroop = newKdroop;
        boolean oldKdroopESet = kdroopESet;
        kdroopESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__KDROOP, oldKdroop, kdroop, !oldKdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdroop() {
        Float oldKdroop = kdroop;
        boolean oldKdroopESet = kdroopESet;
        kdroop = KDROOP_EDEFAULT;
        kdroopESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__KDROOP, oldKdroop, KDROOP_EDEFAULT, oldKdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdroop() {
        return kdroopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKipce() {
        return kipce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKipce( Float newKipce ) {
        Float oldKipce = kipce;
        kipce = newKipce;
        boolean oldKipceESet = kipceESet;
        kipceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__KIPCE, oldKipce, kipce, !oldKipceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKipce() {
        Float oldKipce = kipce;
        boolean oldKipceESet = kipceESet;
        kipce = KIPCE_EDEFAULT;
        kipceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__KIPCE, oldKipce, KIPCE_EDEFAULT, oldKipceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKipce() {
        return kipceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKomegaaero() {
        return komegaaero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKomegaaero( Float newKomegaaero ) {
        Float oldKomegaaero = komegaaero;
        komegaaero = newKomegaaero;
        boolean oldKomegaaeroESet = komegaaeroESet;
        komegaaeroESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__KOMEGAAERO, oldKomegaaero, komegaaero, !oldKomegaaeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKomegaaero() {
        Float oldKomegaaero = komegaaero;
        boolean oldKomegaaeroESet = komegaaeroESet;
        komegaaero = KOMEGAAERO_EDEFAULT;
        komegaaeroESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PITCH_CONT_EMUL_IEC__KOMEGAAERO,
                    oldKomegaaero, KOMEGAAERO_EDEFAULT, oldKomegaaeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKomegaaero() {
        return komegaaeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKppce() {
        return kppce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKppce( Float newKppce ) {
        Float oldKppce = kppce;
        kppce = newKppce;
        boolean oldKppceESet = kppceESet;
        kppceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__KPPCE, oldKppce, kppce, !oldKppceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKppce() {
        Float oldKppce = kppce;
        boolean oldKppceESet = kppceESet;
        kppce = KPPCE_EDEFAULT;
        kppceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__KPPCE, oldKppce, KPPCE_EDEFAULT, oldKppceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKppce() {
        return kppceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmegaref() {
        return omegaref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmegaref( Float newOmegaref ) {
        Float oldOmegaref = omegaref;
        omegaref = newOmegaref;
        boolean oldOmegarefESet = omegarefESet;
        omegarefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__OMEGAREF, oldOmegaref, omegaref, !oldOmegarefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmegaref() {
        Float oldOmegaref = omegaref;
        boolean oldOmegarefESet = omegarefESet;
        omegaref = OMEGAREF_EDEFAULT;
        omegarefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__OMEGAREF, oldOmegaref, OMEGAREF_EDEFAULT, oldOmegarefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmegaref() {
        return omegarefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPimax() {
        return pimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPimax( Float newPimax ) {
        Float oldPimax = pimax;
        pimax = newPimax;
        boolean oldPimaxESet = pimaxESet;
        pimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMAX, oldPimax, pimax, !oldPimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPimax() {
        Float oldPimax = pimax;
        boolean oldPimaxESet = pimaxESet;
        pimax = PIMAX_EDEFAULT;
        pimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMAX, oldPimax, PIMAX_EDEFAULT, oldPimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPimax() {
        return pimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPimin() {
        return pimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPimin( Float newPimin ) {
        Float oldPimin = pimin;
        pimin = newPimin;
        boolean oldPiminESet = piminESet;
        piminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMIN, oldPimin, pimin, !oldPiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPimin() {
        Float oldPimin = pimin;
        boolean oldPiminESet = piminESet;
        pimin = PIMIN_EDEFAULT;
        piminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMIN, oldPimin, PIMIN_EDEFAULT, oldPiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPimin() {
        return piminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Float newT1 ) {
        Float oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__T1, oldT1, t1, !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Float oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__T1, oldT1, T1_EDEFAULT, oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT2() {
        return t2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT2( Float newT2 ) {
        Float oldT2 = t2;
        t2 = newT2;
        boolean oldT2ESet = t2ESet;
        t2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__T2, oldT2, t2, !oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT2() {
        Float oldT2 = t2;
        boolean oldT2ESet = t2ESet;
        t2 = T2_EDEFAULT;
        t2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__T2, oldT2, T2_EDEFAULT, oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT2() {
        return t2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpe() {
        return tpe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpe( Float newTpe ) {
        Float oldTpe = tpe;
        tpe = newTpe;
        boolean oldTpeESet = tpeESet;
        tpeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__TPE, oldTpe, tpe, !oldTpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpe() {
        Float oldTpe = tpe;
        boolean oldTpeESet = tpeESet;
        tpe = TPE_EDEFAULT;
        tpeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_EMUL_IEC__TPE, oldTpe, TPE_EDEFAULT, oldTpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpe() {
        return tpeESet;
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
                    CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC,
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
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, WindGenTurbineType2IEC.class,
                        msgs );
            if( newWindGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType2IEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, WindGenTurbineType2IEC.class,
                        msgs );
            msgs = basicSetWindGenTurbineType2IEC( newWindGenTurbineType2IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, newWindGenTurbineType2IEC,
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
                    CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC, null,
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
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, WindGenTurbineType2IEC.class,
                    msgs );
            msgs = basicUnsetWindGenTurbineType2IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC, null, null,
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            if( windGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_EMUL_IEC, WindGenTurbineType2IEC.class,
                        msgs );
            return basicSetWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return basicUnsetWindGenTurbineType2IEC( msgs );
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
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KDROOP:
            return getKdroop();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KIPCE:
            return getKipce();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KOMEGAAERO:
            return getKomegaaero();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KPPCE:
            return getKppce();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__OMEGAREF:
            return getOmegaref();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMAX:
            return getPimax();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMIN:
            return getPimin();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T1:
            return getT1();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T2:
            return getT2();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__TPE:
            return getTpe();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return getWindGenTurbineType2IEC();
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
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KDROOP:
            setKdroop( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KIPCE:
            setKipce( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KOMEGAAERO:
            setKomegaaero( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KPPCE:
            setKppce( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__OMEGAREF:
            setOmegaref( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMAX:
            setPimax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMIN:
            setPimin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T1:
            setT1( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T2:
            setT2( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__TPE:
            setTpe( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            setWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) newValue );
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
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KDROOP:
            unsetKdroop();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KIPCE:
            unsetKipce();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KOMEGAAERO:
            unsetKomegaaero();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KPPCE:
            unsetKppce();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__OMEGAREF:
            unsetOmegaref();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMAX:
            unsetPimax();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMIN:
            unsetPimin();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T1:
            unsetT1();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T2:
            unsetT2();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__TPE:
            unsetTpe();
            return;
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            unsetWindGenTurbineType2IEC();
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
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KDROOP:
            return isSetKdroop();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KIPCE:
            return isSetKipce();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KOMEGAAERO:
            return isSetKomegaaero();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__KPPCE:
            return isSetKppce();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__OMEGAREF:
            return isSetOmegaref();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMAX:
            return isSetPimax();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__PIMIN:
            return isSetPimin();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T1:
            return isSetT1();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__T2:
            return isSetT2();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__TPE:
            return isSetTpe();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return isSetWindGenTurbineType2IEC();
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
        result.append( " (kdroop: " );
        if( kdroopESet )
            result.append( kdroop );
        else
            result.append( "<unset>" );
        result.append( ", kipce: " );
        if( kipceESet )
            result.append( kipce );
        else
            result.append( "<unset>" );
        result.append( ", komegaaero: " );
        if( komegaaeroESet )
            result.append( komegaaero );
        else
            result.append( "<unset>" );
        result.append( ", kppce: " );
        if( kppceESet )
            result.append( kppce );
        else
            result.append( "<unset>" );
        result.append( ", omegaref: " );
        if( omegarefESet )
            result.append( omegaref );
        else
            result.append( "<unset>" );
        result.append( ", pimax: " );
        if( pimaxESet )
            result.append( pimax );
        else
            result.append( "<unset>" );
        result.append( ", pimin: " );
        if( piminESet )
            result.append( pimin );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", tpe: " );
        if( tpeESet )
            result.append( tpe );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindPitchContEmulIECImpl
