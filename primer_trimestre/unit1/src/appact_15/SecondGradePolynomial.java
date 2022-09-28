package appact_15;

import java.util.Scanner;

/**
 * This program solves a 2º grade polynomial: first, with the value of 'x',
 * later calculating value of 'x'
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SecondGradePolynomial {

    public static void main(String[] args) {
        int a, b, c;
        double d, x, y;
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
        System.out.println("""
                           -----------------------------------------------------
                           Without 'x':""");
        d = (b * b) - (4 * a * c);
        x = (-b - Math.sqrt(d)) / (2 * a);
        System.out.printf("\nFirst result of 'x' %,.2f\n", x);
        y = ((a * (x * x)) + (b * x) + c);
        System.out.printf("\nValue of 'y': %,.2f\n", y);
        x = (-b + Math.sqrt(d)) / (2 * a);
        System.out.printf("\nSecond result of 'x' %,.2f\n", x);
        y = ((a * (x * x)) + (b * x) + c);
        System.out.printf("\nValue of 'y': %,.2f\n", y);

    }
}
