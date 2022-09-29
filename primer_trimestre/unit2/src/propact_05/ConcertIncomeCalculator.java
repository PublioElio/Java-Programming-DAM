package propact_05;

import java.util.Scanner;

/**
 * This program calculates the income of a concert. If the concert has less than
 * 20% of tickets sold, is cancelled. If the concert has less than 50% of the
 * tickets sold, applies a 25% discount in ticket price
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class ConcertIncomeCalculator {

    public static void main(String[] args) {
        double capacity, price, ticketsSold, income;
        boolean discount = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity: ");
        capacity = sc.nextDouble();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        System.out.print("Enter tickets sold: ");
        ticketsSold = sc.nextDouble();
        if (ticketsSold <= (capacity * 0.20)) {
            System.out.println("Concert cancelled!");
        } else {
            if (ticketsSold <= (capacity * 0.50)) {
                discount = true;
            }
            income = discount ? ticketsSold * (price * 0.75) : ticketsSold * price;
            System.out.printf("""
                              The total income for this concert is %,.2f\u20ac
                              """, income);
        }
    }
}
