package com.example.demo.controller;

import com.example.demo.service.HelloService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Percentage(name = "Greetings API")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    @Operation(summary = "Returns a random greeting")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok(helloService.getGreeting());
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<String> test(@PathVariable String id) {
        return ResponseEntity.ok().body("{}");
    }
}
