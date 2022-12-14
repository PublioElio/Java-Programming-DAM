package appact_20;

import java.util.Arrays;

/**
 * This program merges two sorted arrays in a new one with all elements sorted
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MergeTwoSortedArrays {

    /**
     * This function compares two sorted arrays and copies them in a thir array
     *
     * @param array1
     * @param array2
     * @param array3
     */
    static void mergeSorted(int[] array1, int[] array2, int[] array3) {
        int n1 = array1.length, n2 = array2.length, index1 = 0, index2 = 0,
                index3 = 0;

        while (index1 < n1 && index2 < n2) {
            array3[index3++] = array1[index1] < array2[index2]
                    ? array1[index1++] : array2[index2++];
        }
        while (index1 < n1) {
            array3[index3++] = array1[index1++];
        }
        while (index2 < n2) {
            array3[index3++] = array2[index2++];
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = new int[array1.length + array2.length];
        mergeSorted(array1, array2, array3);
        System.out.println("First sorted array: " + Arrays.toString(array3));

        int[] array4 = {1, 8, 12, 12, 20};
        int[] array5 = {3, 6, 7, 10, 14, 14};
        int[] array6 = new int[array4.length + array5.length];

        mergeSorted(array4, array5, array6);

        System.out.println(
                "Second sorted array: " + Arrays.toString(array6));
    }
}
