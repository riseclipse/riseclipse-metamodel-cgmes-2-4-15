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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SvPowerFlow;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Terminal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Power Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SvPowerFlowImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SvPowerFlowImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.SvPowerFlowImpl#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvPowerFlowImpl extends StateVariableImpl implements SvPowerFlow {
    /**
     * The default value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected static final Float P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected Float p = P_EDEFAULT;

    /**
     * This is true if the P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pESet;

    /**
     * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected static final Float Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected Float q = Q_EDEFAULT;

    /**
     * This is true if the Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected Terminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SvPowerFlowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSvPowerFlow();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP() {
        return p;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP( Float newP ) {
        Float oldP = p;
        p = newP;
        boolean oldPESet = pESet;
        pESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_POWER_FLOW__P, oldP, p, !oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP() {
        Float oldP = p;
        boolean oldPESet = pESet;
        p = P_EDEFAULT;
        pESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_POWER_FLOW__P, oldP, P_EDEFAULT,
                    oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP() {
        return pESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ() {
        return q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ( Float newQ ) {
        Float oldQ = q;
        q = newQ;
        boolean oldQESet = qESet;
        qESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_POWER_FLOW__Q, oldQ, q, !oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ() {
        Float oldQ = q;
        boolean oldQESet = qESet;
        q = Q_EDEFAULT;
        qESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_POWER_FLOW__Q, oldQ, Q_EDEFAULT,
                    oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ() {
        return qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getTerminal() {
        if( terminal != null && terminal.eIsProxy() ) {
            InternalEObject oldTerminal = ( InternalEObject ) terminal;
            terminal = ( Terminal ) eResolveProxy( oldTerminal );
            if( terminal != oldTerminal ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.SV_POWER_FLOW__TERMINAL,
                            oldTerminal, terminal ) );
            }
        }
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Terminal basicGetTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( Terminal newTerminal, NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SV_POWER_FLOW__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( Terminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__SV_POWER_FLOW,
                        Terminal.class, msgs );
            if( newTerminal != null )
                msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this, CimPackage.TERMINAL__SV_POWER_FLOW,
                        Terminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_POWER_FLOW__TERMINAL, newTerminal,
                        newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SV_POWER_FLOW__TERMINAL, oldTerminal, null, oldTerminalESet );
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
    public void unsetTerminal() {
        if( terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__SV_POWER_FLOW,
                    Terminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_POWER_FLOW__TERMINAL, null,
                        null, oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SV_POWER_FLOW__TERMINAL:
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__SV_POWER_FLOW,
                        Terminal.class, msgs );
            return basicSetTerminal( ( Terminal ) otherEnd, msgs );
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
        case CimPackage.SV_POWER_FLOW__TERMINAL:
            return basicUnsetTerminal( msgs );
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
        case CimPackage.SV_POWER_FLOW__P:
            return getP();
        case CimPackage.SV_POWER_FLOW__Q:
            return getQ();
        case CimPackage.SV_POWER_FLOW__TERMINAL:
            if( resolve ) return getTerminal();
            return basicGetTerminal();
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
        case CimPackage.SV_POWER_FLOW__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.SV_POWER_FLOW__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.SV_POWER_FLOW__TERMINAL:
            setTerminal( ( Terminal ) newValue );
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
        case CimPackage.SV_POWER_FLOW__P:
            unsetP();
            return;
        case CimPackage.SV_POWER_FLOW__Q:
            unsetQ();
            return;
        case CimPackage.SV_POWER_FLOW__TERMINAL:
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
        case CimPackage.SV_POWER_FLOW__P:
            return isSetP();
        case CimPackage.SV_POWER_FLOW__Q:
            return isSetQ();
        case CimPackage.SV_POWER_FLOW__TERMINAL:
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
        result.append( " (p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SvPowerFlowImpl
