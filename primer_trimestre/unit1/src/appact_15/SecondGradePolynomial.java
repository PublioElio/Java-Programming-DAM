package appact_15;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SecondGradePolynomial {
    public static void main(String[] args){
        int a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 'a':");
        a = sc.nextInt();
        System.out.println("Enter value of 'b':");
        b = sc.nextInt();
        System.out.println("Enter value of 'c':");
        c = sc.nextInt();
        System.out.println("Enter value of 'x':");
        x = sc.nextInt();
        y = ((a * (x * x)) + (b * x) + c);
        System.out.println("The result of 'y = ax^2 + bx + c' is: " + y);
    }
}
