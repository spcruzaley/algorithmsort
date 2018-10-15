package com.algorithm;

public class SelectionSort {

    public static void sort(int[] arreglo) {
        int n = arreglo.length;

        for (int j = 0; j < n; j++) {
            int iMin = j;
            for (int i = j + 1; i < n; i++) {
                if (arreglo[i] < arreglo[iMin]) {
                    iMin = i;
                }
            }

            if (iMin != j) {
                Algorithms.swap(arreglo, j, iMin);
            }
        }
    }
}
