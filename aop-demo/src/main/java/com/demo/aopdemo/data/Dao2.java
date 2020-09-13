package com.demo.aopdemo.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    public String retrieveSomething() throws Exception {
        throw new Exception("cikolata");
    }
}
