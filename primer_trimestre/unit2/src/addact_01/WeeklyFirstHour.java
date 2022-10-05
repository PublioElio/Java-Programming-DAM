package addact_01;

import java.util.Scanner;

/**
 * This program asks for a day of the week and shows what subject is at first 
 * hour in the morning
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class WeeklyFirstHour {
    public static void main(String[] args){
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.print("What day of the week do you want to check? ");
        day = sc.next();
        day = day.toLowerCase();
        switch (day){
            case "monday", "friday" ->
                System.out.println("Free hour!");
            case "tuesday", "wednesday", "thursday" ->
                System.out.println("Markup languages");
            default ->
                System.out.println("Wrong imput");
        }
    }
}
