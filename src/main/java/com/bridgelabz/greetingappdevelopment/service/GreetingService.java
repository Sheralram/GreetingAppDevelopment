package com.bridgelabz.greetingappdevelopment.service;

import com.bridgelabz.greetingappdevelopment.dto.GreetingDto;
import com.bridgelabz.greetingappdevelopment.entity.GreetingEntity;
import com.bridgelabz.greetingappdevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

        public List<GreetingEntity> greetings() {
        return greetingRepository.findAll();
    }

    public String greet() {
        return "Hello world";
    }

    public String getWithName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public GreetingEntity addGreeting(GreetingDto greetingDto) {
        GreetingEntity greetingEntity = new GreetingEntity();
        greetingEntity.setMessage(greetingDto.getMessage());
        return greetingRepository.save(greetingEntity);
    }

    public GreetingEntity getGreetingById(int id) {
        Optional<GreetingEntity> greetingEntity = greetingRepository.findById(id);
        if (greetingEntity.isPresent()) {
            return greetingEntity.get();
        }
        return null;
    }

    public GreetingEntity updateGreeting(int id, GreetingDto greetingDto) {
    Optional<GreetingEntity> optionalGreetingEntity = greetingRepository.findById(id);
    if(optionalGreetingEntity.isPresent()){
        GreetingEntity greetingEntity = optionalGreetingEntity.get();
        greetingEntity.setMessage(greetingDto.getMessage());
        return greetingRepository.save(greetingEntity);
    }
    return null;
        }

    public String deleteGreeting(int id) {
            Optional<GreetingEntity>greetingEntity = greetingRepository.findById(id);
            if(greetingEntity.isPresent()){
                greetingRepository.delete(greetingEntity.get());
                return "Record is deleted Successfully";
            }
            return  "Record is not found " ;
        }
}
