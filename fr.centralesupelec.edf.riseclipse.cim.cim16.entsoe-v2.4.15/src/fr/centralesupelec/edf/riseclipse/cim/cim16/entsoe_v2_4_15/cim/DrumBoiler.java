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
 * A representation of the model object '<em><b>Drum Boiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getDrumBoiler()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface DrumBoiler extends FossilSteamSupply {
    /**
     * Returns the value of the '<em><b>Drum Boiler Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Drum Boiler Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Drum Boiler Rating</em>' attribute.
     * @see #isSetDrumBoilerRating()
     * @see #unsetDrumBoilerRating()
     * @see #setDrumBoilerRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getDrumBoiler_DrumBoilerRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='DrumBoiler.drumBoilerRating' kind='element'"
     * @generated
     */
    Float getDrumBoilerRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Drum Boiler Rating</em>' attribute.
     * @see #isSetDrumBoilerRating()
     * @see #unsetDrumBoilerRating()
     * @see #getDrumBoilerRating()
     * @generated
     */
    void setDrumBoilerRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrumBoilerRating()
     * @see #getDrumBoilerRating()
     * @see #setDrumBoilerRating(Float)
     * @generated
     */
    void unsetDrumBoilerRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Drum Boiler Rating</em>' attribute is set.
     * @see #unsetDrumBoilerRating()
     * @see #getDrumBoilerRating()
     * @see #setDrumBoilerRating(Float)
     * @generated
     */
    boolean isSetDrumBoilerRating();

} // DrumBoiler
