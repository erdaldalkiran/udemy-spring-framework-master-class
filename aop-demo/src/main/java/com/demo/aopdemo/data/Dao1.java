package com.demo.aopdemo.data;

import com.demo.aopdemo.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}
