package appact_14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program is a phone book that alows the user to insert a contact with a
 * phone number, sorts the contact list and search for a phone number entering
 * the contact name
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PhoneBook {

    /**
     * This function gets an integer from terminal, between a maximum and
     * minimum value
     *
     * @param message a message to show to the user
     * @param error an error message to show to the user, if the imput is wrong
     * @param min the minimum value of the integer
     * @param max the maximum value of the ingeger
     * @return
     */
    static int getNum(String message, String error, int min, int max) {
        int num;
        boolean validNum;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            validNum = (num >= min) && (num <= max);
            if (!validNum) {
                System.out.print(error);
            }
        } while (!validNum);
        return (num);
    }

    /**
     * This function gets an String from terminal
     *
     * @param message a message to show to the user
     * @return
     */
    static String getString(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return (sc.nextLine());
    }

    /**
     * This method mimics the behavior of the copyOf method, copying an array in
     * another of a certain length. If the new array is greater than the
     * previous, fills the "gaps" with zeros, if the length of the new array is
     * lesser, copys up to specified length
     *
     * @param src the array to copy
     * @param length the new array length
     * @return a new array
     */
    static String[] copyOf(String[] src, int length) {
        String[] dst = new String[length];
        for (int i = 0; (i < length) && (i < src.length); i++) {
            dst[i] = src[i];
        }
        return (dst);
    }

    /**
     * This method inserts an element at the end of an unordered array
     *
     * @param src the source array
     * @param element the element to insert
     * @return a new array
     */
    static String[] insertElement(String[] src, String element) {
        src = copyOf(src, src.length + 1);
        src[src.length - 1] = element;
        return (src);
    }

    /**
     * This function asks for a new contact (name and phone number) and enters
     * it on an array of strings, finally sorts the contact list
     *
     * @param phoneList the list of contacts
     * @return
     */
    static String[] enterContact(String[] phoneList) {
        String name, phoneNum, newContact;
        boolean validPhone;
        name = getString("Enter contact name: ");

        do {
            phoneNum = getString("Enter a nine-digit phone number for "
                    + name + ": ");
            phoneNum = phoneNum.replace(" ", "");
            validPhone = phoneNum.length() == 9;
            if (!validPhone) {
                System.out.print("The phone number musth have nine digits. ");
            }
        } while (!validPhone);

        newContact = name + ":" + phoneNum;
        phoneList = insertElement(phoneList, newContact);
        Arrays.sort(phoneList);
        return (phoneList);
    }

    static String searchContact(String[] phoneList) {
        String phoneNum = "User not found.";
        String searchContact
                = getString("Enter a contact name to search: ");
        boolean found = false;
        for (int i = 0; i < phoneList.length && !found; i++) {
            if (phoneList[i].contains(searchContact)) {
                phoneNum = phoneList[i].substring((phoneList[i].indexOf(":")
                        + 1));
            }
        }
        return (phoneNum);
    }

    /**
     * This function prints an array of strings on terminal
     *
     * @param phoneList
     */
    static void printPhoneList(String[] phoneList) {
        for (String contact : phoneList) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {
        int num;
        String[] phoneList = {};
        do {
            num = getNum("1. Enter a new contact\n2. Search a phone number"
                    + "\n3. Show all contacts\n4. Exit program"
                    + "\nChoose an option entering number between 1-4: ",
                    "ERROR. Number must be between 1-4. ", 1, 4);
            switch (num) {
                case 1 ->
                    phoneList = enterContact(phoneList);
                case 2 ->
                    System.out.println(searchContact(phoneList));
                case 3 ->
                    printPhoneList(phoneList);
                case 4 ->
                    num = -1;
            }
        } while (num > 0);
    }

}
