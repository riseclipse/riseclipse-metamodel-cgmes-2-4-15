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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetModelUsageKind;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CorporateStandardKind;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Manufacturer;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalRestriction;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel;

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
 * An implementation of the model object '<em><b>Product Asset Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProductAssetModelImpl#getCorporateStandardKind <em>Corporate Standard Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProductAssetModelImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProductAssetModelImpl#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProductAssetModelImpl#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProductAssetModelImpl#getWeightTotal <em>Weight Total</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProductAssetModelImpl#getOperationalRestrictions <em>Operational Restrictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProductAssetModelImpl#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductAssetModelImpl extends AssetModelImpl implements ProductAssetModel {
    /**
     * The default value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorporateStandardKind()
     * @generated
     * @ordered
     */
    protected static final CorporateStandardKind CORPORATE_STANDARD_KIND_EDEFAULT = CorporateStandardKind.STANDARD;

    /**
     * The cached value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorporateStandardKind()
     * @generated
     * @ordered
     */
    protected CorporateStandardKind corporateStandardKind = CORPORATE_STANDARD_KIND_EDEFAULT;

    /**
     * This is true if the Corporate Standard Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean corporateStandardKindESet;

    /**
     * The default value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelNumber()
     * @generated
     * @ordered
     */
    protected static final String MODEL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelNumber()
     * @generated
     * @ordered
     */
    protected String modelNumber = MODEL_NUMBER_EDEFAULT;

    /**
     * This is true if the Model Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modelNumberESet;

    /**
     * The default value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelVersion()
     * @generated
     * @ordered
     */
    protected static final String MODEL_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelVersion()
     * @generated
     * @ordered
     */
    protected String modelVersion = MODEL_VERSION_EDEFAULT;

    /**
     * This is true if the Model Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modelVersionESet;

    /**
     * The default value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageKind()
     * @generated
     * @ordered
     */
    protected static final AssetModelUsageKind USAGE_KIND_EDEFAULT = AssetModelUsageKind.DISTRIBUTION_OVERHEAD;

    /**
     * The cached value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageKind()
     * @generated
     * @ordered
     */
    protected AssetModelUsageKind usageKind = USAGE_KIND_EDEFAULT;

    /**
     * This is true if the Usage Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usageKindESet;

    /**
     * The default value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeightTotal()
     * @generated
     * @ordered
     */
    protected static final Float WEIGHT_TOTAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeightTotal()
     * @generated
     * @ordered
     */
    protected Float weightTotal = WEIGHT_TOTAL_EDEFAULT;

    /**
     * This is true if the Weight Total attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean weightTotalESet;

    /**
     * The cached value of the '{@link #getOperationalRestrictions() <em>Operational Restrictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalRestrictions()
     * @generated
     * @ordered
     */
    protected EList< OperationalRestriction > operationalRestrictions;

    /**
     * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManufacturer()
     * @generated
     * @ordered
     */
    protected Manufacturer manufacturer;

    /**
     * This is true if the Manufacturer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean manufacturerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProductAssetModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProductAssetModel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CorporateStandardKind getCorporateStandardKind() {
        return corporateStandardKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCorporateStandardKind( CorporateStandardKind newCorporateStandardKind ) {
        CorporateStandardKind oldCorporateStandardKind = corporateStandardKind;
        corporateStandardKind = newCorporateStandardKind == null ? CORPORATE_STANDARD_KIND_EDEFAULT
                : newCorporateStandardKind;
        boolean oldCorporateStandardKindESet = corporateStandardKindESet;
        corporateStandardKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND, oldCorporateStandardKind,
                    corporateStandardKind, !oldCorporateStandardKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCorporateStandardKind() {
        CorporateStandardKind oldCorporateStandardKind = corporateStandardKind;
        boolean oldCorporateStandardKindESet = corporateStandardKindESet;
        corporateStandardKind = CORPORATE_STANDARD_KIND_EDEFAULT;
        corporateStandardKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND, oldCorporateStandardKind,
                    CORPORATE_STANDARD_KIND_EDEFAULT, oldCorporateStandardKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCorporateStandardKind() {
        return corporateStandardKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModelNumber( String newModelNumber ) {
        String oldModelNumber = modelNumber;
        modelNumber = newModelNumber;
        boolean oldModelNumberESet = modelNumberESet;
        modelNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER,
                    oldModelNumber, modelNumber, !oldModelNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModelNumber() {
        String oldModelNumber = modelNumber;
        boolean oldModelNumberESet = modelNumberESet;
        modelNumber = MODEL_NUMBER_EDEFAULT;
        modelNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER,
                    oldModelNumber, MODEL_NUMBER_EDEFAULT, oldModelNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModelNumber() {
        return modelNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModelVersion( String newModelVersion ) {
        String oldModelVersion = modelVersion;
        modelVersion = newModelVersion;
        boolean oldModelVersionESet = modelVersionESet;
        modelVersionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION,
                    oldModelVersion, modelVersion, !oldModelVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModelVersion() {
        String oldModelVersion = modelVersion;
        boolean oldModelVersionESet = modelVersionESet;
        modelVersion = MODEL_VERSION_EDEFAULT;
        modelVersionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION,
                    oldModelVersion, MODEL_VERSION_EDEFAULT, oldModelVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModelVersion() {
        return modelVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetModelUsageKind getUsageKind() {
        return usageKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsageKind( AssetModelUsageKind newUsageKind ) {
        AssetModelUsageKind oldUsageKind = usageKind;
        usageKind = newUsageKind == null ? USAGE_KIND_EDEFAULT : newUsageKind;
        boolean oldUsageKindESet = usageKindESet;
        usageKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND,
                    oldUsageKind, usageKind, !oldUsageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsageKind() {
        AssetModelUsageKind oldUsageKind = usageKind;
        boolean oldUsageKindESet = usageKindESet;
        usageKind = USAGE_KIND_EDEFAULT;
        usageKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND,
                    oldUsageKind, USAGE_KIND_EDEFAULT, oldUsageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsageKind() {
        return usageKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getWeightTotal() {
        return weightTotal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWeightTotal( Float newWeightTotal ) {
        Float oldWeightTotal = weightTotal;
        weightTotal = newWeightTotal;
        boolean oldWeightTotalESet = weightTotalESet;
        weightTotalESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL,
                    oldWeightTotal, weightTotal, !oldWeightTotalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWeightTotal() {
        Float oldWeightTotal = weightTotal;
        boolean oldWeightTotalESet = weightTotalESet;
        weightTotal = WEIGHT_TOTAL_EDEFAULT;
        weightTotalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL,
                    oldWeightTotal, WEIGHT_TOTAL_EDEFAULT, oldWeightTotalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWeightTotal() {
        return weightTotalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalRestriction > getOperationalRestrictions() {
        if( operationalRestrictions == null ) {
            operationalRestrictions = new EObjectWithInverseResolvingEList.Unsettable< OperationalRestriction >(
                    OperationalRestriction.class, this, CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS,
                    CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL );
        }
        return operationalRestrictions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalRestrictions() {
        if( operationalRestrictions != null ) ( ( InternalEList.Unsettable< ? > ) operationalRestrictions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalRestrictions() {
        return operationalRestrictions != null && ( ( InternalEList.Unsettable< ? > ) operationalRestrictions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManufacturer( Manufacturer newManufacturer, NotificationChain msgs ) {
        Manufacturer oldManufacturer = manufacturer;
        manufacturer = newManufacturer;
        boolean oldManufacturerESet = manufacturerESet;
        manufacturerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER, oldManufacturer, newManufacturer,
                    !oldManufacturerESet );
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
    public void setManufacturer( Manufacturer newManufacturer ) {
        if( newManufacturer != manufacturer ) {
            NotificationChain msgs = null;
            if( manufacturer != null )
                msgs = ( ( InternalEObject ) manufacturer ).eInverseRemove( this,
                        CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            if( newManufacturer != null )
                msgs = ( ( InternalEObject ) newManufacturer ).eInverseAdd( this,
                        CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            msgs = basicSetManufacturer( newManufacturer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldManufacturerESet = manufacturerESet;
            manufacturerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER,
                        newManufacturer, newManufacturer, !oldManufacturerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetManufacturer( NotificationChain msgs ) {
        Manufacturer oldManufacturer = manufacturer;
        manufacturer = null;
        boolean oldManufacturerESet = manufacturerESet;
        manufacturerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER, oldManufacturer, null, oldManufacturerESet );
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
    public void unsetManufacturer() {
        if( manufacturer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) manufacturer ).eInverseRemove( this,
                    CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            msgs = basicUnsetManufacturer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldManufacturerESet = manufacturerESet;
            manufacturerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER,
                        null, null, oldManufacturerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetManufacturer() {
        return manufacturerESet;
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
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalRestrictions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            if( manufacturer != null )
                msgs = ( ( InternalEObject ) manufacturer ).eInverseRemove( this,
                        CimPackage.MANUFACTURER__PRODUCT_ASSET_MODELS, Manufacturer.class, msgs );
            return basicSetManufacturer( ( Manufacturer ) otherEnd, msgs );
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
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return ( ( InternalEList< ? > ) getOperationalRestrictions() ).basicRemove( otherEnd, msgs );
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            return basicUnsetManufacturer( msgs );
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
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            return getCorporateStandardKind();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            return getModelNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            return getModelVersion();
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            return getUsageKind();
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            return getWeightTotal();
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return getOperationalRestrictions();
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            return getManufacturer();
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
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            setCorporateStandardKind( ( CorporateStandardKind ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            setModelNumber( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            setModelVersion( ( String ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            setUsageKind( ( AssetModelUsageKind ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            setWeightTotal( ( Float ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            getOperationalRestrictions().clear();
            getOperationalRestrictions().addAll( ( Collection< ? extends OperationalRestriction > ) newValue );
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            setManufacturer( ( Manufacturer ) newValue );
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
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            unsetCorporateStandardKind();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            unsetModelNumber();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            unsetModelVersion();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            unsetUsageKind();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            unsetWeightTotal();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            unsetOperationalRestrictions();
            return;
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            unsetManufacturer();
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
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
            return isSetCorporateStandardKind();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
            return isSetModelNumber();
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
            return isSetModelVersion();
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
            return isSetUsageKind();
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            return isSetWeightTotal();
        case CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS:
            return isSetOperationalRestrictions();
        case CimPackage.PRODUCT_ASSET_MODEL__MANUFACTURER:
            return isSetManufacturer();
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
        result.append( " (corporateStandardKind: " );
        if( corporateStandardKindESet )
            result.append( corporateStandardKind );
        else
            result.append( "<unset>" );
        result.append( ", modelNumber: " );
        if( modelNumberESet )
            result.append( modelNumber );
        else
            result.append( "<unset>" );
        result.append( ", modelVersion: " );
        if( modelVersionESet )
            result.append( modelVersion );
        else
            result.append( "<unset>" );
        result.append( ", usageKind: " );
        if( usageKindESet )
            result.append( usageKind );
        else
            result.append( "<unset>" );
        result.append( ", weightTotal: " );
        if( weightTotalESet )
            result.append( weightTotal );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProductAssetModelImpl
