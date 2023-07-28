package com.example.dao_with_hibernate.repository;

import com.example.dao_with_hibernate.model.Person;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByCity(String nameCity);

    List<Person> findByAgeLessThanOrderByAge(int age);

    List<Person> findByNameAndSurname(String name, String surname);
}

