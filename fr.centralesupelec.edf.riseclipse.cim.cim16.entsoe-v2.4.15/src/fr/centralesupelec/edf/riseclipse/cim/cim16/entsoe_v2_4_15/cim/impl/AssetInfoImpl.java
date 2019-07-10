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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetModel;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PowerSystemResource;

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
 * An implementation of the model object '<em><b>Asset Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetInfoImpl#getAssetModel <em>Asset Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetInfoImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetInfoImpl#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetInfoImpl extends IdentifiedObjectImpl implements AssetInfo {
    /**
     * The cached value of the '{@link #getAssetModel() <em>Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetModel()
     * @generated
     * @ordered
     */
    protected AssetModel assetModel;

    /**
     * This is true if the Asset Model reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetModelESet;

    /**
     * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResources()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemResource > powerSystemResources;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList< Asset > assets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetModel getAssetModel() {
        if( assetModel != null && assetModel.eIsProxy() ) {
            InternalEObject oldAssetModel = ( InternalEObject ) assetModel;
            assetModel = ( AssetModel ) eResolveProxy( oldAssetModel );
            if( assetModel != oldAssetModel ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.ASSET_INFO__ASSET_MODEL, oldAssetModel, assetModel ) );
            }
        }
        return assetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssetModel basicGetAssetModel() {
        return assetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetModel( AssetModel newAssetModel, NotificationChain msgs ) {
        AssetModel oldAssetModel = assetModel;
        assetModel = newAssetModel;
        boolean oldAssetModelESet = assetModelESet;
        assetModelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_INFO__ASSET_MODEL, oldAssetModel, newAssetModel, !oldAssetModelESet );
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
    public void setAssetModel( AssetModel newAssetModel ) {
        if( newAssetModel != assetModel ) {
            NotificationChain msgs = null;
            if( assetModel != null ) msgs = ( ( InternalEObject ) assetModel ).eInverseRemove( this,
                    CimPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs );
            if( newAssetModel != null ) msgs = ( ( InternalEObject ) newAssetModel ).eInverseAdd( this,
                    CimPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs );
            msgs = basicSetAssetModel( newAssetModel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetModelESet = assetModelESet;
            assetModelESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_INFO__ASSET_MODEL, newAssetModel, newAssetModel, !oldAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetModel( NotificationChain msgs ) {
        AssetModel oldAssetModel = assetModel;
        assetModel = null;
        boolean oldAssetModelESet = assetModelESet;
        assetModelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_INFO__ASSET_MODEL, oldAssetModel, null, oldAssetModelESet );
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
    public void unsetAssetModel() {
        if( assetModel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetModel ).eInverseRemove( this, CimPackage.ASSET_MODEL__ASSET_INFO,
                    AssetModel.class, msgs );
            msgs = basicUnsetAssetModel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetModelESet = assetModelESet;
            assetModelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_INFO__ASSET_MODEL, null, null, oldAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetModel() {
        return assetModelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemResource > getPowerSystemResources() {
        if( powerSystemResources == null ) {
            powerSystemResources = new EObjectWithInverseResolvingEList.Unsettable< PowerSystemResource >(
                    PowerSystemResource.class, this, CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET );
        }
        return powerSystemResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemResources() {
        if( powerSystemResources != null ) ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResources() {
        return powerSystemResources != null && ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseResolvingEList.Unsettable< Asset >( Asset.class, this,
                    CimPackage.ASSET_INFO__ASSETS, CimPackage.ASSET__ASSET_INFO );
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssets() {
        if( assets != null ) ( ( InternalEList.Unsettable< ? > ) assets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssets() {
        return assets != null && ( ( InternalEList.Unsettable< ? > ) assets ).isSet();
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
        case CimPackage.ASSET_INFO__ASSET_MODEL:
            if( assetModel != null ) msgs = ( ( InternalEObject ) assetModel ).eInverseRemove( this,
                    CimPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs );
            return basicSetAssetModel( ( AssetModel ) otherEnd, msgs );
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemResources() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET_INFO__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
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
        case CimPackage.ASSET_INFO__ASSET_MODEL:
            return basicUnsetAssetModel( msgs );
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< ? > ) getPowerSystemResources() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET_INFO__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ASSET_INFO__ASSET_MODEL:
            if( resolve ) return getAssetModel();
            return basicGetAssetModel();
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return getPowerSystemResources();
        case CimPackage.ASSET_INFO__ASSETS:
            return getAssets();
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
        case CimPackage.ASSET_INFO__ASSET_MODEL:
            setAssetModel( ( AssetModel ) newValue );
            return;
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            getPowerSystemResources().clear();
            getPowerSystemResources().addAll( ( Collection< ? extends PowerSystemResource > ) newValue );
            return;
        case CimPackage.ASSET_INFO__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
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
        case CimPackage.ASSET_INFO__ASSET_MODEL:
            unsetAssetModel();
            return;
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            unsetPowerSystemResources();
            return;
        case CimPackage.ASSET_INFO__ASSETS:
            unsetAssets();
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
        case CimPackage.ASSET_INFO__ASSET_MODEL:
            return isSetAssetModel();
        case CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES:
            return isSetPowerSystemResources();
        case CimPackage.ASSET_INFO__ASSETS:
            return isSetAssets();
        }
        return super.eIsSet( featureID );
    }

} //AssetInfoImpl
