public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

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

Opprett et nytt prosjekt. Hent inn Book-klassen og Genre-enumen du lagde i forrige modul. Du trenger også en klasse med en main-metode.

Opprett en klasse BookRegister. Klassen skal ha en ArrayList som kan ta vare på bøker.

I BookRegister:  Lag en metode for å legge inn en bok i registeret.

I BookRegister:  Lag en metode som kan gi informasjon om hvor mange bøker som er lagt inn i registeret.

Opprett registeret i main-metoden, og legg inn noen bøker der. Test at innleggingen av bøker fungerer.

Lag noen metoder i registeret som kan gi informasjon om bøker i registeret:

Alle registrerte bøker
Bøker i en viss sjanger (metoden må ta imot en sjanger)
Bøker skrevet av en spesifikk forfatter
Kall på metodene fra main (etter at du har lagt inn noen bøker) og sjekk om metodene fungerer tilfredsstillende.

Lag en klasse Chapter som holder på informasjon om

Tittel på kapittelet
Antall sider
Antatt lesetid
Utvid Book-klassen slik at den har en ArrayList som inneholder informasjon om alle kapitlene i boka.

(Vanskelig) Lag en ny metode i bokregisteret som returnerer bøker som har en lesetid på mindre enn et gitt antall minutter.*/