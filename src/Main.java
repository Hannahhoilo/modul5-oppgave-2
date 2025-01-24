import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        BookRegister br = new BookRegister();

        Book b1 = new Book();
        b1.setTitle("Sult");
        b1.setSomeGenre(Genre.CLASSIC);
        b1.setAuthor("Knut Hamsun");
        b1.setNumberOfPages(111);
        br.addBook(b1);
        System.out.println("Number of books in register: " + br.numberOfBooks());
        br.allBooksInRegister();
        br.booksByGenre(Genre.CLASSIC);
        System.out.println("Testing by fantasy");
        br.booksByGenre(Genre.FANTASY);
        System.out.println("books by hamsum:");
        br.booksByAuthor("Knut Hamsun");
        Chapter chapter1 = new Chapter();
        chapter1.setTitle("Title1");
        chapter1.setNumberOfPages(20);
        chapter1.setReadingTime(4);
        Chapter chapter2 = new Chapter();
        chapter2.setTitle("Title2");
        chapter2.setNumberOfPages(40);
        chapter2.setReadingTime(5);

        ArrayList<Chapter> chapters = new ArrayList<>();
        chapters.add(chapter1);
        chapters.add(chapter2);
        b1.setChapters(chapters);

        Book newBook = new Book();
        newBook.setSomeGenre(Genre.FANTASY);

        // gi verdier ved setter
        newBook.setTitle("Harry Potter");
        newBook.setAuthor("J.K. Rowling");
        newBook.setNumberOfPages(300);
        newBook.setSomeGenre(newBook.getSomeGenre());

        // Opprett et annet Book-objekt med andre verdier
        Book anotherBook = new Book();
        anotherBook.setTitle("Lord of the Rings");
        anotherBook.setAuthor("J.R.R Tolkien");
        anotherBook.setNumberOfPages(400);
        anotherBook.setSomeGenre(Genre.FANTASY);
        anotherBook.printBookDetails();

        newBook.printBookDetails();
    }
}
/*
* Oppgave 2


Opprett registeret i main-metoden, og legg inn noen bøker der. Test at innleggingen av bøker fungerer.

Lag noen metoder i registeret som kan gi informasjon om bøker i registeret:

Alle registrerte bøker
Bøker i en viss sjanger (metoden må ta imot en sjanger)
Bøker skrevet av en spesifikk forfatter
Kall på metodene fra main (etter at du har lagt inn noen bøker) og sjekk om metodene fungerer tilfredsstillende.


(Vanskelig) Lag en ny metode i bokregisteret som returnerer bøker som har en lesetid på mindre enn et gitt antall minutter.*/