package org.example.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {

        MergeSort mergeSort = new MergeSort();
        int[] arr = {8, 2, 6, 1, 7, 9, 4, 5, 3};
        mergeSort.mergeSort(arr, 0, 8);

        Arrays.stream(arr).forEach(System.out::println);
    }
}