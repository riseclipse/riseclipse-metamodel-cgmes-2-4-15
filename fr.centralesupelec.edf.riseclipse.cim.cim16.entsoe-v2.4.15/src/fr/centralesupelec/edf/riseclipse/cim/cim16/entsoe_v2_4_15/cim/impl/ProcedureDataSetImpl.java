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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeasurementValue;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Procedure;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProcedureDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UserAttribute;

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
 * An implementation of the model object '<em><b>Procedure Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProcedureDataSetImpl#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProcedureDataSetImpl#getMeasurementValues <em>Measurement Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProcedureDataSetImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.ProcedureDataSetImpl#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureDataSetImpl extends DocumentImpl implements ProcedureDataSet {
    /**
     * The default value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date COMPLETED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletedDateTime()
     * @generated
     * @ordered
     */
    protected Date completedDateTime = COMPLETED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Completed Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean completedDateTimeESet;

    /**
     * The cached value of the '{@link #getMeasurementValues() <em>Measurement Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValues()
     * @generated
     * @ordered
     */
    protected EList< MeasurementValue > measurementValues;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList< UserAttribute > properties;

    /**
     * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedure()
     * @generated
     * @ordered
     */
    protected Procedure procedure;

    /**
     * This is true if the Procedure reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean procedureESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcedureDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProcedureDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCompletedDateTime( Date newCompletedDateTime ) {
        Date oldCompletedDateTime = completedDateTime;
        completedDateTime = newCompletedDateTime;
        boolean oldCompletedDateTimeESet = completedDateTimeESet;
        completedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME,
                    oldCompletedDateTime, completedDateTime, !oldCompletedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCompletedDateTime() {
        Date oldCompletedDateTime = completedDateTime;
        boolean oldCompletedDateTimeESet = completedDateTimeESet;
        completedDateTime = COMPLETED_DATE_TIME_EDEFAULT;
        completedDateTimeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME,
                        oldCompletedDateTime, COMPLETED_DATE_TIME_EDEFAULT, oldCompletedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCompletedDateTime() {
        return completedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UserAttribute > getProperties() {
        if( properties == null ) {
            properties = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< UserAttribute >(
                    UserAttribute.class, this, CimPackage.PROCEDURE_DATA_SET__PROPERTIES,
                    CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS );
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProperties() {
        if( properties != null ) ( ( InternalEList.Unsettable< ? > ) properties ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProperties() {
        return properties != null && ( ( InternalEList.Unsettable< ? > ) properties ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Procedure getProcedure() {
        return procedure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcedure( Procedure newProcedure, NotificationChain msgs ) {
        Procedure oldProcedure = procedure;
        procedure = newProcedure;
        boolean oldProcedureESet = procedureESet;
        procedureESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, oldProcedure, newProcedure, !oldProcedureESet );
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
    public void setProcedure( Procedure newProcedure ) {
        if( newProcedure != procedure ) {
            NotificationChain msgs = null;
            if( procedure != null ) msgs = ( ( InternalEObject ) procedure ).eInverseRemove( this,
                    CimPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs );
            if( newProcedure != null ) msgs = ( ( InternalEObject ) newProcedure ).eInverseAdd( this,
                    CimPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs );
            msgs = basicSetProcedure( newProcedure, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProcedureESet = procedureESet;
            procedureESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, newProcedure, newProcedure, !oldProcedureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProcedure( NotificationChain msgs ) {
        Procedure oldProcedure = procedure;
        procedure = null;
        boolean oldProcedureESet = procedureESet;
        procedureESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, oldProcedure, null, oldProcedureESet );
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
    public void unsetProcedure() {
        if( procedure != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) procedure ).eInverseRemove( this, CimPackage.PROCEDURE__PROCEDURE_DATA_SETS,
                    Procedure.class, msgs );
            msgs = basicUnsetProcedure( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProcedureESet = procedureESet;
            procedureESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROCEDURE_DATA_SET__PROCEDURE, null, null, oldProcedureESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedure() {
        return procedureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeasurementValue > getMeasurementValues() {
        if( measurementValues == null ) {
            measurementValues = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< MeasurementValue >(
                    MeasurementValue.class, this, CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES,
                    CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS );
        }
        return measurementValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurementValues() {
        if( measurementValues != null ) ( ( InternalEList.Unsettable< ? > ) measurementValues ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValues() {
        return measurementValues != null && ( ( InternalEList.Unsettable< ? > ) measurementValues ).isSet();
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
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurementValues() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProperties() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            if( procedure != null ) msgs = ( ( InternalEObject ) procedure ).eInverseRemove( this,
                    CimPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs );
            return basicSetProcedure( ( Procedure ) otherEnd, msgs );
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
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
            return ( ( InternalEList< ? > ) getMeasurementValues() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return ( ( InternalEList< ? > ) getProperties() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            return basicUnsetProcedure( msgs );
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            return getCompletedDateTime();
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
            return getMeasurementValues();
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return getProperties();
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            return getProcedure();
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            setCompletedDateTime( ( Date ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
            getMeasurementValues().clear();
            getMeasurementValues().addAll( ( Collection< ? extends MeasurementValue > ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            getProperties().clear();
            getProperties().addAll( ( Collection< ? extends UserAttribute > ) newValue );
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            setProcedure( ( Procedure ) newValue );
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            unsetCompletedDateTime();
            return;
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
            unsetMeasurementValues();
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            unsetProperties();
            return;
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            unsetProcedure();
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
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
            return isSetCompletedDateTime();
        case CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
            return isSetMeasurementValues();
        case CimPackage.PROCEDURE_DATA_SET__PROPERTIES:
            return isSetProperties();
        case CimPackage.PROCEDURE_DATA_SET__PROCEDURE:
            return isSetProcedure();
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
        result.append( " (completedDateTime: " );
        if( completedDateTimeESet )
            result.append( completedDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProcedureDataSetImpl
