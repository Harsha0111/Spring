package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlg bubbleSort;
    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = bubbleSort.sort(numbers);

        System.out.println(bubbleSort);
        return 3;


    }
}
