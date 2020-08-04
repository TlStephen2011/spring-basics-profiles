package com.example.testingannotations.controllers;

import com.example.testingannotations.services.IGreeting;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private final IGreeting greetingService;

    public GreetingController(IGreeting greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        greetingService.sayHello();
    }
}
