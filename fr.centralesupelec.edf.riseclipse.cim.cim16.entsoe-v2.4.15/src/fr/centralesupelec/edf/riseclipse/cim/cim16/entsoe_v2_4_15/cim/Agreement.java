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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getSignDate <em>Sign Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAgreement()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface Agreement extends Document {
    /**
     * Returns the value of the '<em><b>Sign Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sign Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sign Date</em>' attribute.
     * @see #isSetSignDate()
     * @see #unsetSignDate()
     * @see #setSignDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAgreement_SignDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Agreement.signDate' kind='element'"
     * @generated
     */
    Date getSignDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getSignDate <em>Sign Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sign Date</em>' attribute.
     * @see #isSetSignDate()
     * @see #unsetSignDate()
     * @see #getSignDate()
     * @generated
     */
    void setSignDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getSignDate <em>Sign Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSignDate()
     * @see #getSignDate()
     * @see #setSignDate(Date)
     * @generated
     */
    void unsetSignDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getSignDate <em>Sign Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sign Date</em>' attribute is set.
     * @see #unsetSignDate()
     * @see #getSignDate()
     * @see #setSignDate(Date)
     * @generated
     */
    boolean isSetSignDate();

    /**
     * Returns the value of the '<em><b>Validity Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Validity Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Validity Interval</em>' containment reference.
     * @see #isSetValidityInterval()
     * @see #unsetValidityInterval()
     * @see #setValidityInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAgreement_ValidityInterval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='Agreement.validityInterval' kind='element'"
     * @generated
     */
    DateTimeInterval getValidityInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getValidityInterval <em>Validity Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validity Interval</em>' containment reference.
     * @see #isSetValidityInterval()
     * @see #unsetValidityInterval()
     * @see #getValidityInterval()
     * @generated
     */
    void setValidityInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getValidityInterval <em>Validity Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValidityInterval()
     * @see #getValidityInterval()
     * @see #setValidityInterval(DateTimeInterval)
     * @generated
     */
    void unsetValidityInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Agreement#getValidityInterval <em>Validity Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Validity Interval</em>' containment reference is set.
     * @see #unsetValidityInterval()
     * @see #getValidityInterval()
     * @see #setValidityInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetValidityInterval();

} // Agreement
