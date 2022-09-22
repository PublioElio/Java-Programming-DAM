package oddoreven;

import java.util.Scanner;

/**
 * This program asks for a number, and shows if it's odd or even.
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class OddOrEven {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a numer: ");
        num = sc.nextInt();
        if((num % 2) == 0){
            System.out.println("Thats an even number");
        }else{
            System.out.println("That's an odd number");
        }
    }
}
