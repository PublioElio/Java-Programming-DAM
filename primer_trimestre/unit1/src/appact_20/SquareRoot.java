package appact_20;

/**
 * This program calculates the square root of a given number, but without import
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SquareRoot {

    public static void main(String[] args) {
        double num;
        System.out.println("Enter a number to calculate square root: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        num = sc.nextDouble();
        System.out.println("The square root of " + num
                + " is " + java.lang.Math.sqrt(num));
    }
}
