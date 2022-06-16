package com.solidviolation.bankapp;

//Violation 3 - Liskov Substitution principle
public class CreditCard extends BankCard {
    @Override
    public void doWithdrawal() {
            System.out.println("Transaction done with debit card!");
        }

    @Override
    public void doDeposit() {
            throw new UnsupportedOperationException("Deposits are not supported by UPI!!");
        }
}
