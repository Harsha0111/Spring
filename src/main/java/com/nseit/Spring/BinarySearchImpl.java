package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    @Autowired
    private SortAlg bubbleSort;
    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = bubbleSort.sort(numbers);

        System.out.println(bubbleSort);
        return 3;


    }
}
