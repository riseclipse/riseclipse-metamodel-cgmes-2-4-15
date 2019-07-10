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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ACLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ACLineSegmentPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SinglePhaseKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AC Line Segment Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ACLineSegmentPhaseImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ACLineSegmentPhaseImpl#getACLineSegment <em>AC Line Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACLineSegmentPhaseImpl extends PowerSystemResourceImpl implements ACLineSegmentPhase {
    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phase = PHASE_EDEFAULT;

    /**
     * This is true if the Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseESet;

    /**
     * The cached value of the '{@link #getACLineSegment() <em>AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getACLineSegment()
     * @generated
     * @ordered
     */
    protected ACLineSegment acLineSegment;

    /**
     * This is true if the AC Line Segment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean acLineSegmentESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ACLineSegmentPhaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getACLineSegmentPhase();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SinglePhaseKind getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhase( SinglePhaseKind newPhase ) {
        SinglePhaseKind oldPhase = phase;
        phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
        boolean oldPhaseESet = phaseESet;
        phaseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT_PHASE__PHASE, oldPhase,
                    phase, !oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhase() {
        SinglePhaseKind oldPhase = phase;
        boolean oldPhaseESet = phaseESet;
        phase = PHASE_EDEFAULT;
        phaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT_PHASE__PHASE, oldPhase,
                    PHASE_EDEFAULT, oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhase() {
        return phaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACLineSegment getACLineSegment() {
        return acLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetACLineSegment( ACLineSegment newACLineSegment, NotificationChain msgs ) {
        ACLineSegment oldACLineSegment = acLineSegment;
        acLineSegment = newACLineSegment;
        boolean oldACLineSegmentESet = acLineSegmentESet;
        acLineSegmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT, oldACLineSegment, newACLineSegment,
                    !oldACLineSegmentESet );
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
    public void setACLineSegment( ACLineSegment newACLineSegment ) {
        if( newACLineSegment != acLineSegment ) {
            NotificationChain msgs = null;
            if( acLineSegment != null )
                msgs = ( ( InternalEObject ) acLineSegment ).eInverseRemove( this,
                        CimPackage.AC_LINE_SEGMENT__AC_LINE_SEGMENT_PHASES, ACLineSegment.class, msgs );
            if( newACLineSegment != null )
                msgs = ( ( InternalEObject ) newACLineSegment ).eInverseAdd( this,
                        CimPackage.AC_LINE_SEGMENT__AC_LINE_SEGMENT_PHASES, ACLineSegment.class, msgs );
            msgs = basicSetACLineSegment( newACLineSegment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldACLineSegmentESet = acLineSegmentESet;
            acLineSegmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT, newACLineSegment, newACLineSegment,
                        !oldACLineSegmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetACLineSegment( NotificationChain msgs ) {
        ACLineSegment oldACLineSegment = acLineSegment;
        acLineSegment = null;
        boolean oldACLineSegmentESet = acLineSegmentESet;
        acLineSegmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT, oldACLineSegment, null, oldACLineSegmentESet );
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
    public void unsetACLineSegment() {
        if( acLineSegment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) acLineSegment ).eInverseRemove( this,
                    CimPackage.AC_LINE_SEGMENT__AC_LINE_SEGMENT_PHASES, ACLineSegment.class, msgs );
            msgs = basicUnsetACLineSegment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldACLineSegmentESet = acLineSegmentESet;
            acLineSegmentESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT, null, null, oldACLineSegmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetACLineSegment() {
        return acLineSegmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT:
            if( acLineSegment != null )
                msgs = ( ( InternalEObject ) acLineSegment ).eInverseRemove( this,
                        CimPackage.AC_LINE_SEGMENT__AC_LINE_SEGMENT_PHASES, ACLineSegment.class, msgs );
            return basicSetACLineSegment( ( ACLineSegment ) otherEnd, msgs );
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
        case CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT:
            return basicUnsetACLineSegment( msgs );
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
        case CimPackage.AC_LINE_SEGMENT_PHASE__PHASE:
            return getPhase();
        case CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT:
            return getACLineSegment();
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
        case CimPackage.AC_LINE_SEGMENT_PHASE__PHASE:
            setPhase( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT:
            setACLineSegment( ( ACLineSegment ) newValue );
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
        case CimPackage.AC_LINE_SEGMENT_PHASE__PHASE:
            unsetPhase();
            return;
        case CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT:
            unsetACLineSegment();
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
        case CimPackage.AC_LINE_SEGMENT_PHASE__PHASE:
            return isSetPhase();
        case CimPackage.AC_LINE_SEGMENT_PHASE__AC_LINE_SEGMENT:
            return isSetACLineSegment();
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
        result.append( " (phase: " );
        if( phaseESet )
            result.append( phase );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ACLineSegmentPhaseImpl
