package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class DebitCard extends BankCard {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    public void doDeposit() {
        LOGGER.info("Transaction done with Debit Card");
    }

    @Override
    public void doWithdrawal() {
        LOGGER.info("Transaction done with Debit Card");
    }
}
