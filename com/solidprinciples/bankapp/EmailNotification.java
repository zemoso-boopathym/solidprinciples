package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class EmailNotification implements NotificationService {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public void sendOTP(String medium) {
        // API Logic to send email notification
        LOGGER.info("Sending OTP to registered email address");
    }
    public void sendTransactionNotification(String medium) {
        // API Logic to send email notification
        LOGGER.info("Sending " + medium + " Transaction details to registered email address!");
    }
}
