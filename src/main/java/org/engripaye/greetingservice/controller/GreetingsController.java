package org.engripaye.greetingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingsController {


     @GetMapping("/greet")
     public String greet(){
          return "Hello from greeting Microservice!";
     }
}
