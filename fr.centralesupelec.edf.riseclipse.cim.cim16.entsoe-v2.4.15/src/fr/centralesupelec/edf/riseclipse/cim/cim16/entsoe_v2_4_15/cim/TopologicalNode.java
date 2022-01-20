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
 * A representation of the model object '<em><b>Topological Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getPInjection <em>PInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getQInjection <em>QInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#isBoundaryPoint <em>Boundary Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getFromEndIsoCode <em>From End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getFromEndName <em>From End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getFromEndNameTso <em>From End Name Tso</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getToEndIsoCode <em>To End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getToEndName <em>To End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getToEndNameTso <em>To End Name Tso</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface TopologicalNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>PInjection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PInjection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PInjection</em>' attribute.
     * @see #isSetPInjection()
     * @see #unsetPInjection()
     * @see #setPInjection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_PInjection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.pInjection' kind='element'"
     * @generated
     */
    Float getPInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getPInjection <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PInjection</em>' attribute.
     * @see #isSetPInjection()
     * @see #unsetPInjection()
     * @see #getPInjection()
     * @generated
     */
    void setPInjection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getPInjection <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPInjection()
     * @see #getPInjection()
     * @see #setPInjection(Float)
     * @generated
     */
    void unsetPInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getPInjection <em>PInjection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PInjection</em>' attribute is set.
     * @see #unsetPInjection()
     * @see #getPInjection()
     * @see #setPInjection(Float)
     * @generated
     */
    boolean isSetPInjection();

    /**
     * Returns the value of the '<em><b>QInjection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QInjection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QInjection</em>' attribute.
     * @see #isSetQInjection()
     * @see #unsetQInjection()
     * @see #setQInjection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_QInjection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.qInjection' kind='element'"
     * @generated
     */
    Float getQInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getQInjection <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QInjection</em>' attribute.
     * @see #isSetQInjection()
     * @see #unsetQInjection()
     * @see #getQInjection()
     * @generated
     */
    void setQInjection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getQInjection <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQInjection()
     * @see #getQInjection()
     * @see #setQInjection(Float)
     * @generated
     */
    void unsetQInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getQInjection <em>QInjection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QInjection</em>' attribute is set.
     * @see #unsetQInjection()
     * @see #getQInjection()
     * @see #setQInjection(Float)
     * @generated
     */
    boolean isSetQInjection();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Terminal#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminal</em>' reference list.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Terminal#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.Terminal' kind='element'"
     * @generated
     */
    EList< Terminal > getTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getTerminal <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getTerminal <em>Terminal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference list is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Sv Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SvVoltage#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Voltage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Voltage</em>' reference.
     * @see #isSetSvVoltage()
     * @see #unsetSvVoltage()
     * @see #setSvVoltage(SvVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_SvVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SvVoltage#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.SvVoltage' kind='element'"
     * @generated
     */
    SvVoltage getSvVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Voltage</em>' reference.
     * @see #isSetSvVoltage()
     * @see #unsetSvVoltage()
     * @see #getSvVoltage()
     * @generated
     */
    void setSvVoltage( SvVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvVoltage()
     * @see #getSvVoltage()
     * @see #setSvVoltage(SvVoltage)
     * @generated
     */
    void unsetSvVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Voltage</em>' reference is set.
     * @see #unsetSvVoltage()
     * @see #getSvVoltage()
     * @see #setSvVoltage(SvVoltage)
     * @generated
     */
    boolean isSetSvVoltage();

    /**
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.BaseVoltage#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.BaseVoltage#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.BaseVoltage' kind='element'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @generated
     */
    void setBaseVoltage( BaseVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Voltage</em>' reference is set.
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    boolean isSetBaseVoltage();

    /**
     * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Nodes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Nodes</em>' reference list.
     * @see #isSetConnectivityNodes()
     * @see #unsetConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_ConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNode#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.ConnectivityNodes' kind='element'"
     * @generated
     */
    EList< ConnectivityNode > getConnectivityNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    void unsetConnectivityNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Nodes</em>' reference list is set.
     * @see #unsetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    boolean isSetConnectivityNodes();

    /**
     * Returns the value of the '<em><b>Angle Ref Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle Ref Topological Island</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle Ref Topological Island</em>' reference.
     * @see #isSetAngleRefTopologicalIsland()
     * @see #unsetAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_AngleRefTopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalIsland#getAngleRefTopologicalNode
     * @model opposite="AngleRefTopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.AngleRefTopologicalIsland' kind='element'"
     * @generated
     */
    TopologicalIsland getAngleRefTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle Ref Topological Island</em>' reference.
     * @see #isSetAngleRefTopologicalIsland()
     * @see #unsetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @generated
     */
    void setAngleRefTopologicalIsland( TopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @generated
     */
    void unsetAngleRefTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Angle Ref Topological Island</em>' reference is set.
     * @see #unsetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @generated
     */
    boolean isSetAngleRefTopologicalIsland();

    /**
     * Returns the value of the '<em><b>Connectivity Node Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Node Container</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Node Container</em>' reference.
     * @see #isSetConnectivityNodeContainer()
     * @see #unsetConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_ConnectivityNodeContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ConnectivityNodeContainer#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.ConnectivityNodeContainer' kind='element'"
     * @generated
     */
    ConnectivityNodeContainer getConnectivityNodeContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connectivity Node Container</em>' reference.
     * @see #isSetConnectivityNodeContainer()
     * @see #unsetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @generated
     */
    void setConnectivityNodeContainer( ConnectivityNodeContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    void unsetConnectivityNodeContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node Container</em>' reference is set.
     * @see #unsetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    boolean isSetConnectivityNodeContainer();

    /**
     * Returns the value of the '<em><b>Sv Injection</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SvInjection#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Injection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Injection</em>' reference.
     * @see #isSetSvInjection()
     * @see #unsetSvInjection()
     * @see #setSvInjection(SvInjection)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_SvInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.SvInjection#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.SvInjection' kind='element'"
     * @generated
     */
    SvInjection getSvInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Injection</em>' reference.
     * @see #isSetSvInjection()
     * @see #unsetSvInjection()
     * @see #getSvInjection()
     * @generated
     */
    void setSvInjection( SvInjection value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvInjection()
     * @see #getSvInjection()
     * @see #setSvInjection(SvInjection)
     * @generated
     */
    void unsetSvInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Injection</em>' reference is set.
     * @see #unsetSvInjection()
     * @see #getSvInjection()
     * @see #setSvInjection(SvInjection)
     * @generated
     */
    boolean isSetSvInjection();

    /**
     * Returns the value of the '<em><b>Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topological Island</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topological Island</em>' reference.
     * @see #isSetTopologicalIsland()
     * @see #unsetTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_TopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalIsland#getTopologicalNodes
     * @model opposite="TopologicalNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='TopologicalNode.TopologicalIsland' kind='element'"
     * @generated
     */
    TopologicalIsland getTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topological Island</em>' reference.
     * @see #isSetTopologicalIsland()
     * @see #unsetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @generated
     */
    void setTopologicalIsland( TopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @generated
     */
    void unsetTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Island</em>' reference is set.
     * @see #unsetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @generated
     */
    boolean isSetTopologicalIsland();

    /**
     * Returns the value of the '<em><b>Boundary Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Boundary Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Boundary Point</em>' attribute.
     * @see #setBoundaryPoint(boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_BoundaryPoint()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='TopologicalNode.boundaryPoint' kind='element'"
     * @generated
     */
    boolean isBoundaryPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#isBoundaryPoint <em>Boundary Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Boundary Point</em>' attribute.
     * @see #isBoundaryPoint()
     * @generated
     */
    void setBoundaryPoint( boolean value );

    /**
     * Returns the value of the '<em><b>From End Iso Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From End Iso Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From End Iso Code</em>' attribute.
     * @see #setFromEndIsoCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_FromEndIsoCode()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='TopologicalNode.fromEndIsoCode' kind='element'"
     * @generated
     */
    String getFromEndIsoCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getFromEndIsoCode <em>From End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From End Iso Code</em>' attribute.
     * @see #getFromEndIsoCode()
     * @generated
     */
    void setFromEndIsoCode( String value );

    /**
     * Returns the value of the '<em><b>From End Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From End Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From End Name</em>' attribute.
     * @see #setFromEndName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_FromEndName()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='TopologicalNode.fromEndName' kind='element'"
     * @generated
     */
    String getFromEndName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getFromEndName <em>From End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From End Name</em>' attribute.
     * @see #getFromEndName()
     * @generated
     */
    void setFromEndName( String value );

    /**
     * Returns the value of the '<em><b>From End Name Tso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From End Name Tso</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From End Name Tso</em>' attribute.
     * @see #setFromEndNameTso(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_FromEndNameTso()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='TopologicalNode.fromEndNameTso' kind='element'"
     * @generated
     */
    String getFromEndNameTso();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getFromEndNameTso <em>From End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From End Name Tso</em>' attribute.
     * @see #getFromEndNameTso()
     * @generated
     */
    void setFromEndNameTso( String value );

    /**
     * Returns the value of the '<em><b>To End Iso Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To End Iso Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To End Iso Code</em>' attribute.
     * @see #setToEndIsoCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_ToEndIsoCode()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='TopologicalNode.toEndIsoCode' kind='element'"
     * @generated
     */
    String getToEndIsoCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getToEndIsoCode <em>To End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To End Iso Code</em>' attribute.
     * @see #getToEndIsoCode()
     * @generated
     */
    void setToEndIsoCode( String value );

    /**
     * Returns the value of the '<em><b>To End Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To End Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To End Name</em>' attribute.
     * @see #setToEndName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_ToEndName()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='TopologicalNode.toEndName' kind='element'"
     * @generated
     */
    String getToEndName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getToEndName <em>To End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To End Name</em>' attribute.
     * @see #getToEndName()
     * @generated
     */
    void setToEndName( String value );

    /**
     * Returns the value of the '<em><b>To End Name Tso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To End Name Tso</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To End Name Tso</em>' attribute.
     * @see #setToEndNameTso(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getTopologicalNode_ToEndNameTso()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='TopologicalNode.toEndNameTso' kind='element'"
     * @generated
     */
    String getToEndNameTso();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.TopologicalNode#getToEndNameTso <em>To End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To End Name Tso</em>' attribute.
     * @see #getToEndNameTso()
     * @generated
     */
    void setToEndNameTso( String value );

} // TopologicalNode
