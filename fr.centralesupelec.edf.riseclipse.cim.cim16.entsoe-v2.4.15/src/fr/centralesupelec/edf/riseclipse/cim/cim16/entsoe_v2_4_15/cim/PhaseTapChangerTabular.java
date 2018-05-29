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
 * A representation of the model object '<em><b>Phase Tap Changer Tabular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerTabular#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPhaseTapChangerTabular()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface PhaseTapChangerTabular extends PhaseTapChanger {
    /**
     * Returns the value of the '<em><b>Phase Tap Changer Table</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerTable#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Tap Changer Table</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Tap Changer Table</em>' reference.
     * @see #isSetPhaseTapChangerTable()
     * @see #unsetPhaseTapChangerTable()
     * @see #setPhaseTapChangerTable(PhaseTapChangerTable)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPhaseTapChangerTabular_PhaseTapChangerTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerTable#getPhaseTapChangerTabular
     * @model opposite="PhaseTapChangerTabular" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PhaseTapChangerTabular.PhaseTapChangerTable' kind='element'"
     * @generated
     */
    PhaseTapChangerTable getPhaseTapChangerTable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerTabular#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Tap Changer Table</em>' reference.
     * @see #isSetPhaseTapChangerTable()
     * @see #unsetPhaseTapChangerTable()
     * @see #getPhaseTapChangerTable()
     * @generated
     */
    void setPhaseTapChangerTable( PhaseTapChangerTable value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerTabular#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseTapChangerTable()
     * @see #getPhaseTapChangerTable()
     * @see #setPhaseTapChangerTable(PhaseTapChangerTable)
     * @generated
     */
    void unsetPhaseTapChangerTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PhaseTapChangerTabular#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Tap Changer Table</em>' reference is set.
     * @see #unsetPhaseTapChangerTable()
     * @see #getPhaseTapChangerTable()
     * @see #setPhaseTapChangerTable(PhaseTapChangerTable)
     * @generated
     */
    boolean isSetPhaseTapChangerTable();

} // PhaseTapChangerTabular
