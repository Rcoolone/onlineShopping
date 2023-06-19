package com.rcoolone.onlineshopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/abcd/{text}")
    public String helloWorld(@PathVariable("text") String abcd) {
        return "your input is :" + abcd;
    }
}
