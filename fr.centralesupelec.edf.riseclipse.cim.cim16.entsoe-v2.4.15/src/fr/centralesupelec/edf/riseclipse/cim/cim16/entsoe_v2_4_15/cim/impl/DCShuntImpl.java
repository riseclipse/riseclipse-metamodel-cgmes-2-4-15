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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DCShunt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Shunt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.DCShuntImpl#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.DCShuntImpl#getRatedUdc <em>Rated Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.DCShuntImpl#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCShuntImpl extends DCConductingEquipmentImpl implements DCShunt {
    /**
     * The default value of the '{@link #getCapacitance() <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitance()
     * @generated
     * @ordered
     */
    protected static final Float CAPACITANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapacitance() <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitance()
     * @generated
     * @ordered
     */
    protected Float capacitance = CAPACITANCE_EDEFAULT;

    /**
     * This is true if the Capacitance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capacitanceESet;

    /**
     * The default value of the '{@link #getRatedUdc() <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedUdc()
     * @generated
     * @ordered
     */
    protected static final Float RATED_UDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedUdc() <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedUdc()
     * @generated
     * @ordered
     */
    protected Float ratedUdc = RATED_UDC_EDEFAULT;

    /**
     * This is true if the Rated Udc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUdcESet;

    /**
     * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected static final Float RESISTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected Float resistance = RESISTANCE_EDEFAULT;

    /**
     * This is true if the Resistance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resistanceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCShuntImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCShunt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCapacitance() {
        return capacitance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacitance( Float newCapacitance ) {
        Float oldCapacitance = capacitance;
        capacitance = newCapacitance;
        boolean oldCapacitanceESet = capacitanceESet;
        capacitanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_SHUNT__CAPACITANCE, oldCapacitance, capacitance, !oldCapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacitance() {
        Float oldCapacitance = capacitance;
        boolean oldCapacitanceESet = capacitanceESet;
        capacitance = CAPACITANCE_EDEFAULT;
        capacitanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_SHUNT__CAPACITANCE, oldCapacitance, CAPACITANCE_EDEFAULT, oldCapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacitance() {
        return capacitanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedUdc() {
        return ratedUdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedUdc( Float newRatedUdc ) {
        Float oldRatedUdc = ratedUdc;
        ratedUdc = newRatedUdc;
        boolean oldRatedUdcESet = ratedUdcESet;
        ratedUdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_SHUNT__RATED_UDC, oldRatedUdc, ratedUdc, !oldRatedUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedUdc() {
        Float oldRatedUdc = ratedUdc;
        boolean oldRatedUdcESet = ratedUdcESet;
        ratedUdc = RATED_UDC_EDEFAULT;
        ratedUdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_SHUNT__RATED_UDC, oldRatedUdc, RATED_UDC_EDEFAULT, oldRatedUdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedUdc() {
        return ratedUdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getResistance() {
        return resistance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResistance( Float newResistance ) {
        Float oldResistance = resistance;
        resistance = newResistance;
        boolean oldResistanceESet = resistanceESet;
        resistanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_SHUNT__RESISTANCE, oldResistance, resistance, !oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResistance() {
        Float oldResistance = resistance;
        boolean oldResistanceESet = resistanceESet;
        resistance = RESISTANCE_EDEFAULT;
        resistanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_SHUNT__RESISTANCE, oldResistance, RESISTANCE_EDEFAULT, oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResistance() {
        return resistanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DC_SHUNT__CAPACITANCE:
            return getCapacitance();
        case CimPackage.DC_SHUNT__RATED_UDC:
            return getRatedUdc();
        case CimPackage.DC_SHUNT__RESISTANCE:
            return getResistance();
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
        case CimPackage.DC_SHUNT__CAPACITANCE:
            setCapacitance( ( Float ) newValue );
            return;
        case CimPackage.DC_SHUNT__RATED_UDC:
            setRatedUdc( ( Float ) newValue );
            return;
        case CimPackage.DC_SHUNT__RESISTANCE:
            setResistance( ( Float ) newValue );
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
        case CimPackage.DC_SHUNT__CAPACITANCE:
            unsetCapacitance();
            return;
        case CimPackage.DC_SHUNT__RATED_UDC:
            unsetRatedUdc();
            return;
        case CimPackage.DC_SHUNT__RESISTANCE:
            unsetResistance();
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
        case CimPackage.DC_SHUNT__CAPACITANCE:
            return isSetCapacitance();
        case CimPackage.DC_SHUNT__RATED_UDC:
            return isSetRatedUdc();
        case CimPackage.DC_SHUNT__RESISTANCE:
            return isSetResistance();
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
        result.append( " (capacitance: " );
        if( capacitanceESet )
            result.append( capacitance );
        else
            result.append( "<unset>" );
        result.append( ", ratedUdc: " );
        if( ratedUdcESet )
            result.append( ratedUdc );
        else
            result.append( "<unset>" );
        result.append( ", resistance: " );
        if( resistanceESet )
            result.append( resistance );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DCShuntImpl
