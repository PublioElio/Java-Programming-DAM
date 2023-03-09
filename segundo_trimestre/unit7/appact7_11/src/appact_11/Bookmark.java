package appact_11;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Bookmark {

    private int currentPage;

    public Bookmark(int currentPage) {
        this.currentPage = currentPage;
    }

    public Bookmark() {
        this(0);
    }

    public void increasePage(int pagesRead) {
        currentPage += pagesRead;
    }

    public void restart() {
        currentPage = 0;
    }

    public String toString() {
        String s;
        s = "Bookmark is in page " + this.currentPage;
        return (s);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
