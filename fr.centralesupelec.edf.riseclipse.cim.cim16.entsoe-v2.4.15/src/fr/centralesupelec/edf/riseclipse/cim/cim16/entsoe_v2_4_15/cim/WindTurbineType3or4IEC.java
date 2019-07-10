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
 * A representation of the model object '<em><b>Wind Turbine Type3or4 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindTurbineType3or4IEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindTurbineType3or4IEC extends WindTurbineType3or4Dynamics {
    /**
     * Returns the value of the '<em><b>Wind Protection IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Protection IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindTurbineType3or4IEC_WindProtectionIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindProtectionIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindTurbineType3or4IEC.WindProtectionIEC' kind='element'"
     * @generated
     */
    WindProtectionIEC getWindProtectionIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @generated
     */
    void setWindProtectionIEC( WindProtectionIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    void unsetWindProtectionIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Protection IEC</em>' reference is set.
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    boolean isSetWindProtectionIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont Curr Lim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont Curr Lim IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont Curr Lim IEC</em>' reference.
     * @see #isSetWindContCurrLimIEC()
     * @see #unsetWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindTurbineType3or4IEC_WindContCurrLimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindTurbineType3or4IEC.WindContCurrLimIEC' kind='element'"
     * @generated
     */
    WindContCurrLimIEC getWindContCurrLimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Curr Lim IEC</em>' reference.
     * @see #isSetWindContCurrLimIEC()
     * @see #unsetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @generated
     */
    void setWindContCurrLimIEC( WindContCurrLimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    void unsetWindContCurrLimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Curr Lim IEC</em>' reference is set.
     * @see #unsetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    boolean isSetWindContCurrLimIEC();

    /**
     * Returns the value of the '<em><b>WInd Cont QIEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WInd Cont QIEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WInd Cont QIEC</em>' reference.
     * @see #isSetWIndContQIEC()
     * @see #unsetWIndContQIEC()
     * @see #setWIndContQIEC(WindContQIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindTurbineType3or4IEC_WIndContQIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContQIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindTurbineType3or4IEC.WIndContQIEC' kind='element'"
     * @generated
     */
    WindContQIEC getWIndContQIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WInd Cont QIEC</em>' reference.
     * @see #isSetWIndContQIEC()
     * @see #unsetWIndContQIEC()
     * @see #getWIndContQIEC()
     * @generated
     */
    void setWIndContQIEC( WindContQIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWIndContQIEC()
     * @see #getWIndContQIEC()
     * @see #setWIndContQIEC(WindContQIEC)
     * @generated
     */
    void unsetWIndContQIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>WInd Cont QIEC</em>' reference is set.
     * @see #unsetWIndContQIEC()
     * @see #getWIndContQIEC()
     * @see #setWIndContQIEC(WindContQIEC)
     * @generated
     */
    boolean isSetWIndContQIEC();

} // WindTurbineType3or4IEC
