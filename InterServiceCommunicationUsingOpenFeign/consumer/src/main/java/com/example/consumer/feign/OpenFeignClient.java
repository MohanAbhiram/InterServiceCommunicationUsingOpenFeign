package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider-service",url = "http://localhost:8082/provider")
public interface OpenFeignClient {

    @GetMapping("/instance")
    String getInstance();
}
