package addact_04;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Album {

    private String code;
    private String author;
    private String title;
    private String genre;
    private int duration;

    public Album(String code, String author, String title, String genre,
            int duration) {
        this.code = code;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.duration = duration < 0 ? 0 : duration;
    }

    public Album(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        String s = "\n-----------------------ALBUM-----------------------";
        s += "\nCode: " + this.code;
        s += "\nAuthor: " + this.author;
        s += "\nTítle: " + this.title;
        s += "\nGenre: " + this.genre;
        s += "\nDuration: " + this.duration;
        s += "\n------------------------------------------";
        return (s);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration < 0 ? 0 : duration;
    }
}
