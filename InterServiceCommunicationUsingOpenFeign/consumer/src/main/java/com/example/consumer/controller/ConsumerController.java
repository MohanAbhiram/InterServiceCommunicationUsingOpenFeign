package com.example.consumer.controller;

import com.example.consumer.feign.OpenFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor
public class ConsumerController {

    private final OpenFeignClient openFeignClient;

    @GetMapping
    public String getInstance(){
        return openFeignClient.getInstance();
    }
}
