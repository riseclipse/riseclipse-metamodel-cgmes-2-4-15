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

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Customer;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.CustomerAccountImpl#getBillingCycle <em>Billing Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.CustomerAccountImpl#getBudgetBill <em>Budget Bill</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.CustomerAccountImpl#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.CustomerAccountImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.impl.CustomerAccountImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerAccountImpl extends DocumentImpl implements CustomerAccount {
    /**
     * The default value of the '{@link #getBillingCycle() <em>Billing Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBillingCycle()
     * @generated
     * @ordered
     */
    protected static final String BILLING_CYCLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBillingCycle() <em>Billing Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBillingCycle()
     * @generated
     * @ordered
     */
    protected String billingCycle = BILLING_CYCLE_EDEFAULT;

    /**
     * This is true if the Billing Cycle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean billingCycleESet;

    /**
     * The default value of the '{@link #getBudgetBill() <em>Budget Bill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBudgetBill()
     * @generated
     * @ordered
     */
    protected static final String BUDGET_BILL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBudgetBill() <em>Budget Bill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBudgetBill()
     * @generated
     * @ordered
     */
    protected String budgetBill = BUDGET_BILL_EDEFAULT;

    /**
     * This is true if the Budget Bill attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean budgetBillESet;

    /**
     * The cached value of the '{@link #getPaymentTransactions() <em>Payment Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPaymentTransactions()
     * @generated
     * @ordered
     */
    protected EList< Transaction > paymentTransactions;

    /**
     * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreements()
     * @generated
     * @ordered
     */
    protected EList< CustomerAgreement > customerAgreements;

    /**
     * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomer()
     * @generated
     * @ordered
     */
    protected Customer customer;

    /**
     * This is true if the Customer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomerAccountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCustomerAccount();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBillingCycle() {
        return billingCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBillingCycle( String newBillingCycle ) {
        String oldBillingCycle = billingCycle;
        billingCycle = newBillingCycle;
        boolean oldBillingCycleESet = billingCycleESet;
        billingCycleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_ACCOUNT__BILLING_CYCLE, oldBillingCycle, billingCycle, !oldBillingCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBillingCycle() {
        String oldBillingCycle = billingCycle;
        boolean oldBillingCycleESet = billingCycleESet;
        billingCycle = BILLING_CYCLE_EDEFAULT;
        billingCycleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CUSTOMER_ACCOUNT__BILLING_CYCLE,
                    oldBillingCycle, BILLING_CYCLE_EDEFAULT, oldBillingCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBillingCycle() {
        return billingCycleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBudgetBill() {
        return budgetBill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBudgetBill( String newBudgetBill ) {
        String oldBudgetBill = budgetBill;
        budgetBill = newBudgetBill;
        boolean oldBudgetBillESet = budgetBillESet;
        budgetBillESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_ACCOUNT__BUDGET_BILL, oldBudgetBill, budgetBill, !oldBudgetBillESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBudgetBill() {
        String oldBudgetBill = budgetBill;
        boolean oldBudgetBillESet = budgetBillESet;
        budgetBill = BUDGET_BILL_EDEFAULT;
        budgetBillESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER_ACCOUNT__BUDGET_BILL, oldBudgetBill, BUDGET_BILL_EDEFAULT, oldBudgetBillESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBudgetBill() {
        return budgetBillESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Customer getCustomer() {
        return customer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomer( Customer newCustomer, NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = newCustomer;
        boolean oldCustomerESet = customerESet;
        customerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER, oldCustomer, newCustomer, !oldCustomerESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomer( Customer newCustomer ) {
        if( newCustomer != customer ) {
            NotificationChain msgs = null;
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS, Customer.class, msgs );
            if( newCustomer != null ) msgs = ( ( InternalEObject ) newCustomer ).eInverseAdd( this,
                    CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS, Customer.class, msgs );
            msgs = basicSetCustomer( newCustomer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER, newCustomer, newCustomer, !oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomer( NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = null;
        boolean oldCustomerESet = customerESet;
        customerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER, oldCustomer, null, oldCustomerESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomer() {
        if( customer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customer ).eInverseRemove( this, CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS,
                    Customer.class, msgs );
            msgs = basicUnsetCustomer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER, null, null, oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomer() {
        return customerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Transaction > getPaymentTransactions() {
        if( paymentTransactions == null ) {
            paymentTransactions = new EObjectWithInverseResolvingEList.Unsettable< Transaction >( Transaction.class,
                    this, CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CimPackage.TRANSACTION__CUSTOMER_ACCOUNT );
        }
        return paymentTransactions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPaymentTransactions() {
        if( paymentTransactions != null ) ( ( InternalEList.Unsettable< ? > ) paymentTransactions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPaymentTransactions() {
        return paymentTransactions != null && ( ( InternalEList.Unsettable< ? > ) paymentTransactions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerAgreement > getCustomerAgreements() {
        if( customerAgreements == null ) {
            customerAgreements = new EObjectWithInverseResolvingEList.Unsettable< CustomerAgreement >(
                    CustomerAgreement.class, this, CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT );
        }
        return customerAgreements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAgreements() {
        if( customerAgreements != null ) ( ( InternalEList.Unsettable< ? > ) customerAgreements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreements() {
        return customerAgreements != null && ( ( InternalEList.Unsettable< ? > ) customerAgreements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPaymentTransactions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerAgreements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER:
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__CUSTOMER_ACCOUNTS, Customer.class, msgs );
            return basicSetCustomer( ( Customer ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
            return ( ( InternalEList< ? > ) getPaymentTransactions() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< ? > ) getCustomerAgreements() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER:
            return basicUnsetCustomer( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CUSTOMER_ACCOUNT__BILLING_CYCLE:
            return getBillingCycle();
        case CimPackage.CUSTOMER_ACCOUNT__BUDGET_BILL:
            return getBudgetBill();
        case CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
            return getPaymentTransactions();
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
            return getCustomerAgreements();
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER:
            return getCustomer();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.CUSTOMER_ACCOUNT__BILLING_CYCLE:
            setBillingCycle( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER_ACCOUNT__BUDGET_BILL:
            setBudgetBill( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
            getPaymentTransactions().clear();
            getPaymentTransactions().addAll( ( Collection< ? extends Transaction > ) newValue );
            return;
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
            getCustomerAgreements().clear();
            getCustomerAgreements().addAll( ( Collection< ? extends CustomerAgreement > ) newValue );
            return;
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER:
            setCustomer( ( Customer ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.CUSTOMER_ACCOUNT__BILLING_CYCLE:
            unsetBillingCycle();
            return;
        case CimPackage.CUSTOMER_ACCOUNT__BUDGET_BILL:
            unsetBudgetBill();
            return;
        case CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
            unsetPaymentTransactions();
            return;
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
            unsetCustomerAgreements();
            return;
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER:
            unsetCustomer();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.CUSTOMER_ACCOUNT__BILLING_CYCLE:
            return isSetBillingCycle();
        case CimPackage.CUSTOMER_ACCOUNT__BUDGET_BILL:
            return isSetBudgetBill();
        case CimPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
            return isSetPaymentTransactions();
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
            return isSetCustomerAgreements();
        case CimPackage.CUSTOMER_ACCOUNT__CUSTOMER:
            return isSetCustomer();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (billingCycle: " );
        if( billingCycleESet )
            result.append( billingCycle );
        else
            result.append( "<unset>" );
        result.append( ", budgetBill: " );
        if( budgetBillESet )
            result.append( budgetBill );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CustomerAccountImpl
