package resact_11;

import java.util.Scanner;

/**
 * This program calculates the annual benefits in a fruit store that sells pears
 * and apples (kg prices are fixed)
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class FruitStoreCalculator {

    public static void main(String[] args) {
        int appleKg, pearKg;
        double APPLE_PRICE = 2.35, PEAR_PRICE = 1.95, annualBenefits;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of apples sold "
                + "during the first semester (in kilos): ");
        appleKg = sc.nextInt();
        System.out.println("Enter number of apples sold "
                + "during the second semester (in kilos): ");
        appleKg += sc.nextInt();
        System.out.println("Enter number of pears sold "
                + "during the first semester (in kilos): ");
        pearKg = sc.nextInt();
        System.out.println("Enter number of pears sold "
                + "during the second semester (in kilos): ");
        pearKg += sc.nextInt();
        annualBenefits = (APPLE_PRICE * appleKg) + (PEAR_PRICE * pearKg);
        System.out.println("The benefits this year are: "
                + annualBenefits + "€");
    }
}
