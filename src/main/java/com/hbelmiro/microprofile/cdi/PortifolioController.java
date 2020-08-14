package com.hbelmiro.microprofile.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.math.BigDecimal;

@Path("/")
@ApplicationScoped
public class PortifolioController {

    @Inject
    Portifolio portifolio;

    @GET
    public String sayHello() {
        return "Current profit is: " + portifolio.computePortifolioProfit("Helber");
    }

}
