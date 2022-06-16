package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class PremiumUserAccount extends UserAccount {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    public PremiumUserAccount(String username, int deposit) {
        super(username, deposit);
    }

    public void premiumAccountInfo() {
        LOGGER.info("Premium User has access to locker, credit card and instant loan!");
    }
}
