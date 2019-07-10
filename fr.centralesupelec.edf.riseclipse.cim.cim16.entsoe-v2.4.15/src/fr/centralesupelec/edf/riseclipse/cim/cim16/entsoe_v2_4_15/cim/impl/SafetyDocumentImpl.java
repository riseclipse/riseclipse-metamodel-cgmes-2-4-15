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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SafetyDocument;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SafetyDocumentImpl#getSwitchingPlan <em>Switching Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyDocumentImpl extends DocumentImpl implements SafetyDocument {
    /**
     * The cached value of the '{@link #getSwitchingPlan() <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingPlan()
     * @generated
     * @ordered
     */
    protected SwitchingPlan switchingPlan;

    /**
     * This is true if the Switching Plan reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingPlanESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SafetyDocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSafetyDocument();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingPlan getSwitchingPlan() {
        return switchingPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchingPlan( SwitchingPlan newSwitchingPlan, NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = newSwitchingPlan;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN, oldSwitchingPlan, newSwitchingPlan,
                    !oldSwitchingPlanESet );
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
    public void setSwitchingPlan( SwitchingPlan newSwitchingPlan ) {
        if( newSwitchingPlan != switchingPlan ) {
            NotificationChain msgs = null;
            if( switchingPlan != null ) msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            if( newSwitchingPlan != null ) msgs = ( ( InternalEObject ) newSwitchingPlan ).eInverseAdd( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            msgs = basicSetSwitchingPlan( newSwitchingPlan, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN,
                        newSwitchingPlan, newSwitchingPlan, !oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchingPlan( NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = null;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN, oldSwitchingPlan, null, oldSwitchingPlanESet );
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
    public void unsetSwitchingPlan() {
        if( switchingPlan != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            msgs = basicUnsetSwitchingPlan( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN, null, null, oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingPlan() {
        return switchingPlanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            if( switchingPlan != null ) msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            return basicSetSwitchingPlan( ( SwitchingPlan ) otherEnd, msgs );
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
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            return basicUnsetSwitchingPlan( msgs );
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
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            return getSwitchingPlan();
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
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            setSwitchingPlan( ( SwitchingPlan ) newValue );
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
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            unsetSwitchingPlan();
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
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            return isSetSwitchingPlan();
        }
        return super.eIsSet( featureID );
    }

} //SafetyDocumentImpl
