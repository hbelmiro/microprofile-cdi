package com.hbelmiro.microprofile.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigDecimal;

@ApplicationScoped
public class Portifolio {

    private final StocksService stocksService;

    private final PositionsLoader positionsLoader;

    @Inject
    Portifolio(StocksService stocksService, PositionsLoader positionsLoader) {
        this.stocksService = stocksService;
        this.positionsLoader = positionsLoader;
    }

    public BigDecimal computePortifolioProfit(String investorName) {
        return this.positionsLoader.load(investorName).stream()
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
