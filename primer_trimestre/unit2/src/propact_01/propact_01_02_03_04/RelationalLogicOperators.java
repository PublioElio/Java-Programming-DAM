package propact_01_02_03_04;

import java.util.Scanner;

/**
 * This program asks for two integer numbers and make some comparations to check
 * relational operators and logical operators.
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class RelationalLogicOperators {

    public static void main(String[] args) {
        int a, b;
        boolean c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value (positive or negative): ");
        a = sc.nextInt();
        System.out.println("Enter second value (positive or negative): ");
        b = sc.nextInt();
        c = a == b;
        System.out.printf("It's %d equal to %d? %b\n",
                a, b, c);
        c = a != b;
        System.out.printf("It's %d different from %d? %b\n",
                a, b, c);
        c = a < b;
        System.out.printf("It's %d less than %d? %b\n",
                a, b, c);
        c = a <= b;
        System.out.printf("It's %d less or equal than %d? %b\n",
                a, b, c);
        c = a > b;
        System.out.printf("It's %d greater than %d? %b\n",
                a, b, c);
        c = a >= b;
        System.out.printf("""
                          It's %d greater than %d? %b
                          ----------------------------------------------------
                          """,
                a, b, c);
        c = a < 0;
        System.out.printf("""
                          Its %d a negative number? %b
                          ----------------------------------------------------
                          """,
                a, c);
        c = a !=b || (a == 0 || b == 0);
        System.out.printf("""
                          It's %d equal to %d OR any of them is zero? %b
                          ----------------------------------------------------
                          """, a, b, c);
        c = ((a % b) == 0);
        System.out.printf("It's %d multiple of %d? %b\n",
                a, b, c);
    }
    
}
