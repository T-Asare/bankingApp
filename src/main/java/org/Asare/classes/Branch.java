package org.Asare.classes;
import org.Asare.interfaces.iBranch;

import java.util.ArrayList;

public class Branch implements iBranch {
    private String name;
    private ArrayList<Customer> customers;
    Branch(String name){
        this.name = name;
        this.customers=new ArrayList<>();
    }


    @Override
    public String name() {
        return null;
    }

    @Override
    public ArrayList<Customer> customers() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    @Override
    public Boolean newCustomer(String customerName, double initialTransaction) {
        if((findCustomer(customerName)==null) &&!(customerName==" ") && !(initialTransaction<0)){ // search using findCustomer method to look for customer name in existing arraylist, then check if the name is not an empty string and positive value for initial transaction
            Customer customer = new Customer(customerName,initialTransaction);
            this.customers.add(customer);
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public Boolean addCustomerTransaction(String customerName, double transaction) {
        if (findCustomer(customerName)!=null){
            Customer customer = findCustomer(customerName);
            customer.addTransactions(transaction);
            return true;
        }
        else return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer: this.customers){ //loop through customer arraylist
            if (customer.getName().equalsIgnoreCase(customerName)) {//check if customer name exists already
                return customer; // returns the customer as an object if the value is found in arraylist
            }
        }

        return null;
    }
}
