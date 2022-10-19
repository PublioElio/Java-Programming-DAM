package resact_04;

import java.util.Scanner;

/**
 * This program asks for the height of trees, showing the highest one, with its
 * assigned ID
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class TallerTree {

    public static void main(String[] args) {
        int treeID, height, tallestTree, tallestTreeID;
        treeID = 0;
        tallestTreeID = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the height (in centimeters) of tree number %d "
                + "(imput '-1' to finish program): ", treeID);
        height = sc.nextInt();
        tallestTree = height;
        while (height > -1) {
            tallestTree = tallestTree <= height ? height : tallestTree;
            tallestTreeID = tallestTree == height ? treeID : tallestTreeID;
            treeID++;
            System.out.printf("Enter the height (in centimeters) of tree "
                    + "number %d (imput '-1' to finish program): ", treeID);
            height = sc.nextInt();
        }
        if (tallestTree > -1) {
            System.out.printf("""
                          The tallest tree height is %dcm, and the ID is %d
                          """, tallestTree, tallestTreeID);
        }
        System.out.print("End of program\n");
    }
}
