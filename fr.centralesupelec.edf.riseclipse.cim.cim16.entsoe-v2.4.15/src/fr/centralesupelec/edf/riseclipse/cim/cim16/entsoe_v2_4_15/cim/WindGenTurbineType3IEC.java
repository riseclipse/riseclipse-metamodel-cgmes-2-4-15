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
 * A representation of the model object '<em><b>Wind Gen Turbine Type3 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDipmax <em>Dipmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDiqmax <em>Diqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindAeroLinearIEC <em>Wind Aero Linear IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType3IEC()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindGenTurbineType3IEC extends WindTurbineType3or4IEC {
    /**
     * Returns the value of the '<em><b>Dipmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dipmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dipmax</em>' attribute.
     * @see #isSetDipmax()
     * @see #unsetDipmax()
     * @see #setDipmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType3IEC_Dipmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindGenTurbineType3IEC.dipmax' kind='element'"
     * @generated
     */
    Float getDipmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDipmax <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dipmax</em>' attribute.
     * @see #isSetDipmax()
     * @see #unsetDipmax()
     * @see #getDipmax()
     * @generated
     */
    void setDipmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDipmax <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDipmax()
     * @see #getDipmax()
     * @see #setDipmax(Float)
     * @generated
     */
    void unsetDipmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDipmax <em>Dipmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dipmax</em>' attribute is set.
     * @see #unsetDipmax()
     * @see #getDipmax()
     * @see #setDipmax(Float)
     * @generated
     */
    boolean isSetDipmax();

    /**
     * Returns the value of the '<em><b>Diqmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diqmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diqmax</em>' attribute.
     * @see #isSetDiqmax()
     * @see #unsetDiqmax()
     * @see #setDiqmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType3IEC_Diqmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindGenTurbineType3IEC.diqmax' kind='element'"
     * @generated
     */
    Float getDiqmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDiqmax <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diqmax</em>' attribute.
     * @see #isSetDiqmax()
     * @see #unsetDiqmax()
     * @see #getDiqmax()
     * @generated
     */
    void setDiqmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDiqmax <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiqmax()
     * @see #getDiqmax()
     * @see #setDiqmax(Float)
     * @generated
     */
    void unsetDiqmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getDiqmax <em>Diqmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diqmax</em>' attribute is set.
     * @see #unsetDiqmax()
     * @see #getDiqmax()
     * @see #setDiqmax(Float)
     * @generated
     */
    boolean isSetDiqmax();

    /**
     * Returns the value of the '<em><b>Wind Aero Linear IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Aero Linear IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Aero Linear IEC</em>' reference.
     * @see #isSetWindAeroLinearIEC()
     * @see #unsetWindAeroLinearIEC()
     * @see #setWindAeroLinearIEC(WindAeroLinearIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType3IEC_WindAeroLinearIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindAeroLinearIEC#getWindGenTurbineType3IEC
     * @model opposite="WindGenTurbineType3IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindGenTurbineType3IEC.WindAeroLinearIEC' kind='element'"
     * @generated
     */
    WindAeroLinearIEC getWindAeroLinearIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindAeroLinearIEC <em>Wind Aero Linear IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Aero Linear IEC</em>' reference.
     * @see #isSetWindAeroLinearIEC()
     * @see #unsetWindAeroLinearIEC()
     * @see #getWindAeroLinearIEC()
     * @generated
     */
    void setWindAeroLinearIEC( WindAeroLinearIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindAeroLinearIEC <em>Wind Aero Linear IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindAeroLinearIEC()
     * @see #getWindAeroLinearIEC()
     * @see #setWindAeroLinearIEC(WindAeroLinearIEC)
     * @generated
     */
    void unsetWindAeroLinearIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindAeroLinearIEC <em>Wind Aero Linear IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Aero Linear IEC</em>' reference is set.
     * @see #unsetWindAeroLinearIEC()
     * @see #getWindAeroLinearIEC()
     * @see #setWindAeroLinearIEC(WindAeroLinearIEC)
     * @generated
     */
    boolean isSetWindAeroLinearIEC();

    /**
     * Returns the value of the '<em><b>Wind Mech IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Mech IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType3IEC_WindMechIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindMechIEC#getWindGenTurbineType3IEC
     * @model opposite="WindGenTurbineType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindGenTurbineType3IEC.WindMechIEC' kind='element'"
     * @generated
     */
    WindMechIEC getWindMechIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @generated
     */
    void setWindMechIEC( WindMechIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    void unsetWindMechIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Mech IEC</em>' reference is set.
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    boolean isSetWindMechIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont PType3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont PType3 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont PType3 IEC</em>' reference.
     * @see #isSetWindContPType3IEC()
     * @see #unsetWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType3IEC_WindContPType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC#getWindGenTurbineType3IEC
     * @model opposite="WindGenTurbineType3IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindGenTurbineType3IEC.WindContPType3IEC' kind='element'"
     * @generated
     */
    WindContPType3IEC getWindContPType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont PType3 IEC</em>' reference.
     * @see #isSetWindContPType3IEC()
     * @see #unsetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @generated
     */
    void setWindContPType3IEC( WindContPType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @generated
     */
    void unsetWindContPType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont PType3 IEC</em>' reference is set.
     * @see #unsetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @generated
     */
    boolean isSetWindContPType3IEC();

    /**
     * Returns the value of the '<em><b>Wind Cont Pitch Angle IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPitchAngleIEC#getWindGenTurbineType3IEC <em>Wind Gen Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont Pitch Angle IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont Pitch Angle IEC</em>' reference.
     * @see #isSetWindContPitchAngleIEC()
     * @see #unsetWindContPitchAngleIEC()
     * @see #setWindContPitchAngleIEC(WindContPitchAngleIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindGenTurbineType3IEC_WindContPitchAngleIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPitchAngleIEC#getWindGenTurbineType3IEC
     * @model opposite="WindGenTurbineType3IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindGenTurbineType3IEC.WindContPitchAngleIEC' kind='element'"
     * @generated
     */
    WindContPitchAngleIEC getWindContPitchAngleIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Pitch Angle IEC</em>' reference.
     * @see #isSetWindContPitchAngleIEC()
     * @see #unsetWindContPitchAngleIEC()
     * @see #getWindContPitchAngleIEC()
     * @generated
     */
    void setWindContPitchAngleIEC( WindContPitchAngleIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPitchAngleIEC()
     * @see #getWindContPitchAngleIEC()
     * @see #setWindContPitchAngleIEC(WindContPitchAngleIEC)
     * @generated
     */
    void unsetWindContPitchAngleIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindGenTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Pitch Angle IEC</em>' reference is set.
     * @see #unsetWindContPitchAngleIEC()
     * @see #getWindContPitchAngleIEC()
     * @see #setWindContPitchAngleIEC(WindContPitchAngleIEC)
     * @generated
     */
    boolean isSetWindContPitchAngleIEC();

} // WindGenTurbineType3IEC
