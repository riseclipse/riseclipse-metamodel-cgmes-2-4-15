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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SwitchInfoImpl#getBreakingCapacity <em>Breaking Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SwitchInfoImpl#getIsSinglePhase <em>Is Single Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SwitchInfoImpl#getIsUnganged <em>Is Unganged</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SwitchInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SwitchInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchInfoImpl extends AssetInfoImpl implements SwitchInfo {
    /**
     * The default value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakingCapacity()
     * @generated
     * @ordered
     */
    protected static final Float BREAKING_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakingCapacity()
     * @generated
     * @ordered
     */
    protected Float breakingCapacity = BREAKING_CAPACITY_EDEFAULT;

    /**
     * This is true if the Breaking Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakingCapacityESet;

    /**
     * The default value of the '{@link #getIsSinglePhase() <em>Is Single Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSinglePhase()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SINGLE_PHASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSinglePhase() <em>Is Single Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSinglePhase()
     * @generated
     * @ordered
     */
    protected Boolean isSinglePhase = IS_SINGLE_PHASE_EDEFAULT;

    /**
     * This is true if the Is Single Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSinglePhaseESet;

    /**
     * The default value of the '{@link #getIsUnganged() <em>Is Unganged</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsUnganged()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_UNGANGED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsUnganged() <em>Is Unganged</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsUnganged()
     * @generated
     * @ordered
     */
    protected Boolean isUnganged = IS_UNGANGED_EDEFAULT;

    /**
     * This is true if the Is Unganged attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isUngangedESet;

    /**
     * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Float RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected Float ratedCurrent = RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCurrentESet;

    /**
     * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedVoltageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBreakingCapacity() {
        return breakingCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakingCapacity( Float newBreakingCapacity ) {
        Float oldBreakingCapacity = breakingCapacity;
        breakingCapacity = newBreakingCapacity;
        boolean oldBreakingCapacityESet = breakingCapacityESet;
        breakingCapacityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_INFO__BREAKING_CAPACITY,
                    oldBreakingCapacity, breakingCapacity, !oldBreakingCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakingCapacity() {
        Float oldBreakingCapacity = breakingCapacity;
        boolean oldBreakingCapacityESet = breakingCapacityESet;
        breakingCapacity = BREAKING_CAPACITY_EDEFAULT;
        breakingCapacityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__BREAKING_CAPACITY,
                    oldBreakingCapacity, BREAKING_CAPACITY_EDEFAULT, oldBreakingCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakingCapacity() {
        return breakingCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsSinglePhase() {
        return isSinglePhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSinglePhase( Boolean newIsSinglePhase ) {
        Boolean oldIsSinglePhase = isSinglePhase;
        isSinglePhase = newIsSinglePhase;
        boolean oldIsSinglePhaseESet = isSinglePhaseESet;
        isSinglePhaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__IS_SINGLE_PHASE, oldIsSinglePhase, isSinglePhase, !oldIsSinglePhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSinglePhase() {
        Boolean oldIsSinglePhase = isSinglePhase;
        boolean oldIsSinglePhaseESet = isSinglePhaseESet;
        isSinglePhase = IS_SINGLE_PHASE_EDEFAULT;
        isSinglePhaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH_INFO__IS_SINGLE_PHASE,
                    oldIsSinglePhase, IS_SINGLE_PHASE_EDEFAULT, oldIsSinglePhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSinglePhase() {
        return isSinglePhaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsUnganged() {
        return isUnganged;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsUnganged( Boolean newIsUnganged ) {
        Boolean oldIsUnganged = isUnganged;
        isUnganged = newIsUnganged;
        boolean oldIsUngangedESet = isUngangedESet;
        isUngangedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__IS_UNGANGED, oldIsUnganged, isUnganged, !oldIsUngangedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsUnganged() {
        Boolean oldIsUnganged = isUnganged;
        boolean oldIsUngangedESet = isUngangedESet;
        isUnganged = IS_UNGANGED_EDEFAULT;
        isUngangedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_INFO__IS_UNGANGED, oldIsUnganged, IS_UNGANGED_EDEFAULT, oldIsUngangedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsUnganged() {
        return isUngangedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCurrent( Float newRatedCurrent ) {
        Float oldRatedCurrent = ratedCurrent;
        ratedCurrent = newRatedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCurrent() {
        Float oldRatedCurrent = ratedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrent = RATED_CURRENT_EDEFAULT;
        ratedCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_INFO__RATED_CURRENT, oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCurrent() {
        return ratedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedVoltage( Float newRatedVoltage ) {
        Float oldRatedVoltage = ratedVoltage;
        ratedVoltage = newRatedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_INFO__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage, !oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedVoltage() {
        Float oldRatedVoltage = ratedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltage = RATED_VOLTAGE_EDEFAULT;
        ratedVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_INFO__RATED_VOLTAGE, oldRatedVoltage, RATED_VOLTAGE_EDEFAULT, oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedVoltage() {
        return ratedVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            return getBreakingCapacity();
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            return getIsSinglePhase();
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            return getIsUnganged();
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            return getRatedVoltage();
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
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            setBreakingCapacity( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            setIsSinglePhase( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            setIsUnganged( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            setRatedVoltage( ( Float ) newValue );
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
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            unsetBreakingCapacity();
            return;
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            unsetIsSinglePhase();
            return;
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            unsetIsUnganged();
            return;
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            unsetRatedVoltage();
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
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
            return isSetBreakingCapacity();
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
            return isSetIsSinglePhase();
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
            return isSetIsUnganged();
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
            return isSetRatedVoltage();
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
        result.append( " (breakingCapacity: " );
        if( breakingCapacityESet )
            result.append( breakingCapacity );
        else
            result.append( "<unset>" );
        result.append( ", isSinglePhase: " );
        if( isSinglePhaseESet )
            result.append( isSinglePhase );
        else
            result.append( "<unset>" );
        result.append( ", isUnganged: " );
        if( isUngangedESet )
            result.append( isUnganged );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", ratedVoltage: " );
        if( ratedVoltageESet )
            result.append( ratedVoltage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchInfoImpl