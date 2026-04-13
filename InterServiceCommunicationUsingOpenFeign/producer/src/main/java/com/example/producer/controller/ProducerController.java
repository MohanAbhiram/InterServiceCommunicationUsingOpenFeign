package com.example.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProducerController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/instance")
    public String getInstance(){
        System.out.println("Request landed to provider controller");
        return "Request completed at Instance : "+port;
    }
}
