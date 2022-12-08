package resact_08;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class OddAndEvenArrays {

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
        Arrays.sort(filledList);
        return (filledList);
    }

//    static int getLength(int[] list, boolean isEven) {
//        int length = 0;
//
//        for (int i = 0; i < list.length; i++) {
//if()
//        }
//
//        return (length);
//    }

//    static int[] createList(int[] list, boolean isEven) {
//        int newList[];
//        int counter = 0;
//
//        for (int i = 0; i < list.length; i++) {
//            if (isEven) {
//                if  {
//
//                }
//            } else {
//            }
//        }
//
//        return (newList);
//    }

    public static void main(String[] args) {
        int size;
        int originalList[], evenList[], oddList[];
        size = getListSize("Enter the size of the lists: ",
                "ERROR: list size minimum '1'. ");
        originalList = getListElements(size);
//        evenList = createList(originalList, true);

    }

}
