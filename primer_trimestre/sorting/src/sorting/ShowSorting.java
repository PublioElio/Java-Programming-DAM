package sorting;

import java.util.Arrays;

public class ShowSorting {

    public static void main(String[] args) {

        int[] numeros = {29, 10, 14, 37, 14, 25, 3};
        System.out.println("Unsorted array: " + Arrays.toString(numeros));

        SortingAlgorithms.bubbleSort(numeros);
        System.out.println("Bubble sort: " + Arrays.toString(numeros));

        int[] numeros2 = {29, 10, 14, 37, 14, 25, 3};
        SortingAlgorithms.selectionSort(numeros2);
        System.out.println("Selection sort: " + Arrays.toString(numeros2));

        int[] numeros3 = {29, 10, 14, 37, 14, 25, 3};
        SortingAlgorithms.insertionSort(numeros3);
        System.out.println("Isertion sort: " + Arrays.toString(numeros3));
    }

}
