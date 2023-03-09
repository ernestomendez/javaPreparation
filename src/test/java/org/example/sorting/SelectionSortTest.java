package org.example.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void selectionSort() {

        SelectionSort selectionSort = new SelectionSort();

        int x[] = {18, 7, 15, 6, 9,3,2, 14,5};

        int[] ints = selectionSort.selectionSort(x);

        assertArrayEquals(new int[]{2, 3, 5, 6, 7, 9, 14, 15, 18}, ints);
    }
}