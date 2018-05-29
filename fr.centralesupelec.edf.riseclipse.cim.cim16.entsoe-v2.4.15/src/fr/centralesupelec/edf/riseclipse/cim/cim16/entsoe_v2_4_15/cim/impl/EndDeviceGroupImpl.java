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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DemandResponseProgram;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EndDeviceControl;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EndDeviceGroup;

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
 * An implementation of the model object '<em><b>End Device Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EndDeviceGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EndDeviceGroupImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EndDeviceGroupImpl#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.EndDeviceGroupImpl#getDemandResponsePrograms <em>Demand Response Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceGroupImpl extends IdentifiedObjectImpl implements EndDeviceGroup {
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
     * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceControls()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceControl > endDeviceControls;

    /**
     * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevices()
     * @generated
     * @ordered
     */
    protected EList< EndDevice > endDevices;

    /**
     * The cached value of the '{@link #getDemandResponsePrograms() <em>Demand Response Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDemandResponsePrograms()
     * @generated
     * @ordered
     */
    protected EList< DemandResponseProgram > demandResponsePrograms;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceGroup();
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_GROUP__TYPE, oldType, type, !oldTypeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_GROUP__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
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
    public EList< EndDeviceControl > getEndDeviceControls() {
        if( endDeviceControls == null ) {
            endDeviceControls = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceControl >(
                    EndDeviceControl.class, this, CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS );
        }
        return endDeviceControls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceControls() {
        if( endDeviceControls != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceControls() {
        return endDeviceControls != null && ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDevice > getEndDevices() {
        if( endDevices == null ) {
            endDevices = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDevice >( EndDevice.class,
                    this, CimPackage.END_DEVICE_GROUP__END_DEVICES, CimPackage.END_DEVICE__END_DEVICE_GROUPS );
        }
        return endDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDevices() {
        if( endDevices != null ) ( ( InternalEList.Unsettable< ? > ) endDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevices() {
        return endDevices != null && ( ( InternalEList.Unsettable< ? > ) endDevices ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DemandResponseProgram > getDemandResponsePrograms() {
        if( demandResponsePrograms == null ) {
            demandResponsePrograms = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< DemandResponseProgram >(
                    DemandResponseProgram.class, this, CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS );
        }
        return demandResponsePrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDemandResponsePrograms() {
        if( demandResponsePrograms != null ) ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDemandResponsePrograms() {
        return demandResponsePrograms != null && ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).isSet();
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
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceControls() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDevices() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDemandResponsePrograms() )
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
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return ( ( InternalEList< ? > ) getEndDeviceControls() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return ( ( InternalEList< ? > ) getEndDevices() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< ? > ) getDemandResponsePrograms() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            return getType();
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return getEndDeviceControls();
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return getEndDevices();
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return getDemandResponsePrograms();
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            getEndDeviceControls().clear();
            getEndDeviceControls().addAll( ( Collection< ? extends EndDeviceControl > ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            getEndDevices().clear();
            getEndDevices().addAll( ( Collection< ? extends EndDevice > ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            getDemandResponsePrograms().clear();
            getDemandResponsePrograms().addAll( ( Collection< ? extends DemandResponseProgram > ) newValue );
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            unsetType();
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            unsetEndDeviceControls();
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            unsetEndDevices();
            return;
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            unsetDemandResponsePrograms();
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            return isSetType();
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return isSetEndDeviceControls();
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return isSetEndDevices();
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return isSetDemandResponsePrograms();
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
        result.append( " (type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceGroupImpl
