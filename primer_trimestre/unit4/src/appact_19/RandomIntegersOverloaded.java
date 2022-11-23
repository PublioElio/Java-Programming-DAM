package appact_19;

import java.util.Scanner;

/**
 * This program shows a serie of random positive integer numbers. The quantity
 * of numbers, and the range can be entered by the user, or the default range
 * will be from '0' to '1'.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class RandomIntegersOverloaded {

    /**
     * This function gets a positive integer number form console
     *
     * @return a positive integer number
     */
    static int getNum() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            if (num < 0) {
                System.out.print("ERROR: only positive integers allowed, "
                        + "enter a positive integer: ");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function prints on screen a range of random positive integer numbers
     *
     * @param quantity the quantity of listed numbers
     * @param min the minimum random value
     * @param max the maximum random value
     */
    static void showRandomIntegers(int quantity, int min, int max) {
        for (int i = 1; i <= quantity; i++) {
            if (i == quantity) {
                System.out.printf("%d.\n",
                        (int) (Math.random() * (max - min + 1)) + min);
            } else {
                System.out.printf("%d, ",
                        (int) (Math.random() * (max - min + 1)) + min);
            }
        }

    }

    /**
     * This function prints a quantity of random integer numbers from '0' to '1'
     *
     * @param quantity the quantity of numbers that will be listed
     */
    static void showRandomIntegers(int quantity) {
        for (int i = 1; i <= quantity; i++) {
            if (i == quantity) {
                System.out.printf("%d.\n",
                        (int) (Math.random() * 2));
            } else {
                System.out.printf("%d, ",
                        (int) (Math.random() * 2));
            }
        }

    }

    /**
     * This function checks if the user wants to define a range for the random
     * integer numbers
     *
     * @return true or false
     */
    static boolean userRange() {
        String answer;
        boolean definedRange = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Do you want to define a range for "
                    + "the random numbers? (yes/no) ");
            answer = sc.nextLine().toLowerCase();
            switch (answer) {
                case "yes" ->
                    definedRange = true;
                case "no" ->
                    definedRange = false;
                default -> {
                    answer = "undefined";
                    System.out.println("ERROR: invalid imput.");
                }
            }
        } while (answer.equals("undefined"));

        return (definedRange);
    }

    public static void main(String[] args) {
        int quantity;
        do {
            System.out.print("Enter the quantity of random integers to show "
                    + "on console: ");
            quantity = getNum();
            if (quantity <= 0) {
                System.out.println("ERROR: must be at least one positive "
                        + "integer number.");
            }
        } while (quantity <= 0);

        if (userRange()) {
            int min, max;
            System.out.print("Enter the minimum base number: ");
            min = getNum();

            do {
                System.out.print("Enter the maximum base number: ");
                max = getNum();
                if (max <= min) {
                    System.out.println("ERROR: maximum value must be higher than "
                            + "minimum.");
                }
            } while (max <= min);

            showRandomIntegers(quantity, min, max);
        } else {
            showRandomIntegers(quantity);
        }
    }

}
