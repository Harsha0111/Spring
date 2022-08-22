package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class QuickSort implements  SortAlg{
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
