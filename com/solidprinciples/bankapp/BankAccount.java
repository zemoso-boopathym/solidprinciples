package com.solidprinciples.bankapp;
import java.util.Scanner;
import java.util.logging.Logger;

public class BankAccount {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        // Create user account
        Scanner myObj = new Scanner(System.in);
        LOGGER.info("Enter user full name: ");
        String userName = myObj.nextLine();
        int balance;
        LOGGER.info("Enter initial deposit amount: ");
        int initialDeposit = myObj.nextInt();
        if (initialDeposit > 1000) {
            PremiumUserAccount premiumUserAccount = new PremiumUserAccount(userName, initialDeposit);
            premiumUserAccount.successMsg();
            premiumUserAccount.premiumAccountInfo();
            balance = premiumUserAccount.balance;
        } else {
            UserAccount userAccount = new UserAccount(userName, initialDeposit);
            userAccount.successMsg();
            balance = userAccount.balance;
        }

        BankCard bankCard = new CreditCard();
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(3000, balance, bankCard);
        withdrawal.sendOTPTransaction("mobile");
        withdrawal.postTransaction();
        balance = withdrawal.balance;

        BankCard bankCard1 = new DebitCard();
        WithdrawalTransaction withdrawal1 = new WithdrawalTransaction(1700, balance, bankCard1);
        withdrawal1.sendOTPTransaction("mobile");
        withdrawal1.postTransaction();
        balance = withdrawal.balance;

        // Amount Transactions
        DebitCard debitCard = new DebitCard();
        DepositTransaction deposit = new DepositTransaction(5000, balance, debitCard);
        deposit.postTransaction();

        // Loan Services
        LoanService loanService = new LoanService();
        loanService.getLoanInterestInfo("home");
    }
}
