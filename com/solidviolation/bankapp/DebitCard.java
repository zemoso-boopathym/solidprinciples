package com.solidviolation.bankapp;

// Violation 5 - Dependency Inversion principle
// Currently, Irrespective of the card or upi transaction our accountService is tightly coupled with DebitCard
public class DebitCard extends BankCard {
    public void doWithdrawal() {
        System.out.println("Transaction done with debit card!");
    }
    public void doDeposit() {
        System.out.println("Amount successfully credited to account!");
    }

}
