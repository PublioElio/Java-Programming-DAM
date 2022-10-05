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
        dni %= 23;
        System.out.printf("The last character in this DNI is: %s\n",
                charList[dni]);
        System.out.println("""
                           -----------------------------------------------------
                           Alternative way (with switch): """);
        switch (dni) {
            case 0 -> {
                letter = 'T';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 1 -> {
                letter = 'R';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 2 -> {
                letter = 'W';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 3 -> {
                letter = 'A';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 4 -> {
                letter = 'G';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 5 -> {
                letter = 'M';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 6 -> {
                letter = 'Y';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 7 -> {
                letter = 'F';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 8 -> {
                letter = 'P';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 9 -> {
                letter = 'D';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 10 -> {
                letter = 'X';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 11 -> {
                letter = 'B';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 12 -> {
                letter = 'N';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 13 -> {
                letter = 'J';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 14 -> {
                letter = 'Z';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 15 -> {
                letter = 'S';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 16 -> {
                letter = 'Q';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 17 -> {
                letter = 'V';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 18 -> {
                letter = 'H';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 19 -> {
                letter = 'L';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 20 -> {
                letter = 'C';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 21 -> {
                letter = 'K';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
            case 22 -> {
                letter = 'E';
                System.out.printf("The last character in this DNI is: %c\n", letter);
            }
        }
    }
}
