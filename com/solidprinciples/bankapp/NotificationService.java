package com.solidprinciples.bankapp;

public interface NotificationService {
     void sendOTP(String medium);
     void sendTransactionNotification(String medium);
}
