package resact_06;

import java.util.Scanner;

/**
 * This program asks for the name and surmane of the user, then deletes all
 * vowels from them
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DeleteVowels {

    /**
     * This function gets a string form console
     *
     * @return
     */
    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return (sc.nextLine());
    }

    /**
     * This function checks if a character is a vowel
     *
     * @param c the character to check
     * @return
     */
    static boolean isVowel(char c) {
        boolean isVowel = false;
        String vowels = "aeiouáéíóúü";
        if (vowels.indexOf(c) != -1) {
            isVowel = true;
        }
        return (isVowel);
    }

    /**
     * This function deletes all vowels from an string
     *
     * @param s the string to delete all vowels
     * @return
     */
    static String deleteVowels(String s) {
        String withoutVowels = "";
        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                withoutVowels += s.charAt(i);
            }
        }
        return (withoutVowels);
    }

    public static void main(String[] args) {
        String userName;
        userName = getString("Enter your name and surname: ");
        userName = userName.toLowerCase();
        userName = deleteVowels(userName);
        System.out.printf("User name without vowels: %s\n", userName);
    }

}
