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
 * A representation of the model object '<em><b>Wind Aero Linear IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDpomega <em>Dpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDptheta <em>Dptheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getOmegazero <em>Omegazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getPavail <em>Pavail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getThetazero <em>Thetazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroLinearIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindAeroLinearIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dpomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpomega</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpomega</em>' attribute.
     * @see #isSetDpomega()
     * @see #unsetDpomega()
     * @see #setDpomega(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroLinearIEC_Dpomega()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindAeroLinearIEC.dpomega' kind='element'"
     * @generated
     */
    Float getDpomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDpomega <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpomega</em>' attribute.
     * @see #isSetDpomega()
     * @see #unsetDpomega()
     * @see #getDpomega()
     * @generated
     */
    void setDpomega( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDpomega <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpomega()
     * @see #getDpomega()
     * @see #setDpomega(Float)
     * @generated
     */
    void unsetDpomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDpomega <em>Dpomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpomega</em>' attribute is set.
     * @see #unsetDpomega()
     * @see #getDpomega()
     * @see #setDpomega(Float)
     * @generated
     */
    boolean isSetDpomega();

    /**
     * Returns the value of the '<em><b>Dptheta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dptheta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dptheta</em>' attribute.
     * @see #isSetDptheta()
     * @see #unsetDptheta()
     * @see #setDptheta(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroLinearIEC_Dptheta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindAeroLinearIEC.dptheta' kind='element'"
     * @generated
     */
    Float getDptheta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDptheta <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dptheta</em>' attribute.
     * @see #isSetDptheta()
     * @see #unsetDptheta()
     * @see #getDptheta()
     * @generated
     */
    void setDptheta( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDptheta <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDptheta()
     * @see #getDptheta()
     * @see #setDptheta(Float)
     * @generated
     */
    void unsetDptheta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getDptheta <em>Dptheta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dptheta</em>' attribute is set.
     * @see #unsetDptheta()
     * @see #getDptheta()
     * @see #setDptheta(Float)
     * @generated
     */
    boolean isSetDptheta();

    /**
     * Returns the value of the '<em><b>Omegazero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Omegazero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Omegazero</em>' attribute.
     * @see #isSetOmegazero()
     * @see #unsetOmegazero()
     * @see #setOmegazero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroLinearIEC_Omegazero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindAeroLinearIEC.omegazero' kind='element'"
     * @generated
     */
    Float getOmegazero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getOmegazero <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omegazero</em>' attribute.
     * @see #isSetOmegazero()
     * @see #unsetOmegazero()
     * @see #getOmegazero()
     * @generated
     */
    void setOmegazero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getOmegazero <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmegazero()
     * @see #getOmegazero()
     * @see #setOmegazero(Float)
     * @generated
     */
    void unsetOmegazero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getOmegazero <em>Omegazero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omegazero</em>' attribute is set.
     * @see #unsetOmegazero()
     * @see #getOmegazero()
     * @see #setOmegazero(Float)
     * @generated
     */
    boolean isSetOmegazero();

    /**
     * Returns the value of the '<em><b>Pavail</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pavail</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pavail</em>' attribute.
     * @see #isSetPavail()
     * @see #unsetPavail()
     * @see #setPavail(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroLinearIEC_Pavail()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindAeroLinearIEC.pavail' kind='element'"
     * @generated
     */
    Float getPavail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getPavail <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pavail</em>' attribute.
     * @see #isSetPavail()
     * @see #unsetPavail()
     * @see #getPavail()
     * @generated
     */
    void setPavail( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getPavail <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPavail()
     * @see #getPavail()
     * @see #setPavail(Float)
     * @generated
     */
    void unsetPavail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getPavail <em>Pavail</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pavail</em>' attribute is set.
     * @see #unsetPavail()
     * @see #getPavail()
     * @see #setPavail(Float)
     * @generated
     */
    boolean isSetPavail();

    /**
     * Returns the value of the '<em><b>Thetazero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetazero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetazero</em>' attribute.
     * @see #isSetThetazero()
     * @see #unsetThetazero()
     * @see #setThetazero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroLinearIEC_Thetazero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindAeroLinearIEC.thetazero' kind='element'"
     * @generated
     */
    Float getThetazero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getThetazero <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetazero</em>' attribute.
     * @see #isSetThetazero()
     * @see #unsetThetazero()
     * @see #getThetazero()
     * @generated
     */
    void setThetazero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getThetazero <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetazero()
     * @see #getThetazero()
     * @see #setThetazero(Float)
     * @generated
     */
    void unsetThetazero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getThetazero <em>Thetazero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetazero</em>' attribute is set.
     * @see #unsetThetazero()
     * @see #getThetazero()
     * @see #setThetazero(Float)
     * @generated
     */
    boolean isSetThetazero();

    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindAeroLinearIEC <em>Wind Aero Linear IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Turbine Type3 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type3 IEC</em>' reference.
     * @see #isSetWindGenTurbineType3IEC()
     * @see #unsetWindGenTurbineType3IEC()
     * @see #setWindGenTurbineType3IEC(WindGenTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindAeroLinearIEC_WindGenTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindAeroLinearIEC
     * @model opposite="WindAeroLinearIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindAeroLinearIEC.WindGenTurbineType3IEC' kind='element'"
     * @generated
     */
    WindGenTurbineType3IEC getWindGenTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type3 IEC</em>' reference.
     * @see #isSetWindGenTurbineType3IEC()
     * @see #unsetWindGenTurbineType3IEC()
     * @see #getWindGenTurbineType3IEC()
     * @generated
     */
    void setWindGenTurbineType3IEC( WindGenTurbineType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType3IEC()
     * @see #getWindGenTurbineType3IEC()
     * @see #setWindGenTurbineType3IEC(WindGenTurbineType3IEC)
     * @generated
     */
    void unsetWindGenTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType3IEC()
     * @see #getWindGenTurbineType3IEC()
     * @see #setWindGenTurbineType3IEC(WindGenTurbineType3IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType3IEC();

} // WindAeroLinearIEC
