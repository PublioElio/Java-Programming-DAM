package addact_03;

/**
 * This program shows the multiples of five form 0 to 100
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class MultipleOfFive {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 5) == 0) {
                System.out.printf("%d is multiple of 5\n", i);
            }
        }
    }
}
