/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.GenericAction#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getGenericAction()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface GenericAction extends SwitchingStep {
    /**
     * Returns the value of the '<em><b>Switching Step Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingStepGroup#getGenericActions <em>Generic Actions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Step Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Step Group</em>' reference.
     * @see #isSetSwitchingStepGroup()
     * @see #unsetSwitchingStepGroup()
     * @see #setSwitchingStepGroup(SwitchingStepGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getGenericAction_SwitchingStepGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SwitchingStepGroup#getGenericActions
     * @model opposite="GenericActions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='GenericAction.SwitchingStepGroup' kind='element'"
     * @generated
     */
    SwitchingStepGroup getSwitchingStepGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.GenericAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switching Step Group</em>' reference.
     * @see #isSetSwitchingStepGroup()
     * @see #unsetSwitchingStepGroup()
     * @see #getSwitchingStepGroup()
     * @generated
     */
    void setSwitchingStepGroup( SwitchingStepGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.GenericAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingStepGroup()
     * @see #getSwitchingStepGroup()
     * @see #setSwitchingStepGroup(SwitchingStepGroup)
     * @generated
     */
    void unsetSwitchingStepGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.GenericAction#getSwitchingStepGroup <em>Switching Step Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Step Group</em>' reference is set.
     * @see #unsetSwitchingStepGroup()
     * @see #getSwitchingStepGroup()
     * @see #setSwitchingStepGroup(SwitchingStepGroup)
     * @generated
     */
    boolean isSetSwitchingStepGroup();

} // GenericAction
