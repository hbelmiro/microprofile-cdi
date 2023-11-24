package com.hbelmiro.microprofile.cdi;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

public class TestModePortfolioFactory {

    @Inject
    @TestMode
    StocksService fakeStocksService;

    @Inject
    @TestMode
    PositionsLoader fakePositionsLoader;

    @Produces
    @TestMode
    public Portfolio createPortfolio() {
        return new Portfolio(this.fakeStocksService, this.fakePositionsLoader);
    }

}
