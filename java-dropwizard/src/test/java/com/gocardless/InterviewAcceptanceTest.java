package com.gocardless;

import com.gocardless.api.Message;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;
import static org.assertj.core.api.Assertions.assertThat;

public class InterviewAcceptanceTest {
    @ClassRule
    public static final DropwizardAppRule<InterviewConfig> RULE = new DropwizardAppRule<>(InterviewApplication.class);

    private static String baseUrl;
    private static Client client;

    @BeforeClass
    public static void setUp() {
        baseUrl = String.format("http://localhost:%d", RULE.getLocalPort());
        client = new JerseyClientBuilder(RULE.getEnvironment()).build("test client");
    }

    @Test
    public void shouldGetMessage() {
        String url = String.format("%s/hello", baseUrl);

        Response response = client.target(url).request().accept(APPLICATION_JSON_TYPE).get();
        assertThat(response.getStatus()).isEqualTo(200);

        Message message = response.readEntity(Message.class);
        assertThat(message.getMessage()).isEqualTo("Hello, world!");
    }
}
