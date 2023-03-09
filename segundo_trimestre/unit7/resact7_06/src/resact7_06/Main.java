package resact7_06;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value, numSeg;
        Hour h = new Hour();
        System.out.print("Hour: ");
        value = sc.nextInt();
        h.setHour(value);
        System.out.print("Minutes: ");
        value = sc.nextInt();
        h.setMin(value);
        System.out.print("Seconds: ");
        value = sc.nextInt();
        h.setSec(value);
        System.out.print("How many seconds do you want to show? ");
        numSeg = sc.nextInt();
        for (int i = 0; i <= numSeg; i++) {
            System.out.println(h.getHour() + ":" + h.getMin() + ":" 
                    + h.getSec());
            h.increaseSecs();
        }

    }

}
