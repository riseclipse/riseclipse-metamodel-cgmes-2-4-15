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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getAsset <em>Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getTagAction <em>Tag Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationTag()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface OperationTag extends Document {
    /**
     * Returns the value of the '<em><b>Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset#getOperationTags <em>Operation Tags</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #setAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationTag_Asset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Asset#getOperationTags
     * @model opposite="OperationTags" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='OperationTag.Asset' kind='element'"
     * @generated
     */
    Asset getAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #getAsset()
     * @generated
     */
    void setAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    void unsetAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getAsset <em>Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset</em>' reference is set.
     * @see #unsetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    boolean isSetAsset();

    /**
     * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PowerSystemResource#getOperationTags <em>Operation Tags</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationTag_PowerSystemResource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PowerSystemResource#getOperationTags
     * @model opposite="OperationTags" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='OperationTag.PowerSystemResource' kind='element'"
     * @generated
     */
    PowerSystemResource getPowerSystemResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @generated
     */
    void setPowerSystemResource( PowerSystemResource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    void unsetPowerSystemResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getPowerSystemResource <em>Power System Resource</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Resource</em>' reference is set.
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    boolean isSetPowerSystemResource();

    /**
     * Returns the value of the '<em><b>Tag Action</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TagAction#getOperationTag <em>Operation Tag</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tag Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tag Action</em>' reference.
     * @see #isSetTagAction()
     * @see #unsetTagAction()
     * @see #setTagAction(TagAction)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationTag_TagAction()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TagAction#getOperationTag
     * @model opposite="OperationTag" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='OperationTag.TagAction' kind='element'"
     * @generated
     */
    TagAction getTagAction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getTagAction <em>Tag Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tag Action</em>' reference.
     * @see #isSetTagAction()
     * @see #unsetTagAction()
     * @see #getTagAction()
     * @generated
     */
    void setTagAction( TagAction value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getTagAction <em>Tag Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTagAction()
     * @see #getTagAction()
     * @see #setTagAction(TagAction)
     * @generated
     */
    void unsetTagAction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationTag#getTagAction <em>Tag Action</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tag Action</em>' reference is set.
     * @see #unsetTagAction()
     * @see #getTagAction()
     * @see #setTagAction(TagAction)
     * @generated
     */
    boolean isSetTagAction();

} // OperationTag
