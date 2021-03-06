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
 * A representation of the model object '<em><b>Prime Mover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPrimeMover()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface PrimeMover extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Prime Mover Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prime Mover Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prime Mover Rating</em>' attribute.
     * @see #isSetPrimeMoverRating()
     * @see #unsetPrimeMoverRating()
     * @see #setPrimeMoverRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPrimeMover_PrimeMoverRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PrimeMover.primeMoverRating' kind='element'"
     * @generated
     */
    Float getPrimeMoverRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prime Mover Rating</em>' attribute.
     * @see #isSetPrimeMoverRating()
     * @see #unsetPrimeMoverRating()
     * @see #getPrimeMoverRating()
     * @generated
     */
    void setPrimeMoverRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrimeMoverRating()
     * @see #getPrimeMoverRating()
     * @see #setPrimeMoverRating(Float)
     * @generated
     */
    void unsetPrimeMoverRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prime Mover Rating</em>' attribute is set.
     * @see #unsetPrimeMoverRating()
     * @see #getPrimeMoverRating()
     * @see #setPrimeMoverRating(Float)
     * @generated
     */
    boolean isSetPrimeMoverRating();

    /**
     * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SynchronousMachine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronous Machines</em>' reference list.
     * @see #isSetSynchronousMachines()
     * @see #unsetSynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPrimeMover_SynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SynchronousMachine#getPrimeMovers
     * @model opposite="PrimeMovers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PrimeMover.SynchronousMachines' kind='element'"
     * @generated
     */
    EList< SynchronousMachine > getSynchronousMachines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachines()
     * @see #getSynchronousMachines()
     * @generated
     */
    void unsetSynchronousMachines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machines</em>' reference list is set.
     * @see #unsetSynchronousMachines()
     * @see #getSynchronousMachines()
     * @generated
     */
    boolean isSetSynchronousMachines();

} // PrimeMover
