package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;

public interface Stocks {

    BigDecimal price(String ticker);

}
