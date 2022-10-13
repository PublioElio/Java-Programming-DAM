package examunit2_01;

import java.util.Scanner;

/**
 * 
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class examUnit2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, result = 0;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduzca segundo número: ");
        num2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Introudzca operador: ");
        operator = sc.nextLine().charAt(0);
        switch (operator) {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num2;
            case '*' ->
                result = num1 * num2;
            case '/' ->
                result = num1 / num2;
            default ->
                System.out.println("Operador inválido");
        }
        System.out.println("El resultado es: " + result);
    }

}
