package resact_5;

/**
 * This program shows the minimum and maximum value of 
 * all the primitive data types in Java.
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DataValues {
    public static void main(String[] args)
    {
        System.out.println("Byte size: " + Byte.SIZE + "\t\tmax: " 
                + Byte.MAX_VALUE + "\t\t\tmin: " + Byte.MIN_VALUE);
        System.out.println("Short size: " + Short.SIZE + "\t\tmax: " 
                + Short.MAX_VALUE + "\t\t\tmin: " + Short.MIN_VALUE);
        System.out.println("Integer size: " + Integer.SIZE + "\tmax: " 
                + Integer.MAX_VALUE + "\t\t\tmin: " + Integer.MIN_VALUE);
        System.out.println("Long size: " + Long.SIZE + "\t\tmax: " 
                + Long.MAX_VALUE + "\tmin: " + Long.MIN_VALUE);
        System.out.println("Float size: " + Float.SIZE + "\t\tmax: " 
                + Float.MAX_VALUE + "\t\tmin: " + Float.MIN_VALUE);
        System.out.println("Double size: " + Double.SIZE + "\t\tmax: " 
                + Double.MAX_VALUE + "\tmin: " + Double.MIN_VALUE);
        System.out.println("Character size: " + Character.SIZE);
    }
}
