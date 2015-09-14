package com.example;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class MyAssembler {
    private final Logger LOG = Logger.getLogger(MyAssembler.class);

    public void assemble(Exchange exchange) {
        String content = exchange.getIn().getBody(String.class);
        // Create MyObject here.
        MyObject object = new MyObject(content); // ...transformation here.
        exchange.getOut().setBody(object);
    }
}
