package resact_01;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class EvenPositiveSquare {

    public static void main(String[] args) {
        int num, pow;
        boolean even, positive;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (write '0' to end program): ");
        num = sc.nextInt();
        while (num != 0) {
            even = (num % 2) == 0;
            positive = (num > 0);
            pow = (int) Math.pow(num, 2);
            System.out.printf("""
                               Is %d even? %b
                               Is %d positive? %b
                               %d squared is '%d' 
                               """, num, even, num, positive, num, pow);
            System.out.print("Enter a number (write '0' to end program): ");
            num = sc.nextInt();
        }
    }
}
