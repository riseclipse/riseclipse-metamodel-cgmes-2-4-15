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
 * A representation of the model object '<em><b>Energy Scheduling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySchedulingType#getEnergySource <em>Energy Source</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getEnergySchedulingType()
 * @model extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1'"
 * @generated
 */
public interface EnergySchedulingType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Energy Source</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySource#getEnergySchedulingType <em>Energy Scheduling Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Source</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Source</em>' reference list.
     * @see #isSetEnergySource()
     * @see #unsetEnergySource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getEnergySchedulingType_EnergySource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySource#getEnergySchedulingType
     * @model opposite="EnergySchedulingType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='EnergySchedulingType.EnergySource' kind='element'"
     * @generated
     */
    EList< EnergySource > getEnergySource();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySchedulingType#getEnergySource <em>Energy Source</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergySource()
     * @see #getEnergySource()
     * @generated
     */
    void unsetEnergySource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EnergySchedulingType#getEnergySource <em>Energy Source</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Source</em>' reference list is set.
     * @see #unsetEnergySource()
     * @see #getEnergySource()
     * @generated
     */
    boolean isSetEnergySource();

} // EnergySchedulingType
