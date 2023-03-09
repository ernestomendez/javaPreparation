package org.example.sorting;

public class MergeSort {

    public void mergeSort(int[] arr, int from, int to) {

        if (from < to) {
            int middle = (from + to) / 2;
            mergeSort(arr, from, middle);
            mergeSort(arr, middle + 1, to);
            merge(arr, from, middle, to);
        }
    }

    private void merge(int[] arr, int from, int middle, int to) {

        if (from == to) {
            return;
        }

        int leftSize = middle + 1 - from;
        int rightSize = to - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        System.arraycopy(arr, from, leftArray, 0, leftSize);

        System.arraycopy(arr, middle + 1, rightArray, 0, rightSize);

        int l = 0;
        int r = 0;

        boolean endLeft = false, endRight = false;

        int len = 0;

        while (len < leftSize + rightSize) {
            if (!endRight && leftArray[l] > rightArray[r]) {
                arr[from] = rightArray[r];
                r++;
                from++;
                if (r == rightSize) {
                    endRight = true;
                    r--;
                }
            } else if (!endLeft) {
                arr[from] = leftArray[l];
                l++;
                from++;
                if (l == leftSize) {
                    endLeft = true;
                    l--;
                }
            }
            len++;
        }
        
    }
}
