package com.hbelmiro.microprofile.cdi;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class TestModePortifolioFactory {

    @Inject
    @TestMode
    StocksService fakeStocksService;

    @Inject
    @TestMode
    PositionsLoader positionsLoader;

    @TestMode
    @Produces
    public Portifolio createPortifolio() {
        return new Portifolio(this.fakeStocksService, this.positionsLoader);
    }

}
