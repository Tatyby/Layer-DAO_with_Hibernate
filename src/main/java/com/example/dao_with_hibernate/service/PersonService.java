package com.example.dao_with_hibernate.service;

import com.example.dao_with_hibernate.model.Person;
import com.example.dao_with_hibernate.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    PersonRepository personRepository;
    public List<Person> getPersonsByCity(String city) {
        return personRepository.findPersonByCity(city);

    }
    public List<Person> getPersonsByAge(int age) {
        return personRepository.fndByAgeLessThanOrderByAge(age, Sort.by(Sort.Direction.ASC, "age"));

    }
    public List<Person> getPersonsByNameAndSurname(String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);

    }

}
