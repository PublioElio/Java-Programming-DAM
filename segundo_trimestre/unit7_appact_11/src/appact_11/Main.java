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
                + "Start page: " + animalFarm.getActualPage());
        animalFarm.increasePage(30);
        System.out.println("I read 30 pages, now I'm at page number " 
                + animalFarm.getActualPage());
        animalFarm.restart();
        System.out.println("I started from the beginning, now I'm back at page "
                + "number "+ animalFarm.getActualPage());
    }
    
}
