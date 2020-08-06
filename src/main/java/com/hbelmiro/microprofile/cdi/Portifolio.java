package com.hbelmiro.microprofile.cdi;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Portifolio {

    @Inject
    private StocksService stocksService;

    private final List<Position> positions = Arrays.asList(
            new Position("AAPL", BigDecimal.TEN, new BigDecimal("100.25")),
            new Position("GOOG", new BigDecimal(3), new BigDecimal(1000)),
            new Position("AMZN", new BigDecimal(2), new BigDecimal(2500))
    );

    public BigDecimal computePortifolioProfit() {
        return this.positions.stream()
                             .map(this::computePositionProfit)
                             .reduce(BigDecimal::add)
                             .orElse(BigDecimal.ZERO);
    }

    private BigDecimal computePositionProfit(Position position) {
        return this.stocksService.getActualValue(position.getTicker())
                                 .subtract(position.getCostBasis())
                                 .multiply(position.getQuantity());
    }

}
