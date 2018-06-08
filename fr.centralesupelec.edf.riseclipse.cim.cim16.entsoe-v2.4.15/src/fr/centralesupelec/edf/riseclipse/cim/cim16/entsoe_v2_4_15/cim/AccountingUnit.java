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
 * A representation of the model object '<em><b>Accounting Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAccountingUnit()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface AccountingUnit extends EObject {
    /**
     * Returns the value of the '<em><b>Energy Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Unit</em>' attribute.
     * @see #isSetEnergyUnit()
     * @see #unsetEnergyUnit()
     * @see #setEnergyUnit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAccountingUnit_EnergyUnit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AccountingUnit.energyUnit' kind='element'"
     * @generated
     */
    Float getEnergyUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Unit</em>' attribute.
     * @see #isSetEnergyUnit()
     * @see #unsetEnergyUnit()
     * @see #getEnergyUnit()
     * @generated
     */
    void setEnergyUnit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyUnit()
     * @see #getEnergyUnit()
     * @see #setEnergyUnit(Float)
     * @generated
     */
    void unsetEnergyUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Unit</em>' attribute is set.
     * @see #unsetEnergyUnit()
     * @see #getEnergyUnit()
     * @see #setEnergyUnit(Float)
     * @generated
     */
    boolean isSetEnergyUnit();

    /**
     * Returns the value of the '<em><b>Monetary Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Currency}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monetary Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monetary Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Currency
     * @see #isSetMonetaryUnit()
     * @see #unsetMonetaryUnit()
     * @see #setMonetaryUnit(Currency)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAccountingUnit_MonetaryUnit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AccountingUnit.monetaryUnit' kind='element'"
     * @generated
     */
    Currency getMonetaryUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monetary Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Currency
     * @see #isSetMonetaryUnit()
     * @see #unsetMonetaryUnit()
     * @see #getMonetaryUnit()
     * @generated
     */
    void setMonetaryUnit( Currency value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMonetaryUnit()
     * @see #getMonetaryUnit()
     * @see #setMonetaryUnit(Currency)
     * @generated
     */
    void unsetMonetaryUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Monetary Unit</em>' attribute is set.
     * @see #unsetMonetaryUnit()
     * @see #getMonetaryUnit()
     * @see #setMonetaryUnit(Currency)
     * @generated
     */
    boolean isSetMonetaryUnit();

    /**
     * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UnitMultiplier
     * @see #isSetMultiplier()
     * @see #unsetMultiplier()
     * @see #setMultiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAccountingUnit_Multiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AccountingUnit.multiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMultiplier <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.UnitMultiplier
     * @see #isSetMultiplier()
     * @see #unsetMultiplier()
     * @see #getMultiplier()
     * @generated
     */
    void setMultiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMultiplier <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMultiplier()
     * @see #getMultiplier()
     * @see #setMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getMultiplier <em>Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Multiplier</em>' attribute is set.
     * @see #unsetMultiplier()
     * @see #getMultiplier()
     * @see #setMultiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetMultiplier();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getAccountingUnit_Value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='AccountingUnit.value' kind='element'"
     * @generated
     */
    Float getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.AccountingUnit#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    boolean isSetValue();

} // AccountingUnit