package com.solidprinciples.bankapp;
import java.util.logging.Logger;

public class LoanService {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("home")) {
            LOGGER.info("homeLoan");
        }
        if (loanType.equals("personal")) {
            LOGGER.info("personalLoan");
        }
        if (loanType.equals("car")) {
            LOGGER.info("carLoan");
        }
    }
}
