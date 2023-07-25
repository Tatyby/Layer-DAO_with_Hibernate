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
    private String nativeQuery="select name, surname, age from persons where city=?";

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createNativeQuery(nativeQuery);
        query.setParameter(1, city);

        return query.getResultList();

    }
}
