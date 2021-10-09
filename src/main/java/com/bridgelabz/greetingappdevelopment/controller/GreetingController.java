package com.bridgelabz.greetingappdevelopment.controller;

import com.bridgelabz.greetingappdevelopment.dto.GreetingDto;
import com.bridgelabz.greetingappdevelopment.entity.GreetingEntity;
import com.bridgelabz.greetingappdevelopment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
@Autowired
    GreetingService greetingService;

@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestBody  String message ){
        return "Message:" + message;}

    @GetMapping(value="/greetmessage")
    public String Greeting(){
    return greetingService.greet();
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello : " + firstName + " " + lastName;
    }

    @GetMapping(value = {"/", "/greetingmessage"})
    public String helloMessage(@RequestParam(value="firstName",defaultValue = "HelloWorld!")String firstName, @RequestParam (value ="lastName", defaultValue ="HelloWorld!") String lastName){
    return greetingService.getWithName(firstName,lastName);
}

    @PutMapping(value = "/addGreeting")
    public GreetingEntity addGreetings(@RequestBody GreetingDto greetingDto){
        return greetingService.addGreeting(greetingDto);
    }


}
