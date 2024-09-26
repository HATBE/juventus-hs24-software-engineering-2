package ch.hatbe.juventus.logging;

import ch.hatbe.juventus.javadoc.MathUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {

    Bank bank;

    @BeforeEach
    public void setUp() {
        this.bank  = new Bank();

    }

    @Test
    void withdraw() {
        this.bank.deposit(100);

        this.bank.withdraw(40);
        assertEquals(bank.retriveBalance(), 60);

        this.bank.withdraw(20);
        assertEquals(bank.retriveBalance(), 40);

        this.bank.withdraw(40);
        assertEquals(bank.retriveBalance(), 0);
    }

    @Test
    void deposit() {
        this.bank.deposit(100);
        assertEquals(bank.retriveBalance(), 100);

        this.bank.deposit(200);
        assertEquals(bank.retriveBalance(), 300);

        this.bank.deposit(888);
        assertEquals(bank.retriveBalance(), 1188);
    }

    @Test
    void retriveBalance() {
        this.bank.deposit(100);
        assertEquals(bank.retriveBalance(), 100);


        this.bank.deposit(99);
        assertEquals(bank.retriveBalance(), 199);
    }
}