package addact_00;

import java.util.Scanner;

/**
 * This program gets a DNI number and shows the letter
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class getLetterDNI {

    public static void main(String[] args) {
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
    }

}
