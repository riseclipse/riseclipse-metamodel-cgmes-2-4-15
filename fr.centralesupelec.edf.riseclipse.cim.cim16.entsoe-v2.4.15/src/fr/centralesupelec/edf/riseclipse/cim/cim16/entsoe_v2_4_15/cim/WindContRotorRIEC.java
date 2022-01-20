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
 * A representation of the model object '<em><b>Wind Cont Rotor RIEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTomegafilt <em>Tomegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTpfilt <em>Tpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindContRotorRIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kirr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kirr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kirr</em>' attribute.
     * @see #isSetKirr()
     * @see #unsetKirr()
     * @see #setKirr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Kirr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.kirr' kind='element'"
     * @generated
     */
    Float getKirr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kirr</em>' attribute.
     * @see #isSetKirr()
     * @see #unsetKirr()
     * @see #getKirr()
     * @generated
     */
    void setKirr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKirr()
     * @see #getKirr()
     * @see #setKirr(Float)
     * @generated
     */
    void unsetKirr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kirr</em>' attribute is set.
     * @see #unsetKirr()
     * @see #getKirr()
     * @see #setKirr(Float)
     * @generated
     */
    boolean isSetKirr();

    /**
     * Returns the value of the '<em><b>Komegafilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Komegafilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Komegafilt</em>' attribute.
     * @see #isSetKomegafilt()
     * @see #unsetKomegafilt()
     * @see #setKomegafilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Komegafilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.komegafilt' kind='element'"
     * @generated
     */
    Float getKomegafilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Komegafilt</em>' attribute.
     * @see #isSetKomegafilt()
     * @see #unsetKomegafilt()
     * @see #getKomegafilt()
     * @generated
     */
    void setKomegafilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKomegafilt()
     * @see #getKomegafilt()
     * @see #setKomegafilt(Float)
     * @generated
     */
    void unsetKomegafilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Komegafilt</em>' attribute is set.
     * @see #unsetKomegafilt()
     * @see #getKomegafilt()
     * @see #setKomegafilt(Float)
     * @generated
     */
    boolean isSetKomegafilt();

    /**
     * Returns the value of the '<em><b>Kpfilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpfilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpfilt</em>' attribute.
     * @see #isSetKpfilt()
     * @see #unsetKpfilt()
     * @see #setKpfilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Kpfilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.kpfilt' kind='element'"
     * @generated
     */
    Float getKpfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpfilt</em>' attribute.
     * @see #isSetKpfilt()
     * @see #unsetKpfilt()
     * @see #getKpfilt()
     * @generated
     */
    void setKpfilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpfilt()
     * @see #getKpfilt()
     * @see #setKpfilt(Float)
     * @generated
     */
    void unsetKpfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpfilt</em>' attribute is set.
     * @see #unsetKpfilt()
     * @see #getKpfilt()
     * @see #setKpfilt(Float)
     * @generated
     */
    boolean isSetKpfilt();

    /**
     * Returns the value of the '<em><b>Kprr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kprr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kprr</em>' attribute.
     * @see #isSetKprr()
     * @see #unsetKprr()
     * @see #setKprr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Kprr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.kprr' kind='element'"
     * @generated
     */
    Float getKprr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kprr</em>' attribute.
     * @see #isSetKprr()
     * @see #unsetKprr()
     * @see #getKprr()
     * @generated
     */
    void setKprr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKprr()
     * @see #getKprr()
     * @see #setKprr(Float)
     * @generated
     */
    void unsetKprr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kprr</em>' attribute is set.
     * @see #unsetKprr()
     * @see #getKprr()
     * @see #setKprr(Float)
     * @generated
     */
    boolean isSetKprr();

    /**
     * Returns the value of the '<em><b>Rmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rmax</em>' attribute.
     * @see #isSetRmax()
     * @see #unsetRmax()
     * @see #setRmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Rmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.rmax' kind='element'"
     * @generated
     */
    Float getRmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rmax</em>' attribute.
     * @see #isSetRmax()
     * @see #unsetRmax()
     * @see #getRmax()
     * @generated
     */
    void setRmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRmax()
     * @see #getRmax()
     * @see #setRmax(Float)
     * @generated
     */
    void unsetRmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rmax</em>' attribute is set.
     * @see #unsetRmax()
     * @see #getRmax()
     * @see #setRmax(Float)
     * @generated
     */
    boolean isSetRmax();

    /**
     * Returns the value of the '<em><b>Rmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rmin</em>' attribute.
     * @see #isSetRmin()
     * @see #unsetRmin()
     * @see #setRmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Rmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.rmin' kind='element'"
     * @generated
     */
    Float getRmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rmin</em>' attribute.
     * @see #isSetRmin()
     * @see #unsetRmin()
     * @see #getRmin()
     * @generated
     */
    void setRmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRmin()
     * @see #getRmin()
     * @see #setRmin(Float)
     * @generated
     */
    void unsetRmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rmin</em>' attribute is set.
     * @see #unsetRmin()
     * @see #getRmin()
     * @see #setRmin(Float)
     * @generated
     */
    boolean isSetRmin();

    /**
     * Returns the value of the '<em><b>Tomegafilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tomegafilt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tomegafilt</em>' attribute.
     * @see #isSetTomegafilt()
     * @see #unsetTomegafilt()
     * @see #setTomegafilt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Tomegafilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.tomegafilt' kind='element'"
     * @generated
     */
    Float getTomegafilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTomegafilt <em>Tomegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomegafilt</em>' attribute.
     * @see #isSetTomegafilt()
     * @see #unsetTomegafilt()
     * @see #getTomegafilt()
     * @generated
     */
    void setTomegafilt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTomegafilt <em>Tomegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomegafilt()
     * @see #getTomegafilt()
     * @see #setTomegafilt(Float)
     * @generated
     */
    void unsetTomegafilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTomegafilt <em>Tomegafilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomegafilt</em>' attribute is set.
     * @see #unsetTomegafilt()
     * @see #getTomegafilt()
     * @see #setTomegafilt(Float)
     * @generated
     */
    boolean isSetTomegafilt();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_Tpfilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.tpfilt' kind='element'"
     * @generated
     */
    Float getTpfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTpfilt <em>Tpfilt</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTpfilt <em>Tpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfilt()
     * @see #getTpfilt()
     * @see #setTpfilt(Float)
     * @generated
     */
    void unsetTpfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getTpfilt <em>Tpfilt</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Wind Gen Turbine Type2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType2IEC#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_WindGenTurbineType2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType2IEC#getWindContRotorRIEC
     * @model opposite="WindContRotorRIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.WindGenTurbineType2IEC' kind='element'"
     * @generated
     */
    WindGenTurbineType2IEC getWindGenTurbineType2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    void unsetWindGenTurbineType2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType2IEC();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Dynamics Lookup Table</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContRotorRIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContRotorRIEC
     * @model opposite="WindContRotorRIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContRotorRIEC.WindDynamicsLookupTable' kind='element'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

} // WindContRotorRIEC
