package com.hbelmiro.microprofile.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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

