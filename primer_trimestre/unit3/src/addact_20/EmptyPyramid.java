package addact_20;

import java.util.Scanner;

/**
 * This program asks for a symbol and a height and prints a empty pyramid with
 * that two parameters
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class EmptyPyramid {

    public static void main(String[] args) {
        int h, test;
        char c;
        h = get_height();
        c = get_char();
        for (int i = 0; i < h; i++) {
            for (int j = i; j < h; j++) { // print blank spaces before character
                System.out.print(" ");
            }
            /* the next loop prints character and empty spaces inside the pyramid */
            for (int k = 0; k <= i; k++) {
                if ((k == 0) || (k == i) || (i == (h - 1))) {
                    System.out.printf("%c ", c);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    /**
     * This function gets a char from console
     *
     * @return the entered char
     */
    static char get_char() {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to draw the pyramid: ");
        c = sc.next(".").charAt(0); // this takes strictly one character
        return (c);
    }

    /**
     * This function gets a positive integer number
     *
     * @return a positive int
     */
    static int get_height() {
        int h;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the height of the pyramid: ");
            h = sc.nextInt();
            if (h <= 0) {
                System.out.println("Height must be a positive integer number");
            }
        } while (h <= 0);
        return (h);
    }

}
