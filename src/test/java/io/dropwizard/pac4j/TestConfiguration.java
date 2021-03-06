package io.dropwizard.pac4j;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class TestConfiguration extends Configuration {
    Pac4jFactory pac4jFactory = new Pac4jFactory();

    TestConfiguration(@JsonProperty("pac4j") Pac4jFactory pac4jFactory) {
        this.pac4jFactory = pac4jFactory;
    }
}
