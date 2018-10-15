package com.algorithm;

public class Algorithms {

    public static void swap(int[] arreglo, int a, int b) {
        int aux = arreglo[a];
        arreglo[a] = arreglo[b];
        arreglo[b] = aux;
    }
}
