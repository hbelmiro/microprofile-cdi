package com.hbelmiro.microprofile.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;
import java.util.Random;

@ApplicationScoped
public class StocksServiceImpl implements StocksService {

    @Override
    public BigDecimal getCurrentValue(String ticker) {
        return BigDecimal.valueOf(new Random().nextInt(5000));
    }

}
