package resact_13;

import java.util.Scanner;

/**
 * This progam calculates the report card and the academic record of a student
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ReportCard {
    public static void main(String[] args)
    {
        int rating1, rating2, rating3, reportCard;
        double academicRecord;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter califications for the first assessment: ");
        rating1 = sc.nextInt();
        System.out.println("Enter califications for the second assessment: ");
        rating2 = sc.nextInt();
        System.out.println("Enter califications for the third assessment: ");
        rating3 = sc.nextInt();
        academicRecord = (rating1 + rating2 + rating3) / 3.0;
        reportCard = (int)academicRecord;
        System.out.println("-----------------------------------\n Report Card: " 
                + reportCard + "\t\tAcademic Record: " + academicRecord);         
    }
}
