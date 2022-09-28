package appact_12_13;

import java.util.Scanner;

/**
 * This program calculates how much is needed to make 'n' multiple of seven, and
 * asks for a second imput (m) to calculate how much is needed to make 'n' 
 * multiple of 'm'
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MultipleOf {
    public static void main(String[] args){
        int n, m, dif;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        dif = n % 7;
        dif = (dif - 7) < 0 ? (dif - 7) * -1 : dif - 7;
        dif = dif == n ? 0 : dif;
        System.out.printf("""
                          You must add %d to %d to make it multiple of seven
                          """, dif, n);
        System.out.println("""
                           
                           -----------------------------------------------
                           
                           Enter a second number: """);
        m = sc.nextInt();
        dif = n % m;
        dif = (dif - m) < 0 ? (dif - m) * -1 : dif - m;
        dif = dif == n ? 0 : dif;
        System.out.printf("""
                          You must add %d to %d, and it'll be multiple of %d
                          """, dif, n, m);
    }
}
