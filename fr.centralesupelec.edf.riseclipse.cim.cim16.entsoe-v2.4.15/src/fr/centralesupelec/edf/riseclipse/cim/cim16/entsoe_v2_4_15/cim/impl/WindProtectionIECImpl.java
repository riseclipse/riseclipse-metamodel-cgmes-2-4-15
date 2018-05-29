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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindProtectionIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType1or2IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Protection IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getFover <em>Fover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getFunder <em>Funder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getTfover <em>Tfover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getTfunder <em>Tfunder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getTuover <em>Tuover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getTuunder <em>Tuunder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getUover <em>Uover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getUunder <em>Uunder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindProtectionIECImpl#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindProtectionIECImpl extends IdentifiedObjectImpl implements WindProtectionIEC {
    /**
     * The default value of the '{@link #getFover() <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFover()
     * @generated
     * @ordered
     */
    protected static final Float FOVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFover() <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFover()
     * @generated
     * @ordered
     */
    protected Float fover = FOVER_EDEFAULT;

    /**
     * This is true if the Fover attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean foverESet;

    /**
     * The default value of the '{@link #getFunder() <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunder()
     * @generated
     * @ordered
     */
    protected static final Float FUNDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunder() <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunder()
     * @generated
     * @ordered
     */
    protected Float funder = FUNDER_EDEFAULT;

    /**
     * This is true if the Funder attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean funderESet;

    /**
     * The default value of the '{@link #getTfover() <em>Tfover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfover()
     * @generated
     * @ordered
     */
    protected static final Float TFOVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfover() <em>Tfover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfover()
     * @generated
     * @ordered
     */
    protected Float tfover = TFOVER_EDEFAULT;

    /**
     * This is true if the Tfover attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfoverESet;

    /**
     * The default value of the '{@link #getTfunder() <em>Tfunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfunder()
     * @generated
     * @ordered
     */
    protected static final Float TFUNDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfunder() <em>Tfunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfunder()
     * @generated
     * @ordered
     */
    protected Float tfunder = TFUNDER_EDEFAULT;

    /**
     * This is true if the Tfunder attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfunderESet;

    /**
     * The default value of the '{@link #getTuover() <em>Tuover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuover()
     * @generated
     * @ordered
     */
    protected static final Float TUOVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuover() <em>Tuover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuover()
     * @generated
     * @ordered
     */
    protected Float tuover = TUOVER_EDEFAULT;

    /**
     * This is true if the Tuover attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuoverESet;

    /**
     * The default value of the '{@link #getTuunder() <em>Tuunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuunder()
     * @generated
     * @ordered
     */
    protected static final Float TUUNDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuunder() <em>Tuunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuunder()
     * @generated
     * @ordered
     */
    protected Float tuunder = TUUNDER_EDEFAULT;

    /**
     * This is true if the Tuunder attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuunderESet;

    /**
     * The default value of the '{@link #getUover() <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUover()
     * @generated
     * @ordered
     */
    protected static final Float UOVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUover() <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUover()
     * @generated
     * @ordered
     */
    protected Float uover = UOVER_EDEFAULT;

    /**
     * This is true if the Uover attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uoverESet;

    /**
     * The default value of the '{@link #getUunder() <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUunder()
     * @generated
     * @ordered
     */
    protected static final Float UUNDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUunder() <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUunder()
     * @generated
     * @ordered
     */
    protected Float uunder = UUNDER_EDEFAULT;

    /**
     * This is true if the Uunder attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uunderESet;

    /**
     * The cached value of the '{@link #getWindTurbineType1or2IEC() <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType1or2IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType1or2IEC windTurbineType1or2IEC;

    /**
     * This is true if the Wind Turbine Type1or2 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType1or2IECESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindProtectionIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindProtectionIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFover() {
        return fover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFover( Float newFover ) {
        Float oldFover = fover;
        fover = newFover;
        boolean oldFoverESet = foverESet;
        foverESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__FOVER, oldFover, fover, !oldFoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFover() {
        Float oldFover = fover;
        boolean oldFoverESet = foverESet;
        fover = FOVER_EDEFAULT;
        foverESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__FOVER, oldFover, FOVER_EDEFAULT, oldFoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFover() {
        return foverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFunder() {
        return funder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunder( Float newFunder ) {
        Float oldFunder = funder;
        funder = newFunder;
        boolean oldFunderESet = funderESet;
        funderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__FUNDER, oldFunder, funder, !oldFunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunder() {
        Float oldFunder = funder;
        boolean oldFunderESet = funderESet;
        funder = FUNDER_EDEFAULT;
        funderESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__FUNDER, oldFunder, FUNDER_EDEFAULT, oldFunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunder() {
        return funderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTfover() {
        return tfover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfover( Float newTfover ) {
        Float oldTfover = tfover;
        tfover = newTfover;
        boolean oldTfoverESet = tfoverESet;
        tfoverESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__TFOVER, oldTfover, tfover, !oldTfoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfover() {
        Float oldTfover = tfover;
        boolean oldTfoverESet = tfoverESet;
        tfover = TFOVER_EDEFAULT;
        tfoverESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__TFOVER, oldTfover, TFOVER_EDEFAULT, oldTfoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfover() {
        return tfoverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTfunder() {
        return tfunder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfunder( Float newTfunder ) {
        Float oldTfunder = tfunder;
        tfunder = newTfunder;
        boolean oldTfunderESet = tfunderESet;
        tfunderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__TFUNDER, oldTfunder, tfunder, !oldTfunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfunder() {
        Float oldTfunder = tfunder;
        boolean oldTfunderESet = tfunderESet;
        tfunder = TFUNDER_EDEFAULT;
        tfunderESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__TFUNDER, oldTfunder, TFUNDER_EDEFAULT, oldTfunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfunder() {
        return tfunderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTuover() {
        return tuover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuover( Float newTuover ) {
        Float oldTuover = tuover;
        tuover = newTuover;
        boolean oldTuoverESet = tuoverESet;
        tuoverESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__TUOVER, oldTuover, tuover, !oldTuoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuover() {
        Float oldTuover = tuover;
        boolean oldTuoverESet = tuoverESet;
        tuover = TUOVER_EDEFAULT;
        tuoverESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__TUOVER, oldTuover, TUOVER_EDEFAULT, oldTuoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuover() {
        return tuoverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTuunder() {
        return tuunder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuunder( Float newTuunder ) {
        Float oldTuunder = tuunder;
        tuunder = newTuunder;
        boolean oldTuunderESet = tuunderESet;
        tuunderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__TUUNDER, oldTuunder, tuunder, !oldTuunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuunder() {
        Float oldTuunder = tuunder;
        boolean oldTuunderESet = tuunderESet;
        tuunder = TUUNDER_EDEFAULT;
        tuunderESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__TUUNDER, oldTuunder, TUUNDER_EDEFAULT, oldTuunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuunder() {
        return tuunderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUover() {
        return uover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUover( Float newUover ) {
        Float oldUover = uover;
        uover = newUover;
        boolean oldUoverESet = uoverESet;
        uoverESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__UOVER, oldUover, uover, !oldUoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUover() {
        Float oldUover = uover;
        boolean oldUoverESet = uoverESet;
        uover = UOVER_EDEFAULT;
        uoverESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__UOVER, oldUover, UOVER_EDEFAULT, oldUoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUover() {
        return uoverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUunder() {
        return uunder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUunder( Float newUunder ) {
        Float oldUunder = uunder;
        uunder = newUunder;
        boolean oldUunderESet = uunderESet;
        uunderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__UUNDER, oldUunder, uunder, !oldUunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUunder() {
        Float oldUunder = uunder;
        boolean oldUunderESet = uunderESet;
        uunder = UUNDER_EDEFAULT;
        uunderESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__UUNDER, oldUunder, UUNDER_EDEFAULT, oldUunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUunder() {
        return uunderESet;
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
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC,
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
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            if( newWindTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            msgs = basicSetWindTurbineType3or4IEC( newWindTurbineType3or4IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, newWindTurbineType3or4IEC,
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
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC, null,
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
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3or4IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, null, null,
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
    @Override
    public WindTurbineType1or2IEC getWindTurbineType1or2IEC() {
        return windTurbineType1or2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType1or2IEC( WindTurbineType1or2IEC newWindTurbineType1or2IEC,
            NotificationChain msgs ) {
        WindTurbineType1or2IEC oldWindTurbineType1or2IEC = windTurbineType1or2IEC;
        windTurbineType1or2IEC = newWindTurbineType1or2IEC;
        boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
        windTurbineType1or2IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC,
                    newWindTurbineType1or2IEC, !oldWindTurbineType1or2IECESet );
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
    public void setWindTurbineType1or2IEC( WindTurbineType1or2IEC newWindTurbineType1or2IEC ) {
        if( newWindTurbineType1or2IEC != windTurbineType1or2IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            if( newWindTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType1or2IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            msgs = basicSetWindTurbineType1or2IEC( newWindTurbineType1or2IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
            windTurbineType1or2IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, newWindTurbineType1or2IEC,
                    newWindTurbineType1or2IEC, !oldWindTurbineType1or2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType1or2IEC( NotificationChain msgs ) {
        WindTurbineType1or2IEC oldWindTurbineType1or2IEC = windTurbineType1or2IEC;
        windTurbineType1or2IEC = null;
        boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
        windTurbineType1or2IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC, null,
                    oldWindTurbineType1or2IECESet );
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
    public void unsetWindTurbineType1or2IEC() {
        if( windTurbineType1or2IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            msgs = basicUnsetWindTurbineType1or2IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
            windTurbineType1or2IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, null, null,
                    oldWindTurbineType1or2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType1or2IEC() {
        return windTurbineType1or2IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            if( windTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            return basicSetWindTurbineType1or2IEC( ( WindTurbineType1or2IEC ) otherEnd, msgs );
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            if( windTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            return basicSetWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            return basicUnsetWindTurbineType1or2IEC( msgs );
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return basicUnsetWindTurbineType3or4IEC( msgs );
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
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            return getFover();
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            return getFunder();
        case CimPackage.WIND_PROTECTION_IEC__TFOVER:
            return getTfover();
        case CimPackage.WIND_PROTECTION_IEC__TFUNDER:
            return getTfunder();
        case CimPackage.WIND_PROTECTION_IEC__TUOVER:
            return getTuover();
        case CimPackage.WIND_PROTECTION_IEC__TUUNDER:
            return getTuunder();
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            return getUover();
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            return getUunder();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            return getWindTurbineType1or2IEC();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return getWindTurbineType3or4IEC();
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
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            setFover( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            setFunder( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__TFOVER:
            setTfover( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__TFUNDER:
            setTfunder( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__TUOVER:
            setTuover( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__TUUNDER:
            setTuunder( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            setUover( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            setUunder( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            setWindTurbineType1or2IEC( ( WindTurbineType1or2IEC ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            setWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) newValue );
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
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            unsetFover();
            return;
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            unsetFunder();
            return;
        case CimPackage.WIND_PROTECTION_IEC__TFOVER:
            unsetTfover();
            return;
        case CimPackage.WIND_PROTECTION_IEC__TFUNDER:
            unsetTfunder();
            return;
        case CimPackage.WIND_PROTECTION_IEC__TUOVER:
            unsetTuover();
            return;
        case CimPackage.WIND_PROTECTION_IEC__TUUNDER:
            unsetTuunder();
            return;
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            unsetUover();
            return;
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            unsetUunder();
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            unsetWindTurbineType1or2IEC();
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            unsetWindTurbineType3or4IEC();
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
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            return isSetFover();
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            return isSetFunder();
        case CimPackage.WIND_PROTECTION_IEC__TFOVER:
            return isSetTfover();
        case CimPackage.WIND_PROTECTION_IEC__TFUNDER:
            return isSetTfunder();
        case CimPackage.WIND_PROTECTION_IEC__TUOVER:
            return isSetTuover();
        case CimPackage.WIND_PROTECTION_IEC__TUUNDER:
            return isSetTuunder();
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            return isSetUover();
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            return isSetUunder();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            return isSetWindTurbineType1or2IEC();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return isSetWindTurbineType3or4IEC();
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
        result.append( " (fover: " );
        if( foverESet )
            result.append( fover );
        else
            result.append( "<unset>" );
        result.append( ", funder: " );
        if( funderESet )
            result.append( funder );
        else
            result.append( "<unset>" );
        result.append( ", tfover: " );
        if( tfoverESet )
            result.append( tfover );
        else
            result.append( "<unset>" );
        result.append( ", tfunder: " );
        if( tfunderESet )
            result.append( tfunder );
        else
            result.append( "<unset>" );
        result.append( ", tuover: " );
        if( tuoverESet )
            result.append( tuover );
        else
            result.append( "<unset>" );
        result.append( ", tuunder: " );
        if( tuunderESet )
            result.append( tuunder );
        else
            result.append( "<unset>" );
        result.append( ", uover: " );
        if( uoverESet )
            result.append( uover );
        else
            result.append( "<unset>" );
        result.append( ", uunder: " );
        if( uunderESet )
            result.append( uunder );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindProtectionIECImpl
