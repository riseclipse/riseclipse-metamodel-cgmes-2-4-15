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
 * A representation of the model object '<em><b>Reading Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAccumulation <em>Accumulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCommodity <em>Commodity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getConsumptionTier <em>Consumption Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCpp <em>Cpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCurrency <em>Currency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getFlowDirection <em>Flow Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMacroPeriod <em>Macro Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasurementKind <em>Measurement Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasuringPeriod <em>Measuring Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getTou <em>Tou</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getInterharmonic <em>Interharmonic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMetrologyRequirements <em>Metrology Requirements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getReadings <em>Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getChannel <em>Channel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPendingCalculation <em>Pending Calculation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType()
 * @model extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16'"
 * @generated
 */
public interface ReadingType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Accumulation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accumulation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accumulation</em>' attribute.
     * @see #isSetAccumulation()
     * @see #unsetAccumulation()
     * @see #setAccumulation(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Accumulation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.accumulation' kind='element'"
     * @generated
     */
    String getAccumulation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAccumulation <em>Accumulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulation</em>' attribute.
     * @see #isSetAccumulation()
     * @see #unsetAccumulation()
     * @see #getAccumulation()
     * @generated
     */
    void setAccumulation( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAccumulation <em>Accumulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulation()
     * @see #getAccumulation()
     * @see #setAccumulation(String)
     * @generated
     */
    void unsetAccumulation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAccumulation <em>Accumulation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulation</em>' attribute is set.
     * @see #unsetAccumulation()
     * @see #getAccumulation()
     * @see #setAccumulation(String)
     * @generated
     */
    boolean isSetAccumulation();

    /**
     * Returns the value of the '<em><b>Aggregate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregate</em>' attribute.
     * @see #isSetAggregate()
     * @see #unsetAggregate()
     * @see #setAggregate(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Aggregate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.aggregate' kind='element'"
     * @generated
     */
    String getAggregate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAggregate <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregate</em>' attribute.
     * @see #isSetAggregate()
     * @see #unsetAggregate()
     * @see #getAggregate()
     * @generated
     */
    void setAggregate( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAggregate <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAggregate()
     * @see #getAggregate()
     * @see #setAggregate(String)
     * @generated
     */
    void unsetAggregate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getAggregate <em>Aggregate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aggregate</em>' attribute is set.
     * @see #unsetAggregate()
     * @see #getAggregate()
     * @see #setAggregate(String)
     * @generated
     */
    boolean isSetAggregate();

    /**
     * Returns the value of the '<em><b>Commodity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Commodity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Commodity</em>' attribute.
     * @see #isSetCommodity()
     * @see #unsetCommodity()
     * @see #setCommodity(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Commodity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.commodity' kind='element'"
     * @generated
     */
    String getCommodity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCommodity <em>Commodity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Commodity</em>' attribute.
     * @see #isSetCommodity()
     * @see #unsetCommodity()
     * @see #getCommodity()
     * @generated
     */
    void setCommodity( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCommodity <em>Commodity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommodity()
     * @see #getCommodity()
     * @see #setCommodity(String)
     * @generated
     */
    void unsetCommodity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCommodity <em>Commodity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Commodity</em>' attribute is set.
     * @see #unsetCommodity()
     * @see #getCommodity()
     * @see #setCommodity(String)
     * @generated
     */
    boolean isSetCommodity();

    /**
     * Returns the value of the '<em><b>Consumption Tier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumption Tier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumption Tier</em>' attribute.
     * @see #isSetConsumptionTier()
     * @see #unsetConsumptionTier()
     * @see #setConsumptionTier(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_ConsumptionTier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.consumptionTier' kind='element'"
     * @generated
     */
    Integer getConsumptionTier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getConsumptionTier <em>Consumption Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumption Tier</em>' attribute.
     * @see #isSetConsumptionTier()
     * @see #unsetConsumptionTier()
     * @see #getConsumptionTier()
     * @generated
     */
    void setConsumptionTier( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getConsumptionTier <em>Consumption Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumptionTier()
     * @see #getConsumptionTier()
     * @see #setConsumptionTier(Integer)
     * @generated
     */
    void unsetConsumptionTier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getConsumptionTier <em>Consumption Tier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consumption Tier</em>' attribute is set.
     * @see #unsetConsumptionTier()
     * @see #getConsumptionTier()
     * @see #setConsumptionTier(Integer)
     * @generated
     */
    boolean isSetConsumptionTier();

    /**
     * Returns the value of the '<em><b>Cpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cpp</em>' attribute.
     * @see #isSetCpp()
     * @see #unsetCpp()
     * @see #setCpp(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Cpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.cpp' kind='element'"
     * @generated
     */
    Integer getCpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCpp <em>Cpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cpp</em>' attribute.
     * @see #isSetCpp()
     * @see #unsetCpp()
     * @see #getCpp()
     * @generated
     */
    void setCpp( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCpp <em>Cpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCpp()
     * @see #getCpp()
     * @see #setCpp(Integer)
     * @generated
     */
    void unsetCpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCpp <em>Cpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cpp</em>' attribute is set.
     * @see #unsetCpp()
     * @see #getCpp()
     * @see #setCpp(Integer)
     * @generated
     */
    boolean isSetCpp();

    /**
     * Returns the value of the '<em><b>Currency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Currency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Currency</em>' attribute.
     * @see #isSetCurrency()
     * @see #unsetCurrency()
     * @see #setCurrency(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Currency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.currency' kind='element'"
     * @generated
     */
    String getCurrency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCurrency <em>Currency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Currency</em>' attribute.
     * @see #isSetCurrency()
     * @see #unsetCurrency()
     * @see #getCurrency()
     * @generated
     */
    void setCurrency( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCurrency <em>Currency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrency()
     * @see #getCurrency()
     * @see #setCurrency(String)
     * @generated
     */
    void unsetCurrency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getCurrency <em>Currency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Currency</em>' attribute is set.
     * @see #unsetCurrency()
     * @see #getCurrency()
     * @see #setCurrency(String)
     * @generated
     */
    boolean isSetCurrency();

    /**
     * Returns the value of the '<em><b>Flow Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Direction</em>' attribute.
     * @see #isSetFlowDirection()
     * @see #unsetFlowDirection()
     * @see #setFlowDirection(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_FlowDirection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.flowDirection' kind='element'"
     * @generated
     */
    String getFlowDirection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getFlowDirection <em>Flow Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Direction</em>' attribute.
     * @see #isSetFlowDirection()
     * @see #unsetFlowDirection()
     * @see #getFlowDirection()
     * @generated
     */
    void setFlowDirection( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getFlowDirection <em>Flow Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlowDirection()
     * @see #getFlowDirection()
     * @see #setFlowDirection(String)
     * @generated
     */
    void unsetFlowDirection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getFlowDirection <em>Flow Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flow Direction</em>' attribute is set.
     * @see #unsetFlowDirection()
     * @see #getFlowDirection()
     * @see #setFlowDirection(String)
     * @generated
     */
    boolean isSetFlowDirection();

    /**
     * Returns the value of the '<em><b>Macro Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Macro Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Macro Period</em>' attribute.
     * @see #isSetMacroPeriod()
     * @see #unsetMacroPeriod()
     * @see #setMacroPeriod(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_MacroPeriod()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.macroPeriod' kind='element'"
     * @generated
     */
    String getMacroPeriod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMacroPeriod <em>Macro Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Macro Period</em>' attribute.
     * @see #isSetMacroPeriod()
     * @see #unsetMacroPeriod()
     * @see #getMacroPeriod()
     * @generated
     */
    void setMacroPeriod( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMacroPeriod <em>Macro Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMacroPeriod()
     * @see #getMacroPeriod()
     * @see #setMacroPeriod(String)
     * @generated
     */
    void unsetMacroPeriod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMacroPeriod <em>Macro Period</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Macro Period</em>' attribute is set.
     * @see #unsetMacroPeriod()
     * @see #getMacroPeriod()
     * @see #setMacroPeriod(String)
     * @generated
     */
    boolean isSetMacroPeriod();

    /**
     * Returns the value of the '<em><b>Measurement Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Kind</em>' attribute.
     * @see #isSetMeasurementKind()
     * @see #unsetMeasurementKind()
     * @see #setMeasurementKind(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_MeasurementKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.measurementKind' kind='element'"
     * @generated
     */
    String getMeasurementKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasurementKind <em>Measurement Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Kind</em>' attribute.
     * @see #isSetMeasurementKind()
     * @see #unsetMeasurementKind()
     * @see #getMeasurementKind()
     * @generated
     */
    void setMeasurementKind( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasurementKind <em>Measurement Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementKind()
     * @see #getMeasurementKind()
     * @see #setMeasurementKind(String)
     * @generated
     */
    void unsetMeasurementKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasurementKind <em>Measurement Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Kind</em>' attribute is set.
     * @see #unsetMeasurementKind()
     * @see #getMeasurementKind()
     * @see #setMeasurementKind(String)
     * @generated
     */
    boolean isSetMeasurementKind();

    /**
     * Returns the value of the '<em><b>Measuring Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measuring Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measuring Period</em>' attribute.
     * @see #isSetMeasuringPeriod()
     * @see #unsetMeasuringPeriod()
     * @see #setMeasuringPeriod(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_MeasuringPeriod()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.measuringPeriod' kind='element'"
     * @generated
     */
    String getMeasuringPeriod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasuringPeriod <em>Measuring Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measuring Period</em>' attribute.
     * @see #isSetMeasuringPeriod()
     * @see #unsetMeasuringPeriod()
     * @see #getMeasuringPeriod()
     * @generated
     */
    void setMeasuringPeriod( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasuringPeriod <em>Measuring Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasuringPeriod()
     * @see #getMeasuringPeriod()
     * @see #setMeasuringPeriod(String)
     * @generated
     */
    void unsetMeasuringPeriod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMeasuringPeriod <em>Measuring Period</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measuring Period</em>' attribute is set.
     * @see #unsetMeasuringPeriod()
     * @see #getMeasuringPeriod()
     * @see #setMeasuringPeriod(String)
     * @generated
     */
    boolean isSetMeasuringPeriod();

    /**
     * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplier</em>' attribute.
     * @see #isSetMultiplier()
     * @see #unsetMultiplier()
     * @see #setMultiplier(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Multiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.multiplier' kind='element'"
     * @generated
     */
    String getMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMultiplier <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplier</em>' attribute.
     * @see #isSetMultiplier()
     * @see #unsetMultiplier()
     * @see #getMultiplier()
     * @generated
     */
    void setMultiplier( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMultiplier <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMultiplier()
     * @see #getMultiplier()
     * @see #setMultiplier(String)
     * @generated
     */
    void unsetMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMultiplier <em>Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Multiplier</em>' attribute is set.
     * @see #unsetMultiplier()
     * @see #getMultiplier()
     * @see #setMultiplier(String)
     * @generated
     */
    boolean isSetMultiplier();

    /**
     * Returns the value of the '<em><b>Phases</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phases</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phases</em>' attribute.
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #setPhases(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Phases()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.phases' kind='element'"
     * @generated
     */
    String getPhases();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phases</em>' attribute.
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #getPhases()
     * @generated
     */
    void setPhases( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhases()
     * @see #getPhases()
     * @see #setPhases(String)
     * @generated
     */
    void unsetPhases();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPhases <em>Phases</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phases</em>' attribute is set.
     * @see #unsetPhases()
     * @see #getPhases()
     * @see #setPhases(String)
     * @generated
     */
    boolean isSetPhases();

    /**
     * Returns the value of the '<em><b>Tou</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tou</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tou</em>' attribute.
     * @see #isSetTou()
     * @see #unsetTou()
     * @see #setTou(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Tou()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.tou' kind='element'"
     * @generated
     */
    Integer getTou();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getTou <em>Tou</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tou</em>' attribute.
     * @see #isSetTou()
     * @see #unsetTou()
     * @see #getTou()
     * @generated
     */
    void setTou( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getTou <em>Tou</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTou()
     * @see #getTou()
     * @see #setTou(Integer)
     * @generated
     */
    void unsetTou();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getTou <em>Tou</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tou</em>' attribute is set.
     * @see #unsetTou()
     * @see #getTou()
     * @see #setTou(Integer)
     * @generated
     */
    boolean isSetTou();

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #isSetUnit()
     * @see #unsetUnit()
     * @see #setUnit(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Unit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.unit' kind='element'"
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #isSetUnit()
     * @see #unsetUnit()
     * @see #getUnit()
     * @generated
     */
    void setUnit( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnit()
     * @see #getUnit()
     * @see #setUnit(String)
     * @generated
     */
    void unsetUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getUnit <em>Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit</em>' attribute is set.
     * @see #unsetUnit()
     * @see #getUnit()
     * @see #setUnit(String)
     * @generated
     */
    boolean isSetUnit();

    /**
     * Returns the value of the '<em><b>Argument</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Argument</em>' containment reference.
     * @see #isSetArgument()
     * @see #unsetArgument()
     * @see #setArgument(RationalNumber)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Argument()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.argument' kind='element'"
     * @generated
     */
    RationalNumber getArgument();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getArgument <em>Argument</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Argument</em>' containment reference.
     * @see #isSetArgument()
     * @see #unsetArgument()
     * @see #getArgument()
     * @generated
     */
    void setArgument( RationalNumber value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getArgument <em>Argument</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetArgument()
     * @see #getArgument()
     * @see #setArgument(RationalNumber)
     * @generated
     */
    void unsetArgument();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getArgument <em>Argument</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Argument</em>' containment reference is set.
     * @see #unsetArgument()
     * @see #getArgument()
     * @see #setArgument(RationalNumber)
     * @generated
     */
    boolean isSetArgument();

    /**
     * Returns the value of the '<em><b>Interharmonic</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interharmonic</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interharmonic</em>' containment reference.
     * @see #isSetInterharmonic()
     * @see #unsetInterharmonic()
     * @see #setInterharmonic(ReadingInterharmonic)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Interharmonic()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.interharmonic' kind='element'"
     * @generated
     */
    ReadingInterharmonic getInterharmonic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getInterharmonic <em>Interharmonic</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interharmonic</em>' containment reference.
     * @see #isSetInterharmonic()
     * @see #unsetInterharmonic()
     * @see #getInterharmonic()
     * @generated
     */
    void setInterharmonic( ReadingInterharmonic value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getInterharmonic <em>Interharmonic</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInterharmonic()
     * @see #getInterharmonic()
     * @see #setInterharmonic(ReadingInterharmonic)
     * @generated
     */
    void unsetInterharmonic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getInterharmonic <em>Interharmonic</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interharmonic</em>' containment reference is set.
     * @see #unsetInterharmonic()
     * @see #getInterharmonic()
     * @see #setInterharmonic(ReadingInterharmonic)
     * @generated
     */
    boolean isSetInterharmonic();

    /**
     * Returns the value of the '<em><b>Readings</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Reading}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Reading#getReadingType <em>Reading Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Readings</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Readings</em>' reference list.
     * @see #isSetReadings()
     * @see #unsetReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Readings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Reading#getReadingType
     * @model opposite="ReadingType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.Readings' kind='element'"
     * @generated
     */
    EList< Reading > getReadings();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getReadings <em>Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadings()
     * @see #getReadings()
     * @generated
     */
    void unsetReadings();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getReadings <em>Readings</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Readings</em>' reference list is set.
     * @see #unsetReadings()
     * @see #getReadings()
     * @generated
     */
    boolean isSetReadings();

    /**
     * Returns the value of the '<em><b>Pending Calculation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PendingCalculation#getReadingType <em>Reading Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pending Calculation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pending Calculation</em>' reference.
     * @see #isSetPendingCalculation()
     * @see #unsetPendingCalculation()
     * @see #setPendingCalculation(PendingCalculation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_PendingCalculation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.PendingCalculation#getReadingType
     * @model opposite="ReadingType" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.PendingCalculation' kind='element'"
     * @generated
     */
    PendingCalculation getPendingCalculation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPendingCalculation <em>Pending Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pending Calculation</em>' reference.
     * @see #isSetPendingCalculation()
     * @see #unsetPendingCalculation()
     * @see #getPendingCalculation()
     * @generated
     */
    void setPendingCalculation( PendingCalculation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPendingCalculation <em>Pending Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPendingCalculation()
     * @see #getPendingCalculation()
     * @see #setPendingCalculation(PendingCalculation)
     * @generated
     */
    void unsetPendingCalculation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getPendingCalculation <em>Pending Calculation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pending Calculation</em>' reference is set.
     * @see #unsetPendingCalculation()
     * @see #getPendingCalculation()
     * @see #setPendingCalculation(PendingCalculation)
     * @generated
     */
    boolean isSetPendingCalculation();

    /**
     * Returns the value of the '<em><b>Channel</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Channel#getReadingType <em>Reading Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channel</em>' reference.
     * @see #isSetChannel()
     * @see #unsetChannel()
     * @see #setChannel(Channel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_Channel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Channel#getReadingType
     * @model opposite="ReadingType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.Channel' kind='element'"
     * @generated
     */
    Channel getChannel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getChannel <em>Channel</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channel</em>' reference.
     * @see #isSetChannel()
     * @see #unsetChannel()
     * @see #getChannel()
     * @generated
     */
    void setChannel( Channel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getChannel <em>Channel</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChannel()
     * @see #getChannel()
     * @see #setChannel(Channel)
     * @generated
     */
    void unsetChannel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getChannel <em>Channel</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Channel</em>' reference is set.
     * @see #unsetChannel()
     * @see #getChannel()
     * @see #setChannel(Channel)
     * @generated
     */
    boolean isSetChannel();

    /**
     * Returns the value of the '<em><b>Metrology Requirements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MetrologyRequirement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MetrologyRequirement#getReadingTypes <em>Reading Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metrology Requirements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metrology Requirements</em>' reference list.
     * @see #isSetMetrologyRequirements()
     * @see #unsetMetrologyRequirements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_MetrologyRequirements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.MetrologyRequirement#getReadingTypes
     * @model opposite="ReadingTypes" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.MetrologyRequirements' kind='element'"
     * @generated
     */
    EList< MetrologyRequirement > getMetrologyRequirements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMetrologyRequirements <em>Metrology Requirements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMetrologyRequirements()
     * @see #getMetrologyRequirements()
     * @generated
     */
    void unsetMetrologyRequirements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getMetrologyRequirements <em>Metrology Requirements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Metrology Requirements</em>' reference list is set.
     * @see #unsetMetrologyRequirements()
     * @see #getMetrologyRequirements()
     * @generated
     */
    boolean isSetMetrologyRequirements();

    /**
     * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.IntervalBlock}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.IntervalBlock#getReadingType <em>Reading Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval Blocks</em>' reference list.
     * @see #isSetIntervalBlocks()
     * @see #unsetIntervalBlocks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage#getReadingType_IntervalBlocks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.IntervalBlock#getReadingType
     * @model opposite="ReadingType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2013/CIM-schema-cim16' name='ReadingType.IntervalBlocks' kind='element'"
     * @generated
     */
    EList< IntervalBlock > getIntervalBlocks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntervalBlocks()
     * @see #getIntervalBlocks()
     * @generated
     */
    void unsetIntervalBlocks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interval Blocks</em>' reference list is set.
     * @see #unsetIntervalBlocks()
     * @see #getIntervalBlocks()
     * @generated
     */
    boolean isSetIntervalBlocks();

} // ReadingType
