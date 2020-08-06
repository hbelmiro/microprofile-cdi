package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;

public interface StocksService {

    BigDecimal getActualValue(String ticker);

}
