package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Primary
class QuickSortAlgorithm implements Sorter {
    public int[] sort(int[] numbers) {
        var backup = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(backup);

        var result = new int[backup.length];
        for (int i = backup.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = backup[i];
        }

        return result;
    }
}
