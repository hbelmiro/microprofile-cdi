package com.hbelmiro.microprofile.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@ApplicationScoped
public class PortfolioController {

    @Inject
    Portfolio portfolio;

    @GET
    public String sayHello() {
        return "Current profit is: " + portfolio.computePortfolioProfit();
    }

}
