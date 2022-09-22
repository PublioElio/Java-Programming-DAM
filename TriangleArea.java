package trianglearea;

import java.util.Scanner;

/**
 * This program ask for the base and height of a triangle and calculates 
 * the area
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class TriangleArea {
   public static void main(String[] args){
       int base, height;
       double area;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter base: ");
       base = sc.nextInt();
       System.out.println("Enter height: ");
       height = sc.nextInt();
       area = (double)(base * height) / 2;
       System.out.printf("The area of the triangle is %,.1f\n", area);
   } 
}
