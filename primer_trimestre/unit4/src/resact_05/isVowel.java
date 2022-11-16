package resact_05;

import java.util.Scanner;

/**
 * This program checks if a given character is a vowel
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class isVowel {

    public static void main(String[] args) {
        char c;
        boolean isVowel;
        c = get_char();
        isVowel = check_char(c);
        if (isVowel) {
            System.out.printf("'%c' is a vowel.\n", c);
        } else {
            System.out.printf("'%c' is not a vowel.\n", c);
        }
    }

    /**
     * This function gets a character from terminal
     *
     * @return
     */
    static char get_char() {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        c = sc.next(".").charAt(0);
        return (c);
    }

    /**
     * This function checks if a character is a vowel
     *
     * @param c this is the character
     * @return true if the character is a vowel
     */
    static boolean check_char(char c) {
        c = Character.toLowerCase(c);
        return (c == 97 || c == 101 || c == 105 || c == 111 || c == 117);
    }
}