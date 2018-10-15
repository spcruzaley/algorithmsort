package com.algorithm;

public class InsertionSort {

    public static void sort(int[] array) {
        int i = 0;
        int j = 0;

        while (i < array.length) {
            j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                Algorithms.swap(array, j, j - 1);
                j--;
            }
            i++;
        }
    }
}
