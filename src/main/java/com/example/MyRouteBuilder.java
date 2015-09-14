package com.example;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.log4j.Logger;

public class MyRouteBuilder extends RouteBuilder {

    private static final Logger LOG = Logger.getLogger(MyRouteBuilder.class);

    public void configure() {

        restConfiguration()
        .component("restlet")
        .host("localhost")
        .port(10000)
        .bindingMode(RestBindingMode.json)
        .skipBindingOnErrorCode(false);
        
        getContext().setTracing(true);
        
        rest("/v1")
            .produces("application/json") 
            .post("/create")
                .route()
                    .to("bean:myAssembler?method=assemble")
                    .to("bean:myService?method=create")
                    .to("log:beans");
        
    }
}
