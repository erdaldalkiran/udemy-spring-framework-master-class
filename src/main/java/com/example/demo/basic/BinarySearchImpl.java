package com.example.demo.basic;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public
class BinarySearchImpl {

    private Sorter sorter;

    BinarySearchImpl(Sorter sorter) {
        this.sorter = sorter;
    }

    public int search(final int[] numbers, final int numberToSearchFor) {
        var sorted = sorter.sort(numbers);

        return sorted[0];
    }
}
