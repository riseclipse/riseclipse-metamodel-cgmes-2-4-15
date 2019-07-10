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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Plant Reactive Control IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwppf <em>Mwppf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwpu <em>Mwpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwppfilt <em>Twppfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpqfilt <em>Twpqfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpufilt <em>Twpufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindPlantReactiveControlIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kiwpx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiwpx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiwpx</em>' attribute.
     * @see #isSetKiwpx()
     * @see #unsetKiwpx()
     * @see #setKiwpx(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Kiwpx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.kiwpx' kind='element'"
     * @generated
     */
    Float getKiwpx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwpx</em>' attribute.
     * @see #isSetKiwpx()
     * @see #unsetKiwpx()
     * @see #getKiwpx()
     * @generated
     */
    void setKiwpx( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwpx()
     * @see #getKiwpx()
     * @see #setKiwpx(Float)
     * @generated
     */
    void unsetKiwpx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwpx</em>' attribute is set.
     * @see #unsetKiwpx()
     * @see #getKiwpx()
     * @see #setKiwpx(Float)
     * @generated
     */
    boolean isSetKiwpx();

    /**
     * Returns the value of the '<em><b>Kpwpx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpwpx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpwpx</em>' attribute.
     * @see #isSetKpwpx()
     * @see #unsetKpwpx()
     * @see #setKpwpx(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Kpwpx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.kpwpx' kind='element'"
     * @generated
     */
    Float getKpwpx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpwpx</em>' attribute.
     * @see #isSetKpwpx()
     * @see #unsetKpwpx()
     * @see #getKpwpx()
     * @generated
     */
    void setKpwpx( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpwpx()
     * @see #getKpwpx()
     * @see #setKpwpx(Float)
     * @generated
     */
    void unsetKpwpx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpwpx</em>' attribute is set.
     * @see #unsetKpwpx()
     * @see #getKpwpx()
     * @see #setKpwpx(Float)
     * @generated
     */
    boolean isSetKpwpx();

    /**
     * Returns the value of the '<em><b>Kwpqu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kwpqu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kwpqu</em>' attribute.
     * @see #isSetKwpqu()
     * @see #unsetKwpqu()
     * @see #setKwpqu(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Kwpqu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.kwpqu' kind='element'"
     * @generated
     */
    Float getKwpqu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kwpqu</em>' attribute.
     * @see #isSetKwpqu()
     * @see #unsetKwpqu()
     * @see #getKwpqu()
     * @generated
     */
    void setKwpqu( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKwpqu()
     * @see #getKwpqu()
     * @see #setKwpqu(Float)
     * @generated
     */
    void unsetKwpqu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kwpqu</em>' attribute is set.
     * @see #unsetKwpqu()
     * @see #getKwpqu()
     * @see #setKwpqu(Float)
     * @generated
     */
    boolean isSetKwpqu();

    /**
     * Returns the value of the '<em><b>Mwppf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mwppf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mwppf</em>' attribute.
     * @see #isSetMwppf()
     * @see #unsetMwppf()
     * @see #setMwppf(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Mwppf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.mwppf' kind='element'"
     * @generated
     */
    Boolean getMwppf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwppf <em>Mwppf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mwppf</em>' attribute.
     * @see #isSetMwppf()
     * @see #unsetMwppf()
     * @see #getMwppf()
     * @generated
     */
    void setMwppf( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwppf <em>Mwppf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwppf()
     * @see #getMwppf()
     * @see #setMwppf(Boolean)
     * @generated
     */
    void unsetMwppf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwppf <em>Mwppf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwppf</em>' attribute is set.
     * @see #unsetMwppf()
     * @see #getMwppf()
     * @see #setMwppf(Boolean)
     * @generated
     */
    boolean isSetMwppf();

    /**
     * Returns the value of the '<em><b>Mwpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mwpu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mwpu</em>' attribute.
     * @see #isSetMwpu()
     * @see #unsetMwpu()
     * @see #setMwpu(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Mwpu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.mwpu' kind='element'"
     * @generated
     */
    Boolean getMwpu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwpu <em>Mwpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mwpu</em>' attribute.
     * @see #isSetMwpu()
     * @see #unsetMwpu()
     * @see #getMwpu()
     * @generated
     */
    void setMwpu( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwpu <em>Mwpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwpu()
     * @see #getMwpu()
     * @see #setMwpu(Boolean)
     * @generated
     */
    void unsetMwpu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getMwpu <em>Mwpu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwpu</em>' attribute is set.
     * @see #unsetMwpu()
     * @see #getMwpu()
     * @see #setMwpu(Boolean)
     * @generated
     */
    boolean isSetMwpu();

    /**
     * Returns the value of the '<em><b>Twppfilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Twppfilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Twppfilt</em>' attribute.
     * @see #isSetTwppfilt()
     * @see #unsetTwppfilt()
     * @see #setTwppfilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Twppfilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.twppfilt' kind='element'"
     * @generated
     */
    Float getTwppfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwppfilt <em>Twppfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twppfilt</em>' attribute.
     * @see #isSetTwppfilt()
     * @see #unsetTwppfilt()
     * @see #getTwppfilt()
     * @generated
     */
    void setTwppfilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwppfilt <em>Twppfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwppfilt()
     * @see #getTwppfilt()
     * @see #setTwppfilt(Float)
     * @generated
     */
    void unsetTwppfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwppfilt <em>Twppfilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twppfilt</em>' attribute is set.
     * @see #unsetTwppfilt()
     * @see #getTwppfilt()
     * @see #setTwppfilt(Float)
     * @generated
     */
    boolean isSetTwppfilt();

    /**
     * Returns the value of the '<em><b>Twpqfilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Twpqfilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Twpqfilt</em>' attribute.
     * @see #isSetTwpqfilt()
     * @see #unsetTwpqfilt()
     * @see #setTwpqfilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Twpqfilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.twpqfilt' kind='element'"
     * @generated
     */
    Float getTwpqfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpqfilt <em>Twpqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twpqfilt</em>' attribute.
     * @see #isSetTwpqfilt()
     * @see #unsetTwpqfilt()
     * @see #getTwpqfilt()
     * @generated
     */
    void setTwpqfilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpqfilt <em>Twpqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwpqfilt()
     * @see #getTwpqfilt()
     * @see #setTwpqfilt(Float)
     * @generated
     */
    void unsetTwpqfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpqfilt <em>Twpqfilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twpqfilt</em>' attribute is set.
     * @see #unsetTwpqfilt()
     * @see #getTwpqfilt()
     * @see #setTwpqfilt(Float)
     * @generated
     */
    boolean isSetTwpqfilt();

    /**
     * Returns the value of the '<em><b>Twpufilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Twpufilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Twpufilt</em>' attribute.
     * @see #isSetTwpufilt()
     * @see #unsetTwpufilt()
     * @see #setTwpufilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Twpufilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.twpufilt' kind='element'"
     * @generated
     */
    Float getTwpufilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpufilt <em>Twpufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twpufilt</em>' attribute.
     * @see #isSetTwpufilt()
     * @see #unsetTwpufilt()
     * @see #getTwpufilt()
     * @generated
     */
    void setTwpufilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpufilt <em>Twpufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwpufilt()
     * @see #getTwpufilt()
     * @see #setTwpufilt(Float)
     * @generated
     */
    void unsetTwpufilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTwpufilt <em>Twpufilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twpufilt</em>' attribute is set.
     * @see #unsetTwpufilt()
     * @see #getTwpufilt()
     * @see #setTwpufilt(Float)
     * @generated
     */
    boolean isSetTwpufilt();

    /**
     * Returns the value of the '<em><b>Txft</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Txft</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Txft</em>' attribute.
     * @see #isSetTxft()
     * @see #unsetTxft()
     * @see #setTxft(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Txft()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.txft' kind='element'"
     * @generated
     */
    Float getTxft();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Txft</em>' attribute.
     * @see #isSetTxft()
     * @see #unsetTxft()
     * @see #getTxft()
     * @generated
     */
    void setTxft( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTxft()
     * @see #getTxft()
     * @see #setTxft(Float)
     * @generated
     */
    void unsetTxft();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Txft</em>' attribute is set.
     * @see #unsetTxft()
     * @see #getTxft()
     * @see #setTxft(Float)
     * @generated
     */
    boolean isSetTxft();

    /**
     * Returns the value of the '<em><b>Txfv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Txfv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Txfv</em>' attribute.
     * @see #isSetTxfv()
     * @see #unsetTxfv()
     * @see #setTxfv(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Txfv()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.txfv' kind='element'"
     * @generated
     */
    Float getTxfv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Txfv</em>' attribute.
     * @see #isSetTxfv()
     * @see #unsetTxfv()
     * @see #getTxfv()
     * @generated
     */
    void setTxfv( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTxfv()
     * @see #getTxfv()
     * @see #setTxfv(Float)
     * @generated
     */
    void unsetTxfv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Txfv</em>' attribute is set.
     * @see #unsetTxfv()
     * @see #getTxfv()
     * @see #setTxfv(Float)
     * @generated
     */
    boolean isSetTxfv();

    /**
     * Returns the value of the '<em><b>Uwpqdip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uwpqdip</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uwpqdip</em>' attribute.
     * @see #isSetUwpqdip()
     * @see #unsetUwpqdip()
     * @see #setUwpqdip(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Uwpqdip()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.uwpqdip' kind='element'"
     * @generated
     */
    Float getUwpqdip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uwpqdip</em>' attribute.
     * @see #isSetUwpqdip()
     * @see #unsetUwpqdip()
     * @see #getUwpqdip()
     * @generated
     */
    void setUwpqdip( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUwpqdip()
     * @see #getUwpqdip()
     * @see #setUwpqdip(Float)
     * @generated
     */
    void unsetUwpqdip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uwpqdip</em>' attribute is set.
     * @see #unsetUwpqdip()
     * @see #getUwpqdip()
     * @see #setUwpqdip(Float)
     * @generated
     */
    boolean isSetUwpqdip();

    /**
     * Returns the value of the '<em><b>Xrefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xrefmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xrefmax</em>' attribute.
     * @see #isSetXrefmax()
     * @see #unsetXrefmax()
     * @see #setXrefmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Xrefmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.xrefmax' kind='element'"
     * @generated
     */
    Float getXrefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xrefmax</em>' attribute.
     * @see #isSetXrefmax()
     * @see #unsetXrefmax()
     * @see #getXrefmax()
     * @generated
     */
    void setXrefmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXrefmax()
     * @see #getXrefmax()
     * @see #setXrefmax(Float)
     * @generated
     */
    void unsetXrefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xrefmax</em>' attribute is set.
     * @see #unsetXrefmax()
     * @see #getXrefmax()
     * @see #setXrefmax(Float)
     * @generated
     */
    boolean isSetXrefmax();

    /**
     * Returns the value of the '<em><b>Xrefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xrefmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xrefmin</em>' attribute.
     * @see #isSetXrefmin()
     * @see #unsetXrefmin()
     * @see #setXrefmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_Xrefmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.xrefmin' kind='element'"
     * @generated
     */
    Float getXrefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xrefmin</em>' attribute.
     * @see #isSetXrefmin()
     * @see #unsetXrefmin()
     * @see #getXrefmin()
     * @generated
     */
    void setXrefmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXrefmin()
     * @see #getXrefmin()
     * @see #setXrefmin(Float)
     * @generated
     */
    void unsetXrefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xrefmin</em>' attribute is set.
     * @see #unsetXrefmin()
     * @see #getXrefmin()
     * @see #setXrefmin(Float)
     * @generated
     */
    boolean isSetXrefmin();

    /**
     * Returns the value of the '<em><b>Wind Plant IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Plant IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Plant IEC</em>' reference.
     * @see #isSetWindPlantIEC()
     * @see #unsetWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantReactiveControlIEC_WindPlantIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantIEC#getWindPlantReactiveControlIEC
     * @model opposite="WindPlantReactiveControlIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantReactiveControlIEC.WindPlantIEC' kind='element'"
     * @generated
     */
    WindPlantIEC getWindPlantIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant IEC</em>' reference.
     * @see #isSetWindPlantIEC()
     * @see #unsetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @generated
     */
    void setWindPlantIEC( WindPlantIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    void unsetWindPlantIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant IEC</em>' reference is set.
     * @see #unsetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    boolean isSetWindPlantIEC();

} // WindPlantReactiveControlIEC
