package com.java.cursova.mysql.controller;

import com.java.cursova.mysql.entity.Person;
import com.java.cursova.mysql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/person111")
    public Person savePerson() {
        Person person = new Person();
        person.setName("Test");
        person.setEmail("Test");
        person.setAge(100L);
        return personRepository.save(person);
    }

    @GetMapping("/person")
    public Person getPerson() {
        return personRepository.getOne(20L);
    }
}
