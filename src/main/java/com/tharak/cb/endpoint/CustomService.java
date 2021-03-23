package com.tharak.cb.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomService {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

}
