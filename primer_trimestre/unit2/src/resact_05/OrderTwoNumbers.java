package resact_05;

import java.util.Scanner;

/**
 * This program asks for two numbers to arrange using the ternary operator
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class OrderTwoNumbers {
    public static void main(String[] args){
        int n1, n2, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        n2 = sc.nextInt();
        max = n1 > n2 ? n1 : n2;
        min = n1 < n2 ? n1 : n2;
        System.out.printf("Numbers in descending order: %d, %d\n",
                max, min);
        System.out.println("""
                           -----------------------------------------------------
                           Alternative solution:\n""");
        if (n1 > n2)
            System.out.printf("Numbers in descending order: %d, %d\n",
                n1, n2);
        else
            System.out.printf("Numbers in descending order: %d, %d\n",
                n2, n1);
    }
}
