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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Fault;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalUpdatedRating;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OutageSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServicePointOutageSummary;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Switch;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchAction;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingPlan;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Outage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getCancelledDateTime <em>Cancelled Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getActualPeriod <em>Actual Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getEstimatedPeriod <em>Estimated Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getSwitchingPlans <em>Switching Plans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getUpdatedRatings <em>Updated Ratings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getOpenedSwitches <em>Opened Switches</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getOutageSchedule <em>Outage Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.OutageImpl#getPlannedSwitchActions <em>Planned Switch Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageImpl extends DocumentImpl implements Outage {
    /**
     * The default value of the '{@link #getCancelledDateTime() <em>Cancelled Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelledDateTime()
     * @generated
     * @ordered
     */
    protected static final Date CANCELLED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCancelledDateTime() <em>Cancelled Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelledDateTime()
     * @generated
     * @ordered
     */
    protected Date cancelledDateTime = CANCELLED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Cancelled Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelledDateTimeESet;

    /**
     * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCause()
     * @generated
     * @ordered
     */
    protected static final String CAUSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCause()
     * @generated
     * @ordered
     */
    protected String cause = CAUSE_EDEFAULT;

    /**
     * This is true if the Cause attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean causeESet;

    /**
     * The default value of the '{@link #getIsPlanned() <em>Is Planned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPlanned()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_PLANNED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPlanned() <em>Is Planned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPlanned()
     * @generated
     * @ordered
     */
    protected Boolean isPlanned = IS_PLANNED_EDEFAULT;

    /**
     * This is true if the Is Planned attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPlannedESet;

    /**
     * The cached value of the '{@link #getActualPeriod() <em>Actual Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualPeriod()
     * @generated
     * @ordered
     */
    protected DateTimeInterval actualPeriod;

    /**
     * This is true if the Actual Period containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actualPeriodESet;

    /**
     * The cached value of the '{@link #getEstimatedPeriod() <em>Estimated Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedPeriod()
     * @generated
     * @ordered
     */
    protected DateTimeInterval estimatedPeriod;

    /**
     * This is true if the Estimated Period containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean estimatedPeriodESet;

    /**
     * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSummary()
     * @generated
     * @ordered
     */
    protected ServicePointOutageSummary summary;

    /**
     * This is true if the Summary containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean summaryESet;

    /**
     * The cached value of the '{@link #getIncident() <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncident()
     * @generated
     * @ordered
     */
    protected Incident incident;

    /**
     * This is true if the Incident reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean incidentESet;

    /**
     * The cached value of the '{@link #getSwitchingPlans() <em>Switching Plans</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingPlans()
     * @generated
     * @ordered
     */
    protected EList< SwitchingPlan > switchingPlans;

    /**
     * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipments()
     * @generated
     * @ordered
     */
    protected EList< Equipment > equipments;

    /**
     * The cached value of the '{@link #getUpdatedRatings() <em>Updated Ratings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdatedRatings()
     * @generated
     * @ordered
     */
    protected EList< OperationalUpdatedRating > updatedRatings;

    /**
     * The cached value of the '{@link #getOpenedSwitches() <em>Opened Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenedSwitches()
     * @generated
     * @ordered
     */
    protected EList< Switch > openedSwitches;

    /**
     * The cached value of the '{@link #getFaults() <em>Faults</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaults()
     * @generated
     * @ordered
     */
    protected EList< Fault > faults;

    /**
     * The cached value of the '{@link #getUsagePoints() <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoints()
     * @generated
     * @ordered
     */
    protected EList< UsagePoint > usagePoints;

    /**
     * The cached value of the '{@link #getOutageSchedule() <em>Outage Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageSchedule()
     * @generated
     * @ordered
     */
    protected OutageSchedule outageSchedule;

    /**
     * This is true if the Outage Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageScheduleESet;

    /**
     * The cached value of the '{@link #getPlannedSwitchActions() <em>Planned Switch Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlannedSwitchActions()
     * @generated
     * @ordered
     */
    protected EList< SwitchAction > plannedSwitchActions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOutage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCancelledDateTime() {
        return cancelledDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCancelledDateTime( Date newCancelledDateTime ) {
        Date oldCancelledDateTime = cancelledDateTime;
        cancelledDateTime = newCancelledDateTime;
        boolean oldCancelledDateTimeESet = cancelledDateTimeESet;
        cancelledDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__CANCELLED_DATE_TIME,
                    oldCancelledDateTime, cancelledDateTime, !oldCancelledDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCancelledDateTime() {
        Date oldCancelledDateTime = cancelledDateTime;
        boolean oldCancelledDateTimeESet = cancelledDateTimeESet;
        cancelledDateTime = CANCELLED_DATE_TIME_EDEFAULT;
        cancelledDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__CANCELLED_DATE_TIME,
                    oldCancelledDateTime, CANCELLED_DATE_TIME_EDEFAULT, oldCancelledDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCancelledDateTime() {
        return cancelledDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCause() {
        return cause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCause( String newCause ) {
        String oldCause = cause;
        cause = newCause;
        boolean oldCauseESet = causeESet;
        causeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__CAUSE,
                oldCause, cause, !oldCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCause() {
        String oldCause = cause;
        boolean oldCauseESet = causeESet;
        cause = CAUSE_EDEFAULT;
        causeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__CAUSE, oldCause, CAUSE_EDEFAULT, oldCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCause() {
        return causeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPlanned() {
        return isPlanned;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPlanned( Boolean newIsPlanned ) {
        Boolean oldIsPlanned = isPlanned;
        isPlanned = newIsPlanned;
        boolean oldIsPlannedESet = isPlannedESet;
        isPlannedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE__IS_PLANNED, oldIsPlanned, isPlanned, !oldIsPlannedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPlanned() {
        Boolean oldIsPlanned = isPlanned;
        boolean oldIsPlannedESet = isPlannedESet;
        isPlanned = IS_PLANNED_EDEFAULT;
        isPlannedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__IS_PLANNED, oldIsPlanned, IS_PLANNED_EDEFAULT, oldIsPlannedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPlanned() {
        return isPlannedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getActualPeriod() {
        return actualPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActualPeriod( DateTimeInterval newActualPeriod, NotificationChain msgs ) {
        DateTimeInterval oldActualPeriod = actualPeriod;
        actualPeriod = newActualPeriod;
        boolean oldActualPeriodESet = actualPeriodESet;
        actualPeriodESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, oldActualPeriod, newActualPeriod, !oldActualPeriodESet );
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
    public void setActualPeriod( DateTimeInterval newActualPeriod ) {
        if( newActualPeriod != actualPeriod ) {
            NotificationChain msgs = null;
            if( actualPeriod != null ) msgs = ( ( InternalEObject ) actualPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ACTUAL_PERIOD, null, msgs );
            if( newActualPeriod != null ) msgs = ( ( InternalEObject ) newActualPeriod ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ACTUAL_PERIOD, null, msgs );
            msgs = basicSetActualPeriod( newActualPeriod, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActualPeriodESet = actualPeriodESet;
            actualPeriodESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, newActualPeriod, newActualPeriod, !oldActualPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetActualPeriod( NotificationChain msgs ) {
        DateTimeInterval oldActualPeriod = actualPeriod;
        actualPeriod = null;
        boolean oldActualPeriodESet = actualPeriodESet;
        actualPeriodESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, oldActualPeriod, null, oldActualPeriodESet );
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
    public void unsetActualPeriod() {
        if( actualPeriod != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) actualPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ACTUAL_PERIOD, null, msgs );
            msgs = basicUnsetActualPeriod( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActualPeriodESet = actualPeriodESet;
            actualPeriodESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, null, null, oldActualPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActualPeriod() {
        return actualPeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getEstimatedPeriod() {
        return estimatedPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEstimatedPeriod( DateTimeInterval newEstimatedPeriod, NotificationChain msgs ) {
        DateTimeInterval oldEstimatedPeriod = estimatedPeriod;
        estimatedPeriod = newEstimatedPeriod;
        boolean oldEstimatedPeriodESet = estimatedPeriodESet;
        estimatedPeriodESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__ESTIMATED_PERIOD, oldEstimatedPeriod, newEstimatedPeriod,
                    !oldEstimatedPeriodESet );
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
    public void setEstimatedPeriod( DateTimeInterval newEstimatedPeriod ) {
        if( newEstimatedPeriod != estimatedPeriod ) {
            NotificationChain msgs = null;
            if( estimatedPeriod != null ) msgs = ( ( InternalEObject ) estimatedPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ESTIMATED_PERIOD, null, msgs );
            if( newEstimatedPeriod != null ) msgs = ( ( InternalEObject ) newEstimatedPeriod ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ESTIMATED_PERIOD, null, msgs );
            msgs = basicSetEstimatedPeriod( newEstimatedPeriod, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedPeriodESet = estimatedPeriodESet;
            estimatedPeriodESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__ESTIMATED_PERIOD,
                        newEstimatedPeriod, newEstimatedPeriod, !oldEstimatedPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEstimatedPeriod( NotificationChain msgs ) {
        DateTimeInterval oldEstimatedPeriod = estimatedPeriod;
        estimatedPeriod = null;
        boolean oldEstimatedPeriodESet = estimatedPeriodESet;
        estimatedPeriodESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ESTIMATED_PERIOD, oldEstimatedPeriod, null, oldEstimatedPeriodESet );
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
    public void unsetEstimatedPeriod() {
        if( estimatedPeriod != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) estimatedPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ESTIMATED_PERIOD, null, msgs );
            msgs = basicUnsetEstimatedPeriod( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedPeriodESet = estimatedPeriodESet;
            estimatedPeriodESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ESTIMATED_PERIOD, null, null, oldEstimatedPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEstimatedPeriod() {
        return estimatedPeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServicePointOutageSummary getSummary() {
        return summary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSummary( ServicePointOutageSummary newSummary, NotificationChain msgs ) {
        ServicePointOutageSummary oldSummary = summary;
        summary = newSummary;
        boolean oldSummaryESet = summaryESet;
        summaryESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__SUMMARY,
                    oldSummary, newSummary, !oldSummaryESet );
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
    public void setSummary( ServicePointOutageSummary newSummary ) {
        if( newSummary != summary ) {
            NotificationChain msgs = null;
            if( summary != null ) msgs = ( ( InternalEObject ) summary ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__SUMMARY, null, msgs );
            if( newSummary != null ) msgs = ( ( InternalEObject ) newSummary ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__SUMMARY, null, msgs );
            msgs = basicSetSummary( newSummary, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSummaryESet = summaryESet;
            summaryESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__SUMMARY, newSummary, newSummary, !oldSummaryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSummary( NotificationChain msgs ) {
        ServicePointOutageSummary oldSummary = summary;
        summary = null;
        boolean oldSummaryESet = summaryESet;
        summaryESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__SUMMARY, oldSummary, null, oldSummaryESet );
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
    public void unsetSummary() {
        if( summary != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) summary ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__SUMMARY, null, msgs );
            msgs = basicUnsetSummary( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSummaryESet = summaryESet;
            summaryESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__SUMMARY, null, null, oldSummaryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSummary() {
        return summaryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchingPlan > getSwitchingPlans() {
        if( switchingPlans == null ) {
            switchingPlans = new EObjectWithInverseResolvingEList.Unsettable< SwitchingPlan >( SwitchingPlan.class,
                    this, CimPackage.OUTAGE__SWITCHING_PLANS, CimPackage.SWITCHING_PLAN__OUTAGE );
        }
        return switchingPlans;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchingPlans() {
        if( switchingPlans != null ) ( ( InternalEList.Unsettable< ? > ) switchingPlans ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingPlans() {
        return switchingPlans != null && ( ( InternalEList.Unsettable< ? > ) switchingPlans ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalUpdatedRating > getUpdatedRatings() {
        if( updatedRatings == null ) {
            updatedRatings = new EObjectWithInverseResolvingEList.Unsettable< OperationalUpdatedRating >(
                    OperationalUpdatedRating.class, this, CimPackage.OUTAGE__UPDATED_RATINGS,
                    CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE );
        }
        return updatedRatings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpdatedRatings() {
        if( updatedRatings != null ) ( ( InternalEList.Unsettable< ? > ) updatedRatings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpdatedRatings() {
        return updatedRatings != null && ( ( InternalEList.Unsettable< ? > ) updatedRatings ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchAction > getPlannedSwitchActions() {
        if( plannedSwitchActions == null ) {
            plannedSwitchActions = new EObjectWithInverseResolvingEList.Unsettable< SwitchAction >( SwitchAction.class,
                    this, CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS, CimPackage.SWITCH_ACTION__PLANNED_OUTAGE );
        }
        return plannedSwitchActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlannedSwitchActions() {
        if( plannedSwitchActions != null ) ( ( InternalEList.Unsettable< ? > ) plannedSwitchActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlannedSwitchActions() {
        return plannedSwitchActions != null && ( ( InternalEList.Unsettable< ? > ) plannedSwitchActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePoint > getUsagePoints() {
        if( usagePoints == null ) {
            usagePoints = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< UsagePoint >( UsagePoint.class,
                    this, CimPackage.OUTAGE__USAGE_POINTS, CimPackage.USAGE_POINT__OUTAGES );
        }
        return usagePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoints() {
        if( usagePoints != null ) ( ( InternalEList.Unsettable< ? > ) usagePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoints() {
        return usagePoints != null && ( ( InternalEList.Unsettable< ? > ) usagePoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Equipment > getEquipments() {
        if( equipments == null ) {
            equipments = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Equipment >( Equipment.class,
                    this, CimPackage.OUTAGE__EQUIPMENTS, CimPackage.EQUIPMENT__OUTAGES );
        }
        return equipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquipments() {
        if( equipments != null ) ( ( InternalEList.Unsettable< ? > ) equipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipments() {
        return equipments != null && ( ( InternalEList.Unsettable< ? > ) equipments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Incident getIncident() {
        if( incident != null && incident.eIsProxy() ) {
            InternalEObject oldIncident = ( InternalEObject ) incident;
            incident = ( Incident ) eResolveProxy( oldIncident );
            if( incident != oldIncident ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.OUTAGE__INCIDENT, oldIncident, incident ) );
            }
        }
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Incident basicGetIncident() {
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncident( Incident newIncident, NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = newIncident;
        boolean oldIncidentESet = incidentESet;
        incidentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__INCIDENT,
                    oldIncident, newIncident, !oldIncidentESet );
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
    public void setIncident( Incident newIncident ) {
        if( newIncident != incident ) {
            NotificationChain msgs = null;
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__OUTAGE, Incident.class, msgs );
            if( newIncident != null ) msgs = ( ( InternalEObject ) newIncident ).eInverseAdd( this,
                    CimPackage.INCIDENT__OUTAGE, Incident.class, msgs );
            msgs = basicSetIncident( newIncident, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__INCIDENT, newIncident, newIncident, !oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIncident( NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = null;
        boolean oldIncidentESet = incidentESet;
        incidentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__INCIDENT, oldIncident, null, oldIncidentESet );
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
    public void unsetIncident() {
        if( incident != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) incident ).eInverseRemove( this, CimPackage.INCIDENT__OUTAGE, Incident.class,
                    msgs );
            msgs = basicUnsetIncident( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__INCIDENT, null, null, oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncident() {
        return incidentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Fault > getFaults() {
        if( faults == null ) {
            faults = new EObjectWithInverseResolvingEList.Unsettable< Fault >( Fault.class, this,
                    CimPackage.OUTAGE__FAULTS, CimPackage.FAULT__OUTAGE );
        }
        return faults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFaults() {
        if( faults != null ) ( ( InternalEList.Unsettable< ? > ) faults ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFaults() {
        return faults != null && ( ( InternalEList.Unsettable< ? > ) faults ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutageSchedule getOutageSchedule() {
        return outageSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutageSchedule( OutageSchedule newOutageSchedule, NotificationChain msgs ) {
        OutageSchedule oldOutageSchedule = outageSchedule;
        outageSchedule = newOutageSchedule;
        boolean oldOutageScheduleESet = outageScheduleESet;
        outageScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__OUTAGE_SCHEDULE, oldOutageSchedule, newOutageSchedule, !oldOutageScheduleESet );
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
    public void setOutageSchedule( OutageSchedule newOutageSchedule ) {
        if( newOutageSchedule != outageSchedule ) {
            NotificationChain msgs = null;
            if( outageSchedule != null ) msgs = ( ( InternalEObject ) outageSchedule ).eInverseRemove( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            if( newOutageSchedule != null ) msgs = ( ( InternalEObject ) newOutageSchedule ).eInverseAdd( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            msgs = basicSetOutageSchedule( newOutageSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageScheduleESet = outageScheduleESet;
            outageScheduleESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__OUTAGE_SCHEDULE,
                        newOutageSchedule, newOutageSchedule, !oldOutageScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOutageSchedule( NotificationChain msgs ) {
        OutageSchedule oldOutageSchedule = outageSchedule;
        outageSchedule = null;
        boolean oldOutageScheduleESet = outageScheduleESet;
        outageScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__OUTAGE_SCHEDULE, oldOutageSchedule, null, oldOutageScheduleESet );
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
    public void unsetOutageSchedule() {
        if( outageSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) outageSchedule ).eInverseRemove( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            msgs = basicUnsetOutageSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageScheduleESet = outageScheduleESet;
            outageScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__OUTAGE_SCHEDULE, null, null, oldOutageScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutageSchedule() {
        return outageScheduleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Switch > getOpenedSwitches() {
        if( openedSwitches == null ) {
            openedSwitches = new EObjectWithInverseResolvingEList.Unsettable< Switch >( Switch.class, this,
                    CimPackage.OUTAGE__OPENED_SWITCHES, CimPackage.SWITCH__OUTAGE );
        }
        return openedSwitches;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpenedSwitches() {
        if( openedSwitches != null ) ( ( InternalEList.Unsettable< ? > ) openedSwitches ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpenedSwitches() {
        return openedSwitches != null && ( ( InternalEList.Unsettable< ? > ) openedSwitches ).isSet();
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
        case CimPackage.OUTAGE__INCIDENT:
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__OUTAGE, Incident.class, msgs );
            return basicSetIncident( ( Incident ) otherEnd, msgs );
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchingPlans() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OUTAGE__EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquipments() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUpdatedRatings() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOpenedSwitches() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OUTAGE__FAULTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFaults() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            if( outageSchedule != null ) msgs = ( ( InternalEObject ) outageSchedule ).eInverseRemove( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            return basicSetOutageSchedule( ( OutageSchedule ) otherEnd, msgs );
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPlannedSwitchActions() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            return basicUnsetActualPeriod( msgs );
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            return basicUnsetEstimatedPeriod( msgs );
        case CimPackage.OUTAGE__SUMMARY:
            return basicUnsetSummary( msgs );
        case CimPackage.OUTAGE__INCIDENT:
            return basicUnsetIncident( msgs );
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return ( ( InternalEList< ? > ) getSwitchingPlans() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__EQUIPMENTS:
            return ( ( InternalEList< ? > ) getEquipments() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return ( ( InternalEList< ? > ) getUpdatedRatings() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return ( ( InternalEList< ? > ) getOpenedSwitches() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__FAULTS:
            return ( ( InternalEList< ? > ) getFaults() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            return basicUnsetOutageSchedule( msgs );
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return ( ( InternalEList< ? > ) getPlannedSwitchActions() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            return getCancelledDateTime();
        case CimPackage.OUTAGE__CAUSE:
            return getCause();
        case CimPackage.OUTAGE__IS_PLANNED:
            return getIsPlanned();
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            return getActualPeriod();
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            return getEstimatedPeriod();
        case CimPackage.OUTAGE__SUMMARY:
            return getSummary();
        case CimPackage.OUTAGE__INCIDENT:
            if( resolve ) return getIncident();
            return basicGetIncident();
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return getSwitchingPlans();
        case CimPackage.OUTAGE__EQUIPMENTS:
            return getEquipments();
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return getUpdatedRatings();
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return getOpenedSwitches();
        case CimPackage.OUTAGE__FAULTS:
            return getFaults();
        case CimPackage.OUTAGE__USAGE_POINTS:
            return getUsagePoints();
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            return getOutageSchedule();
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return getPlannedSwitchActions();
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            setCancelledDateTime( ( Date ) newValue );
            return;
        case CimPackage.OUTAGE__CAUSE:
            setCause( ( String ) newValue );
            return;
        case CimPackage.OUTAGE__IS_PLANNED:
            setIsPlanned( ( Boolean ) newValue );
            return;
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            setActualPeriod( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            setEstimatedPeriod( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.OUTAGE__SUMMARY:
            setSummary( ( ServicePointOutageSummary ) newValue );
            return;
        case CimPackage.OUTAGE__INCIDENT:
            setIncident( ( Incident ) newValue );
            return;
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            getSwitchingPlans().clear();
            getSwitchingPlans().addAll( ( Collection< ? extends SwitchingPlan > ) newValue );
            return;
        case CimPackage.OUTAGE__EQUIPMENTS:
            getEquipments().clear();
            getEquipments().addAll( ( Collection< ? extends Equipment > ) newValue );
            return;
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            getUpdatedRatings().clear();
            getUpdatedRatings().addAll( ( Collection< ? extends OperationalUpdatedRating > ) newValue );
            return;
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            getOpenedSwitches().clear();
            getOpenedSwitches().addAll( ( Collection< ? extends Switch > ) newValue );
            return;
        case CimPackage.OUTAGE__FAULTS:
            getFaults().clear();
            getFaults().addAll( ( Collection< ? extends Fault > ) newValue );
            return;
        case CimPackage.OUTAGE__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
            return;
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            setOutageSchedule( ( OutageSchedule ) newValue );
            return;
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            getPlannedSwitchActions().clear();
            getPlannedSwitchActions().addAll( ( Collection< ? extends SwitchAction > ) newValue );
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            unsetCancelledDateTime();
            return;
        case CimPackage.OUTAGE__CAUSE:
            unsetCause();
            return;
        case CimPackage.OUTAGE__IS_PLANNED:
            unsetIsPlanned();
            return;
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            unsetActualPeriod();
            return;
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            unsetEstimatedPeriod();
            return;
        case CimPackage.OUTAGE__SUMMARY:
            unsetSummary();
            return;
        case CimPackage.OUTAGE__INCIDENT:
            unsetIncident();
            return;
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            unsetSwitchingPlans();
            return;
        case CimPackage.OUTAGE__EQUIPMENTS:
            unsetEquipments();
            return;
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            unsetUpdatedRatings();
            return;
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            unsetOpenedSwitches();
            return;
        case CimPackage.OUTAGE__FAULTS:
            unsetFaults();
            return;
        case CimPackage.OUTAGE__USAGE_POINTS:
            unsetUsagePoints();
            return;
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            unsetOutageSchedule();
            return;
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            unsetPlannedSwitchActions();
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            return isSetCancelledDateTime();
        case CimPackage.OUTAGE__CAUSE:
            return isSetCause();
        case CimPackage.OUTAGE__IS_PLANNED:
            return isSetIsPlanned();
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            return isSetActualPeriod();
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            return isSetEstimatedPeriod();
        case CimPackage.OUTAGE__SUMMARY:
            return isSetSummary();
        case CimPackage.OUTAGE__INCIDENT:
            return isSetIncident();
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return isSetSwitchingPlans();
        case CimPackage.OUTAGE__EQUIPMENTS:
            return isSetEquipments();
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return isSetUpdatedRatings();
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return isSetOpenedSwitches();
        case CimPackage.OUTAGE__FAULTS:
            return isSetFaults();
        case CimPackage.OUTAGE__USAGE_POINTS:
            return isSetUsagePoints();
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            return isSetOutageSchedule();
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return isSetPlannedSwitchActions();
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
        result.append( " (cancelledDateTime: " );
        if( cancelledDateTimeESet )
            result.append( cancelledDateTime );
        else
            result.append( "<unset>" );
        result.append( ", cause: " );
        if( causeESet )
            result.append( cause );
        else
            result.append( "<unset>" );
        result.append( ", isPlanned: " );
        if( isPlannedESet )
            result.append( isPlanned );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OutageImpl
