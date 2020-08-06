package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;

public class Asset {

    private final String ticker;

    private final BigDecimal value;

    public Asset(String ticker, BigDecimal value) {
        this.ticker = ticker;
        this.value = value;
    }

    public String getTicker() {
        return ticker;
    }

    public BigDecimal getValue() {
        return value;
    }

}
