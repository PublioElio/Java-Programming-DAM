package appact_13;

import java.util.Scanner;

/**
 * This program displais the first 'n' even numbers
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ShowPairs {

    /**
     * This function gets a positive integer number
     *
     * @return a positive integer
     */
    static int getNum() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer and the program will "
                    + "display that many first even numbers: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.print("ERROR: invalid imput. ");
            }
        } while (n < 0);
        return (n);
    }

    /**
     * This function prints on terminal the first 'n' even numbers
     *
     * @param n the amount of even numbers to show
     */
    static void showPairs(int n) {
        for (int i = 0; n > 0; i++) {
            if ((i % 2) == 0) {
                System.out.printf("%d ", i);
                n--;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        n = getNum();
        showPairs(n);
    }
}
