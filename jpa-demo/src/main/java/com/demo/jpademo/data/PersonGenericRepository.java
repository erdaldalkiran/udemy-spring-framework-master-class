package com.demo.jpademo.data;

import com.demo.jpademo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonGenericRepository extends JpaRepository<Person, Integer> {
}
