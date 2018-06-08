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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getLimitType <em>Limit Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationalLimitType()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface OperationalLimitType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Acceptable Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Acceptable Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Acceptable Duration</em>' attribute.
     * @see #isSetAcceptableDuration()
     * @see #unsetAcceptableDuration()
     * @see #setAcceptableDuration(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationalLimitType_AcceptableDuration()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='OperationalLimitType.acceptableDuration' kind='element'"
     * @generated
     */
    Float getAcceptableDuration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Acceptable Duration</em>' attribute.
     * @see #isSetAcceptableDuration()
     * @see #unsetAcceptableDuration()
     * @see #getAcceptableDuration()
     * @generated
     */
    void setAcceptableDuration( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAcceptableDuration()
     * @see #getAcceptableDuration()
     * @see #setAcceptableDuration(Float)
     * @generated
     */
    void unsetAcceptableDuration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Acceptable Duration</em>' attribute is set.
     * @see #unsetAcceptableDuration()
     * @see #getAcceptableDuration()
     * @see #setAcceptableDuration(Float)
     * @generated
     */
    boolean isSetAcceptableDuration();

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitDirectionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitDirectionKind
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #setDirection(OperationalLimitDirectionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationalLimitType_Direction()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='OperationalLimitType.direction' kind='element'"
     * @generated
     */
    OperationalLimitDirectionKind getDirection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitDirectionKind
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #getDirection()
     * @generated
     */
    void setDirection( OperationalLimitDirectionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirection()
     * @see #getDirection()
     * @see #setDirection(OperationalLimitDirectionKind)
     * @generated
     */
    void unsetDirection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getDirection <em>Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Direction</em>' attribute is set.
     * @see #unsetDirection()
     * @see #getDirection()
     * @see #setDirection(OperationalLimitDirectionKind)
     * @generated
     */
    boolean isSetDirection();

    /**
     * Returns the value of the '<em><b>Operational Limit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Limit</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Limit</em>' reference list.
     * @see #isSetOperationalLimit()
     * @see #unsetOperationalLimit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationalLimitType_OperationalLimit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimit#getOperationalLimitType
     * @model opposite="OperationalLimitType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='OperationalLimitType.OperationalLimit' kind='element'"
     * @generated
     */
    EList< OperationalLimit > getOperationalLimit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimit()
     * @see #getOperationalLimit()
     * @generated
     */
    void unsetOperationalLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit</em>' reference list is set.
     * @see #unsetOperationalLimit()
     * @see #getOperationalLimit()
     * @generated
     */
    boolean isSetOperationalLimit();

    /**
     * Returns the value of the '<em><b>Limit Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LimitTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limit Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Limit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LimitTypeKind
     * @see #setLimitType(LimitTypeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getOperationalLimitType_LimitType()
     * @model ordered="false"
     *        extendedMetaData="namespace='http://entsoe.eu/CIM/SchemaExtension/3/1' name='OperationalLimitType.limitType' kind='element'"
     * @generated
     */
    LimitTypeKind getLimitType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.OperationalLimitType#getLimitType <em>Limit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.LimitTypeKind
     * @see #getLimitType()
     * @generated
     */
    void setLimitType( LimitTypeKind value );

} // OperationalLimitType