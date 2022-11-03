package addact_09;

import java.util.Scanner;

/**
 * This program ask for a number and shows the number of digits
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class KnowDigits {

    public static void main(String[] args) {
        int num, digits = 0;
        num = get_num();
        do {
            num /= 10;
            digits++;
        } while (num != 0);
        System.out.printf("That number has %d digits\n", digits);
    }

    /**
     * This function gets a positive integer number from the user
     *
     * @return a positive integer number
     */
    static int get_num() {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("That's not a valid imput");
            }
        } while (num < 0);
        return (num);
    }
}
