package org.Asare.classes;
import org.Asare.interfaces.iBank;
public class Bank implements iBank {

    @Override
    public Boolean addBranch(String branchName) {
        return null;
    }

    @Override
    public Boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        return false;
    }

    @Override
    public Boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        return false;
    }

    private Void findBranch(String branchName) {
        return null;
    }

    @Override
    public Boolean listCustomers(String branchName, Boolean printTransactions) {
        return false;
    }
}
