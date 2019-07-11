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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AcceptanceTest;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ActivityRecord;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetOrganisationRole;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ElectronicAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LifecycleDate;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Ownership;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Procedure;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ScheduledEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WorkTask;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getCritical <em>Critical</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getInitialLossOfLife <em>Initial Loss Of Life</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getUtcNumber <em>Utc Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getConfigurationEvents <em>Configuration Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getOperationTags <em>Operation Tags</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getAssetContainer <em>Asset Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getOrganisationRoles <em>Organisation Roles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getOwnerships <em>Ownerships</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getReplacementWorkTasks <em>Replacement Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.AssetImpl#getAssetInfo <em>Asset Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends IdentifiedObjectImpl implements Asset {
    /**
     * The default value of the '{@link #getCritical() <em>Critical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCritical()
     * @generated
     * @ordered
     */
    protected static final Boolean CRITICAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCritical() <em>Critical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCritical()
     * @generated
     * @ordered
     */
    protected Boolean critical = CRITICAL_EDEFAULT;

    /**
     * This is true if the Critical attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean criticalESet;

    /**
     * The default value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialCondition()
     * @generated
     * @ordered
     */
    protected static final String INITIAL_CONDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialCondition()
     * @generated
     * @ordered
     */
    protected String initialCondition = INITIAL_CONDITION_EDEFAULT;

    /**
     * This is true if the Initial Condition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialConditionESet;

    /**
     * The default value of the '{@link #getInitialLossOfLife() <em>Initial Loss Of Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialLossOfLife()
     * @generated
     * @ordered
     */
    protected static final Float INITIAL_LOSS_OF_LIFE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitialLossOfLife() <em>Initial Loss Of Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialLossOfLife()
     * @generated
     * @ordered
     */
    protected Float initialLossOfLife = INITIAL_LOSS_OF_LIFE_EDEFAULT;

    /**
     * This is true if the Initial Loss Of Life attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialLossOfLifeESet;

    /**
     * The default value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLotNumber()
     * @generated
     * @ordered
     */
    protected static final String LOT_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLotNumber()
     * @generated
     * @ordered
     */
    protected String lotNumber = LOT_NUMBER_EDEFAULT;

    /**
     * This is true if the Lot Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lotNumberESet;

    /**
     * The default value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchasePrice()
     * @generated
     * @ordered
     */
    protected static final BigDecimal PURCHASE_PRICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchasePrice()
     * @generated
     * @ordered
     */
    protected BigDecimal purchasePrice = PURCHASE_PRICE_EDEFAULT;

    /**
     * This is true if the Purchase Price attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean purchasePriceESet;

    /**
     * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSerialNumber()
     * @generated
     * @ordered
     */
    protected static final String SERIAL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSerialNumber()
     * @generated
     * @ordered
     */
    protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

    /**
     * This is true if the Serial Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serialNumberESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUtcNumber()
     * @generated
     * @ordered
     */
    protected static final String UTC_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUtcNumber()
     * @generated
     * @ordered
     */
    protected String utcNumber = UTC_NUMBER_EDEFAULT;

    /**
     * This is true if the Utc Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean utcNumberESet;

    /**
     * The cached value of the '{@link #getAcceptanceTest() <em>Acceptance Test</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcceptanceTest()
     * @generated
     * @ordered
     */
    protected AcceptanceTest acceptanceTest;

    /**
     * This is true if the Acceptance Test containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean acceptanceTestESet;

    /**
     * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectronicAddress()
     * @generated
     * @ordered
     */
    protected ElectronicAddress electronicAddress;

    /**
     * This is true if the Electronic Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean electronicAddressESet;

    /**
     * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected LifecycleDate lifecycle;

    /**
     * This is true if the Lifecycle containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lifecycleESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedures()
     * @generated
     * @ordered
     */
    protected EList< Procedure > procedures;

    /**
     * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< WorkTask > workTasks;

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
     * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityRecords()
     * @generated
     * @ordered
     */
    protected EList< ActivityRecord > activityRecords;

    /**
     * The cached value of the '{@link #getConfigurationEvents() <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationEvents()
     * @generated
     * @ordered
     */
    protected EList< ConfigurationEvent > configurationEvents;

    /**
     * The cached value of the '{@link #getOperationTags() <em>Operation Tags</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationTags()
     * @generated
     * @ordered
     */
    protected EList< OperationTag > operationTags;

    /**
     * The cached value of the '{@link #getAssetContainer() <em>Asset Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetContainer()
     * @generated
     * @ordered
     */
    protected AssetContainer assetContainer;

    /**
     * This is true if the Asset Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetContainerESet;

    /**
     * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurements()
     * @generated
     * @ordered
     */
    protected EList< Measurement > measurements;

    /**
     * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledEvents()
     * @generated
     * @ordered
     */
    protected EList< ScheduledEvent > scheduledEvents;

    /**
     * The cached value of the '{@link #getOrganisationRoles() <em>Organisation Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrganisationRoles()
     * @generated
     * @ordered
     */
    protected EList< AssetOrganisationRole > organisationRoles;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected Location location;

    /**
     * This is true if the Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean locationESet;

    /**
     * The cached value of the '{@link #getOwnerships() <em>Ownerships</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerships()
     * @generated
     * @ordered
     */
    protected EList< Ownership > ownerships;

    /**
     * The cached value of the '{@link #getReplacementWorkTasks() <em>Replacement Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplacementWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< WorkTask > replacementWorkTasks;

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
    protected AssetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAsset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCritical() {
        return critical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCritical( Boolean newCritical ) {
        Boolean oldCritical = critical;
        critical = newCritical;
        boolean oldCriticalESet = criticalESet;
        criticalESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__CRITICAL, oldCritical, critical,
                    !oldCriticalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCritical() {
        Boolean oldCritical = critical;
        boolean oldCriticalESet = criticalESet;
        critical = CRITICAL_EDEFAULT;
        criticalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__CRITICAL, oldCritical,
                    CRITICAL_EDEFAULT, oldCriticalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCritical() {
        return criticalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInitialCondition() {
        return initialCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInitialCondition( String newInitialCondition ) {
        String oldInitialCondition = initialCondition;
        initialCondition = newInitialCondition;
        boolean oldInitialConditionESet = initialConditionESet;
        initialConditionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__INITIAL_CONDITION,
                    oldInitialCondition, initialCondition, !oldInitialConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInitialCondition() {
        String oldInitialCondition = initialCondition;
        boolean oldInitialConditionESet = initialConditionESet;
        initialCondition = INITIAL_CONDITION_EDEFAULT;
        initialConditionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__INITIAL_CONDITION,
                    oldInitialCondition, INITIAL_CONDITION_EDEFAULT, oldInitialConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitialCondition() {
        return initialConditionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInitialLossOfLife() {
        return initialLossOfLife;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInitialLossOfLife( Float newInitialLossOfLife ) {
        Float oldInitialLossOfLife = initialLossOfLife;
        initialLossOfLife = newInitialLossOfLife;
        boolean oldInitialLossOfLifeESet = initialLossOfLifeESet;
        initialLossOfLifeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__INITIAL_LOSS_OF_LIFE,
                    oldInitialLossOfLife, initialLossOfLife, !oldInitialLossOfLifeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInitialLossOfLife() {
        Float oldInitialLossOfLife = initialLossOfLife;
        boolean oldInitialLossOfLifeESet = initialLossOfLifeESet;
        initialLossOfLife = INITIAL_LOSS_OF_LIFE_EDEFAULT;
        initialLossOfLifeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__INITIAL_LOSS_OF_LIFE,
                    oldInitialLossOfLife, INITIAL_LOSS_OF_LIFE_EDEFAULT, oldInitialLossOfLifeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitialLossOfLife() {
        return initialLossOfLifeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLotNumber( String newLotNumber ) {
        String oldLotNumber = lotNumber;
        lotNumber = newLotNumber;
        boolean oldLotNumberESet = lotNumberESet;
        lotNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__LOT_NUMBER, oldLotNumber,
                    lotNumber, !oldLotNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLotNumber() {
        String oldLotNumber = lotNumber;
        boolean oldLotNumberESet = lotNumberESet;
        lotNumber = LOT_NUMBER_EDEFAULT;
        lotNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__LOT_NUMBER, oldLotNumber,
                    LOT_NUMBER_EDEFAULT, oldLotNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLotNumber() {
        return lotNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurchasePrice( BigDecimal newPurchasePrice ) {
        BigDecimal oldPurchasePrice = purchasePrice;
        purchasePrice = newPurchasePrice;
        boolean oldPurchasePriceESet = purchasePriceESet;
        purchasePriceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__PURCHASE_PRICE, oldPurchasePrice,
                    purchasePrice, !oldPurchasePriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurchasePrice() {
        BigDecimal oldPurchasePrice = purchasePrice;
        boolean oldPurchasePriceESet = purchasePriceESet;
        purchasePrice = PURCHASE_PRICE_EDEFAULT;
        purchasePriceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__PURCHASE_PRICE,
                    oldPurchasePrice, PURCHASE_PRICE_EDEFAULT, oldPurchasePriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurchasePrice() {
        return purchasePriceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSerialNumber( String newSerialNumber ) {
        String oldSerialNumber = serialNumber;
        serialNumber = newSerialNumber;
        boolean oldSerialNumberESet = serialNumberESet;
        serialNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__SERIAL_NUMBER, oldSerialNumber,
                    serialNumber, !oldSerialNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSerialNumber() {
        String oldSerialNumber = serialNumber;
        boolean oldSerialNumberESet = serialNumberESet;
        serialNumber = SERIAL_NUMBER_EDEFAULT;
        serialNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__SERIAL_NUMBER, oldSerialNumber,
                    SERIAL_NUMBER_EDEFAULT, oldSerialNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSerialNumber() {
        return serialNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__TYPE, oldType, type,
                    !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__TYPE, oldType, TYPE_EDEFAULT,
                    oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUtcNumber() {
        return utcNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUtcNumber( String newUtcNumber ) {
        String oldUtcNumber = utcNumber;
        utcNumber = newUtcNumber;
        boolean oldUtcNumberESet = utcNumberESet;
        utcNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__UTC_NUMBER, oldUtcNumber,
                    utcNumber, !oldUtcNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUtcNumber() {
        String oldUtcNumber = utcNumber;
        boolean oldUtcNumberESet = utcNumberESet;
        utcNumber = UTC_NUMBER_EDEFAULT;
        utcNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__UTC_NUMBER, oldUtcNumber,
                    UTC_NUMBER_EDEFAULT, oldUtcNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUtcNumber() {
        return utcNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AcceptanceTest getAcceptanceTest() {
        return acceptanceTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAcceptanceTest( AcceptanceTest newAcceptanceTest, NotificationChain msgs ) {
        AcceptanceTest oldAcceptanceTest = acceptanceTest;
        acceptanceTest = newAcceptanceTest;
        boolean oldAcceptanceTestESet = acceptanceTestESet;
        acceptanceTestESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ACCEPTANCE_TEST, oldAcceptanceTest, newAcceptanceTest, !oldAcceptanceTestESet );
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
    public void setAcceptanceTest( AcceptanceTest newAcceptanceTest ) {
        if( newAcceptanceTest != acceptanceTest ) {
            NotificationChain msgs = null;
            if( acceptanceTest != null )
                msgs = ( ( InternalEObject ) acceptanceTest ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ACCEPTANCE_TEST, null, msgs );
            if( newAcceptanceTest != null )
                msgs = ( ( InternalEObject ) newAcceptanceTest ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ACCEPTANCE_TEST, null, msgs );
            msgs = basicSetAcceptanceTest( newAcceptanceTest, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAcceptanceTestESet = acceptanceTestESet;
            acceptanceTestESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__ACCEPTANCE_TEST,
                        newAcceptanceTest, newAcceptanceTest, !oldAcceptanceTestESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAcceptanceTest( NotificationChain msgs ) {
        AcceptanceTest oldAcceptanceTest = acceptanceTest;
        acceptanceTest = null;
        boolean oldAcceptanceTestESet = acceptanceTestESet;
        acceptanceTestESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ACCEPTANCE_TEST, oldAcceptanceTest, null, oldAcceptanceTestESet );
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
    public void unsetAcceptanceTest() {
        if( acceptanceTest != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) acceptanceTest ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ACCEPTANCE_TEST, null, msgs );
            msgs = basicUnsetAcceptanceTest( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAcceptanceTestESet = acceptanceTestESet;
            acceptanceTestESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__ACCEPTANCE_TEST, null, null,
                        oldAcceptanceTestESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAcceptanceTest() {
        return acceptanceTestESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElectronicAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElectronicAddress( ElectronicAddress newElectronicAddress,
            NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = newElectronicAddress;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ELECTRONIC_ADDRESS, oldElectronicAddress, newElectronicAddress,
                    !oldElectronicAddressESet );
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
    public void setElectronicAddress( ElectronicAddress newElectronicAddress ) {
        if( newElectronicAddress != electronicAddress ) {
            NotificationChain msgs = null;
            if( electronicAddress != null )
                msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs );
            if( newElectronicAddress != null )
                msgs = ( ( InternalEObject ) newElectronicAddress ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicSetElectronicAddress( newElectronicAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__ELECTRONIC_ADDRESS,
                        newElectronicAddress, newElectronicAddress, !oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetElectronicAddress( NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = null;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ELECTRONIC_ADDRESS, oldElectronicAddress, null, oldElectronicAddressESet );
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
    public void unsetElectronicAddress() {
        if( electronicAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicUnsetElectronicAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__ELECTRONIC_ADDRESS, null,
                        null, oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicAddress() {
        return electronicAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LifecycleDate getLifecycle() {
        return lifecycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLifecycle( LifecycleDate newLifecycle, NotificationChain msgs ) {
        LifecycleDate oldLifecycle = lifecycle;
        lifecycle = newLifecycle;
        boolean oldLifecycleESet = lifecycleESet;
        lifecycleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__LIFECYCLE,
                    oldLifecycle, newLifecycle, !oldLifecycleESet );
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
    public void setLifecycle( LifecycleDate newLifecycle ) {
        if( newLifecycle != lifecycle ) {
            NotificationChain msgs = null;
            if( lifecycle != null )
                msgs = ( ( InternalEObject ) lifecycle ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__LIFECYCLE, null, msgs );
            if( newLifecycle != null )
                msgs = ( ( InternalEObject ) newLifecycle ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__LIFECYCLE, null, msgs );
            msgs = basicSetLifecycle( newLifecycle, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLifecycleESet = lifecycleESet;
            lifecycleESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__LIFECYCLE, newLifecycle,
                        newLifecycle, !oldLifecycleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLifecycle( NotificationChain msgs ) {
        LifecycleDate oldLifecycle = lifecycle;
        lifecycle = null;
        boolean oldLifecycleESet = lifecycleESet;
        lifecycleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__LIFECYCLE, oldLifecycle, null, oldLifecycleESet );
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
    public void unsetLifecycle() {
        if( lifecycle != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lifecycle ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__LIFECYCLE, null, msgs );
            msgs = basicUnsetLifecycle( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLifecycleESet = lifecycleESet;
            lifecycleESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__LIFECYCLE, null, null,
                        oldLifecycleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLifecycle() {
        return lifecycleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__STATUS,
                    oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null )
                msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__STATUS, null, msgs );
            if( newStatus != null )
                msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__STATUS, newStatus, newStatus,
                        !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__STATUS,
                    oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__STATUS, null, null,
                        oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Measurement > getMeasurements() {
        if( measurements == null ) {
            measurements = new EObjectWithInverseResolvingEList.Unsettable< Measurement >( Measurement.class, this,
                    CimPackage.ASSET__MEASUREMENTS, CimPackage.MEASUREMENT__ASSET );
        }
        return measurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurements() {
        if( measurements != null ) ( ( InternalEList.Unsettable< ? > ) measurements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurements() {
        return measurements != null && ( ( InternalEList.Unsettable< ? > ) measurements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetOrganisationRole > getOrganisationRoles() {
        if( organisationRoles == null ) {
            organisationRoles = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< AssetOrganisationRole >(
                    AssetOrganisationRole.class, this, CimPackage.ASSET__ORGANISATION_ROLES,
                    CimPackage.ASSET_ORGANISATION_ROLE__ASSETS );
        }
        return organisationRoles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOrganisationRoles() {
        if( organisationRoles != null ) ( ( InternalEList.Unsettable< ? > ) organisationRoles ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOrganisationRoles() {
        return organisationRoles != null && ( ( InternalEList.Unsettable< ? > ) organisationRoles ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConfigurationEvent > getConfigurationEvents() {
        if( configurationEvents == null ) {
            configurationEvents = new EObjectWithInverseResolvingEList.Unsettable< ConfigurationEvent >(
                    ConfigurationEvent.class, this, CimPackage.ASSET__CONFIGURATION_EVENTS,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET );
        }
        return configurationEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigurationEvents() {
        if( configurationEvents != null ) ( ( InternalEList.Unsettable< ? > ) configurationEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigurationEvents() {
        return configurationEvents != null && ( ( InternalEList.Unsettable< ? > ) configurationEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetContainer getAssetContainer() {
        return assetContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetContainer( AssetContainer newAssetContainer, NotificationChain msgs ) {
        AssetContainer oldAssetContainer = assetContainer;
        assetContainer = newAssetContainer;
        boolean oldAssetContainerESet = assetContainerESet;
        assetContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ASSET_CONTAINER, oldAssetContainer, newAssetContainer, !oldAssetContainerESet );
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
    public void setAssetContainer( AssetContainer newAssetContainer ) {
        if( newAssetContainer != assetContainer ) {
            NotificationChain msgs = null;
            if( assetContainer != null )
                msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this, CimPackage.ASSET_CONTAINER__ASSETS,
                        AssetContainer.class, msgs );
            if( newAssetContainer != null )
                msgs = ( ( InternalEObject ) newAssetContainer ).eInverseAdd( this, CimPackage.ASSET_CONTAINER__ASSETS,
                        AssetContainer.class, msgs );
            msgs = basicSetAssetContainer( newAssetContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetContainerESet = assetContainerESet;
            assetContainerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__ASSET_CONTAINER,
                        newAssetContainer, newAssetContainer, !oldAssetContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetContainer( NotificationChain msgs ) {
        AssetContainer oldAssetContainer = assetContainer;
        assetContainer = null;
        boolean oldAssetContainerESet = assetContainerESet;
        assetContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ASSET_CONTAINER, oldAssetContainer, null, oldAssetContainerESet );
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
    public void unsetAssetContainer() {
        if( assetContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this, CimPackage.ASSET_CONTAINER__ASSETS,
                    AssetContainer.class, msgs );
            msgs = basicUnsetAssetContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetContainerESet = assetContainerESet;
            assetContainerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__ASSET_CONTAINER, null, null,
                        oldAssetContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetContainer() {
        return assetContainerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ScheduledEvent > getScheduledEvents() {
        if( scheduledEvents == null ) {
            scheduledEvents = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ScheduledEvent >(
                    ScheduledEvent.class, this, CimPackage.ASSET__SCHEDULED_EVENTS,
                    CimPackage.SCHEDULED_EVENT__ASSETS );
        }
        return scheduledEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScheduledEvents() {
        if( scheduledEvents != null ) ( ( InternalEList.Unsettable< ? > ) scheduledEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScheduledEvents() {
        return scheduledEvents != null && ( ( InternalEList.Unsettable< ? > ) scheduledEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationTag > getOperationTags() {
        if( operationTags == null ) {
            operationTags = new EObjectWithInverseResolvingEList.Unsettable< OperationTag >( OperationTag.class, this,
                    CimPackage.ASSET__OPERATION_TAGS, CimPackage.OPERATION_TAG__ASSET );
        }
        return operationTags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationTags() {
        if( operationTags != null ) ( ( InternalEList.Unsettable< ? > ) operationTags ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationTags() {
        return operationTags != null && ( ( InternalEList.Unsettable< ? > ) operationTags ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkTask > getWorkTasks() {
        if( workTasks == null ) {
            workTasks = new EObjectWithInverseEList.Unsettable.ManyInverse< WorkTask >( WorkTask.class, this,
                    CimPackage.ASSET__WORK_TASKS, CimPackage.WORK_TASK__ASSETS );
        }
        return workTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkTasks() {
        if( workTasks != null ) ( ( InternalEList.Unsettable< ? > ) workTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkTasks() {
        return workTasks != null && ( ( InternalEList.Unsettable< ? > ) workTasks ).isSet();
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
                    CimPackage.ASSET__ASSET_INFO, oldAssetInfo, newAssetInfo, !oldAssetInfoESet );
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
                msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__ASSETS,
                        AssetInfo.class, msgs );
            if( newAssetInfo != null )
                msgs = ( ( InternalEObject ) newAssetInfo ).eInverseAdd( this, CimPackage.ASSET_INFO__ASSETS,
                        AssetInfo.class, msgs );
            msgs = basicSetAssetInfo( newAssetInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__ASSET_INFO, newAssetInfo,
                        newAssetInfo, !oldAssetInfoESet ) );
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
                    CimPackage.ASSET__ASSET_INFO, oldAssetInfo, null, oldAssetInfoESet );
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
            msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__ASSETS,
                    AssetInfo.class, msgs );
            msgs = basicUnsetAssetInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__ASSET_INFO, null, null,
                        oldAssetInfoESet ) );
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
    public EList< Procedure > getProcedures() {
        if( procedures == null ) {
            procedures = new EObjectWithInverseEList.Unsettable.ManyInverse< Procedure >( Procedure.class, this,
                    CimPackage.ASSET__PROCEDURES, CimPackage.PROCEDURE__ASSETS );
        }
        return procedures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcedures() {
        if( procedures != null ) ( ( InternalEList.Unsettable< ? > ) procedures ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedures() {
        return procedures != null && ( ( InternalEList.Unsettable< ? > ) procedures ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation( Location newLocation, NotificationChain msgs ) {
        Location oldLocation = location;
        location = newLocation;
        boolean oldLocationESet = locationESet;
        locationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__LOCATION,
                    oldLocation, newLocation, !oldLocationESet );
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
    public void setLocation( Location newLocation ) {
        if( newLocation != location ) {
            NotificationChain msgs = null;
            if( location != null )
                msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__ASSETS,
                        Location.class, msgs );
            if( newLocation != null )
                msgs = ( ( InternalEObject ) newLocation ).eInverseAdd( this, CimPackage.LOCATION__ASSETS,
                        Location.class, msgs );
            msgs = basicSetLocation( newLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__LOCATION, newLocation,
                        newLocation, !oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLocation( NotificationChain msgs ) {
        Location oldLocation = location;
        location = null;
        boolean oldLocationESet = locationESet;
        locationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__LOCATION, oldLocation, null, oldLocationESet );
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
    public void unsetLocation() {
        if( location != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__ASSETS, Location.class,
                    msgs );
            msgs = basicUnsetLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__LOCATION, null, null,
                        oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocation() {
        return locationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemResource > getPowerSystemResources() {
        if( powerSystemResources == null ) {
            powerSystemResources = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< PowerSystemResource >(
                    PowerSystemResource.class, this, CimPackage.ASSET__POWER_SYSTEM_RESOURCES,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSETS );
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
    public EList< ActivityRecord > getActivityRecords() {
        if( activityRecords == null ) {
            activityRecords = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ActivityRecord >(
                    ActivityRecord.class, this, CimPackage.ASSET__ACTIVITY_RECORDS,
                    CimPackage.ACTIVITY_RECORD__ASSETS );
        }
        return activityRecords;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActivityRecords() {
        if( activityRecords != null ) ( ( InternalEList.Unsettable< ? > ) activityRecords ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActivityRecords() {
        return activityRecords != null && ( ( InternalEList.Unsettable< ? > ) activityRecords ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Ownership > getOwnerships() {
        if( ownerships == null ) {
            ownerships = new EObjectWithInverseResolvingEList.Unsettable< Ownership >( Ownership.class, this,
                    CimPackage.ASSET__OWNERSHIPS, CimPackage.OWNERSHIP__ASSET );
        }
        return ownerships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOwnerships() {
        if( ownerships != null ) ( ( InternalEList.Unsettable< ? > ) ownerships ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOwnerships() {
        return ownerships != null && ( ( InternalEList.Unsettable< ? > ) ownerships ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkTask > getReplacementWorkTasks() {
        if( replacementWorkTasks == null ) {
            replacementWorkTasks = new EObjectWithInverseResolvingEList.Unsettable< WorkTask >( WorkTask.class, this,
                    CimPackage.ASSET__REPLACEMENT_WORK_TASKS, CimPackage.WORK_TASK__OLD_ASSET );
        }
        return replacementWorkTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReplacementWorkTasks() {
        if( replacementWorkTasks != null ) ( ( InternalEList.Unsettable< ? > ) replacementWorkTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReplacementWorkTasks() {
        return replacementWorkTasks != null && ( ( InternalEList.Unsettable< ? > ) replacementWorkTasks ).isSet();
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
        case CimPackage.ASSET__PROCEDURES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcedures() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorkTasks() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemResources() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getActivityRecords() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConfigurationEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__OPERATION_TAGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationTags() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__ASSET_CONTAINER:
            if( assetContainer != null )
                msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this, CimPackage.ASSET_CONTAINER__ASSETS,
                        AssetContainer.class, msgs );
            return basicSetAssetContainer( ( AssetContainer ) otherEnd, msgs );
        case CimPackage.ASSET__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getScheduledEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOrganisationRoles() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__LOCATION:
            if( location != null )
                msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__ASSETS,
                        Location.class, msgs );
            return basicSetLocation( ( Location ) otherEnd, msgs );
        case CimPackage.ASSET__OWNERSHIPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOwnerships() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReplacementWorkTasks() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__ASSET_INFO:
            if( assetInfo != null )
                msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__ASSETS,
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
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            return basicUnsetAcceptanceTest( msgs );
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            return basicUnsetElectronicAddress( msgs );
        case CimPackage.ASSET__LIFECYCLE:
            return basicUnsetLifecycle( msgs );
        case CimPackage.ASSET__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.ASSET__PROCEDURES:
            return ( ( InternalEList< ? > ) getProcedures() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__WORK_TASKS:
            return ( ( InternalEList< ? > ) getWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< ? > ) getPowerSystemResources() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return ( ( InternalEList< ? > ) getActivityRecords() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return ( ( InternalEList< ? > ) getConfigurationEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__OPERATION_TAGS:
            return ( ( InternalEList< ? > ) getOperationTags() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ASSET_CONTAINER:
            return basicUnsetAssetContainer( msgs );
        case CimPackage.ASSET__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return ( ( InternalEList< ? > ) getScheduledEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return ( ( InternalEList< ? > ) getOrganisationRoles() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__LOCATION:
            return basicUnsetLocation( msgs );
        case CimPackage.ASSET__OWNERSHIPS:
            return ( ( InternalEList< ? > ) getOwnerships() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return ( ( InternalEList< ? > ) getReplacementWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ASSET_INFO:
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
        case CimPackage.ASSET__CRITICAL:
            return getCritical();
        case CimPackage.ASSET__INITIAL_CONDITION:
            return getInitialCondition();
        case CimPackage.ASSET__INITIAL_LOSS_OF_LIFE:
            return getInitialLossOfLife();
        case CimPackage.ASSET__LOT_NUMBER:
            return getLotNumber();
        case CimPackage.ASSET__PURCHASE_PRICE:
            return getPurchasePrice();
        case CimPackage.ASSET__SERIAL_NUMBER:
            return getSerialNumber();
        case CimPackage.ASSET__TYPE:
            return getType();
        case CimPackage.ASSET__UTC_NUMBER:
            return getUtcNumber();
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            return getAcceptanceTest();
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            return getElectronicAddress();
        case CimPackage.ASSET__LIFECYCLE:
            return getLifecycle();
        case CimPackage.ASSET__STATUS:
            return getStatus();
        case CimPackage.ASSET__PROCEDURES:
            return getProcedures();
        case CimPackage.ASSET__WORK_TASKS:
            return getWorkTasks();
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return getPowerSystemResources();
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return getActivityRecords();
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return getConfigurationEvents();
        case CimPackage.ASSET__OPERATION_TAGS:
            return getOperationTags();
        case CimPackage.ASSET__ASSET_CONTAINER:
            return getAssetContainer();
        case CimPackage.ASSET__MEASUREMENTS:
            return getMeasurements();
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return getScheduledEvents();
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return getOrganisationRoles();
        case CimPackage.ASSET__LOCATION:
            return getLocation();
        case CimPackage.ASSET__OWNERSHIPS:
            return getOwnerships();
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return getReplacementWorkTasks();
        case CimPackage.ASSET__ASSET_INFO:
            return getAssetInfo();
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
        case CimPackage.ASSET__CRITICAL:
            setCritical( ( Boolean ) newValue );
            return;
        case CimPackage.ASSET__INITIAL_CONDITION:
            setInitialCondition( ( String ) newValue );
            return;
        case CimPackage.ASSET__INITIAL_LOSS_OF_LIFE:
            setInitialLossOfLife( ( Float ) newValue );
            return;
        case CimPackage.ASSET__LOT_NUMBER:
            setLotNumber( ( String ) newValue );
            return;
        case CimPackage.ASSET__PURCHASE_PRICE:
            setPurchasePrice( ( BigDecimal ) newValue );
            return;
        case CimPackage.ASSET__SERIAL_NUMBER:
            setSerialNumber( ( String ) newValue );
            return;
        case CimPackage.ASSET__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.ASSET__UTC_NUMBER:
            setUtcNumber( ( String ) newValue );
            return;
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            setAcceptanceTest( ( AcceptanceTest ) newValue );
            return;
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            setElectronicAddress( ( ElectronicAddress ) newValue );
            return;
        case CimPackage.ASSET__LIFECYCLE:
            setLifecycle( ( LifecycleDate ) newValue );
            return;
        case CimPackage.ASSET__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.ASSET__PROCEDURES:
            getProcedures().clear();
            getProcedures().addAll( ( Collection< ? extends Procedure > ) newValue );
            return;
        case CimPackage.ASSET__WORK_TASKS:
            getWorkTasks().clear();
            getWorkTasks().addAll( ( Collection< ? extends WorkTask > ) newValue );
            return;
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            getPowerSystemResources().clear();
            getPowerSystemResources().addAll( ( Collection< ? extends PowerSystemResource > ) newValue );
            return;
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            getActivityRecords().clear();
            getActivityRecords().addAll( ( Collection< ? extends ActivityRecord > ) newValue );
            return;
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            getConfigurationEvents().clear();
            getConfigurationEvents().addAll( ( Collection< ? extends ConfigurationEvent > ) newValue );
            return;
        case CimPackage.ASSET__OPERATION_TAGS:
            getOperationTags().clear();
            getOperationTags().addAll( ( Collection< ? extends OperationTag > ) newValue );
            return;
        case CimPackage.ASSET__ASSET_CONTAINER:
            setAssetContainer( ( AssetContainer ) newValue );
            return;
        case CimPackage.ASSET__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Measurement > ) newValue );
            return;
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            getScheduledEvents().clear();
            getScheduledEvents().addAll( ( Collection< ? extends ScheduledEvent > ) newValue );
            return;
        case CimPackage.ASSET__ORGANISATION_ROLES:
            getOrganisationRoles().clear();
            getOrganisationRoles().addAll( ( Collection< ? extends AssetOrganisationRole > ) newValue );
            return;
        case CimPackage.ASSET__LOCATION:
            setLocation( ( Location ) newValue );
            return;
        case CimPackage.ASSET__OWNERSHIPS:
            getOwnerships().clear();
            getOwnerships().addAll( ( Collection< ? extends Ownership > ) newValue );
            return;
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            getReplacementWorkTasks().clear();
            getReplacementWorkTasks().addAll( ( Collection< ? extends WorkTask > ) newValue );
            return;
        case CimPackage.ASSET__ASSET_INFO:
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
        case CimPackage.ASSET__CRITICAL:
            unsetCritical();
            return;
        case CimPackage.ASSET__INITIAL_CONDITION:
            unsetInitialCondition();
            return;
        case CimPackage.ASSET__INITIAL_LOSS_OF_LIFE:
            unsetInitialLossOfLife();
            return;
        case CimPackage.ASSET__LOT_NUMBER:
            unsetLotNumber();
            return;
        case CimPackage.ASSET__PURCHASE_PRICE:
            unsetPurchasePrice();
            return;
        case CimPackage.ASSET__SERIAL_NUMBER:
            unsetSerialNumber();
            return;
        case CimPackage.ASSET__TYPE:
            unsetType();
            return;
        case CimPackage.ASSET__UTC_NUMBER:
            unsetUtcNumber();
            return;
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            unsetAcceptanceTest();
            return;
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            unsetElectronicAddress();
            return;
        case CimPackage.ASSET__LIFECYCLE:
            unsetLifecycle();
            return;
        case CimPackage.ASSET__STATUS:
            unsetStatus();
            return;
        case CimPackage.ASSET__PROCEDURES:
            unsetProcedures();
            return;
        case CimPackage.ASSET__WORK_TASKS:
            unsetWorkTasks();
            return;
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            unsetPowerSystemResources();
            return;
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            unsetActivityRecords();
            return;
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            unsetConfigurationEvents();
            return;
        case CimPackage.ASSET__OPERATION_TAGS:
            unsetOperationTags();
            return;
        case CimPackage.ASSET__ASSET_CONTAINER:
            unsetAssetContainer();
            return;
        case CimPackage.ASSET__MEASUREMENTS:
            unsetMeasurements();
            return;
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            unsetScheduledEvents();
            return;
        case CimPackage.ASSET__ORGANISATION_ROLES:
            unsetOrganisationRoles();
            return;
        case CimPackage.ASSET__LOCATION:
            unsetLocation();
            return;
        case CimPackage.ASSET__OWNERSHIPS:
            unsetOwnerships();
            return;
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            unsetReplacementWorkTasks();
            return;
        case CimPackage.ASSET__ASSET_INFO:
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
        case CimPackage.ASSET__CRITICAL:
            return isSetCritical();
        case CimPackage.ASSET__INITIAL_CONDITION:
            return isSetInitialCondition();
        case CimPackage.ASSET__INITIAL_LOSS_OF_LIFE:
            return isSetInitialLossOfLife();
        case CimPackage.ASSET__LOT_NUMBER:
            return isSetLotNumber();
        case CimPackage.ASSET__PURCHASE_PRICE:
            return isSetPurchasePrice();
        case CimPackage.ASSET__SERIAL_NUMBER:
            return isSetSerialNumber();
        case CimPackage.ASSET__TYPE:
            return isSetType();
        case CimPackage.ASSET__UTC_NUMBER:
            return isSetUtcNumber();
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            return isSetAcceptanceTest();
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            return isSetElectronicAddress();
        case CimPackage.ASSET__LIFECYCLE:
            return isSetLifecycle();
        case CimPackage.ASSET__STATUS:
            return isSetStatus();
        case CimPackage.ASSET__PROCEDURES:
            return isSetProcedures();
        case CimPackage.ASSET__WORK_TASKS:
            return isSetWorkTasks();
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return isSetPowerSystemResources();
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return isSetActivityRecords();
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return isSetConfigurationEvents();
        case CimPackage.ASSET__OPERATION_TAGS:
            return isSetOperationTags();
        case CimPackage.ASSET__ASSET_CONTAINER:
            return isSetAssetContainer();
        case CimPackage.ASSET__MEASUREMENTS:
            return isSetMeasurements();
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return isSetScheduledEvents();
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return isSetOrganisationRoles();
        case CimPackage.ASSET__LOCATION:
            return isSetLocation();
        case CimPackage.ASSET__OWNERSHIPS:
            return isSetOwnerships();
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return isSetReplacementWorkTasks();
        case CimPackage.ASSET__ASSET_INFO:
            return isSetAssetInfo();
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
        result.append( " (critical: " );
        if( criticalESet )
            result.append( critical );
        else
            result.append( "<unset>" );
        result.append( ", initialCondition: " );
        if( initialConditionESet )
            result.append( initialCondition );
        else
            result.append( "<unset>" );
        result.append( ", initialLossOfLife: " );
        if( initialLossOfLifeESet )
            result.append( initialLossOfLife );
        else
            result.append( "<unset>" );
        result.append( ", lotNumber: " );
        if( lotNumberESet )
            result.append( lotNumber );
        else
            result.append( "<unset>" );
        result.append( ", purchasePrice: " );
        if( purchasePriceESet )
            result.append( purchasePrice );
        else
            result.append( "<unset>" );
        result.append( ", serialNumber: " );
        if( serialNumberESet )
            result.append( serialNumber );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ", utcNumber: " );
        if( utcNumberESet )
            result.append( utcNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetImpl
