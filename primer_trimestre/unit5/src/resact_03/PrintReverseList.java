package resact_03;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrintReverseList {

    static int getPositiveInt() {
        int num;
        do {
            System.out.print("Enter a positive integer number: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num < 1) {
                System.out.print("ERROR: list lenght must be '1' or more . "
                        + "Enter a positive integer number: ");
            }
        } while (num < 1);
        return (num);
    }

    static int[] fillList(int[] list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("Enter an integer for position %d: ", i);
            list[i] = sc.nextInt();
        }
        return (list);
    }

    static void printReversedList(int[] list) {
        for (int i = (list.length -1); i >= 0; i--) {
            System.out.print(list[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int lenght;
        lenght = getPositiveInt();
        int numberList[] = new int[lenght];
        numberList = fillList(numberList);
        printReversedList(numberList);

    }

}
