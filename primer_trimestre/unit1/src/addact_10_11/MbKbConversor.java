package addact_10_11;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MbKbConversor {

    public static void main(String[] args) {
        double data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mb: ");
        data = sc.nextDouble();
        data *= 1024;
        System.out.printf("Those are %d Kb\n", (int) data);
        System.out.println("Enter Kb: ");
        data = sc.nextDouble();
        data /= 1024;
        System.out.printf("Those are %f Mb\n", data);

    }
}
