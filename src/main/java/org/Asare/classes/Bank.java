package org.Asare.classes;
import org.Asare.interfaces.iBank;

import java.util.ArrayList;

public class Bank implements iBank {
    String name;
    private ArrayList<Branch> branches;

    Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    @Override
    public Boolean addBranch(String branchName) {
        if (findBranch(branchName) == null && branchName != " ") {
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    @Override
    public Boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) != null) {
            return findBranch(branchName).newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    @Override
    public Boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }

    @Override
    public boolean listCustomers(String branchName, boolean printTransaction) {
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            ArrayList<Customer> listOfCustomers = branch.getCustomers();
            System.out.println("Customer Details  for Branch " + branchName);
            if (printTransaction==true) {
                for (Customer customer : listOfCustomers) {
                    ArrayList<Double> everyTransaction = customer.getTransactions();
                    int count = 0;
                    count = listOfCustomers.indexOf(customer) + 1;
                    System.out.printf("Customer: %s %d" , (customer.getName()) , count );
                    System.out.println("Transactions");
                    for (double transaction : everyTransaction) {
                        int num = 0;
                        num = everyTransaction.indexOf(transaction) + 1;
                        System.out.printf(" [%d] Amount %f" ,num,transaction);
                    }
                }
            } else {
                for (Customer customer : listOfCustomers) {
                    int numberOfCustomers = 0;
                    numberOfCustomers = listOfCustomers.indexOf(customer) + 1;
                    System.out.println("Customer: " + (customer.getName()) + "[" + numberOfCustomers + "] ");

                }
            }
            return true;
        }
        return false;
    }
}
