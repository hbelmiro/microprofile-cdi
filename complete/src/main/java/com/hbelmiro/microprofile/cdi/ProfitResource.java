package com.hbelmiro.microprofile.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/profit")
@ApplicationScoped
@Produces(MediaType.TEXT_PLAIN)
public class ProfitResource {

    @Inject
    Portfolio portfolio;

    @GET
    public String get() {
        return "Current profit is: " + this.portfolio.computePortfolioProfit();
    }

}

