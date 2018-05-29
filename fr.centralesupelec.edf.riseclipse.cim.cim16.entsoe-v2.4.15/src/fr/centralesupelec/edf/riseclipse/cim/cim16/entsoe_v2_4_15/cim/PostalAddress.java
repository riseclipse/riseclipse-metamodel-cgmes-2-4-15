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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPoBox <em>Po Box</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getTownDetail <em>Town Detail</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPostalAddress()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface PostalAddress extends EObject {
    /**
     * Returns the value of the '<em><b>Po Box</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Po Box</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Po Box</em>' attribute.
     * @see #isSetPoBox()
     * @see #unsetPoBox()
     * @see #setPoBox(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPostalAddress_PoBox()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PostalAddress.poBox' kind='element'"
     * @generated
     */
    String getPoBox();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPoBox <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Po Box</em>' attribute.
     * @see #isSetPoBox()
     * @see #unsetPoBox()
     * @see #getPoBox()
     * @generated
     */
    void setPoBox( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPoBox <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPoBox()
     * @see #getPoBox()
     * @see #setPoBox(String)
     * @generated
     */
    void unsetPoBox();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPoBox <em>Po Box</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Po Box</em>' attribute is set.
     * @see #unsetPoBox()
     * @see #getPoBox()
     * @see #setPoBox(String)
     * @generated
     */
    boolean isSetPoBox();

    /**
     * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Postal Code</em>' attribute.
     * @see #isSetPostalCode()
     * @see #unsetPostalCode()
     * @see #setPostalCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPostalAddress_PostalCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PostalAddress.postalCode' kind='element'"
     * @generated
     */
    String getPostalCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Postal Code</em>' attribute.
     * @see #isSetPostalCode()
     * @see #unsetPostalCode()
     * @see #getPostalCode()
     * @generated
     */
    void setPostalCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPostalCode()
     * @see #getPostalCode()
     * @see #setPostalCode(String)
     * @generated
     */
    void unsetPostalCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Postal Code</em>' attribute is set.
     * @see #unsetPostalCode()
     * @see #getPostalCode()
     * @see #setPostalCode(String)
     * @generated
     */
    boolean isSetPostalCode();

    /**
     * Returns the value of the '<em><b>Street Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Street Detail</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Street Detail</em>' containment reference.
     * @see #isSetStreetDetail()
     * @see #unsetStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPostalAddress_StreetDetail()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PostalAddress.streetDetail' kind='element'"
     * @generated
     */
    StreetDetail getStreetDetail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getStreetDetail <em>Street Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Street Detail</em>' containment reference.
     * @see #isSetStreetDetail()
     * @see #unsetStreetDetail()
     * @see #getStreetDetail()
     * @generated
     */
    void setStreetDetail( StreetDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getStreetDetail <em>Street Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStreetDetail()
     * @see #getStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @generated
     */
    void unsetStreetDetail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getStreetDetail <em>Street Detail</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Street Detail</em>' containment reference is set.
     * @see #unsetStreetDetail()
     * @see #getStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @generated
     */
    boolean isSetStreetDetail();

    /**
     * Returns the value of the '<em><b>Town Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Town Detail</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Town Detail</em>' containment reference.
     * @see #isSetTownDetail()
     * @see #unsetTownDetail()
     * @see #setTownDetail(TownDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getPostalAddress_TownDetail()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='PostalAddress.townDetail' kind='element'"
     * @generated
     */
    TownDetail getTownDetail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getTownDetail <em>Town Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Town Detail</em>' containment reference.
     * @see #isSetTownDetail()
     * @see #unsetTownDetail()
     * @see #getTownDetail()
     * @generated
     */
    void setTownDetail( TownDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getTownDetail <em>Town Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTownDetail()
     * @see #getTownDetail()
     * @see #setTownDetail(TownDetail)
     * @generated
     */
    void unsetTownDetail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PostalAddress#getTownDetail <em>Town Detail</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Town Detail</em>' containment reference is set.
     * @see #unsetTownDetail()
     * @see #getTownDetail()
     * @see #setTownDetail(TownDetail)
     * @generated
     */
    boolean isSetTownDetail();

} // PostalAddress
