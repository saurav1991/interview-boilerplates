package com.gocardless.controllers;

import com.gocardless.api.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/hello")
public class InterviewController {
    private static final String MESSAGE = "Hello, world!";

    @RequestMapping(method = GET)
    public @ResponseBody Message get() {
        return new Message(MESSAGE);
    }
}
