package com.hbelmiro.microprofile.cdi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/profit")
@Produces(MediaType.TEXT_PLAIN)
public class ProfitResource {

    private final Portfolio portfolio = new Portfolio();

    @GET
    public String get() {
        return "Current profit is: " + this.portfolio.computePortfolioProfit();
    }

}
