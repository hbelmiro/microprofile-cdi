package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;

public final class Position {

    private final String ticker;

    private final BigDecimal quantity;

    private final BigDecimal costBasis;

    public Position(String ticker, BigDecimal quantity, BigDecimal costBasis) {
        this.ticker = ticker;
        this.quantity = quantity;
        this.costBasis = costBasis;
    }

    public String getTicker() {
        return this.ticker;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public BigDecimal getCostBasis() {
        return this.costBasis;
    }

}
