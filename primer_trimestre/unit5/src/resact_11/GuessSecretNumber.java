package resact_11;

import java.util.Scanner;

/**
 * This program is a game that consists of guessing a secret password of numbers
 * between '1' and '5', with a length entered by the user. If the user does not
 * get the password, the program will offer clues to get it right on the next
 * try
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GuessSecretNumber {

    /**
     * This function generates a random number between a minimun and a maximum
     *
     * @param min
     * @param max
     * @return
     */
    static int generateRandomNum(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    /**
     * This function compares the content of two array of integers
     *
     * @param a
     * @param b
     * @return true if both arrays are equal
     */
    static boolean equals(int[] a, int[] b) {
        boolean areEqual = false;

        if (a.length == b.length) {
            areEqual = true;
            for (int i = 0; i < a.length && areEqual; i++) {
                areEqual = a[i] == b[i];
            }
        }
        return (areEqual);

    }

    /**
     * This function gets an integer number form the user, between a minimun and
     * a maximum value
     *
     * @param message a message to show to the user
     * @param errorMessage an error message if the imput is incorrect
     * @param min
     * @param max
     * @return
     */
    static int getNumber(String message, String errorMessage, int min, int max) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < min || num > max) {
                System.out.print(errorMessage);
            }
        } while (num < min || num > max);
        return (num);
    }

    /**
     * This function creates an array of integer numbers, between two values. If
     * the numbers aren't random, the function asks the user to fill the array
     * with numbers
     *
     * @param array
     * @param min
     * @param max
     * @param random
     * @return
     */
    static void createArray(int[] array, int min, int max, boolean random) {
        if (random) {
            for (int i = 0; i < array.length; i++) {
                array[i] = generateRandomNum(min, max);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = getNumber("Enter a number for "
                        + "position " + (i + 1) + ": ", "ERROR. Number must be "
                        + "between '" + min + "' and '" + max + "'. ",
                        min, max);
            }

        }
    }

    /**
     * This function prints an array of integer numbers
     *
     * @param array
     */
    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " | ");
            }
        }
        System.out.println("]");
    }

    /**
     * This funcion compares two integer arrays and prints information on
     * console with information of the values of both arrays
     *
     * @param password the array to compare
     * @param userPassword the user array, to guess the password
     */
    static void printClues(int[] password, int[] userPassword) {
        for (int i = 0; i < password.length; i++) {
            System.out.printf("The number entered in position %d is",
                    (i + 1));
            if (password[i] > userPassword[i]) {
                System.out.println(" lower than the exact digit.");
            } else if (password[i] < userPassword[i]) {
                System.out.println(" higher than the exact digit.");
            } else {
                System.out.println(" correct.");
            }
        }
    }

    static public void main(String[] args) {
        boolean winner;
        int[] password = new int[getNumber("Enter password length: ",
                "ERROR. Minimum password length is '0', "
                + "maximum length is '12'. ", 1, 12)];
        int[] userPassword = new int[password.length];

        createArray(password, 1, 5, true);

        printArray(password);

        do {
            createArray(userPassword, 1, 5, false);
            winner = equals(password, userPassword);

            if (!winner) {
                printClues(password, userPassword);
            }

        } while (!winner);

        System.out.println("You guessed the secret number!");
    }
}
