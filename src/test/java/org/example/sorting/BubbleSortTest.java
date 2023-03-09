package org.example.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {

        BubbleSort bubbleSort = new BubbleSort();

        int x[] = {18, 7, 15, 6, 9,3,2, 14,5};

        int[] ints = bubbleSort.bubbleSort(x);

        assertArrayEquals(new int[]{2, 3, 5, 6, 7, 9, 14, 15, 18}, ints);

    }

    @Test
    public void bubbleSortOrdered() {

        BubbleSort bubbleSort = new BubbleSort();

        int x[] = {1, 2, 3 , 4 , 5, 6,8,7};

        int[] ints = bubbleSort.bubbleSort(x);

        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, ints);

    }
}