package com.solidprinciples.bankapp;

public class DepositTransaction implements TransactionInterface {
    int balance;
    DebitCard bankCard;
    public DepositTransaction(int depositAmount, int balance, DebitCard bankCard) {
        this.balance = balance + depositAmount;
        this.bankCard = bankCard;

    }
    public void postTransaction() {
        this.bankCard.doDeposit();
        TransactionNotification transactionNotification = new TransactionNotification();
        transactionNotification.successMessage();
        // Printer Services
        PrinterService printerService = new PrinterService();
        // Print Passbook
        printerService.printPassbook(this.balance);
    }
}
