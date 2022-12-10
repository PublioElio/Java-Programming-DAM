package appact_17;

import java.util.Scanner;
import java.util.Arrays;

/**
 * This program contains a function that gets an array and a number of elements,
 * returning a new array with the consecutive sum of that number of elements of
 * the previous array
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class AddElements {

    /**
     * This function gets a positive number from console with minimum value of
     * '1'
     *
     * @param message a message to show on console
     * @param errorMessage an error message
     * @return the positive integer number
     */
    static int getPositiveNumber(String message, String errorMessage) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < 1) {
                System.out.print(errorMessage);
            }
        } while (num < 1);
        return (num);
    }

    /**
     * This function gets an array an a number of elements, returning a new
     * array with the consecutive number of elements added (from the previous
     * array)
     *
     * @param array the original array
     * @param numElements the number of consecutive elements to be added
     * @return a new array
     */
    static int[] sum(int array[], int numElements) {
        int newSize = array.length - (numElements - 1), counter;
        int[] newArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            counter = 0;
            while (counter < numElements) {
                newArray[i] += array[counter + i];
                counter++;
            }
        }
        return (newArray);
    }

    public static void main(String[] args) {
        int numElements;
        int[] num = {10, 1, 5, 8, 9, 2};
        System.out.println("The original array is: "+ Arrays.toString(num));
        numElements = getPositiveNumber(
                "Enter the number of consecutive elements to be added: ",
                "ERROR: minimum value of '1'. ");
        int[] newNum = sum(num, numElements);
        System.out.println("The new array is: " + Arrays.toString(newNum));
    }
}
