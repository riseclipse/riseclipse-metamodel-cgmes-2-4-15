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
 * A representation of the model object '<em><b>Wind Cont QIEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmax <em>Iqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmin <em>Iqmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqpost <em>Iqpost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiq <em>Kiq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiu <em>Kiu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpq <em>Kpq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpu <em>Kpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKqv <em>Kqv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmax <em>Qmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmin <em>Qmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getRdroop <em>Rdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTiq <em>Tiq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpfilt <em>Tpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpost <em>Tpost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTqord <em>Tqord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTufilt <em>Tufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb1 <em>Udb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb2 <em>Udb2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmax <em>Umax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmin <em>Umin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUqdip <em>Uqdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUref0 <em>Uref0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindLVRTQcontrolModesType <em>Wind LVRT Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getXdroop <em>Xdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindContQIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Iqh1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iqh1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iqh1</em>' attribute.
     * @see #isSetIqh1()
     * @see #unsetIqh1()
     * @see #setIqh1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Iqh1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.iqh1' kind='element'"
     * @generated
     */
    Float getIqh1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqh1</em>' attribute.
     * @see #isSetIqh1()
     * @see #unsetIqh1()
     * @see #getIqh1()
     * @generated
     */
    void setIqh1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqh1()
     * @see #getIqh1()
     * @see #setIqh1(Float)
     * @generated
     */
    void unsetIqh1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqh1</em>' attribute is set.
     * @see #unsetIqh1()
     * @see #getIqh1()
     * @see #setIqh1(Float)
     * @generated
     */
    boolean isSetIqh1();

    /**
     * Returns the value of the '<em><b>Iqmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iqmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iqmax</em>' attribute.
     * @see #isSetIqmax()
     * @see #unsetIqmax()
     * @see #setIqmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Iqmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.iqmax' kind='element'"
     * @generated
     */
    Float getIqmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmax <em>Iqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqmax</em>' attribute.
     * @see #isSetIqmax()
     * @see #unsetIqmax()
     * @see #getIqmax()
     * @generated
     */
    void setIqmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmax <em>Iqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqmax()
     * @see #getIqmax()
     * @see #setIqmax(Float)
     * @generated
     */
    void unsetIqmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmax <em>Iqmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqmax</em>' attribute is set.
     * @see #unsetIqmax()
     * @see #getIqmax()
     * @see #setIqmax(Float)
     * @generated
     */
    boolean isSetIqmax();

    /**
     * Returns the value of the '<em><b>Iqmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iqmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iqmin</em>' attribute.
     * @see #isSetIqmin()
     * @see #unsetIqmin()
     * @see #setIqmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Iqmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.iqmin' kind='element'"
     * @generated
     */
    Float getIqmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmin <em>Iqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqmin</em>' attribute.
     * @see #isSetIqmin()
     * @see #unsetIqmin()
     * @see #getIqmin()
     * @generated
     */
    void setIqmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmin <em>Iqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqmin()
     * @see #getIqmin()
     * @see #setIqmin(Float)
     * @generated
     */
    void unsetIqmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqmin <em>Iqmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqmin</em>' attribute is set.
     * @see #unsetIqmin()
     * @see #getIqmin()
     * @see #setIqmin(Float)
     * @generated
     */
    boolean isSetIqmin();

    /**
     * Returns the value of the '<em><b>Iqpost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iqpost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iqpost</em>' attribute.
     * @see #isSetIqpost()
     * @see #unsetIqpost()
     * @see #setIqpost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Iqpost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.iqpost' kind='element'"
     * @generated
     */
    Float getIqpost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqpost <em>Iqpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqpost</em>' attribute.
     * @see #isSetIqpost()
     * @see #unsetIqpost()
     * @see #getIqpost()
     * @generated
     */
    void setIqpost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqpost <em>Iqpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqpost()
     * @see #getIqpost()
     * @see #setIqpost(Float)
     * @generated
     */
    void unsetIqpost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getIqpost <em>Iqpost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqpost</em>' attribute is set.
     * @see #unsetIqpost()
     * @see #getIqpost()
     * @see #setIqpost(Float)
     * @generated
     */
    boolean isSetIqpost();

    /**
     * Returns the value of the '<em><b>Kiq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiq</em>' attribute.
     * @see #isSetKiq()
     * @see #unsetKiq()
     * @see #setKiq(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Kiq()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.kiq' kind='element'"
     * @generated
     */
    Float getKiq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiq <em>Kiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiq</em>' attribute.
     * @see #isSetKiq()
     * @see #unsetKiq()
     * @see #getKiq()
     * @generated
     */
    void setKiq( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiq <em>Kiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiq()
     * @see #getKiq()
     * @see #setKiq(Float)
     * @generated
     */
    void unsetKiq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiq <em>Kiq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiq</em>' attribute is set.
     * @see #unsetKiq()
     * @see #getKiq()
     * @see #setKiq(Float)
     * @generated
     */
    boolean isSetKiq();

    /**
     * Returns the value of the '<em><b>Kiu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiu</em>' attribute.
     * @see #isSetKiu()
     * @see #unsetKiu()
     * @see #setKiu(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Kiu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.kiu' kind='element'"
     * @generated
     */
    Float getKiu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiu <em>Kiu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiu</em>' attribute.
     * @see #isSetKiu()
     * @see #unsetKiu()
     * @see #getKiu()
     * @generated
     */
    void setKiu( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiu <em>Kiu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiu()
     * @see #getKiu()
     * @see #setKiu(Float)
     * @generated
     */
    void unsetKiu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKiu <em>Kiu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiu</em>' attribute is set.
     * @see #unsetKiu()
     * @see #getKiu()
     * @see #setKiu(Float)
     * @generated
     */
    boolean isSetKiu();

    /**
     * Returns the value of the '<em><b>Kpq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpq</em>' attribute.
     * @see #isSetKpq()
     * @see #unsetKpq()
     * @see #setKpq(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Kpq()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.kpq' kind='element'"
     * @generated
     */
    Float getKpq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpq <em>Kpq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpq</em>' attribute.
     * @see #isSetKpq()
     * @see #unsetKpq()
     * @see #getKpq()
     * @generated
     */
    void setKpq( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpq <em>Kpq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpq()
     * @see #getKpq()
     * @see #setKpq(Float)
     * @generated
     */
    void unsetKpq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpq <em>Kpq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpq</em>' attribute is set.
     * @see #unsetKpq()
     * @see #getKpq()
     * @see #setKpq(Float)
     * @generated
     */
    boolean isSetKpq();

    /**
     * Returns the value of the '<em><b>Kpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpu</em>' attribute.
     * @see #isSetKpu()
     * @see #unsetKpu()
     * @see #setKpu(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Kpu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.kpu' kind='element'"
     * @generated
     */
    Float getKpu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpu <em>Kpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpu</em>' attribute.
     * @see #isSetKpu()
     * @see #unsetKpu()
     * @see #getKpu()
     * @generated
     */
    void setKpu( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpu <em>Kpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpu()
     * @see #getKpu()
     * @see #setKpu(Float)
     * @generated
     */
    void unsetKpu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKpu <em>Kpu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpu</em>' attribute is set.
     * @see #unsetKpu()
     * @see #getKpu()
     * @see #setKpu(Float)
     * @generated
     */
    boolean isSetKpu();

    /**
     * Returns the value of the '<em><b>Kqv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kqv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kqv</em>' attribute.
     * @see #isSetKqv()
     * @see #unsetKqv()
     * @see #setKqv(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Kqv()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.kqv' kind='element'"
     * @generated
     */
    Float getKqv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKqv <em>Kqv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kqv</em>' attribute.
     * @see #isSetKqv()
     * @see #unsetKqv()
     * @see #getKqv()
     * @generated
     */
    void setKqv( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKqv <em>Kqv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKqv()
     * @see #getKqv()
     * @see #setKqv(Float)
     * @generated
     */
    void unsetKqv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getKqv <em>Kqv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kqv</em>' attribute is set.
     * @see #unsetKqv()
     * @see #getKqv()
     * @see #setKqv(Float)
     * @generated
     */
    boolean isSetKqv();

    /**
     * Returns the value of the '<em><b>Qmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qmax</em>' attribute.
     * @see #isSetQmax()
     * @see #unsetQmax()
     * @see #setQmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Qmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.qmax' kind='element'"
     * @generated
     */
    Float getQmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmax <em>Qmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qmax</em>' attribute.
     * @see #isSetQmax()
     * @see #unsetQmax()
     * @see #getQmax()
     * @generated
     */
    void setQmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmax <em>Qmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQmax()
     * @see #getQmax()
     * @see #setQmax(Float)
     * @generated
     */
    void unsetQmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmax <em>Qmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qmax</em>' attribute is set.
     * @see #unsetQmax()
     * @see #getQmax()
     * @see #setQmax(Float)
     * @generated
     */
    boolean isSetQmax();

    /**
     * Returns the value of the '<em><b>Qmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qmin</em>' attribute.
     * @see #isSetQmin()
     * @see #unsetQmin()
     * @see #setQmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Qmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.qmin' kind='element'"
     * @generated
     */
    Float getQmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmin <em>Qmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qmin</em>' attribute.
     * @see #isSetQmin()
     * @see #unsetQmin()
     * @see #getQmin()
     * @generated
     */
    void setQmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmin <em>Qmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQmin()
     * @see #getQmin()
     * @see #setQmin(Float)
     * @generated
     */
    void unsetQmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getQmin <em>Qmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qmin</em>' attribute is set.
     * @see #unsetQmin()
     * @see #getQmin()
     * @see #setQmin(Float)
     * @generated
     */
    boolean isSetQmin();

    /**
     * Returns the value of the '<em><b>Rdroop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rdroop</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rdroop</em>' attribute.
     * @see #isSetRdroop()
     * @see #unsetRdroop()
     * @see #setRdroop(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Rdroop()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.rdroop' kind='element'"
     * @generated
     */
    Float getRdroop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getRdroop <em>Rdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rdroop</em>' attribute.
     * @see #isSetRdroop()
     * @see #unsetRdroop()
     * @see #getRdroop()
     * @generated
     */
    void setRdroop( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getRdroop <em>Rdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRdroop()
     * @see #getRdroop()
     * @see #setRdroop(Float)
     * @generated
     */
    void unsetRdroop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getRdroop <em>Rdroop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rdroop</em>' attribute is set.
     * @see #unsetRdroop()
     * @see #getRdroop()
     * @see #setRdroop(Float)
     * @generated
     */
    boolean isSetRdroop();

    /**
     * Returns the value of the '<em><b>Tiq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tiq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tiq</em>' attribute.
     * @see #isSetTiq()
     * @see #unsetTiq()
     * @see #setTiq(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Tiq()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.tiq' kind='element'"
     * @generated
     */
    Float getTiq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTiq <em>Tiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tiq</em>' attribute.
     * @see #isSetTiq()
     * @see #unsetTiq()
     * @see #getTiq()
     * @generated
     */
    void setTiq( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTiq <em>Tiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTiq()
     * @see #getTiq()
     * @see #setTiq(Float)
     * @generated
     */
    void unsetTiq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTiq <em>Tiq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tiq</em>' attribute is set.
     * @see #unsetTiq()
     * @see #getTiq()
     * @see #setTiq(Float)
     * @generated
     */
    boolean isSetTiq();

    /**
     * Returns the value of the '<em><b>Tpfilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpfilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpfilt</em>' attribute.
     * @see #isSetTpfilt()
     * @see #unsetTpfilt()
     * @see #setTpfilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Tpfilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.tpfilt' kind='element'"
     * @generated
     */
    Float getTpfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpfilt <em>Tpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfilt</em>' attribute.
     * @see #isSetTpfilt()
     * @see #unsetTpfilt()
     * @see #getTpfilt()
     * @generated
     */
    void setTpfilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpfilt <em>Tpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfilt()
     * @see #getTpfilt()
     * @see #setTpfilt(Float)
     * @generated
     */
    void unsetTpfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpfilt <em>Tpfilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfilt</em>' attribute is set.
     * @see #unsetTpfilt()
     * @see #getTpfilt()
     * @see #setTpfilt(Float)
     * @generated
     */
    boolean isSetTpfilt();

    /**
     * Returns the value of the '<em><b>Tpost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpost</em>' attribute.
     * @see #isSetTpost()
     * @see #unsetTpost()
     * @see #setTpost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Tpost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.tpost' kind='element'"
     * @generated
     */
    Float getTpost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpost <em>Tpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpost</em>' attribute.
     * @see #isSetTpost()
     * @see #unsetTpost()
     * @see #getTpost()
     * @generated
     */
    void setTpost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpost <em>Tpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpost()
     * @see #getTpost()
     * @see #setTpost(Float)
     * @generated
     */
    void unsetTpost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTpost <em>Tpost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpost</em>' attribute is set.
     * @see #unsetTpost()
     * @see #getTpost()
     * @see #setTpost(Float)
     * @generated
     */
    boolean isSetTpost();

    /**
     * Returns the value of the '<em><b>Tqord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tqord</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tqord</em>' attribute.
     * @see #isSetTqord()
     * @see #unsetTqord()
     * @see #setTqord(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Tqord()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.tqord' kind='element'"
     * @generated
     */
    Float getTqord();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTqord <em>Tqord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tqord</em>' attribute.
     * @see #isSetTqord()
     * @see #unsetTqord()
     * @see #getTqord()
     * @generated
     */
    void setTqord( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTqord <em>Tqord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTqord()
     * @see #getTqord()
     * @see #setTqord(Float)
     * @generated
     */
    void unsetTqord();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTqord <em>Tqord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tqord</em>' attribute is set.
     * @see #unsetTqord()
     * @see #getTqord()
     * @see #setTqord(Float)
     * @generated
     */
    boolean isSetTqord();

    /**
     * Returns the value of the '<em><b>Tufilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tufilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tufilt</em>' attribute.
     * @see #isSetTufilt()
     * @see #unsetTufilt()
     * @see #setTufilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Tufilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.tufilt' kind='element'"
     * @generated
     */
    Float getTufilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTufilt <em>Tufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufilt</em>' attribute.
     * @see #isSetTufilt()
     * @see #unsetTufilt()
     * @see #getTufilt()
     * @generated
     */
    void setTufilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTufilt <em>Tufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufilt()
     * @see #getTufilt()
     * @see #setTufilt(Float)
     * @generated
     */
    void unsetTufilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getTufilt <em>Tufilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufilt</em>' attribute is set.
     * @see #unsetTufilt()
     * @see #getTufilt()
     * @see #setTufilt(Float)
     * @generated
     */
    boolean isSetTufilt();

    /**
     * Returns the value of the '<em><b>Udb1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Udb1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Udb1</em>' attribute.
     * @see #isSetUdb1()
     * @see #unsetUdb1()
     * @see #setUdb1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Udb1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.udb1' kind='element'"
     * @generated
     */
    Float getUdb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb1 <em>Udb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Udb1</em>' attribute.
     * @see #isSetUdb1()
     * @see #unsetUdb1()
     * @see #getUdb1()
     * @generated
     */
    void setUdb1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb1 <em>Udb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUdb1()
     * @see #getUdb1()
     * @see #setUdb1(Float)
     * @generated
     */
    void unsetUdb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb1 <em>Udb1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Udb1</em>' attribute is set.
     * @see #unsetUdb1()
     * @see #getUdb1()
     * @see #setUdb1(Float)
     * @generated
     */
    boolean isSetUdb1();

    /**
     * Returns the value of the '<em><b>Udb2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Udb2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Udb2</em>' attribute.
     * @see #isSetUdb2()
     * @see #unsetUdb2()
     * @see #setUdb2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Udb2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.udb2' kind='element'"
     * @generated
     */
    Float getUdb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb2 <em>Udb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Udb2</em>' attribute.
     * @see #isSetUdb2()
     * @see #unsetUdb2()
     * @see #getUdb2()
     * @generated
     */
    void setUdb2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb2 <em>Udb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUdb2()
     * @see #getUdb2()
     * @see #setUdb2(Float)
     * @generated
     */
    void unsetUdb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUdb2 <em>Udb2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Udb2</em>' attribute is set.
     * @see #unsetUdb2()
     * @see #getUdb2()
     * @see #setUdb2(Float)
     * @generated
     */
    boolean isSetUdb2();

    /**
     * Returns the value of the '<em><b>Umax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Umax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Umax</em>' attribute.
     * @see #isSetUmax()
     * @see #unsetUmax()
     * @see #setUmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Umax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.umax' kind='element'"
     * @generated
     */
    Float getUmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmax <em>Umax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Umax</em>' attribute.
     * @see #isSetUmax()
     * @see #unsetUmax()
     * @see #getUmax()
     * @generated
     */
    void setUmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmax <em>Umax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmax()
     * @see #getUmax()
     * @see #setUmax(Float)
     * @generated
     */
    void unsetUmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmax <em>Umax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Umax</em>' attribute is set.
     * @see #unsetUmax()
     * @see #getUmax()
     * @see #setUmax(Float)
     * @generated
     */
    boolean isSetUmax();

    /**
     * Returns the value of the '<em><b>Umin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Umin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Umin</em>' attribute.
     * @see #isSetUmin()
     * @see #unsetUmin()
     * @see #setUmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Umin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.umin' kind='element'"
     * @generated
     */
    Float getUmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmin <em>Umin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Umin</em>' attribute.
     * @see #isSetUmin()
     * @see #unsetUmin()
     * @see #getUmin()
     * @generated
     */
    void setUmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmin <em>Umin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmin()
     * @see #getUmin()
     * @see #setUmin(Float)
     * @generated
     */
    void unsetUmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUmin <em>Umin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Umin</em>' attribute is set.
     * @see #unsetUmin()
     * @see #getUmin()
     * @see #setUmin(Float)
     * @generated
     */
    boolean isSetUmin();

    /**
     * Returns the value of the '<em><b>Uqdip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uqdip</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uqdip</em>' attribute.
     * @see #isSetUqdip()
     * @see #unsetUqdip()
     * @see #setUqdip(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Uqdip()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.uqdip' kind='element'"
     * @generated
     */
    Float getUqdip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUqdip <em>Uqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uqdip</em>' attribute.
     * @see #isSetUqdip()
     * @see #unsetUqdip()
     * @see #getUqdip()
     * @generated
     */
    void setUqdip( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUqdip <em>Uqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUqdip()
     * @see #getUqdip()
     * @see #setUqdip(Float)
     * @generated
     */
    void unsetUqdip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUqdip <em>Uqdip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uqdip</em>' attribute is set.
     * @see #unsetUqdip()
     * @see #getUqdip()
     * @see #setUqdip(Float)
     * @generated
     */
    boolean isSetUqdip();

    /**
     * Returns the value of the '<em><b>Uref0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uref0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uref0</em>' attribute.
     * @see #isSetUref0()
     * @see #unsetUref0()
     * @see #setUref0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Uref0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.uref0' kind='element'"
     * @generated
     */
    Float getUref0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUref0 <em>Uref0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uref0</em>' attribute.
     * @see #isSetUref0()
     * @see #unsetUref0()
     * @see #getUref0()
     * @generated
     */
    void setUref0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUref0 <em>Uref0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUref0()
     * @see #getUref0()
     * @see #setUref0(Float)
     * @generated
     */
    void unsetUref0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getUref0 <em>Uref0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uref0</em>' attribute is set.
     * @see #unsetUref0()
     * @see #getUref0()
     * @see #setUref0(Float)
     * @generated
     */
    boolean isSetUref0();

    /**
     * Returns the value of the '<em><b>Wind LVRT Qcontrol Modes Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindLVRTQcontrolModesKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind LVRT Qcontrol Modes Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind LVRT Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindLVRTQcontrolModesKind
     * @see #isSetWindLVRTQcontrolModesType()
     * @see #unsetWindLVRTQcontrolModesType()
     * @see #setWindLVRTQcontrolModesType(WindLVRTQcontrolModesKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_WindLVRTQcontrolModesType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.windLVRTQcontrolModesType' kind='element'"
     * @generated
     */
    WindLVRTQcontrolModesKind getWindLVRTQcontrolModesType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindLVRTQcontrolModesType <em>Wind LVRT Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind LVRT Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindLVRTQcontrolModesKind
     * @see #isSetWindLVRTQcontrolModesType()
     * @see #unsetWindLVRTQcontrolModesType()
     * @see #getWindLVRTQcontrolModesType()
     * @generated
     */
    void setWindLVRTQcontrolModesType( WindLVRTQcontrolModesKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindLVRTQcontrolModesType <em>Wind LVRT Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindLVRTQcontrolModesType()
     * @see #getWindLVRTQcontrolModesType()
     * @see #setWindLVRTQcontrolModesType(WindLVRTQcontrolModesKind)
     * @generated
     */
    void unsetWindLVRTQcontrolModesType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindLVRTQcontrolModesType <em>Wind LVRT Qcontrol Modes Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind LVRT Qcontrol Modes Type</em>' attribute is set.
     * @see #unsetWindLVRTQcontrolModesType()
     * @see #getWindLVRTQcontrolModesType()
     * @see #setWindLVRTQcontrolModesType(WindLVRTQcontrolModesKind)
     * @generated
     */
    boolean isSetWindLVRTQcontrolModesType();

    /**
     * Returns the value of the '<em><b>Wind Qcontrol Modes Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindQcontrolModesKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Qcontrol Modes Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindQcontrolModesKind
     * @see #isSetWindQcontrolModesType()
     * @see #unsetWindQcontrolModesType()
     * @see #setWindQcontrolModesType(WindQcontrolModesKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_WindQcontrolModesType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.windQcontrolModesType' kind='element'"
     * @generated
     */
    WindQcontrolModesKind getWindQcontrolModesType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindQcontrolModesKind
     * @see #isSetWindQcontrolModesType()
     * @see #unsetWindQcontrolModesType()
     * @see #getWindQcontrolModesType()
     * @generated
     */
    void setWindQcontrolModesType( WindQcontrolModesKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindQcontrolModesType()
     * @see #getWindQcontrolModesType()
     * @see #setWindQcontrolModesType(WindQcontrolModesKind)
     * @generated
     */
    void unsetWindQcontrolModesType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Qcontrol Modes Type</em>' attribute is set.
     * @see #unsetWindQcontrolModesType()
     * @see #getWindQcontrolModesType()
     * @see #setWindQcontrolModesType(WindQcontrolModesKind)
     * @generated
     */
    boolean isSetWindQcontrolModesType();

    /**
     * Returns the value of the '<em><b>Xdroop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xdroop</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xdroop</em>' attribute.
     * @see #isSetXdroop()
     * @see #unsetXdroop()
     * @see #setXdroop(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_Xdroop()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.xdroop' kind='element'"
     * @generated
     */
    Float getXdroop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getXdroop <em>Xdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xdroop</em>' attribute.
     * @see #isSetXdroop()
     * @see #unsetXdroop()
     * @see #getXdroop()
     * @generated
     */
    void setXdroop( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getXdroop <em>Xdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXdroop()
     * @see #getXdroop()
     * @see #setXdroop(Float)
     * @generated
     */
    void unsetXdroop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getXdroop <em>Xdroop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xdroop</em>' attribute is set.
     * @see #unsetXdroop()
     * @see #getXdroop()
     * @see #setXdroop(Float)
     * @generated
     */
    boolean isSetXdroop();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type3or4 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContQIEC_WindTurbineType3or4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWIndContQIEC
     * @model opposite="WIndContQIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContQIEC.WindTurbineType3or4IEC' kind='element'"
     * @generated
     */
    WindTurbineType3or4IEC getWindTurbineType3or4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @generated
     */
    void setWindTurbineType3or4IEC( WindTurbineType3or4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    void unsetWindTurbineType3or4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    boolean isSetWindTurbineType3or4IEC();

} // WindContQIEC
