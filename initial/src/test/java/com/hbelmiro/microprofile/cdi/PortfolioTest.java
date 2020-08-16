package com.hbelmiro.microprofile.cdi;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PortfolioTest {

    @Test
    void computePortfolioProfit() {
        Portfolio portfolio = new Portfolio();

        assertEquals(BigDecimal.valueOf(520), portfolio.computePortfolioProfit());
    }

}