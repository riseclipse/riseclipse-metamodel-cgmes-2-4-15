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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContCurrLimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC;

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
 * An implementation of the model object '<em><b>Wind Cont Curr Lim IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContCurrLimIECImpl#getImax <em>Imax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContCurrLimIECImpl#getImaxdip <em>Imaxdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContCurrLimIECImpl#getMdfslim <em>Mdfslim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContCurrLimIECImpl#getMqpri <em>Mqpri</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContCurrLimIECImpl#getTufilt <em>Tufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContCurrLimIECImpl#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindContCurrLimIECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContCurrLimIECImpl extends IdentifiedObjectImpl implements WindContCurrLimIEC {
    /**
     * The default value of the '{@link #getImax() <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImax()
     * @generated
     * @ordered
     */
    protected static final Float IMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImax() <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImax()
     * @generated
     * @ordered
     */
    protected Float imax = IMAX_EDEFAULT;

    /**
     * This is true if the Imax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean imaxESet;

    /**
     * The default value of the '{@link #getImaxdip() <em>Imaxdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImaxdip()
     * @generated
     * @ordered
     */
    protected static final Float IMAXDIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImaxdip() <em>Imaxdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImaxdip()
     * @generated
     * @ordered
     */
    protected Float imaxdip = IMAXDIP_EDEFAULT;

    /**
     * This is true if the Imaxdip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean imaxdipESet;

    /**
     * The default value of the '{@link #getMdfslim() <em>Mdfslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMdfslim()
     * @generated
     * @ordered
     */
    protected static final Boolean MDFSLIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMdfslim() <em>Mdfslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMdfslim()
     * @generated
     * @ordered
     */
    protected Boolean mdfslim = MDFSLIM_EDEFAULT;

    /**
     * This is true if the Mdfslim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mdfslimESet;

    /**
     * The default value of the '{@link #getMqpri() <em>Mqpri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqpri()
     * @generated
     * @ordered
     */
    protected static final Boolean MQPRI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMqpri() <em>Mqpri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqpri()
     * @generated
     * @ordered
     */
    protected Boolean mqpri = MQPRI_EDEFAULT;

    /**
     * This is true if the Mqpri attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mqpriESet;

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
     * The cached value of the '{@link #getWindTurbineType3or4IEC() <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3or4IEC windTurbineType3or4IEC;

    /**
     * This is true if the Wind Turbine Type3or4 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3or4IECESet;

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
    protected WindContCurrLimIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContCurrLimIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getImax() {
        return imax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImax( Float newImax ) {
        Float oldImax = imax;
        imax = newImax;
        boolean oldImaxESet = imaxESet;
        imaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_CURR_LIM_IEC__IMAX, oldImax,
                    imax, !oldImaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImax() {
        Float oldImax = imax;
        boolean oldImaxESet = imaxESet;
        imax = IMAX_EDEFAULT;
        imaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_CURR_LIM_IEC__IMAX, oldImax,
                    IMAX_EDEFAULT, oldImaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImax() {
        return imaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getImaxdip() {
        return imaxdip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImaxdip( Float newImaxdip ) {
        Float oldImaxdip = imaxdip;
        imaxdip = newImaxdip;
        boolean oldImaxdipESet = imaxdipESet;
        imaxdipESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_CURR_LIM_IEC__IMAXDIP,
                    oldImaxdip, imaxdip, !oldImaxdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImaxdip() {
        Float oldImaxdip = imaxdip;
        boolean oldImaxdipESet = imaxdipESet;
        imaxdip = IMAXDIP_EDEFAULT;
        imaxdipESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_CURR_LIM_IEC__IMAXDIP,
                    oldImaxdip, IMAXDIP_EDEFAULT, oldImaxdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImaxdip() {
        return imaxdipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMdfslim() {
        return mdfslim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMdfslim( Boolean newMdfslim ) {
        Boolean oldMdfslim = mdfslim;
        mdfslim = newMdfslim;
        boolean oldMdfslimESet = mdfslimESet;
        mdfslimESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_CURR_LIM_IEC__MDFSLIM,
                    oldMdfslim, mdfslim, !oldMdfslimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMdfslim() {
        Boolean oldMdfslim = mdfslim;
        boolean oldMdfslimESet = mdfslimESet;
        mdfslim = MDFSLIM_EDEFAULT;
        mdfslimESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_CURR_LIM_IEC__MDFSLIM,
                    oldMdfslim, MDFSLIM_EDEFAULT, oldMdfslimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMdfslim() {
        return mdfslimESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMqpri() {
        return mqpri;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMqpri( Boolean newMqpri ) {
        Boolean oldMqpri = mqpri;
        mqpri = newMqpri;
        boolean oldMqpriESet = mqpriESet;
        mqpriESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_CURR_LIM_IEC__MQPRI, oldMqpri,
                    mqpri, !oldMqpriESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMqpri() {
        Boolean oldMqpri = mqpri;
        boolean oldMqpriESet = mqpriESet;
        mqpri = MQPRI_EDEFAULT;
        mqpriESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_CURR_LIM_IEC__MQPRI,
                    oldMqpri, MQPRI_EDEFAULT, oldMqpriESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMqpri() {
        return mqpriESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_CURR_LIM_IEC__TUFILT,
                    oldTufilt, tufilt, !oldTufiltESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_CURR_LIM_IEC__TUFILT,
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
    public EList< WindDynamicsLookupTable > getWindDynamicsLookupTable() {
        if( windDynamicsLookupTable == null ) {
            windDynamicsLookupTable = new EObjectWithInverseResolvingEList.Unsettable< WindDynamicsLookupTable >(
                    WindDynamicsLookupTable.class, this, CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_CURR_LIM_IEC );
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
    @Override
    public WindTurbineType3or4IEC getWindTurbineType3or4IEC() {
        return windTurbineType3or4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3or4IEC( WindTurbineType3or4IEC newWindTurbineType3or4IEC,
            NotificationChain msgs ) {
        WindTurbineType3or4IEC oldWindTurbineType3or4IEC = windTurbineType3or4IEC;
        windTurbineType3or4IEC = newWindTurbineType3or4IEC;
        boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
        windTurbineType3or4IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC,
                    newWindTurbineType3or4IEC, !oldWindTurbineType3or4IECESet );
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
    public void setWindTurbineType3or4IEC( WindTurbineType3or4IEC newWindTurbineType3or4IEC ) {
        if( newWindTurbineType3or4IEC != windTurbineType3or4IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, WindTurbineType3or4IEC.class,
                        msgs );
            if( newWindTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, WindTurbineType3or4IEC.class,
                        msgs );
            msgs = basicSetWindTurbineType3or4IEC( newWindTurbineType3or4IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, newWindTurbineType3or4IEC,
                        newWindTurbineType3or4IEC, !oldWindTurbineType3or4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3or4IEC( NotificationChain msgs ) {
        WindTurbineType3or4IEC oldWindTurbineType3or4IEC = windTurbineType3or4IEC;
        windTurbineType3or4IEC = null;
        boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
        windTurbineType3or4IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC, null,
                    oldWindTurbineType3or4IECESet );
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
    public void unsetWindTurbineType3or4IEC() {
        if( windTurbineType3or4IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, WindTurbineType3or4IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3or4IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, null, null,
                        oldWindTurbineType3or4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4IEC() {
        return windTurbineType3or4IECESet;
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
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            if( windTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, WindTurbineType3or4IEC.class,
                        msgs );
            return basicSetWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) otherEnd, msgs );
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return basicUnsetWindTurbineType3or4IEC( msgs );
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAX:
            return getImax();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAXDIP:
            return getImaxdip();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MDFSLIM:
            return getMdfslim();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MQPRI:
            return getMqpri();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__TUFILT:
            return getTufilt();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return getWindTurbineType3or4IEC();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAX:
            setImax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAXDIP:
            setImaxdip( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MDFSLIM:
            setMdfslim( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MQPRI:
            setMqpri( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__TUFILT:
            setTufilt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            setWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) newValue );
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAX:
            unsetImax();
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAXDIP:
            unsetImaxdip();
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MDFSLIM:
            unsetMdfslim();
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MQPRI:
            unsetMqpri();
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__TUFILT:
            unsetTufilt();
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            unsetWindTurbineType3or4IEC();
            return;
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAX:
            return isSetImax();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAXDIP:
            return isSetImaxdip();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MDFSLIM:
            return isSetMdfslim();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MQPRI:
            return isSetMqpri();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__TUFILT:
            return isSetTufilt();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return isSetWindTurbineType3or4IEC();
        case CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (imax: " );
        if( imaxESet )
            result.append( imax );
        else
            result.append( "<unset>" );
        result.append( ", imaxdip: " );
        if( imaxdipESet )
            result.append( imaxdip );
        else
            result.append( "<unset>" );
        result.append( ", mdfslim: " );
        if( mdfslimESet )
            result.append( mdfslim );
        else
            result.append( "<unset>" );
        result.append( ", mqpri: " );
        if( mqpriESet )
            result.append( mqpri );
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

} //WindContCurrLimIECImpl
