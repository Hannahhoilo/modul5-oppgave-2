public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    private Genre someGenre;

    public Genre getSomeGenre() {
        return someGenre;
    }

    public void setSomeGenre(Genre someGenre) {
        this.someGenre = someGenre;
    }

    // Metode for å skrive ut tilstanden til objektet
    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Genre: " + getSomeGenre());
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
}
