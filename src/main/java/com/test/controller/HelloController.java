package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/info")
    public String info(){
        return "Hello SpringBoot info！I'm dev!" +
                "Testing! stage/release-v1.0.1" +
                "stage/release-v1.0.2" +
                "Stage/release-v1.1.0";
    }
}
