package com.gocardless;

import com.gocardless.resources.InterviewResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

import static com.fasterxml.jackson.databind.PropertyNamingStrategy.SNAKE_CASE;

public class InterviewApplication extends Application<InterviewConfig> {
    public static void main(String[] args) throws Exception {
        new InterviewApplication().run(args);
    }

    public void run(InterviewConfig config, Environment environment) throws Exception {
        environment.getObjectMapper().setPropertyNamingStrategy(SNAKE_CASE);

        environment.jersey().register(new InterviewResource());
    }
}
