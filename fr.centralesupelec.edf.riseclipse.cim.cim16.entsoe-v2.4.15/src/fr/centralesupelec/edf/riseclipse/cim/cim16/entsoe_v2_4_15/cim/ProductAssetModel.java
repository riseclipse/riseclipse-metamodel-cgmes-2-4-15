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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getOperationalRestrictions <em>Operational Restrictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface ProductAssetModel extends AssetModel {
    /**
     * Returns the value of the '<em><b>Corporate Standard Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CorporateStandardKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Corporate Standard Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Corporate Standard Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CorporateStandardKind
     * @see #isSetCorporateStandardKind()
     * @see #unsetCorporateStandardKind()
     * @see #setCorporateStandardKind(CorporateStandardKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel_CorporateStandardKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProductAssetModel.corporateStandardKind' kind='element'"
     * @generated
     */
    CorporateStandardKind getCorporateStandardKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Corporate Standard Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CorporateStandardKind
     * @see #isSetCorporateStandardKind()
     * @see #unsetCorporateStandardKind()
     * @see #getCorporateStandardKind()
     * @generated
     */
    void setCorporateStandardKind( CorporateStandardKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCorporateStandardKind()
     * @see #getCorporateStandardKind()
     * @see #setCorporateStandardKind(CorporateStandardKind)
     * @generated
     */
    void unsetCorporateStandardKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Corporate Standard Kind</em>' attribute is set.
     * @see #unsetCorporateStandardKind()
     * @see #getCorporateStandardKind()
     * @see #setCorporateStandardKind(CorporateStandardKind)
     * @generated
     */
    boolean isSetCorporateStandardKind();

    /**
     * Returns the value of the '<em><b>Model Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Number</em>' attribute.
     * @see #isSetModelNumber()
     * @see #unsetModelNumber()
     * @see #setModelNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel_ModelNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProductAssetModel.modelNumber' kind='element'"
     * @generated
     */
    String getModelNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Number</em>' attribute.
     * @see #isSetModelNumber()
     * @see #unsetModelNumber()
     * @see #getModelNumber()
     * @generated
     */
    void setModelNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModelNumber()
     * @see #getModelNumber()
     * @see #setModelNumber(String)
     * @generated
     */
    void unsetModelNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model Number</em>' attribute is set.
     * @see #unsetModelNumber()
     * @see #getModelNumber()
     * @see #setModelNumber(String)
     * @generated
     */
    boolean isSetModelNumber();

    /**
     * Returns the value of the '<em><b>Model Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Version</em>' attribute.
     * @see #isSetModelVersion()
     * @see #unsetModelVersion()
     * @see #setModelVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel_ModelVersion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProductAssetModel.modelVersion' kind='element'"
     * @generated
     */
    String getModelVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Version</em>' attribute.
     * @see #isSetModelVersion()
     * @see #unsetModelVersion()
     * @see #getModelVersion()
     * @generated
     */
    void setModelVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModelVersion()
     * @see #getModelVersion()
     * @see #setModelVersion(String)
     * @generated
     */
    void unsetModelVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model Version</em>' attribute is set.
     * @see #unsetModelVersion()
     * @see #getModelVersion()
     * @see #setModelVersion(String)
     * @generated
     */
    boolean isSetModelVersion();

    /**
     * Returns the value of the '<em><b>Usage Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetModelUsageKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetModelUsageKind
     * @see #isSetUsageKind()
     * @see #unsetUsageKind()
     * @see #setUsageKind(AssetModelUsageKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel_UsageKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProductAssetModel.usageKind' kind='element'"
     * @generated
     */
    AssetModelUsageKind getUsageKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AssetModelUsageKind
     * @see #isSetUsageKind()
     * @see #unsetUsageKind()
     * @see #getUsageKind()
     * @generated
     */
    void setUsageKind( AssetModelUsageKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsageKind()
     * @see #getUsageKind()
     * @see #setUsageKind(AssetModelUsageKind)
     * @generated
     */
    void unsetUsageKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Kind</em>' attribute is set.
     * @see #unsetUsageKind()
     * @see #getUsageKind()
     * @see #setUsageKind(AssetModelUsageKind)
     * @generated
     */
    boolean isSetUsageKind();

    /**
     * Returns the value of the '<em><b>Weight Total</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weight Total</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weight Total</em>' attribute.
     * @see #isSetWeightTotal()
     * @see #unsetWeightTotal()
     * @see #setWeightTotal(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel_WeightTotal()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProductAssetModel.weightTotal' kind='element'"
     * @generated
     */
    Float getWeightTotal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weight Total</em>' attribute.
     * @see #isSetWeightTotal()
     * @see #unsetWeightTotal()
     * @see #getWeightTotal()
     * @generated
     */
    void setWeightTotal( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWeightTotal()
     * @see #getWeightTotal()
     * @see #setWeightTotal(Float)
     * @generated
     */
    void unsetWeightTotal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Weight Total</em>' attribute is set.
     * @see #unsetWeightTotal()
     * @see #getWeightTotal()
     * @see #setWeightTotal(Float)
     * @generated
     */
    boolean isSetWeightTotal();

    /**
     * Returns the value of the '<em><b>Operational Restrictions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalRestriction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalRestriction#getProductAssetModel <em>Product Asset Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Restrictions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Restrictions</em>' reference list.
     * @see #isSetOperationalRestrictions()
     * @see #unsetOperationalRestrictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel_OperationalRestrictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalRestriction#getProductAssetModel
     * @model opposite="ProductAssetModel" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProductAssetModel.OperationalRestrictions' kind='element'"
     * @generated
     */
    EList< OperationalRestriction > getOperationalRestrictions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getOperationalRestrictions <em>Operational Restrictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalRestrictions()
     * @see #getOperationalRestrictions()
     * @generated
     */
    void unsetOperationalRestrictions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getOperationalRestrictions <em>Operational Restrictions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Restrictions</em>' reference list is set.
     * @see #unsetOperationalRestrictions()
     * @see #getOperationalRestrictions()
     * @generated
     */
    boolean isSetOperationalRestrictions();

    /**
     * Returns the value of the '<em><b>Manufacturer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Manufacturer#getProductAssetModels <em>Product Asset Models</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manufacturer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manufacturer</em>' reference.
     * @see #isSetManufacturer()
     * @see #unsetManufacturer()
     * @see #setManufacturer(Manufacturer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getProductAssetModel_Manufacturer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Manufacturer#getProductAssetModels
     * @model opposite="ProductAssetModels" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ProductAssetModel.Manufacturer' kind='element'"
     * @generated
     */
    Manufacturer getManufacturer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manufacturer</em>' reference.
     * @see #isSetManufacturer()
     * @see #unsetManufacturer()
     * @see #getManufacturer()
     * @generated
     */
    void setManufacturer( Manufacturer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetManufacturer()
     * @see #getManufacturer()
     * @see #setManufacturer(Manufacturer)
     * @generated
     */
    void unsetManufacturer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProductAssetModel#getManufacturer <em>Manufacturer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Manufacturer</em>' reference is set.
     * @see #unsetManufacturer()
     * @see #getManufacturer()
     * @see #setManufacturer(Manufacturer)
     * @generated
     */
    boolean isSetManufacturer();

} // ProductAssetModel
