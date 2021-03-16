package org.Asare.interfaces;
public interface iBank {
    Boolean addBranch(String branchName);
    Boolean addCustomer(String branchName, String customerName, double initialTransaction);
    Boolean addCustomerTransaction (String branchName, String customerName,double transaction );

    Boolean listCustomers(String branchName, Boolean printTransactions);
}
