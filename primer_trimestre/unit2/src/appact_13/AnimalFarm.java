package appact_13;

import java.util.Scanner;

/**
 * This program calculates the daily rations in a livestock farm
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AnimalFarm {

    public static void main(String[] args) {
        int livestockNumber;
        double totalRations, kgPerAnimal, rationsForToday;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the daily rations: ");
        totalRations = sc.nextDouble();
        System.out.print("Enter the total number of animals: ");
        livestockNumber = sc.nextInt();
        System.out.print("Enter the quantity of kgs per animal: ");
        kgPerAnimal = sc.nextDouble();
        if (livestockNumber != 0) {
            rationsForToday = totalRations / (livestockNumber * 1.0);
            if (rationsForToday >= kgPerAnimal) {
                System.out.println("There's enought rations for today!");
            } else {
                System.out.printf("""
                              The rations for today are %,.2fkg per animal
                              """, rationsForToday);
            }
        } else {
            System.out.println("Zero division not allowed!");
        }
    }
}
