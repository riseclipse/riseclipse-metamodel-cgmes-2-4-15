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
 * A representation of the model object '<em><b>Wind Pitch Cont Emul IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKdroop <em>Kdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKipce <em>Kipce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKomegaaero <em>Komegaaero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKppce <em>Kppce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getOmegaref <em>Omegaref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimax <em>Pimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimin <em>Pimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getTpe <em>Tpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindPitchContEmulIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kdroop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kdroop</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kdroop</em>' attribute.
     * @see #isSetKdroop()
     * @see #unsetKdroop()
     * @see #setKdroop(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Kdroop()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.kdroop' kind='element'"
     * @generated
     */
    Float getKdroop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKdroop <em>Kdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdroop</em>' attribute.
     * @see #isSetKdroop()
     * @see #unsetKdroop()
     * @see #getKdroop()
     * @generated
     */
    void setKdroop( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKdroop <em>Kdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdroop()
     * @see #getKdroop()
     * @see #setKdroop(Float)
     * @generated
     */
    void unsetKdroop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKdroop <em>Kdroop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdroop</em>' attribute is set.
     * @see #unsetKdroop()
     * @see #getKdroop()
     * @see #setKdroop(Float)
     * @generated
     */
    boolean isSetKdroop();

    /**
     * Returns the value of the '<em><b>Kipce</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kipce</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kipce</em>' attribute.
     * @see #isSetKipce()
     * @see #unsetKipce()
     * @see #setKipce(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Kipce()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.kipce' kind='element'"
     * @generated
     */
    Float getKipce();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKipce <em>Kipce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kipce</em>' attribute.
     * @see #isSetKipce()
     * @see #unsetKipce()
     * @see #getKipce()
     * @generated
     */
    void setKipce( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKipce <em>Kipce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKipce()
     * @see #getKipce()
     * @see #setKipce(Float)
     * @generated
     */
    void unsetKipce();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKipce <em>Kipce</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kipce</em>' attribute is set.
     * @see #unsetKipce()
     * @see #getKipce()
     * @see #setKipce(Float)
     * @generated
     */
    boolean isSetKipce();

    /**
     * Returns the value of the '<em><b>Komegaaero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Komegaaero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Komegaaero</em>' attribute.
     * @see #isSetKomegaaero()
     * @see #unsetKomegaaero()
     * @see #setKomegaaero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Komegaaero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.komegaaero' kind='element'"
     * @generated
     */
    Float getKomegaaero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKomegaaero <em>Komegaaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Komegaaero</em>' attribute.
     * @see #isSetKomegaaero()
     * @see #unsetKomegaaero()
     * @see #getKomegaaero()
     * @generated
     */
    void setKomegaaero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKomegaaero <em>Komegaaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKomegaaero()
     * @see #getKomegaaero()
     * @see #setKomegaaero(Float)
     * @generated
     */
    void unsetKomegaaero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKomegaaero <em>Komegaaero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Komegaaero</em>' attribute is set.
     * @see #unsetKomegaaero()
     * @see #getKomegaaero()
     * @see #setKomegaaero(Float)
     * @generated
     */
    boolean isSetKomegaaero();

    /**
     * Returns the value of the '<em><b>Kppce</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kppce</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kppce</em>' attribute.
     * @see #isSetKppce()
     * @see #unsetKppce()
     * @see #setKppce(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Kppce()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.kppce' kind='element'"
     * @generated
     */
    Float getKppce();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKppce <em>Kppce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kppce</em>' attribute.
     * @see #isSetKppce()
     * @see #unsetKppce()
     * @see #getKppce()
     * @generated
     */
    void setKppce( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKppce <em>Kppce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKppce()
     * @see #getKppce()
     * @see #setKppce(Float)
     * @generated
     */
    void unsetKppce();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getKppce <em>Kppce</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kppce</em>' attribute is set.
     * @see #unsetKppce()
     * @see #getKppce()
     * @see #setKppce(Float)
     * @generated
     */
    boolean isSetKppce();

    /**
     * Returns the value of the '<em><b>Omegaref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Omegaref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Omegaref</em>' attribute.
     * @see #isSetOmegaref()
     * @see #unsetOmegaref()
     * @see #setOmegaref(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Omegaref()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.omegaref' kind='element'"
     * @generated
     */
    Float getOmegaref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getOmegaref <em>Omegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omegaref</em>' attribute.
     * @see #isSetOmegaref()
     * @see #unsetOmegaref()
     * @see #getOmegaref()
     * @generated
     */
    void setOmegaref( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getOmegaref <em>Omegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmegaref()
     * @see #getOmegaref()
     * @see #setOmegaref(Float)
     * @generated
     */
    void unsetOmegaref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getOmegaref <em>Omegaref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omegaref</em>' attribute is set.
     * @see #unsetOmegaref()
     * @see #getOmegaref()
     * @see #setOmegaref(Float)
     * @generated
     */
    boolean isSetOmegaref();

    /**
     * Returns the value of the '<em><b>Pimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pimax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pimax</em>' attribute.
     * @see #isSetPimax()
     * @see #unsetPimax()
     * @see #setPimax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Pimax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.pimax' kind='element'"
     * @generated
     */
    Float getPimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimax <em>Pimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pimax</em>' attribute.
     * @see #isSetPimax()
     * @see #unsetPimax()
     * @see #getPimax()
     * @generated
     */
    void setPimax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimax <em>Pimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPimax()
     * @see #getPimax()
     * @see #setPimax(Float)
     * @generated
     */
    void unsetPimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimax <em>Pimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pimax</em>' attribute is set.
     * @see #unsetPimax()
     * @see #getPimax()
     * @see #setPimax(Float)
     * @generated
     */
    boolean isSetPimax();

    /**
     * Returns the value of the '<em><b>Pimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pimin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pimin</em>' attribute.
     * @see #isSetPimin()
     * @see #unsetPimin()
     * @see #setPimin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Pimin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.pimin' kind='element'"
     * @generated
     */
    Float getPimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimin <em>Pimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pimin</em>' attribute.
     * @see #isSetPimin()
     * @see #unsetPimin()
     * @see #getPimin()
     * @generated
     */
    void setPimin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimin <em>Pimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPimin()
     * @see #getPimin()
     * @see #setPimin(Float)
     * @generated
     */
    void unsetPimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getPimin <em>Pimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pimin</em>' attribute is set.
     * @see #unsetPimin()
     * @see #getPimin()
     * @see #setPimin(Float)
     * @generated
     */
    boolean isSetPimin();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_T1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.t1' kind='element'"
     * @generated
     */
    Float getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_T2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.t2' kind='element'"
     * @generated
     */
    Float getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #getT2()
     * @generated
     */
    void setT2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>Tpe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpe</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpe</em>' attribute.
     * @see #isSetTpe()
     * @see #unsetTpe()
     * @see #setTpe(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_Tpe()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.tpe' kind='element'"
     * @generated
     */
    Float getTpe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getTpe <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpe</em>' attribute.
     * @see #isSetTpe()
     * @see #unsetTpe()
     * @see #getTpe()
     * @generated
     */
    void setTpe( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getTpe <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpe()
     * @see #getTpe()
     * @see #setTpe(Float)
     * @generated
     */
    void unsetTpe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getTpe <em>Tpe</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpe</em>' attribute is set.
     * @see #unsetTpe()
     * @see #getTpe()
     * @see #setTpe(Float)
     * @generated
     */
    boolean isSetTpe();

    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType2IEC#getWindPitchContEmulIEC <em>Wind Pitch Cont Emul IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Turbine Type2 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindPitchContEmulIEC_WindGenTurbineType2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType2IEC#getWindPitchContEmulIEC
     * @model opposite="WindPitchContEmulIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindPitchContEmulIEC.WindGenTurbineType2IEC' kind='element'"
     * @generated
     */
    WindGenTurbineType2IEC getWindGenTurbineType2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @generated
     */
    void setWindGenTurbineType2IEC( WindGenTurbineType2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    void unsetWindGenTurbineType2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPitchContEmulIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType2IEC();

} // WindPitchContEmulIEC
