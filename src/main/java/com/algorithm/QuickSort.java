package com.algorithm;

public class QuickSort {

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                Algorithms.swap(arr, i, j);
            }
        }

        Algorithms.swap(arr, i + 1, high);
        return i + 1;
    }

}
