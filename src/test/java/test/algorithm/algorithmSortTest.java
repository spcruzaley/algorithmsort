package test.algorithm;

import com.algorithm.*;
import org.junit.Test;

import java.util.Arrays;

public class algorithmSortTest {

    @Test
    public void insertionSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};
        InsertionSort.sort(array);

        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

    @Test
    public void selectionSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};
        SelectionSort.sort(array);

        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

    @Test
    public void bubbleSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};
        BubbleSort.sort(array);

        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

    @Test
    public void shellSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] gaps = {50, 40, 30, 20, 10, 5, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};

        ShellSort.sort(array, gaps);
        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

    @Test
    public void mergeSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};

        MergeSort.sort(array);
        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

    @Test
    public void heapSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};

        HeapSort.sort(array);
        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

    @Test
    public void quickSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};
        int n = array.length;

        QuickSort.sort(array, 0, n-1);
        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

    @Test
    public void radixSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arraySorted = {1, 2, 3, 4, 5};
        int n = array.length;

        RadixSort.sort(array, n);
        assert Arrays.toString(array).equals(Arrays.toString(arraySorted));
    }

}
