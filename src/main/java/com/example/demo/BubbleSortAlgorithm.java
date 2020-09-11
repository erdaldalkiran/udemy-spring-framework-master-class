package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

class BubbleSortAlgorithm  implements Sorter {
    public int[] sort(int[] numbers){
        var backup = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(backup);

        return backup;
    }
}
