package appact_19;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SquareRoot {

    public static void main(String[] args) {
        int a;
        double sqrt, i = 1;
        a = get_num();
        sqrt = Math.sqrt(a);
        for(; Math.pow(i, 2) <= sqrt; i++){
        }
        
        i = sqrt > i ? sqrt - i : i;
    }

    /**
     * Gets a integer positive number from console
     *
     * @return an integer positive number
     */
    public static int get_num() {
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
        } while (num > 0);
        return (num);
    }

}
