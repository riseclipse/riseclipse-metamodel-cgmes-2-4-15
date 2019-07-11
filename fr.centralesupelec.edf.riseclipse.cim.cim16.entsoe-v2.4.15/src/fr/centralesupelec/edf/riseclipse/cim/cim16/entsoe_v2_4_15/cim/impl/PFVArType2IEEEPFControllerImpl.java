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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PFVArType2IEEEPFController;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFV Ar Type2 IEEEPF Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PFVArType2IEEEPFControllerImpl#getExlon <em>Exlon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PFVArType2IEEEPFControllerImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PFVArType2IEEEPFControllerImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PFVArType2IEEEPFControllerImpl#getPfref <em>Pfref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PFVArType2IEEEPFControllerImpl#getVclmt <em>Vclmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PFVArType2IEEEPFControllerImpl#getVref <em>Vref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PFVArType2IEEEPFControllerImpl#getVs <em>Vs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFVArType2IEEEPFControllerImpl extends PFVArControllerType2DynamicsImpl
        implements PFVArType2IEEEPFController {
    /**
     * The default value of the '{@link #getExlon() <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExlon()
     * @generated
     * @ordered
     */
    protected static final Boolean EXLON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExlon() <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExlon()
     * @generated
     * @ordered
     */
    protected Boolean exlon = EXLON_EDEFAULT;

    /**
     * This is true if the Exlon attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean exlonESet;

    /**
     * The default value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected static final Float KI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected Float ki = KI_EDEFAULT;

    /**
     * This is true if the Ki attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiESet;

    /**
     * The default value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected static final Float KP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected Float kp = KP_EDEFAULT;

    /**
     * This is true if the Kp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpESet;

    /**
     * The default value of the '{@link #getPfref() <em>Pfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfref()
     * @generated
     * @ordered
     */
    protected static final Float PFREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPfref() <em>Pfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfref()
     * @generated
     * @ordered
     */
    protected Float pfref = PFREF_EDEFAULT;

    /**
     * This is true if the Pfref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfrefESet;

    /**
     * The default value of the '{@link #getVclmt() <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVclmt()
     * @generated
     * @ordered
     */
    protected static final Float VCLMT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVclmt() <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVclmt()
     * @generated
     * @ordered
     */
    protected Float vclmt = VCLMT_EDEFAULT;

    /**
     * This is true if the Vclmt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vclmtESet;

    /**
     * The default value of the '{@link #getVref() <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVref()
     * @generated
     * @ordered
     */
    protected static final Float VREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVref() <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVref()
     * @generated
     * @ordered
     */
    protected Float vref = VREF_EDEFAULT;

    /**
     * This is true if the Vref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrefESet;

    /**
     * The default value of the '{@link #getVs() <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVs()
     * @generated
     * @ordered
     */
    protected static final Float VS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVs() <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVs()
     * @generated
     * @ordered
     */
    protected Float vs = VS_EDEFAULT;

    /**
     * This is true if the Vs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PFVArType2IEEEPFControllerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPFVArType2IEEEPFController();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getExlon() {
        return exlon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExlon( Boolean newExlon ) {
        Boolean oldExlon = exlon;
        exlon = newExlon;
        boolean oldExlonESet = exlonESet;
        exlonESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__EXLON,
                    oldExlon, exlon, !oldExlonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExlon() {
        Boolean oldExlon = exlon;
        boolean oldExlonESet = exlonESet;
        exlon = EXLON_EDEFAULT;
        exlonESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__EXLON,
                    oldExlon, EXLON_EDEFAULT, oldExlonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExlon() {
        return exlonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKi() {
        return ki;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi( Float newKi ) {
        Float oldKi = ki;
        ki = newKi;
        boolean oldKiESet = kiESet;
        kiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KI,
                    oldKi, ki, !oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi() {
        Float oldKi = ki;
        boolean oldKiESet = kiESet;
        ki = KI_EDEFAULT;
        kiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KI,
                    oldKi, KI_EDEFAULT, oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi() {
        return kiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKp() {
        return kp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp( Float newKp ) {
        Float oldKp = kp;
        kp = newKp;
        boolean oldKpESet = kpESet;
        kpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KP,
                    oldKp, kp, !oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp() {
        Float oldKp = kp;
        boolean oldKpESet = kpESet;
        kp = KP_EDEFAULT;
        kpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KP,
                    oldKp, KP_EDEFAULT, oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp() {
        return kpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPfref() {
        return pfref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPfref( Float newPfref ) {
        Float oldPfref = pfref;
        pfref = newPfref;
        boolean oldPfrefESet = pfrefESet;
        pfrefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__PFREF,
                    oldPfref, pfref, !oldPfrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPfref() {
        Float oldPfref = pfref;
        boolean oldPfrefESet = pfrefESet;
        pfref = PFREF_EDEFAULT;
        pfrefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__PFREF,
                    oldPfref, PFREF_EDEFAULT, oldPfrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPfref() {
        return pfrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVclmt() {
        return vclmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVclmt( Float newVclmt ) {
        Float oldVclmt = vclmt;
        vclmt = newVclmt;
        boolean oldVclmtESet = vclmtESet;
        vclmtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VCLMT,
                    oldVclmt, vclmt, !oldVclmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVclmt() {
        Float oldVclmt = vclmt;
        boolean oldVclmtESet = vclmtESet;
        vclmt = VCLMT_EDEFAULT;
        vclmtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VCLMT,
                    oldVclmt, VCLMT_EDEFAULT, oldVclmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVclmt() {
        return vclmtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVref() {
        return vref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVref( Float newVref ) {
        Float oldVref = vref;
        vref = newVref;
        boolean oldVrefESet = vrefESet;
        vrefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VREF,
                    oldVref, vref, !oldVrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVref() {
        Float oldVref = vref;
        boolean oldVrefESet = vrefESet;
        vref = VREF_EDEFAULT;
        vrefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VREF,
                    oldVref, VREF_EDEFAULT, oldVrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVref() {
        return vrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVs() {
        return vs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVs( Float newVs ) {
        Float oldVs = vs;
        vs = newVs;
        boolean oldVsESet = vsESet;
        vsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VS,
                    oldVs, vs, !oldVsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVs() {
        Float oldVs = vs;
        boolean oldVsESet = vsESet;
        vs = VS_EDEFAULT;
        vsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VS,
                    oldVs, VS_EDEFAULT, oldVsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVs() {
        return vsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__EXLON:
            return getExlon();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KI:
            return getKi();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KP:
            return getKp();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__PFREF:
            return getPfref();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VCLMT:
            return getVclmt();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VREF:
            return getVref();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VS:
            return getVs();
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
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__EXLON:
            setExlon( ( Boolean ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__PFREF:
            setPfref( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VCLMT:
            setVclmt( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VREF:
            setVref( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VS:
            setVs( ( Float ) newValue );
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
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__EXLON:
            unsetExlon();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KI:
            unsetKi();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KP:
            unsetKp();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__PFREF:
            unsetPfref();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VCLMT:
            unsetVclmt();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VREF:
            unsetVref();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VS:
            unsetVs();
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
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__EXLON:
            return isSetExlon();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KI:
            return isSetKi();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__KP:
            return isSetKp();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__PFREF:
            return isSetPfref();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VCLMT:
            return isSetVclmt();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VREF:
            return isSetVref();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER__VS:
            return isSetVs();
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
        result.append( " (exlon: " );
        if( exlonESet )
            result.append( exlon );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", pfref: " );
        if( pfrefESet )
            result.append( pfref );
        else
            result.append( "<unset>" );
        result.append( ", vclmt: " );
        if( vclmtESet )
            result.append( vclmt );
        else
            result.append( "<unset>" );
        result.append( ", vref: " );
        if( vrefESet )
            result.append( vref );
        else
            result.append( "<unset>" );
        result.append( ", vs: " );
        if( vsESet )
            result.append( vs );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PFVArType2IEEEPFControllerImpl
