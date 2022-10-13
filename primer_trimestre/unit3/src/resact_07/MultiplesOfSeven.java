package resact_07;

/**
 * This program prints all multiples of 7 from 1 to 100
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MultiplesOfSeven {

    public static void main(String[] args) {
        int multiple;
        for (int i = 1; i <= 100; i++) {
            if ((i % 7) == 0) {
                System.out.printf("%d is multiple of 7\n", i);
            }
        }
    }
}
