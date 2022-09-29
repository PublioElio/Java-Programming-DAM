package appact_19;

import java.util.Scanner;

/**
 * This program calculates the total price of tickets. It asks for the number of
 * adult visitors and children (different prices for each), and applies a 0.5%
 * discount if the total price is 100 or more.
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class TicketPriceCalculator {

    public static void main(String[] args) {
        int adult;
        double child, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many adult visitors?");
        adult = sc.nextInt();
        System.out.println("How many children?");
        child = sc.nextDouble();
        total = adult * 20 + child * 15.50;
        total = total >= 100 ? total - (total * 0.05) : total;
        System.out.printf("The total price is %,.2f€\n", total);
    }
}
