package io.dropwizard.pac4j;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TestApplication extends Application<TestConfiguration> {
    @Override
    public void initialize(Bootstrap<TestConfiguration> bootstrap) {
        final Pac4jBundle<TestConfiguration> bundle = new Pac4jBundle<TestConfiguration>() {
            @Override
            public Pac4jFactory getPac4jFactory(TestConfiguration configuration) {
                return configuration.pac4jFactory;
            }
        };
        bootstrap.addBundle(bundle);
    }

    @Override
    public void run(TestConfiguration config, Environment env) throws Exception {
        env.jersey().register(new DogsResource());
    }
}
