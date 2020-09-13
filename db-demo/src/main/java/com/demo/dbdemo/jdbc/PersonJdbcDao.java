package com.demo.dbdemo.jdbc;

import com.demo.dbdemo.entity.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {

    private JdbcTemplate jdbcTemplate;

    public PersonJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> findAll() {
        var people = jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));

        return people;
    }

    public Person findByID(int id) {
        var person = jdbcTemplate.queryForObject("select * from person where id=?",
                new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class));

        return person;
    }

    public void delete(int id) {
        jdbcTemplate.update("delete from person where id=?", new Object[]{id});
    }

    public void create(Person person) {
        jdbcTemplate.update("insert into person (id, name, location, birth_date )\n" +
                "values(?, ?, ?, ?)", new Object[]{person.getId(), person.getName(), person.getLocation(), person.getBirthDate()});
    }

    public void update(Person person) {
        jdbcTemplate.update("update person set name =?, location=?, birth_date=? where id=?",
                new Object[]{person.getName(), person.getLocation(), person.getBirthDate(), person.getId()});
    }
}
