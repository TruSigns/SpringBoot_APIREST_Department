package com.ReeseStudying.ReeseRuffinSpringbootTraining.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController() // The controller is going to be the restful API
public class HelloController {


    //Request method to get the data and return whatever is in the method
    @GetMapping("/")
    public  String helloWorld(){
       return "Are you serious about studying Spring Framework" ;
    }




}
