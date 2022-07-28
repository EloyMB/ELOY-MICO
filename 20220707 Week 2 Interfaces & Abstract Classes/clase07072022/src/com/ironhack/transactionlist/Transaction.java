package com.ironhack.transactionlist;

import java.util.Date;

public class Transaction {

    private Account sellerAccountNumber;
    private Integer buyerAccountNumber;
    private Integer amount;
    private Date date;

    public Transaction(Account sellerAccountNumber, Integer buyerAccountNumber, Integer amount, Date date) {

        setSellerAccountNumber(sellerAccountNumber);
        setBuyerAccountNumber(buyerAccountNumber);
        setAmount(amount);
        setDate(date);
    }

    public Account getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(Account sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

}

    public Integer getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(Integer buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
