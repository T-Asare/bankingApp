package org.Asare.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
 private Branch branch;
    @Before
    public void setUp() throws Exception {
        branch= new Branch("WeepingWillow");
        branch.newCustomer("Martin",123);
        branch.newCustomer("Felix", 521);
        branch.addCustomerTransaction("Felix", 200);
    }

    @Test
    public void name() {
        assertEquals("WeepingWillow",branch.getName());
    }

    @Test
    public void customers() {
        assertEquals("Felix",branch.getCustomers().get(1).getName());
    }

    @Test
    public void getName() {
        assertEquals("WeepingWillow",branch.getName());
    }

    @Test
    public void getCustomers() {
        assertEquals("Martin",branch.getCustomers().get(0).getName());
    }

    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Jemima",59));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(branch.addCustomerTransaction("Martin",8540.00));
        assertFalse(branch.addCustomerTransaction("Vivian",8540.00));
    }
}