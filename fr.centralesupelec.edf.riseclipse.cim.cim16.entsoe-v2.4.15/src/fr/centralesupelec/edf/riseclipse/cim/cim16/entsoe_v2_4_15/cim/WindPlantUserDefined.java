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
 * A representation of the model object '<em><b>Wind Plant User Defined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantUserDefined#getProprietary <em>Proprietary</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantUserDefined()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindPlantUserDefined extends WindPlantDynamics {
    /**
     * Returns the value of the '<em><b>Proprietary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proprietary</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Proprietary</em>' attribute.
     * @see #isSetProprietary()
     * @see #unsetProprietary()
     * @see #setProprietary(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantUserDefined_Proprietary()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantUserDefined.proprietary' kind='element'"
     * @generated
     */
    Boolean getProprietary();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantUserDefined#getProprietary <em>Proprietary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proprietary</em>' attribute.
     * @see #isSetProprietary()
     * @see #unsetProprietary()
     * @see #getProprietary()
     * @generated
     */
    void setProprietary( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantUserDefined#getProprietary <em>Proprietary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProprietary()
     * @see #getProprietary()
     * @see #setProprietary(Boolean)
     * @generated
     */
    void unsetProprietary();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantUserDefined#getProprietary <em>Proprietary</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Proprietary</em>' attribute is set.
     * @see #unsetProprietary()
     * @see #getProprietary()
     * @see #setProprietary(Boolean)
     * @generated
     */
    boolean isSetProprietary();

    /**
     * Returns the value of the '<em><b>Proprietary Parameter Dynamics</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProprietaryParameterDynamics}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProprietaryParameterDynamics#getWindPlantUserDefined <em>Wind Plant User Defined</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proprietary Parameter Dynamics</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Proprietary Parameter Dynamics</em>' reference list.
     * @see #isSetProprietaryParameterDynamics()
     * @see #unsetProprietaryParameterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantUserDefined_ProprietaryParameterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ProprietaryParameterDynamics#getWindPlantUserDefined
     * @model opposite="WindPlantUserDefined" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantUserDefined.ProprietaryParameterDynamics' kind='element'"
     * @generated
     */
    EList< ProprietaryParameterDynamics > getProprietaryParameterDynamics();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProprietaryParameterDynamics()
     * @see #getProprietaryParameterDynamics()
     * @generated
     */
    void unsetProprietaryParameterDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Proprietary Parameter Dynamics</em>' reference list is set.
     * @see #unsetProprietaryParameterDynamics()
     * @see #getProprietaryParameterDynamics()
     * @generated
     */
    boolean isSetProprietaryParameterDynamics();

} // WindPlantUserDefined