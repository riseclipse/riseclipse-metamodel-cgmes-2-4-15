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
 * A representation of the model object '<em><b>Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getConformLoadSchedule()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface ConformLoadSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Conform Load Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conform Load Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conform Load Group</em>' reference.
     * @see #isSetConformLoadGroup()
     * @see #unsetConformLoadGroup()
     * @see #setConformLoadGroup(ConformLoadGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getConformLoadSchedule_ConformLoadGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConformLoadGroup#getConformLoadSchedules
     * @model opposite="ConformLoadSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ConformLoadSchedule.ConformLoadGroup' kind='element'"
     * @generated
     */
    ConformLoadGroup getConformLoadGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conform Load Group</em>' reference.
     * @see #isSetConformLoadGroup()
     * @see #unsetConformLoadGroup()
     * @see #getConformLoadGroup()
     * @generated
     */
    void setConformLoadGroup( ConformLoadGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConformLoadGroup()
     * @see #getConformLoadGroup()
     * @see #setConformLoadGroup(ConformLoadGroup)
     * @generated
     */
    void unsetConformLoadGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conform Load Group</em>' reference is set.
     * @see #unsetConformLoadGroup()
     * @see #getConformLoadGroup()
     * @see #setConformLoadGroup(ConformLoadGroup)
     * @generated
     */
    boolean isSetConformLoadGroup();

} // ConformLoadSchedule
