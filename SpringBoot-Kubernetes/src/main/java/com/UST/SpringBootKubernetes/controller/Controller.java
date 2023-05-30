package com.UST.SpringBootKubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String message(){
        return "Hi Meenakshi";
    }
}
