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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPitchAngleIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Turbine Type3 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3IECImpl#getDipmax <em>Dipmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3IECImpl#getDiqmax <em>Diqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3IECImpl#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3IECImpl#getWindAeroLinearIEC <em>Wind Aero Linear IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3IECImpl#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.WindGenTurbineType3IECImpl#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenTurbineType3IECImpl extends WindTurbineType3or4IECImpl implements WindGenTurbineType3IEC {
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
     * The cached value of the '{@link #getWindContPitchAngleIEC() <em>Wind Cont Pitch Angle IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContPitchAngleIEC()
     * @generated
     * @ordered
     */
    protected WindContPitchAngleIEC windContPitchAngleIEC;

    /**
     * This is true if the Wind Cont Pitch Angle IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContPitchAngleIECESet;

    /**
     * The cached value of the '{@link #getWindAeroLinearIEC() <em>Wind Aero Linear IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindAeroLinearIEC()
     * @generated
     * @ordered
     */
    protected WindAeroLinearIEC windAeroLinearIEC;

    /**
     * This is true if the Wind Aero Linear IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windAeroLinearIECESet;

    /**
     * The cached value of the '{@link #getWindMechIEC() <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindMechIEC()
     * @generated
     * @ordered
     */
    protected WindMechIEC windMechIEC;

    /**
     * This is true if the Wind Mech IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windMechIECESet;

    /**
     * The cached value of the '{@link #getWindContPType3IEC() <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContPType3IEC()
     * @generated
     * @ordered
     */
    protected WindContPType3IEC windContPType3IEC;

    /**
     * This is true if the Wind Cont PType3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContPType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenTurbineType3IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenTurbineType3IEC();
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
                CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIPMAX, oldDipmax, dipmax, !oldDipmaxESet ) );
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
                CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIPMAX, oldDipmax, DIPMAX_EDEFAULT, oldDipmaxESet ) );
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
                CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIQMAX, oldDiqmax, diqmax, !oldDiqmaxESet ) );
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
                CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIQMAX, oldDiqmax, DIQMAX_EDEFAULT, oldDiqmaxESet ) );
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
    public WindAeroLinearIEC getWindAeroLinearIEC() {
        return windAeroLinearIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindAeroLinearIEC( WindAeroLinearIEC newWindAeroLinearIEC,
            NotificationChain msgs ) {
        WindAeroLinearIEC oldWindAeroLinearIEC = windAeroLinearIEC;
        windAeroLinearIEC = newWindAeroLinearIEC;
        boolean oldWindAeroLinearIECESet = windAeroLinearIECESet;
        windAeroLinearIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, oldWindAeroLinearIEC,
                    newWindAeroLinearIEC, !oldWindAeroLinearIECESet );
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
    public void setWindAeroLinearIEC( WindAeroLinearIEC newWindAeroLinearIEC ) {
        if( newWindAeroLinearIEC != windAeroLinearIEC ) {
            NotificationChain msgs = null;
            if( windAeroLinearIEC != null ) msgs = ( ( InternalEObject ) windAeroLinearIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindAeroLinearIEC.class, msgs );
            if( newWindAeroLinearIEC != null ) msgs = ( ( InternalEObject ) newWindAeroLinearIEC ).eInverseAdd( this,
                    CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindAeroLinearIEC.class, msgs );
            msgs = basicSetWindAeroLinearIEC( newWindAeroLinearIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroLinearIECESet = windAeroLinearIECESet;
            windAeroLinearIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, newWindAeroLinearIEC,
                    newWindAeroLinearIEC, !oldWindAeroLinearIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindAeroLinearIEC( NotificationChain msgs ) {
        WindAeroLinearIEC oldWindAeroLinearIEC = windAeroLinearIEC;
        windAeroLinearIEC = null;
        boolean oldWindAeroLinearIECESet = windAeroLinearIECESet;
        windAeroLinearIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, oldWindAeroLinearIEC, null,
                    oldWindAeroLinearIECESet );
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
    public void unsetWindAeroLinearIEC() {
        if( windAeroLinearIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windAeroLinearIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindAeroLinearIEC.class, msgs );
            msgs = basicUnsetWindAeroLinearIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroLinearIECESet = windAeroLinearIECESet;
            windAeroLinearIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC, null, null,
                    oldWindAeroLinearIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindAeroLinearIEC() {
        return windAeroLinearIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindMechIEC getWindMechIEC() {
        if( windMechIEC != null && windMechIEC.eIsProxy() ) {
            InternalEObject oldWindMechIEC = ( InternalEObject ) windMechIEC;
            windMechIEC = ( WindMechIEC ) eResolveProxy( oldWindMechIEC );
            if( windMechIEC != oldWindMechIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC, oldWindMechIEC, windMechIEC ) );
            }
        }
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindMechIEC basicGetWindMechIEC() {
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindMechIEC( WindMechIEC newWindMechIEC, NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = newWindMechIEC;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC, oldWindMechIEC, newWindMechIEC,
                    !oldWindMechIECESet );
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
    public void setWindMechIEC( WindMechIEC newWindMechIEC ) {
        if( newWindMechIEC != windMechIEC ) {
            NotificationChain msgs = null;
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            if( newWindMechIEC != null ) msgs = ( ( InternalEObject ) newWindMechIEC ).eInverseAdd( this,
                    CimPackage.WIND_MECH_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            msgs = basicSetWindMechIEC( newWindMechIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC,
                            newWindMechIEC, newWindMechIEC, !oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindMechIEC( NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = null;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC, oldWindMechIEC, null, oldWindMechIECESet );
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
    public void unsetWindMechIEC() {
        if( windMechIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            msgs = basicUnsetWindMechIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC, null, null, oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindMechIEC() {
        return windMechIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType3IEC getWindContPType3IEC() {
        return windContPType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContPType3IEC( WindContPType3IEC newWindContPType3IEC,
            NotificationChain msgs ) {
        WindContPType3IEC oldWindContPType3IEC = windContPType3IEC;
        windContPType3IEC = newWindContPType3IEC;
        boolean oldWindContPType3IECESet = windContPType3IECESet;
        windContPType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, oldWindContPType3IEC,
                    newWindContPType3IEC, !oldWindContPType3IECESet );
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
    public void setWindContPType3IEC( WindContPType3IEC newWindContPType3IEC ) {
        if( newWindContPType3IEC != windContPType3IEC ) {
            NotificationChain msgs = null;
            if( windContPType3IEC != null ) msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            if( newWindContPType3IEC != null ) msgs = ( ( InternalEObject ) newWindContPType3IEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            msgs = basicSetWindContPType3IEC( newWindContPType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType3IECESet = windContPType3IECESet;
            windContPType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, newWindContPType3IEC,
                    newWindContPType3IEC, !oldWindContPType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContPType3IEC( NotificationChain msgs ) {
        WindContPType3IEC oldWindContPType3IEC = windContPType3IEC;
        windContPType3IEC = null;
        boolean oldWindContPType3IECESet = windContPType3IECESet;
        windContPType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, oldWindContPType3IEC, null,
                    oldWindContPType3IECESet );
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
    public void unsetWindContPType3IEC() {
        if( windContPType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            msgs = basicUnsetWindContPType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType3IECESet = windContPType3IECESet;
            windContPType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, null, null,
                    oldWindContPType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContPType3IEC() {
        return windContPType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPitchAngleIEC getWindContPitchAngleIEC() {
        return windContPitchAngleIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContPitchAngleIEC( WindContPitchAngleIEC newWindContPitchAngleIEC,
            NotificationChain msgs ) {
        WindContPitchAngleIEC oldWindContPitchAngleIEC = windContPitchAngleIEC;
        windContPitchAngleIEC = newWindContPitchAngleIEC;
        boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
        windContPitchAngleIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, oldWindContPitchAngleIEC,
                    newWindContPitchAngleIEC, !oldWindContPitchAngleIECESet );
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
    public void setWindContPitchAngleIEC( WindContPitchAngleIEC newWindContPitchAngleIEC ) {
        if( newWindContPitchAngleIEC != windContPitchAngleIEC ) {
            NotificationChain msgs = null;
            if( windContPitchAngleIEC != null )
                msgs = ( ( InternalEObject ) windContPitchAngleIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class,
                        msgs );
            if( newWindContPitchAngleIEC != null )
                msgs = ( ( InternalEObject ) newWindContPitchAngleIEC ).eInverseAdd( this,
                        CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class,
                        msgs );
            msgs = basicSetWindContPitchAngleIEC( newWindContPitchAngleIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
            windContPitchAngleIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, newWindContPitchAngleIEC,
                    newWindContPitchAngleIEC, !oldWindContPitchAngleIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContPitchAngleIEC( NotificationChain msgs ) {
        WindContPitchAngleIEC oldWindContPitchAngleIEC = windContPitchAngleIEC;
        windContPitchAngleIEC = null;
        boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
        windContPitchAngleIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, oldWindContPitchAngleIEC, null,
                    oldWindContPitchAngleIECESet );
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
    public void unsetWindContPitchAngleIEC() {
        if( windContPitchAngleIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContPitchAngleIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class,
                    msgs );
            msgs = basicUnsetWindContPitchAngleIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
            windContPitchAngleIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, null, null,
                    oldWindContPitchAngleIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContPitchAngleIEC() {
        return windContPitchAngleIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            if( windContPitchAngleIEC != null )
                msgs = ( ( InternalEObject ) windContPitchAngleIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class,
                        msgs );
            return basicSetWindContPitchAngleIEC( ( WindContPitchAngleIEC ) otherEnd, msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC:
            if( windAeroLinearIEC != null ) msgs = ( ( InternalEObject ) windAeroLinearIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_LINEAR_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindAeroLinearIEC.class, msgs );
            return basicSetWindAeroLinearIEC( ( WindAeroLinearIEC ) otherEnd, msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            return basicSetWindMechIEC( ( WindMechIEC ) otherEnd, msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            if( windContPType3IEC != null ) msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_GEN_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            return basicSetWindContPType3IEC( ( WindContPType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            return basicUnsetWindContPitchAngleIEC( msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC:
            return basicUnsetWindAeroLinearIEC( msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            return basicUnsetWindMechIEC( msgs );
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            return basicUnsetWindContPType3IEC( msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIPMAX:
            return getDipmax();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIQMAX:
            return getDiqmax();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            return getWindContPitchAngleIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC:
            return getWindAeroLinearIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            if( resolve ) return getWindMechIEC();
            return basicGetWindMechIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            return getWindContPType3IEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIPMAX:
            setDipmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIQMAX:
            setDiqmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            setWindContPitchAngleIEC( ( WindContPitchAngleIEC ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC:
            setWindAeroLinearIEC( ( WindAeroLinearIEC ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            setWindMechIEC( ( WindMechIEC ) newValue );
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            setWindContPType3IEC( ( WindContPType3IEC ) newValue );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIPMAX:
            unsetDipmax();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIQMAX:
            unsetDiqmax();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            unsetWindContPitchAngleIEC();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC:
            unsetWindAeroLinearIEC();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            unsetWindMechIEC();
            return;
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            unsetWindContPType3IEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIPMAX:
            return isSetDipmax();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__DIQMAX:
            return isSetDiqmax();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            return isSetWindContPitchAngleIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_AERO_LINEAR_IEC:
            return isSetWindAeroLinearIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            return isSetWindMechIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            return isSetWindContPType3IEC();
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
        result.append( ')' );
        return result.toString();
    }

} //WindGenTurbineType3IECImpl
