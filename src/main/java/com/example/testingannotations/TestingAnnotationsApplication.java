package com.example.testingannotations;

import com.example.testingannotations.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestingAnnotationsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(TestingAnnotationsApplication.class, args);

        GreetingController gc = (GreetingController)ctx.getBean("greetingController");
        gc.sayHello();
    }

}
