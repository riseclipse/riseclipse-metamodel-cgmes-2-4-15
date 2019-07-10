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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DCBaseTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DCNode;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DCTopologicalNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Base Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.DCBaseTerminalImpl#getDCTopologicalNode <em>DC Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.DCBaseTerminalImpl#getDCNode <em>DC Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCBaseTerminalImpl extends ACDCTerminalImpl implements DCBaseTerminal {
    /**
     * The cached value of the '{@link #getDCTopologicalNode() <em>DC Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTopologicalNode()
     * @generated
     * @ordered
     */
    protected DCTopologicalNode dcTopologicalNode;

    /**
     * This is true if the DC Topological Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dcTopologicalNodeESet;

    /**
     * The cached value of the '{@link #getDCNode() <em>DC Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCNode()
     * @generated
     * @ordered
     */
    protected DCNode dcNode;

    /**
     * This is true if the DC Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dcNodeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCBaseTerminalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCBaseTerminal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCNode getDCNode() {
        return dcNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDCNode( DCNode newDCNode, NotificationChain msgs ) {
        DCNode oldDCNode = dcNode;
        dcNode = newDCNode;
        boolean oldDCNodeESet = dcNodeESet;
        dcNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_BASE_TERMINAL__DC_NODE, oldDCNode, newDCNode, !oldDCNodeESet );
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
    public void setDCNode( DCNode newDCNode ) {
        if( newDCNode != dcNode ) {
            NotificationChain msgs = null;
            if( dcNode != null ) msgs = ( ( InternalEObject ) dcNode ).eInverseRemove( this,
                    CimPackage.DC_NODE__DC_TERMINALS, DCNode.class, msgs );
            if( newDCNode != null ) msgs = ( ( InternalEObject ) newDCNode ).eInverseAdd( this,
                    CimPackage.DC_NODE__DC_TERMINALS, DCNode.class, msgs );
            msgs = basicSetDCNode( newDCNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCNodeESet = dcNodeESet;
            dcNodeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_BASE_TERMINAL__DC_NODE, newDCNode, newDCNode, !oldDCNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDCNode( NotificationChain msgs ) {
        DCNode oldDCNode = dcNode;
        dcNode = null;
        boolean oldDCNodeESet = dcNodeESet;
        dcNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_BASE_TERMINAL__DC_NODE, oldDCNode, null, oldDCNodeESet );
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
    public void unsetDCNode() {
        if( dcNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dcNode ).eInverseRemove( this, CimPackage.DC_NODE__DC_TERMINALS, DCNode.class,
                    msgs );
            msgs = basicUnsetDCNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCNodeESet = dcNodeESet;
            dcNodeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_BASE_TERMINAL__DC_NODE, null, null, oldDCNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCNode() {
        return dcNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTopologicalNode getDCTopologicalNode() {
        return dcTopologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDCTopologicalNode( DCTopologicalNode newDCTopologicalNode,
            NotificationChain msgs ) {
        DCTopologicalNode oldDCTopologicalNode = dcTopologicalNode;
        dcTopologicalNode = newDCTopologicalNode;
        boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
        dcTopologicalNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE, oldDCTopologicalNode, newDCTopologicalNode,
                    !oldDCTopologicalNodeESet );
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
    public void setDCTopologicalNode( DCTopologicalNode newDCTopologicalNode ) {
        if( newDCTopologicalNode != dcTopologicalNode ) {
            NotificationChain msgs = null;
            if( dcTopologicalNode != null ) msgs = ( ( InternalEObject ) dcTopologicalNode ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS, DCTopologicalNode.class, msgs );
            if( newDCTopologicalNode != null ) msgs = ( ( InternalEObject ) newDCTopologicalNode ).eInverseAdd( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS, DCTopologicalNode.class, msgs );
            msgs = basicSetDCTopologicalNode( newDCTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
            dcTopologicalNodeESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE,
                            newDCTopologicalNode, newDCTopologicalNode, !oldDCTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDCTopologicalNode( NotificationChain msgs ) {
        DCTopologicalNode oldDCTopologicalNode = dcTopologicalNode;
        dcTopologicalNode = null;
        boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
        dcTopologicalNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE, oldDCTopologicalNode, null,
                    oldDCTopologicalNodeESet );
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
    public void unsetDCTopologicalNode() {
        if( dcTopologicalNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dcTopologicalNode ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS, DCTopologicalNode.class, msgs );
            msgs = basicUnsetDCTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
            dcTopologicalNodeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE, null, null, oldDCTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTopologicalNode() {
        return dcTopologicalNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE:
            if( dcTopologicalNode != null ) msgs = ( ( InternalEObject ) dcTopologicalNode ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS, DCTopologicalNode.class, msgs );
            return basicSetDCTopologicalNode( ( DCTopologicalNode ) otherEnd, msgs );
        case CimPackage.DC_BASE_TERMINAL__DC_NODE:
            if( dcNode != null ) msgs = ( ( InternalEObject ) dcNode ).eInverseRemove( this,
                    CimPackage.DC_NODE__DC_TERMINALS, DCNode.class, msgs );
            return basicSetDCNode( ( DCNode ) otherEnd, msgs );
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
        case CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE:
            return basicUnsetDCTopologicalNode( msgs );
        case CimPackage.DC_BASE_TERMINAL__DC_NODE:
            return basicUnsetDCNode( msgs );
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
        case CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE:
            return getDCTopologicalNode();
        case CimPackage.DC_BASE_TERMINAL__DC_NODE:
            return getDCNode();
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
        case CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE:
            setDCTopologicalNode( ( DCTopologicalNode ) newValue );
            return;
        case CimPackage.DC_BASE_TERMINAL__DC_NODE:
            setDCNode( ( DCNode ) newValue );
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
        case CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE:
            unsetDCTopologicalNode();
            return;
        case CimPackage.DC_BASE_TERMINAL__DC_NODE:
            unsetDCNode();
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
        case CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE:
            return isSetDCTopologicalNode();
        case CimPackage.DC_BASE_TERMINAL__DC_NODE:
            return isSetDCNode();
        }
        return super.eIsSet( featureID );
    }

} //DCBaseTerminalImpl
