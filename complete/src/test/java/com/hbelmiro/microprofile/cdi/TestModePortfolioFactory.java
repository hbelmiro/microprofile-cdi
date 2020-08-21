package com.hbelmiro.microprofile.cdi;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class TestModePortfolioFactory {

    @Inject
    @TestMode
    StocksService fakeStocksService;

    @Inject
    @TestMode
    PositionsLoader fakePositionsLoader;

    @TestMode
    @Produces
    public Portfolio createPortfolio() {
        return new Portfolio(this.fakeStocksService, this.fakePositionsLoader);
    }

}
