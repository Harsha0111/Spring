package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSort implements  SortAlg{
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
