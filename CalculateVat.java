package calculatevat;

import java.util.Scanner;

/**
 * This program calculates VAT over a tax base and shows total cost 
 * and VAT amount
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CalculateVat {
    public static void main(String[] args) {
        double taxBase, vat, totalAmount, vatAmount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the tax base: ");
        taxBase = sc.nextDouble();
        System.out.println("Insert VAT: ");
        vat = sc.nextDouble();
        vat /= 100;
        vat++;
        totalAmount = taxBase * vat;
        vatAmount = totalAmount - taxBase;
        System.out.printf("""
                          Total cost with VAT: %,.2f \tTotal taxes: %,.2f
                          """, totalAmount, vatAmount);
    }
    
}
