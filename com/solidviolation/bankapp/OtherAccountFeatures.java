package com.solidviolation.bankapp;

public class OtherAccountFeatures {
    // Violation 1 - Single Responsibility Principle
    static void printPassbook(int balance) {
        System.out.println("Updating passbook. Current Balance: " + balance);
    }
    void getLoanInterestInfo(String loanType) {
        if (loanType.equals("home")) {
            System.out.println("homeLoan");
        }
        if (loanType.equals("personal")) {
            System.out.println("personalLoan");
        }
        if (loanType.equals("car")) {
            System.out.println("carLoan");
        }
    }

    static void sendNotification() {
        // Violation 2 - Open for Extension, closed for Modification
        // Irrespective of the medium all notifications are being sent
        System.out.println("Sending Transaction details to registered email address!");
        System.out.println("Sending Transaction details to registered whatsapp account!");
        System.out.println("Sending Transaction details to registered mobile number!");
    }
}
