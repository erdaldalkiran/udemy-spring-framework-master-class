package com.demo.mockito.mockitodemo;

import java.util.Arrays;
import java.util.OptionalInt;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    OptionalInt findTheGreatest(){
        var data = dataService.retrieveAll();

        return Arrays.stream(data).max();
    }
}

