package appact_13;

import java.util.Arrays;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Colours {

    private String[] colourPalette = {"red", "green", "blue", "cyan", "magenta",
        "black"};

    public Colours() {
    }

    public void addColour(String newColour) {
        if (!isRepeated(colourPalette, newColour)) {
            colourPalette = Arrays.copyOf(colourPalette,
                    colourPalette.length + 1);
            colourPalette[colourPalette.length - 1] = newColour;
        }

    }

    private int generateRandomNum(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    public String[] choseColours(int coloursNum) {
        int index, totalColours;
        totalColours = coloursNum > colourPalette.length
                ? colourPalette.length : coloursNum;
        String[] chosenColours = new String[totalColours];
        for (int i = 0; i < chosenColours.length; i++) {
            do {
                index = generateRandomNum(0, colourPalette.length - 1);
            } while (isRepeated(chosenColours, colourPalette[index]));
            chosenColours[i] = colourPalette[index];
        }
        return (chosenColours);
    }

    private boolean isRepeated(String[] colourList, String colour) {
        boolean repeated = false;
        for (int i = 0; i < colourList.length && !repeated; i++) {
            if (colourList[i] != null) {
                repeated = colourList[i].contains(colour);
            }
        }
        return (repeated);
    }

    public String toString() {
        String s = "";
        for (String element : colourPalette) {
            s += element + " ";
        }
        return (s);
    }
}
