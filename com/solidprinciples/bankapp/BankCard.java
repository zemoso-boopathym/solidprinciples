package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class BankCard {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public void doWithdrawal() {
        LOGGER.info("Transaction done with Bank Card");
    }
}
