package com.demo.aopdemo.business;

import com.demo.aopdemo.data.Dao1;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    private Dao1 dao;

    public Business1(Dao1 dao) {
        this.dao = dao;
    }

    public String calculateSomething(String ciko){
        return dao.retrieveSomething();
    }
}
