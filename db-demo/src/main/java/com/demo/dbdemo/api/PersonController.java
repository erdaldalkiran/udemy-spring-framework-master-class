package com.demo.dbdemo.api;

import com.demo.dbdemo.entity.Person;
import com.demo.dbdemo.jdbc.PersonJdbcDao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private PersonJdbcDao repo;

    public PersonController(PersonJdbcDao repo) {
        this.repo = repo;
    }

    @GetMapping("person/all")
    public List<Person> getAll(){
        return repo.findAll();
    }

    @GetMapping("person/id/{id}")
    public Person getById(@PathVariable int id){
        return repo.findByID(id);
    }

    @PostMapping("/person")
    public HttpStatus create(@RequestBody Person person) {
        repo.create(person);
        return HttpStatus.CREATED;
    }

    @PutMapping("/person/id/{id}")
    public HttpStatus update(@PathVariable int id, @RequestBody Person person) {
        person.setId(id);
        repo.update(person);
        return HttpStatus.OK;
    }

    @DeleteMapping("person/id/{id}")
    public HttpStatus delete(@PathVariable int id){
        repo.delete(id);
        return HttpStatus.OK;
    }


}
