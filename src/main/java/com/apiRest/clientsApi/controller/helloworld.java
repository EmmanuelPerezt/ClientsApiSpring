package com.apiRest.clientsApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class helloworld {
    
    @GetMapping("/")
    public String hello(){

        return"helloWorlld";
    }
}
