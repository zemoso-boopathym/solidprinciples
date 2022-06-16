package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class MobileNotification implements NotificationService {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public void sendOTP(String medium) {
        // API Logic to send Mobile notification
        LOGGER.info("Sending OTP to registered mobile number!");
    }
    public void sendTransactionNotification(String medium) {
        // API Logic to send Mobile notification
        LOGGER.info("Sending " + medium + " Transaction details to registered mobile number!");
    }
}
