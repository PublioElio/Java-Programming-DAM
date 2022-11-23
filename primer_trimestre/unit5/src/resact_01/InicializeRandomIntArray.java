package resact_01;

import java.util.Arrays;

/**
 * This program declares an integer array, fills it with random numbers from '1'
 * to '100' and sums the numbers, showing the total on console
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class InicializeRandomIntArray {

    public static void main(String[] args) {
        int array[] = new int[10];
        int totalNum = 0;

        Arrays.fill(array, (int) (Math.random() * 100 + 1));

        for (int num : array) {
            totalNum += num;
        }

        System.out.printf("""
                          The sum of the aleatory 100 numbers of the array is: %d
                          """, totalNum);

    }

}
