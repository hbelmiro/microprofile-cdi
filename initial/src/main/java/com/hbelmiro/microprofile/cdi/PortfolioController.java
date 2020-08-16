package com.hbelmiro.microprofile.cdi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class PortfolioController {

    private final Portfolio portfolio = new Portfolio();

    @GET
    public String printProfit() {
        return "Current profit is: " + this.portfolio.computePortfolioProfit();
    }

}
