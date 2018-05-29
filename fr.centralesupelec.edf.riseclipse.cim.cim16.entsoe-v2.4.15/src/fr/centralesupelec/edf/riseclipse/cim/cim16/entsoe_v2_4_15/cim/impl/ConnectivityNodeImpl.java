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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNodeContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode;

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
 * An implementation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#isBoundaryPoint <em>Boundary Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getFromEndIsoCode <em>From End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getFromEndName <em>From End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getFromEndNameTso <em>From End Name Tso</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getToEndIsoCode <em>To End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getToEndName <em>To End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ConnectivityNodeImpl#getToEndNameTso <em>To End Name Tso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityNodeImpl extends IdentifiedObjectImpl implements ConnectivityNode {
    /**
     * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNode()
     * @generated
     * @ordered
     */
    protected TopologicalNode topologicalNode;

    /**
     * This is true if the Topological Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean topologicalNodeESet;

    /**
     * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminals()
     * @generated
     * @ordered
     */
    protected EList< Terminal > terminals;

    /**
     * The cached value of the '{@link #getConnectivityNodeContainer() <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNodeContainer()
     * @generated
     * @ordered
     */
    protected ConnectivityNodeContainer connectivityNodeContainer;

    /**
     * This is true if the Connectivity Node Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectivityNodeContainerESet;

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
    protected ConnectivityNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConnectivityNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalNode getTopologicalNode() {
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTopologicalNode( TopologicalNode newTopologicalNode, NotificationChain msgs ) {
        TopologicalNode oldTopologicalNode = topologicalNode;
        topologicalNode = newTopologicalNode;
        boolean oldTopologicalNodeESet = topologicalNodeESet;
        topologicalNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode,
                    !oldTopologicalNodeESet );
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
    public void setTopologicalNode( TopologicalNode newTopologicalNode ) {
        if( newTopologicalNode != topologicalNode ) {
            NotificationChain msgs = null;
            if( topologicalNode != null ) msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            if( newTopologicalNode != null ) msgs = ( ( InternalEObject ) newTopologicalNode ).eInverseAdd( this,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            msgs = basicSetTopologicalNode( newTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE,
                        newTopologicalNode, newTopologicalNode, !oldTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTopologicalNode( NotificationChain msgs ) {
        TopologicalNode oldTopologicalNode = topologicalNode;
        topologicalNode = null;
        boolean oldTopologicalNodeESet = topologicalNodeESet;
        topologicalNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, oldTopologicalNode, null, oldTopologicalNodeESet );
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
    public void unsetTopologicalNode() {
        if( topologicalNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            msgs = basicUnsetTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, null, null, oldTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNode() {
        return topologicalNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Terminal > getTerminals() {
        if( terminals == null ) {
            terminals = new EObjectWithInverseResolvingEList.Unsettable< Terminal >( Terminal.class, this,
                    CimPackage.CONNECTIVITY_NODE__TERMINALS, CimPackage.TERMINAL__CONNECTIVITY_NODE );
        }
        return terminals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminals() {
        if( terminals != null ) ( ( InternalEList.Unsettable< ? > ) terminals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminals() {
        return terminals != null && ( ( InternalEList.Unsettable< ? > ) terminals ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return connectivityNodeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectivityNodeContainer( ConnectivityNodeContainer newConnectivityNodeContainer,
            NotificationChain msgs ) {
        ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
        connectivityNodeContainer = newConnectivityNodeContainer;
        boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
        connectivityNodeContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer,
                    newConnectivityNodeContainer, !oldConnectivityNodeContainerESet );
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
    public void setConnectivityNodeContainer( ConnectivityNodeContainer newConnectivityNodeContainer ) {
        if( newConnectivityNodeContainer != connectivityNodeContainer ) {
            NotificationChain msgs = null;
            if( connectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class,
                        msgs );
            if( newConnectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) newConnectivityNodeContainer ).eInverseAdd( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class,
                        msgs );
            msgs = basicSetConnectivityNodeContainer( newConnectivityNodeContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, newConnectivityNodeContainer,
                    newConnectivityNodeContainer, !oldConnectivityNodeContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConnectivityNodeContainer( NotificationChain msgs ) {
        ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
        connectivityNodeContainer = null;
        boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
        connectivityNodeContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, null,
                    oldConnectivityNodeContainerESet );
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
    public void unsetConnectivityNodeContainer() {
        if( connectivityNodeContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                    CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs );
            msgs = basicUnsetConnectivityNodeContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, null, null,
                    oldConnectivityNodeContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNodeContainer() {
        return connectivityNodeContainerESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, oldBoundaryPoint, boundaryPoint ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECTIVITY_NODE__FROM_END_ISO_CODE, oldFromEndIsoCode, fromEndIsoCode ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECTIVITY_NODE__FROM_END_NAME, oldFromEndName, fromEndName ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECTIVITY_NODE__FROM_END_NAME_TSO, oldFromEndNameTso, fromEndNameTso ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECTIVITY_NODE__TO_END_ISO_CODE, oldToEndIsoCode, toEndIsoCode ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECTIVITY_NODE__TO_END_NAME, oldToEndName, toEndName ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECTIVITY_NODE__TO_END_NAME_TSO, oldToEndNameTso, toEndNameTso ) );
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
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            if( topologicalNode != null ) msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            return basicSetTopologicalNode( ( TopologicalNode ) otherEnd, msgs );
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminals() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            if( connectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class,
                        msgs );
            return basicSetConnectivityNodeContainer( ( ConnectivityNodeContainer ) otherEnd, msgs );
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
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            return basicUnsetTopologicalNode( msgs );
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return ( ( InternalEList< ? > ) getTerminals() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            return basicUnsetConnectivityNodeContainer( msgs );
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
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            return getTopologicalNode();
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return getTerminals();
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            return getConnectivityNodeContainer();
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            return isBoundaryPoint();
        case CimPackage.CONNECTIVITY_NODE__FROM_END_ISO_CODE:
            return getFromEndIsoCode();
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME:
            return getFromEndName();
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME_TSO:
            return getFromEndNameTso();
        case CimPackage.CONNECTIVITY_NODE__TO_END_ISO_CODE:
            return getToEndIsoCode();
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME:
            return getToEndName();
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME_TSO:
            return getToEndNameTso();
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
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            setTopologicalNode( ( TopologicalNode ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            getTerminals().clear();
            getTerminals().addAll( ( Collection< ? extends Terminal > ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            setConnectivityNodeContainer( ( ConnectivityNodeContainer ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            setBoundaryPoint( ( Boolean ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__FROM_END_ISO_CODE:
            setFromEndIsoCode( ( String ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME:
            setFromEndName( ( String ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME_TSO:
            setFromEndNameTso( ( String ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__TO_END_ISO_CODE:
            setToEndIsoCode( ( String ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME:
            setToEndName( ( String ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME_TSO:
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
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
            return;
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            unsetTerminals();
            return;
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            unsetConnectivityNodeContainer();
            return;
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            setBoundaryPoint( BOUNDARY_POINT_EDEFAULT );
            return;
        case CimPackage.CONNECTIVITY_NODE__FROM_END_ISO_CODE:
            setFromEndIsoCode( FROM_END_ISO_CODE_EDEFAULT );
            return;
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME:
            setFromEndName( FROM_END_NAME_EDEFAULT );
            return;
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME_TSO:
            setFromEndNameTso( FROM_END_NAME_TSO_EDEFAULT );
            return;
        case CimPackage.CONNECTIVITY_NODE__TO_END_ISO_CODE:
            setToEndIsoCode( TO_END_ISO_CODE_EDEFAULT );
            return;
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME:
            setToEndName( TO_END_NAME_EDEFAULT );
            return;
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME_TSO:
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
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return isSetTerminals();
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            return isSetConnectivityNodeContainer();
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            return boundaryPoint != BOUNDARY_POINT_EDEFAULT;
        case CimPackage.CONNECTIVITY_NODE__FROM_END_ISO_CODE:
            return FROM_END_ISO_CODE_EDEFAULT == null ? fromEndIsoCode != null
                    : !FROM_END_ISO_CODE_EDEFAULT.equals( fromEndIsoCode );
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME:
            return FROM_END_NAME_EDEFAULT == null ? fromEndName != null : !FROM_END_NAME_EDEFAULT.equals( fromEndName );
        case CimPackage.CONNECTIVITY_NODE__FROM_END_NAME_TSO:
            return FROM_END_NAME_TSO_EDEFAULT == null ? fromEndNameTso != null
                    : !FROM_END_NAME_TSO_EDEFAULT.equals( fromEndNameTso );
        case CimPackage.CONNECTIVITY_NODE__TO_END_ISO_CODE:
            return TO_END_ISO_CODE_EDEFAULT == null ? toEndIsoCode != null
                    : !TO_END_ISO_CODE_EDEFAULT.equals( toEndIsoCode );
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME:
            return TO_END_NAME_EDEFAULT == null ? toEndName != null : !TO_END_NAME_EDEFAULT.equals( toEndName );
        case CimPackage.CONNECTIVITY_NODE__TO_END_NAME_TSO:
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

        StringBuffer result = new StringBuffer( super.toString() );
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

} //ConnectivityNodeImpl
