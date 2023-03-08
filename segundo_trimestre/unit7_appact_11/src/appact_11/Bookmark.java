package appact_11;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Bookmark {

    private int actualPage;

    public Bookmark() {
        actualPage = 1;
    }
    
    public void increasePage(int pagesRead){
        actualPage += pagesRead;
    }

    public void restart() {
        actualPage = 1;
    }

    public int getActualPage() {
        return actualPage;
    }

    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }
}
