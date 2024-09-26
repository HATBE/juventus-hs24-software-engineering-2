package ch.hatbe.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {
    private static final Logger logger = LoggerFactory.getLogger(Bank.class);

    private double balance;

    public void withdraw(double amount) {
        logger.debug("withdrawn {}", amount);
        this.balance -= amount;
    }

    public void deposit(double amount) {
        logger.debug("deposited {}", amount);
        this.balance += amount;
    }

    public double retriveBalance() {
        logger.debug("balance {}", this.balance);
        return this.balance;
    }
}
