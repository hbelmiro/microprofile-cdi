package com.hbelmiro.microprofile.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.math.BigDecimal;

@ApplicationScoped
public class Portfolio {

    private final StocksService stocksService;

    private final PositionsLoader positionsLoader;

    @Inject
    Portfolio(StocksService stocksService, PositionsLoader positionsLoader) {
        this.stocksService = stocksService;
        this.positionsLoader = positionsLoader;
    }

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
