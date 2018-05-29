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
 * A representation of the model object '<em><b>Wind Cont PType4a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTufilt <em>Tufilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContPType4aIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindContPType4aIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dpmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #setDpmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContPType4aIEC_Dpmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContPType4aIEC.dpmax' kind='element'"
     * @generated
     */
    Float getDpmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @generated
     */
    void setDpmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Float)
     * @generated
     */
    void unsetDpmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getDpmax <em>Dpmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmax</em>' attribute is set.
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Float)
     * @generated
     */
    boolean isSetDpmax();

    /**
     * Returns the value of the '<em><b>Tpord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpord</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpord</em>' attribute.
     * @see #isSetTpord()
     * @see #unsetTpord()
     * @see #setTpord(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContPType4aIEC_Tpord()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContPType4aIEC.tpord' kind='element'"
     * @generated
     */
    Float getTpord();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTpord <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpord</em>' attribute.
     * @see #isSetTpord()
     * @see #unsetTpord()
     * @see #getTpord()
     * @generated
     */
    void setTpord( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTpord <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpord()
     * @see #getTpord()
     * @see #setTpord(Float)
     * @generated
     */
    void unsetTpord();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTpord <em>Tpord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpord</em>' attribute is set.
     * @see #unsetTpord()
     * @see #getTpord()
     * @see #setTpord(Float)
     * @generated
     */
    boolean isSetTpord();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContPType4aIEC_Tufilt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContPType4aIEC.tufilt' kind='element'"
     * @generated
     */
    Float getTufilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTufilt <em>Tufilt</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTufilt <em>Tufilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufilt()
     * @see #getTufilt()
     * @see #setTufilt(Float)
     * @generated
     */
    void unsetTufilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getTufilt <em>Tufilt</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Wind Turbine Type4a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type4a IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type4a IEC</em>' reference.
     * @see #isSetWindTurbineType4aIEC()
     * @see #unsetWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindContPType4aIEC_WindTurbineType4aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4aIEC#getWindContPType4aIEC
     * @model opposite="WindContPType4aIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindContPType4aIEC.WindTurbineType4aIEC' kind='element'"
     * @generated
     */
    WindTurbineType4aIEC getWindTurbineType4aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4a IEC</em>' reference.
     * @see #isSetWindTurbineType4aIEC()
     * @see #unsetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @generated
     */
    void setWindTurbineType4aIEC( WindTurbineType4aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @generated
     */
    void unsetWindTurbineType4aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4a IEC</em>' reference is set.
     * @see #unsetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @generated
     */
    boolean isSetWindTurbineType4aIEC();

} // WindContPType4aIEC
