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
 * A representation of the model object '<em><b>Wind Mech IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getCdrt <em>Cdrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHgen <em>Hgen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHwtr <em>Hwtr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getKdrt <em>Kdrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindMechIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Cdrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cdrt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cdrt</em>' attribute.
     * @see #isSetCdrt()
     * @see #unsetCdrt()
     * @see #setCdrt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC_Cdrt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindMechIEC.cdrt' kind='element'"
     * @generated
     */
    Float getCdrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getCdrt <em>Cdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cdrt</em>' attribute.
     * @see #isSetCdrt()
     * @see #unsetCdrt()
     * @see #getCdrt()
     * @generated
     */
    void setCdrt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getCdrt <em>Cdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCdrt()
     * @see #getCdrt()
     * @see #setCdrt(Float)
     * @generated
     */
    void unsetCdrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getCdrt <em>Cdrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cdrt</em>' attribute is set.
     * @see #unsetCdrt()
     * @see #getCdrt()
     * @see #setCdrt(Float)
     * @generated
     */
    boolean isSetCdrt();

    /**
     * Returns the value of the '<em><b>Hgen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hgen</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hgen</em>' attribute.
     * @see #isSetHgen()
     * @see #unsetHgen()
     * @see #setHgen(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC_Hgen()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindMechIEC.hgen' kind='element'"
     * @generated
     */
    Float getHgen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHgen <em>Hgen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hgen</em>' attribute.
     * @see #isSetHgen()
     * @see #unsetHgen()
     * @see #getHgen()
     * @generated
     */
    void setHgen( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHgen <em>Hgen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHgen()
     * @see #getHgen()
     * @see #setHgen(Float)
     * @generated
     */
    void unsetHgen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHgen <em>Hgen</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hgen</em>' attribute is set.
     * @see #unsetHgen()
     * @see #getHgen()
     * @see #setHgen(Float)
     * @generated
     */
    boolean isSetHgen();

    /**
     * Returns the value of the '<em><b>Hwtr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hwtr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hwtr</em>' attribute.
     * @see #isSetHwtr()
     * @see #unsetHwtr()
     * @see #setHwtr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC_Hwtr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindMechIEC.hwtr' kind='element'"
     * @generated
     */
    Float getHwtr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHwtr <em>Hwtr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hwtr</em>' attribute.
     * @see #isSetHwtr()
     * @see #unsetHwtr()
     * @see #getHwtr()
     * @generated
     */
    void setHwtr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHwtr <em>Hwtr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHwtr()
     * @see #getHwtr()
     * @see #setHwtr(Float)
     * @generated
     */
    void unsetHwtr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getHwtr <em>Hwtr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hwtr</em>' attribute is set.
     * @see #unsetHwtr()
     * @see #getHwtr()
     * @see #setHwtr(Float)
     * @generated
     */
    boolean isSetHwtr();

    /**
     * Returns the value of the '<em><b>Kdrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kdrt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kdrt</em>' attribute.
     * @see #isSetKdrt()
     * @see #unsetKdrt()
     * @see #setKdrt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC_Kdrt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindMechIEC.kdrt' kind='element'"
     * @generated
     */
    Float getKdrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getKdrt <em>Kdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdrt</em>' attribute.
     * @see #isSetKdrt()
     * @see #unsetKdrt()
     * @see #getKdrt()
     * @generated
     */
    void setKdrt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getKdrt <em>Kdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdrt()
     * @see #getKdrt()
     * @see #setKdrt(Float)
     * @generated
     */
    void unsetKdrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getKdrt <em>Kdrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdrt</em>' attribute is set.
     * @see #unsetKdrt()
     * @see #getKdrt()
     * @see #setKdrt(Float)
     * @generated
     */
    boolean isSetKdrt();

    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC_WindGenTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindMechIEC
     * @model opposite="WindMechIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindMechIEC.WindGenTurbineType3IEC' kind='element'"
     * @generated
     */
    WindGenTurbineType3IEC getWindGenTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType3IEC()
     * @see #getWindGenTurbineType3IEC()
     * @see #setWindGenTurbineType3IEC(WindGenTurbineType3IEC)
     * @generated
     */
    void unsetWindGenTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType3IEC()
     * @see #getWindGenTurbineType3IEC()
     * @see #setWindGenTurbineType3IEC(WindGenTurbineType3IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType3IEC();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type1or2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType1or2IEC#getWindMechIEC <em>Wind Mech IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type1or2 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC_WindTurbineType1or2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType1or2IEC#getWindMechIEC
     * @model opposite="WindMechIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindMechIEC.WindTurbineType1or2IEC' kind='element'"
     * @generated
     */
    WindTurbineType1or2IEC getWindTurbineType1or2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @generated
     */
    void setWindTurbineType1or2IEC( WindTurbineType1or2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    void unsetWindTurbineType1or2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference is set.
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    boolean isSetWindTurbineType1or2IEC();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4bIEC#getWindMechIEC <em>Wind Mech IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type4b IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindMechIEC_WindTurbineType4bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindTurbineType4bIEC#getWindMechIEC
     * @model opposite="WindMechIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindMechIEC.WindTurbineType4bIEC' kind='element'"
     * @generated
     */
    WindTurbineType4bIEC getWindTurbineType4bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @generated
     */
    void setWindTurbineType4bIEC( WindTurbineType4bIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    void unsetWindTurbineType4bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4b IEC</em>' reference is set.
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    boolean isSetWindTurbineType4bIEC();

} // WindMechIEC
