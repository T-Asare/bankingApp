package org.Asare.classes;
import org.Asare.interfaces.iCustomer;

import java.util.ArrayList;

public class Customer implements iCustomer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name, double initialTransaction) {
        if (!(name ==" ")){
            this.name=name;
            if( initialTransaction<0){//check if transaction is not negative otherwise set to zero
            initialTransaction=0;
        }
        else{
            initialTransaction = initialTransaction;

        }
        this.transactions= new ArrayList<>();
        this.transactions.add(initialTransaction);

        }


    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    @Override
    public void addTransactions(Double transaction) {
        if (transaction>0) {//Only add a transaction if it is a positive value greater than zero
            this.transactions.add(transaction);
        }
    }
}
