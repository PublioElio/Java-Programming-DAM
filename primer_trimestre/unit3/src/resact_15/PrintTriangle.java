package resact_15;

import java.util.Scanner;

/**
 * This program prinst a triangle with sides entered by the user
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrintTriangle {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        num = sc.nextInt();
        num = Math.abs(num);
        for (int row = 0; row < num; row++) {
            for (int j = num; j > row; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
