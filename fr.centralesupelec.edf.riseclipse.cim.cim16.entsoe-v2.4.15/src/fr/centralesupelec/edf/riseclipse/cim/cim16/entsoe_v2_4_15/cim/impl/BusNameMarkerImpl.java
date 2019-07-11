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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ACDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.BusNameMarker;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;

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
 * An implementation of the model object '<em><b>Bus Name Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.BusNameMarkerImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.BusNameMarkerImpl#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusNameMarkerImpl extends IdentifiedObjectImpl implements BusNameMarker {
    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final Integer PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected Integer priority = PRIORITY_EDEFAULT;

    /**
     * This is true if the Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priorityESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected EList< ACDCTerminal > terminal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusNameMarkerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBusNameMarker();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriority( Integer newPriority ) {
        Integer oldPriority = priority;
        priority = newPriority;
        boolean oldPriorityESet = priorityESet;
        priorityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BUS_NAME_MARKER__PRIORITY, oldPriority,
                    priority, !oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriority() {
        Integer oldPriority = priority;
        boolean oldPriorityESet = priorityESet;
        priority = PRIORITY_EDEFAULT;
        priorityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUS_NAME_MARKER__PRIORITY, oldPriority,
                    PRIORITY_EDEFAULT, oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriority() {
        return priorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ACDCTerminal > getTerminal() {
        if( terminal == null ) {
            terminal = new EObjectWithInverseResolvingEList.Unsettable< ACDCTerminal >( ACDCTerminal.class, this,
                    CimPackage.BUS_NAME_MARKER__TERMINAL, CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER );
        }
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminal() {
        if( terminal != null ) ( ( InternalEList.Unsettable< ? > ) terminal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminal != null && ( ( InternalEList.Unsettable< ? > ) terminal ).isSet();
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
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminal() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return ( ( InternalEList< ? > ) getTerminal() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            return getPriority();
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return getTerminal();
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
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            setPriority( ( Integer ) newValue );
            return;
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            getTerminal().clear();
            getTerminal().addAll( ( Collection< ? extends ACDCTerminal > ) newValue );
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
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            unsetPriority();
            return;
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            unsetTerminal();
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
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            return isSetPriority();
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return isSetTerminal();
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
        result.append( " (priority: " );
        if( priorityESet )
            result.append( priority );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BusNameMarkerImpl
