package com.example.dao_with_hibernate.repository;

import com.example.dao_with_hibernate.model.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Query(value = "select p from Person p where p.city=:city")
    List<Person> findPersonByCity(@Param("city") String city);

    @Query(value = "select p from Person p where p.age<:age")
    List<Person> fndByAgeLessThanOrderByAge(@Param("age") int age, Sort sort);

    @Query(value = "select p from Person p where p.name=:name and p.surname=:surname")
    List<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}

