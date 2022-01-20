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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Plant Freq Pcontrol IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwpffilt <em>Twpffilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwppfilt <em>Twppfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindPlantFreqPcontrolIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dprefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dprefmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #setDprefmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dprefmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.dprefmax' kind='element'"
     * @generated
     */
    Float getDprefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @generated
     */
    void setDprefmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Float)
     * @generated
     */
    void unsetDprefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmax</em>' attribute is set.
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Float)
     * @generated
     */
    boolean isSetDprefmax();

    /**
     * Returns the value of the '<em><b>Dprefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dprefmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #setDprefmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dprefmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.dprefmin' kind='element'"
     * @generated
     */
    Float getDprefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @generated
     */
    void setDprefmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Float)
     * @generated
     */
    void unsetDprefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmin</em>' attribute is set.
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Float)
     * @generated
     */
    boolean isSetDprefmin();

    /**
     * Returns the value of the '<em><b>Kiwpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiwpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiwpp</em>' attribute.
     * @see #isSetKiwpp()
     * @see #unsetKiwpp()
     * @see #setKiwpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kiwpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.kiwpp' kind='element'"
     * @generated
     */
    Float getKiwpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwpp</em>' attribute.
     * @see #isSetKiwpp()
     * @see #unsetKiwpp()
     * @see #getKiwpp()
     * @generated
     */
    void setKiwpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwpp()
     * @see #getKiwpp()
     * @see #setKiwpp(Float)
     * @generated
     */
    void unsetKiwpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwpp</em>' attribute is set.
     * @see #unsetKiwpp()
     * @see #getKiwpp()
     * @see #setKiwpp(Float)
     * @generated
     */
    boolean isSetKiwpp();

    /**
     * Returns the value of the '<em><b>Kpwpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpwpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpwpp</em>' attribute.
     * @see #isSetKpwpp()
     * @see #unsetKpwpp()
     * @see #setKpwpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kpwpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.kpwpp' kind='element'"
     * @generated
     */
    Float getKpwpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpwpp</em>' attribute.
     * @see #isSetKpwpp()
     * @see #unsetKpwpp()
     * @see #getKpwpp()
     * @generated
     */
    void setKpwpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpwpp()
     * @see #getKpwpp()
     * @see #setKpwpp(Float)
     * @generated
     */
    void unsetKpwpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpwpp</em>' attribute is set.
     * @see #unsetKpwpp()
     * @see #getKpwpp()
     * @see #setKpwpp(Float)
     * @generated
     */
    boolean isSetKpwpp();

    /**
     * Returns the value of the '<em><b>Prefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefmax</em>' attribute.
     * @see #isSetPrefmax()
     * @see #unsetPrefmax()
     * @see #setPrefmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Prefmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.prefmax' kind='element'"
     * @generated
     */
    Float getPrefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefmax</em>' attribute.
     * @see #isSetPrefmax()
     * @see #unsetPrefmax()
     * @see #getPrefmax()
     * @generated
     */
    void setPrefmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefmax()
     * @see #getPrefmax()
     * @see #setPrefmax(Float)
     * @generated
     */
    void unsetPrefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefmax</em>' attribute is set.
     * @see #unsetPrefmax()
     * @see #getPrefmax()
     * @see #setPrefmax(Float)
     * @generated
     */
    boolean isSetPrefmax();

    /**
     * Returns the value of the '<em><b>Prefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefmin</em>' attribute.
     * @see #isSetPrefmin()
     * @see #unsetPrefmin()
     * @see #setPrefmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Prefmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.prefmin' kind='element'"
     * @generated
     */
    Float getPrefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefmin</em>' attribute.
     * @see #isSetPrefmin()
     * @see #unsetPrefmin()
     * @see #getPrefmin()
     * @generated
     */
    void setPrefmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefmin()
     * @see #getPrefmin()
     * @see #setPrefmin(Float)
     * @generated
     */
    void unsetPrefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefmin</em>' attribute is set.
     * @see #unsetPrefmin()
     * @see #getPrefmin()
     * @see #setPrefmin(Float)
     * @generated
     */
    boolean isSetPrefmin();

    /**
     * Returns the value of the '<em><b>Tpft</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpft</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpft</em>' attribute.
     * @see #isSetTpft()
     * @see #unsetTpft()
     * @see #setTpft(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Tpft()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.tpft' kind='element'"
     * @generated
     */
    Float getTpft();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpft</em>' attribute.
     * @see #isSetTpft()
     * @see #unsetTpft()
     * @see #getTpft()
     * @generated
     */
    void setTpft( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpft()
     * @see #getTpft()
     * @see #setTpft(Float)
     * @generated
     */
    void unsetTpft();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpft</em>' attribute is set.
     * @see #unsetTpft()
     * @see #getTpft()
     * @see #setTpft(Float)
     * @generated
     */
    boolean isSetTpft();

    /**
     * Returns the value of the '<em><b>Tpfv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpfv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpfv</em>' attribute.
     * @see #isSetTpfv()
     * @see #unsetTpfv()
     * @see #setTpfv(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Tpfv()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.tpfv' kind='element'"
     * @generated
     */
    Float getTpfv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfv</em>' attribute.
     * @see #isSetTpfv()
     * @see #unsetTpfv()
     * @see #getTpfv()
     * @generated
     */
    void setTpfv( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfv()
     * @see #getTpfv()
     * @see #setTpfv(Float)
     * @generated
     */
    void unsetTpfv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfv</em>' attribute is set.
     * @see #unsetTpfv()
     * @see #getTpfv()
     * @see #setTpfv(Float)
     * @generated
     */
    boolean isSetTpfv();

    /**
     * Returns the value of the '<em><b>Twpffilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Twpffilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Twpffilt</em>' attribute.
     * @see #isSetTwpffilt()
     * @see #unsetTwpffilt()
     * @see #setTwpffilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Twpffilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.twpffilt' kind='element'"
     * @generated
     */
    Float getTwpffilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwpffilt <em>Twpffilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twpffilt</em>' attribute.
     * @see #isSetTwpffilt()
     * @see #unsetTwpffilt()
     * @see #getTwpffilt()
     * @generated
     */
    void setTwpffilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwpffilt <em>Twpffilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwpffilt()
     * @see #getTwpffilt()
     * @see #setTwpffilt(Float)
     * @generated
     */
    void unsetTwpffilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwpffilt <em>Twpffilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twpffilt</em>' attribute is set.
     * @see #unsetTwpffilt()
     * @see #getTwpffilt()
     * @see #setTwpffilt(Float)
     * @generated
     */
    boolean isSetTwpffilt();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_Twppfilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.twppfilt' kind='element'"
     * @generated
     */
    Float getTwppfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwppfilt <em>Twppfilt</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwppfilt <em>Twppfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwppfilt()
     * @see #getTwppfilt()
     * @see #setTwppfilt(Float)
     * @generated
     */
    void unsetTwppfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getTwppfilt <em>Twppfilt</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Dynamics Lookup Table</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC
     * @model opposite="WindPlantFreqPcontrolIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.WindDynamicsLookupTable' kind='element'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Wind Plant IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPlantFreqPcontrolIEC_WindPlantIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC
     * @model opposite="WindPlantFreqPcontrolIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPlantFreqPcontrolIEC.WindPlantIEC' kind='element'"
     * @generated
     */
    WindPlantIEC getWindPlantIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    void unsetWindPlantIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant IEC</em>' reference is set.
     * @see #unsetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    boolean isSetWindPlantIEC();

} // WindPlantFreqPcontrolIEC
