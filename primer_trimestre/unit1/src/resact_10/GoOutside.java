package resact_10;

import java.util.Scanner;

/**
 * This program checks if some conditions are met to allow the user to go
 * outside
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GoOutside {

    public static void main(String[] args) {
        boolean rain, tasks, library;
        Scanner sc = new Scanner(System.in);
        System.out.print("Is it raining? (true/false) ");
        rain = sc.nextBoolean();
        System.out.print("Do you have any task to do at home? (true/false) ");
        tasks = sc.nextBoolean();
        System.out.print("Do you have to go to the library? (true/false) ");
        library = sc.nextBoolean();
        if ((rain || tasks) && !library) {
            System.out.println("Maybe you should stay home :(");
        } else {
            System.out.println("It's ok to go outside!");
        }
    }
}
