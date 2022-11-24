package resact_04;

import java.util.Scanner;

/**
 * This program asks the user for the length of a list, then the user fills the
 * list and then prints the maximum value on terminal
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class MaxValueArray {

    /**
     * This function gets a positive integer number of minimum value of '1'
     *
     * @return an integer number of minimum value of '1'
     */
    static int getListLength() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.print("ERROR: minimum value of '1'. ");
            }
        } while (n < 1);
        return (n);
    }

    /**
     * This function asks the user to fill a list of values
     *
     * @param list the list to fill elements
     * @return the filled list
     */
    static int[] getListValues(int[] list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("Enter value for postion %d: ", i);
            list[i] = sc.nextInt();
        }
        return (list);
    }

    /**
     * This function gets the maximun value of a list
     *
     * @param list the list to search the maximun value
     * @return the maximun value of the list
     */
    static int getMaxValue(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            max = list[i] > max ? list[i] : max;
        }
        return (max);
    }

    public static void main(String[] args) {
        System.out.print("Length of the list. ");
        int list[] = new int[getListLength()];
        System.out.print("List elements. ");
        list = getListValues(list);
        System.out.printf("The maximum value of this list is %d\n",
                getMaxValue(list));
    }

}
