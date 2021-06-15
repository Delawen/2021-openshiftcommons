package org.acme;

import org.apache.camel.builder.RouteBuilder;

public class TwitterRoute  extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("twitter-search://@Apachecamel")
                .setBody().simple("{\"sigthning\": \"${body}\", \"where\": \"twitter\"}")
                .log("${body}")
                .to("kafka:camelsightings");
    }
}


