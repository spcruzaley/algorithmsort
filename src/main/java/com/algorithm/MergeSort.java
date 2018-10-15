package com.algorithm;

public class MergeSort implements Cloneable {

    public static void sort(int[] a) {
        int[] b = new int[a.length];
        int n = a.length;

        System.arraycopy(a, 0, b, 0, n);
        topDownSplitMerge(b, 0, n, a);
        System.arraycopy(b, 0, a, 0, n);
    }

    private static void topDownSplitMerge(int[] b, int begin, int end, int[] a) {
        if (end - begin < 2) {
            return;
        }

        int middle = (end + begin) >> 1;

        topDownSplitMerge(a, begin, middle, b);
        topDownSplitMerge(a, middle, end, b);
        topDownMerge(b, begin, middle, end, a);
    }

    private static void topDownMerge(int[] b, int begin, int middle, int end, int[] a) {
        int i = begin;
        int j = middle;

        for (int k = begin; k < end; k++) {
            if (i < middle && (j >= end || a[i] <= a[j])) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
        }
    }
}
