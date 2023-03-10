package addact_04;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);
    
    public static String getString(String message){
        System.out.println(message);
        String s = sc.nextLine();
        return (s);
    }

    public static int getInt(String message, String error, int min,
            int max) {
        int num;
        boolean validNum;
        do {
            System.out.print(message);
            num = sc.nextInt();
            validNum = num >= min && num <= max;
            if (!validNum) {
                System.out.print(error);
            }
        } while (!validNum);
        return (num);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlbumCollection collection = new AlbumCollection(3);
        int menu;
        do {
            menu = getInt("""
                              Chose an option:
                              1. List albums
                              2. Add album
                              3. Delete album
                              4. Modify album
                              5. Exit
                               ->""",
                    "\nERROR. Select a valid option.\n", 1, 5);
            sc.nextLine();
            switch (menu) {
                case 1 -> {
                    System.out.println("List albums");
                }
                case 2 -> {
                    Album albumToAdd = new Album(getString(
                            "Enter an album code to search: "));
                    
                }
                case 3 -> {
                    System.out.println("Delete album");
                }
                case 4 -> {
                    System.out.println("Modify album");
                }
                case 5 -> {
                    System.out.println("BYE!");
                }
            }
        } while (menu != 5);

    }

}
