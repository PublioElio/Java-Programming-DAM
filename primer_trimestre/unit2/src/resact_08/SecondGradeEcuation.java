package resact_08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SecondGradeEcuation {
    public static void main(String[] args){
        double a, b, c, d, x1, x2;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter a coefitient (a): ");
        a = sc.nextDouble();
        System.out.println("Enter a coefitient (b): ");
        b = sc.nextDouble();
        System.out.println("Enter a coefitient (c): ");
        c = sc.nextDouble();
        d = (Math.pow(b, 2) - (4 * a * c));
        if (d < 0)
            System.out.println("Error: negative square root");
        else {
            if (a == 0)
                System.out.println("Error: isn't a second grade ecuation");
            else{
                x1 = (-b + Math.sqrt(d) / (2 * a));
                x2 = (-b - Math.sqrt(d) / (2 * a));
                System.out.printf("Solution 1: %,.2f\n", x1);
                System.out.printf("Solution 2: %,.2f\n", x2);
            }
        }
    }
}
