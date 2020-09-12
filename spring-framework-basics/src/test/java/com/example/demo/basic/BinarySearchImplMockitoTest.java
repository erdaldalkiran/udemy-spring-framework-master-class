package com.example.demo.basic;

import com.example.demo.BasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = BasicApplication.class)
class BinarySearchImplMockitoTest {

    @Mock
    Sorter sorter;

    @InjectMocks
    BinarySearchImpl bs;

    @Test
    void search() {
        when(sorter.sort(Mockito.any())).thenReturn(new int[]{4, 5, 6});
        var actualResult = bs.search(new int[]{6, 4, 5}, 4);
        assertEquals(4, actualResult);
    }

    @Test
    void search2() {
        when(sorter.sort(Mockito.any())).thenReturn(new int[]{12, 15, 26});
        var actualResult = bs.search(new int[]{12, 26, 15}, 12);
        assertEquals(12, actualResult);
    }
}