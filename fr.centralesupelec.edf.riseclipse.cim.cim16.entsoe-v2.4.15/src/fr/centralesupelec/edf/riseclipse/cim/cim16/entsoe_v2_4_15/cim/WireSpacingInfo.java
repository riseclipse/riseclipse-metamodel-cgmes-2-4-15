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
 * A representation of the model object '<em><b>Wire Spacing Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getIsCable <em>Is Cable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireCount <em>Phase Wire Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireSpacing <em>Phase Wire Spacing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getUsage <em>Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPerLengthParameters <em>Per Length Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getWirePositions <em>Wire Positions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWireSpacingInfo()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WireSpacingInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Is Cable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Cable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Cable</em>' attribute.
     * @see #isSetIsCable()
     * @see #unsetIsCable()
     * @see #setIsCable(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWireSpacingInfo_IsCable()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WireSpacingInfo.isCable' kind='element'"
     * @generated
     */
    Boolean getIsCable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getIsCable <em>Is Cable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Cable</em>' attribute.
     * @see #isSetIsCable()
     * @see #unsetIsCable()
     * @see #getIsCable()
     * @generated
     */
    void setIsCable( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getIsCable <em>Is Cable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsCable()
     * @see #getIsCable()
     * @see #setIsCable(Boolean)
     * @generated
     */
    void unsetIsCable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getIsCable <em>Is Cable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Cable</em>' attribute is set.
     * @see #unsetIsCable()
     * @see #getIsCable()
     * @see #setIsCable(Boolean)
     * @generated
     */
    boolean isSetIsCable();

    /**
     * Returns the value of the '<em><b>Phase Wire Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Wire Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Wire Count</em>' attribute.
     * @see #isSetPhaseWireCount()
     * @see #unsetPhaseWireCount()
     * @see #setPhaseWireCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWireSpacingInfo_PhaseWireCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WireSpacingInfo.phaseWireCount' kind='element'"
     * @generated
     */
    Integer getPhaseWireCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireCount <em>Phase Wire Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Wire Count</em>' attribute.
     * @see #isSetPhaseWireCount()
     * @see #unsetPhaseWireCount()
     * @see #getPhaseWireCount()
     * @generated
     */
    void setPhaseWireCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireCount <em>Phase Wire Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseWireCount()
     * @see #getPhaseWireCount()
     * @see #setPhaseWireCount(Integer)
     * @generated
     */
    void unsetPhaseWireCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireCount <em>Phase Wire Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Wire Count</em>' attribute is set.
     * @see #unsetPhaseWireCount()
     * @see #getPhaseWireCount()
     * @see #setPhaseWireCount(Integer)
     * @generated
     */
    boolean isSetPhaseWireCount();

    /**
     * Returns the value of the '<em><b>Phase Wire Spacing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Wire Spacing</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Wire Spacing</em>' attribute.
     * @see #isSetPhaseWireSpacing()
     * @see #unsetPhaseWireSpacing()
     * @see #setPhaseWireSpacing(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWireSpacingInfo_PhaseWireSpacing()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WireSpacingInfo.phaseWireSpacing' kind='element'"
     * @generated
     */
    Float getPhaseWireSpacing();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireSpacing <em>Phase Wire Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Wire Spacing</em>' attribute.
     * @see #isSetPhaseWireSpacing()
     * @see #unsetPhaseWireSpacing()
     * @see #getPhaseWireSpacing()
     * @generated
     */
    void setPhaseWireSpacing( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireSpacing <em>Phase Wire Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseWireSpacing()
     * @see #getPhaseWireSpacing()
     * @see #setPhaseWireSpacing(Float)
     * @generated
     */
    void unsetPhaseWireSpacing();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPhaseWireSpacing <em>Phase Wire Spacing</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Wire Spacing</em>' attribute is set.
     * @see #unsetPhaseWireSpacing()
     * @see #getPhaseWireSpacing()
     * @see #setPhaseWireSpacing(Float)
     * @generated
     */
    boolean isSetPhaseWireSpacing();

    /**
     * Returns the value of the '<em><b>Usage</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireUsageKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireUsageKind
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #setUsage(WireUsageKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWireSpacingInfo_Usage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WireSpacingInfo.usage' kind='element'"
     * @generated
     */
    WireUsageKind getUsage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireUsageKind
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #getUsage()
     * @generated
     */
    void setUsage( WireUsageKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsage()
     * @see #getUsage()
     * @see #setUsage(WireUsageKind)
     * @generated
     */
    void unsetUsage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getUsage <em>Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage</em>' attribute is set.
     * @see #unsetUsage()
     * @see #getUsage()
     * @see #setUsage(WireUsageKind)
     * @generated
     */
    boolean isSetUsage();

    /**
     * Returns the value of the '<em><b>Wire Positions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WirePosition}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WirePosition#getWireSpacingInfo <em>Wire Spacing Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Positions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Positions</em>' reference list.
     * @see #isSetWirePositions()
     * @see #unsetWirePositions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWireSpacingInfo_WirePositions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WirePosition#getWireSpacingInfo
     * @model opposite="WireSpacingInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WireSpacingInfo.WirePositions' kind='element'"
     * @generated
     */
    EList< WirePosition > getWirePositions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getWirePositions <em>Wire Positions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWirePositions()
     * @see #getWirePositions()
     * @generated
     */
    void unsetWirePositions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getWirePositions <em>Wire Positions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Positions</em>' reference list is set.
     * @see #unsetWirePositions()
     * @see #getWirePositions()
     * @generated
     */
    boolean isSetWirePositions();

    /**
     * Returns the value of the '<em><b>Per Length Parameters</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireSpacingInfo <em>Wire Spacing Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Per Length Parameters</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Per Length Parameters</em>' reference list.
     * @see #isSetPerLengthParameters()
     * @see #unsetPerLengthParameters()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWireSpacingInfo_PerLengthParameters()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireSpacingInfo
     * @model opposite="WireSpacingInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WireSpacingInfo.PerLengthParameters' kind='element'"
     * @generated
     */
    EList< PerLengthLineParameter > getPerLengthParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPerLengthParameters <em>Per Length Parameters</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPerLengthParameters()
     * @see #getPerLengthParameters()
     * @generated
     */
    void unsetPerLengthParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPerLengthParameters <em>Per Length Parameters</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Per Length Parameters</em>' reference list is set.
     * @see #unsetPerLengthParameters()
     * @see #getPerLengthParameters()
     * @generated
     */
    boolean isSetPerLengthParameters();

} // WireSpacingInfo
