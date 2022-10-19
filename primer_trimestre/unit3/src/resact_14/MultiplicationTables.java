package resact_14;

/**
 * This program shows the multiplication tables from one to ten
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class MultiplicationTables {

    public static void main(String[] args) {
        int res;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("--------------TABLE OF %d---------------\n",
                    i);
            for (int j = 1; j <= 10; j++) {
                res = i * j;
                System.out.printf("%d X %d = %d\n",
                        i, j, res);
            }
        }
    }

}
