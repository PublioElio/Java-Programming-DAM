package appact_14;

import java.util.Scanner;

/**
 * This program asks for a number between 1 and 99, showing how it's written in
 * Spanish
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class NumbersToWords {

    public static void main(String[] args) {
        int num;
        boolean validNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number between 1 and 99: ");
        num = sc.nextInt();
        validNumber = (num >= 1) && (num <= 99);
        if (validNumber) {
            if (num >= 1 && num < 30) {
                switch (num) {
                    case 1 -> {
                        System.out.print("""
                                     That number in Spanish is written 'uno'
                                     """);
                    }
                    case 2 -> {
                        System.out.print("""
                                     That number in Spanish is written 'dos'
                                     """);
                    }
                    case 3 -> {
                        System.out.print("""
                                     That number in Spanish is written 'tres'
                                     """);
                    }
                    case 4 -> {
                        System.out.print("""
                                     That number in Spanish is written 'cuatro'
                                     """);
                    }
                    case 5 -> {
                        System.out.print("""
                                     That number in Spanish is written 'cinco'
                                     """);
                    }
                    case 6 -> {
                        System.out.print("""
                                     That number in Spanish is written 'seis'
                                     """);
                    }
                    case 7 -> {
                        System.out.print("""
                                     That number in Spanish is written 'siete'
                                     """);
                    }
                    case 8 -> {
                        System.out.print("""
                                     That number in Spanish is written 'ocho'
                                     """);
                    }
                    case 9 -> {
                        System.out.print("""
                                     That number in Spanish is written 'nueve'
                                     """);
                    }
                    case 10 -> {
                        System.out.print("""
                                     That number in Spanish is written 'diez'
                                     """);
                    }
                    case 11 -> {
                        System.out.print("""
                                     That number in Spanish is written 'once'
                                     """);
                    }
                    case 12 -> {
                        System.out.print("""
                                     That number in Spanish is written 'doce'
                                     """);
                    }
                    case 13 -> {
                        System.out.print("""
                                     That number in Spanish is written 'trece'
                                     """);
                    }
                    case 14 -> {
                        System.out.print("""
                                     That number in Spanish is written 'catorce'
                                     """);
                    }
                    case 15 -> {
                        System.out.print("""
                                     That number in Spanish is written 'quince'
                                     """);
                    }
                    case 16 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'dieciseis'\n");
                    }
                    case 17 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'diecisiete'\n");
                    }
                    case 18 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'dieciocho'\n");
                    }
                    case 19 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'diecinueve'\n");
                    }
                    case 20 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veinte'\n");
                    }
                    case 21 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veintiuno'\n");
                    }
                    case 22 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veintidós'\n");
                    }
                    case 23 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veintitrés'\n");
                    }
                    case 24 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veinticuatro'\n");
                    }
                    case 25 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veinticinco'\n");
                    }
                    case 26 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veintiseis'\n");
                    }
                    case 27 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veintisiete'\n");
                    }
                    case 28 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veintiocho'\n");
                    }
                    case 29 -> {
                        System.out.print("That number in Spanish "
                                + "is written 'veintinueve'\n");
                    }

                }
            }
            if (num >= 30 && num <= 99) {
                if (num < 40) {
                    System.out.print("That number in Spanish is written 'treinta");
                } else if (num < 50) {
                    System.out.print("That number in Spanish is written 'cuarenta");
                } else if (num < 60) {
                    System.out.print("That number in Spanish is written 'cincuenta");
                } else if (num < 70) {
                    System.out.print("That number in Spanish is written 'sesenta");
                } else if (num < 80) {
                    System.out.print("That number in Spanish is written 'setenta");
                } else if (num < 90) {
                    System.out.print("That number in Spanish is written 'ochenta");
                } else {
                    System.out.print("That number in Spanish is written 'noventa");
                }
                if (((num % 10) >= 0)) {
                    switch (num % 10) {
                        case 1 ->
                            System.out.print(" y uno'\n");
                        case 2 ->
                            System.out.print(" y dos'\n");
                        case 3 ->
                            System.out.print(" y tres'\n");
                        case 4 ->
                            System.out.print(" y cuatro'\n");
                        case 5 ->
                            System.out.print(" y cinco'\n");
                        case 6 ->
                            System.out.print(" y seis'\n");
                        case 7 ->
                            System.out.print(" y siete'\n");
                        case 8 ->
                            System.out.print(" y ocho'\n");
                        case 9 ->
                            System.out.print(" y nueve'\n");
                        default ->
                            System.out.println("'\n");
                    }
                }
            }
        } else {
            System.out.println("That's not a valid number");
        }
    }
}
