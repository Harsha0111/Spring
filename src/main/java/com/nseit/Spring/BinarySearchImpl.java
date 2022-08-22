package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    //@Qualifier("Quick")
    private SortAlg sortAlg;
    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = sortAlg.sort(numbers);

        System.out.println(sortAlg);
        return 3;


    }
}
