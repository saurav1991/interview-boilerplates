package com.gocardless;

import com.gocardless.api.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.BDDAssertions.then;
import static org.springframework.http.HttpStatus.OK;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InterviewConfiguration.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class InterviewConfigurationTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldReturn200WhenSendingRequestToController() throws Exception {
        String url = String.format("http://localhost:%d/hello", port);
        ResponseEntity<Message> entity = testRestTemplate.getForEntity(url, Message.class);

        then(entity.getStatusCode()).isEqualTo(OK);
        then(entity.getBody().getMessage()).isEqualTo("Hello, world!");
    }
}