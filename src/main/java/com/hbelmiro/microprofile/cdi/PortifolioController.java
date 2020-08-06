package com.hbelmiro.microprofile.cdi;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@Singleton
public class PortifolioController {

    @Inject
    private Portifolio portifolio;

    @GET
    public String sayHello() {
        return "Current profit is: " + portifolio.computePortifolioProfit();
    }

}
