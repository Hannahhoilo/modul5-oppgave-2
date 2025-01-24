import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private Genre someGenre;

    private ArrayList<Chapter> chapters;

    public Genre getSomeGenre() {
        return someGenre;
    }

    public void setSomeGenre(Genre someGenre) {
        this.someGenre = someGenre;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    // Overstyring av toString-metoden
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", genre=" + someGenre +
                '}';
    }

    // Gettere og settere for alle instansvariablene
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Valgfri metode for å skrive ut detaljer
    public void printBookDetails() {
        System.out.println(this.toString());
    }
}
