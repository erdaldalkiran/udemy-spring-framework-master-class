package com.demo.jpademo.data;

import com.demo.jpademo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findByID(int id){
        return entityManager.find(Person.class, id);
    }

    public List<Person> findAll(){
        //var query = entityManager.createNamedQuery("find_all_people", Person.class);
        var query = entityManager.createQuery("select p from Person p", Person.class);
        return query.getResultList();
    }

    public void upsert(Person person){
        entityManager.merge(person);
    }

    public void delete(int  id){
        var person = findByID(id);
        if(person == null){
            return;
        }
        entityManager.remove(person);
    }
}
