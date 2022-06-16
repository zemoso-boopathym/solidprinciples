package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class PrinterService {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public void printPassbook(int balance) {
        LOGGER.info("Updating passbook. Current Balance: " + balance);
    }
}
