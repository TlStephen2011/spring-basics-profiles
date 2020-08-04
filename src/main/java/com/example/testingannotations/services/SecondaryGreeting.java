package com.example.testingannotations.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SecondaryGreeting")
@Service("secondaryGreeting")
public class SecondaryGreeting implements IGreeting {
    @Override
    public void sayHello() {
        System.out.println("This is a secondary greeting!");
    }
}
