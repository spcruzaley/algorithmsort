package com.algorithm;

public class ShellSort {

    public static void sort(int[] arreglo, int[] gaps) {
        int n = arreglo.length;
        int temp;
        int j;

        for (int gap : gaps) {
            for (int i = gap; i < n; i++) {
                temp = arreglo[i];

                for (j = i; j >= gap && arreglo[j - gap] > temp; j -= gap) {
                    arreglo[j] = arreglo[j - gap];
                }
                arreglo[j] = temp;
            }
        }

    }

}
