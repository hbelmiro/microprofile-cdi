package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;
import java.util.Random;

public class StockServiceImpl implements StocksService {

    @Override
    public BigDecimal getActualValue(String ticker) {
        return BigDecimal.valueOf(new Random().nextInt(5000));
    }

}
