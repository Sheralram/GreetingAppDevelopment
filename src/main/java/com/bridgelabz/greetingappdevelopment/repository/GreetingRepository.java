package com.bridgelabz.greetingappdevelopment.repository;

import com.bridgelabz.greetingappdevelopment.entity.GreetingEntity;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingEntity, Integer> {

}
