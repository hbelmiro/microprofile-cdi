package com.hbelmiro.microprofile.cdi;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
@Singleton
public class HelloController {

    @Inject
    private Stocks stocks;

    @GET
    public String sayHello() {
        return "Hello World " + this.stocks.price("AAPL");
    }
}
