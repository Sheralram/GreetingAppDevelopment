package com.bridgelabz.greetingappdevelopment.service;

import com.bridgelabz.greetingappdevelopment.dto.GreetingDto;
import com.bridgelabz.greetingappdevelopment.entity.GreetingEntity;
import com.bridgelabz.greetingappdevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    private String lastName;
    private String firstName;

    public String greet() {
        return "Hello world";
    }

    public String getWithName(String firstName, String lastName) {
//        this.firstName=firstName;
//        this.lastName=lastName;
        return firstName + " " + lastName;
    }

    public GreetingEntity addGreeting(GreetingDto greetingDto) {
        GreetingEntity greetingEntity = new GreetingEntity();
        greetingEntity.setMessage(greetingDto.getMessage());
       // return greetingRepository.save(greetingEntity);
    return greetingRepository.save(greetingEntity);
    }
}
