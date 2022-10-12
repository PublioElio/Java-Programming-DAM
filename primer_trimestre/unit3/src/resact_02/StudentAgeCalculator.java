package resact_02;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class StudentAgeCalculator {
    public static void main(String[] args){
        int studentAge, sumAge, totalStudents, adults;
        double average;
        
        sumAge = 0;
        adults = 0;
        average = 0;
        totalStudents = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student age, imput a negative number to stop "
                + "program: ");
        studentAge = sc.nextInt();
        while(studentAge > 0){
            sumAge += studentAge;
            totalStudents++;
            adults = studentAge > 17 ? adults + 1 : adults ;
            average = sumAge / (totalStudents * 1.0);
            System.out.print("Enter student age, imput a negative number"
                    + " to stop program: ");
            studentAge = sc.nextInt();
        }
        System.out.printf("The sum of all ages is: %d ||"
                + " The total number of students is: %d ||"
                + " The number of adult students is: %d ||"
                + " The average age is: %,.1f \n",
                sumAge, totalStudents, adults, average);
    }
}
