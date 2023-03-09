package org.example.sorting;

public class BubbleSort {

    public int[] bubbleSort(int arr[]) {

        int last = arr.length;

        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < last - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap = true;
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                }
            }
            last--;
        } while (swap);

        return arr;
    }
}
