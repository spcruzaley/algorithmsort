package com.algorithm;

public class BubbleSort {

    public static void sort(int[] arreglo) {
        int n = arreglo.length;

        for (int j = 0; j < n; j++) {
            for (int i = 1; i < n - j; i++) {
                if (arreglo[i - 1] > arreglo[i]) {
                    Algorithms.swap(arreglo, i - 1, i);
                }
            }
        }
    }
}
