package com.hbelmiro.microprofile.cdi;

import java.math.BigDecimal;

public class Portfolio {

    private final StocksService stocksService = new StocksService();

    private final PositionsLoader positionsLoader = new PositionsLoader();

    public BigDecimal computePortfolioProfit() {
        return this.positionsLoader.load().stream()
                                   .map(this::computePositionProfit)
                                   .reduce(BigDecimal::add)
                                   .orElse(BigDecimal.ZERO);
    }

    private BigDecimal computePositionProfit(Position position) {
        return this.stocksService.getCurrentValue(position.getTicker())
                                 .subtract(position.getAveragePrice())
                                 .multiply(position.getQuantity());
    }

}
