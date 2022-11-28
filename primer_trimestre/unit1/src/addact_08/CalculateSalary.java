package addact_08;

import java.util.Scanner;

/**
 * This program calculates an employee's weekly salary based on hours worked, at
 * a rate of 12 euros per hour.
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CalculateSalary {

    public static void main(String[] args) {
        int salary, h, EUROS_HOUR = 12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of hours worked this week: ");
        h = sc.nextInt();
        salary = h * EUROS_HOUR;
        System.out.printf("The salary for this week is %d€\n", salary);
    }

}
