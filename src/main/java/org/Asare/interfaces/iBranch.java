package org.Asare.interfaces;

import org.Asare.classes.Customer;

import java.util.ArrayList;

public interface iBranch {
    String name();
    ArrayList <Customer> customers();
    String getName();
    Customer getCustomers();
    Boolean newCustomer(String customerName, double initialTransaction);
    Boolean addCustomerTransaction(String customerName, double transaction);



}
