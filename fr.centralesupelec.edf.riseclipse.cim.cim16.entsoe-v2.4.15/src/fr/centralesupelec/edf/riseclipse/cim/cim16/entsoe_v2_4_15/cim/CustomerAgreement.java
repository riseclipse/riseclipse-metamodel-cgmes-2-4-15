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
 * A representation of the model object '<em><b>Customer Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceLocations <em>Service Locations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getDemandResponsePrograms <em>Demand Response Programs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface CustomerAgreement extends Agreement {
    /**
     * Returns the value of the '<em><b>Load Mgmt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Mgmt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Mgmt</em>' attribute.
     * @see #isSetLoadMgmt()
     * @see #unsetLoadMgmt()
     * @see #setLoadMgmt(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_LoadMgmt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.loadMgmt' kind='element'"
     * @generated
     */
    String getLoadMgmt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Mgmt</em>' attribute.
     * @see #isSetLoadMgmt()
     * @see #unsetLoadMgmt()
     * @see #getLoadMgmt()
     * @generated
     */
    void setLoadMgmt( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadMgmt()
     * @see #getLoadMgmt()
     * @see #setLoadMgmt(String)
     * @generated
     */
    void unsetLoadMgmt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Mgmt</em>' attribute is set.
     * @see #unsetLoadMgmt()
     * @see #getLoadMgmt()
     * @see #setLoadMgmt(String)
     * @generated
     */
    boolean isSetLoadMgmt();

    /**
     * Returns the value of the '<em><b>Service Supplier</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServiceSupplier#getCustomerAgreements <em>Customer Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Supplier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Supplier</em>' reference.
     * @see #isSetServiceSupplier()
     * @see #unsetServiceSupplier()
     * @see #setServiceSupplier(ServiceSupplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_ServiceSupplier()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServiceSupplier#getCustomerAgreements
     * @model opposite="CustomerAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.ServiceSupplier' kind='element'"
     * @generated
     */
    ServiceSupplier getServiceSupplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Supplier</em>' reference.
     * @see #isSetServiceSupplier()
     * @see #unsetServiceSupplier()
     * @see #getServiceSupplier()
     * @generated
     */
    void setServiceSupplier( ServiceSupplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceSupplier()
     * @see #getServiceSupplier()
     * @see #setServiceSupplier(ServiceSupplier)
     * @generated
     */
    void unsetServiceSupplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Supplier</em>' reference is set.
     * @see #unsetServiceSupplier()
     * @see #getServiceSupplier()
     * @see #setServiceSupplier(ServiceSupplier)
     * @generated
     */
    boolean isSetServiceSupplier();

    /**
     * Returns the value of the '<em><b>Usage Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint#getCustomerAgreement <em>Customer Agreement</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Points</em>' reference list.
     * @see #isSetUsagePoints()
     * @see #unsetUsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_UsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UsagePoint#getCustomerAgreement
     * @model opposite="CustomerAgreement" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.UsagePoints' kind='element'"
     * @generated
     */
    EList< UsagePoint > getUsagePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getUsagePoints <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    void unsetUsagePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getUsagePoints <em>Usage Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Points</em>' reference list is set.
     * @see #unsetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    boolean isSetUsagePoints();

    /**
     * Returns the value of the '<em><b>Auxiliary Agreements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AuxiliaryAgreement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auxiliary Agreements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auxiliary Agreements</em>' reference list.
     * @see #isSetAuxiliaryAgreements()
     * @see #unsetAuxiliaryAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_AuxiliaryAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AuxiliaryAgreement#getCustomerAgreement
     * @model opposite="CustomerAgreement" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.AuxiliaryAgreements' kind='element'"
     * @generated
     */
    EList< AuxiliaryAgreement > getAuxiliaryAgreements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxiliaryAgreements()
     * @see #getAuxiliaryAgreements()
     * @generated
     */
    void unsetAuxiliaryAgreements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auxiliary Agreements</em>' reference list is set.
     * @see #unsetAuxiliaryAgreements()
     * @see #getAuxiliaryAgreements()
     * @generated
     */
    boolean isSetAuxiliaryAgreements();

    /**
     * Returns the value of the '<em><b>Demand Response Programs</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DemandResponseProgram}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DemandResponseProgram#getCustomerAgreements <em>Customer Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Demand Response Programs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Demand Response Programs</em>' reference list.
     * @see #isSetDemandResponsePrograms()
     * @see #unsetDemandResponsePrograms()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_DemandResponsePrograms()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.DemandResponseProgram#getCustomerAgreements
     * @model opposite="CustomerAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.DemandResponsePrograms' kind='element'"
     * @generated
     */
    EList< DemandResponseProgram > getDemandResponsePrograms();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getDemandResponsePrograms <em>Demand Response Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDemandResponsePrograms()
     * @see #getDemandResponsePrograms()
     * @generated
     */
    void unsetDemandResponsePrograms();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getDemandResponsePrograms <em>Demand Response Programs</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Demand Response Programs</em>' reference list is set.
     * @see #unsetDemandResponsePrograms()
     * @see #getDemandResponsePrograms()
     * @generated
     */
    boolean isSetDemandResponsePrograms();

    /**
     * Returns the value of the '<em><b>Customer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Customer#getCustomerAgreements <em>Customer Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #setCustomer(Customer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_Customer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Customer#getCustomerAgreements
     * @model opposite="CustomerAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.Customer' kind='element'"
     * @generated
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @generated
     */
    void setCustomer( Customer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    void unsetCustomer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomer <em>Customer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer</em>' reference is set.
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    boolean isSetCustomer();

    /**
     * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PricingStructure}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pricing Structures</em>' reference list.
     * @see #isSetPricingStructures()
     * @see #unsetPricingStructures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_PricingStructures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PricingStructure#getCustomerAgreements
     * @model opposite="CustomerAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.PricingStructures' kind='element'"
     * @generated
     */
    EList< PricingStructure > getPricingStructures();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPricingStructures()
     * @see #getPricingStructures()
     * @generated
     */
    void unsetPricingStructures();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pricing Structures</em>' reference list is set.
     * @see #unsetPricingStructures()
     * @see #getPricingStructures()
     * @generated
     */
    boolean isSetPricingStructures();

    /**
     * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter Readings</em>' reference list.
     * @see #isSetMeterReadings()
     * @see #unsetMeterReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_MeterReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MeterReading#getCustomerAgreement
     * @model opposite="CustomerAgreement" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.MeterReadings' kind='element'"
     * @generated
     */
    EList< MeterReading > getMeterReadings();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeterReadings()
     * @see #getMeterReadings()
     * @generated
     */
    void unsetMeterReadings();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter Readings</em>' reference list is set.
     * @see #unsetMeterReadings()
     * @see #getMeterReadings()
     * @generated
     */
    boolean isSetMeterReadings();

    /**
     * Returns the value of the '<em><b>Customer Account</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Account</em>' reference.
     * @see #isSetCustomerAccount()
     * @see #unsetCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_CustomerAccount()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAccount#getCustomerAgreements
     * @model opposite="CustomerAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.CustomerAccount' kind='element'"
     * @generated
     */
    CustomerAccount getCustomerAccount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Account</em>' reference.
     * @see #isSetCustomerAccount()
     * @see #unsetCustomerAccount()
     * @see #getCustomerAccount()
     * @generated
     */
    void setCustomerAccount( CustomerAccount value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAccount()
     * @see #getCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @generated
     */
    void unsetCustomerAccount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Account</em>' reference is set.
     * @see #unsetCustomerAccount()
     * @see #getCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @generated
     */
    boolean isSetCustomerAccount();

    /**
     * Returns the value of the '<em><b>Service Locations</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServiceLocation}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServiceLocation#getCustomerAgreements <em>Customer Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Locations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Locations</em>' reference list.
     * @see #isSetServiceLocations()
     * @see #unsetServiceLocations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_ServiceLocations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServiceLocation#getCustomerAgreements
     * @model opposite="CustomerAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.ServiceLocations' kind='element'"
     * @generated
     */
    EList< ServiceLocation > getServiceLocations();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceLocations <em>Service Locations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceLocations()
     * @see #getServiceLocations()
     * @generated
     */
    void unsetServiceLocations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceLocations <em>Service Locations</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Locations</em>' reference list is set.
     * @see #unsetServiceLocations()
     * @see #getServiceLocations()
     * @generated
     */
    boolean isSetServiceLocations();

    /**
     * Returns the value of the '<em><b>Service Category</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServiceCategory#getCustomerAgreements <em>Customer Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Category</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Category</em>' reference.
     * @see #isSetServiceCategory()
     * @see #unsetServiceCategory()
     * @see #setServiceCategory(ServiceCategory)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getCustomerAgreement_ServiceCategory()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ServiceCategory#getCustomerAgreements
     * @model opposite="CustomerAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='CustomerAgreement.ServiceCategory' kind='element'"
     * @generated
     */
    ServiceCategory getServiceCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceCategory <em>Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Category</em>' reference.
     * @see #isSetServiceCategory()
     * @see #unsetServiceCategory()
     * @see #getServiceCategory()
     * @generated
     */
    void setServiceCategory( ServiceCategory value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceCategory <em>Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceCategory()
     * @see #getServiceCategory()
     * @see #setServiceCategory(ServiceCategory)
     * @generated
     */
    void unsetServiceCategory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement#getServiceCategory <em>Service Category</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Category</em>' reference is set.
     * @see #unsetServiceCategory()
     * @see #getServiceCategory()
     * @see #setServiceCategory(ServiceCategory)
     * @generated
     */
    boolean isSetServiceCategory();

} // CustomerAgreement
