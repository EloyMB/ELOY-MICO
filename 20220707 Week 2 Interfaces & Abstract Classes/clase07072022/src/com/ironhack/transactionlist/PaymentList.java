package com.ironhack.transactionlist;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList {
    private ArrayList<Transaction> transactions;

    public PaymentList(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }



    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public Transaction getLastTransaction() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }

    @Override
    public ArrayList<Transaction> getAllTransactions() {
        return null;
    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        return null;
    }
}
