package resact_05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program asks for a lenght an a range limit, then creates a list with
 * those parameters, filled with random even numbers, and prints it on terminal
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class FillEvenNumbers {

    public static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void bubbleSort(int[] array) {
        boolean swapped = false;
        int last = 0;

        do {
            swapped = false;
            for (int i = 0; i < (array.length - 1 - last); i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            last++;
        } while (swapped);
    }

    /**
     * This function gets the parameters for the list (length and end of range)
     *
     * @param min the minimum value to return
     * @return a positive integer number
     */
    static int getListParameters(int min) {
        int length;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            length = sc.nextInt();
            if (length < 1) {
                System.out.printf("ERROR: minimun value '%d'. ", min);
            }
        } while (length < 1);

        return (length);
    }

    /**
     * This function creates a list and fills it whith random even numbers
     *
     * @param length the length of the list
     * @param end the maximun range of even numbers
     * @return the filled list
     */
    static int[] fillEvenList(int length, int end) {
        int counter = 0, num;
        int list[] = new int[length];
        while (counter < length) {
            num = (int) (Math.random() * end) + 1;
            if (num % 2 == 0) {
                list[counter] = num;
                counter++;
            }

        }
        bubbleSort(list);
        return (list);
    }

    /**
     * This function prints a list on console
     *
     * @param list the list to print
     */
    static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (i == (list.length - 1)) {
                System.out.printf("%d.\n", list[i]);
            } else {
                System.out.printf("%d, ", list[i]);
            }
        }
    }

    public static void main(String[] args) {
        int length, end;
        System.out.print("List length. ");
        length = getListParameters(1);
        System.out.print("Range limit. ");
        end = getListParameters(2);
        int list[] = fillEvenList(length, end);
        System.out.printf("The sorted list with random even numbers is: ");
        printList(list);
    }

}
