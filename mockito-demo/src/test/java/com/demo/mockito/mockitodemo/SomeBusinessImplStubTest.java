package com.demo.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void findTheGreatest() {
        var stub = new DataServiceStub();
        var bs = new SomeBusinessImpl(stub);
        var retrieved = bs.findTheGreatest();

        assertEquals(OptionalInt.of(42), retrieved);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAll() {
        return new int[]{1,42,3};
    }
}