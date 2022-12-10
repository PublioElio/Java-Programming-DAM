package appact_14;

import java.util.Scanner;
import java.util.Locale;

/**
 * This program asks for an array size, then fills it with real numbers, sorting
 * the array from maximun value to minimum, getting the higher value and
 * calculating the arithmetic mean
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Survey {

    /**
     * This function gets a positive real number, with minimum value of '1'
     *
     * @param message a message to show on terminal
     * @param errorMessage an error message to show on terminal
     * @return a real number
     */
    static double getPositiveNumber(String message, String errorMessage) {
        double num;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        do {
            System.out.print(message);
            num = sc.nextDouble();
            if (num < 1) {
                System.out.print(errorMessage);
            }
        } while (num < 1);
        return (num);
    }

    /**
     * This function fills an array with real numbers
     *
     * @param array the array to fill
     */
    static void getSalary(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getPositiveNumber(
                    "Enter salary for position " + i + " : ",
                    "ERROR: salary must be minimum '1'. ");
        }
    }

    /**
     * This function swaps two elements in an array of real numbers
     *
     * @param array
     * @param i first position to swap
     * @param j second position to swap
     */
    static void swap(double[] array, int i, int j) {
        double aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    /**
     * This function makes a reversed selection sort of an array of real numbers
     *
     * @param array the array to sort
     */
    static void reverseSelectionSort(double[] array) {
        int max;
        for (int i = 0; i < array.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < array.length; j++) {
                max = array[j] > array[max] ? j : max;
            }
            if (max != i) {
                swap(array, max, i);
            }
        }
    }

    /**
     * This function gets the maximun value in an array
     *
     * @param array
     * @return the maximun value
     */
    static double getMaxSalary(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        return (max);
    }

    /**
     * This function makes the arithmetic mean of all the values in an array
     *
     * @param array
     * @return the arithmetic mean
     */
    static double getArithmeticMean(double[] array) {
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean += array[i];
        }
        return (mean /= array.length);
    }

    /**
     * This function prints an array on terminal
     *
     * @param array
     */
    static void printArray(double[] array) {
        for (double salary : array) {
            System.out.print(salary + " ");
        }
    }

    public static void main(String[] args) {
        double maxSalary, arithmeticMean;
        int surveyTotal = (int) getPositiveNumber(
                "Enter the total number of surveys taken: ",
                "ERROR: number of surveys minimum '1'. ");

        double[] surveys = new double[surveyTotal];
        getSalary(surveys);
        reverseSelectionSort(surveys);
        maxSalary = getMaxSalary(surveys);
        arithmeticMean = getArithmeticMean(surveys);


        /* result prints */
        System.out.print("Array reversed: ");
        printArray(surveys);
        System.out.println("\nMax value: " + maxSalary);
        System.out.println("Arithmetic mean: " + arithmeticMean);

    }

}
