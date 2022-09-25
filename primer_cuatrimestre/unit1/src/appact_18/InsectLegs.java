package appact_18;

import java.util.Scanner;

/**
 * This program calculates the total number of legs for a quantity of ants,
 * spiders and multipeds entered by the user.
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class InsectLegs {
    public static void main(String[] args){
        int ants, spiders, pillBugs, totalLegs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ants: ");
        ants = sc.nextInt();
        System.out.println("Enter spiders: ");
        spiders = sc.nextInt();
        System.out.println("Enter pill bugs: ");
        pillBugs = sc.nextInt();
        totalLegs = (ants * 6) + (spiders * 8) + (pillBugs * 14);
        System.out.printf("The total number of legs is %d\n",
                totalLegs);
    }
}
