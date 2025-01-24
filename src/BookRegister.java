import java.util.ArrayList;

public class BookRegister {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public int numberOfBooks() {
        return books.size();
    }

    public void allBooksInRegister() {
        for (Book b : books) {
            System.out.println("tester allbooksinregister: " + b.toString());
        }
    }

    public void booksByGenre(Genre genre) {
        for (Book b : books) {
            if(b.getSomeGenre() == genre) {
                System.out.println("tester bokksbygenre: " + b.toString());
            }
        }
    }

    public void booksByAuthor(String author) {
        for (Book b : books) {
            if(b.getAuthor() .equals(author)) {
                System.out.println("tester authorrrr: " + b.toString());
            }
        }
    }
}

/*
* Opprett en klasse BookRegister. Klassen skal ha en ArrayList som kan ta vare på bøker.

I BookRegister:  Lag en metode for å legge inn en bok i registeret.

I BookRegister:  Lag en metode som kan gi informasjon om hvor mange bøker som er lagt inn i registeret.*/