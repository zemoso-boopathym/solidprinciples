package com.solidviolation.bankapp;

public interface AccountInterface {
    void printPassbook(int balance);
    void getLoanInterestInfo(String loanType);
    void sendNotification();
}
