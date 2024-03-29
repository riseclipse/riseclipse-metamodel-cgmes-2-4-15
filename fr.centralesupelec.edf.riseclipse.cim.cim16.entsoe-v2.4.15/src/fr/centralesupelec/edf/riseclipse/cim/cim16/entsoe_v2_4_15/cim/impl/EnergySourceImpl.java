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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySchedulingType;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySource;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySourceAction;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4Dynamics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getActivePower <em>Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getReactivePower <em>Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getRn <em>Rn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getVoltageAngle <em>Voltage Angle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getVoltageMagnitude <em>Voltage Magnitude</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getXn <em>Xn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getEnergySourceAction <em>Energy Source Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EnergySourceImpl#getEnergySchedulingType <em>Energy Scheduling Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergySourceImpl extends ConductingEquipmentImpl implements EnergySource {
    /**
     * The default value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivePower()
     * @generated
     * @ordered
     */
    protected static final Float ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivePower()
     * @generated
     * @ordered
     */
    protected Float activePower = ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean activePowerESet;

    /**
     * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalVoltage()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalVoltage()
     * @generated
     * @ordered
     */
    protected Float nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Nominal Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalVoltageESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getReactivePower() <em>Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReactivePower() <em>Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReactivePower()
     * @generated
     * @ordered
     */
    protected Float reactivePower = REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reactivePowerESet;

    /**
     * The default value of the '{@link #getRn() <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRn()
     * @generated
     * @ordered
     */
    protected static final Float RN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRn() <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRn()
     * @generated
     * @ordered
     */
    protected Float rn = RN_EDEFAULT;

    /**
     * This is true if the Rn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rnESet;

    /**
     * The default value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageAngle()
     * @generated
     * @ordered
     */
    protected static final Float VOLTAGE_ANGLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageAngle()
     * @generated
     * @ordered
     */
    protected Float voltageAngle = VOLTAGE_ANGLE_EDEFAULT;

    /**
     * This is true if the Voltage Angle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageAngleESet;

    /**
     * The default value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageMagnitude()
     * @generated
     * @ordered
     */
    protected static final Float VOLTAGE_MAGNITUDE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageMagnitude()
     * @generated
     * @ordered
     */
    protected Float voltageMagnitude = VOLTAGE_MAGNITUDE_EDEFAULT;

    /**
     * This is true if the Voltage Magnitude attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageMagnitudeESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The default value of the '{@link #getXn() <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXn()
     * @generated
     * @ordered
     */
    protected static final Float XN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXn() <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXn()
     * @generated
     * @ordered
     */
    protected Float xn = XN_EDEFAULT;

    /**
     * This is true if the Xn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xnESet;

    /**
     * The cached value of the '{@link #getEnergySourceAction() <em>Energy Source Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergySourceAction()
     * @generated
     * @ordered
     */
    protected EnergySourceAction energySourceAction;

    /**
     * This is true if the Energy Source Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energySourceActionESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3or4Dynamics() <em>Wind Turbine Type3or4 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     * @ordered
     */
    protected WindTurbineType3or4Dynamics windTurbineType3or4Dynamics;

    /**
     * This is true if the Wind Turbine Type3or4 Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3or4DynamicsESet;

    /**
     * The cached value of the '{@link #getEnergySchedulingType() <em>Energy Scheduling Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergySchedulingType()
     * @generated
     * @ordered
     */
    protected EnergySchedulingType energySchedulingType;

    /**
     * This is true if the Energy Scheduling Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energySchedulingTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnergySourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEnergySource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getActivePower() {
        return activePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActivePower( Float newActivePower ) {
        Float oldActivePower = activePower;
        activePower = newActivePower;
        boolean oldActivePowerESet = activePowerESet;
        activePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__ACTIVE_POWER,
                    oldActivePower, activePower, !oldActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActivePower() {
        Float oldActivePower = activePower;
        boolean oldActivePowerESet = activePowerESet;
        activePower = ACTIVE_POWER_EDEFAULT;
        activePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__ACTIVE_POWER,
                    oldActivePower, ACTIVE_POWER_EDEFAULT, oldActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActivePower() {
        return activePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalVoltage( Float newNominalVoltage ) {
        Float oldNominalVoltage = nominalVoltage;
        nominalVoltage = newNominalVoltage;
        boolean oldNominalVoltageESet = nominalVoltageESet;
        nominalVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE,
                    oldNominalVoltage, nominalVoltage, !oldNominalVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalVoltage() {
        Float oldNominalVoltage = nominalVoltage;
        boolean oldNominalVoltageESet = nominalVoltageESet;
        nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;
        nominalVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE,
                    oldNominalVoltage, NOMINAL_VOLTAGE_EDEFAULT, oldNominalVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalVoltage() {
        return nominalVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__R, oldR, R_EDEFAULT,
                    oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__R0, oldR0, r0,
                    !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__R0, oldR0, R0_EDEFAULT,
                    oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getReactivePower() {
        return reactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReactivePower( Float newReactivePower ) {
        Float oldReactivePower = reactivePower;
        reactivePower = newReactivePower;
        boolean oldReactivePowerESet = reactivePowerESet;
        reactivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__REACTIVE_POWER,
                    oldReactivePower, reactivePower, !oldReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReactivePower() {
        Float oldReactivePower = reactivePower;
        boolean oldReactivePowerESet = reactivePowerESet;
        reactivePower = REACTIVE_POWER_EDEFAULT;
        reactivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__REACTIVE_POWER,
                    oldReactivePower, REACTIVE_POWER_EDEFAULT, oldReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReactivePower() {
        return reactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRn() {
        return rn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRn( Float newRn ) {
        Float oldRn = rn;
        rn = newRn;
        boolean oldRnESet = rnESet;
        rnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__RN, oldRn, rn,
                    !oldRnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRn() {
        Float oldRn = rn;
        boolean oldRnESet = rnESet;
        rn = RN_EDEFAULT;
        rnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__RN, oldRn, RN_EDEFAULT,
                    oldRnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRn() {
        return rnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVoltageAngle() {
        return voltageAngle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageAngle( Float newVoltageAngle ) {
        Float oldVoltageAngle = voltageAngle;
        voltageAngle = newVoltageAngle;
        boolean oldVoltageAngleESet = voltageAngleESet;
        voltageAngleESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE,
                    oldVoltageAngle, voltageAngle, !oldVoltageAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageAngle() {
        Float oldVoltageAngle = voltageAngle;
        boolean oldVoltageAngleESet = voltageAngleESet;
        voltageAngle = VOLTAGE_ANGLE_EDEFAULT;
        voltageAngleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE,
                    oldVoltageAngle, VOLTAGE_ANGLE_EDEFAULT, oldVoltageAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageAngle() {
        return voltageAngleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVoltageMagnitude() {
        return voltageMagnitude;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageMagnitude( Float newVoltageMagnitude ) {
        Float oldVoltageMagnitude = voltageMagnitude;
        voltageMagnitude = newVoltageMagnitude;
        boolean oldVoltageMagnitudeESet = voltageMagnitudeESet;
        voltageMagnitudeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE,
                    oldVoltageMagnitude, voltageMagnitude, !oldVoltageMagnitudeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageMagnitude() {
        Float oldVoltageMagnitude = voltageMagnitude;
        boolean oldVoltageMagnitudeESet = voltageMagnitudeESet;
        voltageMagnitude = VOLTAGE_MAGNITUDE_EDEFAULT;
        voltageMagnitudeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE,
                    oldVoltageMagnitude, VOLTAGE_MAGNITUDE_EDEFAULT, oldVoltageMagnitudeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageMagnitude() {
        return voltageMagnitudeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__X, oldX, X_EDEFAULT,
                    oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__X0, oldX0, x0,
                    !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__X0, oldX0, X0_EDEFAULT,
                    oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXn() {
        return xn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXn( Float newXn ) {
        Float oldXn = xn;
        xn = newXn;
        boolean oldXnESet = xnESet;
        xnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__XN, oldXn, xn,
                    !oldXnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXn() {
        Float oldXn = xn;
        boolean oldXnESet = xnESet;
        xn = XN_EDEFAULT;
        xnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__XN, oldXn, XN_EDEFAULT,
                    oldXnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXn() {
        return xnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics() {
        return windTurbineType3or4Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3or4Dynamics(
            WindTurbineType3or4Dynamics newWindTurbineType3or4Dynamics, NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4Dynamics = windTurbineType3or4Dynamics;
        windTurbineType3or4Dynamics = newWindTurbineType3or4Dynamics;
        boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
        windTurbineType3or4DynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, oldWindTurbineType3or4Dynamics,
                    newWindTurbineType3or4Dynamics, !oldWindTurbineType3or4DynamicsESet );
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
    public void setWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics newWindTurbineType3or4Dynamics ) {
        if( newWindTurbineType3or4Dynamics != windTurbineType3or4Dynamics ) {
            NotificationChain msgs = null;
            if( windTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, WindTurbineType3or4Dynamics.class,
                        msgs );
            if( newWindTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4Dynamics ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, WindTurbineType3or4Dynamics.class,
                        msgs );
            msgs = basicSetWindTurbineType3or4Dynamics( newWindTurbineType3or4Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
            windTurbineType3or4DynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, newWindTurbineType3or4Dynamics,
                        newWindTurbineType3or4Dynamics, !oldWindTurbineType3or4DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3or4Dynamics( NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4Dynamics = windTurbineType3or4Dynamics;
        windTurbineType3or4Dynamics = null;
        boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
        windTurbineType3or4DynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, oldWindTurbineType3or4Dynamics, null,
                    oldWindTurbineType3or4DynamicsESet );
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
    public void unsetWindTurbineType3or4Dynamics() {
        if( windTurbineType3or4Dynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, WindTurbineType3or4Dynamics.class, msgs );
            msgs = basicUnsetWindTurbineType3or4Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
            windTurbineType3or4DynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS, null, null,
                        oldWindTurbineType3or4DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4Dynamics() {
        return windTurbineType3or4DynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySourceAction getEnergySourceAction() {
        if( energySourceAction != null && energySourceAction.eIsProxy() ) {
            InternalEObject oldEnergySourceAction = ( InternalEObject ) energySourceAction;
            energySourceAction = ( EnergySourceAction ) eResolveProxy( oldEnergySourceAction );
            if( energySourceAction != oldEnergySourceAction ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION, oldEnergySourceAction,
                            energySourceAction ) );
            }
        }
        return energySourceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnergySourceAction basicGetEnergySourceAction() {
        return energySourceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergySourceAction( EnergySourceAction newEnergySourceAction,
            NotificationChain msgs ) {
        EnergySourceAction oldEnergySourceAction = energySourceAction;
        energySourceAction = newEnergySourceAction;
        boolean oldEnergySourceActionESet = energySourceActionESet;
        energySourceActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION, oldEnergySourceAction, newEnergySourceAction,
                    !oldEnergySourceActionESet );
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
    public void setEnergySourceAction( EnergySourceAction newEnergySourceAction ) {
        if( newEnergySourceAction != energySourceAction ) {
            NotificationChain msgs = null;
            if( energySourceAction != null )
                msgs = ( ( InternalEObject ) energySourceAction ).eInverseRemove( this,
                        CimPackage.ENERGY_SOURCE_ACTION__ENERGY_SOURCE, EnergySourceAction.class, msgs );
            if( newEnergySourceAction != null )
                msgs = ( ( InternalEObject ) newEnergySourceAction ).eInverseAdd( this,
                        CimPackage.ENERGY_SOURCE_ACTION__ENERGY_SOURCE, EnergySourceAction.class, msgs );
            msgs = basicSetEnergySourceAction( newEnergySourceAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySourceActionESet = energySourceActionESet;
            energySourceActionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION,
                        newEnergySourceAction, newEnergySourceAction, !oldEnergySourceActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergySourceAction( NotificationChain msgs ) {
        EnergySourceAction oldEnergySourceAction = energySourceAction;
        energySourceAction = null;
        boolean oldEnergySourceActionESet = energySourceActionESet;
        energySourceActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION, oldEnergySourceAction, null,
                    oldEnergySourceActionESet );
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
    public void unsetEnergySourceAction() {
        if( energySourceAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energySourceAction ).eInverseRemove( this,
                    CimPackage.ENERGY_SOURCE_ACTION__ENERGY_SOURCE, EnergySourceAction.class, msgs );
            msgs = basicUnsetEnergySourceAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySourceActionESet = energySourceActionESet;
            energySourceActionESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION, null, null, oldEnergySourceActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergySourceAction() {
        return energySourceActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySchedulingType getEnergySchedulingType() {
        return energySchedulingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergySchedulingType( EnergySchedulingType newEnergySchedulingType,
            NotificationChain msgs ) {
        EnergySchedulingType oldEnergySchedulingType = energySchedulingType;
        energySchedulingType = newEnergySchedulingType;
        boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
        energySchedulingTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, oldEnergySchedulingType, newEnergySchedulingType,
                    !oldEnergySchedulingTypeESet );
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
    public void setEnergySchedulingType( EnergySchedulingType newEnergySchedulingType ) {
        if( newEnergySchedulingType != energySchedulingType ) {
            NotificationChain msgs = null;
            if( energySchedulingType != null )
                msgs = ( ( InternalEObject ) energySchedulingType ).eInverseRemove( this,
                        CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            if( newEnergySchedulingType != null )
                msgs = ( ( InternalEObject ) newEnergySchedulingType ).eInverseAdd( this,
                        CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            msgs = basicSetEnergySchedulingType( newEnergySchedulingType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
            energySchedulingTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, newEnergySchedulingType,
                        newEnergySchedulingType, !oldEnergySchedulingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergySchedulingType( NotificationChain msgs ) {
        EnergySchedulingType oldEnergySchedulingType = energySchedulingType;
        energySchedulingType = null;
        boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
        energySchedulingTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, oldEnergySchedulingType, null,
                    oldEnergySchedulingTypeESet );
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
    public void unsetEnergySchedulingType() {
        if( energySchedulingType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energySchedulingType ).eInverseRemove( this,
                    CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            msgs = basicUnsetEnergySchedulingType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
            energySchedulingTypeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, null, null, oldEnergySchedulingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergySchedulingType() {
        return energySchedulingTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION:
            if( energySourceAction != null )
                msgs = ( ( InternalEObject ) energySourceAction ).eInverseRemove( this,
                        CimPackage.ENERGY_SOURCE_ACTION__ENERGY_SOURCE, EnergySourceAction.class, msgs );
            return basicSetEnergySourceAction( ( EnergySourceAction ) otherEnd, msgs );
        case CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            if( windTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__ENERGY_SOURCE, WindTurbineType3or4Dynamics.class,
                        msgs );
            return basicSetWindTurbineType3or4Dynamics( ( WindTurbineType3or4Dynamics ) otherEnd, msgs );
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            if( energySchedulingType != null )
                msgs = ( ( InternalEObject ) energySchedulingType ).eInverseRemove( this,
                        CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            return basicSetEnergySchedulingType( ( EnergySchedulingType ) otherEnd, msgs );
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
        case CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION:
            return basicUnsetEnergySourceAction( msgs );
        case CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return basicUnsetWindTurbineType3or4Dynamics( msgs );
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            return basicUnsetEnergySchedulingType( msgs );
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
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            return getActivePower();
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            return getNominalVoltage();
        case CimPackage.ENERGY_SOURCE__R:
            return getR();
        case CimPackage.ENERGY_SOURCE__R0:
            return getR0();
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            return getReactivePower();
        case CimPackage.ENERGY_SOURCE__RN:
            return getRn();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            return getVoltageAngle();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            return getVoltageMagnitude();
        case CimPackage.ENERGY_SOURCE__X:
            return getX();
        case CimPackage.ENERGY_SOURCE__X0:
            return getX0();
        case CimPackage.ENERGY_SOURCE__XN:
            return getXn();
        case CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION:
            if( resolve ) return getEnergySourceAction();
            return basicGetEnergySourceAction();
        case CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return getWindTurbineType3or4Dynamics();
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            return getEnergySchedulingType();
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
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            setActivePower( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            setNominalVoltage( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            setReactivePower( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__RN:
            setRn( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            setVoltageAngle( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            setVoltageMagnitude( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__XN:
            setXn( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION:
            setEnergySourceAction( ( EnergySourceAction ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            setWindTurbineType3or4Dynamics( ( WindTurbineType3or4Dynamics ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            setEnergySchedulingType( ( EnergySchedulingType ) newValue );
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
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            unsetActivePower();
            return;
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            unsetNominalVoltage();
            return;
        case CimPackage.ENERGY_SOURCE__R:
            unsetR();
            return;
        case CimPackage.ENERGY_SOURCE__R0:
            unsetR0();
            return;
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            unsetReactivePower();
            return;
        case CimPackage.ENERGY_SOURCE__RN:
            unsetRn();
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            unsetVoltageAngle();
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            unsetVoltageMagnitude();
            return;
        case CimPackage.ENERGY_SOURCE__X:
            unsetX();
            return;
        case CimPackage.ENERGY_SOURCE__X0:
            unsetX0();
            return;
        case CimPackage.ENERGY_SOURCE__XN:
            unsetXn();
            return;
        case CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION:
            unsetEnergySourceAction();
            return;
        case CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            unsetWindTurbineType3or4Dynamics();
            return;
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            unsetEnergySchedulingType();
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
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            return isSetActivePower();
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            return isSetNominalVoltage();
        case CimPackage.ENERGY_SOURCE__R:
            return isSetR();
        case CimPackage.ENERGY_SOURCE__R0:
            return isSetR0();
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            return isSetReactivePower();
        case CimPackage.ENERGY_SOURCE__RN:
            return isSetRn();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            return isSetVoltageAngle();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            return isSetVoltageMagnitude();
        case CimPackage.ENERGY_SOURCE__X:
            return isSetX();
        case CimPackage.ENERGY_SOURCE__X0:
            return isSetX0();
        case CimPackage.ENERGY_SOURCE__XN:
            return isSetXn();
        case CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_ACTION:
            return isSetEnergySourceAction();
        case CimPackage.ENERGY_SOURCE__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return isSetWindTurbineType3or4Dynamics();
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            return isSetEnergySchedulingType();
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
        result.append( " (activePower: " );
        if( activePowerESet )
            result.append( activePower );
        else
            result.append( "<unset>" );
        result.append( ", nominalVoltage: " );
        if( nominalVoltageESet )
            result.append( nominalVoltage );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", reactivePower: " );
        if( reactivePowerESet )
            result.append( reactivePower );
        else
            result.append( "<unset>" );
        result.append( ", rn: " );
        if( rnESet )
            result.append( rn );
        else
            result.append( "<unset>" );
        result.append( ", voltageAngle: " );
        if( voltageAngleESet )
            result.append( voltageAngle );
        else
            result.append( "<unset>" );
        result.append( ", voltageMagnitude: " );
        if( voltageMagnitudeESet )
            result.append( voltageMagnitude );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", xn: " );
        if( xnESet )
            result.append( xn );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EnergySourceImpl
