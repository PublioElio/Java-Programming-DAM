package agename;

import java.util.Scanner;

/**
 * Este programa solicita la edad, nombre y apellidos 
 * por terminal al usuario y lo muestra por pantalla
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AgeName {
    
    public static void main(String[] args) {
        String name, lastName;
        int age;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // limpio el buffer de teclado para evitar errores
        System.out.println("Enter name and surname: ");
        name = keyboard.next();
        lastName = keyboard.nextLine();
        System.out.println("Name: " + name +  "\nSurname:" 
                + lastName + "\nAge: " + age + " years old.");
    }
}
