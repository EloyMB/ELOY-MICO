package com.ironhack.transactionlist;
import java.util.ArrayList;
import java.util.Date;
public interface TransactionList {
    public Transaction getLastTransaction();
    public void addTransaction(Transaction transaction);
    public Transaction getTransactionByDate(Date date);
    public ArrayList<Transaction> getAllTransactions();
}
