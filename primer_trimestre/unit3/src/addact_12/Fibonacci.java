package addact_12;

import java.util.Scanner;

/**
 * This program prints fibonacci series until a given number
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Fibonacci {

    static int reN1 = 0, reN2 = 1, reN3 = 0; // static variables to use in recursive function

    public static void main(String[] args) {
        int position;
        position = get_number();
        fibonacci(position);
        System.out.println("\n------------RECURSIVE FIBONACCI--------------");
        System.out.print("0 1 ");
        re_fibonacci(position - 2);
        System.out.println();
    }

    /**
     * This function gets a positive integer number from console
     *
     * @return num, a positive integer number
     */
    static int get_number() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            if (num <= 0){
                System.out.println("Error: invalid imput");
            }
        } while (num <= 0);
        return (num);
    }

    /**
     * This program prints fibonacci series with a loop
     *
     * @param position
     */
    public static void fibonacci(int position) {
        int n1 = 0, n2 = 1, n3;
        System.out.printf("%d %d ", n1, n2);
        for (int i = 2; i < position; i++) { //loop starts from 2 because 0 and 1 are already printed
            n3 = n1 + n2;
            System.out.printf("%d ", n3);
            n1 = n2;
            n2 = n3;
        }
    }

    /**
     * This function prints fibonacci series recursively
     *
     * @param position
     */
    static void re_fibonacci(int position) {
        if (position > 0) {
            reN3 = reN1 + reN2;
            reN1 = reN2;
            reN2 = reN3;
            System.out.printf("%d ", reN3);
            re_fibonacci(position - 1); // decreasing position value
        }
    }

}
