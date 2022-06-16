package com.solidprinciples.bankapp;

public class TransactionNotification {
    public void successMessage() {
        // Notification Services
        EmailNotification emailnotification = new EmailNotification();
        MobileNotification mobileNotification = new MobileNotification();
        WhatsappNotification whatsappNotification = new WhatsappNotification();

        emailnotification.sendTransactionNotification("email");
        mobileNotification.sendTransactionNotification("mobile");
        whatsappNotification.sendTransactionNotification("whatsapp");
    }
}
