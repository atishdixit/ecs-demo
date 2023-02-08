package com.ecs.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECSDemoController {

    @Autowired
    private ApplicationProperties applicationProperties;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/parameters")
    public ApplicationProperties checkParameters(){
        return applicationProperties;
    }
}
