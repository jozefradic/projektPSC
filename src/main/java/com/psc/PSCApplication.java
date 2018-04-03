package com.psc;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PSCApplication extends Application<PSCConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PSCApplication().run(args);
    }

    @Override
    public String getName() {
        return "com.psc";
    }


    @Override
    public void initialize(final Bootstrap<PSCConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PSCConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
