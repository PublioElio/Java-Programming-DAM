package resact_07;

import java.util.Scanner;

/**
 * This program asks for three numbers to arrange in descending order
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class OrderThreeNumbers {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three different numbers.\nFirst one: ");
        n1 = sc.nextInt();
        System.out.println("Second: ");
        n2 = sc.nextInt();
        System.out.println("Last one: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.printf("Order: %d,%d,%d\n", n1, n2, n3);
                } else {
                    System.out.printf("Order: %d,%d,%d\n", n1, n3, n2);
                }
            } else {
                System.out.printf("Order: %d,%d,%d\n", n3, n1, n2);
            }
        } else if (n1 > n3) {
            System.out.printf("Order: %d,%d,%d\n", n2, n1, n3);
        } else if (n2 > n3) {
            System.out.printf("Order: %d,%d,%d\n", n2, n3, n1);
        } else {
            System.out.printf("Order: %d,%d,%d\n", n3, n2, n1);
        }
    }
}
