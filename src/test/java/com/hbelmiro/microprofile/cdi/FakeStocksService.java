package com.hbelmiro.microprofile.cdi;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@TestMode
public class FakeStocksService implements StocksService {

    @Override
    public BigDecimal getCurrentValue(String ticker) {
        return BigDecimal.valueOf(100);
    }

}
