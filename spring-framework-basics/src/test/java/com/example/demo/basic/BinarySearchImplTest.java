package com.example.demo.basic;

import com.example.demo.BasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = BasicApplication.class)
class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl search;

    @Test
    void search() {
        var actualResult = search.search(new int[]{1, 23, 4}, 1);
        assertEquals(23, actualResult);
    }
}