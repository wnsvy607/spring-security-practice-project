package com.sp.fc.web;

import com.sp.fc.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicTestApplication {

    public static void main(String[] args) {

        Person person = Person.builder()
                .name("nick")
                .build();
        System.out.println("person = " + person.getName());
        SpringApplication.run(BasicTestApplication.class, args);
    }
}
