package com.ironhack.bigdecimal.money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

public class Money {

    private static final Currency USD = Currency.getInstance("USD");
    private static final RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_UP;

    private final Currency currency;
    private BigDecimal amount;


    public Money(Currency currency, BigDecimal amount, RoundingMode roundingMode) {
        this.currency = currency;
        setAmount(amount.setScale(currency.getDefaultFractionDigits(), roundingMode));
    }

    public Money(Currency currency, BigDecimal amount) {
        this.currency = currency;
        setAmount(amount.setScale(currency.getDefaultFractionDigits(), DEFAULT_ROUNDING));
    }

    public Money(BigDecimal amount) {
        this.currency = USD;
        setAmount(amount.setScale(USD.getDefaultFractionDigits(), DEFAULT_ROUNDING));
    }

    public BigDecimal increaseAmount(Money money) {
        setAmount(this.amount.add(money.amount));
        return this.amount;
    }


    // GETTERS Y SETTERS
    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    // ToString


    @Override
    public String toString() {
        return getAmount() + " " + getCurrency().getSymbol();
    }
}
