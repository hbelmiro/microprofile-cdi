package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class PositionsLoader {

    private static final Random RANDOM = new Random();

    public List<Position> load() {
        return List.of(
                new Position("AAPL", nextRandomNumber(), nextRandomNumber()),
                new Position("GOOG", nextRandomNumber(), nextRandomNumber()),
                new Position("AMZN", nextRandomNumber(), nextRandomNumber())
        );
    }

    private BigDecimal nextRandomNumber() {
        return BigDecimal.valueOf(RANDOM.nextInt(5000));
    }

}
