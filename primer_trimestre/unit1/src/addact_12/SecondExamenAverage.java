package addact_12;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program calculates the score that needs to be obtain in a second
 * exam to get the desired average. The first exam counts 40% and the second
 * exam counts 60% of the toal
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SecondExamenAverage {
    public static void main(String[] args){
        double first, second, average;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter first exam score: ");
        first = sc.nextDouble();
        System.out.println("Enter the desired average: ");
        average = sc.nextDouble();
        second = ((average * 100) - (first * 40)) /60;
        System.out.printf("""
                          You need to obtain %,.1f in order to get an %,.1f
                          """,second, average);
    }

}
