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
 * A representation of the model object '<em><b>Non Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getNonConformLoadSchedule()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface NonConformLoadSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Non Conform Load Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Non Conform Load Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Non Conform Load Group</em>' reference.
     * @see #isSetNonConformLoadGroup()
     * @see #unsetNonConformLoadGroup()
     * @see #setNonConformLoadGroup(NonConformLoadGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getNonConformLoadSchedule_NonConformLoadGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonConformLoadGroup#getNonConformLoadSchedules
     * @model opposite="NonConformLoadSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='NonConformLoadSchedule.NonConformLoadGroup' kind='element'"
     * @generated
     */
    NonConformLoadGroup getNonConformLoadGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Non Conform Load Group</em>' reference.
     * @see #isSetNonConformLoadGroup()
     * @see #unsetNonConformLoadGroup()
     * @see #getNonConformLoadGroup()
     * @generated
     */
    void setNonConformLoadGroup( NonConformLoadGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNonConformLoadGroup()
     * @see #getNonConformLoadGroup()
     * @see #setNonConformLoadGroup(NonConformLoadGroup)
     * @generated
     */
    void unsetNonConformLoadGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Non Conform Load Group</em>' reference is set.
     * @see #unsetNonConformLoadGroup()
     * @see #getNonConformLoadGroup()
     * @see #setNonConformLoadGroup(NonConformLoadGroup)
     * @generated
     */
    boolean isSetNonConformLoadGroup();

} // NonConformLoadSchedule
