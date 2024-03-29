package com.ironhack.classes;

import com.ironhack.enums.Hold;

import java.math.BigDecimal;

public class Account {

    private String name;
    private String address;
    private BigDecimal balance;
    private String accountNumber;
    private Hold hold;

    public Account(String name, String address, BigDecimal balance, String accountNumber) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.hold = Hold.NONE;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Hold getHold() {
        return hold;
    }

    public void setHold(Hold hold) {
        this.hold = hold;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", hold=" + hold +
                '}';
    }
}

