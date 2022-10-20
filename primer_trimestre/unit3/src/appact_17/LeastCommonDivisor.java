package appact_17;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class LeastCommonDivisor {

    public static void main(String[] args) {
        int a, b, lower, greater, divisor;
        a = get_number();
        b = get_number();
        lower = a > b ? a : b;
        greater = a < b ? a : b;
        divisor = get_least_common_div(lower, greater);
    }

    public static int get_number() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
        } while (num < 0);
        return (num);
    }
    
    public static int get_least_common_div(int lower, int greater){
        int divisor = 0;
//        for(){
//        }
    return (divisor);
    }
}
