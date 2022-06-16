package com.solidviolation.bankapp;

import java.util.Scanner;

public class AccountService {
    int balance = 0;

    public void updateBalance(int balance) {
        this.balance = balance;
    }

    public void bankAccountServices() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter user full name: ");
        String userName = myObj.nextLine();
        System.out.println("Account " + userName + " created successfully!");
        System.out.println("Enter initial deposit amount: ");
        int initialDeposit = myObj.nextInt();

        AccountFeatures accountFeatures = new AccountFeatures();
        accountFeatures.initialDeposit(initialDeposit);

        // Additional Account Features
        OtherAccountFeatures otherAccountFeatures = new OtherAccountFeatures();

        accountFeatures.deposit(5000);
        OtherAccountFeatures.sendNotification();
        updateBalance(accountFeatures.balance);
        OtherAccountFeatures.printPassbook(balance);

        accountFeatures.withdrawal(3000);
        // Violation 5 - Dependency Inversion principle
        // Check DebitCard class
        DebitCard debitCard = new DebitCard();
        debitCard.doWithdrawal();

        OtherAccountFeatures.sendNotification();
        updateBalance(accountFeatures.balance);
        OtherAccountFeatures.printPassbook(balance);

        debitCard.doDeposit();
        OtherAccountFeatures.sendNotification();
        updateBalance(accountFeatures.balance);
        OtherAccountFeatures.printPassbook(balance);

        otherAccountFeatures.getLoanInterestInfo("home");
        otherAccountFeatures.getLoanInterestInfo("car");

        CreditCard creditCard = new CreditCard();
        creditCard.doDeposit();
    }
}
