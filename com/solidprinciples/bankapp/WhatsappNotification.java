package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class WhatsappNotification implements NotificationService {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public void sendOTP(String medium) {
        // API Logic to send whatsapp notification
        LOGGER.info("Sending OTP to registered whatsapp account!");
    }
    public void sendTransactionNotification(String medium) {
        // API Logic to send whatsapp notification
        LOGGER.info("Sending " + medium + " Transaction details to registered whatsapp account!");
    }
}
