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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetModel;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetModelImpl#getAssetInfo <em>Asset Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetModelImpl extends IdentifiedObjectImpl implements AssetModel {
    /**
     * The cached value of the '{@link #getAssetInfo() <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetInfo()
     * @generated
     * @ordered
     */
    protected AssetInfo assetInfo;

    /**
     * This is true if the Asset Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetInfoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetModel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetInfo getAssetInfo() {
        return assetInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetInfo( AssetInfo newAssetInfo, NotificationChain msgs ) {
        AssetInfo oldAssetInfo = assetInfo;
        assetInfo = newAssetInfo;
        boolean oldAssetInfoESet = assetInfoESet;
        assetInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_MODEL__ASSET_INFO, oldAssetInfo, newAssetInfo, !oldAssetInfoESet );
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
    public void setAssetInfo( AssetInfo newAssetInfo ) {
        if( newAssetInfo != assetInfo ) {
            NotificationChain msgs = null;
            if( assetInfo != null )
                msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__ASSET_MODEL,
                        AssetInfo.class, msgs );
            if( newAssetInfo != null )
                msgs = ( ( InternalEObject ) newAssetInfo ).eInverseAdd( this, CimPackage.ASSET_INFO__ASSET_MODEL,
                        AssetInfo.class, msgs );
            msgs = basicSetAssetInfo( newAssetInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_MODEL__ASSET_INFO,
                        newAssetInfo, newAssetInfo, !oldAssetInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetInfo( NotificationChain msgs ) {
        AssetInfo oldAssetInfo = assetInfo;
        assetInfo = null;
        boolean oldAssetInfoESet = assetInfoESet;
        assetInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_MODEL__ASSET_INFO, oldAssetInfo, null, oldAssetInfoESet );
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
    public void unsetAssetInfo() {
        if( assetInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__ASSET_MODEL,
                    AssetInfo.class, msgs );
            msgs = basicUnsetAssetInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_MODEL__ASSET_INFO, null,
                        null, oldAssetInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetInfo() {
        return assetInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASSET_MODEL__ASSET_INFO:
            if( assetInfo != null )
                msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__ASSET_MODEL,
                        AssetInfo.class, msgs );
            return basicSetAssetInfo( ( AssetInfo ) otherEnd, msgs );
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
        case CimPackage.ASSET_MODEL__ASSET_INFO:
            return basicUnsetAssetInfo( msgs );
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
        case CimPackage.ASSET_MODEL__ASSET_INFO:
            return getAssetInfo();
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
        case CimPackage.ASSET_MODEL__ASSET_INFO:
            setAssetInfo( ( AssetInfo ) newValue );
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
        case CimPackage.ASSET_MODEL__ASSET_INFO:
            unsetAssetInfo();
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
        case CimPackage.ASSET_MODEL__ASSET_INFO:
            return isSetAssetInfo();
        }
        return super.eIsSet( featureID );
    }

} //AssetModelImpl
