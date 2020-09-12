package com.demo.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockAnnotationsTest {
    @Mock
    DataService ds;

    @InjectMocks
    SomeBusinessImpl bs;

    @Test
    void findTheGreatest() {
        when(ds.retrieveAll()).thenReturn(new int[]{1, 42, 3});

        var retrieved = bs.findTheGreatest();

        assertEquals(OptionalInt.of(42), retrieved);
    }

    @Test
    void findTheGreatest_forOneValue() {
        when(ds.retrieveAll()).thenReturn(new int[]{42});

        var retrieved = bs.findTheGreatest();

        assertEquals(OptionalInt.of(42), retrieved);
    }

    @Test
    void findTheGreatest_forEmptyValue() {
        when(ds.retrieveAll()).thenReturn(new int[]{});

        var retrieved = bs.findTheGreatest();

        assertTrue(retrieved.isEmpty());
    }
}

