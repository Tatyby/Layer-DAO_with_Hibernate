package com.example.dao_with_hibernate.service;

import com.example.dao_with_hibernate.Model.Person;
import com.example.dao_with_hibernate.Repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    PersonRepository personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonsByCity(city);

    }

}
