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
 * A representation of the model object '<em><b>Wind Dynamics Lookup Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getInput <em>Input</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface WindDynamicsLookupTable extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #isSetInput()
     * @see #unsetInput()
     * @see #setInput(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_Input()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.input' kind='element'"
     * @generated
     */
    Float getInput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #isSetInput()
     * @see #unsetInput()
     * @see #getInput()
     * @generated
     */
    void setInput( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInput()
     * @see #getInput()
     * @see #setInput(Float)
     * @generated
     */
    void unsetInput();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getInput <em>Input</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input</em>' attribute is set.
     * @see #unsetInput()
     * @see #getInput()
     * @see #setInput(Float)
     * @generated
     */
    boolean isSetInput();

    /**
     * Returns the value of the '<em><b>Lookup Table Function Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindLookupTableFunctionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lookup Table Function Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lookup Table Function Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindLookupTableFunctionKind
     * @see #isSetLookupTableFunctionType()
     * @see #unsetLookupTableFunctionType()
     * @see #setLookupTableFunctionType(WindLookupTableFunctionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_LookupTableFunctionType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.lookupTableFunctionType' kind='element'"
     * @generated
     */
    WindLookupTableFunctionKind getLookupTableFunctionType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lookup Table Function Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindLookupTableFunctionKind
     * @see #isSetLookupTableFunctionType()
     * @see #unsetLookupTableFunctionType()
     * @see #getLookupTableFunctionType()
     * @generated
     */
    void setLookupTableFunctionType( WindLookupTableFunctionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLookupTableFunctionType()
     * @see #getLookupTableFunctionType()
     * @see #setLookupTableFunctionType(WindLookupTableFunctionKind)
     * @generated
     */
    void unsetLookupTableFunctionType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lookup Table Function Type</em>' attribute is set.
     * @see #unsetLookupTableFunctionType()
     * @see #getLookupTableFunctionType()
     * @see #setLookupTableFunctionType(WindLookupTableFunctionKind)
     * @generated
     */
    boolean isSetLookupTableFunctionType();

    /**
     * Returns the value of the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' attribute.
     * @see #isSetOutput()
     * @see #unsetOutput()
     * @see #setOutput(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_Output()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.output' kind='element'"
     * @generated
     */
    Float getOutput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #isSetOutput()
     * @see #unsetOutput()
     * @see #getOutput()
     * @generated
     */
    void setOutput( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutput()
     * @see #getOutput()
     * @see #setOutput(Float)
     * @generated
     */
    void unsetOutput();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Output</em>' attribute is set.
     * @see #unsetOutput()
     * @see #getOutput()
     * @see #setOutput(Float)
     * @generated
     */
    boolean isSetOutput();

    /**
     * Returns the value of the '<em><b>Sequence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence</em>' attribute.
     * @see #isSetSequence()
     * @see #unsetSequence()
     * @see #setSequence(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_Sequence()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.sequence' kind='element'"
     * @generated
     */
    Integer getSequence();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence</em>' attribute.
     * @see #isSetSequence()
     * @see #unsetSequence()
     * @see #getSequence()
     * @generated
     */
    void setSequence( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequence()
     * @see #getSequence()
     * @see #setSequence(Integer)
     * @generated
     */
    void unsetSequence();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sequence</em>' attribute is set.
     * @see #unsetSequence()
     * @see #getSequence()
     * @see #setSequence(Integer)
     * @generated
     */
    boolean isSetSequence();

    /**
     * Returns the value of the '<em><b>Wind Plant Freq Pcontrol IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference.
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_WindPlantFreqPcontrolIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.WindPlantFreqPcontrolIEC' kind='element'"
     * @generated
     */
    WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference.
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @generated
     */
    void setWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    void unsetWindPlantFreqPcontrolIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference is set.
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    boolean isSetWindPlantFreqPcontrolIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont Rotor RIEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont Rotor RIEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont Rotor RIEC</em>' reference.
     * @see #isSetWindContRotorRIEC()
     * @see #unsetWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_WindContRotorRIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContRotorRIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.WindContRotorRIEC' kind='element'"
     * @generated
     */
    WindContRotorRIEC getWindContRotorRIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Rotor RIEC</em>' reference.
     * @see #isSetWindContRotorRIEC()
     * @see #unsetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @generated
     */
    void setWindContRotorRIEC( WindContRotorRIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @generated
     */
    void unsetWindContRotorRIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Rotor RIEC</em>' reference is set.
     * @see #unsetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @generated
     */
    boolean isSetWindContRotorRIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont PType3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_WindContPType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContPType3IEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.WindContPType3IEC' kind='element'"
     * @generated
     */
    WindContPType3IEC getWindContPType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @generated
     */
    void unsetWindContPType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference is set.
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
     * Returns the value of the '<em><b>Wind Cont Curr Lim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContCurrLimIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getWindDynamicsLookupTable_WindContCurrLimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindContCurrLimIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='WindDynamicsLookupTable.WindContCurrLimIEC' kind='element'"
     * @generated
     */
    WindContCurrLimIEC getWindContCurrLimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    void unsetWindContCurrLimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Curr Lim IEC</em>' reference is set.
     * @see #unsetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    boolean isSetWindContCurrLimIEC();

} // WindDynamicsLookupTable
