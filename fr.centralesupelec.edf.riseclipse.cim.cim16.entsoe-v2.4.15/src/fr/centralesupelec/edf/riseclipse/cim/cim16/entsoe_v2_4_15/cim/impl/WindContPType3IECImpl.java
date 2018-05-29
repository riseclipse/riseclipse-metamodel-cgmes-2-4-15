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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC;

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
 * An implementation of the model object '<em><b>Wind Cont PType3 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getDtrisemaxlvrt <em>Dtrisemaxlvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getKdtd <em>Kdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getKpp <em>Kpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getMplvrt <em>Mplvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getOmegaoffset <em>Omegaoffset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getPdtdmax <em>Pdtdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getRramp <em>Rramp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTdvs <em>Tdvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTemin <em>Temin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTomegafilt <em>Tomegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTpfilt <em>Tpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTufilt <em>Tufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTuscale <em>Tuscale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getTwref <em>Twref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getUdvs <em>Udvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getUpdip <em>Updip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getWdtd <em>Wdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getZeta <em>Zeta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContPType3IECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPType3IECImpl extends IdentifiedObjectImpl implements WindContPType3IEC {
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
     * The default value of the '{@link #getDtrisemaxlvrt() <em>Dtrisemaxlvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtrisemaxlvrt()
     * @generated
     * @ordered
     */
    protected static final Float DTRISEMAXLVRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtrisemaxlvrt() <em>Dtrisemaxlvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtrisemaxlvrt()
     * @generated
     * @ordered
     */
    protected Float dtrisemaxlvrt = DTRISEMAXLVRT_EDEFAULT;

    /**
     * This is true if the Dtrisemaxlvrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtrisemaxlvrtESet;

    /**
     * The default value of the '{@link #getKdtd() <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdtd()
     * @generated
     * @ordered
     */
    protected static final Float KDTD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdtd() <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdtd()
     * @generated
     * @ordered
     */
    protected Float kdtd = KDTD_EDEFAULT;

    /**
     * This is true if the Kdtd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdtdESet;

    /**
     * The default value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected static final Float KIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected Float kip = KIP_EDEFAULT;

    /**
     * This is true if the Kip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kipESet;

    /**
     * The default value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected static final Float KPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected Float kpp = KPP_EDEFAULT;

    /**
     * This is true if the Kpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kppESet;

    /**
     * The default value of the '{@link #getMplvrt() <em>Mplvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMplvrt()
     * @generated
     * @ordered
     */
    protected static final Boolean MPLVRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMplvrt() <em>Mplvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMplvrt()
     * @generated
     * @ordered
     */
    protected Boolean mplvrt = MPLVRT_EDEFAULT;

    /**
     * This is true if the Mplvrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mplvrtESet;

    /**
     * The default value of the '{@link #getOmegaoffset() <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaoffset()
     * @generated
     * @ordered
     */
    protected static final Float OMEGAOFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmegaoffset() <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaoffset()
     * @generated
     * @ordered
     */
    protected Float omegaoffset = OMEGAOFFSET_EDEFAULT;

    /**
     * This is true if the Omegaoffset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omegaoffsetESet;

    /**
     * The default value of the '{@link #getPdtdmax() <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPdtdmax()
     * @generated
     * @ordered
     */
    protected static final Float PDTDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPdtdmax() <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPdtdmax()
     * @generated
     * @ordered
     */
    protected Float pdtdmax = PDTDMAX_EDEFAULT;

    /**
     * This is true if the Pdtdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pdtdmaxESet;

    /**
     * The default value of the '{@link #getRramp() <em>Rramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRramp()
     * @generated
     * @ordered
     */
    protected static final Float RRAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRramp() <em>Rramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRramp()
     * @generated
     * @ordered
     */
    protected Float rramp = RRAMP_EDEFAULT;

    /**
     * This is true if the Rramp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rrampESet;

    /**
     * The default value of the '{@link #getTdvs() <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdvs()
     * @generated
     * @ordered
     */
    protected static final Float TDVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdvs() <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdvs()
     * @generated
     * @ordered
     */
    protected Float tdvs = TDVS_EDEFAULT;

    /**
     * This is true if the Tdvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdvsESet;

    /**
     * The default value of the '{@link #getTemin() <em>Temin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemin()
     * @generated
     * @ordered
     */
    protected static final Float TEMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemin() <em>Temin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemin()
     * @generated
     * @ordered
     */
    protected Float temin = TEMIN_EDEFAULT;

    /**
     * This is true if the Temin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean teminESet;

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
     * The default value of the '{@link #getTuscale() <em>Tuscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuscale()
     * @generated
     * @ordered
     */
    protected static final Float TUSCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuscale() <em>Tuscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuscale()
     * @generated
     * @ordered
     */
    protected Float tuscale = TUSCALE_EDEFAULT;

    /**
     * This is true if the Tuscale attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuscaleESet;

    /**
     * The default value of the '{@link #getTwref() <em>Twref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwref()
     * @generated
     * @ordered
     */
    protected static final Float TWREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwref() <em>Twref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwref()
     * @generated
     * @ordered
     */
    protected Float twref = TWREF_EDEFAULT;

    /**
     * This is true if the Twref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twrefESet;

    /**
     * The default value of the '{@link #getUdvs() <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdvs()
     * @generated
     * @ordered
     */
    protected static final Float UDVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUdvs() <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdvs()
     * @generated
     * @ordered
     */
    protected Float udvs = UDVS_EDEFAULT;

    /**
     * This is true if the Udvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean udvsESet;

    /**
     * The default value of the '{@link #getUpdip() <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdip()
     * @generated
     * @ordered
     */
    protected static final Float UPDIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpdip() <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdip()
     * @generated
     * @ordered
     */
    protected Float updip = UPDIP_EDEFAULT;

    /**
     * This is true if the Updip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean updipESet;

    /**
     * The default value of the '{@link #getWdtd() <em>Wdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWdtd()
     * @generated
     * @ordered
     */
    protected static final Float WDTD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWdtd() <em>Wdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWdtd()
     * @generated
     * @ordered
     */
    protected Float wdtd = WDTD_EDEFAULT;

    /**
     * This is true if the Wdtd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wdtdESet;

    /**
     * The default value of the '{@link #getZeta() <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeta()
     * @generated
     * @ordered
     */
    protected static final Float ZETA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZeta() <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeta()
     * @generated
     * @ordered
     */
    protected Float zeta = ZETA_EDEFAULT;

    /**
     * This is true if the Zeta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zetaESet;

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
    protected WindContPType3IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPType3IEC();
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
                CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX, oldDpmax, dpmax, !oldDpmaxESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX, oldDpmax, DPMAX_EDEFAULT, oldDpmaxESet ) );
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
    public Float getDtrisemaxlvrt() {
        return dtrisemaxlvrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtrisemaxlvrt( Float newDtrisemaxlvrt ) {
        Float oldDtrisemaxlvrt = dtrisemaxlvrt;
        dtrisemaxlvrt = newDtrisemaxlvrt;
        boolean oldDtrisemaxlvrtESet = dtrisemaxlvrtESet;
        dtrisemaxlvrtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__DTRISEMAXLVRT,
                    oldDtrisemaxlvrt, dtrisemaxlvrt, !oldDtrisemaxlvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtrisemaxlvrt() {
        Float oldDtrisemaxlvrt = dtrisemaxlvrt;
        boolean oldDtrisemaxlvrtESet = dtrisemaxlvrtESet;
        dtrisemaxlvrt = DTRISEMAXLVRT_EDEFAULT;
        dtrisemaxlvrtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__DTRISEMAXLVRT,
                    oldDtrisemaxlvrt, DTRISEMAXLVRT_EDEFAULT, oldDtrisemaxlvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtrisemaxlvrt() {
        return dtrisemaxlvrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKdtd() {
        return kdtd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdtd( Float newKdtd ) {
        Float oldKdtd = kdtd;
        kdtd = newKdtd;
        boolean oldKdtdESet = kdtdESet;
        kdtdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KDTD, oldKdtd, kdtd, !oldKdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdtd() {
        Float oldKdtd = kdtd;
        boolean oldKdtdESet = kdtdESet;
        kdtd = KDTD_EDEFAULT;
        kdtdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KDTD, oldKdtd, KDTD_EDEFAULT, oldKdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdtd() {
        return kdtdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKip() {
        return kip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKip( Float newKip ) {
        Float oldKip = kip;
        kip = newKip;
        boolean oldKipESet = kipESet;
        kipESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KIP, oldKip, kip, !oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKip() {
        Float oldKip = kip;
        boolean oldKipESet = kipESet;
        kip = KIP_EDEFAULT;
        kipESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KIP, oldKip, KIP_EDEFAULT, oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKip() {
        return kipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpp() {
        return kpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpp( Float newKpp ) {
        Float oldKpp = kpp;
        kpp = newKpp;
        boolean oldKppESet = kppESet;
        kppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KPP, oldKpp, kpp, !oldKppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpp() {
        Float oldKpp = kpp;
        boolean oldKppESet = kppESet;
        kpp = KPP_EDEFAULT;
        kppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KPP, oldKpp, KPP_EDEFAULT, oldKppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpp() {
        return kppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMplvrt() {
        return mplvrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMplvrt( Boolean newMplvrt ) {
        Boolean oldMplvrt = mplvrt;
        mplvrt = newMplvrt;
        boolean oldMplvrtESet = mplvrtESet;
        mplvrtESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__MPLVRT, oldMplvrt, mplvrt, !oldMplvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMplvrt() {
        Boolean oldMplvrt = mplvrt;
        boolean oldMplvrtESet = mplvrtESet;
        mplvrt = MPLVRT_EDEFAULT;
        mplvrtESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__MPLVRT, oldMplvrt, MPLVRT_EDEFAULT, oldMplvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMplvrt() {
        return mplvrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmegaoffset() {
        return omegaoffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmegaoffset( Float newOmegaoffset ) {
        Float oldOmegaoffset = omegaoffset;
        omegaoffset = newOmegaoffset;
        boolean oldOmegaoffsetESet = omegaoffsetESet;
        omegaoffsetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET, oldOmegaoffset, omegaoffset, !oldOmegaoffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmegaoffset() {
        Float oldOmegaoffset = omegaoffset;
        boolean oldOmegaoffsetESet = omegaoffsetESet;
        omegaoffset = OMEGAOFFSET_EDEFAULT;
        omegaoffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET,
                    oldOmegaoffset, OMEGAOFFSET_EDEFAULT, oldOmegaoffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmegaoffset() {
        return omegaoffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPdtdmax() {
        return pdtdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPdtdmax( Float newPdtdmax ) {
        Float oldPdtdmax = pdtdmax;
        pdtdmax = newPdtdmax;
        boolean oldPdtdmaxESet = pdtdmaxESet;
        pdtdmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX, oldPdtdmax, pdtdmax, !oldPdtdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPdtdmax() {
        Float oldPdtdmax = pdtdmax;
        boolean oldPdtdmaxESet = pdtdmaxESet;
        pdtdmax = PDTDMAX_EDEFAULT;
        pdtdmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX, oldPdtdmax, PDTDMAX_EDEFAULT, oldPdtdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPdtdmax() {
        return pdtdmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRramp() {
        return rramp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRramp( Float newRramp ) {
        Float oldRramp = rramp;
        rramp = newRramp;
        boolean oldRrampESet = rrampESet;
        rrampESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__RRAMP, oldRramp, rramp, !oldRrampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRramp() {
        Float oldRramp = rramp;
        boolean oldRrampESet = rrampESet;
        rramp = RRAMP_EDEFAULT;
        rrampESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__RRAMP, oldRramp, RRAMP_EDEFAULT, oldRrampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRramp() {
        return rrampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTdvs() {
        return tdvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdvs( Float newTdvs ) {
        Float oldTdvs = tdvs;
        tdvs = newTdvs;
        boolean oldTdvsESet = tdvsESet;
        tdvsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TDVS, oldTdvs, tdvs, !oldTdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdvs() {
        Float oldTdvs = tdvs;
        boolean oldTdvsESet = tdvsESet;
        tdvs = TDVS_EDEFAULT;
        tdvsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TDVS, oldTdvs, TDVS_EDEFAULT, oldTdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdvs() {
        return tdvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTemin() {
        return temin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTemin( Float newTemin ) {
        Float oldTemin = temin;
        temin = newTemin;
        boolean oldTeminESet = teminESet;
        teminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TEMIN, oldTemin, temin, !oldTeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTemin() {
        Float oldTemin = temin;
        boolean oldTeminESet = teminESet;
        temin = TEMIN_EDEFAULT;
        teminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TEMIN, oldTemin, TEMIN_EDEFAULT, oldTeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTemin() {
        return teminESet;
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILT, oldTomegafilt, tomegafilt, !oldTomegafiltESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILT, oldTomegafilt, TOMEGAFILT_EDEFAULT, oldTomegafiltESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TPFILT, oldTpfilt, tpfilt, !oldTpfiltESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TPFILT, oldTpfilt, TPFILT_EDEFAULT, oldTpfiltESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TPORD, oldTpord, tpord, !oldTpordESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TPORD, oldTpord, TPORD_EDEFAULT, oldTpordESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TUFILT, oldTufilt, tufilt, !oldTufiltESet ) );
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
                CimPackage.WIND_CONT_PTYPE3_IEC__TUFILT, oldTufilt, TUFILT_EDEFAULT, oldTufiltESet ) );
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
    public Float getTuscale() {
        return tuscale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuscale( Float newTuscale ) {
        Float oldTuscale = tuscale;
        tuscale = newTuscale;
        boolean oldTuscaleESet = tuscaleESet;
        tuscaleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TUSCALE, oldTuscale, tuscale, !oldTuscaleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuscale() {
        Float oldTuscale = tuscale;
        boolean oldTuscaleESet = tuscaleESet;
        tuscale = TUSCALE_EDEFAULT;
        tuscaleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TUSCALE, oldTuscale, TUSCALE_EDEFAULT, oldTuscaleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuscale() {
        return tuscaleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTwref() {
        return twref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwref( Float newTwref ) {
        Float oldTwref = twref;
        twref = newTwref;
        boolean oldTwrefESet = twrefESet;
        twrefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TWREF, oldTwref, twref, !oldTwrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwref() {
        Float oldTwref = twref;
        boolean oldTwrefESet = twrefESet;
        twref = TWREF_EDEFAULT;
        twrefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TWREF, oldTwref, TWREF_EDEFAULT, oldTwrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwref() {
        return twrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUdvs() {
        return udvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUdvs( Float newUdvs ) {
        Float oldUdvs = udvs;
        udvs = newUdvs;
        boolean oldUdvsESet = udvsESet;
        udvsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UDVS, oldUdvs, udvs, !oldUdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUdvs() {
        Float oldUdvs = udvs;
        boolean oldUdvsESet = udvsESet;
        udvs = UDVS_EDEFAULT;
        udvsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UDVS, oldUdvs, UDVS_EDEFAULT, oldUdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUdvs() {
        return udvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUpdip() {
        return updip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpdip( Float newUpdip ) {
        Float oldUpdip = updip;
        updip = newUpdip;
        boolean oldUpdipESet = updipESet;
        updipESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP, oldUpdip, updip, !oldUpdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpdip() {
        Float oldUpdip = updip;
        boolean oldUpdipESet = updipESet;
        updip = UPDIP_EDEFAULT;
        updipESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP, oldUpdip, UPDIP_EDEFAULT, oldUpdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpdip() {
        return updipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getWdtd() {
        return wdtd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWdtd( Float newWdtd ) {
        Float oldWdtd = wdtd;
        wdtd = newWdtd;
        boolean oldWdtdESet = wdtdESet;
        wdtdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__WDTD, oldWdtd, wdtd, !oldWdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWdtd() {
        Float oldWdtd = wdtd;
        boolean oldWdtdESet = wdtdESet;
        wdtd = WDTD_EDEFAULT;
        wdtdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__WDTD, oldWdtd, WDTD_EDEFAULT, oldWdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWdtd() {
        return wdtdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getZeta() {
        return zeta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZeta( Float newZeta ) {
        Float oldZeta = zeta;
        zeta = newZeta;
        boolean oldZetaESet = zetaESet;
        zetaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__ZETA, oldZeta, zeta, !oldZetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZeta() {
        Float oldZeta = zeta;
        boolean oldZetaESet = zetaESet;
        zeta = ZETA_EDEFAULT;
        zetaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__ZETA, oldZeta, ZETA_EDEFAULT, oldZetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZeta() {
        return zetaESet;
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
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, oldWindGenTurbineType3IEC,
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
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, oldWindGenTurbineType3IEC,
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
                        CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindGenTurbineType3IEC.class,
                        msgs );
            if( newWindGenTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindGenTurbineType3IEC.class,
                        msgs );
            msgs = basicSetWindGenTurbineType3IEC( newWindGenTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType3IECESet = windGenTurbineType3IECESet;
            windGenTurbineType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, newWindGenTurbineType3IEC,
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
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, oldWindGenTurbineType3IEC, null,
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
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindGenTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindGenTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType3IECESet = windGenTurbineType3IECESet;
            windGenTurbineType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, null, null,
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
    public EList< WindDynamicsLookupTable > getWindDynamicsLookupTable() {
        if( windDynamicsLookupTable == null ) {
            windDynamicsLookupTable = new EObjectWithInverseResolvingEList.Unsettable< WindDynamicsLookupTable >(
                    WindDynamicsLookupTable.class, this, CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC );
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            if( windGenTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType3IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindGenTurbineType3IEC.class,
                        msgs );
            return basicSetWindGenTurbineType3IEC( ( WindGenTurbineType3IEC ) otherEnd, msgs );
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            return basicUnsetWindGenTurbineType3IEC( msgs );
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            return getDpmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTRISEMAXLVRT:
            return getDtrisemaxlvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            return getKdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            return getKip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            return getKpp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPLVRT:
            return getMplvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            return getOmegaoffset();
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            return getPdtdmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__RRAMP:
            return getRramp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            return getTdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TEMIN:
            return getTemin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILT:
            return getTomegafilt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILT:
            return getTpfilt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            return getTpord();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILT:
            return getTufilt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUSCALE:
            return getTuscale();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            return getTwref();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            return getUdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            return getUpdip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            return getWdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            return getZeta();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            if( resolve ) return getWindGenTurbineType3IEC();
            return basicGetWindGenTurbineType3IEC();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            setDpmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTRISEMAXLVRT:
            setDtrisemaxlvrt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            setKdtd( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            setKip( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            setKpp( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPLVRT:
            setMplvrt( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            setOmegaoffset( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            setPdtdmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__RRAMP:
            setRramp( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            setTdvs( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TEMIN:
            setTemin( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILT:
            setTomegafilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILT:
            setTpfilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            setTpord( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILT:
            setTufilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUSCALE:
            setTuscale( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            setTwref( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            setUdvs( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            setUpdip( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            setWdtd( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            setZeta( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            setWindGenTurbineType3IEC( ( WindGenTurbineType3IEC ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            unsetDpmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTRISEMAXLVRT:
            unsetDtrisemaxlvrt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            unsetKdtd();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            unsetKip();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            unsetKpp();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPLVRT:
            unsetMplvrt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            unsetOmegaoffset();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            unsetPdtdmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__RRAMP:
            unsetRramp();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            unsetTdvs();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TEMIN:
            unsetTemin();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILT:
            unsetTomegafilt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILT:
            unsetTpfilt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            unsetTpord();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILT:
            unsetTufilt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUSCALE:
            unsetTuscale();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            unsetTwref();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            unsetUdvs();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            unsetUpdip();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            unsetWdtd();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            unsetZeta();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            unsetWindGenTurbineType3IEC();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            return isSetDpmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTRISEMAXLVRT:
            return isSetDtrisemaxlvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            return isSetKdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            return isSetKip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            return isSetKpp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPLVRT:
            return isSetMplvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            return isSetOmegaoffset();
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            return isSetPdtdmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__RRAMP:
            return isSetRramp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            return isSetTdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TEMIN:
            return isSetTemin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILT:
            return isSetTomegafilt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILT:
            return isSetTpfilt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            return isSetTpord();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILT:
            return isSetTufilt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUSCALE:
            return isSetTuscale();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            return isSetTwref();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            return isSetUdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            return isSetUpdip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            return isSetWdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            return isSetZeta();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC:
            return isSetWindGenTurbineType3IEC();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        result.append( " (dpmax: " );
        if( dpmaxESet )
            result.append( dpmax );
        else
            result.append( "<unset>" );
        result.append( ", dtrisemaxlvrt: " );
        if( dtrisemaxlvrtESet )
            result.append( dtrisemaxlvrt );
        else
            result.append( "<unset>" );
        result.append( ", kdtd: " );
        if( kdtdESet )
            result.append( kdtd );
        else
            result.append( "<unset>" );
        result.append( ", kip: " );
        if( kipESet )
            result.append( kip );
        else
            result.append( "<unset>" );
        result.append( ", kpp: " );
        if( kppESet )
            result.append( kpp );
        else
            result.append( "<unset>" );
        result.append( ", mplvrt: " );
        if( mplvrtESet )
            result.append( mplvrt );
        else
            result.append( "<unset>" );
        result.append( ", omegaoffset: " );
        if( omegaoffsetESet )
            result.append( omegaoffset );
        else
            result.append( "<unset>" );
        result.append( ", pdtdmax: " );
        if( pdtdmaxESet )
            result.append( pdtdmax );
        else
            result.append( "<unset>" );
        result.append( ", rramp: " );
        if( rrampESet )
            result.append( rramp );
        else
            result.append( "<unset>" );
        result.append( ", tdvs: " );
        if( tdvsESet )
            result.append( tdvs );
        else
            result.append( "<unset>" );
        result.append( ", temin: " );
        if( teminESet )
            result.append( temin );
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
        result.append( ", tuscale: " );
        if( tuscaleESet )
            result.append( tuscale );
        else
            result.append( "<unset>" );
        result.append( ", twref: " );
        if( twrefESet )
            result.append( twref );
        else
            result.append( "<unset>" );
        result.append( ", udvs: " );
        if( udvsESet )
            result.append( udvs );
        else
            result.append( "<unset>" );
        result.append( ", updip: " );
        if( updipESet )
            result.append( updip );
        else
            result.append( "<unset>" );
        result.append( ", wdtd: " );
        if( wdtdESet )
            result.append( wdtd );
        else
            result.append( "<unset>" );
        result.append( ", zeta: " );
        if( zetaESet )
            result.append( zeta );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContPType3IECImpl
