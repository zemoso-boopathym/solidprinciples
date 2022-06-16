package com.solidviolation.bankapp;

// Violation 3 - Interface Segregation principle
public interface UserInterface {
    void deposit(int amount);
    void initialDeposit(int amount);
    void withdrawal(int amount);
}
