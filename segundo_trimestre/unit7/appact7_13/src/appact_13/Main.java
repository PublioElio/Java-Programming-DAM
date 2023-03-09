package appact_13;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colours palette = new Colours();
        palette.addColour("pink");
        palette.addColour("brown");
        palette.addColour("orange");
        palette.addColour("grey");
        palette.addColour("purple");
        String[] chosenColours = palette.choseColours(5);
        for(String colour: chosenColours){
            System.out.println(colour);
        }
        System.out.println(palette.toString());
    }
    
}
