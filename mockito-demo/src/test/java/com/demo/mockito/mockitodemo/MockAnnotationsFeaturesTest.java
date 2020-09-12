package com.demo.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockAnnotationsFeaturesTest {

    @Test
    void returns() {
        var listMock  = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("ciko");
        when(listMock.get(1)).thenReturn("hede");

        assertEquals("ciko", listMock.get(0));
        assertEquals("hede", listMock.get(1));
        assertEquals("ciko", listMock.get(100));
    }
}

