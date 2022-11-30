package resact_07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program ask the user to create a new array, then creates a copy of that
 * array, but without repeated elements
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CopyNonRepeatedElements {

    /**
     * This function ask the user for a size of the list
     *
     * @param message the message to show to the user
     * @param error the error message to show in terminal
     * @return an positive integer number (minimum value of '1')
     */
    static int getListSize(String message, String error) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            size = sc.nextInt();
            if (size <= 0) {
                System.out.print(error);
            }
        } while (size <= 0);
        return (size);
    }

    /**
     * This function ask the user to fill the list with integers
     *
     * @param size the length of the list
     * @return the filled list
     */
    static int[] getListElements(int size) {
        int[] filledList = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < filledList.length; i++) {
            System.out.printf("Enter number for position %d: ", i);
            filledList[i] = sc.nextInt();
        }
        return (filledList);
    }

    /**
     * This function prints a list on terminal
     *
     * @param list the list to print
     */
    static void printList(int[] list) {
        for (int num : list) {
            System.out.print(num);
        }
    }

    /**
     * This function searchs for a value in an array
     *
     * @param list the array to make the search
     * @param key the value to find in the array
     * @return the first position where the value is found, or '-1' if the value
     * isn't in the array
     */
    static int search(int list[], int key) {
        int pos = -1;
        for (int i = 0; (i < list.length) && (pos == -1); i++) {
            pos = list[i] == key ? i : -1;
        }
        return (pos);
    }

    /**
     * This function creates a copy of a given array, filling it with
     * non-repeated elements
     *
     * @param list the list to copy
     * @return a new array without repeated elements
     */
    static int[] nonRepeated(int[] list) {
        int[] newList = new int[0];
        for (int element : list) {
            if (search(newList, element) == -1) {
                newList = Arrays.copyOf(newList, newList.length + 1);
                newList[newList.length - 1] = element;
            }
        }

        return (newList);
    }

    public static void main(String[] args) {
        int list[];
        int size = getListSize("Enter the size of the list: ",
                "ERROR: list size minimum '1'. ");
        list = getListElements(size);
        System.out.println("Original list: ");
        printList(list);
        list = nonRepeated(list);
        System.out.println("\nList without repeated elements: ");
        printList(list);
        System.out.println();
    }

}
