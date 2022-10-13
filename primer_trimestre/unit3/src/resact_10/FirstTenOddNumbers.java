package resact_10;

/**
 * This program shows the Sum of first 10 odd numbers
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class FirstTenOddNumbers {

    public static void main(String[] args) {
        int num = 0, j = 1;
        for (int i = 1; j <= 10; i++) {
            if ((i % 2) != 0) {
                num += i;
                System.out.println(i);
                j++;
            }
        }
        System.out.printf("The total of the 10 first odd numbers is:"
                + " %d\n", num);
    }

}
