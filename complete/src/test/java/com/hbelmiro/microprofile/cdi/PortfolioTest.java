package com.hbelmiro.microprofile.cdi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class PortfolioTest {

    @Inject
    @TestMode
    Portfolio portfolio;

    @Test
    public void computePortfolioProfit() {
        assertEquals(BigDecimal.valueOf(520), this.portfolio.computePortfolioProfit());
    }

}