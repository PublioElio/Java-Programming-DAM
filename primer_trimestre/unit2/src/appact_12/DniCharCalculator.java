package appact_12;

import java.util.Scanner;

/**
 * This program calculates the last character of a given DNI
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DniCharCalculator {

    static public void main(String[] args) {
        int dni;
        char letter;
        String str = "TRWAGMYFPDXBNJZSQVHLCKE";
        char[] charList = str.toCharArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter DNI number: ");
        dni = sc.nextInt();
        if ((dni > 99_999_999) || (dni < 0)) {
            System.out.print("Wrong imput\n");
        } else {
            dni %= 23;
            System.out.printf("The last character in this DNI is: %s\n",
                    charList[dni]);
        }
        System.out.println("""
                           -----------------------------------------------------
                           Alternative way (with switch): """);
        letter = switch (dni) {
            case 0 ->
                'T';
            case 1 ->
                'R';
            case 2 ->
                'W';
            case 3 ->
                'A';
            case 4 ->
                'G';
            case 5 ->
                'M';
            case 6 ->
                'Y';
            case 7 ->
                'F';
            case 8 ->
                'P';
            case 9 ->
                'D';
            case 10 ->
                'X';
            case 11 ->
                'B';
            case 12 ->
                'N';
            case 13 ->
                'J';
            case 14 ->
                'Z';
            case 15 ->
                'S';
            case 16 ->
                'Q';
            case 17 ->
                'V';
            case 18 ->
                'H';
            case 19 ->
                'L';
            case 20 ->
                'C';
            case 21 ->
                'K';
            case 22 ->
                'E';
            default ->
                '\0';
        };
        if (letter != '\0') {
            System.out.printf("The last character in this "
                    + "DNI is: %c\n", letter);
        } else {
            System.out.print("Wrong imput\n");
        }

    }
}
