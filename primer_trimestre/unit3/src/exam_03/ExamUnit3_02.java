package exam_03;

import java.util.Scanner;

/**
 * This is the exercise 2 of the unit 3 exam
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ExamUnit3_02 {

    public static void main(String[] args) {
        int num, belenDigit;
        num = get_num();

        if ((num % 2) == 0) {
            belenDigit = is_even(num);
        } else {
            belenDigit = is_odd(num);
        }
        System.out.printf("Belén digit: %d\n", belenDigit);
    }

    /**
     * This function gets a integer number of, at least, three digits
     *
     * @return a positive integer number of three digits
     */
    static int get_num() {
        int num;
        boolean validNum;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number with, al least, "
                    + "three digits: ");
            num = sc.nextInt();
            validNum = (num >= 100);
            if (!validNum) {
                System.out.print("Invalid number. ");
            }
        } while (!validNum);
        return (num);
    }

    /**
     * This function takes the highest digit of a number and subtracts the
     * second smallest value of the same number.
     *
     * @param num the number to calculate
     * @return the substracted value
     */
    static int is_even(int num) {
        int firstMin, min = 9, max = 0, digit, aux;
        aux = num;

        while (aux != 0) {
            digit = aux % 10;
            min = digit > min ? min : digit;
            max = digit < max ? max : digit;
            aux /= 10;
        }

        aux = num;
        firstMin = min;
        min = max;

        while (aux != 0) {
            digit = aux % 10;
            min = ((digit < min) && (digit != firstMin)) ? digit : min;
            aux /= 10;
        }

        num = max - min;
        return (num);
    }

    /**
     * This function gets the digit in the middle position of a number
     *
     * @param num the number to operate
     * @return the middle digit
     */
    static int is_odd(int num) {
        int size, middle, digit, belenDigit = 0;
        size = get_num_size(num);

        middle = size / 2;
        size = 0; // we start counting from '0' again to search for the middle

        while (num != 0) {
            digit = num % 10;
            size++;
            belenDigit = (size == middle) ? digit : belenDigit;
            num /= 10;
        }
        return (belenDigit);
    }

    /**
     * This function gets the size of a number in digits
     *
     * @param num the number to calculate size
     * @return the size of the number
     */
    static int get_num_size(int num) {
        int size = 0;
        while (num != 0) {
            size++;
            num /= 10;
        }
        return (size);
    }

}
