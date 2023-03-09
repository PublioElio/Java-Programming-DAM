package resact7_07;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Text {

    private String string;
    private final int MAX_LENGTH;
    private static final String VOWELS = "aeiouáéíóúü";
    private final LocalDate CREATION;
    private LocalDateTime lastMod;

    public Text(int length) {
        this.string = "";
        this.MAX_LENGTH = length;
        this.CREATION = LocalDate.now();
        this.lastMod = null;
    }

    public void addCharEnd(char c) {
        if (string.length() < MAX_LENGTH) {
            setString(string + c);
            setLastMod(LocalDateTime.now());
        }
    }

    public void addCharStart(char c) {
        if (string.length() < MAX_LENGTH) {
            setString(c + string);
            setLastMod(LocalDateTime.now());
        }
    }

    public void addStringEnd(String s) {
        if ((s.length() + string.length()) < MAX_LENGTH) {
            setString(string + s);
            setLastMod(LocalDateTime.now());
        }
    }

    public void addStringStart(String s) {
        if ((s.length() + string.length()) < MAX_LENGTH) {
            setString(s + string);
            setLastMod(LocalDateTime.now());
        }
    }

    public int getTotalVowels() {
        int total = 0;
        String s = string.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                total++;
            }
        }
        return (total);
    }

    private boolean isVowel(char c) {
        boolean isVowel = true;
        if (VOWELS.indexOf(c) == -1) {
            isVowel = false;
        }
        return (isVowel);
    }

    public String showTextInfo() {
        String message;
        message = "Text: " + this.string + "\nMax length: " + this.MAX_LENGTH +
                "\nCreation date: " + this.CREATION +
                "\nLast modification date: " + this.lastMod;
        return (message);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getMAX_LENGTH() {
        return MAX_LENGTH;
    }

    public LocalDate getCREATION() {
        return CREATION;
    }

    public LocalDateTime getLastMod() {
        return lastMod;
    }

    private void setLastMod(LocalDateTime lastMod) {
        this.lastMod = lastMod;
    }
}
