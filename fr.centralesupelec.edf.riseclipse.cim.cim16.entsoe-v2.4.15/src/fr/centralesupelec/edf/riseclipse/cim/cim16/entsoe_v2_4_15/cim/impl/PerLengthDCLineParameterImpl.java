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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DCLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthDCLineParameter;

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
 * An implementation of the model object '<em><b>Per Length DC Line Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PerLengthDCLineParameterImpl#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PerLengthDCLineParameterImpl#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PerLengthDCLineParameterImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PerLengthDCLineParameterImpl#getDCLineSegments <em>DC Line Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerLengthDCLineParameterImpl extends PerLengthLineParameterImpl implements PerLengthDCLineParameter {
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
     * The default value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected static final Float INDUCTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected Float inductance = INDUCTANCE_EDEFAULT;

    /**
     * This is true if the Inductance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inductanceESet;

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
     * The cached value of the '{@link #getDCLineSegments() <em>DC Line Segments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCLineSegments()
     * @generated
     * @ordered
     */
    protected EList< DCLineSegment > dcLineSegments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerLengthDCLineParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPerLengthDCLineParameter();
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__CAPACITANCE, oldCapacitance, capacitance,
                    !oldCapacitanceESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__CAPACITANCE, oldCapacitance, CAPACITANCE_EDEFAULT,
                    oldCapacitanceESet ) );
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
    public Float getInductance() {
        return inductance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInductance( Float newInductance ) {
        Float oldInductance = inductance;
        inductance = newInductance;
        boolean oldInductanceESet = inductanceESet;
        inductanceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PER_LENGTH_DC_LINE_PARAMETER__INDUCTANCE,
                    oldInductance, inductance, !oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInductance() {
        Float oldInductance = inductance;
        boolean oldInductanceESet = inductanceESet;
        inductance = INDUCTANCE_EDEFAULT;
        inductanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__INDUCTANCE, oldInductance, INDUCTANCE_EDEFAULT,
                    oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInductance() {
        return inductanceESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PER_LENGTH_DC_LINE_PARAMETER__RESISTANCE,
                    oldResistance, resistance, !oldResistanceESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__RESISTANCE, oldResistance, RESISTANCE_EDEFAULT,
                    oldResistanceESet ) );
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
    public EList< DCLineSegment > getDCLineSegments() {
        if( dcLineSegments == null ) {
            dcLineSegments = new EObjectWithInverseResolvingEList.Unsettable< DCLineSegment >( DCLineSegment.class,
                    this, CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS,
                    CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER );
        }
        return dcLineSegments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCLineSegments() {
        if( dcLineSegments != null ) ( ( InternalEList.Unsettable< ? > ) dcLineSegments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCLineSegments() {
        return dcLineSegments != null && ( ( InternalEList.Unsettable< ? > ) dcLineSegments ).isSet();
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
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCLineSegments() )
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
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS:
            return ( ( InternalEList< ? > ) getDCLineSegments() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__CAPACITANCE:
            return getCapacitance();
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__INDUCTANCE:
            return getInductance();
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__RESISTANCE:
            return getResistance();
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS:
            return getDCLineSegments();
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
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__CAPACITANCE:
            setCapacitance( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__INDUCTANCE:
            setInductance( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__RESISTANCE:
            setResistance( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS:
            getDCLineSegments().clear();
            getDCLineSegments().addAll( ( Collection< ? extends DCLineSegment > ) newValue );
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
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__CAPACITANCE:
            unsetCapacitance();
            return;
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__INDUCTANCE:
            unsetInductance();
            return;
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__RESISTANCE:
            unsetResistance();
            return;
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS:
            unsetDCLineSegments();
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
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__CAPACITANCE:
            return isSetCapacitance();
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__INDUCTANCE:
            return isSetInductance();
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__RESISTANCE:
            return isSetResistance();
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS:
            return isSetDCLineSegments();
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
        result.append( " (capacitance: " );
        if( capacitanceESet )
            result.append( capacitance );
        else
            result.append( "<unset>" );
        result.append( ", inductance: " );
        if( inductanceESet )
            result.append( inductance );
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

} //PerLengthDCLineParameterImpl
