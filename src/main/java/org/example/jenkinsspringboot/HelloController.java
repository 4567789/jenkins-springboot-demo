package org.example.jenkinsspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Bonjour bussi depuis Spring Boot + Jenkins !";
    }
}
