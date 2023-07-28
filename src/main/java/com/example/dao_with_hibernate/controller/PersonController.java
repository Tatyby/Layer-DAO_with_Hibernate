package com.example.dao_with_hibernate.controller;

import com.example.dao_with_hibernate.model.Person;
import com.example.dao_with_hibernate.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    PersonService personService;

    @GetMapping("/persons/by-city")
    public List<Person> getPerson(@RequestParam(value = "city", required = false) String city) {
        return personService.getPersonsByCity(city);

    }

    @GetMapping("/persons/by-age")
    public List<Person> getPerson(@RequestParam(value = "age", required = false) int age) {
        return personService.getPersonsByAge(age);

    }

    @GetMapping("/persons/by-name-surname")
    public List<Person> getPerson(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        return personService.getPersonsByNameAndSurname(name, surname);

    }

}
