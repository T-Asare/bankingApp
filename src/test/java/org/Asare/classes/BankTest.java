package org.Asare.classes;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;
    @org.junit.Before
    public void setUp() throws Exception {
    bank = new Bank("Bank1");
    bank.addBranch("Kasoa");
    bank.addCustomer("Kasoa","Tano Twum",456);
    }

    @org.junit.Test
    public void addBranch() {
        assertTrue(bank.addBranch("Bantama"));
        assertFalse(bank.addBranch("Kasoa"));
    }


    @org.junit.Test
    public void addCustomer() {
        assertFalse(bank.addCustomer("Kasoa","Tano Twum",456));
        assertTrue(bank.addCustomer("Kasoa","Harvey", 203));
    }

    @org.junit.Test
    public void addCustomerTransaction() {
        assertTrue(bank.addCustomerTransaction("Kasoa","Tano Twum", 596));
        assertFalse(bank.addCustomerTransaction("Georgetown","Harvey", 26));
    }
}