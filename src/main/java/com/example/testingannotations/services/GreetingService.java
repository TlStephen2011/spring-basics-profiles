package com.example.testingannotations.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"FirstGreeting", "default"})
@Service("greetingService")
public class GreetingService implements IGreeting {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
