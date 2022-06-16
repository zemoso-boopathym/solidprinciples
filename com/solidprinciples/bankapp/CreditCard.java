package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class CreditCard extends BankCard {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    @Override
    public void doWithdrawal() {
        LOGGER.info("Transaction done with Credit Card");
    }
}
