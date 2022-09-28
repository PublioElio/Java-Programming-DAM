package resact_02;

import java.util.Scanner;

/**
 * This program requests the user his age, name and surname, and prints the data
 * on console
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AgeName {

    public static void main(String[] args) {
        String name, lastName;
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // clearing the keyboard buffer to avoid errors
        System.out.println("Enter name and surname: ");
        name = keyboard.next();
        lastName = keyboard.nextLine();
        System.out.println("Name: " + name + "\nSurname:"
                + lastName + "\nAge: " + age + " years old.");
    }
}
