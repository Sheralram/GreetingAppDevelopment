package com.bridgelabz.greetingappdevelopment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestBody  String message ){
        return "Message:" + message;}
}
