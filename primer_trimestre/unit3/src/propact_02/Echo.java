package propact_02;

import java.util.Scanner;

/**
 * This program prints 'Echo...' on console as many times as a given number
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Echo {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Imput number: ");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println("Echo...");
        }
    }
}
