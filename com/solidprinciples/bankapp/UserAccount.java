package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class UserAccount implements UserInterface {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String username;
    int balance;
    public UserAccount (String username, int deposit) {
        this.username = username;
        this.balance = deposit;
    }
    public void successMsg() {
        LOGGER.info("Account created successfully!");
    }
}
