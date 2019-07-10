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
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DiagramObject;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.IdentifiedObject;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Name;

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
 * An implementation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getMRID <em>MRID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getNames <em>Names</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getEnergyIdentCodeEic <em>Energy Ident Code Eic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.IdentifiedObjectImpl#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedObjectImpl extends CimObjectWithIDImpl implements IdentifiedObject {
    /**
     * The default value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAliasName()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAliasName()
     * @generated
     * @ordered
     */
    protected String aliasName = ALIAS_NAME_EDEFAULT;

    /**
     * This is true if the Alias Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aliasNameESet;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * This is true if the Description attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descriptionESet;

    /**
     * The default value of the '{@link #getMRID() <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMRID()
     * @generated
     * @ordered
     */
    protected static final String MRID_EDEFAULT = null;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getDiagramObjects() <em>Diagram Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramObjects()
     * @generated
     * @ordered
     */
    protected EList< DiagramObject > diagramObjects;

    /**
     * The cached value of the '{@link #getNames() <em>Names</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNames()
     * @generated
     * @ordered
     */
    protected EList< Name > names;

    /**
     * The default value of the '{@link #getEnergyIdentCodeEic() <em>Energy Ident Code Eic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyIdentCodeEic()
     * @generated
     * @ordered
     */
    protected static final String ENERGY_IDENT_CODE_EIC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyIdentCodeEic() <em>Energy Ident Code Eic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyIdentCodeEic()
     * @generated
     * @ordered
     */
    protected String energyIdentCodeEic = ENERGY_IDENT_CODE_EIC_EDEFAULT;

    /**
     * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortName()
     * @generated
     * @ordered
     */
    protected static final String SHORT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortName()
     * @generated
     * @ordered
     */
    protected String shortName = SHORT_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentifiedObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIdentifiedObject();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAliasName( String newAliasName ) {
        String oldAliasName = aliasName;
        aliasName = newAliasName;
        boolean oldAliasNameESet = aliasNameESet;
        aliasNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME, oldAliasName, aliasName, !oldAliasNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAliasName() {
        String oldAliasName = aliasName;
        boolean oldAliasNameESet = aliasNameESet;
        aliasName = ALIAS_NAME_EDEFAULT;
        aliasNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME, oldAliasName, ALIAS_NAME_EDEFAULT, oldAliasNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAliasName() {
        return aliasNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription( String newDescription ) {
        String oldDescription = description;
        description = newDescription;
        boolean oldDescriptionESet = descriptionESet;
        descriptionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IDENTIFIED_OBJECT__DESCRIPTION, oldDescription, description, !oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescription() {
        String oldDescription = description;
        boolean oldDescriptionESet = descriptionESet;
        description = DESCRIPTION_EDEFAULT;
        descriptionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IDENTIFIED_OBJECT__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescription() {
        return descriptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getMRID() {
        return getID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setMRID( String newMRID ) {
        setID( newMRID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void unsetMRID() {
        unsetID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isSetMRID() {
        return isSetID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IDENTIFIED_OBJECT__NAME, oldName, name, !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IDENTIFIED_OBJECT__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DiagramObject > getDiagramObjects() {
        if( diagramObjects == null ) {
            diagramObjects = new EObjectWithInverseResolvingEList.Unsettable< DiagramObject >( DiagramObject.class,
                    this, CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT );
        }
        return diagramObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiagramObjects() {
        if( diagramObjects != null ) ( ( InternalEList.Unsettable< ? > ) diagramObjects ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramObjects() {
        return diagramObjects != null && ( ( InternalEList.Unsettable< ? > ) diagramObjects ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Name > getNames() {
        if( names == null ) {
            names = new EObjectWithInverseResolvingEList.Unsettable< Name >( Name.class, this,
                    CimPackage.IDENTIFIED_OBJECT__NAMES, CimPackage.NAME__IDENTIFIED_OBJECT );
        }
        return names;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNames() {
        if( names != null ) ( ( InternalEList.Unsettable< ? > ) names ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNames() {
        return names != null && ( ( InternalEList.Unsettable< ? > ) names ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEnergyIdentCodeEic() {
        return energyIdentCodeEic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyIdentCodeEic( String newEnergyIdentCodeEic ) {
        String oldEnergyIdentCodeEic = energyIdentCodeEic;
        energyIdentCodeEic = newEnergyIdentCodeEic;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC, oldEnergyIdentCodeEic, energyIdentCodeEic ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getShortName() {
        return shortName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortName( String newShortName ) {
        String oldShortName = shortName;
        shortName = newShortName;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IDENTIFIED_OBJECT__SHORT_NAME, oldShortName, shortName ) );
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
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiagramObjects() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getNames() ).basicAdd( otherEnd,
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
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return ( ( InternalEList< ? > ) getDiagramObjects() ).basicRemove( otherEnd, msgs );
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return ( ( InternalEList< ? > ) getNames() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            return getAliasName();
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            return getDescription();
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            return getMRID();
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            return getName();
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return getDiagramObjects();
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return getNames();
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            return getEnergyIdentCodeEic();
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            return getShortName();
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            setAliasName( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            setDescription( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            setMRID( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            getDiagramObjects().clear();
            getDiagramObjects().addAll( ( Collection< ? extends DiagramObject > ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            getNames().clear();
            getNames().addAll( ( Collection< ? extends Name > ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            setEnergyIdentCodeEic( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            setShortName( ( String ) newValue );
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            unsetAliasName();
            return;
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            unsetDescription();
            return;
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            unsetMRID();
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            unsetName();
            return;
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            unsetDiagramObjects();
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            unsetNames();
            return;
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            setEnergyIdentCodeEic( ENERGY_IDENT_CODE_EIC_EDEFAULT );
            return;
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            setShortName( SHORT_NAME_EDEFAULT );
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            return isSetAliasName();
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            return isSetDescription();
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            return isSetMRID();
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            return isSetName();
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return isSetDiagramObjects();
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return isSetNames();
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            return ENERGY_IDENT_CODE_EIC_EDEFAULT == null ? energyIdentCodeEic != null
                    : !ENERGY_IDENT_CODE_EIC_EDEFAULT.equals( energyIdentCodeEic );
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals( shortName );
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
        result.append( " (aliasName: " );
        if( aliasNameESet )
            result.append( aliasName );
        else
            result.append( "<unset>" );
        result.append( ", description: " );
        if( descriptionESet )
            result.append( description );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", energyIdentCodeEic: " );
        result.append( energyIdentCodeEic );
        result.append( ", shortName: " );
        result.append( shortName );
        result.append( ')' );
        return result.toString();
    }

} //IdentifiedObjectImpl
