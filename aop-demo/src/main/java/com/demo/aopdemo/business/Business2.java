package com.demo.aopdemo.business;

import com.demo.aopdemo.data.Dao2;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    private Dao2 dao;

    public Business2(Dao2 dao) {
        this.dao = dao;
    }

    public String calculateSomething() throws Exception {
        return dao.retrieveSomething();
    }
}
