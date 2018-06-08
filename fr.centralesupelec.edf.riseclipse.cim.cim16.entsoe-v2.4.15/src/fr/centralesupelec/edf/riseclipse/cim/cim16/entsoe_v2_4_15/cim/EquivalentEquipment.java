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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getEquivalentEquipment()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface EquivalentEquipment extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Equivalent Network</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equivalent Network</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equivalent Network</em>' reference.
     * @see #isSetEquivalentNetwork()
     * @see #unsetEquivalentNetwork()
     * @see #setEquivalentNetwork(EquivalentNetwork)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getEquivalentEquipment_EquivalentNetwork()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EquivalentNetwork#getEquivalentEquipments
     * @model opposite="EquivalentEquipments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='EquivalentEquipment.EquivalentNetwork' kind='element'"
     * @generated
     */
    EquivalentNetwork getEquivalentNetwork();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equivalent Network</em>' reference.
     * @see #isSetEquivalentNetwork()
     * @see #unsetEquivalentNetwork()
     * @see #getEquivalentNetwork()
     * @generated
     */
    void setEquivalentNetwork( EquivalentNetwork value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquivalentNetwork()
     * @see #getEquivalentNetwork()
     * @see #setEquivalentNetwork(EquivalentNetwork)
     * @generated
     */
    void unsetEquivalentNetwork();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equivalent Network</em>' reference is set.
     * @see #unsetEquivalentNetwork()
     * @see #getEquivalentNetwork()
     * @see #setEquivalentNetwork(EquivalentNetwork)
     * @generated
     */
    boolean isSetEquivalentNetwork();

} // EquivalentEquipment