package appact_11;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bookmark animalFarm = new Bookmark();
        System.out.println("I started reading Animal Farm from George Orwell. "
                + "Start page: " + animalFarm.getCurrentPage());
        animalFarm.increasePage(30);
        System.out.println("I read 30 pages. " + animalFarm.toString());
        animalFarm.restart();
        System.out.println(animalFarm.toString());
    }
    
}
