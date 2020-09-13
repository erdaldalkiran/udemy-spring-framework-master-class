package com.demo.jpademo.api;


import com.demo.jpademo.data.PersonGenericRepository;
import com.demo.jpademo.data.PersonRepository;
import com.demo.jpademo.entity.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private PersonRepository repo;
    private PersonGenericRepository genericRepo;

    public PersonController(PersonRepository repo, PersonGenericRepository genericRepo) {
        this.repo = repo;
        this.genericRepo = genericRepo;
    }

    @GetMapping("person/all")
    public List<Person> getAll() {
        //return repo.findAll();
        return genericRepo.findAll();
    }

    @GetMapping("person/id/{id}")
    public Object getById(@PathVariable int id) {
        //return repo.findByID(id);
        var maybe =  genericRepo.findById(id);
        if(maybe.isPresent()){
            return maybe.get();
        }

        return HttpStatus.NOT_FOUND;
    }

    @PostMapping("/person")
    public HttpStatus create(@RequestBody Person person) {
//        repo.upsert(person);
        genericRepo.save(person);
        return HttpStatus.CREATED;
    }

    @PutMapping("/person/id/{id}")
    public HttpStatus update(@PathVariable int id, @RequestBody Person person) {
        person.setId(id);
//        repo.upsert(person);
        genericRepo.save(person);
        return HttpStatus.OK;
    }

    @DeleteMapping("person/id/{id}")
    public HttpStatus delete(@PathVariable int id) {
//        repo.delete(id);
        genericRepo.deleteById(id);
        return HttpStatus.OK;
    }


}
