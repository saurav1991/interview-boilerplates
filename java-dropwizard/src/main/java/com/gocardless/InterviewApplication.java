package com.gocardless;

import com.gocardless.resources.InterviewResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class InterviewApplication extends Application<InterviewConfig> {
    public static void main(String[] args) throws Exception {
        new InterviewApplication().run(args);
    }

    public void run(InterviewConfig config, Environment environment) throws Exception {
        environment.jersey().register(new InterviewResource());
    }
}
