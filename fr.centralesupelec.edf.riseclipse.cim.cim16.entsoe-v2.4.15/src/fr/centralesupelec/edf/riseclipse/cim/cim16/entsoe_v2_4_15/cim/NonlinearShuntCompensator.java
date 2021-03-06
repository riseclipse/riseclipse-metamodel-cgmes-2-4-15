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
 * A representation of the model object '<em><b>Nonlinear Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonlinearShuntCompensator#getNonlinearShuntCompensatorPoints <em>Nonlinear Shunt Compensator Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getNonlinearShuntCompensator()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface NonlinearShuntCompensator extends ShuntCompensator {
    /**
     * Returns the value of the '<em><b>Nonlinear Shunt Compensator Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonlinearShuntCompensatorPoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonlinearShuntCompensatorPoint#getNonlinearShuntCompensator <em>Nonlinear Shunt Compensator</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nonlinear Shunt Compensator Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nonlinear Shunt Compensator Points</em>' reference list.
     * @see #isSetNonlinearShuntCompensatorPoints()
     * @see #unsetNonlinearShuntCompensatorPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getNonlinearShuntCompensator_NonlinearShuntCompensatorPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonlinearShuntCompensatorPoint#getNonlinearShuntCompensator
     * @model opposite="NonlinearShuntCompensator" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='NonlinearShuntCompensator.NonlinearShuntCompensatorPoints' kind='element'"
     * @generated
     */
    EList< NonlinearShuntCompensatorPoint > getNonlinearShuntCompensatorPoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonlinearShuntCompensator#getNonlinearShuntCompensatorPoints <em>Nonlinear Shunt Compensator Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNonlinearShuntCompensatorPoints()
     * @see #getNonlinearShuntCompensatorPoints()
     * @generated
     */
    void unsetNonlinearShuntCompensatorPoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonlinearShuntCompensator#getNonlinearShuntCompensatorPoints <em>Nonlinear Shunt Compensator Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nonlinear Shunt Compensator Points</em>' reference list is set.
     * @see #unsetNonlinearShuntCompensatorPoints()
     * @see #getNonlinearShuntCompensatorPoints()
     * @generated
     */
    boolean isSetNonlinearShuntCompensatorPoints();

} // NonlinearShuntCompensator
