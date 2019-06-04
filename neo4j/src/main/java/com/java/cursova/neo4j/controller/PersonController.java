package com.java.cursova.neo4j.controller;

import com.java.cursova.neo4j.entity.Person;
import com.java.cursova.neo4j.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/person")
    public ResponseEntity savePerson() {
        Person person = new Person();
        person.setName("Test");
        person.setEmail("Test");
        person.setAge(100L);
        return new ResponseEntity(personRepository.save(person), HttpStatus.OK);
    }
}
