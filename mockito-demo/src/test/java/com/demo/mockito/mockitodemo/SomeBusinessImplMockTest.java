package com.demo.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {

    @Test
    void findTheGreatest() {
        var ds = mock(DataService.class);
        when(ds.retrieveAll()).thenReturn(new int[]{1, 42, 3});

        var bs = new SomeBusinessImpl(ds);

        var retrieved = bs.findTheGreatest();

        assertEquals(OptionalInt.of(42), retrieved);
    }

    @Test
    void findTheGreatest_forOneValue() {
        var ds = mock(DataService.class);
        when(ds.retrieveAll()).thenReturn(new int[]{42});

        var bs = new SomeBusinessImpl(ds);

        var retrieved = bs.findTheGreatest();

        assertEquals(OptionalInt.of(42), retrieved);
    }

    @Test
    void findTheGreatest_forEmptyValue() {
        var ds = mock(DataService.class);
        when(ds.retrieveAll()).thenReturn(new int[]{});

        var bs = new SomeBusinessImpl(ds);

        var retrieved = bs.findTheGreatest();

        assertTrue(retrieved.isEmpty());
    }
}

