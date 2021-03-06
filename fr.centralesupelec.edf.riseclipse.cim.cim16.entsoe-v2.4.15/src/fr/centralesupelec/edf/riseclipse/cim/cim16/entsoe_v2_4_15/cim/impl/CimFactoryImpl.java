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
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CimFactoryImpl extends EFactoryImpl implements CimFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CimFactory init() {
        try {
            CimFactory theCimFactory = ( CimFactory ) EPackage.Registry.INSTANCE.getEFactory( CimPackage.eNS_URI );
            if( theCimFactory != null ) {
                return theCimFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new CimFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CimFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
        case CimPackage.TOWN_DETAIL:
            return createTownDetail();
        case CimPackage.ACCOUNT_MOVEMENT:
            return createAccountMovement();
        case CimPackage.STREET_DETAIL:
            return createStreetDetail();
        case CimPackage.END_DEVICE_CAPABILITY:
            return createEndDeviceCapability();
        case CimPackage.LINE_DETAIL:
            return createLineDetail();
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY:
            return createServicePointOutageSummary();
        case CimPackage.DECIMAL_QUANTITY:
            return createDecimalQuantity();
        case CimPackage.ACCOUNTING_UNIT:
            return createAccountingUnit();
        case CimPackage.READING_INTERHARMONIC:
            return createReadingInterharmonic();
        case CimPackage.DATE_INTERVAL:
            return createDateInterval();
        case CimPackage.FAULT_IMPEDANCE:
            return createFaultImpedance();
        case CimPackage.DATE_TIME_INTERVAL:
            return createDateTimeInterval();
        case CimPackage.MONTH_DAY_INTERVAL:
            return createMonthDayInterval();
        case CimPackage.STATUS:
            return createStatus();
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO:
            return createRemoteConnectDisconnectInfo();
        case CimPackage.STRING_QUANTITY:
            return createStringQuantity();
        case CimPackage.ELECTRONIC_ADDRESS:
            return createElectronicAddress();
        case CimPackage.PRIORITY:
            return createPriority();
        case CimPackage.ACCEPTANCE_TEST:
            return createAcceptanceTest();
        case CimPackage.LIFECYCLE_DATE:
            return createLifecycleDate();
        case CimPackage.FLOAT_QUANTITY:
            return createFloatQuantity();
        case CimPackage.TELEPHONE_NUMBER:
            return createTelephoneNumber();
        case CimPackage.DUE:
            return createDue();
        case CimPackage.TIME_INTERVAL:
            return createTimeInterval();
        case CimPackage.CONTROLLED_APPLIANCE:
            return createControlledAppliance();
        case CimPackage.BANK_ACCOUNT_DETAIL:
            return createBankAccountDetail();
        case CimPackage.RATIONAL_NUMBER:
            return createRationalNumber();
        case CimPackage.INTEGER_QUANTITY:
            return createIntegerQuantity();
        case CimPackage.STREET_ADDRESS:
            return createStreetAddress();
        case CimPackage.POSTAL_ADDRESS:
            return createPostalAddress();
        case CimPackage.END_DEVICE_TIMING:
            return createEndDeviceTiming();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION:
            return createConnectDisconnectFunction();
        case CimPackage.CONDUCTOR:
            return createConductor();
        case CimPackage.QUALITY61850:
            return createQuality61850();
        case CimPackage.WIRE_SPACING_INFO:
            return createWireSpacingInfo();
        case CimPackage.OUTAGE_SCHEDULE:
            return createOutageSchedule();
        case CimPackage.PSS1_A:
            return createPss1A();
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            return createPFVArControllerType1UserDefined();
        case CimPackage.MERCHANT_AGREEMENT:
            return createMerchantAgreement();
        case CimPackage.PSS_SK:
            return createPssSK();
        case CimPackage.NON_CONFORM_LOAD:
            return createNonConformLoad();
        case CimPackage.PAN_DEMAND_RESPONSE:
            return createPanDemandResponse();
        case CimPackage.OPERATION_PERSON_ROLE:
            return createOperationPersonRole();
        case CimPackage.GOV_HYDRO3:
            return createGovHydro3();
        case CimPackage.VS_CONVERTER:
            return createVsConverter();
        case CimPackage.GOV_STEAM2:
            return createGovSteam2();
        case CimPackage.CONNECTIVITY_NODE_CONTAINER:
            return createConnectivityNodeContainer();
        case CimPackage.STARTUP_MODEL:
            return createStartupModel();
        case CimPackage.METER_SERVICE_WORK:
            return createMeterServiceWork();
        case CimPackage.EXC_SCRX:
            return createExcSCRX();
        case CimPackage.EXC_DC3A1:
            return createExcDC3A1();
        case CimPackage.CONFIGURATION_EVENT:
            return createConfigurationEvent();
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE:
            return createPerLengthPhaseImpedance();
        case CimPackage.IEC61970CIM_VERSION:
            return createIEC61970CIMVersion();
        case CimPackage.NUCLEAR_GENERATING_UNIT:
            return createNuclearGeneratingUnit();
        case CimPackage.CURVE_DATA:
            return createCurveData();
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL:
            return createPhaseTapChangerAsymmetrical();
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS:
            return createTurbineGovernorDynamics();
        case CimPackage.WORK:
            return createWork();
        case CimPackage.GOV_HYDRO2:
            return createGovHydro2();
        case CimPackage.GROUND:
            return createGround();
        case CimPackage.AUXILIARY_EQUIPMENT:
            return createAuxiliaryEquipment();
        case CimPackage.SWITCH:
            return createSwitch();
        case CimPackage.EXC_IEEEST5B:
            return createExcIEEEST5B();
        case CimPackage.DC_SERIES_DEVICE:
            return createDCSeriesDevice();
        case CimPackage.SWITCHING_STEP_GROUP:
            return createSwitchingStepGroup();
        case CimPackage.BRANCH_GROUP_TERMINAL:
            return createBranchGroupTerminal();
        case CimPackage.METER_READING:
            return createMeterReading();
        case CimPackage.FAULT_INDICATOR:
            return createFaultIndicator();
        case CimPackage.SAFETY_DOCUMENT:
            return createSafetyDocument();
        case CimPackage.TAP_CHANGER:
            return createTapChanger();
        case CimPackage.CLEARANCE_ACTION:
            return createClearanceAction();
        case CimPackage.SUBSTATION:
            return createSubstation();
        case CimPackage.ACCUMULATOR_LIMIT_SET:
            return createAccumulatorLimitSet();
        case CimPackage.COMMAND:
            return createCommand();
        case CimPackage.BASIC_INTERVAL_SCHEDULE:
            return createBasicIntervalSchedule();
        case CimPackage.ENERGY_AREA:
            return createEnergyArea();
        case CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS:
            return createVoltageCompensatorDynamics();
        case CimPackage.CONTROL_AREA:
            return createControlArea();
        case CimPackage.SV_VOLTAGE:
            return createSvVoltage();
        case CimPackage.STEAM_TURBINE:
            return createSteamTurbine();
        case CimPackage.DIAGRAM_STYLE:
            return createDiagramStyle();
        case CimPackage.TRANSACTION:
            return createTransaction();
        case CimPackage.EQUIVALENT_NETWORK:
            return createEquivalentNetwork();
        case CimPackage.UNDEREXC_LIM_X1:
            return createUnderexcLimX1();
        case CimPackage.VENDOR_SHIFT:
            return createVendorShift();
        case CimPackage.WIND_TYPE3OR4_USER_DEFINED:
            return createWindType3or4UserDefined();
        case CimPackage.JUMPER_ACTION:
            return createJumperAction();
        case CimPackage.EXC_IEEEST2A:
            return createExcIEEEST2A();
        case CimPackage.EXC_IEEEDC3A:
            return createExcIEEEDC3A();
        case CimPackage.GOV_HYDRO_PELTON:
            return createGovHydroPelton();
        case CimPackage.ACCUMULATOR_RESET:
            return createAccumulatorReset();
        case CimPackage.POINT_OF_SALE:
            return createPointOfSale();
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            return createDiscontinuousExcitationControlUserDefined();
        case CimPackage.OVEREXC_LIM_X1:
            return createOverexcLimX1();
        case CimPackage.PROTECTION_EQUIPMENT:
            return createProtectionEquipment();
        case CimPackage.CUSTOMER:
            return createCustomer();
        case CimPackage.WAVE_TRAP:
            return createWaveTrap();
        case CimPackage.SOLAR_GENERATING_UNIT:
            return createSolarGeneratingUnit();
        case CimPackage.DC_SWITCH:
            return createDCSwitch();
        case CimPackage.EXC_AVR7:
            return createExcAVR7();
        case CimPackage.RESERVOIR:
            return createReservoir();
        case CimPackage.STATE_VARIABLE:
            return createStateVariable();
        case CimPackage.USAGE_POINT:
            return createUsagePoint();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE:
            return createNonlinearShuntCompensatorPhase();
        case CimPackage.WIND_TURBINE_TYPE4B_IEC:
            return createWindTurbineType4bIEC();
        case CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED:
            return createUnderexcitationLimiterUserDefined();
        case CimPackage.DIAGRAM:
            return createDiagram();
        case CimPackage.ALT_TIE_MEAS:
            return createAltTieMeas();
        case CimPackage.WORK_ASSET:
            return createWorkAsset();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS:
            return createAsynchronousMachineDynamics();
        case CimPackage.PSS_ELIN2:
            return createPssELIN2();
        case CimPackage.EMISSION_ACCOUNT:
            return createEmissionAccount();
        case CimPackage.WIND_GENERATING_UNIT:
            return createWindGeneratingUnit();
        case CimPackage.EXC_IEEEST1A:
            return createExcIEEEST1A();
        case CimPackage.EXC_AC1A:
            return createExcAC1A();
        case CimPackage.PER_LENGTH_LINE_PARAMETER:
            return createPerLengthLineParameter();
        case CimPackage.END_DEVICE:
            return createEndDevice();
        case CimPackage.STATION_SUPPLY:
            return createStationSupply();
        case CimPackage.GEN_UNIT_OP_COST_CURVE:
            return createGenUnitOpCostCurve();
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER:
            return createPerLengthDCLineParameter();
        case CimPackage.EXC_AVR2:
            return createExcAVR2();
        case CimPackage.TAP_CHANGER_INFO:
            return createTapChangerInfo();
        case CimPackage.PSS5:
            return createPss5();
        case CimPackage.BUS_NAME_MARKER:
            return createBusNameMarker();
        case CimPackage.RECLOSE_SEQUENCE:
            return createRecloseSequence();
        case CimPackage.COMMUNICATION_LINK:
            return createCommunicationLink();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED:
            return createSynchronousMachineDetailed();
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE:
            return createHydroGeneratingEfficiencyCurve();
        case CimPackage.JUMPER:
            return createJumper();
        case CimPackage.LOAD_COMPOSITE:
            return createLoadComposite();
        case CimPackage.CONFORM_LOAD:
            return createConformLoad();
        case CimPackage.MECHANICAL_LOAD_DYNAMICS:
            return createMechanicalLoadDynamics();
        case CimPackage.DOCUMENT:
            return createDocument();
        case CimPackage.PER_LENGTH_IMPEDANCE:
            return createPerLengthImpedance();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE:
            return createTransformerCoreAdmittance();
        case CimPackage.GOV_CT1:
            return createGovCT1();
        case CimPackage.BASE_FREQUENCY:
            return createBaseFrequency();
        case CimPackage.DAY_TYPE:
            return createDayType();
        case CimPackage.OPERATIONAL_LIMIT:
            return createOperationalLimit();
        case CimPackage.LOAD_DYNAMICS:
            return createLoadDynamics();
        case CimPackage.AUXILIARY_AGREEMENT:
            return createAuxiliaryAgreement();
        case CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED:
            return createPowerSystemStabilizerUserDefined();
        case CimPackage.CREW:
            return createCrew();
        case CimPackage.EXC_ANS:
            return createExcANS();
        case CimPackage.EQUIPMENT_FAULT:
            return createEquipmentFault();
        case CimPackage.PSS_PTIST1:
            return createPssPTIST1();
        case CimPackage.DC_CONDUCTING_EQUIPMENT:
            return createDCConductingEquipment();
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A:
            return createDiscExcContIEEEDEC3A();
        case CimPackage.EXC_HU:
            return createExcHU();
        case CimPackage.PSR_EVENT:
            return createPSREvent();
        case CimPackage.PHASE_TAP_CHANGER_LINEAR:
            return createPhaseTapChangerLinear();
        case CimPackage.LOCATION:
            return createLocation();
        case CimPackage.OVEREXC_LIM_X2:
            return createOverexcLimX2();
        case CimPackage.START_MAIN_FUEL_CURVE:
            return createStartMainFuelCurve();
        case CimPackage.BREAKER:
            return createBreaker();
        case CimPackage.SERIES_COMPENSATOR:
            return createSeriesCompensator();
        case CimPackage.EQUIPMENT_CONTAINER:
            return createEquipmentContainer();
        case CimPackage.EQUIVALENT_EQUIPMENT:
            return createEquivalentEquipment();
        case CimPackage.INFLOW_FORECAST:
            return createInflowForecast();
        case CimPackage.CONFORM_LOAD_GROUP:
            return createConformLoadGroup();
        case CimPackage.PHASE_TAP_CHANGER_SYMMETRICAL:
            return createPhaseTapChangerSymmetrical();
        case CimPackage.INTERVAL_BLOCK:
            return createIntervalBlock();
        case CimPackage.POWER_CUT_ZONE:
            return createPowerCutZone();
        case CimPackage.CUSTOMER_ACCOUNT:
            return createCustomerAccount();
        case CimPackage.IDENTIFIED_OBJECT:
            return createIdentifiedObject();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC:
            return createWindContPitchAngleIEC();
        case CimPackage.EXC_ST1A:
            return createExcST1A();
        case CimPackage.ANALOG_LIMIT:
            return createAnalogLimit();
        case CimPackage.GOV_HYDRO_PID2:
            return createGovHydroPID2();
        case CimPackage.RECEIPT:
            return createReceipt();
        case CimPackage.PSS_IEEE3B:
            return createPssIEEE3B();
        case CimPackage.MERCHANT_ACCOUNT:
            return createMerchantAccount();
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS:
            return createPowerSystemStabilizerDynamics();
        case CimPackage.EXC_DC2A:
            return createExcDC2A();
        case CimPackage.PSR_TYPE:
            return createPSRType();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT:
            return createNonlinearShuntCompensatorPhasePoint();
        case CimPackage.BASE_POWER:
            return createBasePower();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE:
            return createAsynchronousMachineTimeConstantReactance();
        case CimPackage.WIRE_POSITION:
            return createWirePosition();
        case CimPackage.SET_POINT:
            return createSetPoint();
        case CimPackage.CLEARANCE_DOCUMENT:
            return createClearanceDocument();
        case CimPackage.PERSON:
            return createPerson();
        case CimPackage.GEN_UNIT_OP_SCHEDULE:
            return createGenUnitOpSchedule();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J:
            return createGenICompensationForGenJ();
        case CimPackage.ASSET_CONTAINER:
            return createAssetContainer();
        case CimPackage.EXC_IEEEDC4B:
            return createExcIEEEDC4B();
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            return createPFVArControllerType2Dynamics();
        case CimPackage.LOAD_USER_DEFINED:
            return createLoadUserDefined();
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC:
            return createWindTurbineType1or2IEC();
        case CimPackage.AC_LINE_SEGMENT:
            return createACLineSegment();
        case CimPackage.METER_MULTIPLIER:
            return createMeterMultiplier();
        case CimPackage.PHASE_TAP_CHANGER:
            return createPhaseTapChanger();
        case CimPackage.ACDC_TERMINAL:
            return createACDCTerminal();
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS:
            return createVoltageAdjusterDynamics();
        case CimPackage.END_DEVICE_EVENT_TYPE:
            return createEndDeviceEventType();
        case CimPackage.GOV_HYDRO1:
            return createGovHydro1();
        case CimPackage.CUSTOMER_NOTIFICATION:
            return createCustomerNotification();
        case CimPackage.SV_INJECTION:
            return createSvInjection();
        case CimPackage.CURVE:
            return createCurve();
        case CimPackage.ACTIVITY_RECORD:
            return createActivityRecord();
        case CimPackage.POSITION_POINT:
            return createPositionPoint();
        case CimPackage.DIAGRAM_OBJECT:
            return createDiagramObject();
        case CimPackage.EXC_AVR1:
            return createExcAVR1();
        case CimPackage.COMPOSITE_SWITCH:
            return createCompositeSwitch();
        case CimPackage.TROUBLE_TICKET:
            return createTroubleTicket();
        case CimPackage.CURRENT_LIMIT:
            return createCurrentLimit();
        case CimPackage.TRANSFORMER_TANK:
            return createTransformerTank();
        case CimPackage.SWITCHING_PLAN:
            return createSwitchingPlan();
        case CimPackage.ASSET_ORGANISATION_ROLE:
            return createAssetOrganisationRole();
        case CimPackage.ASSET_OWNER:
            return createAssetOwner();
        case CimPackage.CAES_PLANT:
            return createCAESPlant();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC:
            return createWindPlantReactiveControlIEC();
        case CimPackage.OPERATING_PARTICIPANT:
            return createOperatingParticipant();
        case CimPackage.PETERSEN_COIL:
            return createPetersenCoil();
        case CimPackage.OUTAGE:
            return createOutage();
        case CimPackage.WIND_TURBINE_TYPE4A_IEC:
            return createWindTurbineType4aIEC();
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT:
            return createRatioTapChangerTablePoint();
        case CimPackage.UNDEREXC_LIM_X2:
            return createUnderexcLimX2();
        case CimPackage.MEASUREMENT_VALUE:
            return createMeasurementValue();
        case CimPackage.LOAD_BREAK_SWITCH:
            return createLoadBreakSwitch();
        case CimPackage.ACDC_CONVERTER:
            return createACDCConverter();
        case CimPackage.OPERATIONAL_LIMIT_SET:
            return createOperationalLimitSet();
        case CimPackage.BRANCH_GROUP:
            return createBranchGroup();
        case CimPackage.VOLTAGE_LIMIT:
            return createVoltageLimit();
        case CimPackage.USER_ATTRIBUTE:
            return createUserAttribute();
        case CimPackage.ALT_GENERATING_UNIT_MEAS:
            return createAltGeneratingUnitMeas();
        case CimPackage.EXC_IEEEAC3A:
            return createExcIEEEAC3A();
        case CimPackage.DC_SHUNT:
            return createDCShunt();
        case CimPackage.INTERVAL_READING:
            return createIntervalReading();
        case CimPackage.PHASE_IMPEDANCE_DATA:
            return createPhaseImpedanceData();
        case CimPackage.DC_DISCONNECTOR:
            return createDCDisconnector();
        case CimPackage.MECH_LOAD1:
            return createMechLoad1();
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE:
            return createNonConformLoadSchedule();
        case CimPackage.MUTUAL_COUPLING:
            return createMutualCoupling();
        case CimPackage.USAGE_POINT_LOCATION:
            return createUsagePointLocation();
        case CimPackage.EXC_IEEEDC2A:
            return createExcIEEEDC2A();
        case CimPackage.EXTERNAL_NETWORK_INJECTION:
            return createExternalNetworkInjection();
        case CimPackage.MAINTAINER:
            return createMaintainer();
        case CimPackage.SUB_GEOGRAPHICAL_REGION:
            return createSubGeographicalRegion();
        case CimPackage.GOV_HYDRO_PID:
            return createGovHydroPID();
        case CimPackage.ASSET_FUNCTION:
            return createAssetFunction();
        case CimPackage.FOSSIL_FUEL:
            return createFossilFuel();
        case CimPackage.TARIFF_PROFILE:
            return createTariffProfile();
        case CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED:
            return createVoltageAdjusterUserDefined();
        case CimPackage.TRANSFORMER_TANK_INFO:
            return createTransformerTankInfo();
        case CimPackage.GOV_GAST4:
            return createGovGAST4();
        case CimPackage.REMOTE_INPUT_SIGNAL:
            return createRemoteInputSignal();
        case CimPackage.EXC_AVR5:
            return createExcAVR5();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS:
            return createExcitationSystemDynamics();
        case CimPackage.READING_QUALITY:
            return createReadingQuality();
        case CimPackage.WIND_PLANT_USER_DEFINED:
            return createWindPlantUserDefined();
        case CimPackage.PSS_WECC:
            return createPssWECC();
        case CimPackage.PSS2_ST:
            return createPss2ST();
        case CimPackage.REMOTE_UNIT:
            return createRemoteUnit();
        case CimPackage.WIND_GEN_TURBINE_TYPE3A_IEC:
            return createWindGenTurbineType3aIEC();
        case CimPackage.COGENERATION_PLANT:
            return createCogenerationPlant();
        case CimPackage.WIND_CONT_ROTOR_RIEC:
            return createWindContRotorRIEC();
        case CimPackage.CONTROL:
            return createControl();
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            return createDiscontinuousExcitationControlDynamics();
        case CimPackage.LINE_FAULT:
            return createLineFault();
        case CimPackage.EXC_IEEEAC4A:
            return createExcIEEEAC4A();
        case CimPackage.PRIME_MOVER:
            return createPrimeMover();
        case CimPackage.DC_LINE_SEGMENT:
            return createDCLineSegment();
        case CimPackage.SECTIONALISER:
            return createSectionaliser();
        case CimPackage.UNDEREXC_LIM_IEEE1:
            return createUnderexcLimIEEE1();
        case CimPackage.END_DEVICE_ACTION:
            return createEndDeviceAction();
        case CimPackage.CLAMP:
            return createClamp();
        case CimPackage.LINE:
            return createLine();
        case CimPackage.PROCEDURE:
            return createProcedure();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS:
            return createProprietaryParameterDynamics();
        case CimPackage.LOAD_MOTOR:
            return createLoadMotor();
        case CimPackage.TRANSFORMER_TEST:
            return createTransformerTest();
        case CimPackage.EXC_IEEEAC2A:
            return createExcIEEEAC2A();
        case CimPackage.SWITCHING_STEP:
            return createSwitchingStep();
        case CimPackage.FOSSIL_STEAM_SUPPLY:
            return createFossilSteamSupply();
        case CimPackage.CONTINGENCY:
            return createContingency();
        case CimPackage.ANALOG_VALUE:
            return createAnalogValue();
        case CimPackage.START_RAMP_CURVE:
            return createStartRampCurve();
        case CimPackage.FAULT:
            return createFault();
        case CimPackage.OPERATIONAL_UPDATED_RATING:
            return createOperationalUpdatedRating();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC:
            return createLoadResponseCharacteristic();
        case CimPackage.SHUNT_COMPENSATOR_INFO:
            return createShuntCompensatorInfo();
        case CimPackage.SHUNT_COMPENSATOR_PHASE:
            return createShuntCompensatorPhase();
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL:
            return createACDCConverterDCTerminal();
        case CimPackage.READING_TYPE:
            return createReadingType();
        case CimPackage.CS_CONVERTER:
            return createCsConverter();
        case CimPackage.OWNERSHIP:
            return createOwnership();
        case CimPackage.SUB_LOAD_AREA:
            return createSubLoadArea();
        case CimPackage.POWER_TRANSFORMER:
            return createPowerTransformer();
        case CimPackage.OPERATION_TAG:
            return createOperationTag();
        case CimPackage.UNDEREXC_LIM_IEEE2:
            return createUnderexcLimIEEE2();
        case CimPackage.GOV_STEAM0:
            return createGovSteam0();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER:
            return createPFVArType1IEEEPFController();
        case CimPackage.COM_FUNCTION:
            return createComFunction();
        case CimPackage.MEASUREMENT_VALUE_QUALITY:
            return createMeasurementValueQuality();
        case CimPackage.POWER_TRANSFORMER_END:
            return createPowerTransformerEnd();
        case CimPackage.WIND_GEN_TURBINE_TYPE3B_IEC:
            return createWindGenTurbineType3bIEC();
        case CimPackage.CUSTOMER_AGREEMENT:
            return createCustomerAgreement();
        case CimPackage.ASSET_LOCATION_HAZARD:
            return createAssetLocationHazard();
        case CimPackage.GOV_STEAM_EU:
            return createGovSteamEU();
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE:
            return createCTTempActivePowerCurve();
        case CimPackage.DEMAND_RESPONSE_PROGRAM:
            return createDemandResponseProgram();
        case CimPackage.LIMIT:
            return createLimit();
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            return createPFVArControllerType2UserDefined();
        case CimPackage.TENDER:
            return createTender();
        case CimPackage.START_IGN_FUEL_CURVE:
            return createStartIgnFuelCurve();
        case CimPackage.ROTATING_MACHINE:
            return createRotatingMachine();
        case CimPackage.VALUE_ALIAS_SET:
            return createValueAliasSet();
        case CimPackage.DISCONNECTOR:
            return createDisconnector();
        case CimPackage.GOV_GASTWD:
            return createGovGASTWD();
        case CimPackage.DISCRETE_VALUE:
            return createDiscreteValue();
        case CimPackage.HAZARD:
            return createHazard();
        case CimPackage.EXC_AC2A:
            return createExcAC2A();
        case CimPackage.GOV_STEAM_CC:
            return createGovSteamCC();
        case CimPackage.EXC_AC8B:
            return createExcAC8B();
        case CimPackage.OPERATIONAL_RESTRICTION:
            return createOperationalRestriction();
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS:
            return createSvShuntCompensatorSections();
        case CimPackage.EXC_REXS:
            return createExcREXS();
        case CimPackage.RECLOSER:
            return createRecloser();
        case CimPackage.TRANSACTOR:
            return createTransactor();
        case CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED:
            return createVoltageCompensatorUserDefined();
        case CimPackage.GROUNDING_IMPEDANCE:
            return createGroundingImpedance();
        case CimPackage.EXC_ELIN2:
            return createExcELIN2();
        case CimPackage.EXC_OEX3T:
            return createExcOEX3T();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER:
            return createPFVArType1IEEEVArController();
        case CimPackage.VEHICLE:
            return createVehicle();
        case CimPackage.TRANSFORMER_END:
            return createTransformerEnd();
        case CimPackage.WIND_AERO_LINEAR_IEC:
            return createWindAeroLinearIEC();
        case CimPackage.SV_TAP_STEP:
            return createSvTapStep();
        case CimPackage.STRING_MEASUREMENT_VALUE:
            return createStringMeasurementValue();
        case CimPackage.GOV_HYDRO_IEEE0:
            return createGovHydroIEEE0();
        case CimPackage.GOV_GAST:
            return createGovGAST();
        case CimPackage.VOLTAGE_LEVEL:
            return createVoltageLevel();
        case CimPackage.EXC_IEEEDC1A:
            return createExcIEEEDC1A();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER:
            return createPFVArType2IEEEPFController();
        case CimPackage.DC_BUSBAR:
            return createDCBusbar();
        case CimPackage.IRREGULAR_INTERVAL_SCHEDULE:
            return createIrregularIntervalSchedule();
        case CimPackage.WIND_CONT_PTYPE3_IEC:
            return createWindContPType3IEC();
        case CimPackage.CHARGE:
            return createCharge();
        case CimPackage.SV_STATUS:
            return createSvStatus();
        case CimPackage.AUXILIARY_ACCOUNT:
            return createAuxiliaryAccount();
        case CimPackage.MANUFACTURER:
            return createManufacturer();
        case CimPackage.SWITCH_PHASE:
            return createSwitchPhase();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A:
            return createDiscExcContIEEEDEC2A();
        case CimPackage.CUT_ACTION:
            return createCutAction();
        case CimPackage.FREQUENCY_CONVERTER:
            return createFrequencyConverter();
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return createPFVArControllerType1Dynamics();
        case CimPackage.GOV_STEAM_FV3:
            return createGovSteamFV3();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC:
            return createWindTurbineType3or4IEC();
        case CimPackage.FAULT_CAUSE_TYPE:
            return createFaultCauseType();
        case CimPackage.WIND_GEN_TURBINE_TYPE3_IEC:
            return createWindGenTurbineType3IEC();
        case CimPackage.LOAD_GROUP:
            return createLoadGroup();
        case CimPackage.WIND_GEN_TURBINE_TYPE1_IEC:
            return createWindGenTurbineType1IEC();
        case CimPackage.VCOMP_IEEE_TYPE1:
            return createVCompIEEEType1();
        case CimPackage.SURGE_ARRESTER:
            return createSurgeArrester();
        case CimPackage.AIR_COMPRESSOR:
            return createAirCompressor();
        case CimPackage.EXC_IEEEAC1A:
            return createExcIEEEAC1A();
        case CimPackage.MEASUREMENT_VALUE_SOURCE:
            return createMeasurementValueSource();
        case CimPackage.AGREEMENT:
            return createAgreement();
        case CimPackage.PLANT:
            return createPlant();
        case CimPackage.MEASUREMENT:
            return createMeasurement();
        case CimPackage.REGULATION_SCHEDULE:
            return createRegulationSchedule();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE:
            return createTransformerStarImpedance();
        case CimPackage.ENERGY_CONSUMER_PHASE:
            return createEnergyConsumerPhase();
        case CimPackage.LOAD_AGGREGATE:
            return createLoadAggregate();
        case CimPackage.DC_TOPOLOGICAL_ISLAND:
            return createDCTopologicalIsland();
        case CimPackage.GOV_STEAM_IEEE1:
            return createGovSteamIEEE1();
        case CimPackage.RATIO_TAP_CHANGER_TABLE:
            return createRatioTapChangerTable();
        case CimPackage.CUT:
            return createCut();
        case CimPackage.CASHIER_SHIFT:
            return createCashierShift();
        case CimPackage.ACCUMULATOR:
            return createAccumulator();
        case CimPackage.ASSET_USER:
            return createAssetUser();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE:
            return createFuelAllocationSchedule();
        case CimPackage.COMBINED_CYCLE_PLANT:
            return createCombinedCyclePlant();
        case CimPackage.GENERIC_ACTION:
            return createGenericAction();
        case CimPackage.CURRENT_TRANSFORMER:
            return createCurrentTransformer();
        case CimPackage.SYNCHRONOUS_MACHINE_SIMPLIFIED:
            return createSynchronousMachineSimplified();
        case CimPackage.SYNCHROCHECK_RELAY:
            return createSynchrocheckRelay();
        case CimPackage.TURB_LCFB1:
            return createTurbLCFB1();
        case CimPackage.PAN_PRICING_DETAIL:
            return createPanPricingDetail();
        case CimPackage.BAY:
            return createBay();
        case CimPackage.GENERATING_UNIT:
            return createGeneratingUnit();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS:
            return createSynchronousMachineDynamics();
        case CimPackage.USAGE_POINT_GROUP:
            return createUsagePointGroup();
        case CimPackage.COM_MODULE:
            return createComModule();
        case CimPackage.HYDRO_POWER_PLANT:
            return createHydroPowerPlant();
        case CimPackage.POST_LINE_SENSOR:
            return createPostLineSensor();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL:
            return createConsumptionTariffInterval();
        case CimPackage.EQUIVALENT_SHUNT:
            return createEquivalentShunt();
        case CimPackage.AC_LINE_SEGMENT_PHASE:
            return createACLineSegmentPhase();
        case CimPackage.DC_LINE:
            return createDCLine();
        case CimPackage.TOPOLOGICAL_ISLAND:
            return createTopologicalIsland();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER:
            return createPFVArType2IEEEVArController();
        case CimPackage.PSS1:
            return createPss1();
        case CimPackage.VADJ_IEEE:
            return createVAdjIEEE();
        case CimPackage.LOAD_AREA:
            return createLoadArea();
        case CimPackage.EQUIVALENT_BRANCH:
            return createEquivalentBranch();
        case CimPackage.WIND_PLANT_DYNAMICS:
            return createWindPlantDynamics();
        case CimPackage.VENDOR:
            return createVendor();
        case CimPackage.DC_GROUND:
            return createDCGround();
        case CimPackage.PSS_PTIST3:
            return createPssPTIST3();
        case CimPackage.GOV_GAST2:
            return createGovGAST2();
        case CimPackage.POTENTIAL_TRANSFORMER:
            return createPotentialTransformer();
        case CimPackage.APPOINTMENT:
            return createAppointment();
        case CimPackage.NAME_TYPE:
            return createNameType();
        case CimPackage.THERMAL_GENERATING_UNIT:
            return createThermalGeneratingUnit();
        case CimPackage.TARGET_LEVEL_SCHEDULE:
            return createTargetLevelSchedule();
        case CimPackage.FUSE:
            return createFuse();
        case CimPackage.EXC_ST4B:
            return createExcST4B();
        case CimPackage.POWER_TRANSFORMER_INFO:
            return createPowerTransformerInfo();
        case CimPackage.CONNECTOR:
            return createConnector();
        case CimPackage.ORGANISATION_ROLE:
            return createOrganisationRole();
        case CimPackage.PWR_STEAM_SUPPLY:
            return createPWRSteamSupply();
        case CimPackage.DC_CHOPPER:
            return createDCChopper();
        case CimPackage.PENDING_CALCULATION:
            return createPendingCalculation();
        case CimPackage.COORDINATE_SYSTEM:
            return createCoordinateSystem();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR:
            return createNonlinearShuntCompensator();
        case CimPackage.GROUND_ACTION:
            return createGroundAction();
        case CimPackage.COM_MEDIA:
            return createComMedia();
        case CimPackage.PSS_IEEE2B:
            return createPssIEEE2B();
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE:
            return createIncrementalHeatRateCurve();
        case CimPackage.GOV_STEAM_FV4:
            return createGovSteamFV4();
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC:
            return createWindGenTurbineType2IEC();
        case CimPackage.BASE_WORK:
            return createBaseWork();
        case CimPackage.TAP_SCHEDULE:
            return createTapSchedule();
        case CimPackage.DIAGRAM_OBJECT_STYLE:
            return createDiagramObjectStyle();
        case CimPackage.WIND_GEN_TYPE4_IEC:
            return createWindGenType4IEC();
        case CimPackage.WIND_PITCH_CONT_EMUL_IEC:
            return createWindPitchContEmulIEC();
        case CimPackage.CONTINGENCY_EQUIPMENT:
            return createContingencyEquipment();
        case CimPackage.ANALOG_CONTROL:
            return createAnalogControl();
        case CimPackage.INCIDENT:
            return createIncident();
        case CimPackage.ASSET_MODEL:
            return createAssetModel();
        case CimPackage.EXC_IEEEST4B:
            return createExcIEEEST4B();
        case CimPackage.PRICING_STRUCTURE:
            return createPricingStructure();
        case CimPackage.EXCITATION_SYSTEM_USER_DEFINED:
            return createExcitationSystemUserDefined();
        case CimPackage.STRING_MEASUREMENT:
            return createStringMeasurement();
        case CimPackage.REGULAR_TIME_POINT:
            return createRegularTimePoint();
        case CimPackage.REPORTING_SUPER_GROUP:
            return createReportingSuperGroup();
        case CimPackage.REMOTE_CONTROL:
            return createRemoteControl();
        case CimPackage.NON_CONFORM_LOAD_GROUP:
            return createNonConformLoadGroup();
        case CimPackage.SIMPLE_END_DEVICE_FUNCTION:
            return createSimpleEndDeviceFunction();
        case CimPackage.ASYNCHRONOUS_MACHINE:
            return createAsynchronousMachine();
        case CimPackage.DC_TOPOLOGICAL_NODE:
            return createDCTopologicalNode();
        case CimPackage.EXC_DC3A:
            return createExcDC3A();
        case CimPackage.CONNECTIVITY_NODE:
            return createConnectivityNode();
        case CimPackage.OPERATING_SHARE:
            return createOperatingShare();
        case CimPackage.EXC_ST2A:
            return createExcST2A();
        case CimPackage.REGISTER:
            return createRegister();
        case CimPackage.HEAT_RECOVERY_BOILER:
            return createHeatRecoveryBoiler();
        case CimPackage.ACCUMULATOR_LIMIT:
            return createAccumulatorLimit();
        case CimPackage.WIND_PLANT_IEC:
            return createWindPlantIEC();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE:
            return createPerLengthSequenceImpedance();
        case CimPackage.SCHEDULED_EVENT:
            return createScheduledEvent();
        case CimPackage.CABLE_INFO:
            return createCableInfo();
        case CimPackage.BASE_READING:
            return createBaseReading();
        case CimPackage.ORGANISATION:
            return createOrganisation();
        case CimPackage.PSS_SH:
            return createPssSH();
        case CimPackage.SWITCH_ACTION:
            return createSwitchAction();
        case CimPackage.DISCRETE_COMMAND:
            return createDiscreteCommand();
        case CimPackage.DIAGRAM_OBJECT_POINT:
            return createDiagramObjectPoint();
        case CimPackage.NAME_TYPE_AUTHORITY:
            return createNameTypeAuthority();
        case CimPackage.OVERHEAD_WIRE_INFO:
            return createOverheadWireInfo();
        case CimPackage.SYNCHRONOUS_MACHINE:
            return createSynchronousMachine();
        case CimPackage.SWITCH_SCHEDULE:
            return createSwitchSchedule();
        case CimPackage.ENERGY_SOURCE:
            return createEnergySource();
        case CimPackage.DISCRETE:
            return createDiscrete();
        case CimPackage.END_DEVICE_EVENT_DETAIL:
            return createEndDeviceEventDetail();
        case CimPackage.PHASE_TAP_CHANGER_TABULAR:
            return createPhaseTapChangerTabular();
        case CimPackage.CONDUCTING_EQUIPMENT:
            return createConductingEquipment();
        case CimPackage.GOV_STEAM_SGO:
            return createGovSteamSGO();
        case CimPackage.PSS2_B:
            return createPss2B();
        case CimPackage.END_DEVICE_INFO:
            return createEndDeviceInfo();
        case CimPackage.EXC_ELIN1:
            return createExcELIN1();
        case CimPackage.EXC_ST6B:
            return createExcST6B();
        case CimPackage.CONFORM_LOAD_SCHEDULE:
            return createConformLoadSchedule();
        case CimPackage.TIME_TARIFF_INTERVAL:
            return createTimeTariffInterval();
        case CimPackage.SEASON:
            return createSeason();
        case CimPackage.EXC_IEEEST6B:
            return createExcIEEEST6B();
        case CimPackage.POWER_SYSTEM_RESOURCE:
            return createPowerSystemResource();
        case CimPackage.VISIBILITY_LAYER:
            return createVisibilityLayer();
        case CimPackage.EXC_IEEEAC7B:
            return createExcIEEEAC7B();
        case CimPackage.HEAT_RATE_CURVE:
            return createHeatRateCurve();
        case CimPackage.GOV_HYDRO_WPID:
            return createGovHydroWPID();
        case CimPackage.APPARENT_POWER_LIMIT:
            return createApparentPowerLimit();
        case CimPackage.END_DEVICE_GROUP:
            return createEndDeviceGroup();
        case CimPackage.PSS_IEEE4B:
            return createPssIEEE4B();
        case CimPackage.END_DEVICE_CONTROL_TYPE:
            return createEndDeviceControlType();
        case CimPackage.EQUIVALENT_INJECTION:
            return createEquivalentInjection();
        case CimPackage.WORK_TASK:
            return createWorkTask();
        case CimPackage.TAP_CHANGER_CONTROL:
            return createTapChangerControl();
        case CimPackage.DC_TERMINAL:
            return createDCTerminal();
        case CimPackage.TEXT_DIAGRAM_OBJECT:
            return createTextDiagramObject();
        case CimPackage.GOV_HYDRO_WEH:
            return createGovHydroWEH();
        case CimPackage.EARTH_FAULT_COMPENSATOR:
            return createEarthFaultCompensator();
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR:
            return createPhaseTapChangerNonLinear();
        case CimPackage.PENSTOCK_LOSS_CURVE:
            return createPenstockLossCurve();
        case CimPackage.EXC_IEEEAC8B:
            return createExcIEEEAC8B();
        case CimPackage.LOAD_STATIC:
            return createLoadStatic();
        case CimPackage.REACTIVE_CAPABILITY_CURVE:
            return createReactiveCapabilityCurve();
        case CimPackage.TRANSFORMER_END_INFO:
            return createTransformerEndInfo();
        case CimPackage.EXC_DC1A:
            return createExcDC1A();
        case CimPackage.EXC_IEEEST7B:
            return createExcIEEEST7B();
        case CimPackage.EXC_IEEEAC6A:
            return createExcIEEEAC6A();
        case CimPackage.TAILBAY_LOSS_CURVE:
            return createTailbayLossCurve();
        case CimPackage.SHUNT_COMPENSATOR:
            return createShuntCompensator();
        case CimPackage.EXC_AC5A:
            return createExcAC5A();
        case CimPackage.VALUE_TO_ALIAS:
            return createValueToAlias();
        case CimPackage.VCOMP_IEEE_TYPE2:
            return createVCompIEEEType2();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT:
            return createAsynchronousMachineEquivalentCircuit();
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return createWindTurbineType1or2Dynamics();
        case CimPackage.SERVICE_CATEGORY:
            return createServiceCategory();
        case CimPackage.SUBCRITICAL:
            return createSubcritical();
        case CimPackage.STEAM_SENDOUT_SCHEDULE:
            return createSteamSendoutSchedule();
        case CimPackage.GEOGRAPHICAL_REGION:
            return createGeographicalRegion();
        case CimPackage.ANALOG_LIMIT_SET:
            return createAnalogLimitSet();
        case CimPackage.WORK_TIME_SCHEDULE:
            return createWorkTimeSchedule();
        case CimPackage.CREW_MEMBER:
            return createCrewMember();
        case CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            return createTurbineLoadControllerUserDefined();
        case CimPackage.LOAD_GENERIC_NON_LINEAR:
            return createLoadGenericNonLinear();
        case CimPackage.WIND_CONT_CURR_LIM_IEC:
            return createWindContCurrLimIEC();
        case CimPackage.HYDRO_PUMP:
            return createHydroPump();
        case CimPackage.ASSET:
            return createAsset();
        case CimPackage.READING_QUALITY_TYPE:
            return createReadingQualityType();
        case CimPackage.WIND_TYPE1OR2_USER_DEFINED:
            return createWindType1or2UserDefined();
        case CimPackage.WIND_CONT_QIEC:
            return createWindContQIEC();
        case CimPackage.CONTROL_AREA_GENERATING_UNIT:
            return createControlAreaGeneratingUnit();
        case CimPackage.PRODUCT_ASSET_MODEL:
            return createProductAssetModel();
        case CimPackage.END_DEVICE_EVENT:
            return createEndDeviceEvent();
        case CimPackage.METROLOGY_REQUIREMENT:
            return createMetrologyRequirement();
        case CimPackage.LEVEL_VS_VOLUME_CURVE:
            return createLevelVsVolumeCurve();
        case CimPackage.WIND_MECH_IEC:
            return createWindMechIEC();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED:
            return createUnderexcLim2Simplified();
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS:
            return createTurbineLoadControllerDynamics();
        case CimPackage.IRREGULAR_TIME_POINT:
            return createIrregularTimePoint();
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED:
            return createOverexcitationLimiterUserDefined();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A:
            return createDiscExcContIEEEDEC1A();
        case CimPackage.REMOTE_POINT:
            return createRemotePoint();
        case CimPackage.EXC_SEXS:
            return createExcSEXS();
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS:
            return createOverexcitationLimiterDynamics();
        case CimPackage.MAINTENANCE_LOCATION:
            return createMaintenanceLocation();
        case CimPackage.SERVICE_SUPPLIER:
            return createServiceSupplier();
        case CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED:
            return createAsynchronousMachineUserDefined();
        case CimPackage.CARD:
            return createCard();
        case CimPackage.GROUND_DISCONNECTOR:
            return createGroundDisconnector();
        case CimPackage.READING:
            return createReading();
        case CimPackage.STATIC_VAR_COMPENSATOR:
            return createStaticVarCompensator();
        case CimPackage.METER:
            return createMeter();
        case CimPackage.WIND_CONT_PTYPE4A_IEC:
            return createWindContPType4aIEC();
        case CimPackage.WIND_PROTECTION_IEC:
            return createWindProtectionIEC();
        case CimPackage.PROTECTED_SWITCH:
            return createProtectedSwitch();
        case CimPackage.LIMIT_SET:
            return createLimitSet();
        case CimPackage.JUNCTION:
            return createJunction();
        case CimPackage.CHEQUE:
            return createCheque();
        case CimPackage.TERMINAL:
            return createTerminal();
        case CimPackage.PFV_AR_TYPE2_COMMON1:
            return createPFVArType2Common1();
        case CimPackage.TAP_CHANGER_TABLE_POINT:
            return createTapChangerTablePoint();
        case CimPackage.TIME_SCHEDULE:
            return createTimeSchedule();
        case CimPackage.OPERATOR:
            return createOperator();
        case CimPackage.GOV_GAST3:
            return createGovGAST3();
        case CimPackage.SHIFT:
            return createShift();
        case CimPackage.DC_NODE:
            return createDCNode();
        case CimPackage.TARIFF:
            return createTariff();
        case CimPackage.PSS_SB4:
            return createPssSB4();
        case CimPackage.WIND_AERO_CONST_IEC:
            return createWindAeroConstIEC();
        case CimPackage.HEAT_INPUT_CURVE:
            return createHeatInputCurve();
        case CimPackage.EXC_CZ:
            return createExcCZ();
        case CimPackage.EXC_BBC:
            return createExcBBC();
        case CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS:
            return createUnderexcitationLimiterDynamics();
        case CimPackage.DC_CONVERTER_UNIT:
            return createDCConverterUnit();
        case CimPackage.PROCEDURE_DATA_SET:
            return createProcedureDataSet();
        case CimPackage.NO_LOAD_TEST:
            return createNoLoadTest();
        case CimPackage.CHANNEL:
            return createChannel();
        case CimPackage.DRUM_BOILER:
            return createDrumBoiler();
        case CimPackage.BWR_STEAM_SUPPLY:
            return createBWRSteamSupply();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO:
            return createConcentricNeutralCableInfo();
        case CimPackage.WIRE_INFO:
            return createWireInfo();
        case CimPackage.MECHANICAL_LOAD_USER_DEFINED:
            return createMechanicalLoadUserDefined();
        case CimPackage.EXC_ST7B:
            return createExcST7B();
        case CimPackage.SHUTDOWN_CURVE:
            return createShutdownCurve();
        case CimPackage.ACCUMULATOR_VALUE:
            return createAccumulatorValue();
        case CimPackage.RAISE_LOWER_COMMAND:
            return createRaiseLowerCommand();
        case CimPackage.BASE_VOLTAGE:
            return createBaseVoltage();
        case CimPackage.CREW_TYPE:
            return createCrewType();
        case CimPackage.EXC_AVR3:
            return createExcAVR3();
        case CimPackage.OPERATIONAL_LIMIT_TYPE:
            return createOperationalLimitType();
        case CimPackage.TOPOLOGICAL_NODE:
            return createTopologicalNode();
        case CimPackage.GOV_STEAM_FV2:
            return createGovSteamFV2();
        case CimPackage.EXC_AC6A:
            return createExcAC6A();
        case CimPackage.CASHIER:
            return createCashier();
        case CimPackage.ASSET_INFO:
            return createAssetInfo();
        case CimPackage.NAME:
            return createName();
        case CimPackage.SEAL:
            return createSeal();
        case CimPackage.REGULAR_INTERVAL_SCHEDULE:
            return createRegularIntervalSchedule();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC:
            return createWindPlantFreqPcontrolIEC();
        case CimPackage.REMOTE_SOURCE:
            return createRemoteSource();
        case CimPackage.HYDRO_TURBINE:
            return createHydroTurbine();
        case CimPackage.ACTIVE_POWER_LIMIT:
            return createActivePowerLimit();
        case CimPackage.ENERGY_CONSUMER:
            return createEnergyConsumer();
        case CimPackage.GOV_GAST1:
            return createGovGAST1();
        case CimPackage.INCIDENT_HAZARD:
            return createIncidentHazard();
        case CimPackage.TOOL:
            return createTool();
        case CimPackage.SENSOR:
            return createSensor();
        case CimPackage.TIE_FLOW:
            return createTieFlow();
        case CimPackage.EXC_PIC:
            return createExcPIC();
        case CimPackage.OPEN_CIRCUIT_TEST:
            return createOpenCircuitTest();
        case CimPackage.TAG_ACTION:
            return createTagAction();
        case CimPackage.GOV_HYDRO4:
            return createGovHydro4();
        case CimPackage.REGULATING_COND_EQ:
            return createRegulatingCondEq();
        case CimPackage.PERSON_ROLE:
            return createPersonRole();
        case CimPackage.EXC_AC3A:
            return createExcAC3A();
        case CimPackage.RATIO_TAP_CHANGER:
            return createRatioTapChanger();
        case CimPackage.BUSBAR_SECTION:
            return createBusbarSection();
        case CimPackage.TURBINE_GOVERNOR_USER_DEFINED:
            return createTurbineGovernorUserDefined();
        case CimPackage.TRANSFORMER_TANK_END:
            return createTransformerTankEnd();
        case CimPackage.ENERGY_SOURCE_ACTION:
            return createEnergySourceAction();
        case CimPackage.SCHEDULED_EVENT_DATA:
            return createScheduledEventData();
        case CimPackage.VS_CAPABILITY_CURVE:
            return createVsCapabilityCurve();
        case CimPackage.GOV_HYDRO_IEEE2:
            return createGovHydroIEEE2();
        case CimPackage.WORK_LOCATION:
            return createWorkLocation();
        case CimPackage.PAN_PRICING:
            return createPanPricing();
        case CimPackage.OVEREXC_LIM2:
            return createOverexcLim2();
        case CimPackage.END_DEVICE_CONTROL:
            return createEndDeviceControl();
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE:
            return createHydroPumpOpSchedule();
        case CimPackage.EXC_IEEEST3A:
            return createExcIEEEST3A();
        case CimPackage.SWITCH_INFO:
            return createSwitchInfo();
        case CimPackage.GOV_STEAM1:
            return createGovSteam1();
        case CimPackage.IEC61968CIM_VERSION:
            return createIEC61968CIMVersion();
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT:
            return createDiagramObjectGluePoint();
        case CimPackage.PHASE_TAP_CHANGER_TABLE:
            return createPhaseTapChangerTable();
        case CimPackage.EXC_SK:
            return createExcSK();
        case CimPackage.SHORT_CIRCUIT_TEST:
            return createShortCircuitTest();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE:
            return createSynchronousMachineTimeConstantReactance();
        case CimPackage.HYDRO_GENERATING_UNIT:
            return createHydroGeneratingUnit();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT:
            return createNonlinearShuntCompensatorPoint();
        case CimPackage.OVEREXC_LIM_IEEE:
            return createOverexcLimIEEE();
        case CimPackage.END_DEVICE_FUNCTION:
            return createEndDeviceFunction();
        case CimPackage.ROTATING_MACHINE_DYNAMICS:
            return createRotatingMachineDynamics();
        case CimPackage.GOV_HYDRO_DD:
            return createGovHydroDD();
        case CimPackage.ANALOG:
            return createAnalog();
        case CimPackage.EQUIPMENT:
            return createEquipment();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT:
            return createSynchronousMachineEquivalentCircuit();
        case CimPackage.CURRENT_RELAY:
            return createCurrentRelay();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE:
            return createWindDynamicsLookupTable();
        case CimPackage.PAN_DISPLAY:
            return createPanDisplay();
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return createWindTurbineType3or4Dynamics();
        case CimPackage.BUSBAR_SECTION_INFO:
            return createBusbarSectionInfo();
        case CimPackage.EXC_IEEEAC5A:
            return createExcIEEEAC5A();
        case CimPackage.EXC_AC4A:
            return createExcAC4A();
        case CimPackage.EXC_ST3A:
            return createExcST3A();
        case CimPackage.SUPERCRITICAL:
            return createSupercritical();
        case CimPackage.WIND_CONT_PTYPE4B_IEC:
            return createWindContPType4bIEC();
        case CimPackage.CONTINGENCY_ELEMENT:
            return createContingencyElement();
        case CimPackage.COMBUSTION_TURBINE:
            return createCombustionTurbine();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE:
            return createTransformerMeshImpedance();
        case CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED:
            return createSynchronousMachineUserDefined();
        case CimPackage.GOV_CT2:
            return createGovCT2();
        case CimPackage.PSS_IEEE1A:
            return createPssIEEE1A();
        case CimPackage.SV_POWER_FLOW:
            return createSvPowerFlow();
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE:
            return createSeasonDayTypeSchedule();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR:
            return createLinearShuntCompensator();
        case CimPackage.DC_EQUIPMENT_CONTAINER:
            return createDCEquipmentContainer();
        case CimPackage.SERVICE_MULTIPLIER:
            return createServiceMultiplier();
        case CimPackage.EXC_AVR4:
            return createExcAVR4();
        case CimPackage.REGULATING_CONTROL:
            return createRegulatingControl();
        case CimPackage.VOLTAGE_CONTROL_ZONE:
            return createVoltageControlZone();
        case CimPackage.DC_BASE_TERMINAL:
            return createDCBaseTerminal();
        case CimPackage.DYNAMICS_FUNCTION_BLOCK:
            return createDynamicsFunctionBlock();
        case CimPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE:
            return createGrossToNetActivePowerCurve();
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT:
            return createPhaseTapChangerTablePoint();
        case CimPackage.DC_BREAKER:
            return createDCBreaker();
        case CimPackage.TIME_POINT:
            return createTimePoint();
        case CimPackage.EMISSION_CURVE:
            return createEmissionCurve();
        case CimPackage.SERVICE_LOCATION:
            return createServiceLocation();
        case CimPackage.MATERIAL_ITEM:
            return createMaterialItem();
        case CimPackage.TAPE_SHIELD_CABLE_INFO:
            return createTapeShieldCableInfo();
        case CimPackage.STEAM_SUPPLY:
            return createSteamSupply();
        case CimPackage.GOV_HYDRO_R:
            return createGovHydroR();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE:
            return createLinearShuntCompensatorPhase();
        case CimPackage.GOV_HYDRO_FRANCIS:
            return createGovHydroFrancis();
        case CimPackage.ENERGY_SCHEDULING_TYPE:
            return createEnergySchedulingType();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch( eDataType.getClassifierID() ) {
        case CimPackage.CONTINGENCY_EQUIPMENT_STATUS_KIND:
            return createContingencyEquipmentStatusKindFromString( eDataType, initialValue );
        case CimPackage.SYNCHRONOUS_MACHINE_MODEL_KIND:
            return createSynchronousMachineModelKindFromString( eDataType, initialValue );
        case CimPackage.CURRENCY:
            return createCurrencyFromString( eDataType, initialValue );
        case CimPackage.UNIT_MULTIPLIER:
            return createUnitMultiplierFromString( eDataType, initialValue );
        case CimPackage.HYDRO_PLANT_STORAGE_KIND:
            return createHydroPlantStorageKindFromString( eDataType, initialValue );
        case CimPackage.VS_QPCC_CONTROL_KIND:
            return createVsQpccControlKindFromString( eDataType, initialValue );
        case CimPackage.PHASE_CODE:
            return createPhaseCodeFromString( eDataType, initialValue );
        case CimPackage.SHORT_CIRCUIT_ROTOR_KIND:
            return createShortCircuitRotorKindFromString( eDataType, initialValue );
        case CimPackage.READING_REASON_KIND:
            return createReadingReasonKindFromString( eDataType, initialValue );
        case CimPackage.WORK_TASK_KIND:
            return createWorkTaskKindFromString( eDataType, initialValue );
        case CimPackage.PSR_EVENT_KIND:
            return createPSREventKindFromString( eDataType, initialValue );
        case CimPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
            return createOperationalLimitDirectionKindFromString( eDataType, initialValue );
        case CimPackage.CONTROL_AREA_TYPE_KIND:
            return createControlAreaTypeKindFromString( eDataType, initialValue );
        case CimPackage.UNIT_SYMBOL:
            return createUnitSymbolFromString( eDataType, initialValue );
        case CimPackage.EXC_ST7BOE_LSELECTOR_KIND:
            return createExcST7BOELselectorKindFromString( eDataType, initialValue );
        case CimPackage.INPUT_SIGNAL_KIND:
            return createInputSignalKindFromString( eDataType, initialValue );
        case CimPackage.IFD_BASE_KIND:
            return createIfdBaseKindFromString( eDataType, initialValue );
        case CimPackage.SINGLE_PHASE_KIND:
            return createSinglePhaseKindFromString( eDataType, initialValue );
        case CimPackage.TENDER_KIND:
            return createTenderKindFromString( eDataType, initialValue );
        case CimPackage.CORPORATE_STANDARD_KIND:
            return createCorporateStandardKindFromString( eDataType, initialValue );
        case CimPackage.NOTIFICATION_TRIGGER_KIND:
            return createNotificationTriggerKindFromString( eDataType, initialValue );
        case CimPackage.GENERATOR_CONTROL_SOURCE:
            return createGeneratorControlSourceFromString( eDataType, initialValue );
        case CimPackage.WORK_STATUS_KIND:
            return createWorkStatusKindFromString( eDataType, initialValue );
        case CimPackage.PROCEDURE_KIND:
            return createProcedureKindFromString( eDataType, initialValue );
        case CimPackage.RANDOMISATION_KIND:
            return createRandomisationKindFromString( eDataType, initialValue );
        case CimPackage.SUPPLIER_KIND:
            return createSupplierKindFromString( eDataType, initialValue );
        case CimPackage.CLEARANCE_ACTION_KIND:
            return createClearanceActionKindFromString( eDataType, initialValue );
        case CimPackage.DROOP_SIGNAL_FEEDBACK_KIND:
            return createDroopSignalFeedbackKindFromString( eDataType, initialValue );
        case CimPackage.WIND_GEN_UNIT_KIND:
            return createWindGenUnitKindFromString( eDataType, initialValue );
        case CimPackage.CABLE_OUTER_JACKET_KIND:
            return createCableOuterJacketKindFromString( eDataType, initialValue );
        case CimPackage.SERVICE_MULTIPLIER_KIND:
            return createServiceMultiplierKindFromString( eDataType, initialValue );
        case CimPackage.WIRE_INSULATION_KIND:
            return createWireInsulationKindFromString( eDataType, initialValue );
        case CimPackage.CUSTOMER_KIND:
            return createCustomerKindFromString( eDataType, initialValue );
        case CimPackage.TEMP_EQUIP_ACTION_KIND:
            return createTempEquipActionKindFromString( eDataType, initialValue );
        case CimPackage.METER_MULTIPLIER_KIND:
            return createMeterMultiplierKindFromString( eDataType, initialValue );
        case CimPackage.CURVE_STYLE:
            return createCurveStyleFromString( eDataType, initialValue );
        case CimPackage.ASYNCHRONOUS_MACHINE_KIND:
            return createAsynchronousMachineKindFromString( eDataType, initialValue );
        case CimPackage.PETERSEN_COIL_MODE_KIND:
            return createPetersenCoilModeKindFromString( eDataType, initialValue );
        case CimPackage.BOILER_CONTROL_MODE:
            return createBoilerControlModeFromString( eDataType, initialValue );
        case CimPackage.ROTOR_KIND:
            return createRotorKindFromString( eDataType, initialValue );
        case CimPackage.POTENTIAL_TRANSFORMER_KIND:
            return createPotentialTransformerKindFromString( eDataType, initialValue );
        case CimPackage.EXC_IEEEST1AUE_LSELECTOR_KIND:
            return createExcIEEEST1AUELselectorKindFromString( eDataType, initialValue );
        case CimPackage.VALIDITY:
            return createValidityFromString( eDataType, initialValue );
        case CimPackage.SEAL_CONDITION_KIND:
            return createSealConditionKindFromString( eDataType, initialValue );
        case CimPackage.EMISSION_VALUE_SOURCE:
            return createEmissionValueSourceFromString( eDataType, initialValue );
        case CimPackage.EXC_ST7BUE_LSELECTOR_KIND:
            return createExcST7BUELselectorKindFromString( eDataType, initialValue );
        case CimPackage.SYNCHRONOUS_MACHINE_KIND:
            return createSynchronousMachineKindFromString( eDataType, initialValue );
        case CimPackage.COM_TECHNOLOGY_KIND:
            return createComTechnologyKindFromString( eDataType, initialValue );
        case CimPackage.EMISSION_TYPE:
            return createEmissionTypeFromString( eDataType, initialValue );
        case CimPackage.REMOTE_UNIT_TYPE:
            return createRemoteUnitTypeFromString( eDataType, initialValue );
        case CimPackage.ASSET_MODEL_USAGE_KIND:
            return createAssetModelUsageKindFromString( eDataType, initialValue );
        case CimPackage.USAGE_POINT_CONNECTED_KIND:
            return createUsagePointConnectedKindFromString( eDataType, initialValue );
        case CimPackage.SVC_CONTROL_MODE:
            return createSVCControlModeFromString( eDataType, initialValue );
        case CimPackage.SEAL_KIND:
            return createSealKindFromString( eDataType, initialValue );
        case CimPackage.BUSBAR_CONFIGURATION:
            return createBusbarConfigurationFromString( eDataType, initialValue );
        case CimPackage.PHASE_CONNECTED_FAULT_KIND:
            return createPhaseConnectedFaultKindFromString( eDataType, initialValue );
        case CimPackage.PHASE_SHUNT_CONNECTION_KIND:
            return createPhaseShuntConnectionKindFromString( eDataType, initialValue );
        case CimPackage.WIND_LVRT_QCONTROL_MODES_KIND:
            return createWindLVRTQcontrolModesKindFromString( eDataType, initialValue );
        case CimPackage.TURBINE_TYPE:
            return createTurbineTypeFromString( eDataType, initialValue );
        case CimPackage.FRANCIS_GOVERNOR_CONTROL_KIND:
            return createFrancisGovernorControlKindFromString( eDataType, initialValue );
        case CimPackage.SERVICE_KIND:
            return createServiceKindFromString( eDataType, initialValue );
        case CimPackage.REGULATING_CONTROL_MODE_KIND:
            return createRegulatingControlModeKindFromString( eDataType, initialValue );
        case CimPackage.VS_PPCC_CONTROL_KIND:
            return createVsPpccControlKindFromString( eDataType, initialValue );
        case CimPackage.BREAKER_CONFIGURATION:
            return createBreakerConfigurationFromString( eDataType, initialValue );
        case CimPackage.COM_DIRECTION_KIND:
            return createComDirectionKindFromString( eDataType, initialValue );
        case CimPackage.WIRE_USAGE_KIND:
            return createWireUsageKindFromString( eDataType, initialValue );
        case CimPackage.EXC_REXS_FEEDBACK_SIGNAL_KIND:
            return createExcREXSFeedbackSignalKindFromString( eDataType, initialValue );
        case CimPackage.CHARGE_KIND:
            return createChargeKindFromString( eDataType, initialValue );
        case CimPackage.GENERATOR_CONTROL_MODE:
            return createGeneratorControlModeFromString( eDataType, initialValue );
        case CimPackage.WINDING_CONNECTION:
            return createWindingConnectionFromString( eDataType, initialValue );
        case CimPackage.TROUBLE_REPORTING_KIND:
            return createTroubleReportingKindFromString( eDataType, initialValue );
        case CimPackage.FUEL_TYPE:
            return createFuelTypeFromString( eDataType, initialValue );
        case CimPackage.DC_CONVERTER_OPERATING_MODE_KIND:
            return createDCConverterOperatingModeKindFromString( eDataType, initialValue );
        case CimPackage.TAG_ACTION_KIND:
            return createTagActionKindFromString( eDataType, initialValue );
        case CimPackage.WIRE_MATERIAL_KIND:
            return createWireMaterialKindFromString( eDataType, initialValue );
        case CimPackage.CHEQUE_KIND:
            return createChequeKindFromString( eDataType, initialValue );
        case CimPackage.WORK_KIND:
            return createWorkKindFromString( eDataType, initialValue );
        case CimPackage.STATIC_LOAD_MODEL_KIND:
            return createStaticLoadModelKindFromString( eDataType, initialValue );
        case CimPackage.CABLE_CONSTRUCTION_KIND:
            return createCableConstructionKindFromString( eDataType, initialValue );
        case CimPackage.REMOTE_SIGNAL_KIND:
            return createRemoteSignalKindFromString( eDataType, initialValue );
        case CimPackage.WIND_QCONTROL_MODES_KIND:
            return createWindQcontrolModesKindFromString( eDataType, initialValue );
        case CimPackage.VEHICLE_USAGE_KIND:
            return createVehicleUsageKindFromString( eDataType, initialValue );
        case CimPackage.AMI_BILLING_READY_KIND:
            return createAmiBillingReadyKindFromString( eDataType, initialValue );
        case CimPackage.COOLANT_TYPE:
            return createCoolantTypeFromString( eDataType, initialValue );
        case CimPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
            return createSynchronousMachineOperatingModeFromString( eDataType, initialValue );
        case CimPackage.EXC_ST6BOE_LSELECTOR_KIND:
            return createExcST6BOELselectorKindFromString( eDataType, initialValue );
        case CimPackage.WORK_TIME_SCHEDULE_KIND:
            return createWorkTimeScheduleKindFromString( eDataType, initialValue );
        case CimPackage.SWITCH_ACTION_KIND:
            return createSwitchActionKindFromString( eDataType, initialValue );
        case CimPackage.SOURCE:
            return createSourceFromString( eDataType, initialValue );
        case CimPackage.REVENUE_KIND:
            return createRevenueKindFromString( eDataType, initialValue );
        case CimPackage.CS_OPERATING_MODE_KIND:
            return createCsOperatingModeKindFromString( eDataType, initialValue );
        case CimPackage.GENERIC_NON_LINEAR_LOAD_MODEL_KIND:
            return createGenericNonLinearLoadModelKindFromString( eDataType, initialValue );
        case CimPackage.WIND_LOOKUP_TABLE_FUNCTION_KIND:
            return createWindLookupTableFunctionKindFromString( eDataType, initialValue );
        case CimPackage.TRANSMISSION_MODE_KIND:
            return createTransmissionModeKindFromString( eDataType, initialValue );
        case CimPackage.CS_PPCC_CONTROL_KIND:
            return createCsPpccControlKindFromString( eDataType, initialValue );
        case CimPackage.END_DEVICE_FUNCTION_KIND:
            return createEndDeviceFunctionKindFromString( eDataType, initialValue );
        case CimPackage.CABLE_SHIELD_MATERIAL_KIND:
            return createCableShieldMaterialKindFromString( eDataType, initialValue );
        case CimPackage.TRANSACTION_KIND:
            return createTransactionKindFromString( eDataType, initialValue );
        case CimPackage.TRANSFORMER_CONTROL_MODE:
            return createTransformerControlModeFromString( eDataType, initialValue );
        case CimPackage.ORIENTATION_KIND:
            return createOrientationKindFromString( eDataType, initialValue );
        case CimPackage.DC_POLARITY_KIND:
            return createDCPolarityKindFromString( eDataType, initialValue );
        case CimPackage.HYDRO_ENERGY_CONVERSION_KIND:
            return createHydroEnergyConversionKindFromString( eDataType, initialValue );
        case CimPackage.LIMIT_TYPE_KIND:
            return createLimitTypeKindFromString( eDataType, initialValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch( eDataType.getClassifierID() ) {
        case CimPackage.CONTINGENCY_EQUIPMENT_STATUS_KIND:
            return convertContingencyEquipmentStatusKindToString( eDataType, instanceValue );
        case CimPackage.SYNCHRONOUS_MACHINE_MODEL_KIND:
            return convertSynchronousMachineModelKindToString( eDataType, instanceValue );
        case CimPackage.CURRENCY:
            return convertCurrencyToString( eDataType, instanceValue );
        case CimPackage.UNIT_MULTIPLIER:
            return convertUnitMultiplierToString( eDataType, instanceValue );
        case CimPackage.HYDRO_PLANT_STORAGE_KIND:
            return convertHydroPlantStorageKindToString( eDataType, instanceValue );
        case CimPackage.VS_QPCC_CONTROL_KIND:
            return convertVsQpccControlKindToString( eDataType, instanceValue );
        case CimPackage.PHASE_CODE:
            return convertPhaseCodeToString( eDataType, instanceValue );
        case CimPackage.SHORT_CIRCUIT_ROTOR_KIND:
            return convertShortCircuitRotorKindToString( eDataType, instanceValue );
        case CimPackage.READING_REASON_KIND:
            return convertReadingReasonKindToString( eDataType, instanceValue );
        case CimPackage.WORK_TASK_KIND:
            return convertWorkTaskKindToString( eDataType, instanceValue );
        case CimPackage.PSR_EVENT_KIND:
            return convertPSREventKindToString( eDataType, instanceValue );
        case CimPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
            return convertOperationalLimitDirectionKindToString( eDataType, instanceValue );
        case CimPackage.CONTROL_AREA_TYPE_KIND:
            return convertControlAreaTypeKindToString( eDataType, instanceValue );
        case CimPackage.UNIT_SYMBOL:
            return convertUnitSymbolToString( eDataType, instanceValue );
        case CimPackage.EXC_ST7BOE_LSELECTOR_KIND:
            return convertExcST7BOELselectorKindToString( eDataType, instanceValue );
        case CimPackage.INPUT_SIGNAL_KIND:
            return convertInputSignalKindToString( eDataType, instanceValue );
        case CimPackage.IFD_BASE_KIND:
            return convertIfdBaseKindToString( eDataType, instanceValue );
        case CimPackage.SINGLE_PHASE_KIND:
            return convertSinglePhaseKindToString( eDataType, instanceValue );
        case CimPackage.TENDER_KIND:
            return convertTenderKindToString( eDataType, instanceValue );
        case CimPackage.CORPORATE_STANDARD_KIND:
            return convertCorporateStandardKindToString( eDataType, instanceValue );
        case CimPackage.NOTIFICATION_TRIGGER_KIND:
            return convertNotificationTriggerKindToString( eDataType, instanceValue );
        case CimPackage.GENERATOR_CONTROL_SOURCE:
            return convertGeneratorControlSourceToString( eDataType, instanceValue );
        case CimPackage.WORK_STATUS_KIND:
            return convertWorkStatusKindToString( eDataType, instanceValue );
        case CimPackage.PROCEDURE_KIND:
            return convertProcedureKindToString( eDataType, instanceValue );
        case CimPackage.RANDOMISATION_KIND:
            return convertRandomisationKindToString( eDataType, instanceValue );
        case CimPackage.SUPPLIER_KIND:
            return convertSupplierKindToString( eDataType, instanceValue );
        case CimPackage.CLEARANCE_ACTION_KIND:
            return convertClearanceActionKindToString( eDataType, instanceValue );
        case CimPackage.DROOP_SIGNAL_FEEDBACK_KIND:
            return convertDroopSignalFeedbackKindToString( eDataType, instanceValue );
        case CimPackage.WIND_GEN_UNIT_KIND:
            return convertWindGenUnitKindToString( eDataType, instanceValue );
        case CimPackage.CABLE_OUTER_JACKET_KIND:
            return convertCableOuterJacketKindToString( eDataType, instanceValue );
        case CimPackage.SERVICE_MULTIPLIER_KIND:
            return convertServiceMultiplierKindToString( eDataType, instanceValue );
        case CimPackage.WIRE_INSULATION_KIND:
            return convertWireInsulationKindToString( eDataType, instanceValue );
        case CimPackage.CUSTOMER_KIND:
            return convertCustomerKindToString( eDataType, instanceValue );
        case CimPackage.TEMP_EQUIP_ACTION_KIND:
            return convertTempEquipActionKindToString( eDataType, instanceValue );
        case CimPackage.METER_MULTIPLIER_KIND:
            return convertMeterMultiplierKindToString( eDataType, instanceValue );
        case CimPackage.CURVE_STYLE:
            return convertCurveStyleToString( eDataType, instanceValue );
        case CimPackage.ASYNCHRONOUS_MACHINE_KIND:
            return convertAsynchronousMachineKindToString( eDataType, instanceValue );
        case CimPackage.PETERSEN_COIL_MODE_KIND:
            return convertPetersenCoilModeKindToString( eDataType, instanceValue );
        case CimPackage.BOILER_CONTROL_MODE:
            return convertBoilerControlModeToString( eDataType, instanceValue );
        case CimPackage.ROTOR_KIND:
            return convertRotorKindToString( eDataType, instanceValue );
        case CimPackage.POTENTIAL_TRANSFORMER_KIND:
            return convertPotentialTransformerKindToString( eDataType, instanceValue );
        case CimPackage.EXC_IEEEST1AUE_LSELECTOR_KIND:
            return convertExcIEEEST1AUELselectorKindToString( eDataType, instanceValue );
        case CimPackage.VALIDITY:
            return convertValidityToString( eDataType, instanceValue );
        case CimPackage.SEAL_CONDITION_KIND:
            return convertSealConditionKindToString( eDataType, instanceValue );
        case CimPackage.EMISSION_VALUE_SOURCE:
            return convertEmissionValueSourceToString( eDataType, instanceValue );
        case CimPackage.EXC_ST7BUE_LSELECTOR_KIND:
            return convertExcST7BUELselectorKindToString( eDataType, instanceValue );
        case CimPackage.SYNCHRONOUS_MACHINE_KIND:
            return convertSynchronousMachineKindToString( eDataType, instanceValue );
        case CimPackage.COM_TECHNOLOGY_KIND:
            return convertComTechnologyKindToString( eDataType, instanceValue );
        case CimPackage.EMISSION_TYPE:
            return convertEmissionTypeToString( eDataType, instanceValue );
        case CimPackage.REMOTE_UNIT_TYPE:
            return convertRemoteUnitTypeToString( eDataType, instanceValue );
        case CimPackage.ASSET_MODEL_USAGE_KIND:
            return convertAssetModelUsageKindToString( eDataType, instanceValue );
        case CimPackage.USAGE_POINT_CONNECTED_KIND:
            return convertUsagePointConnectedKindToString( eDataType, instanceValue );
        case CimPackage.SVC_CONTROL_MODE:
            return convertSVCControlModeToString( eDataType, instanceValue );
        case CimPackage.SEAL_KIND:
            return convertSealKindToString( eDataType, instanceValue );
        case CimPackage.BUSBAR_CONFIGURATION:
            return convertBusbarConfigurationToString( eDataType, instanceValue );
        case CimPackage.PHASE_CONNECTED_FAULT_KIND:
            return convertPhaseConnectedFaultKindToString( eDataType, instanceValue );
        case CimPackage.PHASE_SHUNT_CONNECTION_KIND:
            return convertPhaseShuntConnectionKindToString( eDataType, instanceValue );
        case CimPackage.WIND_LVRT_QCONTROL_MODES_KIND:
            return convertWindLVRTQcontrolModesKindToString( eDataType, instanceValue );
        case CimPackage.TURBINE_TYPE:
            return convertTurbineTypeToString( eDataType, instanceValue );
        case CimPackage.FRANCIS_GOVERNOR_CONTROL_KIND:
            return convertFrancisGovernorControlKindToString( eDataType, instanceValue );
        case CimPackage.SERVICE_KIND:
            return convertServiceKindToString( eDataType, instanceValue );
        case CimPackage.REGULATING_CONTROL_MODE_KIND:
            return convertRegulatingControlModeKindToString( eDataType, instanceValue );
        case CimPackage.VS_PPCC_CONTROL_KIND:
            return convertVsPpccControlKindToString( eDataType, instanceValue );
        case CimPackage.BREAKER_CONFIGURATION:
            return convertBreakerConfigurationToString( eDataType, instanceValue );
        case CimPackage.COM_DIRECTION_KIND:
            return convertComDirectionKindToString( eDataType, instanceValue );
        case CimPackage.WIRE_USAGE_KIND:
            return convertWireUsageKindToString( eDataType, instanceValue );
        case CimPackage.EXC_REXS_FEEDBACK_SIGNAL_KIND:
            return convertExcREXSFeedbackSignalKindToString( eDataType, instanceValue );
        case CimPackage.CHARGE_KIND:
            return convertChargeKindToString( eDataType, instanceValue );
        case CimPackage.GENERATOR_CONTROL_MODE:
            return convertGeneratorControlModeToString( eDataType, instanceValue );
        case CimPackage.WINDING_CONNECTION:
            return convertWindingConnectionToString( eDataType, instanceValue );
        case CimPackage.TROUBLE_REPORTING_KIND:
            return convertTroubleReportingKindToString( eDataType, instanceValue );
        case CimPackage.FUEL_TYPE:
            return convertFuelTypeToString( eDataType, instanceValue );
        case CimPackage.DC_CONVERTER_OPERATING_MODE_KIND:
            return convertDCConverterOperatingModeKindToString( eDataType, instanceValue );
        case CimPackage.TAG_ACTION_KIND:
            return convertTagActionKindToString( eDataType, instanceValue );
        case CimPackage.WIRE_MATERIAL_KIND:
            return convertWireMaterialKindToString( eDataType, instanceValue );
        case CimPackage.CHEQUE_KIND:
            return convertChequeKindToString( eDataType, instanceValue );
        case CimPackage.WORK_KIND:
            return convertWorkKindToString( eDataType, instanceValue );
        case CimPackage.STATIC_LOAD_MODEL_KIND:
            return convertStaticLoadModelKindToString( eDataType, instanceValue );
        case CimPackage.CABLE_CONSTRUCTION_KIND:
            return convertCableConstructionKindToString( eDataType, instanceValue );
        case CimPackage.REMOTE_SIGNAL_KIND:
            return convertRemoteSignalKindToString( eDataType, instanceValue );
        case CimPackage.WIND_QCONTROL_MODES_KIND:
            return convertWindQcontrolModesKindToString( eDataType, instanceValue );
        case CimPackage.VEHICLE_USAGE_KIND:
            return convertVehicleUsageKindToString( eDataType, instanceValue );
        case CimPackage.AMI_BILLING_READY_KIND:
            return convertAmiBillingReadyKindToString( eDataType, instanceValue );
        case CimPackage.COOLANT_TYPE:
            return convertCoolantTypeToString( eDataType, instanceValue );
        case CimPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
            return convertSynchronousMachineOperatingModeToString( eDataType, instanceValue );
        case CimPackage.EXC_ST6BOE_LSELECTOR_KIND:
            return convertExcST6BOELselectorKindToString( eDataType, instanceValue );
        case CimPackage.WORK_TIME_SCHEDULE_KIND:
            return convertWorkTimeScheduleKindToString( eDataType, instanceValue );
        case CimPackage.SWITCH_ACTION_KIND:
            return convertSwitchActionKindToString( eDataType, instanceValue );
        case CimPackage.SOURCE:
            return convertSourceToString( eDataType, instanceValue );
        case CimPackage.REVENUE_KIND:
            return convertRevenueKindToString( eDataType, instanceValue );
        case CimPackage.CS_OPERATING_MODE_KIND:
            return convertCsOperatingModeKindToString( eDataType, instanceValue );
        case CimPackage.GENERIC_NON_LINEAR_LOAD_MODEL_KIND:
            return convertGenericNonLinearLoadModelKindToString( eDataType, instanceValue );
        case CimPackage.WIND_LOOKUP_TABLE_FUNCTION_KIND:
            return convertWindLookupTableFunctionKindToString( eDataType, instanceValue );
        case CimPackage.TRANSMISSION_MODE_KIND:
            return convertTransmissionModeKindToString( eDataType, instanceValue );
        case CimPackage.CS_PPCC_CONTROL_KIND:
            return convertCsPpccControlKindToString( eDataType, instanceValue );
        case CimPackage.END_DEVICE_FUNCTION_KIND:
            return convertEndDeviceFunctionKindToString( eDataType, instanceValue );
        case CimPackage.CABLE_SHIELD_MATERIAL_KIND:
            return convertCableShieldMaterialKindToString( eDataType, instanceValue );
        case CimPackage.TRANSACTION_KIND:
            return convertTransactionKindToString( eDataType, instanceValue );
        case CimPackage.TRANSFORMER_CONTROL_MODE:
            return convertTransformerControlModeToString( eDataType, instanceValue );
        case CimPackage.ORIENTATION_KIND:
            return convertOrientationKindToString( eDataType, instanceValue );
        case CimPackage.DC_POLARITY_KIND:
            return convertDCPolarityKindToString( eDataType, instanceValue );
        case CimPackage.HYDRO_ENERGY_CONVERSION_KIND:
            return convertHydroEnergyConversionKindToString( eDataType, instanceValue );
        case CimPackage.LIMIT_TYPE_KIND:
            return convertLimitTypeKindToString( eDataType, instanceValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AcceptanceTest createAcceptanceTest() {
        AcceptanceTestImpl acceptanceTest = new AcceptanceTestImpl();
        return acceptanceTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RationalNumber createRationalNumber() {
        RationalNumberImpl rationalNumber = new RationalNumberImpl();
        return rationalNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlledAppliance createControlledAppliance() {
        ControlledApplianceImpl controlledAppliance = new ControlledApplianceImpl();
        return controlledAppliance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingInterharmonic createReadingInterharmonic() {
        ReadingInterharmonicImpl readingInterharmonic = new ReadingInterharmonicImpl();
        return readingInterharmonic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TownDetail createTownDetail() {
        TownDetailImpl townDetail = new TownDetailImpl();
        return townDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status createStatus() {
        StatusImpl status = new StatusImpl();
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LifecycleDate createLifecycleDate() {
        LifecycleDateImpl lifecycleDate = new LifecycleDateImpl();
        return lifecycleDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DecimalQuantity createDecimalQuantity() {
        DecimalQuantityImpl decimalQuantity = new DecimalQuantityImpl();
        return decimalQuantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceCapability createEndDeviceCapability() {
        EndDeviceCapabilityImpl endDeviceCapability = new EndDeviceCapabilityImpl();
        return endDeviceCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateInterval createDateInterval() {
        DateIntervalImpl dateInterval = new DateIntervalImpl();
        return dateInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetDetail createStreetDetail() {
        StreetDetailImpl streetDetail = new StreetDetailImpl();
        return streetDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval createDateTimeInterval() {
        DateTimeIntervalImpl dateTimeInterval = new DateTimeIntervalImpl();
        return dateTimeInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccountMovement createAccountMovement() {
        AccountMovementImpl accountMovement = new AccountMovementImpl();
        return accountMovement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccountingUnit createAccountingUnit() {
        AccountingUnitImpl accountingUnit = new AccountingUnitImpl();
        return accountingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServicePointOutageSummary createServicePointOutageSummary() {
        ServicePointOutageSummaryImpl servicePointOutageSummary = new ServicePointOutageSummaryImpl();
        return servicePointOutageSummary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringQuantity createStringQuantity() {
        StringQuantityImpl stringQuantity = new StringQuantityImpl();
        return stringQuantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MonthDayInterval createMonthDayInterval() {
        MonthDayIntervalImpl monthDayInterval = new MonthDayIntervalImpl();
        return monthDayInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Due createDue() {
        DueImpl due = new DueImpl();
        return due;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntegerQuantity createIntegerQuantity() {
        IntegerQuantityImpl integerQuantity = new IntegerQuantityImpl();
        return integerQuantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeInterval createTimeInterval() {
        TimeIntervalImpl timeInterval = new TimeIntervalImpl();
        return timeInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TelephoneNumber createTelephoneNumber() {
        TelephoneNumberImpl telephoneNumber = new TelephoneNumberImpl();
        return telephoneNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FaultImpedance createFaultImpedance() {
        FaultImpedanceImpl faultImpedance = new FaultImpedanceImpl();
        return faultImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FloatQuantity createFloatQuantity() {
        FloatQuantityImpl floatQuantity = new FloatQuantityImpl();
        return floatQuantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BankAccountDetail createBankAccountDetail() {
        BankAccountDetailImpl bankAccountDetail = new BankAccountDetailImpl();
        return bankAccountDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Priority createPriority() {
        PriorityImpl priority = new PriorityImpl();
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LineDetail createLineDetail() {
        LineDetailImpl lineDetail = new LineDetailImpl();
        return lineDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteConnectDisconnectInfo createRemoteConnectDisconnectInfo() {
        RemoteConnectDisconnectInfoImpl remoteConnectDisconnectInfo = new RemoteConnectDisconnectInfoImpl();
        return remoteConnectDisconnectInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElectronicAddress createElectronicAddress() {
        ElectronicAddressImpl electronicAddress = new ElectronicAddressImpl();
        return electronicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PostalAddress createPostalAddress() {
        PostalAddressImpl postalAddress = new PostalAddressImpl();
        return postalAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetAddress createStreetAddress() {
        StreetAddressImpl streetAddress = new StreetAddressImpl();
        return streetAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceTiming createEndDeviceTiming() {
        EndDeviceTimingImpl endDeviceTiming = new EndDeviceTimingImpl();
        return endDeviceTiming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssSK createPssSK() {
        PssSKImpl pssSK = new PssSKImpl();
        return pssSK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DrumBoiler createDrumBoiler() {
        DrumBoilerImpl drumBoiler = new DrumBoilerImpl();
        return drumBoiler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro2 createGovHydro2() {
        GovHydro2Impl govHydro2 = new GovHydro2Impl();
        return govHydro2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscreteValue createDiscreteValue() {
        DiscreteValueImpl discreteValue = new DiscreteValueImpl();
        return discreteValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC3A createExcDC3A() {
        ExcDC3AImpl excDC3A = new ExcDC3AImpl();
        return excDC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneratingUnit createGeneratingUnit() {
        GeneratingUnitImpl generatingUnit = new GeneratingUnitImpl();
        return generatingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChanger createPhaseTapChanger() {
        PhaseTapChangerImpl phaseTapChanger = new PhaseTapChangerImpl();
        return phaseTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PerLengthSequenceImpedance createPerLengthSequenceImpedance() {
        PerLengthSequenceImpedanceImpl perLengthSequenceImpedance = new PerLengthSequenceImpedanceImpl();
        return perLengthSequenceImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroGeneratingEfficiencyCurve createHydroGeneratingEfficiencyCurve() {
        HydroGeneratingEfficiencyCurveImpl hydroGeneratingEfficiencyCurve = new HydroGeneratingEfficiencyCurveImpl();
        return hydroGeneratingEfficiencyCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConductingEquipment createConductingEquipment() {
        ConductingEquipmentImpl conductingEquipment = new ConductingEquipmentImpl();
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonConformLoadGroup createNonConformLoadGroup() {
        NonConformLoadGroupImpl nonConformLoadGroup = new NonConformLoadGroupImpl();
        return nonConformLoadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapSchedule createTapSchedule() {
        TapScheduleImpl tapSchedule = new TapScheduleImpl();
        return tapSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FrequencyConverter createFrequencyConverter() {
        FrequencyConverterImpl frequencyConverter = new FrequencyConverterImpl();
        return frequencyConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteSource createRemoteSource() {
        RemoteSourceImpl remoteSource = new RemoteSourceImpl();
        return remoteSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineGovernorUserDefined createTurbineGovernorUserDefined() {
        TurbineGovernorUserDefinedImpl turbineGovernorUserDefined = new TurbineGovernorUserDefinedImpl();
        return turbineGovernorUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CoordinateSystem createCoordinateSystem() {
        CoordinateSystemImpl coordinateSystem = new CoordinateSystemImpl();
        return coordinateSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingType createReadingType() {
        ReadingTypeImpl readingType = new ReadingTypeImpl();
        return readingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceGroup createEndDeviceGroup() {
        EndDeviceGroupImpl endDeviceGroup = new EndDeviceGroupImpl();
        return endDeviceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DynamicsFunctionBlock createDynamicsFunctionBlock() {
        DynamicsFunctionBlockImpl dynamicsFunctionBlock = new DynamicsFunctionBlockImpl();
        return dynamicsFunctionBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST4 createGovGAST4() {
        GovGAST4Impl govGAST4 = new GovGAST4Impl();
        return govGAST4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SurgeArrester createSurgeArrester() {
        SurgeArresterImpl surgeArrester = new SurgeArresterImpl();
        return surgeArrester;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLimX1 createOverexcLimX1() {
        OverexcLimX1Impl overexcLimX1 = new OverexcLimX1Impl();
        return overexcLimX1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurveData createCurveData() {
        CurveDataImpl curveData = new CurveDataImpl();
        return curveData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST6B createExcIEEEST6B() {
        ExcIEEEST6BImpl excIEEEST6B = new ExcIEEEST6BImpl();
        return excIEEEST6B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RotatingMachineDynamics createRotatingMachineDynamics() {
        RotatingMachineDynamicsImpl rotatingMachineDynamics = new RotatingMachineDynamicsImpl();
        return rotatingMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamSGO createGovSteamSGO() {
        GovSteamSGOImpl govSteamSGO = new GovSteamSGOImpl();
        return govSteamSGO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Outage createOutage() {
        OutageImpl outage = new OutageImpl();
        return outage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadUserDefined createLoadUserDefined() {
        LoadUserDefinedImpl loadUserDefined = new LoadUserDefinedImpl();
        return loadUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AirCompressor createAirCompressor() {
        AirCompressorImpl airCompressor = new AirCompressorImpl();
        return airCompressor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmissionCurve createEmissionCurve() {
        EmissionCurveImpl emissionCurve = new EmissionCurveImpl();
        return emissionCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingStep createSwitchingStep() {
        SwitchingStepImpl switchingStep = new SwitchingStepImpl();
        return switchingStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PerLengthDCLineParameter createPerLengthDCLineParameter() {
        PerLengthDCLineParameterImpl perLengthDCLineParameter = new PerLengthDCLineParameterImpl();
        return perLengthDCLineParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalIsland createTopologicalIsland() {
        TopologicalIslandImpl topologicalIsland = new TopologicalIslandImpl();
        return topologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurrentLimit createCurrentLimit() {
        CurrentLimitImpl currentLimit = new CurrentLimitImpl();
        return currentLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePoint createUsagePoint() {
        UsagePointImpl usagePoint = new UsagePointImpl();
        return usagePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommunicationLink createCommunicationLink() {
        CommunicationLinkImpl communicationLink = new CommunicationLinkImpl();
        return communicationLink;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovCT1 createGovCT1() {
        GovCT1Impl govCT1 = new GovCT1Impl();
        return govCT1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePointGroup createUsagePointGroup() {
        UsagePointGroupImpl usagePointGroup = new UsagePointGroupImpl();
        return usagePointGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeographicalRegion createGeographicalRegion() {
        GeographicalRegionImpl geographicalRegion = new GeographicalRegionImpl();
        return geographicalRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseImpedanceData createPhaseImpedanceData() {
        PhaseImpedanceDataImpl phaseImpedanceData = new PhaseImpedanceDataImpl();
        return phaseImpedanceData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorValue createAccumulatorValue() {
        AccumulatorValueImpl accumulatorValue = new AccumulatorValueImpl();
        return accumulatorValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC3A createExcAC3A() {
        ExcAC3AImpl excAC3A = new ExcAC3AImpl();
        return excAC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLim2Simplified createUnderexcLim2Simplified() {
        UnderexcLim2SimplifiedImpl underexcLim2Simplified = new UnderexcLim2SimplifiedImpl();
        return underexcLim2Simplified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcedureDataSet createProcedureDataSet() {
        ProcedureDataSetImpl procedureDataSet = new ProcedureDataSetImpl();
        return procedureDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcANS createExcANS() {
        ExcANSImpl excANS = new ExcANSImpl();
        return excANS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BranchGroup createBranchGroup() {
        BranchGroupImpl branchGroup = new BranchGroupImpl();
        return branchGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro3 createGovHydro3() {
        GovHydro3Impl govHydro3 = new GovHydro3Impl();
        return govHydro3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Ownership createOwnership() {
        OwnershipImpl ownership = new OwnershipImpl();
        return ownership;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogLimit createAnalogLimit() {
        AnalogLimitImpl analogLimit = new AnalogLimitImpl();
        return analogLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShortCircuitTest createShortCircuitTest() {
        ShortCircuitTestImpl shortCircuitTest = new ShortCircuitTestImpl();
        return shortCircuitTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCChopper createDCChopper() {
        DCChopperImpl dcChopper = new DCChopperImpl();
        return dcChopper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ActivityRecord createActivityRecord() {
        ActivityRecordImpl activityRecord = new ActivityRecordImpl();
        return activityRecord;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChangerTablePoint createRatioTapChangerTablePoint() {
        RatioTapChangerTablePointImpl ratioTapChangerTablePoint = new RatioTapChangerTablePointImpl();
        return ratioTapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerStarImpedance createTransformerStarImpedance() {
        TransformerStarImpedanceImpl transformerStarImpedance = new TransformerStarImpedanceImpl();
        return transformerStarImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSupplier createServiceSupplier() {
        ServiceSupplierImpl serviceSupplier = new ServiceSupplierImpl();
        return serviceSupplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogValue createAnalogValue() {
        AnalogValueImpl analogValue = new AnalogValueImpl();
        return analogValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalRestriction createOperationalRestriction() {
        OperationalRestrictionImpl operationalRestriction = new OperationalRestrictionImpl();
        return operationalRestriction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcPIC createExcPIC() {
        ExcPICImpl excPIC = new ExcPICImpl();
        return excPIC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST1A createExcIEEEST1A() {
        ExcIEEEST1AImpl excIEEEST1A = new ExcIEEEST1AImpl();
        return excIEEEST1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Hazard createHazard() {
        HazardImpl hazard = new HazardImpl();
        return hazard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Supercritical createSupercritical() {
        SupercriticalImpl supercritical = new SupercriticalImpl();
        return supercritical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LinearShuntCompensator createLinearShuntCompensator() {
        LinearShuntCompensatorImpl linearShuntCompensator = new LinearShuntCompensatorImpl();
        return linearShuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Card createCard() {
        CardImpl card = new CardImpl();
        return card;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BusbarSectionInfo createBusbarSectionInfo() {
        BusbarSectionInfoImpl busbarSectionInfo = new BusbarSectionInfoImpl();
        return busbarSectionInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscExcContIEEEDEC2A createDiscExcContIEEEDEC2A() {
        DiscExcContIEEEDEC2AImpl discExcContIEEEDEC2A = new DiscExcContIEEEDEC2AImpl();
        return discExcContIEEEDEC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal createTerminal() {
        TerminalImpl terminal = new TerminalImpl();
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGeneratingUnit createWindGeneratingUnit() {
        WindGeneratingUnitImpl windGeneratingUnit = new WindGeneratingUnitImpl();
        return windGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueQuality createMeasurementValueQuality() {
        MeasurementValueQualityImpl measurementValueQuality = new MeasurementValueQualityImpl();
        return measurementValueQuality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Conductor createConductor() {
        ConductorImpl conductor = new ConductorImpl();
        return conductor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShuntCompensatorInfo createShuntCompensatorInfo() {
        ShuntCompensatorInfoImpl shuntCompensatorInfo = new ShuntCompensatorInfoImpl();
        return shuntCompensatorInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvShuntCompensatorSections createSvShuntCompensatorSections() {
        SvShuntCompensatorSectionsImpl svShuntCompensatorSections = new SvShuntCompensatorSectionsImpl();
        return svShuntCompensatorSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DemandResponseProgram createDemandResponseProgram() {
        DemandResponseProgramImpl demandResponseProgram = new DemandResponseProgramImpl();
        return demandResponseProgram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemUserDefined createExcitationSystemUserDefined() {
        ExcitationSystemUserDefinedImpl excitationSystemUserDefined = new ExcitationSystemUserDefinedImpl();
        return excitationSystemUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscreteCommand createDiscreteCommand() {
        DiscreteCommandImpl discreteCommand = new DiscreteCommandImpl();
        return discreteCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST4B createExcIEEEST4B() {
        ExcIEEEST4BImpl excIEEEST4B = new ExcIEEEST4BImpl();
        return excIEEEST4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorReset createAccumulatorReset() {
        AccumulatorResetImpl accumulatorReset = new AccumulatorResetImpl();
        return accumulatorReset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType2IEEEVArController createPFVArType2IEEEVArController() {
        PFVArType2IEEEVArControllerImpl pfvArType2IEEEVArController = new PFVArType2IEEEVArControllerImpl();
        return pfvArType2IEEEVArController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Shift createShift() {
        ShiftImpl shift = new ShiftImpl();
        return shift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType3IEC createWindContPType3IEC() {
        WindContPType3IECImpl windContPType3IEC = new WindContPType3IECImpl();
        return windContPType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location createLocation() {
        LocationImpl location = new LocationImpl();
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FuelAllocationSchedule createFuelAllocationSchedule() {
        FuelAllocationScheduleImpl fuelAllocationSchedule = new FuelAllocationScheduleImpl();
        return fuelAllocationSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEndInfo createTransformerEndInfo() {
        TransformerEndInfoImpl transformerEndInfo = new TransformerEndInfoImpl();
        return transformerEndInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RecloseSequence createRecloseSequence() {
        RecloseSequenceImpl recloseSequence = new RecloseSequenceImpl();
        return recloseSequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadDynamics createLoadDynamics() {
        LoadDynamicsImpl loadDynamics = new LoadDynamicsImpl();
        return loadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProprietaryParameterDynamics createProprietaryParameterDynamics() {
        ProprietaryParameterDynamicsImpl proprietaryParameterDynamics = new ProprietaryParameterDynamicsImpl();
        return proprietaryParameterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceLocation createServiceLocation() {
        ServiceLocationImpl serviceLocation = new ServiceLocationImpl();
        return serviceLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageAdjusterDynamics createVoltageAdjusterDynamics() {
        VoltageAdjusterDynamicsImpl voltageAdjusterDynamics = new VoltageAdjusterDynamicsImpl();
        return voltageAdjusterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PanDemandResponse createPanDemandResponse() {
        PanDemandResponseImpl panDemandResponse = new PanDemandResponseImpl();
        return panDemandResponse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineUserDefined createAsynchronousMachineUserDefined() {
        AsynchronousMachineUserDefinedImpl asynchronousMachineUserDefined = new AsynchronousMachineUserDefinedImpl();
        return asynchronousMachineUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlAreaGeneratingUnit createControlAreaGeneratingUnit() {
        ControlAreaGeneratingUnitImpl controlAreaGeneratingUnit = new ControlAreaGeneratingUnitImpl();
        return controlAreaGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reading createReading() {
        ReadingImpl reading = new ReadingImpl();
        return reading;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentShunt createEquivalentShunt() {
        EquivalentShuntImpl equivalentShunt = new EquivalentShuntImpl();
        return equivalentShunt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantIEC createWindPlantIEC() {
        WindPlantIECImpl windPlantIEC = new WindPlantIECImpl();
        return windPlantIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChanger createTapChanger() {
        TapChangerImpl tapChanger = new TapChangerImpl();
        return tapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tool createTool() {
        ToolImpl tool = new ToolImpl();
        return tool;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetModel createAssetModel() {
        AssetModelImpl assetModel = new AssetModelImpl();
        return assetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechanicalLoadDynamics createMechanicalLoadDynamics() {
        MechanicalLoadDynamicsImpl mechanicalLoadDynamics = new MechanicalLoadDynamicsImpl();
        return mechanicalLoadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Customer createCustomer() {
        CustomerImpl customer = new CustomerImpl();
        return customer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BWRSteamSupply createBWRSteamSupply() {
        BWRSteamSupplyImpl bwrSteamSupply = new BWRSteamSupplyImpl();
        return bwrSteamSupply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCEquipmentContainer createDCEquipmentContainer() {
        DCEquipmentContainerImpl dcEquipmentContainer = new DCEquipmentContainerImpl();
        return dcEquipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CableInfo createCableInfo() {
        CableInfoImpl cableInfo = new CableInfoImpl();
        return cableInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProductAssetModel createProductAssetModel() {
        ProductAssetModelImpl productAssetModel = new ProductAssetModelImpl();
        return productAssetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChangerTablePoint createTapChangerTablePoint() {
        TapChangerTablePointImpl tapChangerTablePoint = new TapChangerTablePointImpl();
        return tapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadStatic createLoadStatic() {
        LoadStaticImpl loadStatic = new LoadStaticImpl();
        return loadStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetContainer createAssetContainer() {
        AssetContainerImpl assetContainer = new AssetContainerImpl();
        return assetContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Cheque createCheque() {
        ChequeImpl cheque = new ChequeImpl();
        return cheque;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverheadWireInfo createOverheadWireInfo() {
        OverheadWireInfoImpl overheadWireInfo = new OverheadWireInfoImpl();
        return overheadWireInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TariffProfile createTariffProfile() {
        TariffProfileImpl tariffProfile = new TariffProfileImpl();
        return tariffProfile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemDynamics createExcitationSystemDynamics() {
        ExcitationSystemDynamicsImpl excitationSystemDynamics = new ExcitationSystemDynamicsImpl();
        return excitationSystemDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss5 createPss5() {
        Pss5Impl pss5 = new Pss5Impl();
        return pss5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulatingControl createRegulatingControl() {
        RegulatingControlImpl regulatingControl = new RegulatingControlImpl();
        return regulatingControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonConformLoad createNonConformLoad() {
        NonConformLoadImpl nonConformLoad = new NonConformLoadImpl();
        return nonConformLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteam1 createGovSteam1() {
        GovSteam1Impl govSteam1 = new GovSteam1Impl();
        return govSteam1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatingParticipant createOperatingParticipant() {
        OperatingParticipantImpl operatingParticipant = new OperatingParticipantImpl();
        return operatingParticipant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringMeasurementValue createStringMeasurementValue() {
        StringMeasurementValueImpl stringMeasurementValue = new StringMeasurementValueImpl();
        return stringMeasurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvInjection createSvInjection() {
        SvInjectionImpl svInjection = new SvInjectionImpl();
        return svInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Junction createJunction() {
        JunctionImpl junction = new JunctionImpl();
        return junction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC3A createExcIEEEAC3A() {
        ExcIEEEAC3AImpl excIEEEAC3A = new ExcIEEEAC3AImpl();
        return excIEEEAC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC1A createExcIEEEDC1A() {
        ExcIEEEDC1AImpl excIEEEDC1A = new ExcIEEEDC1AImpl();
        return excIEEEDC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadGroup createLoadGroup() {
        LoadGroupImpl loadGroup = new LoadGroupImpl();
        return loadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingStepGroup createSwitchingStepGroup() {
        SwitchingStepGroupImpl switchingStepGroup = new SwitchingStepGroupImpl();
        return switchingStepGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkTimeSchedule createWorkTimeSchedule() {
        WorkTimeScheduleImpl workTimeSchedule = new WorkTimeScheduleImpl();
        return workTimeSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemStabilizerDynamics createPowerSystemStabilizerDynamics() {
        PowerSystemStabilizerDynamicsImpl powerSystemStabilizerDynamics = new PowerSystemStabilizerDynamicsImpl();
        return powerSystemStabilizerDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AuxiliaryAccount createAuxiliaryAccount() {
        AuxiliaryAccountImpl auxiliaryAccount = new AuxiliaryAccountImpl();
        return auxiliaryAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscontinuousExcitationControlDynamics createDiscontinuousExcitationControlDynamics() {
        DiscontinuousExcitationControlDynamicsImpl discontinuousExcitationControlDynamics = new DiscontinuousExcitationControlDynamicsImpl();
        return discontinuousExcitationControlDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType2IEC createWindGenTurbineType2IEC() {
        WindGenTurbineType2IECImpl windGenTurbineType2IEC = new WindGenTurbineType2IECImpl();
        return windGenTurbineType2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectDisconnectFunction createConnectDisconnectFunction() {
        ConnectDisconnectFunctionImpl connectDisconnectFunction = new ConnectDisconnectFunctionImpl();
        return connectDisconnectFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogControl createAnalogControl() {
        AnalogControlImpl analogControl = new AnalogControlImpl();
        return analogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MetrologyRequirement createMetrologyRequirement() {
        MetrologyRequirementImpl metrologyRequirement = new MetrologyRequirementImpl();
        return metrologyRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurrentRelay createCurrentRelay() {
        CurrentRelayImpl currentRelay = new CurrentRelayImpl();
        return currentRelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ContingencyElement createContingencyElement() {
        ContingencyElementImpl contingencyElement = new ContingencyElementImpl();
        return contingencyElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteInputSignal createRemoteInputSignal() {
        RemoteInputSignalImpl remoteInputSignal = new RemoteInputSignalImpl();
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPowerPlant createHydroPowerPlant() {
        HydroPowerPlantImpl hydroPowerPlant = new HydroPowerPlantImpl();
        return hydroPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroWPID createGovHydroWPID() {
        GovHydroWPIDImpl govHydroWPID = new GovHydroWPIDImpl();
        return govHydroWPID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SeasonDayTypeSchedule createSeasonDayTypeSchedule() {
        SeasonDayTypeScheduleImpl seasonDayTypeSchedule = new SeasonDayTypeScheduleImpl();
        return seasonDayTypeSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IrregularIntervalSchedule createIrregularIntervalSchedule() {
        IrregularIntervalScheduleImpl irregularIntervalSchedule = new IrregularIntervalScheduleImpl();
        return irregularIntervalSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPitchContEmulIEC createWindPitchContEmulIEC() {
        WindPitchContEmulIECImpl windPitchContEmulIEC = new WindPitchContEmulIECImpl();
        return windPitchContEmulIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType1or2IEC createWindTurbineType1or2IEC() {
        WindTurbineType1or2IECImpl windTurbineType1or2IEC = new WindTurbineType1or2IECImpl();
        return windTurbineType1or2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Transactor createTransactor() {
        TransactorImpl transactor = new TransactorImpl();
        return transactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationTag createOperationTag() {
        OperationTagImpl operationTag = new OperationTagImpl();
        return operationTag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeTariffInterval createTimeTariffInterval() {
        TimeTariffIntervalImpl timeTariffInterval = new TimeTariffIntervalImpl();
        return timeTariffInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WaveTrap createWaveTrap() {
        WaveTrapImpl waveTrap = new WaveTrapImpl();
        return waveTrap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VCompIEEEType2 createVCompIEEEType2() {
        VCompIEEEType2Impl vCompIEEEType2 = new VCompIEEEType2Impl();
        return vCompIEEEType2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TagAction createTagAction() {
        TagActionImpl tagAction = new TagActionImpl();
        return tagAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceInfo createEndDeviceInfo() {
        EndDeviceInfoImpl endDeviceInfo = new EndDeviceInfoImpl();
        return endDeviceInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Sensor createSensor() {
        SensorImpl sensor = new SensorImpl();
        return sensor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCSwitch createDCSwitch() {
        DCSwitchImpl dcSwitch = new DCSwitchImpl();
        return dcSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetInfo createAssetInfo() {
        AssetInfoImpl assetInfo = new AssetInfoImpl();
        return assetInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquipmentFault createEquipmentFault() {
        EquipmentFaultImpl equipmentFault = new EquipmentFaultImpl();
        return equipmentFault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SetPoint createSetPoint() {
        SetPointImpl setPoint = new SetPointImpl();
        return setPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoadSchedule createConformLoadSchedule() {
        ConformLoadScheduleImpl conformLoadSchedule = new ConformLoadScheduleImpl();
        return conformLoadSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExternalNetworkInjection createExternalNetworkInjection() {
        ExternalNetworkInjectionImpl externalNetworkInjection = new ExternalNetworkInjectionImpl();
        return externalNetworkInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrewMember createCrewMember() {
        CrewMemberImpl crewMember = new CrewMemberImpl();
        return crewMember;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergyConsumer createEnergyConsumer() {
        EnergyConsumerImpl energyConsumer = new EnergyConsumerImpl();
        return energyConsumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroTurbine createHydroTurbine() {
        HydroTurbineImpl hydroTurbine = new HydroTurbineImpl();
        return hydroTurbine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineTimeConstantReactance createSynchronousMachineTimeConstantReactance() {
        SynchronousMachineTimeConstantReactanceImpl synchronousMachineTimeConstantReactance = new SynchronousMachineTimeConstantReactanceImpl();
        return synchronousMachineTimeConstantReactance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationPersonRole createOperationPersonRole() {
        OperationPersonRoleImpl operationPersonRole = new OperationPersonRoleImpl();
        return operationPersonRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceEventDetail createEndDeviceEventDetail() {
        EndDeviceEventDetailImpl endDeviceEventDetail = new EndDeviceEventDetailImpl();
        return endDeviceEventDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvVoltage createSvVoltage() {
        SvVoltageImpl svVoltage = new SvVoltageImpl();
        return svVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Measurement createMeasurement() {
        MeasurementImpl measurement = new MeasurementImpl();
        return measurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC4A createExcAC4A() {
        ExcAC4AImpl excAC4A = new ExcAC4AImpl();
        return excAC4A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType2Common1 createPFVArType2Common1() {
        PFVArType2Common1Impl pfvArType2Common1 = new PFVArType2Common1Impl();
        return pfvArType2Common1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerAccount createCustomerAccount() {
        CustomerAccountImpl customerAccount = new CustomerAccountImpl();
        return customerAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReactiveCapabilityCurve createReactiveCapabilityCurve() {
        ReactiveCapabilityCurveImpl reactiveCapabilityCurve = new ReactiveCapabilityCurveImpl();
        return reactiveCapabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InflowForecast createInflowForecast() {
        InflowForecastImpl inflowForecast = new InflowForecastImpl();
        return inflowForecast;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST2 createGovGAST2() {
        GovGAST2Impl govGAST2 = new GovGAST2Impl();
        return govGAST2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerAsymmetrical createPhaseTapChangerAsymmetrical() {
        PhaseTapChangerAsymmetricalImpl phaseTapChangerAsymmetrical = new PhaseTapChangerAsymmetricalImpl();
        return phaseTapChangerAsymmetrical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssSH createPssSH() {
        PssSHImpl pssSH = new PssSHImpl();
        return pssSH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcOEX3T createExcOEX3T() {
        ExcOEX3TImpl excOEX3T = new ExcOEX3TImpl();
        return excOEX3T;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST2A createExcIEEEST2A() {
        ExcIEEEST2AImpl excIEEEST2A = new ExcIEEEST2AImpl();
        return excIEEEST2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC6A createExcIEEEAC6A() {
        ExcIEEEAC6AImpl excIEEEAC6A = new ExcIEEEAC6AImpl();
        return excIEEEAC6A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamFV2 createGovSteamFV2() {
        GovSteamFV2Impl govSteamFV2 = new GovSteamFV2Impl();
        return govSteamFV2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceEventType createEndDeviceEventType() {
        EndDeviceEventTypeImpl endDeviceEventType = new EndDeviceEventTypeImpl();
        return endDeviceEventType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringMeasurement createStringMeasurement() {
        StringMeasurementImpl stringMeasurement = new StringMeasurementImpl();
        return stringMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CashierShift createCashierShift() {
        CashierShiftImpl cashierShift = new CashierShiftImpl();
        return cashierShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Ground createGround() {
        GroundImpl ground = new GroundImpl();
        return ground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPump createHydroPump() {
        HydroPumpImpl hydroPump = new HydroPumpImpl();
        return hydroPump;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadAggregate createLoadAggregate() {
        LoadAggregateImpl loadAggregate = new LoadAggregateImpl();
        return loadAggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssELIN2 createPssELIN2() {
        PssELIN2Impl pssELIN2 = new PssELIN2Impl();
        return pssELIN2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTopologicalNode createDCTopologicalNode() {
        DCTopologicalNodeImpl dcTopologicalNode = new DCTopologicalNodeImpl();
        return dcTopologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PanPricing createPanPricing() {
        PanPricingImpl panPricing = new PanPricingImpl();
        return panPricing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroPelton createGovHydroPelton() {
        GovHydroPeltonImpl govHydroPelton = new GovHydroPeltonImpl();
        return govHydroPelton;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClearanceDocument createClearanceDocument() {
        ClearanceDocumentImpl clearanceDocument = new ClearanceDocumentImpl();
        return clearanceDocument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrimeMover createPrimeMover() {
        PrimeMoverImpl primeMover = new PrimeMoverImpl();
        return primeMover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContRotorRIEC createWindContRotorRIEC() {
        WindContRotorRIECImpl windContRotorRIEC = new WindContRotorRIECImpl();
        return windContRotorRIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss2B createPss2B() {
        Pss2BImpl pss2B = new Pss2BImpl();
        return pss2B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetUser createAssetUser() {
        AssetUserImpl assetUser = new AssetUserImpl();
        return assetUser;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProtectedSwitch createProtectedSwitch() {
        ProtectedSwitchImpl protectedSwitch = new ProtectedSwitchImpl();
        return protectedSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ActivePowerLimit createActivePowerLimit() {
        ActivePowerLimitImpl activePowerLimit = new ActivePowerLimitImpl();
        return activePowerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChangerTable createRatioTapChangerTable() {
        RatioTapChangerTableImpl ratioTapChangerTable = new RatioTapChangerTableImpl();
        return ratioTapChangerTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NoLoadTest createNoLoadTest() {
        NoLoadTestImpl noLoadTest = new NoLoadTestImpl();
        return noLoadTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingQualityType createReadingQualityType() {
        ReadingQualityTypeImpl readingQualityType = new ReadingQualityTypeImpl();
        return readingQualityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComFunction createComFunction() {
        ComFunctionImpl comFunction = new ComFunctionImpl();
        return comFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineDynamics createAsynchronousMachineDynamics() {
        AsynchronousMachineDynamicsImpl asynchronousMachineDynamics = new AsynchronousMachineDynamicsImpl();
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachine createSynchronousMachine() {
        SynchronousMachineImpl synchronousMachine = new SynchronousMachineImpl();
        return synchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE2B createPssIEEE2B() {
        PssIEEE2BImpl pssIEEE2B = new PssIEEE2BImpl();
        return pssIEEE2B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4aIEC createWindTurbineType4aIEC() {
        WindTurbineType4aIECImpl windTurbineType4aIEC = new WindTurbineType4aIECImpl();
        return windTurbineType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4bIEC createWindTurbineType4bIEC() {
        WindTurbineType4bIECImpl windTurbineType4bIEC = new WindTurbineType4bIECImpl();
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerNotification createCustomerNotification() {
        CustomerNotificationImpl customerNotification = new CustomerNotificationImpl();
        return customerNotification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenUnitOpCostCurve createGenUnitOpCostCurve() {
        GenUnitOpCostCurveImpl genUnitOpCostCurve = new GenUnitOpCostCurveImpl();
        return genUnitOpCostCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimIEEE1 createUnderexcLimIEEE1() {
        UnderexcLimIEEE1Impl underexcLimIEEE1 = new UnderexcLimIEEE1Impl();
        return underexcLimIEEE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasePower createBasePower() {
        BasePowerImpl basePower = new BasePowerImpl();
        return basePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PetersenCoil createPetersenCoil() {
        PetersenCoilImpl petersenCoil = new PetersenCoilImpl();
        return petersenCoil;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FaultCauseType createFaultCauseType() {
        FaultCauseTypeImpl faultCauseType = new FaultCauseTypeImpl();
        return faultCauseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceEvent createEndDeviceEvent() {
        EndDeviceEventImpl endDeviceEvent = new EndDeviceEventImpl();
        return endDeviceEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PricingStructure createPricingStructure() {
        PricingStructureImpl pricingStructure = new PricingStructureImpl();
        return pricingStructure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkTask createWorkTask() {
        WorkTaskImpl workTask = new WorkTaskImpl();
        return workTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss2ST createPss2ST() {
        Pss2STImpl pss2ST = new Pss2STImpl();
        return pss2ST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteControl createRemoteControl() {
        RemoteControlImpl remoteControl = new RemoteControlImpl();
        return remoteControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PanDisplay createPanDisplay() {
        PanDisplayImpl panDisplay = new PanDisplayImpl();
        return panDisplay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC2A createExcDC2A() {
        ExcDC2AImpl excDC2A = new ExcDC2AImpl();
        return excDC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscExcContIEEEDEC1A createDiscExcContIEEEDEC1A() {
        DiscExcContIEEEDEC1AImpl discExcContIEEEDEC1A = new DiscExcContIEEEDEC1AImpl();
        return discExcContIEEEDEC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Maintainer createMaintainer() {
        MaintainerImpl maintainer = new MaintainerImpl();
        return maintainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceMultiplier createServiceMultiplier() {
        ServiceMultiplierImpl serviceMultiplier = new ServiceMultiplierImpl();
        return serviceMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Operator createOperator() {
        OperatorImpl operator = new OperatorImpl();
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IrregularTimePoint createIrregularTimePoint() {
        IrregularTimePointImpl irregularTimePoint = new IrregularTimePointImpl();
        return irregularTimePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerNonLinear createPhaseTapChangerNonLinear() {
        PhaseTapChangerNonLinearImpl phaseTapChangerNonLinear = new PhaseTapChangerNonLinearImpl();
        return phaseTapChangerNonLinear;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCategory createServiceCategory() {
        ServiceCategoryImpl serviceCategory = new ServiceCategoryImpl();
        return serviceCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PSREvent createPSREvent() {
        PSREventImpl psrEvent = new PSREventImpl();
        return psrEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BranchGroupTerminal createBranchGroupTerminal() {
        BranchGroupTerminalImpl branchGroupTerminal = new BranchGroupTerminalImpl();
        return branchGroupTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundAction createGroundAction() {
        GroundActionImpl groundAction = new GroundActionImpl();
        return groundAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadMotor createLoadMotor() {
        LoadMotorImpl loadMotor = new LoadMotorImpl();
        return loadMotor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AuxiliaryAgreement createAuxiliaryAgreement() {
        AuxiliaryAgreementImpl auxiliaryAgreement = new AuxiliaryAgreementImpl();
        return auxiliaryAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerTankEnd createTransformerTankEnd() {
        TransformerTankEndImpl transformerTankEnd = new TransformerTankEndImpl();
        return transformerTankEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType2UserDefined createPFVArControllerType2UserDefined() {
        PFVArControllerType2UserDefinedImpl pfvArControllerType2UserDefined = new PFVArControllerType2UserDefinedImpl();
        return pfvArControllerType2UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcCZ createExcCZ() {
        ExcCZImpl excCZ = new ExcCZImpl();
        return excCZ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CsConverter createCsConverter() {
        CsConverterImpl csConverter = new CsConverterImpl();
        return csConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType1Dynamics createPFVArControllerType1Dynamics() {
        PFVArControllerType1DynamicsImpl pfvArControllerType1Dynamics = new PFVArControllerType1DynamicsImpl();
        return pfvArControllerType1Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsCapabilityCurve createVsCapabilityCurve() {
        VsCapabilityCurveImpl vsCapabilityCurve = new VsCapabilityCurveImpl();
        return vsCapabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST1 createGovGAST1() {
        GovGAST1Impl govGAST1 = new GovGAST1Impl();
        return govGAST1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticVarCompensator createStaticVarCompensator() {
        StaticVarCompensatorImpl staticVarCompensator = new StaticVarCompensatorImpl();
        return staticVarCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerTankInfo createTransformerTankInfo() {
        TransformerTankInfoImpl transformerTankInfo = new TransformerTankInfoImpl();
        return transformerTankInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeterReading createMeterReading() {
        MeterReadingImpl meterReading = new MeterReadingImpl();
        return meterReading;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TailbayLossCurve createTailbayLossCurve() {
        TailbayLossCurveImpl tailbayLossCurve = new TailbayLossCurveImpl();
        return tailbayLossCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VisibilityLayer createVisibilityLayer() {
        VisibilityLayerImpl visibilityLayer = new VisibilityLayerImpl();
        return visibilityLayer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkLocation createWorkLocation() {
        WorkLocationImpl workLocation = new WorkLocationImpl();
        return workLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PanPricingDetail createPanPricingDetail() {
        PanPricingDetailImpl panPricingDetail = new PanPricingDetailImpl();
        return panPricingDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Meter createMeter() {
        MeterImpl meter = new MeterImpl();
        return meter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcentricNeutralCableInfo createConcentricNeutralCableInfo() {
        ConcentricNeutralCableInfoImpl concentricNeutralCableInfo = new ConcentricNeutralCableInfoImpl();
        return concentricNeutralCableInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleEndDeviceFunction createSimpleEndDeviceFunction() {
        SimpleEndDeviceFunctionImpl simpleEndDeviceFunction = new SimpleEndDeviceFunctionImpl();
        return simpleEndDeviceFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimitSet createOperationalLimitSet() {
        OperationalLimitSetImpl operationalLimitSet = new OperationalLimitSetImpl();
        return operationalLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonlinearShuntCompensatorPoint createNonlinearShuntCompensatorPoint() {
        NonlinearShuntCompensatorPointImpl nonlinearShuntCompensatorPoint = new NonlinearShuntCompensatorPointImpl();
        return nonlinearShuntCompensatorPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC2A createExcAC2A() {
        ExcAC2AImpl excAC2A = new ExcAC2AImpl();
        return excAC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueAliasSet createValueAliasSet() {
        ValueAliasSetImpl valueAliasSet = new ValueAliasSetImpl();
        return valueAliasSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectGluePoint createDiagramObjectGluePoint() {
        DiagramObjectGluePointImpl diagramObjectGluePoint = new DiagramObjectGluePointImpl();
        return diagramObjectGluePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Appointment createAppointment() {
        AppointmentImpl appointment = new AppointmentImpl();
        return appointment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Cut createCut() {
        CutImpl cut = new CutImpl();
        return cut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Recloser createRecloser() {
        RecloserImpl recloser = new RecloserImpl();
        return recloser;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvPowerFlow createSvPowerFlow() {
        SvPowerFlowImpl svPowerFlow = new SvPowerFlowImpl();
        return svPowerFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Fault createFault() {
        FaultImpl fault = new FaultImpl();
        return fault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireInfo createWireInfo() {
        WireInfoImpl wireInfo = new WireInfoImpl();
        return wireInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCConverterDCTerminal createACDCConverterDCTerminal() {
        ACDCConverterDCTerminalImpl acdcConverterDCTerminal = new ACDCConverterDCTerminalImpl();
        return acdcConverterDCTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamFV3 createGovSteamFV3() {
        GovSteamFV3Impl govSteamFV3 = new GovSteamFV3Impl();
        return govSteamFV3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Control createControl() {
        ControlImpl control = new ControlImpl();
        return control;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartIgnFuelCurve createStartIgnFuelCurve() {
        StartIgnFuelCurveImpl startIgnFuelCurve = new StartIgnFuelCurveImpl();
        return startIgnFuelCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LineFault createLineFault() {
        LineFaultImpl lineFault = new LineFaultImpl();
        return lineFault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapeShieldCableInfo createTapeShieldCableInfo() {
        TapeShieldCableInfoImpl tapeShieldCableInfo = new TapeShieldCableInfoImpl();
        return tapeShieldCableInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGASTWD createGovGASTWD() {
        GovGASTWDImpl govGASTWD = new GovGASTWDImpl();
        return govGASTWD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantReactiveControlIEC createWindPlantReactiveControlIEC() {
        WindPlantReactiveControlIECImpl windPlantReactiveControlIEC = new WindPlantReactiveControlIECImpl();
        return windPlantReactiveControlIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueSource createMeasurementValueSource() {
        MeasurementValueSourceImpl measurementValueSource = new MeasurementValueSourceImpl();
        return measurementValueSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegularIntervalSchedule createRegularIntervalSchedule() {
        RegularIntervalScheduleImpl regularIntervalSchedule = new RegularIntervalScheduleImpl();
        return regularIntervalSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroConstIEC createWindAeroConstIEC() {
        WindAeroConstIECImpl windAeroConstIEC = new WindAeroConstIECImpl();
        return windAeroConstIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroIEEE0 createGovHydroIEEE0() {
        GovHydroIEEE0Impl govHydroIEEE0 = new GovHydroIEEE0Impl();
        return govHydroIEEE0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEC61970CIMVersion createIEC61970CIMVersion() {
        IEC61970CIMVersionImpl iec61970CIMVersion = new IEC61970CIMVersionImpl();
        return iec61970CIMVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PendingCalculation createPendingCalculation() {
        PendingCalculationImpl pendingCalculation = new PendingCalculationImpl();
        return pendingCalculation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachine createAsynchronousMachine() {
        AsynchronousMachineImpl asynchronousMachine = new AsynchronousMachineImpl();
        return asynchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tariff createTariff() {
        TariffImpl tariff = new TariffImpl();
        return tariff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LinearShuntCompensatorPhase createLinearShuntCompensatorPhase() {
        LinearShuntCompensatorPhaseImpl linearShuntCompensatorPhase = new LinearShuntCompensatorPhaseImpl();
        return linearShuntCompensatorPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss1A createPss1A() {
        Pss1AImpl pss1A = new Pss1AImpl();
        return pss1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SteamSupply createSteamSupply() {
        SteamSupplyImpl steamSupply = new SteamSupplyImpl();
        return steamSupply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentInjection createEquivalentInjection() {
        EquivalentInjectionImpl equivalentInjection = new EquivalentInjectionImpl();
        return equivalentInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR3 createExcAVR3() {
        ExcAVR3Impl excAVR3 = new ExcAVR3Impl();
        return excAVR3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType3aIEC createWindGenTurbineType3aIEC() {
        WindGenTurbineType3aIECImpl windGenTurbineType3aIEC = new WindGenTurbineType3aIECImpl();
        return windGenTurbineType3aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Agreement createAgreement() {
        AgreementImpl agreement = new AgreementImpl();
        return agreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RaiseLowerCommand createRaiseLowerCommand() {
        RaiseLowerCommandImpl raiseLowerCommand = new RaiseLowerCommandImpl();
        return raiseLowerCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Fuse createFuse() {
        FuseImpl fuse = new FuseImpl();
        return fuse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageAdjusterUserDefined createVoltageAdjusterUserDefined() {
        VoltageAdjusterUserDefinedImpl voltageAdjusterUserDefined = new VoltageAdjusterUserDefinedImpl();
        return voltageAdjusterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Register createRegister() {
        RegisterImpl register = new RegisterImpl();
        return register;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadGenericNonLinear createLoadGenericNonLinear() {
        LoadGenericNonLinearImpl loadGenericNonLinear = new LoadGenericNonLinearImpl();
        return loadGenericNonLinear;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueToAlias createValueToAlias() {
        ValueToAliasImpl valueToAlias = new ValueToAliasImpl();
        return valueToAlias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PerLengthLineParameter createPerLengthLineParameter() {
        PerLengthLineParameterImpl perLengthLineParameter = new PerLengthLineParameterImpl();
        return perLengthLineParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubGeographicalRegion createSubGeographicalRegion() {
        SubGeographicalRegionImpl subGeographicalRegion = new SubGeographicalRegionImpl();
        return subGeographicalRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IdentifiedObject createIdentifiedObject() {
        IdentifiedObjectImpl identifiedObject = new IdentifiedObjectImpl();
        return identifiedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteUnit createRemoteUnit() {
        RemoteUnitImpl remoteUnit = new RemoteUnitImpl();
        return remoteUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenICompensationForGenJ createGenICompensationForGenJ() {
        GenICompensationForGenJImpl genICompensationForGenJ = new GenICompensationForGenJImpl();
        return genICompensationForGenJ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NuclearGeneratingUnit createNuclearGeneratingUnit() {
        NuclearGeneratingUnitImpl nuclearGeneratingUnit = new NuclearGeneratingUnitImpl();
        return nuclearGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetLocationHazard createAssetLocationHazard() {
        AssetLocationHazardImpl assetLocationHazard = new AssetLocationHazardImpl();
        return assetLocationHazard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StationSupply createStationSupply() {
        StationSupplyImpl stationSupply = new StationSupplyImpl();
        return stationSupply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamFV4 createGovSteamFV4() {
        GovSteamFV4Impl govSteamFV4 = new GovSteamFV4Impl();
        return govSteamFV4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST3 createGovGAST3() {
        GovGAST3Impl govGAST3 = new GovGAST3Impl();
        return govGAST3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substation createSubstation() {
        SubstationImpl substation = new SubstationImpl();
        return substation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HeatRateCurve createHeatRateCurve() {
        HeatRateCurveImpl heatRateCurve = new HeatRateCurveImpl();
        return heatRateCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetOwner createAssetOwner() {
        AssetOwnerImpl assetOwner = new AssetOwnerImpl();
        return assetOwner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteam2 createGovSteam2() {
        GovSteam2Impl govSteam2 = new GovSteam2Impl();
        return govSteam2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType4aIEC createWindContPType4aIEC() {
        WindContPType4aIECImpl windContPType4aIEC = new WindContPType4aIECImpl();
        return windContPType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicIntervalSchedule createBasicIntervalSchedule() {
        BasicIntervalScheduleImpl basicIntervalSchedule = new BasicIntervalScheduleImpl();
        return basicIntervalSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineLoadControllerUserDefined createTurbineLoadControllerUserDefined() {
        TurbineLoadControllerUserDefinedImpl turbineLoadControllerUserDefined = new TurbineLoadControllerUserDefinedImpl();
        return turbineLoadControllerUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemStabilizerUserDefined createPowerSystemStabilizerUserDefined() {
        PowerSystemStabilizerUserDefinedImpl powerSystemStabilizerUserDefined = new PowerSystemStabilizerUserDefinedImpl();
        return powerSystemStabilizerUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Receipt createReceipt() {
        ReceiptImpl receipt = new ReceiptImpl();
        return receipt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroPID2 createGovHydroPID2() {
        GovHydroPID2Impl govHydroPID2 = new GovHydroPID2Impl();
        return govHydroPID2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR2 createExcAVR2() {
        ExcAVR2Impl excAVR2 = new ExcAVR2Impl();
        return excAVR2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NameTypeAuthority createNameTypeAuthority() {
        NameTypeAuthorityImpl nameTypeAuthority = new NameTypeAuthorityImpl();
        return nameTypeAuthority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantUserDefined createWindPlantUserDefined() {
        WindPlantUserDefinedImpl windPlantUserDefined = new WindPlantUserDefinedImpl();
        return windPlantUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC6A createExcAC6A() {
        ExcAC6AImpl excAC6A = new ExcAC6AImpl();
        return excAC6A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Curve createCurve() {
        CurveImpl curve = new CurveImpl();
        return curve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VendorShift createVendorShift() {
        VendorShiftImpl vendorShift = new VendorShiftImpl();
        return vendorShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CombinedCyclePlant createCombinedCyclePlant() {
        CombinedCyclePlantImpl combinedCyclePlant = new CombinedCyclePlantImpl();
        return combinedCyclePlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergyConsumerPhase createEnergyConsumerPhase() {
        EnergyConsumerPhaseImpl energyConsumerPhase = new EnergyConsumerPhaseImpl();
        return energyConsumerPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCGround createDCGround() {
        DCGroundImpl dcGround = new DCGroundImpl();
        return dcGround;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntervalBlock createIntervalBlock() {
        IntervalBlockImpl intervalBlock = new IntervalBlockImpl();
        return intervalBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CAESPlant createCAESPlant() {
        CAESPlantImpl caesPlant = new CAESPlantImpl();
        return caesPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Quality61850 createQuality61850() {
        Quality61850Impl quality61850 = new Quality61850Impl();
        return quality61850;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Crew createCrew() {
        CrewImpl crew = new CrewImpl();
        return crew;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST1A createExcST1A() {
        ExcST1AImpl excST1A = new ExcST1AImpl();
        return excST1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPumpOpSchedule createHydroPumpOpSchedule() {
        HydroPumpOpScheduleImpl hydroPumpOpSchedule = new HydroPumpOpScheduleImpl();
        return hydroPumpOpSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType3IEC createWindGenTurbineType3IEC() {
        WindGenTurbineType3IECImpl windGenTurbineType3IEC = new WindGenTurbineType3IECImpl();
        return windGenTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro1 createGovHydro1() {
        GovHydro1Impl govHydro1 = new GovHydro1Impl();
        return govHydro1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbLCFB1 createTurbLCFB1() {
        TurbLCFB1Impl turbLCFB1 = new TurbLCFB1Impl();
        return turbLCFB1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulationSchedule createRegulationSchedule() {
        RegulationScheduleImpl regulationSchedule = new RegulationScheduleImpl();
        return regulationSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Contingency createContingency() {
        ContingencyImpl contingency = new ContingencyImpl();
        return contingency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UserAttribute createUserAttribute() {
        UserAttributeImpl userAttribute = new UserAttributeImpl();
        return userAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovCT2 createGovCT2() {
        GovCT2Impl govCT2 = new GovCT2Impl();
        return govCT2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquipmentContainer createEquipmentContainer() {
        EquipmentContainerImpl equipmentContainer = new EquipmentContainerImpl();
        return equipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScheduledEventData createScheduledEventData() {
        ScheduledEventDataImpl scheduledEventData = new ScheduledEventDataImpl();
        return scheduledEventData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Switch createSwitch() {
        SwitchImpl switch_ = new SwitchImpl();
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IncidentHazard createIncidentHazard() {
        IncidentHazardImpl incidentHazard = new IncidentHazardImpl();
        return incidentHazard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroDD createGovHydroDD() {
        GovHydroDDImpl govHydroDD = new GovHydroDDImpl();
        return govHydroDD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShuntCompensator createShuntCompensator() {
        ShuntCompensatorImpl shuntCompensator = new ShuntCompensatorImpl();
        return shuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC5A createExcAC5A() {
        ExcAC5AImpl excAC5A = new ExcAC5AImpl();
        return excAC5A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonlinearShuntCompensatorPhasePoint createNonlinearShuntCompensatorPhasePoint() {
        NonlinearShuntCompensatorPhasePointImpl nonlinearShuntCompensatorPhasePoint = new NonlinearShuntCompensatorPhasePointImpl();
        return nonlinearShuntCompensatorPhasePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantDynamics createWindPlantDynamics() {
        WindPlantDynamicsImpl windPlantDynamics = new WindPlantDynamicsImpl();
        return windPlantDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEnd createTransformerEnd() {
        TransformerEndImpl transformerEnd = new TransformerEndImpl();
        return transformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechanicalLoadUserDefined createMechanicalLoadUserDefined() {
        MechanicalLoadUserDefinedImpl mechanicalLoadUserDefined = new MechanicalLoadUserDefinedImpl();
        return mechanicalLoadUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST5B createExcIEEEST5B() {
        ExcIEEEST5BImpl excIEEEST5B = new ExcIEEEST5BImpl();
        return excIEEEST5B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SolarGeneratingUnit createSolarGeneratingUnit() {
        SolarGeneratingUnitImpl solarGeneratingUnit = new SolarGeneratingUnitImpl();
        return solarGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectPoint createDiagramObjectPoint() {
        DiagramObjectPointImpl diagramObjectPoint = new DiagramObjectPointImpl();
        return diagramObjectPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySourceAction createEnergySourceAction() {
        EnergySourceActionImpl energySourceAction = new EnergySourceActionImpl();
        return energySourceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TieFlow createTieFlow() {
        TieFlowImpl tieFlow = new TieFlowImpl();
        return tieFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Transaction createTransaction() {
        TransactionImpl transaction = new TransactionImpl();
        return transaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetOrganisationRole createAssetOrganisationRole() {
        AssetOrganisationRoleImpl assetOrganisationRole = new AssetOrganisationRoleImpl();
        return assetOrganisationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Document createDocument() {
        DocumentImpl document = new DocumentImpl();
        return document;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro4 createGovHydro4() {
        GovHydro4Impl govHydro4 = new GovHydro4Impl();
        return govHydro4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformer createPowerTransformer() {
        PowerTransformerImpl powerTransformer = new PowerTransformerImpl();
        return powerTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WirePosition createWirePosition() {
        WirePositionImpl wirePosition = new WirePositionImpl();
        return wirePosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimitType createOperationalLimitType() {
        OperationalLimitTypeImpl operationalLimitType = new OperationalLimitTypeImpl();
        return operationalLimitType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC3A createExcIEEEDC3A() {
        ExcIEEEDC3AImpl excIEEEDC3A = new ExcIEEEDC3AImpl();
        return excIEEEDC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegularTimePoint createRegularTimePoint() {
        RegularTimePointImpl regularTimePoint = new RegularTimePointImpl();
        return regularTimePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimIEEE2 createUnderexcLimIEEE2() {
        UnderexcLimIEEE2Impl underexcLimIEEE2 = new UnderexcLimIEEE2Impl();
        return underexcLimIEEE2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContCurrLimIEC createWindContCurrLimIEC() {
        WindContCurrLimIECImpl windContCurrLimIEC = new WindContCurrLimIECImpl();
        return windContCurrLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTopologicalIsland createDCTopologicalIsland() {
        DCTopologicalIslandImpl dcTopologicalIsland = new DCTopologicalIslandImpl();
        return dcTopologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LevelVsVolumeCurve createLevelVsVolumeCurve() {
        LevelVsVolumeCurveImpl levelVsVolumeCurve = new LevelVsVolumeCurveImpl();
        return levelVsVolumeCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroGeneratingUnit createHydroGeneratingUnit() {
        HydroGeneratingUnitImpl hydroGeneratingUnit = new HydroGeneratingUnitImpl();
        return hydroGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonlinearShuntCompensatorPhase createNonlinearShuntCompensatorPhase() {
        NonlinearShuntCompensatorPhaseImpl nonlinearShuntCompensatorPhase = new NonlinearShuntCompensatorPhaseImpl();
        return nonlinearShuntCompensatorPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroFrancis createGovHydroFrancis() {
        GovHydroFrancisImpl govHydroFrancis = new GovHydroFrancisImpl();
        return govHydroFrancis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntervalReading createIntervalReading() {
        IntervalReadingImpl intervalReading = new IntervalReadingImpl();
        return intervalReading;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTerminal createDCTerminal() {
        DCTerminalImpl dcTerminal = new DCTerminalImpl();
        return dcTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Organisation createOrganisation() {
        OrganisationImpl organisation = new OrganisationImpl();
        return organisation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCShunt createDCShunt() {
        DCShuntImpl dcShunt = new DCShuntImpl();
        return dcShunt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorLimit createAccumulatorLimit() {
        AccumulatorLimitImpl accumulatorLimit = new AccumulatorLimitImpl();
        return accumulatorLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemotePoint createRemotePoint() {
        RemotePointImpl remotePoint = new RemotePointImpl();
        return remotePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SteamSendoutSchedule createSteamSendoutSchedule() {
        SteamSendoutScheduleImpl steamSendoutSchedule = new SteamSendoutScheduleImpl();
        return steamSendoutSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundDisconnector createGroundDisconnector() {
        GroundDisconnectorImpl groundDisconnector = new GroundDisconnectorImpl();
        return groundDisconnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC8B createExcIEEEAC8B() {
        ExcIEEEAC8BImpl excIEEEAC8B = new ExcIEEEAC8BImpl();
        return excIEEEAC8B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Procedure createProcedure() {
        ProcedureImpl procedure = new ProcedureImpl();
        return procedure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PerLengthPhaseImpedance createPerLengthPhaseImpedance() {
        PerLengthPhaseImpedanceImpl perLengthPhaseImpedance = new PerLengthPhaseImpedanceImpl();
        return perLengthPhaseImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireSpacingInfo createWireSpacingInfo() {
        WireSpacingInfoImpl wireSpacingInfo = new WireSpacingInfoImpl();
        return wireSpacingInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PersonRole createPersonRole() {
        PersonRoleImpl personRole = new PersonRoleImpl();
        return personRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MerchantAccount createMerchantAccount() {
        MerchantAccountImpl merchantAccount = new MerchantAccountImpl();
        return merchantAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType1IEEEVArController createPFVArType1IEEEVArController() {
        PFVArType1IEEEVArControllerImpl pfvArType1IEEEVArController = new PFVArType1IEEEVArControllerImpl();
        return pfvArType1IEEEVArController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PSRType createPSRType() {
        PSRTypeImpl psrType = new PSRTypeImpl();
        return psrType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Season createSeason() {
        SeasonImpl season = new SeasonImpl();
        return season;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ContingencyEquipment createContingencyEquipment() {
        ContingencyEquipmentImpl contingencyEquipment = new ContingencyEquipmentImpl();
        return contingencyEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AltTieMeas createAltTieMeas() {
        AltTieMeasImpl altTieMeas = new AltTieMeasImpl();
        return altTieMeas;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChangerInfo createTapChangerInfo() {
        TapChangerInfoImpl tapChangerInfo = new TapChangerInfoImpl();
        return tapChangerInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Limit createLimit() {
        LimitImpl limit = new LimitImpl();
        return limit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeterMultiplier createMeterMultiplier() {
        MeterMultiplierImpl meterMultiplier = new MeterMultiplierImpl();
        return meterMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineLoadControllerDynamics createTurbineLoadControllerDynamics() {
        TurbineLoadControllerDynamicsImpl turbineLoadControllerDynamics = new TurbineLoadControllerDynamicsImpl();
        return turbineLoadControllerDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PotentialTransformer createPotentialTransformer() {
        PotentialTransformerImpl potentialTransformer = new PotentialTransformerImpl();
        return potentialTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType2Dynamics createPFVArControllerType2Dynamics() {
        PFVArControllerType2DynamicsImpl pfvArControllerType2Dynamics = new PFVArControllerType2DynamicsImpl();
        return pfvArControllerType2Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConsumptionTariffInterval createConsumptionTariffInterval() {
        ConsumptionTariffIntervalImpl consumptionTariffInterval = new ConsumptionTariffIntervalImpl();
        return consumptionTariffInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNodeContainer createConnectivityNodeContainer() {
        ConnectivityNodeContainerImpl connectivityNodeContainer = new ConnectivityNodeContainerImpl();
        return connectivityNodeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerAgreement createCustomerAgreement() {
        CustomerAgreementImpl customerAgreement = new CustomerAgreementImpl();
        return customerAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergyArea createEnergyArea() {
        EnergyAreaImpl energyArea = new EnergyAreaImpl();
        return energyArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Incident createIncident() {
        IncidentImpl incident = new IncidentImpl();
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcHU createExcHU() {
        ExcHUImpl excHU = new ExcHUImpl();
        return excHU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindType3or4UserDefined createWindType3or4UserDefined() {
        WindType3or4UserDefinedImpl windType3or4UserDefined = new WindType3or4UserDefinedImpl();
        return windType3or4UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineSimplified createSynchronousMachineSimplified() {
        SynchronousMachineSimplifiedImpl synchronousMachineSimplified = new SynchronousMachineSimplifiedImpl();
        return synchronousMachineSimplified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeterServiceWork createMeterServiceWork() {
        MeterServiceWorkImpl meterServiceWork = new MeterServiceWorkImpl();
        return meterServiceWork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HeatRecoveryBoiler createHeatRecoveryBoiler() {
        HeatRecoveryBoilerImpl heatRecoveryBoiler = new HeatRecoveryBoilerImpl();
        return heatRecoveryBoiler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentBranch createEquivalentBranch() {
        EquivalentBranchImpl equivalentBranch = new EquivalentBranchImpl();
        return equivalentBranch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadArea createLoadArea() {
        LoadAreaImpl loadArea = new LoadAreaImpl();
        return loadArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutageSchedule createOutageSchedule() {
        OutageScheduleImpl outageSchedule = new OutageScheduleImpl();
        return outageSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcELIN1 createExcELIN1() {
        ExcELIN1Impl excELIN1 = new ExcELIN1Impl();
        return excELIN1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePointLocation createUsagePointLocation() {
        UsagePointLocationImpl usagePointLocation = new UsagePointLocationImpl();
        return usagePointLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST2A createExcST2A() {
        ExcST2AImpl excST2A = new ExcST2AImpl();
        return excST2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FaultIndicator createFaultIndicator() {
        FaultIndicatorImpl faultIndicator = new FaultIndicatorImpl();
        return faultIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCNode createDCNode() {
        DCNodeImpl dcNode = new DCNodeImpl();
        return dcNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CogenerationPlant createCogenerationPlant() {
        CogenerationPlantImpl cogenerationPlant = new CogenerationPlantImpl();
        return cogenerationPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST7B createExcIEEEST7B() {
        ExcIEEEST7BImpl excIEEEST7B = new ExcIEEEST7BImpl();
        return excIEEEST7B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageCompensatorUserDefined createVoltageCompensatorUserDefined() {
        VoltageCompensatorUserDefinedImpl voltageCompensatorUserDefined = new VoltageCompensatorUserDefinedImpl();
        return voltageCompensatorUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadResponseCharacteristic createLoadResponseCharacteristic() {
        LoadResponseCharacteristicImpl loadResponseCharacteristic = new LoadResponseCharacteristicImpl();
        return loadResponseCharacteristic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Cashier createCashier() {
        CashierImpl cashier = new CashierImpl();
        return cashier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PostLineSensor createPostLineSensor() {
        PostLineSensorImpl postLineSensor = new PostLineSensorImpl();
        return postLineSensor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindType1or2UserDefined createWindType1or2UserDefined() {
        WindType1or2UserDefinedImpl windType1or2UserDefined = new WindType1or2UserDefinedImpl();
        return windType1or2UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource createPowerSystemResource() {
        PowerSystemResourceImpl powerSystemResource = new PowerSystemResourceImpl();
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType3bIEC createWindGenTurbineType3bIEC() {
        WindGenTurbineType3bIECImpl windGenTurbineType3bIEC = new WindGenTurbineType3bIECImpl();
        return windGenTurbineType3bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssSB4 createPssSB4() {
        PssSB4Impl pssSB4 = new PssSB4Impl();
        return pssSB4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObject createDiagramObject() {
        DiagramObjectImpl diagramObject = new DiagramObjectImpl();
        return diagramObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramStyle createDiagramStyle() {
        DiagramStyleImpl diagramStyle = new DiagramStyleImpl();
        return diagramStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCBusbar createDCBusbar() {
        DCBusbarImpl dcBusbar = new DCBusbarImpl();
        return dcBusbar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmissionAccount createEmissionAccount() {
        EmissionAccountImpl emissionAccount = new EmissionAccountImpl();
        return emissionAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchrocheckRelay createSynchrocheckRelay() {
        SynchrocheckRelayImpl synchrocheckRelay = new SynchrocheckRelayImpl();
        return synchrocheckRelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4Dynamics createWindTurbineType3or4Dynamics() {
        WindTurbineType3or4DynamicsImpl windTurbineType3or4Dynamics = new WindTurbineType3or4DynamicsImpl();
        return windTurbineType3or4Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceFunction createEndDeviceFunction() {
        EndDeviceFunctionImpl endDeviceFunction = new EndDeviceFunctionImpl();
        return endDeviceFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Manufacturer createManufacturer() {
        ManufacturerImpl manufacturer = new ManufacturerImpl();
        return manufacturer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC3A1 createExcDC3A1() {
        ExcDC3A1Impl excDC3A1 = new ExcDC3A1Impl();
        return excDC3A1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorLimitSet createAccumulatorLimitSet() {
        AccumulatorLimitSetImpl accumulatorLimitSet = new AccumulatorLimitSetImpl();
        return accumulatorLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PointOfSale createPointOfSale() {
        PointOfSaleImpl pointOfSale = new PointOfSaleImpl();
        return pointOfSale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC7B createExcIEEEAC7B() {
        ExcIEEEAC7BImpl excIEEEAC7B = new ExcIEEEAC7BImpl();
        return excIEEEAC7B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroPID createGovHydroPID() {
        GovHydroPIDImpl govHydroPID = new GovHydroPIDImpl();
        return govHydroPID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchSchedule createSwitchSchedule() {
        SwitchScheduleImpl switchSchedule = new SwitchScheduleImpl();
        return switchSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MaterialItem createMaterialItem() {
        MaterialItemImpl materialItem = new MaterialItemImpl();
        return materialItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageCompensatorDynamics createVoltageCompensatorDynamics() {
        VoltageCompensatorDynamicsImpl voltageCompensatorDynamics = new VoltageCompensatorDynamicsImpl();
        return voltageCompensatorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCConverter createACDCConverter() {
        ACDCConverterImpl acdcConverter = new ACDCConverterImpl();
        return acdcConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC4B createExcIEEEDC4B() {
        ExcIEEEDC4BImpl excIEEEDC4B = new ExcIEEEDC4BImpl();
        return excIEEEDC4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQIEC createWindContQIEC() {
        WindContQIECImpl windContQIEC = new WindContQIECImpl();
        return windContQIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcSEXS createExcSEXS() {
        ExcSEXSImpl excSEXS = new ExcSEXSImpl();
        return excSEXS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BusNameMarker createBusNameMarker() {
        BusNameMarkerImpl busNameMarker = new BusNameMarkerImpl();
        return busNameMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MaintenanceLocation createMaintenanceLocation() {
        MaintenanceLocationImpl maintenanceLocation = new MaintenanceLocationImpl();
        return maintenanceLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PositionPoint createPositionPoint() {
        PositionPointImpl positionPoint = new PositionPointImpl();
        return positionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformerEnd createPowerTransformerEnd() {
        PowerTransformerEndImpl powerTransformerEnd = new PowerTransformerEndImpl();
        return powerTransformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamCC createGovSteamCC() {
        GovSteamCCImpl govSteamCC = new GovSteamCCImpl();
        return govSteamCC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartRampCurve createStartRampCurve() {
        StartRampCurveImpl startRampCurve = new StartRampCurveImpl();
        return startRampCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reservoir createReservoir() {
        ReservoirImpl reservoir = new ReservoirImpl();
        return reservoir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechLoad1 createMechLoad1() {
        MechLoad1Impl mechLoad1 = new MechLoad1Impl();
        return mechLoad1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST7B createExcST7B() {
        ExcST7BImpl excST7B = new ExcST7BImpl();
        return excST7B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType1or2Dynamics createWindTurbineType1or2Dynamics() {
        WindTurbineType1or2DynamicsImpl windTurbineType1or2Dynamics = new WindTurbineType1or2DynamicsImpl();
        return windTurbineType1or2Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimit createOperationalLimit() {
        OperationalLimitImpl operationalLimit = new OperationalLimitImpl();
        return operationalLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC2A createExcIEEEDC2A() {
        ExcIEEEDC2AImpl excIEEEDC2A = new ExcIEEEDC2AImpl();
        return excIEEEDC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchAction createSwitchAction() {
        SwitchActionImpl switchAction = new SwitchActionImpl();
        return switchAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Person createPerson() {
        PersonImpl person = new PersonImpl();
        return person;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComMedia createComMedia() {
        ComMediaImpl comMedia = new ComMediaImpl();
        return comMedia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Analog createAnalog() {
        AnalogImpl analog = new AnalogImpl();
        return analog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss1 createPss1() {
        Pss1Impl pss1 = new Pss1Impl();
        return pss1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GrossToNetActivePowerCurve createGrossToNetActivePowerCurve() {
        GrossToNetActivePowerCurveImpl grossToNetActivePowerCurve = new GrossToNetActivePowerCurveImpl();
        return grossToNetActivePowerCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Vehicle createVehicle() {
        VehicleImpl vehicle = new VehicleImpl();
        return vehicle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST3A createExcIEEEST3A() {
        ExcIEEEST3AImpl excIEEEST3A = new ExcIEEEST3AImpl();
        return excIEEEST3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchPhase createSwitchPhase() {
        SwitchPhaseImpl switchPhase = new SwitchPhaseImpl();
        return switchPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceAction createEndDeviceAction() {
        EndDeviceActionImpl endDeviceAction = new EndDeviceActionImpl();
        return endDeviceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Bay createBay() {
        BayImpl bay = new BayImpl();
        return bay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC5A createExcIEEEAC5A() {
        ExcIEEEAC5AImpl excIEEEAC5A = new ExcIEEEAC5AImpl();
        return excIEEEAC5A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Channel createChannel() {
        ChannelImpl channel = new ChannelImpl();
        return channel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerTest createTransformerTest() {
        TransformerTestImpl transformerTest = new TransformerTestImpl();
        return transformerTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChangerControl createTapChangerControl() {
        TapChangerControlImpl tapChangerControl = new TapChangerControlImpl();
        return tapChangerControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCBaseTerminal createDCBaseTerminal() {
        DCBaseTerminalImpl dcBaseTerminal = new DCBaseTerminalImpl();
        return dcBaseTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApparentPowerLimit createApparentPowerLimit() {
        ApparentPowerLimitImpl apparentPowerLimit = new ApparentPowerLimitImpl();
        return apparentPowerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoad createConformLoad() {
        ConformLoadImpl conformLoad = new ConformLoadImpl();
        return conformLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingQuality createReadingQuality() {
        ReadingQualityImpl readingQuality = new ReadingQualityImpl();
        return readingQuality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FossilSteamSupply createFossilSteamSupply() {
        FossilSteamSupplyImpl fossilSteamSupply = new FossilSteamSupplyImpl();
        return fossilSteamSupply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE4B createPssIEEE4B() {
        PssIEEE4BImpl pssIEEE4B = new PssIEEE4BImpl();
        return pssIEEE4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcSCRX createExcSCRX() {
        ExcSCRXImpl excSCRX = new ExcSCRXImpl();
        return excSCRX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroWEH createGovHydroWEH() {
        GovHydroWEHImpl govHydroWEH = new GovHydroWEHImpl();
        return govHydroWEH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OrganisationRole createOrganisationRole() {
        OrganisationRoleImpl organisationRole = new OrganisationRoleImpl();
        return organisationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACLineSegment createACLineSegment() {
        ACLineSegmentImpl acLineSegment = new ACLineSegmentImpl();
        return acLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCTerminal createACDCTerminal() {
        ACDCTerminalImpl acdcTerminal = new ACDCTerminalImpl();
        return acdcTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DayType createDayType() {
        DayTypeImpl dayType = new DayTypeImpl();
        return dayType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Clamp createClamp() {
        ClampImpl clamp = new ClampImpl();
        return clamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogLimitSet createAnalogLimitSet() {
        AnalogLimitSetImpl analogLimitSet = new AnalogLimitSetImpl();
        return analogLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvStatus createSvStatus() {
        SvStatusImpl svStatus = new SvStatusImpl();
        return svStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NameType createNameType() {
        NameTypeImpl nameType = new NameTypeImpl();
        return nameType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Tender createTender() {
        TenderImpl tender = new TenderImpl();
        return tender;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcSK createExcSK() {
        ExcSKImpl excSK = new ExcSKImpl();
        return excSK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShutdownCurve createShutdownCurve() {
        ShutdownCurveImpl shutdownCurve = new ShutdownCurveImpl();
        return shutdownCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Accumulator createAccumulator() {
        AccumulatorImpl accumulator = new AccumulatorImpl();
        return accumulator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AltGeneratingUnitMeas createAltGeneratingUnitMeas() {
        AltGeneratingUnitMeasImpl altGeneratingUnitMeas = new AltGeneratingUnitMeasImpl();
        return altGeneratingUnitMeas;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST4B createExcST4B() {
        ExcST4BImpl excST4B = new ExcST4BImpl();
        return excST4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VAdjIEEE createVAdjIEEE() {
        VAdjIEEEImpl vAdjIEEE = new VAdjIEEEImpl();
        return vAdjIEEE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentNetwork createEquivalentNetwork() {
        EquivalentNetworkImpl equivalentNetwork = new EquivalentNetworkImpl();
        return equivalentNetwork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceControl createEndDeviceControl() {
        EndDeviceControlImpl endDeviceControl = new EndDeviceControlImpl();
        return endDeviceControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroR createGovHydroR() {
        GovHydroRImpl govHydroR = new GovHydroRImpl();
        return govHydroR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimX1 createUnderexcLimX1() {
        UnderexcLimX1Impl underexcLimX1 = new UnderexcLimX1Impl();
        return underexcLimX1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScheduledEvent createScheduledEvent() {
        ScheduledEventImpl scheduledEvent = new ScheduledEventImpl();
        return scheduledEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartMainFuelCurve createStartMainFuelCurve() {
        StartMainFuelCurveImpl startMainFuelCurve = new StartMainFuelCurveImpl();
        return startMainFuelCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST createGovGAST() {
        GovGASTImpl govGAST = new GovGASTImpl();
        return govGAST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SafetyDocument createSafetyDocument() {
        SafetyDocumentImpl safetyDocument = new SafetyDocumentImpl();
        return safetyDocument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR4 createExcAVR4() {
        ExcAVR4Impl excAVR4 = new ExcAVR4Impl();
        return excAVR4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Name createName() {
        NameImpl name = new NameImpl();
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineTimeConstantReactance createAsynchronousMachineTimeConstantReactance() {
        AsynchronousMachineTimeConstantReactanceImpl asynchronousMachineTimeConstantReactance = new AsynchronousMachineTimeConstantReactanceImpl();
        return asynchronousMachineTimeConstantReactance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsConverter createVsConverter() {
        VsConverterImpl vsConverter = new VsConverterImpl();
        return vsConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundingImpedance createGroundingImpedance() {
        GroundingImpedanceImpl groundingImpedance = new GroundingImpedanceImpl();
        return groundingImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindMechIEC createWindMechIEC() {
        WindMechIECImpl windMechIEC = new WindMechIECImpl();
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscExcContIEEEDEC3A createDiscExcContIEEEDEC3A() {
        DiscExcContIEEEDEC3AImpl discExcContIEEEDEC3A = new DiscExcContIEEEDEC3AImpl();
        return discExcContIEEEDEC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseReading createBaseReading() {
        BaseReadingImpl baseReading = new BaseReadingImpl();
        return baseReading;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset createAsset() {
        AssetImpl asset = new AssetImpl();
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR1 createExcAVR1() {
        ExcAVR1Impl excAVR1 = new ExcAVR1Impl();
        return excAVR1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValue createMeasurementValue() {
        MeasurementValueImpl measurementValue = new MeasurementValueImpl();
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseWork createBaseWork() {
        BaseWorkImpl baseWork = new BaseWorkImpl();
        return baseWork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscontinuousExcitationControlUserDefined createDiscontinuousExcitationControlUserDefined() {
        DiscontinuousExcitationControlUserDefinedImpl discontinuousExcitationControlUserDefined = new DiscontinuousExcitationControlUserDefinedImpl();
        return discontinuousExcitationControlUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCLineSegment createDCLineSegment() {
        DCLineSegmentImpl dcLineSegment = new DCLineSegmentImpl();
        return dcLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SeriesCompensator createSeriesCompensator() {
        SeriesCompensatorImpl seriesCompensator = new SeriesCompensatorImpl();
        return seriesCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentEquipment createEquivalentEquipment() {
        EquivalentEquipmentImpl equivalentEquipment = new EquivalentEquipmentImpl();
        return equivalentEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Connector createConnector() {
        ConnectorImpl connector = new ConnectorImpl();
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType1IEEEPFController createPFVArType1IEEEPFController() {
        PFVArType1IEEEPFControllerImpl pfvArType1IEEEPFController = new PFVArType1IEEEPFControllerImpl();
        return pfvArType1IEEEPFController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC1A createExcDC1A() {
        ExcDC1AImpl excDC1A = new ExcDC1AImpl();
        return excDC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadComposite createLoadComposite() {
        LoadCompositeImpl loadComposite = new LoadCompositeImpl();
        return loadComposite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel createVoltageLevel() {
        VoltageLevelImpl voltageLevel = new VoltageLevelImpl();
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvTapStep createSvTapStep() {
        SvTapStepImpl svTapStep = new SvTapStepImpl();
        return svTapStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteam0 createGovSteam0() {
        GovSteam0Impl govSteam0 = new GovSteam0Impl();
        return govSteam0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Vendor createVendor() {
        VendorImpl vendor = new VendorImpl();
        return vendor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EarthFaultCompensator createEarthFaultCompensator() {
        EarthFaultCompensatorImpl earthFaultCompensator = new EarthFaultCompensatorImpl();
        return earthFaultCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StateVariable createStateVariable() {
        StateVariableImpl stateVariable = new StateVariableImpl();
        return stateVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonlinearShuntCompensator createNonlinearShuntCompensator() {
        NonlinearShuntCompensatorImpl nonlinearShuntCompensator = new NonlinearShuntCompensatorImpl();
        return nonlinearShuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FossilFuel createFossilFuel() {
        FossilFuelImpl fossilFuel = new FossilFuelImpl();
        return fossilFuel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalUpdatedRating createOperationalUpdatedRating() {
        OperationalUpdatedRatingImpl operationalUpdatedRating = new OperationalUpdatedRatingImpl();
        return operationalUpdatedRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindDynamicsLookupTable createWindDynamicsLookupTable() {
        WindDynamicsLookupTableImpl windDynamicsLookupTable = new WindDynamicsLookupTableImpl();
        return windDynamicsLookupTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkAsset createWorkAsset() {
        WorkAssetImpl workAsset = new WorkAssetImpl();
        return workAsset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadBreakSwitch createLoadBreakSwitch() {
        LoadBreakSwitchImpl loadBreakSwitch = new LoadBreakSwitchImpl();
        return loadBreakSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PenstockLossCurve createPenstockLossCurve() {
        PenstockLossCurveImpl penstockLossCurve = new PenstockLossCurveImpl();
        return penstockLossCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType1IEC createWindGenTurbineType1IEC() {
        WindGenTurbineType1IECImpl windGenTurbineType1IEC = new WindGenTurbineType1IECImpl();
        return windGenTurbineType1IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Work createWork() {
        WorkImpl work = new WorkImpl();
        return work;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerLinear createPhaseTapChangerLinear() {
        PhaseTapChangerLinearImpl phaseTapChangerLinear = new PhaseTapChangerLinearImpl();
        return phaseTapChangerLinear;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNode createConnectivityNode() {
        ConnectivityNodeImpl connectivityNode = new ConnectivityNodeImpl();
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MutualCoupling createMutualCoupling() {
        MutualCouplingImpl mutualCoupling = new MutualCouplingImpl();
        return mutualCoupling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerMeshImpedance createTransformerMeshImpedance() {
        TransformerMeshImpedanceImpl transformerMeshImpedance = new TransformerMeshImpedanceImpl();
        return transformerMeshImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCSeriesDevice createDCSeriesDevice() {
        DCSeriesDeviceImpl dcSeriesDevice = new DCSeriesDeviceImpl();
        return dcSeriesDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDetailed createSynchronousMachineDetailed() {
        SynchronousMachineDetailedImpl synchronousMachineDetailed = new SynchronousMachineDetailedImpl();
        return synchronousMachineDetailed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CompositeSwitch createCompositeSwitch() {
        CompositeSwitchImpl compositeSwitch = new CompositeSwitchImpl();
        return compositeSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE3B createPssIEEE3B() {
        PssIEEE3BImpl pssIEEE3B = new PssIEEE3BImpl();
        return pssIEEE3B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatingShare createOperatingShare() {
        OperatingShareImpl operatingShare = new OperatingShareImpl();
        return operatingShare;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage createBaseVoltage() {
        BaseVoltageImpl baseVoltage = new BaseVoltageImpl();
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySource createEnergySource() {
        EnergySourceImpl energySource = new EnergySourceImpl();
        return energySource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcitationLimiterDynamics createUnderexcitationLimiterDynamics() {
        UnderexcitationLimiterDynamicsImpl underexcitationLimiterDynamics = new UnderexcitationLimiterDynamicsImpl();
        return underexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimePoint createTimePoint() {
        TimePointImpl timePoint = new TimePointImpl();
        return timePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfigurationEvent createConfigurationEvent() {
        ConfigurationEventImpl configurationEvent = new ConfigurationEventImpl();
        return configurationEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShuntCompensatorPhase createShuntCompensatorPhase() {
        ShuntCompensatorPhaseImpl shuntCompensatorPhase = new ShuntCompensatorPhaseImpl();
        return shuntCompensatorPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACLineSegmentPhase createACLineSegmentPhase() {
        ACLineSegmentPhaseImpl acLineSegmentPhase = new ACLineSegmentPhaseImpl();
        return acLineSegmentPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TargetLevelSchedule createTargetLevelSchedule() {
        TargetLevelScheduleImpl targetLevelSchedule = new TargetLevelScheduleImpl();
        return targetLevelSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerTablePoint createPhaseTapChangerTablePoint() {
        PhaseTapChangerTablePointImpl phaseTapChangerTablePoint = new PhaseTapChangerTablePointImpl();
        return phaseTapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectStyle createDiagramObjectStyle() {
        DiagramObjectStyleImpl diagramObjectStyle = new DiagramObjectStyleImpl();
        return diagramObjectStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClearanceAction createClearanceAction() {
        ClearanceActionImpl clearanceAction = new ClearanceActionImpl();
        return clearanceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType4bIEC createWindContPType4bIEC() {
        WindContPType4bIECImpl windContPType4bIEC = new WindContPType4bIECImpl();
        return windContPType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CutAction createCutAction() {
        CutActionImpl cutAction = new CutActionImpl();
        return cutAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcitationLimiterUserDefined createOverexcitationLimiterUserDefined() {
        OverexcitationLimiterUserDefinedImpl overexcitationLimiterUserDefined = new OverexcitationLimiterUserDefinedImpl();
        return overexcitationLimiterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcREXS createExcREXS() {
        ExcREXSImpl excREXS = new ExcREXSImpl();
        return excREXS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoadGroup createConformLoadGroup() {
        ConformLoadGroupImpl conformLoadGroup = new ConformLoadGroupImpl();
        return conformLoadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCConductingEquipment createDCConductingEquipment() {
        DCConductingEquipmentImpl dcConductingEquipment = new DCConductingEquipmentImpl();
        return dcConductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TroubleTicket createTroubleTicket() {
        TroubleTicketImpl troubleTicket = new TroubleTicketImpl();
        return troubleTicket;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AuxiliaryEquipment createAuxiliaryEquipment() {
        AuxiliaryEquipmentImpl auxiliaryEquipment = new AuxiliaryEquipmentImpl();
        return auxiliaryEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssWECC createPssWECC() {
        PssWECCImpl pssWECC = new PssWECCImpl();
        return pssWECC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLimIEEE createOverexcLimIEEE() {
        OverexcLimIEEEImpl overexcLimIEEE = new OverexcLimIEEEImpl();
        return overexcLimIEEE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MerchantAgreement createMerchantAgreement() {
        MerchantAgreementImpl merchantAgreement = new MerchantAgreementImpl();
        return merchantAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC2A createExcIEEEAC2A() {
        ExcIEEEAC2AImpl excIEEEAC2A = new ExcIEEEAC2AImpl();
        return excIEEEAC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Breaker createBreaker() {
        BreakerImpl breaker = new BreakerImpl();
        return breaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCDisconnector createDCDisconnector() {
        DCDisconnectorImpl dcDisconnector = new DCDisconnectorImpl();
        return dcDisconnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeSchedule createTimeSchedule() {
        TimeScheduleImpl timeSchedule = new TimeScheduleImpl();
        return timeSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulatingCondEq createRegulatingCondEq() {
        RegulatingCondEqImpl regulatingCondEq = new RegulatingCondEqImpl();
        return regulatingCondEq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEC61968CIMVersion createIEC61968CIMVersion() {
        IEC61968CIMVersionImpl iec61968CIMVersion = new IEC61968CIMVersionImpl();
        return iec61968CIMVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThermalGeneratingUnit createThermalGeneratingUnit() {
        ThermalGeneratingUnitImpl thermalGeneratingUnit = new ThermalGeneratingUnitImpl();
        return thermalGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Disconnector createDisconnector() {
        DisconnectorImpl disconnector = new DisconnectorImpl();
        return disconnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimX2 createUnderexcLimX2() {
        UnderexcLimX2Impl underexcLimX2 = new UnderexcLimX2Impl();
        return underexcLimX2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JumperAction createJumperAction() {
        JumperActionImpl jumperAction = new JumperActionImpl();
        return jumperAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RotatingMachine createRotatingMachine() {
        RotatingMachineImpl rotatingMachine = new RotatingMachineImpl();
        return rotatingMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Subcritical createSubcritical() {
        SubcriticalImpl subcritical = new SubcriticalImpl();
        return subcritical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcBBC createExcBBC() {
        ExcBBCImpl excBBC = new ExcBBCImpl();
        return excBBC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssPTIST1 createPssPTIST1() {
        PssPTIST1Impl pssPTIST1 = new PssPTIST1Impl();
        return pssPTIST1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcELIN2 createExcELIN2() {
        ExcELIN2Impl excELIN2 = new ExcELIN2Impl();
        return excELIN2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SteamTurbine createSteamTurbine() {
        SteamTurbineImpl steamTurbine = new SteamTurbineImpl();
        return steamTurbine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingPlan createSwitchingPlan() {
        SwitchingPlanImpl switchingPlan = new SwitchingPlanImpl();
        return switchingPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrewType createCrewType() {
        CrewTypeImpl crewType = new CrewTypeImpl();
        return crewType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Command createCommand() {
        CommandImpl command = new CommandImpl();
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE1A createPssIEEE1A() {
        PssIEEE1AImpl pssIEEE1A = new PssIEEE1AImpl();
        return pssIEEE1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Sectionaliser createSectionaliser() {
        SectionaliserImpl sectionaliser = new SectionaliserImpl();
        return sectionaliser;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComModule createComModule() {
        ComModuleImpl comModule = new ComModuleImpl();
        return comModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Line createLine() {
        LineImpl line = new LineImpl();
        return line;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineGovernorDynamics createTurbineGovernorDynamics() {
        TurbineGovernorDynamicsImpl turbineGovernorDynamics = new TurbineGovernorDynamicsImpl();
        return turbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OpenCircuitTest createOpenCircuitTest() {
        OpenCircuitTestImpl openCircuitTest = new OpenCircuitTestImpl();
        return openCircuitTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PerLengthImpedance createPerLengthImpedance() {
        PerLengthImpedanceImpl perLengthImpedance = new PerLengthImpedanceImpl();
        return perLengthImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Plant createPlant() {
        PlantImpl plant = new PlantImpl();
        return plant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST6B createExcST6B() {
        ExcST6BImpl excST6B = new ExcST6BImpl();
        return excST6B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC4A createExcIEEEAC4A() {
        ExcIEEEAC4AImpl excIEEEAC4A = new ExcIEEEAC4AImpl();
        return excIEEEAC4A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST3A createExcST3A() {
        ExcST3AImpl excST3A = new ExcST3AImpl();
        return excST3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineUserDefined createSynchronousMachineUserDefined() {
        SynchronousMachineUserDefinedImpl synchronousMachineUserDefined = new SynchronousMachineUserDefinedImpl();
        return synchronousMachineUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextDiagramObject createTextDiagramObject() {
        TextDiagramObjectImpl textDiagramObject = new TextDiagramObjectImpl();
        return textDiagramObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Discrete createDiscrete() {
        DiscreteImpl discrete = new DiscreteImpl();
        return discrete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartupModel createStartupModel() {
        StartupModelImpl startupModel = new StartupModelImpl();
        return startupModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PWRSteamSupply createPWRSteamSupply() {
        PWRSteamSupplyImpl pwrSteamSupply = new PWRSteamSupplyImpl();
        return pwrSteamSupply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerTank createTransformerTank() {
        TransformerTankImpl transformerTank = new TransformerTankImpl();
        return transformerTank;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC8B createExcAC8B() {
        ExcAC8BImpl excAC8B = new ExcAC8BImpl();
        return excAC8B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Seal createSeal() {
        SealImpl seal = new SealImpl();
        return seal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VCompIEEEType1 createVCompIEEEType1() {
        VCompIEEEType1Impl vCompIEEEType1 = new VCompIEEEType1Impl();
        return vCompIEEEType1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroLinearIEC createWindAeroLinearIEC() {
        WindAeroLinearIECImpl windAeroLinearIEC = new WindAeroLinearIECImpl();
        return windAeroLinearIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Jumper createJumper() {
        JumperImpl jumper = new JumperImpl();
        return jumper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerSymmetrical createPhaseTapChangerSymmetrical() {
        PhaseTapChangerSymmetricalImpl phaseTapChangerSymmetrical = new PhaseTapChangerSymmetricalImpl();
        return phaseTapChangerSymmetrical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerCutZone createPowerCutZone() {
        PowerCutZoneImpl powerCutZone = new PowerCutZoneImpl();
        return powerCutZone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics createSynchronousMachineDynamics() {
        SynchronousMachineDynamicsImpl synchronousMachineDynamics = new SynchronousMachineDynamicsImpl();
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportingSuperGroup createReportingSuperGroup() {
        ReportingSuperGroupImpl reportingSuperGroup = new ReportingSuperGroupImpl();
        return reportingSuperGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamEU createGovSteamEU() {
        GovSteamEUImpl govSteamEU = new GovSteamEUImpl();
        return govSteamEU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerTable createPhaseTapChangerTable() {
        PhaseTapChangerTableImpl phaseTapChangerTable = new PhaseTapChangerTableImpl();
        return phaseTapChangerTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR7 createExcAVR7() {
        ExcAVR7Impl excAVR7 = new ExcAVR7Impl();
        return excAVR7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLimX2 createOverexcLimX2() {
        OverexcLimX2Impl overexcLimX2 = new OverexcLimX2Impl();
        return overexcLimX2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCConverterUnit createDCConverterUnit() {
        DCConverterUnitImpl dcConverterUnit = new DCConverterUnitImpl();
        return dcConverterUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BusbarSection createBusbarSection() {
        BusbarSectionImpl busbarSection = new BusbarSectionImpl();
        return busbarSection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenUnitOpSchedule createGenUnitOpSchedule() {
        GenUnitOpScheduleImpl genUnitOpSchedule = new GenUnitOpScheduleImpl();
        return genUnitOpSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindProtectionIEC createWindProtectionIEC() {
        WindProtectionIECImpl windProtectionIEC = new WindProtectionIECImpl();
        return windProtectionIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCBreaker createDCBreaker() {
        DCBreakerImpl dcBreaker = new DCBreakerImpl();
        return dcBreaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChanger createRatioTapChanger() {
        RatioTapChangerImpl ratioTapChanger = new RatioTapChangerImpl();
        return ratioTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformerInfo createPowerTransformerInfo() {
        PowerTransformerInfoImpl powerTransformerInfo = new PowerTransformerInfoImpl();
        return powerTransformerInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDevice createEndDevice() {
        EndDeviceImpl endDevice = new EndDeviceImpl();
        return endDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineEquivalentCircuit createSynchronousMachineEquivalentCircuit() {
        SynchronousMachineEquivalentCircuitImpl synchronousMachineEquivalentCircuit = new SynchronousMachineEquivalentCircuitImpl();
        return synchronousMachineEquivalentCircuit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonConformLoadSchedule createNonConformLoadSchedule() {
        NonConformLoadScheduleImpl nonConformLoadSchedule = new NonConformLoadScheduleImpl();
        return nonConformLoadSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerCoreAdmittance createTransformerCoreAdmittance() {
        TransformerCoreAdmittanceImpl transformerCoreAdmittance = new TransformerCoreAdmittanceImpl();
        return transformerCoreAdmittance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CombustionTurbine createCombustionTurbine() {
        CombustionTurbineImpl combustionTurbine = new CombustionTurbineImpl();
        return combustionTurbine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceControlType createEndDeviceControlType() {
        EndDeviceControlTypeImpl endDeviceControlType = new EndDeviceControlTypeImpl();
        return endDeviceControlType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC1A createExcAC1A() {
        ExcAC1AImpl excAC1A = new ExcAC1AImpl();
        return excAC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HeatInputCurve createHeatInputCurve() {
        HeatInputCurveImpl heatInputCurve = new HeatInputCurveImpl();
        return heatInputCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseFrequency createBaseFrequency() {
        BaseFrequencyImpl baseFrequency = new BaseFrequencyImpl();
        return baseFrequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalNode createTopologicalNode() {
        TopologicalNodeImpl topologicalNode = new TopologicalNodeImpl();
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubLoadArea createSubLoadArea() {
        SubLoadAreaImpl subLoadArea = new SubLoadAreaImpl();
        return subLoadArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IncrementalHeatRateCurve createIncrementalHeatRateCurve() {
        IncrementalHeatRateCurveImpl incrementalHeatRateCurve = new IncrementalHeatRateCurveImpl();
        return incrementalHeatRateCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLimit createVoltageLimit() {
        VoltageLimitImpl voltageLimit = new VoltageLimitImpl();
        return voltageLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType4IEC createWindGenType4IEC() {
        WindGenType4IECImpl windGenType4IEC = new WindGenType4IECImpl();
        return windGenType4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4IEC createWindTurbineType3or4IEC() {
        WindTurbineType3or4IECImpl windTurbineType3or4IEC = new WindTurbineType3or4IECImpl();
        return windTurbineType3or4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcitationLimiterUserDefined createUnderexcitationLimiterUserDefined() {
        UnderexcitationLimiterUserDefinedImpl underexcitationLimiterUserDefined = new UnderexcitationLimiterUserDefinedImpl();
        return underexcitationLimiterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroIEEE2 createGovHydroIEEE2() {
        GovHydroIEEE2Impl govHydroIEEE2 = new GovHydroIEEE2Impl();
        return govHydroIEEE2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericAction createGenericAction() {
        GenericActionImpl genericAction = new GenericActionImpl();
        return genericAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcitationLimiterDynamics createOverexcitationLimiterDynamics() {
        OverexcitationLimiterDynamicsImpl overexcitationLimiterDynamics = new OverexcitationLimiterDynamicsImpl();
        return overexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType1UserDefined createPFVArControllerType1UserDefined() {
        PFVArControllerType1UserDefinedImpl pfvArControllerType1UserDefined = new PFVArControllerType1UserDefinedImpl();
        return pfvArControllerType1UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CTTempActivePowerCurve createCTTempActivePowerCurve() {
        CTTempActivePowerCurveImpl ctTempActivePowerCurve = new CTTempActivePowerCurveImpl();
        return ctTempActivePowerCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetFunction createAssetFunction() {
        AssetFunctionImpl assetFunction = new AssetFunctionImpl();
        return assetFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPitchAngleIEC createWindContPitchAngleIEC() {
        WindContPitchAngleIECImpl windContPitchAngleIEC = new WindContPitchAngleIECImpl();
        return windContPitchAngleIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineEquivalentCircuit createAsynchronousMachineEquivalentCircuit() {
        AsynchronousMachineEquivalentCircuitImpl asynchronousMachineEquivalentCircuit = new AsynchronousMachineEquivalentCircuitImpl();
        return asynchronousMachineEquivalentCircuit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLim2 createOverexcLim2() {
        OverexcLim2Impl overexcLim2 = new OverexcLim2Impl();
        return overexcLim2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurrentTransformer createCurrentTransformer() {
        CurrentTransformerImpl currentTransformer = new CurrentTransformerImpl();
        return currentTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssPTIST3 createPssPTIST3() {
        PssPTIST3Impl pssPTIST3 = new PssPTIST3Impl();
        return pssPTIST3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR5 createExcAVR5() {
        ExcAVR5Impl excAVR5 = new ExcAVR5Impl();
        return excAVR5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantFreqPcontrolIEC createWindPlantFreqPcontrolIEC() {
        WindPlantFreqPcontrolIECImpl windPlantFreqPcontrolIEC = new WindPlantFreqPcontrolIECImpl();
        return windPlantFreqPcontrolIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LimitSet createLimitSet() {
        LimitSetImpl limitSet = new LimitSetImpl();
        return limitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProtectionEquipment createProtectionEquipment() {
        ProtectionEquipmentImpl protectionEquipment = new ProtectionEquipmentImpl();
        return protectionEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageControlZone createVoltageControlZone() {
        VoltageControlZoneImpl voltageControlZone = new VoltageControlZoneImpl();
        return voltageControlZone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC1A createExcIEEEAC1A() {
        ExcIEEEAC1AImpl excIEEEAC1A = new ExcIEEEAC1AImpl();
        return excIEEEAC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerTabular createPhaseTapChangerTabular() {
        PhaseTapChangerTabularImpl phaseTapChangerTabular = new PhaseTapChangerTabularImpl();
        return phaseTapChangerTabular;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Charge createCharge() {
        ChargeImpl charge = new ChargeImpl();
        return charge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchInfo createSwitchInfo() {
        SwitchInfoImpl switchInfo = new SwitchInfoImpl();
        return switchInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType2IEEEPFController createPFVArType2IEEEPFController() {
        PFVArType2IEEEPFControllerImpl pfvArType2IEEEPFController = new PFVArType2IEEEPFControllerImpl();
        return pfvArType2IEEEPFController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamIEEE1 createGovSteamIEEE1() {
        GovSteamIEEE1Impl govSteamIEEE1 = new GovSteamIEEE1Impl();
        return govSteamIEEE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Equipment createEquipment() {
        EquipmentImpl equipment = new EquipmentImpl();
        return equipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCLine createDCLine() {
        DCLineImpl dcLine = new DCLineImpl();
        return dcLine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlArea createControlArea() {
        ControlAreaImpl controlArea = new ControlAreaImpl();
        return controlArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySchedulingType createEnergySchedulingType() {
        EnergySchedulingTypeImpl energySchedulingType = new EnergySchedulingTypeImpl();
        return energySchedulingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VsPpccControlKind createVsPpccControlKindFromString( EDataType eDataType, String initialValue ) {
        VsPpccControlKind result = VsPpccControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVsPpccControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WireMaterialKind createWireMaterialKindFromString( EDataType eDataType, String initialValue ) {
        WireMaterialKind result = WireMaterialKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWireMaterialKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteUnitType createRemoteUnitTypeFromString( EDataType eDataType, String initialValue ) {
        RemoteUnitType result = RemoteUnitType.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRemoteUnitTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WireInsulationKind createWireInsulationKindFromString( EDataType eDataType, String initialValue ) {
        WireInsulationKind result = WireInsulationKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWireInsulationKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CsOperatingModeKind createCsOperatingModeKindFromString( EDataType eDataType, String initialValue ) {
        CsOperatingModeKind result = CsOperatingModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCsOperatingModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhaseConnectedFaultKind createPhaseConnectedFaultKindFromString( EDataType eDataType, String initialValue ) {
        PhaseConnectedFaultKind result = PhaseConnectedFaultKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPhaseConnectedFaultKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PotentialTransformerKind createPotentialTransformerKindFromString( EDataType eDataType,
            String initialValue ) {
        PotentialTransformerKind result = PotentialTransformerKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPotentialTransformerKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticLoadModelKind createStaticLoadModelKindFromString( EDataType eDataType, String initialValue ) {
        StaticLoadModelKind result = StaticLoadModelKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStaticLoadModelKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomerKind createCustomerKindFromString( EDataType eDataType, String initialValue ) {
        CustomerKind result = CustomerKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCustomerKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineKind createAsynchronousMachineKindFromString( EDataType eDataType, String initialValue ) {
        AsynchronousMachineKind result = AsynchronousMachineKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAsynchronousMachineKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureKind createProcedureKindFromString( EDataType eDataType, String initialValue ) {
        ProcedureKind result = ProcedureKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcedureKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TurbineType createTurbineTypeFromString( EDataType eDataType, String initialValue ) {
        TurbineType result = TurbineType.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTurbineTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RandomisationKind createRandomisationKindFromString( EDataType eDataType, String initialValue ) {
        RandomisationKind result = RandomisationKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRandomisationKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkKind createWorkKindFromString( EDataType eDataType, String initialValue ) {
        WorkKind result = WorkKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWorkKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoolantType createCoolantTypeFromString( EDataType eDataType, String initialValue ) {
        CoolantType result = CoolantType.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCoolantTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoilerControlMode createBoilerControlModeFromString( EDataType eDataType, String initialValue ) {
        BoilerControlMode result = BoilerControlMode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBoilerControlModeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChargeKind createChargeKindFromString( EDataType eDataType, String initialValue ) {
        ChargeKind result = ChargeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertChargeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSignalKind createInputSignalKindFromString( EDataType eDataType, String initialValue ) {
        InputSignalKind result = InputSignalKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInputSignalKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerControlMode createTransformerControlModeFromString( EDataType eDataType, String initialValue ) {
        TransformerControlMode result = TransformerControlMode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransformerControlModeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineKind createSynchronousMachineKindFromString( EDataType eDataType, String initialValue ) {
        SynchronousMachineKind result = SynchronousMachineKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSynchronousMachineKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneratorControlSource createGeneratorControlSourceFromString( EDataType eDataType, String initialValue ) {
        GeneratorControlSource result = GeneratorControlSource.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGeneratorControlSourceToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VehicleUsageKind createVehicleUsageKindFromString( EDataType eDataType, String initialValue ) {
        VehicleUsageKind result = VehicleUsageKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVehicleUsageKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkTimeScheduleKind createWorkTimeScheduleKindFromString( EDataType eDataType, String initialValue ) {
        WorkTimeScheduleKind result = WorkTimeScheduleKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWorkTimeScheduleKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DCPolarityKind createDCPolarityKindFromString( EDataType eDataType, String initialValue ) {
        DCPolarityKind result = DCPolarityKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDCPolarityKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComTechnologyKind createComTechnologyKindFromString( EDataType eDataType, String initialValue ) {
        ComTechnologyKind result = ComTechnologyKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertComTechnologyKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineModelKind createSynchronousMachineModelKindFromString( EDataType eDataType,
            String initialValue ) {
        SynchronousMachineModelKind result = SynchronousMachineModelKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSynchronousMachineModelKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransmissionModeKind createTransmissionModeKindFromString( EDataType eDataType, String initialValue ) {
        TransmissionModeKind result = TransmissionModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransmissionModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Validity createValidityFromString( EDataType eDataType, String initialValue ) {
        Validity result = Validity.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValidityToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlAreaTypeKind createControlAreaTypeKindFromString( EDataType eDataType, String initialValue ) {
        ControlAreaTypeKind result = ControlAreaTypeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertControlAreaTypeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitMultiplier createUnitMultiplierFromString( EDataType eDataType, String initialValue ) {
        UnitMultiplier result = UnitMultiplier.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnitMultiplierToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteSignalKind createRemoteSignalKindFromString( EDataType eDataType, String initialValue ) {
        RemoteSignalKind result = RemoteSignalKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRemoteSignalKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CsPpccControlKind createCsPpccControlKindFromString( EDataType eDataType, String initialValue ) {
        CsPpccControlKind result = CsPpccControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCsPpccControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SVCControlMode createSVCControlModeFromString( EDataType eDataType, String initialValue ) {
        SVCControlMode result = SVCControlMode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSVCControlModeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContingencyEquipmentStatusKind createContingencyEquipmentStatusKindFromString( EDataType eDataType,
            String initialValue ) {
        ContingencyEquipmentStatusKind result = ContingencyEquipmentStatusKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertContingencyEquipmentStatusKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Currency createCurrencyFromString( EDataType eDataType, String initialValue ) {
        Currency result = Currency.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCurrencyToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitSymbol createUnitSymbolFromString( EDataType eDataType, String initialValue ) {
        UnitSymbol result = UnitSymbol.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnitSymbolToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FuelType createFuelTypeFromString( EDataType eDataType, String initialValue ) {
        FuelType result = FuelType.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFuelTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CableConstructionKind createCableConstructionKindFromString( EDataType eDataType, String initialValue ) {
        CableConstructionKind result = CableConstructionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCableConstructionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TroubleReportingKind createTroubleReportingKindFromString( EDataType eDataType, String initialValue ) {
        TroubleReportingKind result = TroubleReportingKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTroubleReportingKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindLVRTQcontrolModesKind createWindLVRTQcontrolModesKindFromString( EDataType eDataType,
            String initialValue ) {
        WindLVRTQcontrolModesKind result = WindLVRTQcontrolModesKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindLVRTQcontrolModesKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceKind createServiceKindFromString( EDataType eDataType, String initialValue ) {
        ServiceKind result = ServiceKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CableShieldMaterialKind createCableShieldMaterialKindFromString( EDataType eDataType, String initialValue ) {
        CableShieldMaterialKind result = CableShieldMaterialKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCableShieldMaterialKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SupplierKind createSupplierKindFromString( EDataType eDataType, String initialValue ) {
        SupplierKind result = SupplierKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSupplierKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindQcontrolModesKind createWindQcontrolModesKindFromString( EDataType eDataType, String initialValue ) {
        WindQcontrolModesKind result = WindQcontrolModesKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindQcontrolModesKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TempEquipActionKind createTempEquipActionKindFromString( EDataType eDataType, String initialValue ) {
        TempEquipActionKind result = TempEquipActionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTempEquipActionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrientationKind createOrientationKindFromString( EDataType eDataType, String initialValue ) {
        OrientationKind result = OrientationKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOrientationKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChequeKind createChequeKindFromString( EDataType eDataType, String initialValue ) {
        ChequeKind result = ChequeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertChequeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Source createSourceFromString( EDataType eDataType, String initialValue ) {
        Source result = Source.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSourceToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroPlantStorageKind createHydroPlantStorageKindFromString( EDataType eDataType, String initialValue ) {
        HydroPlantStorageKind result = HydroPlantStorageKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHydroPlantStorageKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransactionKind createTransactionKindFromString( EDataType eDataType, String initialValue ) {
        TransactionKind result = TransactionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransactionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusbarConfiguration createBusbarConfigurationFromString( EDataType eDataType, String initialValue ) {
        BusbarConfiguration result = BusbarConfiguration.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBusbarConfigurationToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkTaskKind createWorkTaskKindFromString( EDataType eDataType, String initialValue ) {
        WorkTaskKind result = WorkTaskKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWorkTaskKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PetersenCoilModeKind createPetersenCoilModeKindFromString( EDataType eDataType, String initialValue ) {
        PetersenCoilModeKind result = PetersenCoilModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPetersenCoilModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FrancisGovernorControlKind createFrancisGovernorControlKindFromString( EDataType eDataType,
            String initialValue ) {
        FrancisGovernorControlKind result = FrancisGovernorControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFrancisGovernorControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VsQpccControlKind createVsQpccControlKindFromString( EDataType eDataType, String initialValue ) {
        VsQpccControlKind result = VsQpccControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVsQpccControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmissionValueSource createEmissionValueSourceFromString( EDataType eDataType, String initialValue ) {
        EmissionValueSource result = EmissionValueSource.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEmissionValueSourceToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndDeviceFunctionKind createEndDeviceFunctionKindFromString( EDataType eDataType, String initialValue ) {
        EndDeviceFunctionKind result = EndDeviceFunctionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEndDeviceFunctionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CableOuterJacketKind createCableOuterJacketKindFromString( EDataType eDataType, String initialValue ) {
        CableOuterJacketKind result = CableOuterJacketKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCableOuterJacketKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RotorKind createRotorKindFromString( EDataType eDataType, String initialValue ) {
        RotorKind result = RotorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRotorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcREXSFeedbackSignalKind createExcREXSFeedbackSignalKindFromString( EDataType eDataType,
            String initialValue ) {
        ExcREXSFeedbackSignalKind result = ExcREXSFeedbackSignalKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcREXSFeedbackSignalKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TagActionKind createTagActionKindFromString( EDataType eDataType, String initialValue ) {
        TagActionKind result = TagActionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTagActionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationTriggerKind createNotificationTriggerKindFromString( EDataType eDataType, String initialValue ) {
        NotificationTriggerKind result = NotificationTriggerKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNotificationTriggerKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DCConverterOperatingModeKind createDCConverterOperatingModeKindFromString( EDataType eDataType,
            String initialValue ) {
        DCConverterOperatingModeKind result = DCConverterOperatingModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDCConverterOperatingModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEST1AUELselectorKind createExcIEEEST1AUELselectorKindFromString( EDataType eDataType,
            String initialValue ) {
        ExcIEEEST1AUELselectorKind result = ExcIEEEST1AUELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcIEEEST1AUELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST7BUELselectorKind createExcST7BUELselectorKindFromString( EDataType eDataType, String initialValue ) {
        ExcST7BUELselectorKind result = ExcST7BUELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcST7BUELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsagePointConnectedKind createUsagePointConnectedKindFromString( EDataType eDataType, String initialValue ) {
        UsagePointConnectedKind result = UsagePointConnectedKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUsagePointConnectedKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhaseCode createPhaseCodeFromString( EDataType eDataType, String initialValue ) {
        PhaseCode result = PhaseCode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPhaseCodeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SealConditionKind createSealConditionKindFromString( EDataType eDataType, String initialValue ) {
        SealConditionKind result = SealConditionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSealConditionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhaseShuntConnectionKind createPhaseShuntConnectionKindFromString( EDataType eDataType,
            String initialValue ) {
        PhaseShuntConnectionKind result = PhaseShuntConnectionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPhaseShuntConnectionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenUnitKind createWindGenUnitKindFromString( EDataType eDataType, String initialValue ) {
        WindGenUnitKind result = WindGenUnitKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindGenUnitKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SinglePhaseKind createSinglePhaseKindFromString( EDataType eDataType, String initialValue ) {
        SinglePhaseKind result = SinglePhaseKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSinglePhaseKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericNonLinearLoadModelKind createGenericNonLinearLoadModelKindFromString( EDataType eDataType,
            String initialValue ) {
        GenericNonLinearLoadModelKind result = GenericNonLinearLoadModelKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGenericNonLinearLoadModelKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeterMultiplierKind createMeterMultiplierKindFromString( EDataType eDataType, String initialValue ) {
        MeterMultiplierKind result = MeterMultiplierKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMeterMultiplierKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PSREventKind createPSREventKindFromString( EDataType eDataType, String initialValue ) {
        PSREventKind result = PSREventKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPSREventKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BreakerConfiguration createBreakerConfigurationFromString( EDataType eDataType, String initialValue ) {
        BreakerConfiguration result = BreakerConfiguration.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBreakerConfigurationToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssetModelUsageKind createAssetModelUsageKindFromString( EDataType eDataType, String initialValue ) {
        AssetModelUsageKind result = AssetModelUsageKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssetModelUsageKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegulatingControlModeKind createRegulatingControlModeKindFromString( EDataType eDataType,
            String initialValue ) {
        RegulatingControlModeKind result = RegulatingControlModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRegulatingControlModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SealKind createSealKindFromString( EDataType eDataType, String initialValue ) {
        SealKind result = SealKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSealKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClearanceActionKind createClearanceActionKindFromString( EDataType eDataType, String initialValue ) {
        ClearanceActionKind result = ClearanceActionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertClearanceActionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineOperatingMode createSynchronousMachineOperatingModeFromString( EDataType eDataType,
            String initialValue ) {
        SynchronousMachineOperatingMode result = SynchronousMachineOperatingMode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSynchronousMachineOperatingModeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindLookupTableFunctionKind createWindLookupTableFunctionKindFromString( EDataType eDataType,
            String initialValue ) {
        WindLookupTableFunctionKind result = WindLookupTableFunctionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindLookupTableFunctionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroEnergyConversionKind createHydroEnergyConversionKindFromString( EDataType eDataType,
            String initialValue ) {
        HydroEnergyConversionKind result = HydroEnergyConversionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHydroEnergyConversionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RevenueKind createRevenueKindFromString( EDataType eDataType, String initialValue ) {
        RevenueKind result = RevenueKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRevenueKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST7BOELselectorKind createExcST7BOELselectorKindFromString( EDataType eDataType, String initialValue ) {
        ExcST7BOELselectorKind result = ExcST7BOELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcST7BOELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WireUsageKind createWireUsageKindFromString( EDataType eDataType, String initialValue ) {
        WireUsageKind result = WireUsageKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWireUsageKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DroopSignalFeedbackKind createDroopSignalFeedbackKindFromString( EDataType eDataType, String initialValue ) {
        DroopSignalFeedbackKind result = DroopSignalFeedbackKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDroopSignalFeedbackKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadingReasonKind createReadingReasonKindFromString( EDataType eDataType, String initialValue ) {
        ReadingReasonKind result = ReadingReasonKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReadingReasonKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkStatusKind createWorkStatusKindFromString( EDataType eDataType, String initialValue ) {
        WorkStatusKind result = WorkStatusKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWorkStatusKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmissionType createEmissionTypeFromString( EDataType eDataType, String initialValue ) {
        EmissionType result = EmissionType.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEmissionTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShortCircuitRotorKind createShortCircuitRotorKindFromString( EDataType eDataType, String initialValue ) {
        ShortCircuitRotorKind result = ShortCircuitRotorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertShortCircuitRotorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IfdBaseKind createIfdBaseKindFromString( EDataType eDataType, String initialValue ) {
        IfdBaseKind result = IfdBaseKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIfdBaseKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorporateStandardKind createCorporateStandardKindFromString( EDataType eDataType, String initialValue ) {
        CorporateStandardKind result = CorporateStandardKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCorporateStandardKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CurveStyle createCurveStyleFromString( EDataType eDataType, String initialValue ) {
        CurveStyle result = CurveStyle.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCurveStyleToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceMultiplierKind createServiceMultiplierKindFromString( EDataType eDataType, String initialValue ) {
        ServiceMultiplierKind result = ServiceMultiplierKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceMultiplierKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComDirectionKind createComDirectionKindFromString( EDataType eDataType, String initialValue ) {
        ComDirectionKind result = ComDirectionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertComDirectionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationalLimitDirectionKind createOperationalLimitDirectionKindFromString( EDataType eDataType,
            String initialValue ) {
        OperationalLimitDirectionKind result = OperationalLimitDirectionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOperationalLimitDirectionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TenderKind createTenderKindFromString( EDataType eDataType, String initialValue ) {
        TenderKind result = TenderKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTenderKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AmiBillingReadyKind createAmiBillingReadyKindFromString( EDataType eDataType, String initialValue ) {
        AmiBillingReadyKind result = AmiBillingReadyKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAmiBillingReadyKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneratorControlMode createGeneratorControlModeFromString( EDataType eDataType, String initialValue ) {
        GeneratorControlMode result = GeneratorControlMode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGeneratorControlModeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchActionKind createSwitchActionKindFromString( EDataType eDataType, String initialValue ) {
        SwitchActionKind result = SwitchActionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSwitchActionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST6BOELselectorKind createExcST6BOELselectorKindFromString( EDataType eDataType, String initialValue ) {
        ExcST6BOELselectorKind result = ExcST6BOELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcST6BOELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindingConnection createWindingConnectionFromString( EDataType eDataType, String initialValue ) {
        WindingConnection result = WindingConnection.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindingConnectionToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LimitTypeKind createLimitTypeKindFromString( EDataType eDataType, String initialValue ) {
        LimitTypeKind result = LimitTypeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLimitTypeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CimPackage getCimPackage() {
        return ( CimPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CimPackage getPackage() {
        return CimPackage.eINSTANCE;
    }

} //CimFactoryImpl
