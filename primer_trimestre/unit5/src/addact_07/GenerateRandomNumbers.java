package addact_07;

import java.util.Scanner;

/**
 * This program generates 100 random numbers from 0 to 20, separated by spaces.
 * The program asks two values ​​and then changes all occurrences of the first
 * value for the second value in the array. The numbers that have changed are
 * printed quoted.
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class GenerateRandomNumbers {

    /**
     * This function generates random elements of value 0-20 to fill an array
     *
     * @param array
     */
    static void generateRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21);
        }
    }

    /**
     * This function gets an integer number from the user
     *
     * @param minValue the minimum value to ve requested
     * @param maxValue the maximum value to ve requested
     * @param message a messaje to show to the user
     * @param errorMessage an error message if a minimum and maximum values
     * isn't entered
     * @return an integer
     */
    static int getInteger(int minValue, int maxValue, String message,
            String errorMessage) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < minValue || num > maxValue) {
                System.out.println(errorMessage);
            }
        } while (num < minValue || num > maxValue);

        return (num);
    }

    /**
     * This function gets an integer number from the user
     *
     * @param message a messaje to show to the user
     * @return an integer
     */
    static int getInteger(String message) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        num = sc.nextInt();
        return (num);
    }

    /**
     * This function changes a value to another in an array
     *
     * @param array
     * @param num1 the value to change
     * @param num2 the new value
     */
    static void changeValues(int[] array, int num1, int num2) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == num1 ? num2 : array[i];
        }
    }

    /**
     * This function prints an array followed by an space
     *
     * @param array
     */
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    /**
     * This function prints an array followed by an space, and a specific value
     * quoted
     *
     * @param array
     * @param quoted the value to print quoted
     */
    static void printArray(int[] array, int quoted) {
        for (int num : array) {
            if (num == quoted) {
                System.out.printf("'%d' ", num);
            } else {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        generateRandomNumbers(array);
        System.out.println("Original array: ");
        printArray(array);
        System.out.println();
        int num1 = getInteger(0, 20,
                "Enter number to change in array: ",
                "ERROR: min value '0', maximum value '20'. ");
        int num2 = getInteger("Enter another number to change in array: ");
        changeValues(array, num1, num2);
        System.out.println("New array: ");
        printArray(array, num2);
        System.out.println();
    }
}
