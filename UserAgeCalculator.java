package useragecalculator;

import java.util.Scanner;
import java.time.Year;

/**
 * This program calculates the actual age of the user, 
 * the present year and the next one. Also, tells the user if is 18 years old.
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class UserAgeCalculator {
    
    public static void main(String[] args)
    {
        int age, birthDate;
        boolean adulthood;
        int actualYear = Year.now().getValue(); // to get the actual year
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert your year of birth: ");
        birthDate = sc.nextInt();
        age = actualYear - birthDate;
        System.out.println("Now, you have " + age + " years.");
        age++;
        System.out.println("The next year, you'll have " 
                + age + " years");
        adulthood = age >= 18;
        if(adulthood){
            System.out.println("You're an adult");
        }else{
            System.out.println("You're not an adult");
        }
    }
}
