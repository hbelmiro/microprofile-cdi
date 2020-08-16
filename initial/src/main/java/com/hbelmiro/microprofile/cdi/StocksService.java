package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;
import java.util.Random;

public class StocksService {

    public BigDecimal getCurrentValue(String ticker) {
        return BigDecimal.valueOf(new Random().nextInt(5000));
    }

}
