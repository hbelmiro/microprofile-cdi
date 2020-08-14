package com.hbelmiro.microprofile.cdi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class PortifolioTest {

    @TestMode
    @Inject
    Portifolio portifolio;

    @Test
    public void computePortifolioProfit() {
        assertEquals(BigDecimal.valueOf(520), this.portifolio.computePortifolioProfit("Helber"));
    }

}