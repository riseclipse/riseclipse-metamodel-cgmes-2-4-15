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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Length Line Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireSpacingInfo <em>Wire Spacing Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireInfos <em>Wire Infos</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPerLengthLineParameter()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface PerLengthLineParameter extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wire Infos</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireInfo}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireInfo#getPerLengthParameters <em>Per Length Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Infos</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Infos</em>' reference list.
     * @see #isSetWireInfos()
     * @see #unsetWireInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPerLengthLineParameter_WireInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireInfo#getPerLengthParameters
     * @model opposite="PerLengthParameters" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PerLengthLineParameter.WireInfos' kind='element'"
     * @generated
     */
    EList< WireInfo > getWireInfos();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireInfos <em>Wire Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireInfos()
     * @see #getWireInfos()
     * @generated
     */
    void unsetWireInfos();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireInfos <em>Wire Infos</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Infos</em>' reference list is set.
     * @see #unsetWireInfos()
     * @see #getWireInfos()
     * @generated
     */
    boolean isSetWireInfos();

    /**
     * Returns the value of the '<em><b>Wire Spacing Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPerLengthParameters <em>Per Length Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Spacing Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Spacing Info</em>' reference.
     * @see #isSetWireSpacingInfo()
     * @see #unsetWireSpacingInfo()
     * @see #setWireSpacingInfo(WireSpacingInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPerLengthLineParameter_WireSpacingInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WireSpacingInfo#getPerLengthParameters
     * @model opposite="PerLengthParameters" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PerLengthLineParameter.WireSpacingInfo' kind='element'"
     * @generated
     */
    WireSpacingInfo getWireSpacingInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireSpacingInfo <em>Wire Spacing Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Spacing Info</em>' reference.
     * @see #isSetWireSpacingInfo()
     * @see #unsetWireSpacingInfo()
     * @see #getWireSpacingInfo()
     * @generated
     */
    void setWireSpacingInfo( WireSpacingInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireSpacingInfo <em>Wire Spacing Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireSpacingInfo()
     * @see #getWireSpacingInfo()
     * @see #setWireSpacingInfo(WireSpacingInfo)
     * @generated
     */
    void unsetWireSpacingInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PerLengthLineParameter#getWireSpacingInfo <em>Wire Spacing Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Spacing Info</em>' reference is set.
     * @see #unsetWireSpacingInfo()
     * @see #getWireSpacingInfo()
     * @see #setWireSpacingInfo(WireSpacingInfo)
     * @generated
     */
    boolean isSetWireSpacingInfo();

} // PerLengthLineParameter
