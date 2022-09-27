package resact_01;
/**
 * This is my first Hello World (also shows the current JDK installed and the
 * local time on the system)
 * @author AdrianoDíazBenítez
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Java version: " + 
                System.getProperty("java.version"));
        java.time.LocalTime whatTimeIs = java.time.LocalTime.now();
        System.out.println("System local time is: " + whatTimeIs);
    }  
}
