package com.example.dao_with_hibernate.Repository;

import com.example.dao_with_hibernate.Model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createNativeQuery("select id, name, surname, age, phone_number from persons where city=?");
        query.setParameter(1, city);

        return query.getResultList();

    }
}
