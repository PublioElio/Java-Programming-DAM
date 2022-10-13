package examunit2_02;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class examUnit2_02 {

    public static void main(String[] args) {
        int num;
        boolean validNumber = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número positivo o negativo de hasta 3 "
                + "cifras: ");
        num = sc.nextInt();
        num = num < 0 ? num * -1 : num;
        validNumber = (num <= 999);
        if (validNumber) {
            if (num < 10) {
                System.out.println("Resultado: " + num);
            } else if ((num >= 10) && (num < 100)) {
                num = (((num % 10) * 10) + (num / 10));
                System.out.println("Resultado: " + num);
            } else {
                num = ((num % 10) * 100) + (((num / 10) % 10) * 10) + ((num / 100) % 10);
                System.out.println("Resultado: " + num);
            }
        } else {
            System.out.println("El número introducido no cumple el formato "
                    + "requerido");
        }
    }

}
