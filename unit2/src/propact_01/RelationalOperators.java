package propact_01;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class RelationalOperators {

    public static void main(String[] args) {
        int a, b;
        boolean c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first variable: ");
        a = sc.nextInt();
        System.out.println("Enter second variable: ");
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
        System.out.printf("It's %d greater than %d? %b\n",
                a, b, c);
    }
    
}
