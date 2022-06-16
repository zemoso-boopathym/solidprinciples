package com.solidviolation.bankapp;

// Violation 4 - Interface segregation
// ==> interface premiumAccountInfo is not applicable for Normal user
public class AccountFeatures implements UserInterface {
    // Violation 1 - Single responsibility principle
    int balance;
    public void deposit (int amount) {
        this.balance += amount;
    }

    public void initialDeposit (int amount) {
        this.balance += amount;
    }

    public void withdrawal (int amount) {
        this.balance -= amount;
    }

}
