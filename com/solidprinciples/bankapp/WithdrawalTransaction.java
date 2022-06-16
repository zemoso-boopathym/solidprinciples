package com.solidprinciples.bankapp;

public class WithdrawalTransaction implements TransactionInterface, WithdrawalTransactionInterface {
    int balance;
    int withdrawAmount;
    private final BankCard bankCard;
    public WithdrawalTransaction(int withdrawAmount, int balance, BankCard bankCard) {
        this.balance = balance;
        this.bankCard = bankCard;
        this.withdrawAmount = withdrawAmount;
        if (this.balance < withdrawAmount) {
            throw new ArithmeticException("Not enough balance to withdraw!");
        } else {
            this.balance -= withdrawAmount;
        }
    }
    public void postTransaction() {
        TransactionNotification transactionNotification = new TransactionNotification();
        transactionNotification.successMessage();
        this.bankCard.doWithdrawal();
        // Printer Services
        PrinterService printerService = new PrinterService();
        // Print Passbook
        printerService.printPassbook(this.balance);
    }

    public void sendOTPTransaction(String medium) {
        MobileNotification mobileNotification = new MobileNotification();
        mobileNotification.sendOTP("mobile");
    }
}
