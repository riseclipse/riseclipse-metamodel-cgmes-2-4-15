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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Length Line Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PerLengthLineParameterImpl#getWireSpacingInfo <em>Wire Spacing Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.PerLengthLineParameterImpl#getWireInfos <em>Wire Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerLengthLineParameterImpl extends IdentifiedObjectImpl implements PerLengthLineParameter {
    /**
     * The cached value of the '{@link #getWireSpacingInfo() <em>Wire Spacing Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWireSpacingInfo()
     * @generated
     * @ordered
     */
    protected WireSpacingInfo wireSpacingInfo;

    /**
     * This is true if the Wire Spacing Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wireSpacingInfoESet;

    /**
     * The cached value of the '{@link #getWireInfos() <em>Wire Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWireInfos()
     * @generated
     * @ordered
     */
    protected EList< WireInfo > wireInfos;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerLengthLineParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPerLengthLineParameter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WireInfo > getWireInfos() {
        if( wireInfos == null ) {
            wireInfos = new EObjectWithInverseEList.Unsettable.ManyInverse< WireInfo >( WireInfo.class, this,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_INFOS, CimPackage.WIRE_INFO__PER_LENGTH_PARAMETERS );
        }
        return wireInfos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWireInfos() {
        if( wireInfos != null ) ( ( InternalEList.Unsettable< ? > ) wireInfos ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWireInfos() {
        return wireInfos != null && ( ( InternalEList.Unsettable< ? > ) wireInfos ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireSpacingInfo getWireSpacingInfo() {
        return wireSpacingInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWireSpacingInfo( WireSpacingInfo newWireSpacingInfo, NotificationChain msgs ) {
        WireSpacingInfo oldWireSpacingInfo = wireSpacingInfo;
        wireSpacingInfo = newWireSpacingInfo;
        boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
        wireSpacingInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO, oldWireSpacingInfo, newWireSpacingInfo,
                    !oldWireSpacingInfoESet );
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
    public void setWireSpacingInfo( WireSpacingInfo newWireSpacingInfo ) {
        if( newWireSpacingInfo != wireSpacingInfo ) {
            NotificationChain msgs = null;
            if( wireSpacingInfo != null )
                msgs = ( ( InternalEObject ) wireSpacingInfo ).eInverseRemove( this,
                        CimPackage.WIRE_SPACING_INFO__PER_LENGTH_PARAMETERS, WireSpacingInfo.class, msgs );
            if( newWireSpacingInfo != null )
                msgs = ( ( InternalEObject ) newWireSpacingInfo ).eInverseAdd( this,
                        CimPackage.WIRE_SPACING_INFO__PER_LENGTH_PARAMETERS, WireSpacingInfo.class, msgs );
            msgs = basicSetWireSpacingInfo( newWireSpacingInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
            wireSpacingInfoESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO, newWireSpacingInfo, newWireSpacingInfo,
                        !oldWireSpacingInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWireSpacingInfo( NotificationChain msgs ) {
        WireSpacingInfo oldWireSpacingInfo = wireSpacingInfo;
        wireSpacingInfo = null;
        boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
        wireSpacingInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO, oldWireSpacingInfo, null,
                    oldWireSpacingInfoESet );
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
    public void unsetWireSpacingInfo() {
        if( wireSpacingInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) wireSpacingInfo ).eInverseRemove( this,
                    CimPackage.WIRE_SPACING_INFO__PER_LENGTH_PARAMETERS, WireSpacingInfo.class, msgs );
            msgs = basicUnsetWireSpacingInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
            wireSpacingInfoESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO, null, null, oldWireSpacingInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWireSpacingInfo() {
        return wireSpacingInfoESet;
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO:
            if( wireSpacingInfo != null )
                msgs = ( ( InternalEObject ) wireSpacingInfo ).eInverseRemove( this,
                        CimPackage.WIRE_SPACING_INFO__PER_LENGTH_PARAMETERS, WireSpacingInfo.class, msgs );
            return basicSetWireSpacingInfo( ( WireSpacingInfo ) otherEnd, msgs );
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_INFOS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWireInfos() ).basicAdd( otherEnd,
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO:
            return basicUnsetWireSpacingInfo( msgs );
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_INFOS:
            return ( ( InternalEList< ? > ) getWireInfos() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO:
            return getWireSpacingInfo();
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_INFOS:
            return getWireInfos();
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO:
            setWireSpacingInfo( ( WireSpacingInfo ) newValue );
            return;
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_INFOS:
            getWireInfos().clear();
            getWireInfos().addAll( ( Collection< ? extends WireInfo > ) newValue );
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO:
            unsetWireSpacingInfo();
            return;
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_INFOS:
            unsetWireInfos();
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_SPACING_INFO:
            return isSetWireSpacingInfo();
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_INFOS:
            return isSetWireInfos();
        }
        return super.eIsSet( featureID );
    }

} //PerLengthLineParameterImpl
