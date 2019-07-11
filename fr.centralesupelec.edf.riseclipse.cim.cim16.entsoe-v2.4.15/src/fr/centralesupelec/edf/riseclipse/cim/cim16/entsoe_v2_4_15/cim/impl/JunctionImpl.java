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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Junction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Junction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.JunctionImpl#isBoundaryPoint <em>Boundary Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.JunctionImpl#getFromEndIsoCode <em>From End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.JunctionImpl#getFromEndName <em>From End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.JunctionImpl#getFromEndNameTso <em>From End Name Tso</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.JunctionImpl#getToEndIsoCode <em>To End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.JunctionImpl#getToEndName <em>To End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.JunctionImpl#getToEndNameTso <em>To End Name Tso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JunctionImpl extends ConnectorImpl implements Junction {
    /**
     * The default value of the '{@link #isBoundaryPoint() <em>Boundary Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBoundaryPoint()
     * @generated
     * @ordered
     */
    protected static final boolean BOUNDARY_POINT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBoundaryPoint() <em>Boundary Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBoundaryPoint()
     * @generated
     * @ordered
     */
    protected boolean boundaryPoint = BOUNDARY_POINT_EDEFAULT;

    /**
     * The default value of the '{@link #getFromEndIsoCode() <em>From End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndIsoCode()
     * @generated
     * @ordered
     */
    protected static final String FROM_END_ISO_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromEndIsoCode() <em>From End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndIsoCode()
     * @generated
     * @ordered
     */
    protected String fromEndIsoCode = FROM_END_ISO_CODE_EDEFAULT;

    /**
     * The default value of the '{@link #getFromEndName() <em>From End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndName()
     * @generated
     * @ordered
     */
    protected static final String FROM_END_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromEndName() <em>From End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndName()
     * @generated
     * @ordered
     */
    protected String fromEndName = FROM_END_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFromEndNameTso() <em>From End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndNameTso()
     * @generated
     * @ordered
     */
    protected static final String FROM_END_NAME_TSO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromEndNameTso() <em>From End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndNameTso()
     * @generated
     * @ordered
     */
    protected String fromEndNameTso = FROM_END_NAME_TSO_EDEFAULT;

    /**
     * The default value of the '{@link #getToEndIsoCode() <em>To End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndIsoCode()
     * @generated
     * @ordered
     */
    protected static final String TO_END_ISO_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToEndIsoCode() <em>To End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndIsoCode()
     * @generated
     * @ordered
     */
    protected String toEndIsoCode = TO_END_ISO_CODE_EDEFAULT;

    /**
     * The default value of the '{@link #getToEndName() <em>To End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndName()
     * @generated
     * @ordered
     */
    protected static final String TO_END_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToEndName() <em>To End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndName()
     * @generated
     * @ordered
     */
    protected String toEndName = TO_END_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getToEndNameTso() <em>To End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndNameTso()
     * @generated
     * @ordered
     */
    protected static final String TO_END_NAME_TSO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToEndNameTso() <em>To End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndNameTso()
     * @generated
     * @ordered
     */
    protected String toEndNameTso = TO_END_NAME_TSO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getJunction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isBoundaryPoint() {
        return boundaryPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBoundaryPoint( boolean newBoundaryPoint ) {
        boolean oldBoundaryPoint = boundaryPoint;
        boundaryPoint = newBoundaryPoint;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUNCTION__BOUNDARY_POINT,
                    oldBoundaryPoint, boundaryPoint ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromEndIsoCode() {
        return fromEndIsoCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromEndIsoCode( String newFromEndIsoCode ) {
        String oldFromEndIsoCode = fromEndIsoCode;
        fromEndIsoCode = newFromEndIsoCode;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUNCTION__FROM_END_ISO_CODE,
                    oldFromEndIsoCode, fromEndIsoCode ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromEndName() {
        return fromEndName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromEndName( String newFromEndName ) {
        String oldFromEndName = fromEndName;
        fromEndName = newFromEndName;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUNCTION__FROM_END_NAME, oldFromEndName,
                    fromEndName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromEndNameTso() {
        return fromEndNameTso;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromEndNameTso( String newFromEndNameTso ) {
        String oldFromEndNameTso = fromEndNameTso;
        fromEndNameTso = newFromEndNameTso;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUNCTION__FROM_END_NAME_TSO,
                    oldFromEndNameTso, fromEndNameTso ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getToEndIsoCode() {
        return toEndIsoCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToEndIsoCode( String newToEndIsoCode ) {
        String oldToEndIsoCode = toEndIsoCode;
        toEndIsoCode = newToEndIsoCode;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUNCTION__TO_END_ISO_CODE,
                    oldToEndIsoCode, toEndIsoCode ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getToEndName() {
        return toEndName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToEndName( String newToEndName ) {
        String oldToEndName = toEndName;
        toEndName = newToEndName;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUNCTION__TO_END_NAME, oldToEndName,
                    toEndName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getToEndNameTso() {
        return toEndNameTso;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToEndNameTso( String newToEndNameTso ) {
        String oldToEndNameTso = toEndNameTso;
        toEndNameTso = newToEndNameTso;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUNCTION__TO_END_NAME_TSO,
                    oldToEndNameTso, toEndNameTso ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.JUNCTION__BOUNDARY_POINT:
            return isBoundaryPoint();
        case CimPackage.JUNCTION__FROM_END_ISO_CODE:
            return getFromEndIsoCode();
        case CimPackage.JUNCTION__FROM_END_NAME:
            return getFromEndName();
        case CimPackage.JUNCTION__FROM_END_NAME_TSO:
            return getFromEndNameTso();
        case CimPackage.JUNCTION__TO_END_ISO_CODE:
            return getToEndIsoCode();
        case CimPackage.JUNCTION__TO_END_NAME:
            return getToEndName();
        case CimPackage.JUNCTION__TO_END_NAME_TSO:
            return getToEndNameTso();
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
        case CimPackage.JUNCTION__BOUNDARY_POINT:
            setBoundaryPoint( ( Boolean ) newValue );
            return;
        case CimPackage.JUNCTION__FROM_END_ISO_CODE:
            setFromEndIsoCode( ( String ) newValue );
            return;
        case CimPackage.JUNCTION__FROM_END_NAME:
            setFromEndName( ( String ) newValue );
            return;
        case CimPackage.JUNCTION__FROM_END_NAME_TSO:
            setFromEndNameTso( ( String ) newValue );
            return;
        case CimPackage.JUNCTION__TO_END_ISO_CODE:
            setToEndIsoCode( ( String ) newValue );
            return;
        case CimPackage.JUNCTION__TO_END_NAME:
            setToEndName( ( String ) newValue );
            return;
        case CimPackage.JUNCTION__TO_END_NAME_TSO:
            setToEndNameTso( ( String ) newValue );
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
        case CimPackage.JUNCTION__BOUNDARY_POINT:
            setBoundaryPoint( BOUNDARY_POINT_EDEFAULT );
            return;
        case CimPackage.JUNCTION__FROM_END_ISO_CODE:
            setFromEndIsoCode( FROM_END_ISO_CODE_EDEFAULT );
            return;
        case CimPackage.JUNCTION__FROM_END_NAME:
            setFromEndName( FROM_END_NAME_EDEFAULT );
            return;
        case CimPackage.JUNCTION__FROM_END_NAME_TSO:
            setFromEndNameTso( FROM_END_NAME_TSO_EDEFAULT );
            return;
        case CimPackage.JUNCTION__TO_END_ISO_CODE:
            setToEndIsoCode( TO_END_ISO_CODE_EDEFAULT );
            return;
        case CimPackage.JUNCTION__TO_END_NAME:
            setToEndName( TO_END_NAME_EDEFAULT );
            return;
        case CimPackage.JUNCTION__TO_END_NAME_TSO:
            setToEndNameTso( TO_END_NAME_TSO_EDEFAULT );
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
        case CimPackage.JUNCTION__BOUNDARY_POINT:
            return boundaryPoint != BOUNDARY_POINT_EDEFAULT;
        case CimPackage.JUNCTION__FROM_END_ISO_CODE:
            return FROM_END_ISO_CODE_EDEFAULT == null ? fromEndIsoCode != null
                    : !FROM_END_ISO_CODE_EDEFAULT.equals( fromEndIsoCode );
        case CimPackage.JUNCTION__FROM_END_NAME:
            return FROM_END_NAME_EDEFAULT == null ? fromEndName != null : !FROM_END_NAME_EDEFAULT.equals( fromEndName );
        case CimPackage.JUNCTION__FROM_END_NAME_TSO:
            return FROM_END_NAME_TSO_EDEFAULT == null ? fromEndNameTso != null
                    : !FROM_END_NAME_TSO_EDEFAULT.equals( fromEndNameTso );
        case CimPackage.JUNCTION__TO_END_ISO_CODE:
            return TO_END_ISO_CODE_EDEFAULT == null ? toEndIsoCode != null
                    : !TO_END_ISO_CODE_EDEFAULT.equals( toEndIsoCode );
        case CimPackage.JUNCTION__TO_END_NAME:
            return TO_END_NAME_EDEFAULT == null ? toEndName != null : !TO_END_NAME_EDEFAULT.equals( toEndName );
        case CimPackage.JUNCTION__TO_END_NAME_TSO:
            return TO_END_NAME_TSO_EDEFAULT == null ? toEndNameTso != null
                    : !TO_END_NAME_TSO_EDEFAULT.equals( toEndNameTso );
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
        result.append( " (boundaryPoint: " );
        result.append( boundaryPoint );
        result.append( ", fromEndIsoCode: " );
        result.append( fromEndIsoCode );
        result.append( ", fromEndName: " );
        result.append( fromEndName );
        result.append( ", fromEndNameTso: " );
        result.append( fromEndNameTso );
        result.append( ", toEndIsoCode: " );
        result.append( toEndIsoCode );
        result.append( ", toEndName: " );
        result.append( toEndName );
        result.append( ", toEndNameTso: " );
        result.append( toEndNameTso );
        result.append( ')' );
        return result.toString();
    }

} //JunctionImpl
