package resact_03;

import java.util.Scanner;

/**
 * This program ask the user for the length of an array, then the user enters
 * the elements of the array and the program shows the elements in reverse order
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrintReverseList {

    /**
     * This function gets a positive integer number of value '1' or more
     *
     * @return a positive integer number
     */
    static int getPositiveInt() {
        int num;
        do {
            System.out.print("Enter a positive integer number: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num < 1) {
                System.out.print("ERROR: list length must be '1' or more . "
                        + "Enter a positive integer number: ");
            }
        } while (num < 1);
        return (num);
    }

    /**
     * This function asks for an integer value for each element of the array
     *
     * @param list the array to fill of elements
     * @return the list with all the elements
     */
    static int[] fillList(int[] list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("Enter an integer for position %d: ", i);
            list[i] = sc.nextInt();
        }
        return (list);
    }

    /**
     * This function prints on console a list, in reversed order
     *
     * @param list the list to print on console
     */
    static void printReversedList(int[] list) {
        for (int i = (list.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.printf("%d.\n", list[i]);
            } else {
                System.out.printf("%d, ", list[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Length of the array. ");
        int numberList[] = new int[getPositiveInt()];
        numberList = fillList(numberList);
        System.out.print("The elements of the list are: ");
        printReversedList(numberList);

    }

}
