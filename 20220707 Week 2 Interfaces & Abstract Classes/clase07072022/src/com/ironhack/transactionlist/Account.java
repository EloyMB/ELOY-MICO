package com.ironhack.transactionlist;

public class Account {

    private String name;
    private String address;
    private Integer accountNumber;
    private float balance;

    public Account(String name, String address, Integer accountNumber, float balance) {

        setName(name);
        setAddress(address);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
