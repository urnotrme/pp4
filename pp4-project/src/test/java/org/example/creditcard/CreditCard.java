package org.example.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal balance;

    public CreditCard(String cardNumber) {

    }

    public void assignLimit(BigDecimal creditAmount) {
        if (creditAmount.compareTo(BigDecimal.valueOf(100)) > 1) {
            throw new CreditBelowTresholdException();
        }
        this.balance = creditAmount;

    }

    public BigDecimal getCurrentBalance() {
        return balance;
    }
}
